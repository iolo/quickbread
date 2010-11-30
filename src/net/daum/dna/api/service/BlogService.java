package net.daum.dna.api.service;

import net.daum.dna.api.dao.BlogDAO;
import net.daum.dna.api.vo.blog.BlogActivityReses;
import net.daum.dna.api.vo.blog.BlogArticle;
import net.daum.dna.api.vo.blog.BlogArticles;
import net.daum.dna.api.vo.blog.BlogCategories;
import net.daum.dna.api.vo.blog.BlogCommentRes;
import net.daum.dna.api.vo.blog.BlogComments;
import net.daum.dna.api.vo.blog.BlogInfo;
import net.daum.dna.api.vo.blog.BlogModifyRes;
import net.daum.dna.api.vo.blog.BlogRSSes;
import net.daum.dna.api.vo.blog.BlogWriteRes;
import net.daum.dna.oauth.DaumOAuth;
import net.daum.dna.params.Params;
import net.daum.dna.util.APIUtils;

// TODO: Auto-generated Javadoc
/**
 * The Class BlogService.
 */
public class BlogService {

	/** The dao. */
	private BlogDAO blogDAO;

	/**
	 * Instantiates a new default blog API.
	 * 
	 * @param oauth
	 *            the oauth
	 */
	public BlogService(DaumOAuth oauth) {
		blogDAO = new BlogDAO(oauth);
	}

	/**
	 * Gets the daum oauth.
	 * 
	 * @return the daum oauth
	 */
	public DaumOAuth getDaumoAuth() {
		return blogDAO.getDaumoAuth();
	}

	/**
	 * Sets the daum oauth.
	 * 
	 * @param oauth
	 *            the new daum oauth
	 */
	public void setDaumOAuth(DaumOAuth oauth) {
		blogDAO.setDaumOAuth(oauth);
	}

	/**
	 * 블로그 글에 대한 정보목록을 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 글 정보에 대한 객체 또는 NULL 반환
	 */
	public BlogArticles getArticles(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getArticles(queryString);
	}

	/**
	 * 블로그 글에 대한  정보목록을 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @param option 선택 파라미터 객체
	 * @return 글 정보에 대한 객체 또는 NULL 반환
	 */

