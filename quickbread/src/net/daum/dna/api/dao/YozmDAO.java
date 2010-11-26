package net.daum.dna.api.dao;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import net.daum.dna.api.vo.yozm.*;

import net.daum.dna.oauth.DaumOAuth;
import net.daum.dna.util.APIUtils;

// TODO: Auto-generated Javadoc
/**
 * The Class YozmDAO.
 */
public class YozmDAO {

	/** The oauth. */
	private DaumOAuth oauth;

	/** The util. */
	private APIUtils util;

	/**
	 * Instantiates a new yozm dao.
	 * 
	 * @param oauth
	 *            the oauth
	 */
	public YozmDAO(DaumOAuth oauth) {
		super();
		this.oauth = oauth;
		util = APIUtils.getInstance();
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
	 * CheckUserJoin DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the yozm join info
	 */
	public YozmUserJoined checkUserJoin(String queryString) {
		HttpURLConnection conn = null;
		YozmUserJoined response = new YozmUserJoined();
		StringBuffer url = new StringBuffer();

		try {
			url.append(APIUtils._YOZM_JOIN_INFO_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				response = parseCheckJoin(conn);
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
	 * CheckUserJoin DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the string
	 */
	public String checkUserJoinAsXML(String queryString) {
		HttpURLConnection conn = null;
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();

		try {
			url.append(APIUtils._YOZM_JOIN_INFO_URL);
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
	 * CheckUserJoin DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the string
	 */
	public String checkUserJoinAsJSON(String queryString) {
		HttpURLConnection conn = null;
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();

		try {
			url.append(APIUtils._YOZM_JOIN_INFO_URL);
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
	 * JoinYozm DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the yozm join
	 */
	public YozmUserJoin JoinYozm(String queryString) {
		HttpURLConnection conn = null;
		YozmUserJoin response = new YozmUserJoin();
		StringBuffer url = new StringBuffer();

		try {
			url.append(APIUtils._YOZM_JOIN_YOZM_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				response = parseJoinYozm(conn);
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
	 * JoinYozm DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the string
	 */
	public String JoinYozmAsXML(String queryString) {
		HttpURLConnection conn = null;
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();

		try {
			url.append(APIUtils._YOZM_JOIN_YOZM_URL);
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
	 * JoinYozm DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the string
	 */
	public String JoinYozmAsJSON(String queryString) {
		HttpURLConnection conn = null;
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();

		try {
			url.append(APIUtils._YOZM_JOIN_YOZM_URL);
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
	 * SearchArticles DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the yozm articles list
	 */
	public YozmArticles searchArticles(String queryString) {
		HttpURLConnection conn = null;
		YozmArticles response = new YozmArticles();
		StringBuffer url = new StringBuffer();

		try {
			url.append(APIUtils._YOZM_SEARCH_ARTICLES_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				response = parseSearchArticles(conn);
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
	 * SearchArticles DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the string
	 */
	public String searchArticlesAsXML(String queryString) {
		HttpURLConnection conn = null;
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();

		try {
			url.append(APIUtils._YOZM_SEARCH_ARTICLES_URL);
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
	 * SearchArticles DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the string
	 */
	public String searchArticlesAsJSON(String queryString) {
		HttpURLConnection conn = null;
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();

		try {
			url.append(APIUtils._YOZM_SEARCH_ARTICLES_URL);
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
	 * @return the yozm write res
	 */
	public YozmWriteRes writeArticle(String queryString) {
		HttpURLConnection conn = null;
		YozmWriteRes response = new YozmWriteRes();
		StringBuffer url = new StringBuffer();

		try {
			url.append(APIUtils._YOZM_WRITE_MESSAGE_URL);
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
		HttpURLConnection conn = null;
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();

		try {
			url.append(APIUtils._YOZM_WRITE_MESSAGE_URL);
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
		HttpURLConnection conn = null;
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();

		try {
			url.append(APIUtils._YOZM_WRITE_MESSAGE_URL);
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
	 * ArticlesList DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the yozm articles list
	 */
	public YozmArticles articlesList(String queryString) {
		HttpURLConnection conn = null;
		YozmArticles response = new YozmArticles();
		StringBuffer url = new StringBuffer();

		try {
			url.append(APIUtils._YOZM_ARTICLE_LIST_URL);
			url.append(queryString);

			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				response = parseArticlesList(conn);
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
	 * ArticlesList DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the string
	 */
	public String articlesListAsXML(String queryString) {
		HttpURLConnection conn = null;
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();
		try {
			url.append(APIUtils._YOZM_ARTICLE_LIST_URL);
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
	 * ArticlesList DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the string
	 */
	public String articlesListAsJSON(String queryString) {
		HttpURLConnection conn = null;
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();

		url.append(APIUtils._YOZM_WRITE_MESSAGE_URL);
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
	 * GetUserInfo DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the user info
	 */
	public YozmUserInfo getUserInfo(String queryString) {
		HttpURLConnection conn = null;
		YozmUserInfo response = new YozmUserInfo();
		StringBuffer url = new StringBuffer();

		try {
			url.append(APIUtils._YOZM_SHOW_USER_INFO_URL);
			url.append(queryString);

			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				response = parseUserInfo(conn);
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
	 * GetUserInfo DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the user info as xml
	 */
	public String getUserInfoAsXML(String queryString) {
		HttpURLConnection conn = null;
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();

		try {
			url.append(APIUtils._YOZM_SHOW_USER_INFO_URL);
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
	 * GetUserInfo DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the user info as json
	 */
	public String getUserInfoAsJSON(String queryString) {
		HttpURLConnection conn = null;
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();

		try {
			url.append(APIUtils._YOZM_SHOW_USER_INFO_URL);
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
	 * GetUserArticles DAO.
	 *
	 * @param queryString the query string
	 * @return the user articles
	 */
	public List<YozmUserArticles> getUserArticles(String queryString) {
		HttpURLConnection conn = null;
		List<YozmUserArticles> response = new ArrayList<YozmUserArticles>();
		StringBuffer url = new StringBuffer();

		try {
			url.append(APIUtils._YOZM_SPECIFIC_ARTICLES_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, this.oauth);
			if (null == conn) {
				response = null;
			} else {
				response = parseUserArticles(conn);
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
	 * GetUserArticles DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the user articles as xml
	 */
	public String getUserArticlesAsXML(String queryString) {
		HttpURLConnection conn = null;
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();

		try {
			url.append(APIUtils._YOZM_SPECIFIC_ARTICLES_URL);
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
	 * GetUserArticles DAO.
	 * 
	 * @param queryString
	 *            the query string
	 * @return the user articles as json
	 */
	public String getUserArticlesAsJSON(String queryString) {
		HttpURLConnection conn = null;
		StringBuffer response = new StringBuffer();
		StringBuffer url = new StringBuffer();

		try {
			url.append(APIUtils._YOZM_SPECIFIC_ARTICLES_URL);
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
	 * Parses the check join.
	 *
	 * @param conn the conn
	 * @return the yozm is joined
	 */
	private YozmUserJoined parseCheckJoin(HttpURLConnection conn) {
		YozmUserJoined response = new YozmUserJoined();

		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Element root = null;

		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();
			if (util.isAPIError(root) == true)
				return null;

			response.setJoined(Boolean.parseBoolean(root.getChild("joined").getValue()));

		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}

	/**
	 * Parses the join yozm.
	 *
	 * @param conn the conn
	 * @return the yozm join
	 */
	private YozmUserJoin parseJoinYozm(HttpURLConnection conn) {
		YozmUserJoin response = new YozmUserJoin();
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Element root = null;
		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();
			if (util.isAPIError(root) == true)
				return null;

			response.setStatus(Integer.parseInt(root.getChild("status").getValue()));

		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}

	/**
	 * Article parser.
	 * 
	 * @param em
	 *            the em
	 * @return the yozm article
	 */
	private YozmArticle parseArticle(Element em) {
		YozmArticle msg = new YozmArticle();
		msg.setMsgId(Integer.parseInt(em.getChild("msg_id").getValue()));
		msg.setType(em.getChild("type").getValue());
		msg.setText(em.getChild("text").getValue());
		msg.setPlainText(em.getChild("plain_text").getValue());
		msg.setHtmlText(em.getChild("html_text").getValue());
		msg.setSourceName(em.getChild("source_name").getValue());
		msg.setReplyCnt(Integer.parseInt(em.getChild("reply_cnt").getValue()));
		msg.setQuoteCnt(Integer.parseInt(em.getChild("quote_cnt").getValue()));
		msg.setFavorited(em.getChild("favorited").getValue());
		msg.setPermanentURL(em.getChild("permanent_url").getValue());
		msg.setPubDate(em.getChild("pub_date").getValue());

		if (em.getChild("user").getContentSize() != 0) {
			Element elemUser = em.getChild("user");
			msg.setUserURLName(elemUser.getChild("url_name").getValue());
			msg.setUserNickName(elemUser.getChild("nickname").getValue());
			msg.setUserProfileImgURL(elemUser.getChild("profile_img_url").getValue());
		}
		if (em.getChild("attachment").getContentSize() != 0) {
			Element elemAttachment = em.getChild("attachment");
			msg.setAttachmentKey(elemAttachment.getChild("key").getValue());
			msg.setAttachmentType(elemAttachment.getChild("type").getValue());
			msg.setAttachmentName(elemAttachment.getChild("name").getValue());
			msg.setAttachmentThumbnailURL(elemAttachment.getChild("thumbnail_url").getValue());
			msg.setAttachmentImageURL(elemAttachment.getChild("img_url").getValue());
		}
		return msg;
	}

	/**
	 * Parses the search articles.
	 *
	 * @param conn the conn
	 * @return the yozm articles
	 */
	private YozmArticles parseSearchArticles(HttpURLConnection conn) {
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Element root = null;
		YozmArticles response = new YozmArticles();
		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();
			if (util.isAPIError(root) == true)
				return null;

			@SuppressWarnings("unchecked")
			List<Element> childList = root.getChildren("message");
			for (Element em : childList) {
				YozmArticleSet articles = new YozmArticleSet();

				if (em.getChild("parent_msg") != null)
					articles.setParentArticle(parseArticle(em.getChild("parent_msg")));

				if (em.getChild("original_msg") != null)
					articles.setParentArticle(parseArticle(em.getChild("original_msg")));

				articles.setWriteArticle(parseArticle(em));
				response.addArticle(articles);
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
	 * @return the yozm write res
	 */
	private YozmWriteRes parseWriteArticle(HttpURLConnection conn) {
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Element root = null;
		YozmWriteRes response = new YozmWriteRes();

		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();
			if (util.isAPIError(root) == true)
				return null;

			Element elem = root.getChild("message");

			if (elem.getChild("parent_msg") != null) {
				response.setParentArticle(parseArticle(elem.getChild("parent_msg")));
			}
			response.setWriteArticle(parseArticle(elem));

		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}

	/**
	 * Parses the articles list.
	 *
	 * @param conn the conn
	 * @return the yozm articles
	 */
	private YozmArticles parseArticlesList(HttpURLConnection conn) {
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Element root = null;
		YozmArticles response = new YozmArticles();
		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();
			if (util.isAPIError(root) == true)
				return null;

			@SuppressWarnings("unchecked")
			List<Element> childList = root.getChildren("message");
			for (Element em : childList) {
				YozmArticleSet articles = new YozmArticleSet();

				if (em.getChild("parent_msg") != null)
					articles.setParentArticle(parseArticle(em.getChild("parent_msg")));

				if (em.getChild("original_msg") != null)
					articles.setParentArticle(parseArticle(em.getChild("original_msg")));

				articles.setWriteArticle(parseArticle(em));
				response.addArticle(articles);
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}

	/**
	 * Parses the user info.
	 *
	 * @param conn the conn
	 * @return the yozm user info
	 */
	private YozmUserInfo parseUserInfo(HttpURLConnection conn) {
		YozmUserInfo response = new YozmUserInfo();
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Element root = null;
		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();
			if (util.isAPIError(root) == true)
				return null;
			response = parseInfo(root.getChild("user"));

		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}

	/**
	 * User info parser.
	 * 
	 * @param em
	 *            the em
	 * @return the yozm user info
	 */
	private YozmUserInfo parseInfo(Element em) {
		YozmUserInfo info = new YozmUserInfo();
		Element user_elem = (Element) em.getChild("user_info");

		info.setLikes(user_elem.getChild("likes").getValue());
		info.setDisLikes(user_elem.getChild("dislikes").getValue());
		info.setDoWellThings(user_elem.getChild("do_well_things").getValue());
		info.setLikePlaces(user_elem.getChild("like_places").getValue());
		info.setIntroduce(user_elem.getChild("introduce").getValue());
		info.setJobType(user_elem.getChild("job_type").getValue());
		info.setJobName(user_elem.getChild("job_name").getValue());

		info.setNickName(em.getChild("nickname").getValue());
		info.setURLName(em.getChild("url_name").getValue());
		info.setProfileImgURL(em.getChild("profile_img_url").getValue());
		info.setProfileBigImgURL(em.getChild("profile_big_img_url").getValue());
		info.setFollowingCnt(Integer.parseInt(em.getChild("following_cnt").getValue()));
		info.setFollowerCnt(Integer.parseInt(em.getChild("follower_cnt").getValue()));
		info.setAge(Integer.parseInt(em.getChild("age").getValue()));
		info.setBloodtype(em.getChild("blood_type").getValue());
		info.setFollow(Boolean.parseBoolean(em.getChild("is_follow").getValue()));
		info.setFollower(Boolean.parseBoolean(em.getChild("is_follower").getValue()));
		info.setBothFollow(Boolean.parseBoolean(em.getChild("is_both_follow").getValue()));
		info.setMessageCnt(Integer.parseInt(em.getChild("msg_cnt").getValue()));
		info.setSex(em.getChild("sex").getValue());

		info.setOpenProfile(Boolean.parseBoolean(em.getChild("is_open_profile").getValue()));
		info.setOpenYozm(Boolean.parseBoolean(em.getChild("is_open_yozm").getValue()));
		info.setSexCode(em.getChild("sex_code").getValue());
		info.setBirthday(em.getChild("birthday").getValue());

		return info;
	}

	/**
	 * Parses the user articles.
	 *
	 * @param conn the conn
	 * @return the list
	 */
	@SuppressWarnings("unchecked")
	private List<YozmUserArticles> parseUserArticles(HttpURLConnection conn) {
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Element root = null;
		List<YozmUserArticles> response = new ArrayList<YozmUserArticles>();

		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();
			if (util.isAPIError(root) == true)
				return null;

			List<Element> childList = root.getChildren("message");
			for (Element em : childList) {
				YozmUserArticles tempArticles = new YozmUserArticles();
				tempArticles.setArticleUserInfo(parseInfo(em.getChild("user")));
				tempArticles.setWriteArticle(parseArticle(em));

				if (em.getChild("parent_msg") != null) {
					tempArticles.setParentUserInfo(parseInfo(em.getChild("parent_msg").getChild("user")));
					tempArticles.setParentArticle(parseArticle(em.getChild("parent_msg")));
				}
				if (em.getChild("original_msg") != null) {
					tempArticles.setOriginalUserInfo(parseInfo(em.getChild("original_msg").getChild("user")));
					tempArticles.setOriginalArticle(parseArticle(em.getChild("original_msg")));
				}
				response.add(tempArticles);
			}

		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}
}
