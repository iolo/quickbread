package net.daum.dna.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import net.daum.dna.oauth.DaumOAuth;
import net.daum.dna.params.Params;
import net.json.JSONException;
import net.json.JSONObject;
import net.json.XML;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;

import org.jdom.Element;


// TODO: Auto-generated Javadoc
/**
 * The Class APIUtils.
 */
/**
 * @author DAUM
 *
 */
public class APIUtils {

	/** The connection time out. */
	protected final int _CONNECTION_TIME_OUT = 10000;

	/** The api ok response_code. */
	public static final int _API_OK_RESPONSE_CODE = 200;

	/** The util. */
	private static APIUtils util = new APIUtils();

	/** The Constant _API_COMMON_EXCEPTION_MESSAGE. */
	public static final String _API_COMMON_EXCEPTION_MESSAGE = "APIUtil Exception";

	/** The Constant _HTTP_REQUEST_POST. */
	public static final String _HTTP_REQUEST_POST = "POST";

	/** The Constant _HTTP_REQUEST_GET. */
	public static final String _HTTP_REQUEST_GET = "GET";
	
	/** The Constant _DATA_FORMAT_FORM_XML. */
	public static final String 	_XML = "xml";

	/** The Constant _BLOG_POST_LIST_URL. */
	public static final String _BLOG_POST_LIST_URL = "https://apis.daum.net/blog/post/list.do";

	/** The Constant _BLOG_POST_WRITE_URL. */
	public static final String _BLOG_POST_WRITE_URL = "https://apis.daum.net/blog/post/write.do";

	/** The Constant _BLOG_POST_MODIFY_URL. */
	public static final String _BLOG_POST_MODIFY_URL = "https://apis.daum.net/blog/post/modify.do";

	/** The Constant _BLOG_POST_READ_URL. */
	public static final String _BLOG_POST_READ_URL = "https://apis.daum.net/blog/post/read.do";

	/** The Constant _BLOG_CATEGORY_LIST_URL. */
	public static final String _BLOG_CATEGORY_LIST_URL = "https://apis.daum.net/blog/category/list.do";

	/** The Constant _BLOG_COMMENT_LIST_URL. */
	public static final String _BLOG_COMMENT_LIST_URL = "https://apis.daum.net/blog/comment/list.do";

	/** The Constant _BLOG_COMMENT_WRITE_URL. */
	public static final String _BLOG_COMMENT_WRITE_URL = "https://apis.daum.net/blog/comment/write.do";

	/** The Constant _BLOG_RSS_LIST_URL. */
	public static final String _BLOG_RSS_LIST_URL = "https://apis.daum.net/blog/rss/list.do";

	/** The Constant _BLOG_INFO_BLOG_URL. */
	public static final String _BLOG_INFO_BLOG_URL = "https://apis.daum.net/blog/info/blog.do";

	/** The Constant _BLOG_INFO_MYACTIVITY_URL. */
	public static final String _BLOG_INFO_MYACTIVITY_URL = "https://apis.daum.net/blog/info/myActivity.do";

	/** The Constant _CAFE_ALIMIS_URL. */
	public static final String _CAFE_ALIMIS_URL = "https://apis.daum.net/cafe/alimis.";

	/** The Constant _CAFE_ARTICLES_URL. */
	public static final String _CAFE_ARTICLES_URL = "https://apis.daum.net/cafe/articles/";

	/** The Constant _CAFE_BOARDS_URL. */
	public static final String _CAFE_BOARDS_URL = "https://apis.daum.net/cafe/boards/";

	/** The Constant _CAFE_FAVORITE_CAFE_URL. */
	public static final String _CAFE_FAVORITE_CAFE_URL = "https://apis.daum.net/cafe/favorite_cafes.";

	/** The Constant _CAFE_RECENT_ARTICLE_URL. */
	public static final String _CAFE_RECENT_ARTICLE_URL = "https://apis.daum.net/cafe/recent_articles/";

	/** The Constant _CAFE_WRITE_ARTICLE_URL. */
	public static final String _CAFE_WRITE_ARTICLE_URL = "https://apis.daum.net/cafe/write_article/";

	/** The Constant _YOZM_WRITE_MESSAGE_URL. */
	public static final String _YOZM_WRITE_MESSAGE_URL = "https://apis.daum.net/yozm/v1_0/message/add.";

	/** The Constant _YOZM_SHOW_USER_INFO_URL. */
	public static final String _YOZM_SHOW_USER_INFO_URL = "https://apis.daum.net/yozm/v1_0/user/show.";

	/** The Constant _YOZM_JOIN_INFO_URL. */
	public static final String _YOZM_JOIN_INFO_URL = "https://apis.daum.net/yozm/v1_0/user/joined.";
	
	/** The Constant _YOZM_JOIN_YOZM_URL. */
	public static final String _YOZM_JOIN_YOZM_URL = "https://apis.daum.net/yozm/v1_0/user/join.";
	
	/** The Constant _YOZM_SEARCH_ARTICLES_URL. */
	public static final String _YOZM_SEARCH_ARTICLES_URL = "https://apis.daum.net/yozm/v1_0/timeline/search.";
	
	/** The Constant _YOZM_ARTICLE_LIST_URL. */
	public static final String _YOZM_ARTICLE_LIST_URL = "https://apis.daum.net/yozm/v1_0/timeline/home.";
	
