package net.daum.dna.api.dao;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;

import net.daum.dna.api.vo.yozm.YozmArticle;
import net.daum.dna.api.vo.yozm.YozmArticleSet;
import net.daum.dna.api.vo.yozm.YozmArticles;
import net.daum.dna.api.vo.yozm.YozmUserArticleSet;
import net.daum.dna.api.vo.yozm.YozmUserArticles;
import net.daum.dna.api.vo.yozm.YozmUserInfo;
import net.daum.dna.api.vo.yozm.YozmUserJoin;
import net.daum.dna.api.vo.yozm.YozmUserJoined;
import net.daum.dna.api.vo.yozm.YozmWriteRes;
import net.daum.dna.oauth.DaumOAuth;
import net.daum.dna.util.APIUtils;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

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

		url.append(APIUtils._YOZM_ARTICLE_LIST_URL);
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
	 * @param queryString
	 *            the query string
	 * @return the user articles
	 */
	public YozmUserArticles getUserArticles(String queryString) {
		HttpURLConnection conn = null;
		YozmUserArticles response = new YozmUserArticles();
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
	 * @param conn
	 *            the conn
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

			if (util.isValidElement(root.getChild("joined")))
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
	 * @param conn
	 *            the conn
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

			if (util.isValidElement(root.getChild("status")))
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
		if (util.isValidElement(em.getChild("msg_id")))
			msg.setMsgId(Integer.parseInt(em.getChild("msg_id").getValue()));
		if (util.isValidElement(em.getChild("type")))
			msg.setType(em.getChild("type").getValue());
		if (util.isValidElement(em.getChild("text")))
			msg.setText(em.getChild("text").getValue());
		if (util.isValidElement(em.getChild("plain_text")))
			msg.setPlainText(em.getChild("plain_text").getValue());
		if (util.isValidElement(em.getChild("html_text")))
			msg.setHtmlText(em.getChild("html_text").getValue());
		if (util.isValidElement(em.getChild("source_name")))
			msg.setSourceName(em.getChild("source_name").getValue());
		if (util.isValidElement(em.getChild("reply_cnt")))
			msg.setReplyCnt(Integer.parseInt(em.getChild("reply_cnt").getValue()));
		if (util.isValidElement(em.getChild("quote_cnt")))
			msg.setQuoteCnt(Integer.parseInt(em.getChild("quote_cnt").getValue()));
		if (util.isValidElement(em.getChild("favorited")))
			msg.setFavorited(em.getChild("favorited").getValue());
		if (util.isValidElement(em.getChild("permanent_url")))
			msg.setPermanentURL(em.getChild("permanent_url").getValue());
		if (util.isValidElement(em.getChild("pub_date")))
			msg.setPubDate(em.getChild("pub_date").getValue());

		if (em.getChild("user").getContentSize() != 0) {
			Element elemUser = em.getChild("user");
			if (util.isValidElement(elemUser.getChild("url_name")))
				msg.setUserURLName(elemUser.getChild("url_name").getValue());
			if (util.isValidElement(elemUser.getChild("nickname")))
				msg.setUserNickName(elemUser.getChild("nickname").getValue());
			if (util.isValidElement(elemUser.getChild("profile_img_url")))
				msg.setUserProfileImgURL(elemUser.getChild("profile_img_url").getValue());
		}
		if (em.getChild("attachment").getContentSize() != 0) {
			Element elemAttachment = em.getChild("attachment");
			if (util.isValidElement(elemAttachment.getChild("key")))
				msg.setAttachmentKey(elemAttachment.getChild("key").getValue());
			if (util.isValidElement(elemAttachment.getChild("type")))
				msg.setAttachmentType(elemAttachment.getChild("type").getValue());
			if (util.isValidElement(elemAttachment.getChild("name")))
				msg.setAttachmentName(elemAttachment.getChild("name").getValue());
			if (util.isValidElement(elemAttachment.getChild("thumbnail_url")))
				msg.setAttachmentThumbnailURL(elemAttachment.getChild("thumbnail_url").getValue());
			if (util.isValidElement(elemAttachment.getChild("img_url")))
				msg.setAttachmentImageURL(elemAttachment.getChild("img_url").getValue());
		}
		return msg;
	}

	/**
	 * Parses the search articles.
	 * 
	 * @param conn
	 *            the conn
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
			List<Element> childList = root.getChild("msg_list").getChildren("message");
			if (util.isValidElement(childList)) {

				for (Element em : childList) {
					YozmArticleSet articles = new YozmArticleSet();

					if (util.isValidElement(em))
						articles.setWriteArticle(parseArticle(em));

					if (util.isValidElement(em.getChild("parent_msg")))
						articles.setParentArticle(parseArticle(em.getChild("parent_msg")));

					if (util.isValidElement(em.getChild("original_msg")))
						articles.setParentArticle(parseArticle(em.getChild("original_msg")));

					response.addArticle(articles);
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
	 * Parses the write article.
	 * 
	 * @param conn
	 *            the conn
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

			if (util.isValidElement(elem))
				response.setWriteArticle(parseArticle(elem));

			if (util.isValidElement(elem.getChild("parent_msg"))) {
				response.setParentArticle(parseArticle(elem.getChild("parent_msg")));
			}
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
	 * @param conn
	 *            the conn
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
			List<Element> childList = root.getChild("msg_list").getChildren("message");
			for (Element em : childList) {
				YozmArticleSet articles = new YozmArticleSet();

				if (util.isValidElement(em))
					articles.setWriteArticle(parseArticle(em));

				if (util.isValidElement(em.getChild("parent_msg")))
					articles.setParentArticle(parseArticle(em.getChild("parent_msg")));

				if (util.isValidElement(em.getChild("original_msg")))
					articles.setParentArticle(parseArticle(em.getChild("original_msg")));

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
	 * @param conn
	 *            the conn
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

			if (util.isValidElement(root.getChild("user")))
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
		Element user_elem = em.getChild("user_info");

		if (util.isValidElement(user_elem.getChild("likes")))
			info.setLikes(user_elem.getChild("likes").getValue());
		if (util.isValidElement(user_elem.getChild("dislikes")))
			info.setDisLikes(user_elem.getChild("dislikes").getValue());
		if (util.isValidElement(user_elem.getChild("do_well_things")))
			info.setDoWellThings(user_elem.getChild("do_well_things").getValue());
		if (util.isValidElement(user_elem.getChild("like_places")))
			info.setLikePlaces(user_elem.getChild("like_places").getValue());
		if (util.isValidElement(user_elem.getChild("introduce")))
			info.setIntroduce(user_elem.getChild("introduce").getValue());
		if (util.isValidElement(user_elem.getChild("job_type")))
			info.setJobType(user_elem.getChild("job_type").getValue());
		if (util.isValidElement(user_elem.getChild("job_name")))
			info.setJobName(user_elem.getChild("job_name").getValue());

		if (util.isValidElement(em.getChild("likes")))
			info.setNickName(em.getChild("nickname").getValue());
		if (util.isValidElement(em.getChild("url_name")))
			info.setURLName(em.getChild("url_name").getValue());
		if (util.isValidElement(em.getChild("profile_img_url")))
			info.setProfileImgURL(em.getChild("profile_img_url").getValue());
		if (util.isValidElement(em.getChild("profile_big_img_url")))
			info.setProfileBigImgURL(em.getChild("profile_big_img_url").getValue());
		if (util.isValidElement(em.getChild("following_cnt")))
			info.setFollowingCnt(Integer.parseInt(em.getChild("following_cnt").getValue()));
		if (util.isValidElement(em.getChild("follower_cnt")))
			info.setFollowerCnt(Integer.parseInt(em.getChild("follower_cnt").getValue()));
		if (util.isValidElement(em.getChild("age")))
			info.setAge(Integer.parseInt(em.getChild("age").getValue()));
		if (util.isValidElement(em.getChild("blood_type")))
			info.setBloodtype(em.getChild("blood_type").getValue());
		if (util.isValidElement(em.getChild("is_follow")))
			info.setFollow(Boolean.parseBoolean(em.getChild("is_follow").getValue()));
		if (util.isValidElement(em.getChild("is_follower")))
			info.setFollower(Boolean.parseBoolean(em.getChild("is_follower").getValue()));
		if (util.isValidElement(em.getChild("is_both_follow")))
			info.setBothFollow(Boolean.parseBoolean(em.getChild("is_both_follow").getValue()));
		if (util.isValidElement(em.getChild("msg_cnt")))
			info.setMessageCnt(Integer.parseInt(em.getChild("msg_cnt").getValue()));
		if (util.isValidElement(em.getChild("sex")))
			info.setSex(em.getChild("sex").getValue());

		if (util.isValidElement(em.getChild("is_open_profile")))
			info.setOpenProfile(Boolean.parseBoolean(em.getChild("is_open_profile").getValue()));
		if (util.isValidElement(em.getChild("is_open_yozm")))
			info.setOpenYozm(Boolean.parseBoolean(em.getChild("is_open_yozm").getValue()));
		if (util.isValidElement(em.getChild("sex_code")))
			info.setSexCode(em.getChild("sex_code").getValue());
		if (util.isValidElement(em.getChild("birthday")))
			info.setBirthday(em.getChild("birthday").getValue());

		return info;
	}

	/**
	 * Parses the user articles.
	 * 
	 * @param conn
	 *            the conn
	 * @return the list
	 */
	@SuppressWarnings("unchecked")
	private YozmUserArticles parseUserArticles(HttpURLConnection conn) {
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Element root = null;
		YozmUserArticles response = new YozmUserArticles();

		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();
			if (util.isAPIError(root) == true)
				return null;

			List<Element> msgList = root.getChild("msg_list").getChildren("message");

			if (util.isValidElement(msgList)) {
				for (Element em : msgList) {
					YozmUserArticleSet tempArticles = new YozmUserArticleSet();

					if (util.isValidElement(em))
						tempArticles.setWriteArticle(parseArticle(em));
					
					if (util.isValidElement(em.getChild("user")))
						tempArticles.setArticleUserInfo(parseInfo(em.getChild("user")));

					if (util.isValidElement(em.getChild("parent_msg"))) {
						if (util.isValidElement(em.getChild("parent_msg")))
							tempArticles.setParentArticle(parseArticle(em.getChild("parent_msg")));
						if (util.isValidElement(em.getChild("parent_msg").getChild("user")))
							tempArticles.setParentUserInfo(parseInfo(em.getChild("parent_msg").getChild("user")));
					}
					if (util.isValidElement(em.getChild("originam_msg"))) {
						if (util.isValidElement(em.getChild("original_msg")))
							tempArticles.setOriginalArticle(parseArticle(em.getChild("original_msg")));
						if (util.isValidElement(em.getChild("originam_msg").getChild("user")))
							tempArticles.setOriginalUserInfo(parseInfo(em.getChild("original_msg").getChild("user")));
					}
					response.addUserArticle(tempArticles);
				}
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}
}
