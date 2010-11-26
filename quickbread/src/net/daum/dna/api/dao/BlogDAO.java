package net.daum.dna.api.dao;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;

import net.daum.dna.api.vo.blog.BlogActivityRes;
import net.daum.dna.api.vo.blog.BlogActivityReses;
import net.daum.dna.api.vo.blog.BlogArticle;
import net.daum.dna.api.vo.blog.BlogArticles;
import net.daum.dna.api.vo.blog.BlogArticlesItem;
import net.daum.dna.api.vo.blog.BlogCategories;
import net.daum.dna.api.vo.blog.BlogCategory;
import net.daum.dna.api.vo.blog.BlogComment;
import net.daum.dna.api.vo.blog.BlogCommentRes;
import net.daum.dna.api.vo.blog.BlogComments;
import net.daum.dna.api.vo.blog.BlogInfo;
import net.daum.dna.api.vo.blog.BlogModifyRes;
import net.daum.dna.api.vo.blog.BlogNextArticle;
import net.daum.dna.api.vo.blog.BlogPreArticle;
import net.daum.dna.api.vo.blog.BlogRSS;
import net.daum.dna.api.vo.blog.BlogRSSes;
import net.daum.dna.api.vo.blog.BlogWriteRes;
import net.daum.dna.exception.APICommonException;
import net.daum.dna.oauth.DaumOAuth;
import net.daum.dna.util.APIUtils;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

// TODO: Auto-generated Javadoc
/**
 * The Class BlogDAO.
 */
public class BlogDAO {

	/** The oauth. */
	private DaumOAuth oauth;

	/** The util. */
	private APIUtils util;

	/**
	 * Instantiates a new default blog API.
	 * 
	 * @param oauth
	 *            the oauth
	 */
	public BlogDAO(DaumOAuth oauth) {
		super();
		this.oauth = oauth;
		this.util = APIUtils.getInstance();
	}

	/**
	 * Sets the daum oauth.
	 * 
	 * @param oauth
	 *            the new daum oauth
	 */
	public void setDaumOAuth(DaumOAuth oauth) {
		this.oauth = oauth;
	}

	/**
	 * Gets the daum oauth.
	 * 
	 * @return the daum oauth
	 */
	public DaumOAuth getDaumoAuth() {
		return this.oauth;
	}

	/**
	 * 블로그 글에 대한  정보목록을 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 글 정보에 대한 객체 또는 NULL 반환
	 */

	public BlogArticles getArticles(String queryString) {

		BlogArticles articles = new BlogArticles();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_POST_LIST_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				articles = null;
			} else {
				articles = this.parseArticlesGetting(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}

		return articles;
	}

	/**
	 * 블로그 글에 대한 정보목록를 xml String형태로 제공합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 글 정보에 대한 xml String 반환. 
	 */
	public String getArticlesAsXML(String queryString) {
		String articles = null;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_POST_LIST_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				articles = null;
			} else {
				articles = util.changeToString(conn.getInputStream());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return articles;
	}

	/**
	 * 블로그 글에 대한 정보목록를 json String형태로 제공합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 글 정보에 대한 json String 반환.
	 */
	public String getArticlesAsJSON(String queryString) {
		String articles = null;
		String xmlString;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_POST_LIST_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				articles = null;
			} else {
				xmlString = util.changeToString(conn.getInputStream());
				articles = util.toJSONString(xmlString);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}

