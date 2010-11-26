package net.daum.dna.api.dao;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import net.daum.dna.api.vo.cafe.CafeActivityRes;
import net.daum.dna.api.vo.cafe.CafeAlarmRes;
import net.daum.dna.api.vo.cafe.CafeBoard;
import net.daum.dna.api.vo.cafe.CafeBoardArticle;
import net.daum.dna.api.vo.cafe.CafeBoardArticles;
import net.daum.dna.api.vo.cafe.CafeFavor;
import net.daum.dna.api.vo.cafe.CafeLevelInfo;
import net.daum.dna.api.vo.cafe.CafeRecentArticle;
import net.daum.dna.api.vo.cafe.CafeRecentArticles;
import net.daum.dna.api.vo.cafe.CafeWriteRes;
import net.daum.dna.oauth.DaumOAuth;
import net.daum.dna.util.APIUtils;

// TODO: Auto-generated Javadoc
/**
 * The Class CafeDAO.
 */
public class CafeDAO {

	/** The oauth. */
	private DaumOAuth oauth;

	/** The util. */
	private APIUtils util;

	/**
	 * Instantiates a new cafe dao.
	 * 
	 * @param oauth
	 *            the oauth
	 */
	public CafeDAO(DaumOAuth oauth) {
		super();
		this.oauth = oauth;
		this.util = APIUtils.getInstance();
	}

	/**
	 * Gets the oauth.
	 * 
	 * @return the oauth
	 */
	public DaumOAuth getOauth() {
		return oauth;
	}

	/**
	 * Sets the oauth.
	 * 
	 * @param oauth
	 *            the new oauth
	 */
	public void setOauth(DaumOAuth oauth) {
		this.oauth = oauth;
	}

