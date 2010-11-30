package net.daum.dna.api;

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
import net.daum.dna.params.Params;

// TODO: Auto-generated Javadoc
/**
 * The Interface BlogAPI.
 */
public interface BlogAPI {

	/** 글을 공개모드로 설정. */
	public static final String _ARTICLE_OPEN = "Y";
	
	/** 글을 비공개모드로 설정. */
	public static final String _ARTICLE_CLOSE = "N";

	/** 글을 친구들에게만 공개. */
	public static final String _ARTICLE_FRIEND_OPEN = "F";

	/** 방명록. */
	public static final String _GUEST_BOOK = "B";

	/** 댓글. */
	public static final String _COMMENT = "C";

	/** 트랙백. */
	public static final String _TRACKBACK = "T";

	/**
	 * 블로그 글에 대한 정보목록을 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 *
	 * @param blogName 블로그 이름
	 * @return 글 정보에 대한 객체 또는 NULL 반환
	 */
	public BlogArticles getArticles(String blogName);

	/**
	 * 블로그 글에 대한  정보목록을 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param blogName 블로그 이름
	 * @param option 선택 파라미터 객체 
	 * 				- viewContent : Y or N
	 * @return 글 정보에 대한 객체 또는 NULL 반환
	 */

	public BlogArticles getArticles(String blogName, Params option);

	/**
	 * 블로그 글에 대한 정보목록를 xml String형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 글 정보에 대한 xml String 반환. 
	 */
	public String getArticlesAsXML(String blogName);

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
	public String getArticlesAsXML(String blogName, Params option);

	/**
	 * 블로그 글에 대한 정보목록를 json String형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 글 정보에 대한 json String 반환.
	 */
	public String getArticlesAsJSON(String blogName);

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
	public String getArticlesAsJSON(String blogName, Params option);

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
	public BlogWriteRes writeArticle(String blogName, String title, String content, String tag);

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
	public BlogWriteRes writeArticle(String blogName, String title, String content, String tag, Params option);

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
	public String writeArticleAsXML(String blogName, String title, String content, String tag);

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
	public String writeArticleAsXML(String blogName, String title, String content, String tag, Params option);

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
	public String writeArticleAsJSON(String blogName, String title, String content, String tag);

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
	public String writeArticleAsJSON(String blogName, String title, String content, String tag, Params option);

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
	public BlogModifyRes modifyArticle(String blogName, String postId, String title, String content, String tag);

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
	public BlogModifyRes modifyArticle(String blogName, String postId, String title, String content, String tag, Params option);

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
	public String modifyArticleAsXML(String blogName, String postId, String title, String content, String tag);

	/**
	 * 특정 글을 수정하고 결과를  xml String 형태로 제공합니다.
	 *
	 * @param blogName 블로그 이름
	 * @param postId 글에 대한 id
	 * @param title 제목
	 * @param content 내용
	 * @param tag 태그
	 * @param option 선택 파라미터 객체 	 
	 * 				- viewCategoryId : view를 보낼 경우에 필요. view에 가입된 사용자여야함
	 * @return 수정 결과에 대한 xml String 반환
	 */
	public String modifyArticleAsXML(String blogName, String postId, String title, String content, String tag, Params option);

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
	public String modifyArticleAsJSON(String blogName, String postId, String title, String content, String tag);

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
	public String modifyArticleAsJSON(String blogName, String postId, String title, String content, String tag, Params option);

	/**
	 * 특정 글에 대한 정보를 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param postId
	 *            글 에 대한 id
	 * @return 특정 글의 정보에 대한 객체  or null 반환
	 */
	public BlogArticle getArticle(String blogName, String postId);

	/**
	 * 특정 글에대한 정보를 xml String 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param postId
	 *            글 에 대한 id
	 * @return 특정 글 정보에 대한  xml String 반환
	 */
	public String getArticleAsXML(String blogName, String postId);

	/**
	 * 특정 글에대한 정보를 json String 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param postId
	 *            글에 대한 id
	 * @return 특정 글 정보에 대한  json String 반환
	 */
	public String getArticleAsJSON(String blogName, String postId);