		return articles;
	}

	/**
	 * 블로그에 글을 작성합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 글 작성결과에 대한 객체  or Null 반환
	 */
	public BlogWriteRes writeArticle(String queryString) {
		BlogWriteRes writeRes = new BlogWriteRes();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_POST_WRITE_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_POST, oauth);
			if (null == conn) {
				writeRes = null;
			} else {
				writeRes = this.parseArticleWriting(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return writeRes;
	}

	/**
	 * 블로그에 글을 쓰고 작성결과를  xml String 형태로 제공합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 글 작성결과에 대한 xml String 반환
	 */
	public String writeArticleAsXML(String queryString) {
		String writeRes = null;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_POST_WRITE_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_POST, oauth);
			if (conn.equals(null)) {
				writeRes = null;
			} else {
				writeRes = util.changeToString(conn.getInputStream());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return writeRes;
	}

	/**
	 * 블로그에 글을 쓰고 작성결과를  json String 형태로 제공합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 글 작성결과에 대한 json String 반환
	 */
	public String writeArticleAsJSON(String queryString) {
		String writeRes = null;
		String xmlString;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_POST_WRITE_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_POST, oauth);
			if (null == conn) {
				writeRes = null;
			} else {
				xmlString = util.changeToString(conn.getInputStream());
				;
				writeRes = util.toJSONString(xmlString);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return writeRes;
	}

	/**
	 * 특정 글을 수정하고 결과를  객체 형태로 제공합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 수정결과 객체 또는 null을 반환 
	 */
	public BlogModifyRes modifyArticle(String queryString) {
		BlogModifyRes modifyRes = new BlogModifyRes();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_POST_MODIFY_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_POST, oauth);
			if (null == conn) {
				modifyRes = null;
			} else {
				modifyRes = this.parseArticleModifing(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}

		return modifyRes;
	}

	/**
	 * 특정 글을 수정하고 결과를  xml String 형태로 제공합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 수정 결과에 대한 xml String 반환
	 */
	public String modifyArticleAsXML(String queryString) {
		String modifyRes = null;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_POST_MODIFY_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				modifyRes = null;
			} else {
				modifyRes = util.changeToString(conn.getInputStream());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return modifyRes;
	}

	/**
	 * 특정 글을 수정하고 결과를  json String 형태로 제공합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 수정 결과에 대한 json String 반환
	 */
	public String modifyArticleAsJSON(String queryString) {
		String modifyRes = null;
		String xmlString;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_POST_MODIFY_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				modifyRes = null;
			} else {
				xmlString = util.changeToString(conn.getInputStream());
				modifyRes = util.toJSONString(xmlString);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		conn.disconnect();
		return modifyRes;
	}

	/**
	 * 특정 글에 대한 정보를 객체 형태로 제공합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 특정 글의 정보에 대한 객체  or null 반환
	 */
	public BlogArticle getArticle(String queryString) {
		BlogArticle article = new BlogArticle();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_POST_READ_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				article = null;
			} else {
				article = this.parseArticleGetting(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return article;
	}

	/**
	 * 특정 글에대한 정보를 xml String 형태로 제공합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 특정 글 정보에 대한  xml String 반환
	 */
	public String getArticleAsXML(String queryString) {
		String article = null;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_POST_READ_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				article = null;
			} else {
				article = util.changeToString(conn.getInputStream());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return article;
	}

	/**
	 * 특정 글에대한 정보를 json String 형태로 제공합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 특정 글 정보에 대한  json String 반환
	 */
	public String getArticleAsJSON(String queryString) {
		String article = null;
		String xmlString;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_POST_READ_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				article = null;
			} else {
				xmlString = util.changeToString(conn.getInputStream());
				article = util.toJSONString(xmlString);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return article;
	}

	/**
	 * 카테고리 목록에 관한 정보를 객체 형태로 제공합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 카테고리 목록에 대한 객체 or null 반환
	 */
	public BlogCategories getCategories(String queryString) {
		BlogCategories categories = new BlogCategories();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_CATEGORY_LIST_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				categories = null;
			} else {
				categories = this.parseCategories(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return categories;
	}

	/**
	 * 카테고리목록에 관한 정보를  xml String 형태로 제공합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 카테고리 목록에 대한 xml String 반환 
	 */
	public String getCategoriesAsXML(String queryString) {
		String categories = null;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_CATEGORY_LIST_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				categories = null;
			} else {
				categories = util.changeToString(conn.getInputStream());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return categories;
	}

	/**
	 * 블로그에 대한 카테고리 목록 정보를 JSON 형태로 제공합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 카테고리 목록에 대한 json String 반환 
	 */
	public String getCategoriesAsJSON(String queryString) {
		String categories = null;
		String xmlString;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_CATEGORY_LIST_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				categories = null;
			} else {
				xmlString = util.changeToString(conn.getInputStream());
				categories = util.toJSONString(xmlString);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return categories;
	}

	/**
	 * 글의 코멘트 정보목록을 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * @param queryString
	 *            쿼리스트링
	 * @return 글의 코멘트 정보목록 객체 or null
	 */
	public BlogComments getComments(String queryString) {
		BlogComments comments = new BlogComments();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_COMMENT_LIST_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				comments = null;
			} else {
				comments = this.parseComments(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return comments;
	}

	/**
	 * 글의 코멘트 정보목록을 xml String 형태로 제공합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 특정 글의 코멘트 정보 목록에 대한  xml String 반환 
	 */
	public String getCommentsAsXML(String queryString) {
		String comments = null;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_COMMENT_LIST_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				comments = null;
			} else {
				comments = util.changeToString(conn.getInputStream());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return comments;
	}

	/**
	 * 글의 코멘트 정보목록을 json String 형태로 제공합니다. 
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 특정 글의 코멘트 정보 목록에 대한  json String 반환 
	 */
	public String getCommentsAsJSON(String queryString) {
		String comments = null;
		String xmlString;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_COMMENT_LIST_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				comments = null;
			} else {
				xmlString = util.changeToString(conn.getInputStream());
				comments = util.toJSONString(xmlString);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return comments;
	}

	/**
	 * 글에 코멘트 작성하고 그 결과를 객체형태로 반환합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 코멘트 작성결과 객체  or null 반환
	 */
	public BlogCommentRes writeComment(String queryString) {
		BlogCommentRes writeRes = new BlogCommentRes();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_COMMENT_WRITE_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_POST, oauth);
			if (null == conn) {
				writeRes = null;
			} else {
				writeRes = this.parseCommentRes(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return writeRes;
	}

	/**
	 * 글에 코멘트를 작성하고 그 결과를 xmlString 형테로 반환합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 코멘트 작성결과에 관한 xmlString 반환
	 */
	public String writeCommentAsXML(String queryString) {
		String writeRes = null;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_COMMENT_WRITE_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_POST, oauth);
			if (null == conn) {
				writeRes = null;
			} else {
				writeRes = util.changeToString(conn.getInputStream());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return writeRes;
	}

	/**
	 * 글에 코멘트 작성하고 그 결과를 json String 형태로 반환합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 코멘트 작성결과에 관한 jsonString 반환
	 */
	public String writeCommentAsJSON(String queryString) {
		String writeRes = null;
		String xmlString;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_COMMENT_WRITE_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_POST, oauth);
			if (null == conn) {
				writeRes = null;
			} else {
				xmlString = util.changeToString(conn.getInputStream());
				writeRes = util.toJSONString(xmlString);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return writeRes;
	}

	/**
	 * 블로그에서 설정된 rss 정보 목록를 객체 형태로 가져옵니다. 
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return rss 정보목록 객체 or null 반환
	 */
	public BlogRSSes getRsses(String queryString) {
		BlogRSSes rsses = new BlogRSSes();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_RSS_LIST_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				rsses = null;
			} else {
				rsses = this.parseRsses(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return rsses;

	}

	/**
	 * 블로그에서 설정된 rss 정보 목록을  xml String 형태로 가져옵니다. 
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return rss 정보목록에 대한  xml String 반환
	 */
	public String getRssesAsXML(String queryString) {
		String rsses = null;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_RSS_LIST_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				rsses = null;
			} else {
				rsses = util.changeToString(conn.getInputStream());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return rsses;

	}

	/**
	 * 블로그에서 설정된 rss 정보 목록을 json String 형태로 가져옵니다. 
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return rss 정보목록에 대한  json String 반환
	 */
	public String getRssesAsJSON(String queryString) {
		String rsses = null;
		String xmlString;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_RSS_LIST_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				rsses = null;
			} else {
				xmlString = util.changeToString(conn.getInputStream());
				rsses = util.toJSONString(xmlString);
			}
			conn.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return rsses;
	}

	/**
	 * 블로그 정보를 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 블로그 정보 객체 or null 반환
	 */
	public BlogInfo getInfo(String queryString) {
		BlogInfo info = new BlogInfo();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_INFO_BLOG_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				info = null;
			} else {
				info = this.parseInfo(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return info;
	}

	/**
	 * 블로그 정보를 xml 형태로 제공합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 블로그 정보 대한 xml String 반환
	 */
	public String getInfoAsXML(String queryString) {
		String info = null;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_INFO_BLOG_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				info = null;
			} else {
				info = util.changeToString(conn.getInputStream());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return info;
	}

	/**
	 * 블로그 정보를 json 형태로 제공합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 블로그 정보 대한 json String 반환
	 */
	public String getInfoAsJSON(String queryString) {
		String rsses = null;
		String xmlString;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_INFO_BLOG_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				rsses = null;
			} else {
				xmlString = util.changeToString(conn.getInputStream());
				rsses = util.toJSONString(xmlString);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return rsses;
	}

	/**
	 * 나의 활동에 대한 모든 정보를 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 나의 확동정보 객체 of null
	 */
	public BlogActivityReses getActivityRes(String queryString) {
		BlogActivityReses activityRes = new BlogActivityReses();
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_INFO_MYACTIVITY_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				activityRes = null;
			} else {
				activityRes = this.parseActivityReses(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return activityRes;
	}

	/**
	 * 나의 활동에 대한 모든 정보를 xml String형태로 제공합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 나의 활동정보에 대한 xml String 반환
	 */
	public String getActivityResAsXML(String queryString) {
		String artivityRes = null;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_INFO_MYACTIVITY_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				artivityRes = null;
			} else {
				artivityRes = util.changeToString(conn.getInputStream());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return artivityRes;
	}

	/**
	 * 나의 활동에 대한 모든 정보를 json String형태로 제공합니다.
	 * 
	 * @param queryString
	 *            쿼리스트링
	 * @return 나의 활동정보에 대한 json String 반환
	 */
	public String getActivityResAsJSON(String queryString) {
		String activityRes = null;
		String xmlString;
		StringBuffer url = new StringBuffer();
		HttpURLConnection conn = null;

		try {
			url.append(APIUtils._BLOG_INFO_MYACTIVITY_URL);
			url.append(queryString);
			conn = util.getHttpURLConnection(url.toString(), APIUtils._HTTP_REQUEST_GET, oauth);
			if (null == conn) {
				activityRes = null;
			} else {
				xmlString = util.changeToString(conn.getInputStream());
				activityRes = util.toJSONString(xmlString);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}
		return activityRes;
	}

	/**
	 * xml 형식으로 받아온 글 목록을 파싱하여 Articles 객체에 할당해 줍니다.
	 * 
	 * @param conn
	 *            HttpURLConnection
	 * @return Articles 객체
	 */
	@SuppressWarnings("unchecked")
	private BlogArticles parseArticlesGetting(HttpURLConnection conn) {

		BlogArticles articles = new BlogArticles();
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Element root = null;

		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();
			
			if (util.isAPIError(root)) {
				articles = null;
			} else {
				if( util.isValidElement( root.getChild("status") ) )
					articles.setStatus(Integer.parseInt(root.getChildText("status")));
				if( util.isValidElement( root.getChild("totalCount") ) )
					articles.setTotalCount(Integer.parseInt(root.getChildText("totalCount")));
				if( util.isValidElement( root.getChild("maxNo") ) )
					articles.setMaxNo(Integer.parseInt(root.getChildText("maxNo")));
				if( util.isValidElement( root.getChild("minNo") ) )
					articles.setMinNo(Integer.parseInt(root.getChildText("minNo")));
				if( util.isValidElement( root.getChild("maxDate") ) )
					articles.setMaxDate(root.getChildText("maxDate"));
				if( util.isValidElement( root.getChild("minDate") ) )
					articles.setMinDate(root.getChildText("minDate"));
				
				if( util.isValidElement( root.getChildren("item") ) ) {
					List<Element> items = root.getChildren("item");
					
					for (Element em : items) {
						BlogArticlesItem item = new BlogArticlesItem();
						
						if( util.isValidElement( root.getChild("postId") ) )
							item.setPostId(Integer.parseInt(em.getChildText("postId")));
						if( util.isValidElement( root.getChild("nickname") ) )
							item.setNickname(em.getChildText("nickname"));
						if( util.isValidElement( root.getChild("title") ) )
							item.setTitle(em.getChildText("title"));
						if( util.isValidElement( root.getChild("date") ) )
							item.setDate(em.getChildText("date"));
						if( util.isValidElement( root.getChild("open") ) )
							item.setOpen(em.getChildText("open"));
						if( util.isValidElement( root.getChild("url") ) )
							item.setUrl(em.getChildText("url"));
						if( util.isValidElement( root.getChild("viewCategoryId") ) )
							item.setViewCategoryId(em.getChildText("viewCategoryId"));
						if( util.isValidElement( root.getChild("isScrap") ) )
							item.setIsScrap(em.getChildText("isScrap"));
						if( util.isValidElement( root.getChild("comments") ) )
							item.setComments(Integer.parseInt(em.getChildText("comments")));
						if( util.isValidElement( root.getChild("trackbacks") ) )
							item.setTrackbacks(em.getChildText("trackbacks"));
						articles.addArticle(item);			
					}
				}					
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return articles;
	}

	/**
	 * 글 작성에 대한 응답 결과를 파싱합니다.
	 *
	 * @param conn the conn
	 * @return BlogWriteRes 객체
	 */
	private BlogWriteRes parseArticleWriting(HttpURLConnection conn) {

		BlogWriteRes writeRes = new BlogWriteRes();
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Element root = null;

		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();
			if (util.isAPIError(root)) {
				writeRes = null;
			} else {
				
				if( util.isValidElement( root.getChild("status") ) )
					writeRes.setStatus(Integer.parseInt(root.getChildText("status")));
				if( util.isValidElement( root.getChild("postId") ) )
					writeRes.setPostId(Integer.parseInt(root.getChildText("postId")));
				if( util.isValidElement( root.getChild("url") ) )
					writeRes.setUrl(root.getChildText("url"));
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return writeRes;
	}

	/**
	 * 글 수정에 대한 응답 결과를 파싱합니다.
	 * 
	 * @param conn
	 *            HttpURLConnection
	 * @return 글 수정에 대한 응답객체
	 * @throws APICommonException
	 *             the aPI common exception
	 */
	private BlogModifyRes parseArticleModifing(HttpURLConnection conn) throws APICommonException {

		BlogModifyRes modifyRes = new BlogModifyRes();
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Element root = null;

		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();
			if (util.isAPIError(root)) {
				modifyRes = null;
			} else {
				if( util.isValidElement( root.getChild("status") ) )
					modifyRes.setStatus(Integer.parseInt(root.getChildText("status")));
				if( util.isValidElement( root.getChild("postId") ) )
					modifyRes.setPostId(Integer.parseInt(root.getChildText("postId")));
				if( util.isValidElement( root.getChild("url") ) )
					modifyRes.setUrl( root.getChildText("url") );
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return modifyRes;
	}

	/**
	 * 글 정보를 파싱합니다.
	 * 
	 * @param conn
	 *            HttpURLConnection
	 * @return 글 정보를 가진 객체
	 */
	@SuppressWarnings("unchecked")
	private BlogArticle parseArticleGetting(HttpURLConnection conn) {

		BlogArticle article = new BlogArticle();
		BlogNextArticle nextArticle = new BlogNextArticle();
		BlogPreArticle preArticle = new BlogPreArticle();
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Element root = null;

		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();

			if (util.isAPIError(root)) {
				article = null;
			} else {
				
				if( util.isValidElement( root.getChild("status") ) ) 
					article.setStatus(Integer.parseInt(root.getChildText("status")));
				if( util.isValidElement( root.getChild("postId") ) )
					article.setPostId(Integer.parseInt(root.getChildText("postId")));
				if( util.isValidElement( root.getChild("url") ) ) 
					article.setUrl(root.getChildText("url"));
				if( util.isValidElement( root.getChild("title") ) ) 
					article.setTitle(root.getChildText("title"));
				if( util.isValidElement( root.getChild("content") ) ) 
					article.setContent(root.getChildText("content"));
				if( util.isValidElement( root.getChild("nickname") ) ) 
					article.setNickname(root.getChildText("nickname") );
				if( util.isValidElement( root.getChild("comments") ) ) 
					article.setComments(Integer.parseInt(root.getChildText("comments")));
				if( util.isValidElement( root.getChild("trackbacks") ) ) 
					article.setTrackbacks(root.getChildText("trackbacks"));
				if( util.isValidElement( root.getChild("tag") ) ) 
					article.setTag(root.getChildText("tag"));
				if( util.isValidElement( root.getChild("date") ) ) 
					article.setDate(root.getChildText("date"));
				if( util.isValidElement( root.getChild("categoryId") ) ) 
					article.setCategoryId(root.getChildText("categoryId"));
				if( util.isValidElement( root.getChild("categoryName") ) ) 
					article.setCategoryName(root.getChildText("categoryName"));
				if( util.isValidElement( root.getChild("scrapPrmtKind") ) ) 
					article.setScrapPrmtKind(root.getChildText("scrapPrmtKind"));
				if( util.isValidElement( root.getChild("searchPrmt") ) ) 
					article.setSearchPrmt(root.getChildText("searchPrmt"));
				if( util.isValidElement( root.getChild("open") ) )
					article.setOpen(root.getChildText("open"));
				
				if( util.isValidElement( root.getChild("images").getChildren("item") ) ) {
					List<Element> items = root.getChild("images").getChildren("item");
					for (Element em : items) {
						if ( util.isValidElement( em.getChild("url") ) )
							article.getImageUrls().add(em.getChildText("url"));
					}
				}
				
				if( util.isValidElement( root.getChild("previousPost") ) ) {
					if( util.isValidElement( root.getChild("previousPost").getChild("id") ) )
						preArticle.setId(root.getChild("previousPost").getChildText("id"));
					if( util.isValidElement( root.getChild("previousPost").getChild("id") ) )
						preArticle.setTitle(root.getChild("previousPost").getChildText("id") );
					article.setpreArticle(preArticle);
				}						

				if( util.isValidElement( root.getChild("nextPost") ) ) {
					if( util.isValidElement( root.getChild("nextPost").getChild("id") ) )
						nextArticle.setId(root.getChild("nextPost").getChildText("id") );
					if( util.isValidElement(root.getChild("nextPost").getChild("title") ) )
						nextArticle.setTitle(root.getChild("nextPost").getChildText("title") );
					article.setNextArticle(nextArticle);
				}
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return article;
	}

	/**
	 * 카테고리 목록을를 파싱합니다.
	 * 
	 * @param conn
	 *            HttpURLConnection
	 * @return 카테고리 목록 객체
	 */
	@SuppressWarnings("unchecked")
	private BlogCategories parseCategories(HttpURLConnection conn) {

		BlogCategories categories = new BlogCategories();
		@SuppressWarnings("unused")
		BlogCategory category = new BlogCategory();
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Element root = null;

		try {
			doc = builder.build(conn.getInputStream());

			root = doc.getRootElement();
			if (util.isAPIError(root)) {
				categories = null;
			} else {
				if( util.isValidElement( root.getChild("status") ) )
					categories.setStatus(Integer.parseInt(root.getChildText("status")));
				if( util.isValidElement( root.getChild("items").getChildren("item") ) ) {
					List<Element> items = root.getChild("items").getChildren("item");
					for (Element em : items) {
						BlogCategory item = new BlogCategory();
						if( util.isValidElement( em.getChild("categoryId") ) )
							item.setCategoryId(Integer.parseInt(em.getChildText("categoryId")));
						if( util.isValidElement(  em.getChild("open") ) )
							item.setOpen(em.getChildText("open"));
						if( util.isValidElement(  em.getChild("name") ) )
							item.setName(em.getChildText("name"));
						categories.addCategory(item);
					}
				}
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return categories;
	}

	/**
	 * 코멘트 목록을 파싱합니다.
	 * 
	 * @param conn
	 *            HttpURLConnection
	 * @return 코멘트 목록 객체
	 */
	@SuppressWarnings("unchecked")
	private BlogComments parseComments(HttpURLConnection conn) {

		BlogComments comments = new BlogComments();
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Element root = null;

		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();
			if (util.isAPIError(root)) {
				comments = null;
			} else {
				if( util.isValidElement( root.getChild("status") ) )
					comments.setStatus(Integer.parseInt(root.getChildText("status")));
				if( util.isValidElement( root.getChild("totalCount") ) )
					comments.setTotalCount(Integer.parseInt(root.getChildText("totalCount")));
				if( util.isValidElement(  root.getChildren("item") ) ) {
					List<Element> items = root.getChildren("item");
	
					for (Element em : items) {
						BlogComment item = new BlogComment();
						if( util.isValidElement( em.getChild("commentId") ) )
							item.setCommentId(em.getChildText("commentId"));
						if( util.isValidElement( em.getChild("parentId") ) )
							item.setParentId(em.getChildText("parentId"));
						if( util.isValidElement( em.getChild("name") ) )								
							item.setName(em.getChildText("name"));
						if( util.isValidElement( em.getChild("content") ) )
							item.setContent(em.getChildText("content"));
						if( util.isValidElement( em.getChild("url") ) )
							item.setUrl(em.getChildText("url"));
						if( util.isValidElement( em.getChild("date") ) )
							item.setDate(em.getChildText("date"));
						comments.addComment(item);
					}
				}
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return comments;
	}

	/**
	 * 코멘트 작성결과를 파싱합니다.
	 *
	 * @param conn the conn
	 * @return BlogCommentRes 객체
	 */
	private BlogCommentRes parseCommentRes(HttpURLConnection conn) {

		BlogCommentRes commentRes = new BlogCommentRes();
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Element root = null;

		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();
			if (util.isAPIError(root)) {
				commentRes = null;
			} else {
				if( util.isValidElement( root.getChild("status") ) )
				commentRes.setStatus(Integer.parseInt(root.getChildText("status")));
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return commentRes;
	}

	/**
	 * RSS 목록을 파싱합니다.
	 * 
	 * @param conn
	 *            HttpURLConnection
	 * @return RSS 목록 객체
	 */
	@SuppressWarnings("unchecked")
	private BlogRSSes parseRsses(HttpURLConnection conn) {

		BlogRSSes rsses = new BlogRSSes();
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Element root = null;

		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();
			if (util.isAPIError(root)) {
				rsses = null;
			} else {
				if( util.isValidElement( root.getChild("status") ) )
					rsses.setStatus(Integer.parseInt(root.getChildText("status") ) );
				if( util.isValidElement( root.getChild("items").getChildren("item") ) ) {
					List<Element> items = root.getChild("items").getChildren("item");
					for (Element em : items) {
						BlogRSS item = new BlogRSS();
						if( util.isValidElement( em.getChild("title") ) )
							item.setTitle(em.getChildText("title"));
						if( util.isValidElement( em.getChild("content") ) )
							item.setContent(em.getChildText("content"));
						if( util.isValidElement( em.getChild("link") ) )
							item.setLink(em.getChildText("link"));
						if( util.isValidElement( em.getChild("pubDate") ) )
							item.setPubDate(em.getChildText("pubDate"));
						if( util.isValidElement( em.getChild("author") ) )
							item.setAuthor(em.getChildText("author"));
						if( util.isValidElement( em.getChild("enclosure") ) )
							item.setEnclosure(em.getChildText("enclosure"));
						rsses.addRss(item);
					}
				}
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rsses;
	}

	/**
	 * 블로그 정보를 파싱합니다.
	 * 
	 * @param conn
	 *            HttpURLConnection
	 * @return 블로그 정보를 담고 있는 객체
	 */
	private BlogInfo parseInfo(HttpURLConnection conn) {

		BlogInfo info = new BlogInfo();
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Element root = null;

		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();

			if (util.isAPIError(root)) {
				info = null;
			} else {
				if( util.isValidElement( root.getChild("id") ) )
					info.setId(root.getChildText("id"));
				if( util.isValidElement( root.getChild("name") ) )
					info.setName(root.getChildText("name"));
				if( util.isValidElement( root.getChild("nickname") ) )
					info.setNickname(root.getChildText("nickname"));
				if( util.isValidElement( root.getChild("title") ) )
					info.setTitle(root.getChildText("title"));
				if( util.isValidElement( root.getChild("description") ) )
					info.setDescription(root.getChildText("description"));
				if( util.isValidElement( root.getChild("url") ) )
					info.setUrl(root.getChildText("url"));
				if( util.isValidElement( root.getChild("rssUrl") ) )
					info.setRssUrl(root.getChildText("rssUrl"));
				if( util.isValidElement( root.getChild("myconImageUrl") ) )
					info.setMyconImageUrl(root.getChildText("myconImageUrl"));
				if( util.isValidElement( root.getChild("profileThumbnailImageUrl") ) )
					info.setProfileThumbnailImageUrl(root.getChildText("profileThumbnailImageUrl"));
				if( util.isValidElement( root.getChild("profileImageUrl") ) )
					info.setProfileImageUrl(root.getChildText("profileImageUrl"));
				if( util.isValidElement( root.getChild("isNewGuestbookExists") ) )
					info.setIsNewGuestbookExists(root.getChildText("isNewGuestbookExists") == "Y" ? true : false);
				if( util.isValidElement( root.getChild("visitorCount") ) )
					info.setVisitorCount(Integer.parseInt(root.getChildText("visitorCount")));
				if( util.isValidElement( root.getChild("status") ) )
					info.setStatus(Integer.parseInt(root.getChildText("status")));
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return info;
	}

	/**
	 * 내가 작성한 글들의 반응목록을 파싱합니다.
	 * 
	 * @param conn
	 *            HttpURLConnection
	 * @return 내가 작성한글들의 반응 목록에 대한 객체
	 */

	@SuppressWarnings("unchecked")
	private BlogActivityReses parseActivityReses(HttpURLConnection conn) {

		BlogActivityReses activities = new BlogActivityReses();
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Element root = null;

		try {
			doc = builder.build(conn.getInputStream());
			root = doc.getRootElement();

			if (util.isAPIError(root)) {
				activities = null;
			} else {
				if( util.isValidElement( root.getChild("status") ) )
					activities.setStatus(Integer.parseInt(root.getChildText("status")));
				if( util.isValidElement( root.getChild("items").getChildren("item") ) ) {
					List<Element> items = root.getChild("items").getChildren("item");

					for (Element em : items) {
						BlogActivityRes item = new BlogActivityRes();
						if( util.isValidElement( em.getChild("title") ) )						
							item.setTitle(em.getChildText("title"));
						if( util.isValidElement( em.getChild("postId") ) )
							item.setPostId(em.getChildText("postId"));
						if( util.isValidElement( em.getChild("pubDate") ) )
							item.setPubDate(em.getChildText("pubDate"));
						if( util.isValidElement( em.getChild("description") ) )
							item.setDescription(em.getChildText("description"));
						if( util.isValidElement( em.getChild("author") ) )
							item.setAuthor(em.getChildText("author"));
						if( util.isValidElement( em.getChild("type") ) )
							item.setType(em.getChildText("type"));
						activities.addActivity(item);
					}
				}
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return activities;
	}
}