	/**
	 * GetAlarmRes DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the alarm res
	 */
	public CafeAlarmRes getAlarmRes(String queryString) {
		CafeAlarmRes response = new CafeAlarmRes();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;
		try {
			url.append(APIUtils._CAFE_ALIMIS_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);

			if (null == conn) {
				response = null;
			} else {
				response = parseAlarmRes(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return response;
	}

	/**
	 * GetAlarmRes DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the alarm res as xml
	 */
	public String getAlarmResAsXML(String queryString) {
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._CAFE_ALIMIS_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				response.append(util.changeToString(conn.getInputStream()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}

		return response.toString();
	}

	/**
	 * GetAlarmRes DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the alarm res as json
	 */
	public String getAlarmResAsJSON(String queryString) {
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		url.append(APIUtils._CAFE_ALIMIS_URL);
		url.append(queryString);

		try {
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				String XMLQuery = util.changeToString(conn.getInputStream());
				response.append(util.toJSONString(XMLQuery));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return response.toString();
	}

	/**
	 * GetArticles DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the articles
	 */
	public CafeBoardArticles getArticles(String queryString) {

		CafeBoardArticles response = new CafeBoardArticles();
		StringBuffer url = new StringBuffer();

		HttpURLConnection conn = null;

		url.append(APIUtils._CAFE_ARTICLES_URL);
		url.append(queryString);

		try {
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				response = parseBoardArticle(conn);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}

		return response;

	}

	/**
	 * GetArticles DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the articles as xml
	 */
	public String getArticlesAsXML(String queryString) {
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		url.append(APIUtils._CAFE_ARTICLES_URL);
		url.append(queryString);

		try {
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				response.append(util.changeToString(conn.getInputStream()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}

		return response.toString();
	}

	/**
	 * GetArticles DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the articles as json
	 */
	public String getArticlesAsJSON(String queryString) {
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._CAFE_ARTICLES_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				String XMLQuery = util.changeToString(conn.getInputStream());
				response.append(util.toJSONString(XMLQuery));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}

		return response.toString();
	}

	/**
	 * GetBoards DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the boards
	 */
	public List<CafeBoard> getBoards(String queryString) {
		List<CafeBoard> response = new ArrayList<CafeBoard>();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._CAFE_BOARDS_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				response = parseBoards(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}

		return response;
	}

	/**
	 * GetBoards DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the boards as xml
	 */
	public String getBoardsAsXML(String queryString) {
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._CAFE_BOARDS_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				response.append(util.changeToString(conn.getInputStream()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}

		return response.toString();
	}

	/**
	 * GetBoards DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the boards as json
	 */
	public String getBoardsAsJSON(String queryString) {
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._CAFE_BOARDS_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				String XMLQuery = util.changeToString(conn.getInputStream());
				response.append(util.toJSONString(XMLQuery));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}

		return response.toString();
	}

	/**
	 * GetFavoriteCafes DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the favorite cafes
	 */
	public List<CafeFavor> getFavoriteCafes(String queryString) {
		List<CafeFavor> response = new ArrayList<CafeFavor>();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._CAFE_FAVORITE_CAFE_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				response = parseFavorCafe(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return response;
	}

	/**
	 * GetFavoriteCafes DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the favorite cafes as xml
	 */
	public String getFavoriteCafesAsXML(String queryString) {
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._CAFE_FAVORITE_CAFE_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				response.append(util.changeToString(conn.getInputStream()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return response.toString();
	}

	/**
	 * GetFavoriteCafes DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the favorite cafes as json
	 */
	public String getFavoriteCafesAsJSON(String queryString) {
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._CAFE_FAVORITE_CAFE_URL);
			url.append(queryString);

			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				String XMLQuery = util.changeToString(conn.getInputStream());
				response.append(util.toJSONString(XMLQuery));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return response.toString();
	}

	/**
	 * GetRecentArticles DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the recent articles
	 */
	public CafeRecentArticles getRecentArticles(String queryString) {
		CafeRecentArticles response = new CafeRecentArticles();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._CAFE_RECENT_ARTICLE_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				response = parseRecentArticles(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return response;
	}

	/**
	 * GetRecentArticles DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the recent articles as xml
	 */
	public String getRecentArticlesAsXML(String queryString) {
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._CAFE_RECENT_ARTICLE_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				response.append(util.changeToString(conn.getInputStream()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return response.toString();
	}

	/**
	 * GetRecentArticles DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the recent articles as json
	 */
	public String getRecentArticlesAsJSON(String queryString) {
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._CAFE_RECENT_ARTICLE_URL);
			url.append(queryString);

			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				String XMLQuery = util.changeToString(conn.getInputStream());
				response.append(util.toJSONString(XMLQuery));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return response.toString();
	}

	/**
	 * WriteArticle DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the cafe write res
	 */
	public CafeWriteRes writeArticle(String queryString) {
		CafeWriteRes response = new CafeWriteRes();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._CAFE_WRITE_ARTICLE_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				response = parseWriteArticle(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return response;
	}

	/**
	 * WriteArticle DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the string
	 */
	public String writeArticleAsXML(String queryString) {
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._CAFE_WRITE_ARTICLE_URL);
			url.append(queryString);

			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				response.append(util.changeToString(conn.getInputStream()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}

		return response.toString();
	}

	/**
	 * WriteArticle DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the string
	 */
	public String writeArticleAsJSON(String queryString) {
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._CAFE_WRITE_ARTICLE_URL);
			url.append(queryString);

			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				String XMLQuery = util.changeToString(conn.getInputStream());
				response.append(util.toJSONString(XMLQuery));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}

		return response.toString();
	}

	/**
	 * Board article parser.
	 * 
	 * @param conn
	 *            the conn
	 * @return the cafe board article
	 */
	@SuppressWarnings("unchecked")
	private CafeBoardArticles parseBoardArticle(HttpURLConnection conn) {
		CafeBoardArticles response = new CafeBoardArticles();
		SAXBuilder builder = new SAXBuilder();
		Document doc;
		Element root;

		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();
			if (util.isAPIError(root) == true)
				return null;
			else if (!util.isValidElement(root)) {
				return null;
			} else {
				response.setTotalSize(Integer.parseInt(root.getAttributeValue("totalSize")));
				response.setTotalNewSize(Integer.parseInt(root.getAttributeValue("totalNewSize")));
				List<Element> childList = root.getChildren("article");

				if (util.isValidElement(childList)) {
					for (Element em : childList) {
						CafeBoardArticle temparticle = new CafeBoardArticle();
						if (util.isValidElement(em.getChild("boardId")))
							temparticle.setBoardId(em.getChild("boardId").getValue());
						if (util.isValidElement(em.getChild("name")))
							temparticle.setName(em.getChild("name").getValue());
						if (util.isValidElement(em.getChild("articleId")))
							temparticle.setArticleId(Integer.parseInt(em.getChild("articleId").getValue()));
						if (util.isValidElement(em.getChild("userName")))
							temparticle.setUserName(em.getChild("userName").getValue());
						if (util.isValidElement(em.getChild("commentCount")))
							temparticle.setCommentCount(Integer.parseInt(em.getChild("commentCount").getValue()));
						if (util.isValidElement(em.getChild("regDateTime")))
							temparticle.setRegDateTime(em.getChild("regDateTime").getValue());
						if (util.isValidElement(em.getChild("viewCount")))
							temparticle.setViewCount(Integer.parseInt(em.getChild("viewCount").getValue()));
						if (util.isValidElement(em.getChild("hidden")))
							temparticle.setHidden(Boolean.parseBoolean(em.getChild("hidden").getValue()));
						response.getArticles().add(temparticle);
					}
				}
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}

	/**
	 * Parses the alarm res.
	 * 
	 * @param conn
	 *            the conn
	 * @return the cafe alarm res
	 */
	@SuppressWarnings("unchecked")
	private CafeAlarmRes parseAlarmRes(HttpURLConnection conn) {
		CafeAlarmRes response = new CafeAlarmRes();
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Element root = null;

		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();
			if (util.isAPIError(root) == true)
				return null;

			Element alimiBbs = root.getChild("alimiBbs");
			Element alimiUser = root.getChild("alimiUser");

			List<Element> bbsList = alimiBbs.getChildren("item");
			List<Element> userList = alimiUser.getChildren("item");

			for (Element em : bbsList) {
				CafeActivityRes tempActivity = new CafeActivityRes();
				if (util.isValidElement(em.getChild("cafeName")))
					tempActivity.setCafeName(em.getChild("cafeName").getValue());
				if (util.isValidElement(em.getChild("cafeCode")))
					tempActivity.setCafeCode(em.getChild("cafeCode").getValue());
				if (util.isValidElement(em.getChild("alimType")))
					tempActivity.setAlimType(em.getChild("alimType").getValue());
				if (util.isValidElement(em.getChild("boardId")))
					tempActivity.setBoardId(em.getChild("boardId").getValue());
				if (util.isValidElement(em.getChild("articleId")))
					tempActivity.setArticleId(Integer.parseInt(em.getChild("articleId").getValue()));
				if (util.isValidElement(em.getChild("articleTitle")))
					tempActivity.setArticleTitle(em.getChild("articleTitle").getValue());
				response.setCafeActiveRes(tempActivity);
			}

			for (Element em : userList) {
				CafeLevelInfo tempLevelInfo = new CafeLevelInfo();
				if (util.isValidElement(em.getChild("cafeName")))
					tempLevelInfo.setCafeName(em.getChild("cafeName").getValue());
				if (util.isValidElement(em.getChild("cafeCode")))
					tempLevelInfo.setCafeCode(em.getChild("cafeCode").getValue());
				if (util.isValidElement(em.getChild("alimType")))
					tempLevelInfo.setAlimType(em.getChild("alimType").getValue());
				if (util.isValidElement(em.getChild("alimDesc")))
					tempLevelInfo.setAlimDesc(em.getChild("alimDesc").getValue());
				response.setCafeLevelInfo(tempLevelInfo);
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}

	/**
	 * Parses the boards.
	 * 
	 * @param conn
	 *            the conn
	 * @return the list
	 */
	private List<CafeBoard> parseBoards(HttpURLConnection conn) {
		List<CafeBoard> response = new ArrayList<CafeBoard>();
		SAXBuilder builder = new SAXBuilder();
		Document doc;
		Element root;
		try {

			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();
			if (util.isAPIError(root) == true)
				return null;

			@SuppressWarnings("unchecked")
			List<Element> boardList = root.getChildren("board");
			for (Element em : boardList) {
				CafeBoard tempBoard = new CafeBoard();
					tempBoard.setBoardId(em.getAttributeValue("boardId"));
				if (util.isValidElement(em.getChild("name")))
					tempBoard.setName(em.getChild("name").getValue());
				if (util.isValidElement(em.getChild("hasNew")))
					tempBoard.setHasNewChild(Boolean.parseBoolean(em.getChild("hasNew").getValue()));
				if (util.isValidElement(em.getChild("boardType")))
					tempBoard.setBoardType(em.getChild("boardType").getValue());
				if (util.isValidElement(em.getChild("display")))
					tempBoard.setDisplay(Boolean.parseBoolean(em.getChild("display").getValue()));
				if (util.isValidElement(em.getChild("anonymous")))
					tempBoard.setAnonymous(Boolean.parseBoolean(em.getChild("anonymous").getValue()));

				response.add(tempBoard);
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}

	/**
	 * Parses the favor cafe.
	 * 
	 * @param conn
	 *            the conn
	 * @return the list
	 */
	private List<CafeFavor> parseFavorCafe(HttpURLConnection conn) {
		List<CafeFavor> response = new ArrayList<CafeFavor>();
		SAXBuilder builder = new SAXBuilder();
		Document doc;
		Element root;

		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();
			if (util.isAPIError(root) == true)
				return null;
			else {
				@SuppressWarnings("unchecked")
				List<Element> favoriteList = root.getChildren("board");

				for (Element em : favoriteList) {
					CafeFavor tempFavorite = new CafeFavor();
					if (util.isValidElement(em.getChild("cafeCode")))
						tempFavorite.setCafeCode(em.getChild("cafeCode").getValue());
					if (util.isValidElement(em.getChild("name")))
						tempFavorite.setName(em.getChild("name").getValue());
					if (util.isValidElement(em.getChild("updated")))
						tempFavorite.setUpdated(Boolean.parseBoolean(em.getChild("updated").getValue()));

					response.add(tempFavorite);
				}
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}

	/**
	 * Parses the recent articles.
	 * 
	 * @param conn
	 *            the conn
	 * @return the cafe recent articles
	 */
	private CafeRecentArticles parseRecentArticles(HttpURLConnection conn) {
		CafeRecentArticles response = new CafeRecentArticles();
		SAXBuilder builder = new SAXBuilder();
		Document doc;
		Element root;

		try {
			doc = builder.build(conn.getInputStream());

			root = doc.getRootElement();
			if (util.isAPIError(root) == true)
				return null;

			response.setTotalSize(Integer.parseInt(root.getAttributeValue("totalSize")));

			@SuppressWarnings("unchecked")
			List<Element> recentList = root.getChildren("article");

			for (Element em : recentList) {
				CafeRecentArticle tempArticle = new CafeRecentArticle();
				if (util.isValidElement(em.getChild("boardName")))
					tempArticle.setBoardName(em.getChild("boardName").getValue());
				if (util.isValidElement(em.getChild("boardId")))
					tempArticle.setBoardId(em.getChild("boardId").getValue());

				if (util.isValidElement(em.getChild("name")))
					tempArticle.setName(em.getChild("name").getValue());
				if (util.isValidElement(em.getChild("articleId")))
					tempArticle.setArticleId(Integer.parseInt(em.getChild("articleId").getValue()));
				if (util.isValidElement(em.getChild("userName")))
					tempArticle.setUserName(em.getChild("userName").getValue());
				if (util.isValidElement(em.getChild("commentCount")))
					tempArticle.setCommentCount(Integer.parseInt(em.getChild("commentCount").getValue()));
				if (util.isValidElement(em.getChild("regDateTime")))
					tempArticle.setRegDateTime(em.getChild("regDateTime").getValue());
				if (util.isValidElement(em.getChild("viewCount")))
					tempArticle.setViewCount(Integer.parseInt(em.getChild("viewCount").getValue()));
				if (util.isValidElement(em.getChild("hidden")))
					tempArticle.setHidden(Boolean.parseBoolean(em.getChild("hidden").getValue()));

				response.setRecentArticle(tempArticle);
			}

		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}

	/**
	 * Parses the write article.
	 * 
	 * @param conn
	 *            the conn
	 * @return the cafe write res
	 */
	private CafeWriteRes parseWriteArticle(HttpURLConnection conn) {
		CafeWriteRes response = new CafeWriteRes();
		SAXBuilder builder = new SAXBuilder();
		Document doc;
		Element root;
		try {
			doc = builder.build(conn.getInputStream());

			root = doc.getRootElement();
			if (util.isAPIError(root) == true)
				return null;

			if (util.isValidElement(root.getChild("profileImg")))
				response.setProfileImg(root.getChild("profileImg").getValue());

			if (util.isValidElement(root.getChild("name")))
				response.setName(root.getChild("name").getValue());
			if (util.isValidElement(root.getChild("articleId")))
				response.setArticleId(Integer.parseInt(root.getChild("articleId").getValue()));
			if (util.isValidElement(root.getChild("userName")))
				response.setUserName(root.getChild("userName").getValue());
			if (util.isValidElement(root.getChild("commentCount")))
				response.setCommentCount(Integer.parseInt(root.getChild("commentCount").getValue()));
			if (util.isValidElement(root.getChild("regDateTime")))
				response.setRegDateTime(root.getChild("regDateTime").getValue());
			if (util.isValidElement(root.getChild("viewCount")))
				response.setViewCount(Integer.parseInt(root.getChild("viewCount").getValue()));
			if (util.isValidElement(root.getChild("hidden")))
				response.setHidden(Boolean.parseBoolean(root.getChild("hidden").getValue()));

		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}
}