	/** The Constant _YOZM_SHOW_USER_ARTICLE_URL. */
	public static final String _YOZM_SPECIFIC_ARTICLES_URL = "https://apis.daum.net/yozm/v1_0/timeline/user.";

	/**
	 * Instantiates a new API utils.
	 */
	private APIUtils () {}
	
	/**
	 * Gets the single instance of APIUtils.
	 * 
	 * @return single instance of APIUtils
	 */
	public static APIUtils getInstance() {
		return util;
	}

	public boolean isValidElement(Element em) {
		
		if( null == em )
			return false;
		
		return true;
	}
	
	public boolean isValidElement(List<Object> list) {
		
		if( null == list )
			return false;
		
		return true;
	}
	
	/**
	 * 입력받은 InputStream을 string으로 변환시켜 줍니다.
	 *
	 * @param is inputstream
	 * @return the string
	 */
	public String changeToString(InputStream is) {
		StringBuffer out = new StringBuffer();
		byte[] b = new byte[4096];

		try {
			for (int i; (i = is.read(b)) != -1;) {
				out.append(new String(b, 0, i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return out.toString();
	}

	/**
	 * query 와 method , oauth token 을 받아서 API 에 호출하는 합니다.
	 *
	 * @param fullURL fullURL
	 * @param method the method (post or get)
	 * @param oauth the oauth
	 * @return the http url connection
	 */
	public HttpURLConnection getHttpURLConnection(String fullURL, String method, DaumOAuth oauth) {
		URL url = null;
		HttpURLConnection conn = null;

		try {
			url = new URL(fullURL);
			conn = (HttpURLConnection) url.openConnection();
			conn.setReadTimeout(_CONNECTION_TIME_OUT);
			conn.setRequestMethod(method);
			oauth.sign(conn);
			conn.connect();
			if (conn.getResponseCode() != _API_OK_RESPONSE_CODE) {
				System.out.println( changeToString( conn.getInputStream() ) );
				conn = null;
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ProtocolException e) {
			e.printStackTrace();
		}catch (OAuthMessageSignerException e) {
			e.printStackTrace();				
		} catch (OAuthExpectationFailedException e) {
			e.printStackTrace();
		} catch (OAuthCommunicationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	

	/**
	 * API error 발생여부를 체크합니다. API error이 발생했다면 true, 발생하지 않았다면 false를 반환합니다.
	 *
	 * @param root the root element
	 * @return true or false 반환
	 */
	@SuppressWarnings("unchecked")
	public boolean isAPIError (Element root) {
		
		if(root == null)
			return true;		
		else if( "apierror".equals(root.getName() ) ) {
			System.out.println( "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" );
			System.out.println( "<" + root.getName() + ">");
			
			List<Element> list = root.getChildren();		
			for(Element em : list) {
				System.out.print( "\t<" + em.getName() + ">" );
				System.out.print(em.getText());
				System.out.println( "</" + em.getName() + ">" );		
			}
			System.out.println( "</" + root.getName() + ">");
			return true;
		}
		return false;

	}
	
	/**
	 * 객체로 받은  parameter 들을 queryString 형태로 만들어줍니다.
	 *
	 * @param required 파라미터
	 * @return the query string
	 */
	public String buildQueryString(Params required)  {
	
		StringBuffer queryString = new StringBuffer();
		Iterator<Entry<String, String>> it;
		Boolean isFirst = true;
		
		try {
			it = required.getOptionMap().entrySet().iterator();
			while ( it.hasNext() ) {
			    Entry<String, String> ent = (Entry<String, String>) it.next();
			    if( isFirst ) {
			    	queryString.append("?");
			    	isFirst = false;
			    } else {
			    	queryString.append("&");
			    }
				queryString.append( ent.getKey() );
				queryString.append("=");
				queryString.append(URLEncoder.encode((String)ent.getValue(), "utf-8"));				  
			} 		
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}	  
		return queryString.toString();
	}

	/**
	 * 객체로 받은  parameter 들을 queryString 형태로 만들어준다.
	 *
	 * @param required 필수 파라미터들
	 * @param option 옵션 파라미터들
	 * @return QueryString
	 */
	public String buildQueryString(Params required , Params option) {
		
		StringBuffer queryString = new StringBuffer();
		Iterator<Entry<String, String>> it;
		
		try {
			queryString.append(buildQueryString(required) );
			it = option.getOptionMap().entrySet().iterator();
			while ( it.hasNext() ) {
			    Entry<String, String> ent = (Entry<String, String>) it.next();  
		    	queryString.append("&");
				queryString.append( ent.getKey() );
				queryString.append("=");
				queryString.append(URLEncoder.encode((String)ent.getValue(), "utf-8"));
			} 
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}		
		return queryString.toString();
	}
	
	/**
	 * xml String을 json String 으로 만들어줍니다.
	 *
	 * @param xmlString the xml string
	 * @return the Json String
	 */
	public String toJSONString (String xmlString)  {
	
		String jsonString = null;		
		JSONObject jsonObj = new JSONObject();
		
		try {
			jsonObj = XML.toJSONObject(xmlString);
			jsonString = jsonObj.toString();
		} catch (JSONException e) {
			e.printStackTrace();
		}		
		return jsonString;
	}

}
