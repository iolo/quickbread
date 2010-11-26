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
	 * @param queryString the query string
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
	 * @param queryString the query string
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
	 * @param queryString the query string
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
			if ( null == conn ) {
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
	 * @param queryString the query string
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
			if ( null == conn ) {
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
	 * @param queryString the query string
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
			if ( null == conn ) {
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
	 * @param queryString the query string
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
			if ( null == conn ) {
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
	 * @param queryString the query string
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
			if ( null == conn ) {
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
	 * @param queryString the query string
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
			if ( null == conn ) {
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
	 * @param queryString the query string
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
			if ( null == conn ) {
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
	 * @param queryString the query string
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
			if ( null == conn ) {
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
	 * @param queryString the query string
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
			if ( null == conn ) {
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
	 * @param queryString the query string
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
			if ( null == conn ) {
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
	 * @param queryString the query string
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
			if ( null == conn ) {
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
	 * @param queryString the query string
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
			if ( null == conn ) {
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
	 * @param queryString the query string
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
			if ( null == conn ) {
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
	 * @param queryString the query string
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
			if ( null == conn ) {
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
	 * @param queryString the query string
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
			if ( null == conn ) {
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
	 * @param queryString the query string
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
			if ( null == conn ) {
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
	 * @param conn the conn
	 * @return the cafe board article
	 */
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
			else {
				response.setTotalSize(Integer.parseInt(root.getAttributeValue("totalSize")));
				response.setTotalNewSize(Integer.parseInt(root.getAttributeValue("totalNewSize")));
				@SuppressWarnings("unchecked")
				List<Element> childList = root.getChildren("article");

				for (Element em : childList) {
					CafeBoardArticle temparticle = new CafeBoardArticle();
					temparticle.setBoardId(em.getChild("boardId").getValue());
					temparticle.setName(em.getChild("name").getValue());
					temparticle.setArticleId(Integer.parseInt(em.getChild("articleId").getValue()));
					temparticle.setUserName(em.getChild("userName").getValue());
					temparticle.setCommentCount(Integer.parseInt(em.getChild("commentCount").getValue()));
					temparticle.setRegDateTime(em.getChild("regDateTime").getValue());
					temparticle.setViewCount(Integer.parseInt(em.getChild("viewCount").getValue()));
					temparticle.setHidden(Boolean.parseBoolean(em.getChild("hidden").getValue()));
					response.getArticles().add(temparticle);
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
	 * @param conn the conn
	 * @return the cafe alarm res
	 */
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
			@SuppressWarnings("unchecked")
			List<Element> bbsList = alimiBbs.getChildren("item");
			@SuppressWarnings("unchecked")
			List<Element> userList = alimiUser.getChildren("item");

			for (Element em : bbsList) {
				CafeActivityRes tempActivity = new CafeActivityRes();
				tempActivity.setCafeName(em.getChild("cafeName").getValue());
				tempActivity.setCafeCode(em.getChild("cafeCode").getValue());
				tempActivity.setAlimType(em.getChild("alimType").getValue());
				tempActivity.setBoardId(em.getChild("boardId").getValue());
				tempActivity.setArticleId(Integer.parseInt(em.getChild("articleId").getValue()));
				tempActivity.setArticleTitle(em.getChild("articleTitle").getValue());
				response.setCafeActiveRes(tempActivity);
			}
			for (Element em : userList) {
				CafeLevelInfo tempLevelInfo = new CafeLevelInfo();
				tempLevelInfo.setCafeName(em.getChild("cafeName").getValue());
				tempLevelInfo.setCafeCode(em.getChild("cafeCode").getValue());
				tempLevelInfo.setAlimType(em.getChild("alimType").getValue());
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
	 * @param conn the conn
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
				tempBoard.setName(em.getChild("name").getValue());
				tempBoard.setHasNewChild(Boolean.parseBoolean(em.getChild("hasNew").getValue()));
				tempBoard.setBoardType(em.getChild("boardType").getValue());
				tempBoard.setDisplay(Boolean.parseBoolean(em.getChild("display").getValue()));
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
	 * @param conn the conn
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
					CafeFavor tempFavorite = new CafeFavor(em.getChild("cafeCode").getValue(), em.getChild("name").getValue(), Boolean.parseBoolean(em
							.getChild("updated").getValue()));
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
	 * @param conn the conn
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
				tempArticle.setBoardName(em.getChild("boardName").getValue());
				tempArticle.setBoardId(em.getChild("boardId").getValue());

				tempArticle.setName(em.getChild("name").getValue());
				tempArticle.setArticleId(Integer.parseInt(em.getChild("articleId").getValue()));
				tempArticle.setUserName(em.getChild("userName").getValue());
				tempArticle.setCommentCount(Integer.parseInt(em.getChild("commentCount").getValue()));
				tempArticle.setRegDateTime(em.getChild("regDateTime").getValue());
				tempArticle.setViewCount(Integer.parseInt(em.getChild("viewCount").getValue()));
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
	 * @param conn the conn
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

			response.setProfileImg(root.getChild("profileImg").getValue());

			response.setName(root.getChild("name").getValue());
			response.setArticleId(Integer.parseInt(root.getChild("articleId").getValue()));
			response.setUserName(root.getChild("userName").getValue());
			response.setCommentCount(Integer.parseInt(root.getChild("commentCount").getValue()));
			response.setRegDateTime(root.getChild("regDateTime").getValue());
			response.setViewCount(Integer.parseInt(root.getChild("viewCount").getValue()));
			response.setHidden(Boolean.parseBoolean(root.getChild("hidden").getValue()));

		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}
}