	/**
	 * 카테고리 목록에 관한 정보를 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 카테고리 목록에 대한 객체 or null 반환
	 */
	public BlogCategories getCategories(String blogName);

	/**
	 * 카테고리목록에 관한 정보를  xml String 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 카테고리 목록에 대한 xml String 반환 
	 */
	public String getCategoriesAsXML(String blogName);

	/**
	 * 블로그에 대한 카테고리 목록 정보를 JSON 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 카테고리 목록에 대한 json String 반환 
	 */
	public String getCategoriesAsJSON(String blogName);

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
	public BlogComments getComments(String blogName, String postId);

	/**
	 * 글의 코멘트 정보목록을 xml String 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param postId
	 *            글에 대한 id
	 * @return 특정 글의 코멘트 정보 목록에 대한  xml String 반환 
	 */
	public String getCommentsAsXML(String blogName, String postId);

	/**
	 * 글의 코멘트 정보목록을 json String 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @param postId
	 *            글 에 대한 id
	 * @return 특정 글의 코멘트 정보 목록에 대한  json String 반환 
	 */
	public String getCommentsAsJSON(String blogName, String postId);

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
	public BlogCommentRes writeComment(String blogName, String postId, String content, boolean isSecret);

	/**
	 * 글에 코멘트를 작성하고 그 결과를 xmlString 형테로 반환합니다.
	 *
	 * @param blogName 블로그 이름
	 * @param postId 글에 대한 id
	 * @param content 코멘트 내용
	 * @param isSecret 비밀 여부
	 * @return 코멘트 작성결과에 관한 xmlString 반환
	 */
	public String writeCommentAsXML(String blogName, String postId, String content, boolean isSecret);

	/**
	 * 글에 코멘트 작성하고 그 결과를 json String 형태로 반환합니다.
	 *
	 * @param blogName 블로그 이름
	 * @param postId 글에 대한 id
	 * @param content 코멘트 내용
	 * @param isSecret 비밀 여부
	 * @return 코멘트 작성결과에 관한 jsonString 반환
	 */
	public String writeCommentAsJSON(String blogName, String postId, String content, boolean isSecret);

	/**
	 * 블로그에서 설정된 rss 정보 목록를 객체 형태로 가져옵니다. 
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return rss 정보목록 객체 or null 반환
	 */
	public BlogRSSes getRsses(String blogName);

	/**
	 * 블로그에서 설정된 rss 정보 목록을  xml String 형태로 가져옵니다. 
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return rss 정보목록에 대한  xml String 반환
	 */
	public String getRssesAsXML(String blogName);

	/**
	 * 블로그에서 설정된 rss 정보 목록을 json String 형태로 가져옵니다. 
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return rss 정보목록에 대한  json String 반환
	 */
	public String getRssesAsJSON(String blogName);

	/**
	 * 블로그 정보를 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 블로그 정보 객체 or null 반환
	 */
	public BlogInfo getInfo(String blogName);

	/**
	 * 블로그 정보를 xml 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 블로그 정보 대한 xml String 반환
	 */
	public String getInfoAsXML(String blogName);

	/**
	 * 블로그 정보를 json 형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 블로그 정보 대한 json String 반환
	 */
	public String getInfoAsJSON(String blogName);

	/**
	 * 나의 활동에 대한 모든 정보를 객체 형태로 제공합니다.
	 * 에러 발생시 에는 null을 반환합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 나의 확동정보 객체 of null
	 */
	public BlogActivityReses getActivityRes(String blogName);

	/**
	 * 나의 활동에 대한 모든 정보를 xml String형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 나의 활동정보에 대한 xml String 반환
	 */
	public String getActivityResAsXML(String blogName);

	/**
	 * 나의 활동에 대한 모든 정보를 json String형태로 제공합니다.
	 * 
	 * @param blogName
	 *            블로그 이름
	 * @return 나의 활동정보에 대한 json String 반환
	 */
	public String getActivityResAsJSON(String blogName);

}