	public BlogArticles getArticles(Params required, Params option) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required, option);

		return blogDAO.getArticles(queryString);
	}

	/**
	 * 블로그 글에 대한 정보목록를 xml String형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 글 정보에 대한 xml String 반환. 
	 */
	public String getArticlesAsXML(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getArticlesAsXML(queryString);
	}

	/**
	 * 블로그 글에 대한 정보목록를 xml String형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @param option 선택 파라미터 객체
	 * @return 글 정보에 대한 xml String 반환. 
	 */
	public String getArticlesAsXML(Params required, Params option) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required, option);

		return blogDAO.getArticlesAsXML(queryString);
	}

	/**
	 * 블로그 글에 대한 정보목록를 json String형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 글 정보에 대한 json String 반환.
	 */
	public String getArticlesAsJSON(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getArticlesAsJSON(queryString);
	}

	/**
	 * 블로그 글에 대한 정보목록를 json String형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @param option 선택 파라미터 객체
	 * @return 글 정보에 대한 json String 반환.
	 */
	public String getArticlesAsJSON(Params required, Params option) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required, option);

		return blogDAO.getArticlesAsJSON(queryString);
	}

	/**
	 * 블로그에 글을 작성합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 글 작성결과에 대한 객체  or Null 반환
	 */
	public BlogWriteRes writeArticle(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.writeArticle(queryString);
	}

	/**
	 * 블로그에 글을 작성합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @param option 선택 파라미터 객체
	 * 			  - open : 공개여부 (_ARTICLE_OPEN , _ARTICLE_CLOSE , _ARTICLE_FRIEND_OPEN 중 하나 선택)
	 *            - fileName : 첨부파일명
	 *            - fileUrl : 파일 URL
	 *            - categoryId : 없을경우 전체 카테고리
	 *            - viewCategoryId : view를 보낼 경우에 필요. view에 가입된 사용자여야함
	 *            
	 * @return 글 작성결과에 대한 xml String 반환
	 */
	public BlogWriteRes writeArticle(Params required, Params option) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required, option);

		return blogDAO.writeArticle(queryString);
	}

	/**
	 * 블로그에 글을 쓰고 작성결과를  xml String 형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 글 작성결과에 대한 xml String 반환
	 */
	public String writeArticleAsXML(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.writeArticleAsXML(queryString);
	}

	/**
	 * 블로그에 글을 쓰고 작성결과를  xml String 형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @param option  선택 파라미터 객체 
	 *            - open : 공개여부 (_ARTICLE_OPEN , _ARTICLE_CLOSE , _ARTICLE_FRIEND_OPEN 중 하나 선택)
	 *            - fileName : 첨부파일명
	 *            - fileUrl : 파일 URL
	 *            - categoryId : 없을경우 전체 카테고리
	 *            - viewCategoryId : view를 보낼 경우에 필요. view에 가입된 사용자여야함
	 * @return 글 작성결과에 대한 xml String 반환
	 */
	public String writeArticleAsXML(Params required, Params option) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required, option);

		return blogDAO.writeArticleAsXML(queryString);
	}

	/**
	 * 블로그에 글을 쓰고 작성결과를  json String 형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 글 작성결과에 대한 json String 반환
	 */
	public String writeArticleAsJSON(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.writeArticleAsJSON(queryString);
	}

	/**
	 * 블로그에 글을 쓰고 작성결과를  json String 형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @param option 선택 파라미터 객체 
	 *            - open : 공개여부 (_ARTICLE_OPEN , _ARTICLE_CLOSE , _ARTICLE_FRIEND_OPEN 중 하나 선택)
	 *            - fileName : 첨부파일명
	 *            - fileUrl : 파일 URL
	 *            - categoryId : 없을경우 전체 카테고리
	 *            - viewCategoryId : view를 보낼 경우에 필요. view에 가입된 사용자여야함.
	 * @return 글 작성결과에 대한 json String 반환
	 */
	public String writeArticleAsJSON(Params required, Params option) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required, option);

		return blogDAO.writeArticleAsJSON(queryString);
	}

	/**
	 * 특정 글을 수정하고 결과를  객체 형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 수정결과 객체 또는 null을 반환 
	 */
	public BlogModifyRes modifyArticle(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.modifyArticle(queryString);
	}

	/**
	 * 특정 글을 수정하고 결과를  객체 형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @param option 선택 파라미터 객체 
	 * 			- viewCategoryId : view를 보낼 경우에 필요. view에 가입된 사용자여야함
	 * @return 특정 아티클이 올바르게 수정되었는지에 대한 객체형태의 응답값
	 */
	public BlogModifyRes modifyArticle(Params required, Params option ) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required, option);

		return blogDAO.modifyArticle(queryString);
	}

	/**
	 * 특정 글을 수정하고 결과를  xml String 형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 수정 결과에 대한 xml String 반환
	 */
	public String modifyArticleAsXML(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.modifyArticleAsXML(queryString);
	}

	/**
	 * 특정 글을 수정하고 결과를  xml String 형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @param option option 선택 파라미터 객체 	 
	 * 				- viewCategoryId : view를 보낼 경우에 필요. view에 가입된 사용자여야함
	 * @return 수정 결과에 대한 xml String 반환
	 */
	public String modifyArticleAsXML(Params required, Params option) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required, option);

		return blogDAO.modifyArticleAsXML(queryString);
	}

	/**
	 * 특정 글을 수정하고 결과를  json String 형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 수정 결과에 대한 json String 반환
	 */
	public String modifyArticleAsJSON(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.modifyArticleAsJSON(queryString);
	}

	/**
	 * 특정 글을 수정하고 결과를  json String 형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @param option 선택 파라미터 객체 	 
	 * 				- viewCategoryId : view를 보낼 경우에 필요. view에 가입된 사용자여야함
	 * @return 수정 결과에 대한 json String 반환
	 */
	public String modifyArticleAsJSON(Params required, Params option) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required, option);

		return blogDAO.modifyArticleAsJSON(queryString);
	}

	/**
	 * 특정 글에 대한 정보를 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 특정 글의 정보에 대한 객체  or null 반환
	 */
	public BlogArticle getArticle(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getArticle(queryString);
	}

	/**
	 * 특정 글에대한 정보를 xml String 형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 특정 글 정보에 대한  xml String 반환
	 */
	public String getArticleAsXML(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getArticleAsXML(queryString);
	}

	/**
	 * 특정 글에대한 정보를 json String 형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 특정 글 정보에 대한  json String 반환
	 */
	public String getArticleAsJSON(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getArticleAsJSON(queryString);
	}

	/**
	 * 카테고리 목록에 관한 정보를 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 카테고리 목록에 대한 객체 or null 반환
	 */
	public BlogCategories getCategories(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getCategories(queryString);
	}

	/**
	 * 카테고리목록에 관한 정보를  xml String 형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 카테고리 목록에 대한 xml String 반환 
	 */
	public String getCategoriesAsXML(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getCategoriesAsXML(queryString);
	}

	/**
	 * 블로그에 대한 카테고리 목록 정보를 JSON 형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 카테고리 목록에 대한 json String 반환 
	 */
	public String getCategoriesAsJSON(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getCategoriesAsJSON(queryString);
	}

	/**
	 * 글의 코멘트 정보목록을 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 글의 코멘트 정보목록 객체 or null
	 */
	public BlogComments getComments(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getComments(queryString);
	}

	/**
	 * 글의 코멘트 정보목록을 xml String 형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 특정 글의 코멘트 정보 목록에 대한  xml String 반환 
	 */
	public String getCommentsAsXML(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getCommentsAsXML(queryString);
	}

	/**
	 * 글의 코멘트 정보목록을 json String 형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 특정 글의 코멘트 정보 목록에 대한  json String 반환 
	 */
	public String getCommentsAsJSON(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getCommentsAsJSON(queryString);
	}

	/**
	 * 글에 코멘트 작성하고 그 결과를 객체형태로 반환합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param required
	 *            필수 파라미터들을 가진 객체
	 * @return 코멘트 작성결과 객체  or null 반환
	 */
	public BlogCommentRes writeComment(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.writeComment(queryString);
	}

	/**
	 * 글에 코멘트를 작성하고 그 결과를 xmlString 형테로 반환합니다.
	 *
	 * @param required the required
	 * @return 코멘트 작성결과에 관한 xmlString 반환
	 */
	public String writeCommentAsXML(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.writeCommentAsXML(queryString);
	}

	/**
	 * 글에 코멘트 작성하고 그 결과를 json String 형태로 반환합니다..
	 *
	 * @param required the required
	 * @return 코멘트 작성결과에 관한 jsonString 반환
	 */
	public String writeCommentAsJSON(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.writeCommentAsJSON(queryString);
	}

	/**
	 * 블로그에서 설정된 rss 정보 목록를 객체 형태로 가져옵니다. 
	 * 에러 발생시 에는 null을 반환합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return rss 정보목록 객체 or null 반환
	 */
	public BlogRSSes getRsses(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getRsses(queryString);
	}

	/**
	 * 블로그에서 설정된 rss 정보 목록을  xml String 형태로 가져옵니다. 
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return rss 정보목록에 대한  xml String 반환
	 */
	public String getRssesAsXML(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getRssesAsXML(queryString);
	}

	/**
	 * 블로그에서 설정된 rss 정보 목록을 json String 형태로 가져옵니다. 
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return rss 정보목록에 대한  json String 반환
	 */
	public String getRssesAsJSON(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getRssesAsJSON(queryString);
	}

	/**
	 * 블로그 정보를 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 블로그 정보 객체 or null 반환
	 */
	public BlogInfo getInfo(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getInfo(queryString);
	}

	/**
	 * 블로그 정보를 xml 형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 블로그 정보 대한 xml String 반환
	 */
	public String getInfoAsXML(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getInfoAsXML(queryString);
	}

	/**
	 * 블로그 정보를 json 형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 블로그 정보 대한 json String 반환
	 */
	public String getInfoAsJSON(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getInfoAsJSON(queryString);

	}

	/**
	 * 나의 활동에 대한 모든 정보를 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 나의 확동정보 객체 of null
	 */
	public BlogActivityReses getActivityRes(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getActivityRes(queryString);
	}

	/**
	 * 나의 활동에 대한 모든 정보를 xml String형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 나의 활동정보에 대한 xml String 반환
	 */
	public String getActivityResAsXML(Params required) {

		String queryString;

		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getActivityResAsXML(queryString);
	}

	/**
	 * 나의 활동에 대한 모든 정보를 json String형태로 제공합니다.
	 *
	 * @param required 필수 파라미터들을 가진 객체
	 * @return 나의 활동정보에 대한 json String 반환
	 */
	public String getActivityResAsJSON(Params required) {

		String queryString;
		queryString = APIUtils.getInstance().buildQueryString(required);

		return blogDAO.getActivityResAsJSON(queryString);

	}

}
