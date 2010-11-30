package net.daum.dna.api.basic;

import net.daum.dna.api.BlogAPI;
import net.daum.dna.api.service.BlogService;
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

// TODO: Auto-generated Javadoc
/**
 * The Class DefaultBlogAPI.
 */
public class DefaultBlogAPI implements BlogAPI {

	/** The service. */
	private BlogService service;

	/**
	 * Instantiates a new default blog API.
	 * 
	 * @param oauth
	 *            the oauth
	 */
	public DefaultBlogAPI(DaumOAuth oauth) {
		service = new BlogService(oauth);
	}

	/**
	 * Sets the daum oauth.
	 * 
	 * @param oauth
	 *            the new daum oauth
	 */
	public void setDaumOAuth(DaumOAuth oauth) {
		service.setDaumOAuth(oauth);
	}

	/**
	 * Gets the daum oauth.
	 * 
	 * @return the daum oauth
	 */
	public DaumOAuth getDaumoAuth() {
		return service.getDaumoAuth();

	}

	/**
	 * 블로그 글에 대한 정보목록을 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 *
	 * @param blogName 블로그 이름
	 * @return 글 정보에 대한 객체 또는 NULL 반환
	 */
	public BlogArticles getArticles(String blogName) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);

		return service.getArticles(required);
	}

	/**
	 * 블로그 글에 대한  정보목록을 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param blogName 블로그 이름
	 * @param option 선택 파라미터 객체 
	 * 				- viewContent : Y or N
	 * @return 글 정보에 대한 객체 또는 NULL 반환
	 */

	public BlogArticles getArticles(String blogName, Params option) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);

		return service.getArticles(required, option);
	}

	/**
	 * 블로그 글에 대한 정보목록를 xml String형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 글 정보에 대한 xml String 반환. 
	 */
	public String getArticlesAsXML(String blogName) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);

		return service.getArticlesAsXML(required);
	}

	/**
	 *  블로그 글에 대한 정보목록를  xml String 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param option
	 *            선택 파라미터 객체 
	 *            - viewContent : Y or N
	 * @return 글 정보에 대한 xml String 반환.   
	 */
	public String getArticlesAsXML(String blogName, Params option) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);

		return service.getArticlesAsXML(required, option);
	}

	/**
	 * 블로그 글에 대한 정보목록를 json String형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 글 정보에 대한 json String 반환.
	 */
	public String getArticlesAsJSON(String blogName) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);

		return service.getArticlesAsJSON(required);
	}

	/**
	 * 블로그 글에 대한 정보목록를 json String형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param option
	 *            선택 파라미터 객체 
	 *             - viewContent : Y or N
	 * @return 글 정보에 대한 json String 반환.
	 */
	public String getArticlesAsJSON(String blogName, Params option) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);

		return service.getArticlesAsJSON(required, option);
	}

	/**
	 * 블로그에 글을 작성합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param title
	 *            제목
	 * @param content
	 *            내용
	 * @param tag
	 *            태그
	 * @return 글 작성결과에 대한 객체  or Null 반환
	 */
	public BlogWriteRes writeArticle(String blogName, String title, String content, String tag) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("title", title);
		required.getOptionMap().put("content", content);
		required.getOptionMap().put("tag", tag);

		return service.writeArticle(required);
	}
	/**
	 * 블로그에 글을 작성합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param title
	 *            제목
	 * @param content
	 *            내용
	 * @param tag
	 *            태그
	 * @param option
	 *            선택 파라미터 객체 
	 *            - open : 공개여부 (_ARTICLE_OPEN , _ARTICLE_CLOSE , _ARTICLE_FRIEND_OPEN 중 하나 선택)
	 *            - fileName : 첨부파일명
	 *            - fileUrl : 파일 URL
	 *            - categoryId : 없을경우 전체 카테고리
	 *            - viewCategoryId : view를 보낼 경우에 필요. view에 가입된 사용자여야함
	 *            
	 * @return 글 작성결과에 대한 xml String 반환
	 */
	public BlogWriteRes writeArticle(String blogName, String title, String content, String tag, Params option) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("title", title);
		required.getOptionMap().put("content", content);
		required.getOptionMap().put("tag", tag);

		return service.writeArticle(required, option);
	}

	/**
	 * 블로그에 글을 쓰고 작성결과를  xml String 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param title
	 *            제목
	 * @param content
	 *            내용
	 * @param tag
	 *            태그
	 * @return 글 작성결과에 대한 xml String 반환
	 */
	public String writeArticleAsXML(String blogName, String title, String content, String tag) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("title", title);
		required.getOptionMap().put("content", content);
		required.getOptionMap().put("tag", tag);

		return service.writeArticleAsXML(required);
	}

	/**
	 * 블로그에 글을 쓰고 작성결과를  xml String 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param title
	 *            제목
	 * @param content
	 *            내용
	 * @param tag
	 *            태그
	 * @param option
	 *             선택 파라미터 객체 
	 *            - open : 공개여부 (_ARTICLE_OPEN , _ARTICLE_CLOSE , _ARTICLE_FRIEND_OPEN 중 하나 선택)
	 *            - fileName : 첨부파일명
	 *            - fileUrl : 파일 URL
	 *            - categoryId : 없을경우 전체 카테고리
	 *            - viewCategoryId : view를 보낼 경우에 필요. view에 가입된 사용자여야함
	 * @return 글 작성결과에 대한 xml String 반환
	 */
	public String writeArticleAsXML(String blogName, String title, String content, String tag, Params option) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("title", title);
		required.getOptionMap().put("content", content);
		required.getOptionMap().put("tag", tag);

		return service.writeArticleAsXML(required, option);
	}

	/**
	 * 블로그에 글을 쓰고 작성결과를  json String 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param title
	 *            제목
	 * @param content
	 *            내용
	 * @param tag
	 *            태그
	 * @return 글 작성결과에 대한 json String 반환
	 */
	public String writeArticleAsJSON(String blogName, String title, String content, String tag) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("title", title);
		required.getOptionMap().put("content", content);
		required.getOptionMap().put("tag", tag);

		return service.writeArticleAsJSON(required);
	}

	/**
	 * 블로그에 글을 쓰고 작성결과를  json String 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param title
	 *            제목
	 * @param content
	 *            내용
	 * @param tag
	 *            태그
	 * @param option
	 *           선택 파라미터 객체 
	 *            - open : 공개여부 (_ARTICLE_OPEN , _ARTICLE_CLOSE , _ARTICLE_FRIEND_OPEN 중 하나 선택)
	 *            - fileName : 첨부파일명
	 *            - fileUrl : 파일 URL
	 *            - categoryId : 없을경우 전체 카테고리
	 *            - viewCategoryId : view를 보낼 경우에 필요. view에 가입된 사용자여야함
	 * @return 글 작성결과에 대한 json String 반환
	 */
	public String writeArticleAsJSON(String blogName, String title, String content, String tag, Params option) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("title", title);
		required.getOptionMap().put("content", content);
		required.getOptionMap().put("tag", tag);

		return service.writeArticleAsJSON(required, option);
	}

	/**
	 * 특정 아티클을 수정하고 결과를  객체 형태로 제공합니다.
	 * 오류 발생시 에는 null을 반환합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param postId
	 *            글에 대한 id
	 * @param title
	 *            제목
	 * @param content
	 *            내용
	 * @param tag
	 *            태그
	 * @return 수정결과 객체 또는 null을 반환 
	 */
	public BlogModifyRes modifyArticle(String blogName, String postId, String title, String content, String tag) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("postId", postId);
		required.getOptionMap().put("title", title);
		required.getOptionMap().put("content", content);
		required.getOptionMap().put("tag", tag);

		return service.modifyArticle(required);
	}

	/**
	 * 특정 글을 수정하고 결과를  객체 형태로 제공합니다.
	 * 오류 발생시 NULL을 반환합니다.
	 *
	 * @param blogName 블로그 이름
	 * @param postId 글에 대한 id
	 * @param title 제목
	 * @param content 내용
	 * @param tag 태그
	 * @param option 선택 파라미터 객체 
	 * 			- viewCategoryId : view를 보낼 경우에 필요. view에 가입된 사용자여야함
	 * 
	 * @return 수정결과 객체 또는 null을 반환 
	 */
	public BlogModifyRes modifyArticle(String blogName, String postId, String title, String content, String tag, Params option) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("postId", postId);
		required.getOptionMap().put("title", title);
		required.getOptionMap().put("content", content);
		required.getOptionMap().put("tag", tag);

		return service.modifyArticle(required, option);
	}

	/**
	 * 특정 글을 수정하고 결과를  xml String 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param postId
	 *            글에 대한 id
	 * @param title
	 *            제목
	 * @param content
	 *            내용
	 * @param tag
	 *            태그
	 * @return 수정 결과에 대한 xml String 반환
	 */
	public String modifyArticleAsXML(String blogName, String postId, String title, String content, String tag) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("postId", postId);
		required.getOptionMap().put("title", title);
		required.getOptionMap().put("content", content);
		required.getOptionMap().put("tag", tag);

		return service.modifyArticleAsXML(required);
	}

	/**
	 *  특정 글을 수정하고 결과를  json String 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param postId
	 *            글에 대한 id
	 * @param title
	 *            제목
	 * @param content
	 *            내용
	 * @param tag
	 *            태그
	 * @return 수정 결과에 대한 json String 반환
	 */
	public String modifyArticleAsXML(String blogName, String postId, String title, String content, String tag, Params option) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("postId", postId);
		required.getOptionMap().put("title", title);
		required.getOptionMap().put("content", content);
		required.getOptionMap().put("tag", tag);

		return service.modifyArticleAsXML(required, option);
	}

	/**
	 * 특정 글을 수정하고 결과를  json String 형태로 제공합니다.
	 *
	 * @param blogName 블로그 이름
	 * @param postId 글에 대한 id
	 * @param title 제목
	 * @param content 내용
	 * @param tag 태그
	 * 				- viewCategoryId : view를 보낼 경우에 필요. view에 가입된 사용자여야함
	 * @return 수정 결과에 대한 json String 반환
	 */
	public String modifyArticleAsJSON(String blogName, String postId, String title, String content, String tag) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("postId", postId);
		required.getOptionMap().put("title", title);
		required.getOptionMap().put("content", content);
		required.getOptionMap().put("tag", tag);

		return service.modifyArticleAsJSON(required);
	}

	/**
	 * 특정 글을 수정하고 결과를  json String 형태로 제공합니다.
	 *
	 * @param blogName 블로그 이름
	 * @param postId 글에 대한 id
	 * @param title 제목
	 * @param content 내용
	 * @param tag 태그
	 * @param option 선택 파라미터 객체 	 
	 * 				- viewCategoryId : view를 보낼 경우에 필요. view에 가입된 사용자여야함
	 * @return 수정 결과에 대한 json String 반환
	 */
	public String modifyArticleAsJSON(String blogName, String postId, String title, String content, String tag, Params option) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("postId", postId);
		required.getOptionMap().put("title", title);
		required.getOptionMap().put("content", content);
		required.getOptionMap().put("tag", tag);

		return service.modifyArticleAsJSON(required, option);
	}

	/**
	 * 특정 글에 대한 정보를 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param postId
	 *            글 에 대한 id
	 * @return 특정 글 정보에 대한 객체  or null 반환
	 */
	public BlogArticle getArticle(String blogName, String postId) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("postId", postId);

		return service.getArticle(required);
	}

	/**
	 * 특정 글에대한 정보를 xml String 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param postId
	 *            글 에 대한 id
	 * @return 특정 글 정보에 대한  xml String 반환
	 */
	public String getArticleAsXML(String blogName, String postId) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("postId", postId);

		return service.getArticleAsXML(required);
	}

	/**
	 * 특정 글에대한 정보를 json String 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param postId
	 *            글에 대한 id
	 * @return 특정 글 정보에 대한  json String 반환
	 */
	public String getArticleAsJSON(String blogName, String postId) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("postId", postId);

		return service.getArticleAsJSON(required);
	}

	/**
	 * 카테고리 목록에 관한 정보를 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 카테고리 목록에 대한 객체 or null 반환
	 */
	public BlogCategories getCategories(String blogName) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);

		return service.getCategories(required);
	}

	/**
	 * 카테고리목록에 관한 정보를  xml String 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 카테고리 목록에 대한 xml String 반환 
	 */
	public String getCategoriesAsXML(String blogName) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);

		return service.getCategoriesAsXML(required);
	}

	/**
	 * 블로그에 대한 카테고리 목록 정보를 JSON 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 카테고리 목록에 대한 json String 반환 
	 */
	public String getCategoriesAsJSON(String blogName) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);

		return service.getCategoriesAsJSON(required);
	}

	/**
	 * 글의 코멘트 정보목록을 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param postId
	 *            글에 대한 id
	 * @return 글의 코멘트 정보목록 객체 or null
	 */
	public BlogComments getComments(String blogName, String postId) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("postId", postId);

		return service.getComments(required);
	}

	/**
	 * 글의 코멘트 정보목록을 xml String 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param postId
	 *            글에 대한 id
	 * @return 특정 글의 코멘트 정보 목록에 대한  xml String 반환 
	 */
	public String getCommentsAsXML(String blogName, String postId) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("postId", postId);

		return service.getCommentsAsXML(required);
	}

	/**
	 * 글의 코멘트 정보목록을 json String 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param postId
	 *            글 에 대한 id
	 * @return 특정 글의 코멘트 정보 목록에 대한  json String 반환 
	 */
	public String getCommentsAsJSON(String blogName, String postId) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("postId", postId);

		return service.getCommentsAsJSON(required);
	}

	/**
	 * 글에 코멘트 작성하고 그 결과를 객체형태로 반환합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 *
	 * @param blogName 블로그 이름
	 * @param postId 글에 대한 id
	 * @param content 코멘트 내용
	 * @param isSecret 비밀 여부
	 * @return 코멘트 작성결과 객체  or null 반환
	 */
	public BlogCommentRes writeComment(String blogName, String postId, String content, boolean isSecret) {
		String secret;
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("postId", postId);
		required.getOptionMap().put("content", content);
		secret = (isSecret) ? "Y" : "N";
		required.getOptionMap().put("secret", secret);

		return service.writeComment(required);
	}

	/**
	 * 글에 코멘트를 작성하고 그 결과를 xmlString 형테로 반환합니다.
	 *
	 * @param blogName 블로그 이름
	 * @param postId 글에 대한 id
	 * @param content 코멘트 내용
	 * @param isSecret 비밀 여부
	 * @return 코멘트 작성결과에 관한 xmlString 반환
	 */
	public String writeCommentAsXML(String blogName, String postId, String content, boolean isSecret) {
		String secret;
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("postId", postId);
		required.getOptionMap().put("content", content);
		secret = (isSecret) ? "Y" : "N";
		required.getOptionMap().put("secret", secret);

		return service.writeCommentAsXML(required);
	}

	/**
	 * 글에 코멘트 작성하고 그 결과를 json String 형태로 반환합니다.
	 *
	 * @param blogName 블로그 이름
	 * @param postId 글에 대한 id
	 * @param content 코멘트 내용
	 * @param isSecret 비밀 여부
	 * @return 코멘트 작성결과에 관한 jsonString 반환
	 */
	public String writeCommentAsJSON(String blogName, String postId, String content, boolean isSecret) {
		String secret;
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);
		required.getOptionMap().put("postId", postId);
		required.getOptionMap().put("content", content);
		secret = (isSecret) ? "Y" : "N";
		required.getOptionMap().put("secret", secret);

		return service.writeCommentAsJSON(required);
	}

	/**
	 * 블로그에서 설정된 rss 정보 목록를 객체 형태로 가져옵니다. 
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return rss 정보목록 객체 or null 
	 */
	public BlogRSSes getRsses(String blogName) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);

		return service.getRsses(required);
	}

	/**
	 * 블로그에서 설정된 rss 정보 목록을  xml String 형태로 가져옵니다. 
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return rss 정보목록에 대한  xml String 반환
	 */
	public String getRssesAsXML(String blogName) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);

		return service.getRssesAsXML(required);
	}

	/**
	 * 블로그에서 설정된 rss 정보 목록을 json String 형태로 가져옵니다. 
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return rss 정보목록에 대한  json String 반환
	 */
	public String getRssesAsJSON(String blogName) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);

		return service.getRssesAsJSON(required);
	}

	/**
	 * 블로그 정보를 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 블로그 정보 객체 or null 반환
	 */
	public BlogInfo getInfo(String blogName) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);

		return service.getInfo(required);
	}

	/**
	 * 블로그 정보를 xml 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 블로그 정보 대한 xml String 반환
	 */
	public String getInfoAsXML(String blogName) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);

		return service.getInfoAsXML(required);
	}

	/**
	 * 블로그 정보를 json 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 블로그 정보 대한 json String 반환
	 */
	public String getInfoAsJSON(String blogName) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);

		return service.getInfoAsJSON(required);
	}

	/**
	 * 나의 활동에 대한 모든 정보를 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 나의 확동정보 객체 of null
	 */
	public BlogActivityReses getActivityRes(String blogName) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);

		return service.getActivityRes(required);
	}

	/**
	 * 나의 활동에 대한 모든 정보를 xml String형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 나의 활동정보에 대한 xml String 반환
	 */
	public String getActivityResAsXML(String blogName) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);

		return service.getActivityResAsXML(required);
	}

	/**
	 * 나의 활동에 대한 모든 정보를 json String형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 나의 활동정보에 대한 json String 반환
	 */
	public String getActivityResAsJSON(String blogName) {
		Params required = new Params();
		required.getOptionMap().put("blogName", blogName);

		return service.getActivityResAsJSON(required);
	}

}
