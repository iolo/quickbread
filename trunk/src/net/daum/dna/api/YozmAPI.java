package net.daum.dna.api;

import java.util.List;

import net.daum.dna.api.vo.yozm.*;
import net.daum.dna.params.Params;

// TODO: Auto-generated Javadoc
/**
 * The Interface YozmAPI. writeArticle method option 종류 : - message : 보낼 Message
 * - url_shorten : Message 에 포함된 URL 을 줄일 수 있다. - img_url : 첨부할 이미지의 URL -
 * parent_msg_id : 반응글로 작성시 원본글의 Message ID
 * 
 * getUserInfo method option 종류 : - url_name : 인기 리스트를 보고 싶은 사용자의 ID (Oauth 인증
 * 실패시 url_name 으로 수행) - nick_name : 인기 리스트를 보고 싶은 사용자의 별명 ( url_name 으로 수행 실패시
 * nick_name 으로 수행).
 * 
 */
public interface YozmAPI {

	/**
	 * 현재 oauth 인증된 사용자의 Yozm 가입 여부를 return 한다
	 * 오류 발생시 NULL 반환.
	 * 
	 * @return 가입여부를 객체 형태 또는 NULL 반환.
	 */
	public YozmUserJoined checkUserJoin();

	/**
	 * 현재 oauth 인증된 사용자의 Yozm 가입 여부를 return 한다
	 * 
	 * @return 가입여부를 XML String 형태로 반환.
	 */
	public String checkUserJoinAsXML();

	/**
	 * 현재 oauth 인증된 사용자의 Yozm 가입 여부를 return 한다
	 * 
	 * @return 가입여부를 JSON String 형태로 반환.
	 */
	public String checkUserJoinAsJSON();

	/**
	 * Yozm 에 가입하는 기능을 제공한다.
	 * 오류 발생시 null 반환.
	 * 
	 * @param nickname
	 *            Yozm 에서 사용할 닉네임
	 * @return 가입 결과를 객체 형태 또는 null 로 반환.
	 */
	public YozmUserJoin joinYozm(String nickname);

	/**
	 * Yozm 에 가입하는 기능을 제공한다.
	 * 오류 발생시 null 반환.
	 * 
	 * @param nickname
	 *            Yozm 에서 사용할 닉네임
	 * @param option
	 *            - sex : 성별 ( N : 비공개 , F : 여자 , M : 남자);
	 *            - birthday : 생일 (string ,  YYYY-MM-DD)
	 *            - blood_type : 혈액형 (N : 비공개 , A , B , AB ,O );
	 *            
	 * @return 가입 결과를 객체 형태 또는 NULL 로 반환.
	 */
	public YozmUserJoin joinYozm(String nickname, Params option);

	/**
	 * Yozm 에 가입하는 기능을 제공한다.
	 * 
	 * @param nickname
	 *            Yozm 에서 사용할 닉네임
	 *            
	 * @return 가입 결과를 XML String 형태로 반환.
	 */
	public String joinYozmAsXML(String nickname);

	/**
	 * Yozm 에 가입하는 기능을 제공한다.
	 * 
	 * @param nickname
	 *            Yozm 에서 사용할 닉네임
	 * @param option
	 * 			  - sex : 성별 ( N : 비공개 , F : 여자 , M : 남자);
	 *            - birthday : 생일 (string ,  YYYY-MM-DD)
	 *            - blood_type : 혈액형 (N : 비공개 , A , B , AB ,O );
	 *            
	 * @return 가입 결과를 XML String 형태로 반환.
	 */
	public String joinYozmAsXML(String nickname, Params option);

	/**
	 * Yozm 에 가입하는 기능을 제공한다.
	 * 
	 * @param nickname
	 *            Yozm 에서 사용할 닉네임
	 * @return 가입 결과를 JSON String 형태로 반환.
	 */
	public String joinYozmAsJSON(String nickname);

	/**
	 * Yozm 에 가입하는 기능을 제공한다.
	 * 
	 * @param nickname
	 *            Yozm 에서 사용할 닉네임
	 * @param option
	 *            - sex : 성별 ( N : 비공개 , F : 여자 , M : 남자);
	 *            - birthday : 생일 (string ,  YYYY-MM-DD)
	 *            - blood_type : 혈액형 (N : 비공개 , A , B , AB ,O );
	 *            
	 * @return 가입 결과를 JSON String 형태로 반환.
	 */
	public String joinYozmAsJSON(String nickname, Params option);

	/**
	 * 글을 검색하는 기능
	 * 오류 발생시 null 반환.
	 * @param q
	 *            검색어
	 *            
	 * @return 결과 글 목록을 객체 형태 또는 null 반환.
	 */
	public YozmArticles searchArticles(String q);

	/**
	 * 글을 검색하는 기능
	 * 
	 * @param q
	 *            검색어
	 * @param option
	 *            - type : 검색 종류 (message or tag)
	 *            - page : 페이지 (int)
	 *            - count : 페이지 크기 (1~30)
	 *            
	 * @return 결과 글 목록을 객체 형태 또는 null 반환.
	 */
	public YozmArticles searchArticles(String q, Params option);

	/**
	 * 글을 검색하는 기능
	 * 
	 * @param q
	 *            검색어
	 * @return 결과 글 목록을 XML String 형태로 반환.
	 */
	public String searchArticlesAsXML(String q);

	/**
	 * 글을 검색하는 기능
	 * 
	 * @param q
	 *            검색어
	 * @param option
	 *            - type : 검색 종류 (message or tag)
	 *            - page : 페이지 (int)
	 *            - count : 페이지 크기 (1~30)
	 *            
	 * @return 결과 글 목록을 XML String 형태로 반환.
	 */
	public String searchArticlesAsXML(String q, Params option);

	/**
	 * 글을 검색하는 기능
	 * 
	 * @param q
	 *            검색어
	 * @return 결과 글 목록을 JSON String 형태로 반환.
	 */
	public String searchArticlesAsJSON(String q);

	/**
	 * 글을 검색하는 기능
	 * 
	 * @param q
	 *            검색어
	 * @param option
	 *            - type : 검색 종류 (message or tag)
	 *            - page : 페이지 (int)
	 *            - count : 페이지 크기 (1~30)
	 * @return 결과 글 목록을 JSON String 형태로 반환.
	 */
	public String searchArticlesAsJSON(String q, Params option);

	/**
	 * Yozm 에 자신의 글을 등록 한다.
	 * 오류 발생시 null 반환.
	 * 
	 * @param message
	 *            보낼 Message
	 *            
	 * @return 등록된 글 정보를 객체 형태 또는 null 반환.
	 */
	public YozmWriteRes writeArticle(String message);

	/**
	 * Yozm 에 자신의 글을 등록 한다.
	 * 오류 발생시 null 반환.
	 * 
	 * @param message
	 *            보낼 Message
	 * @param option
	 *            - url_shorten : url_shorten 서비스를 이용해 url 을 줄임 (String)
	 *            - img_url : 첨부할 이미지 주소 (String)
	 *            - parent_msg_id : reply 로 달리게 될 글의 msg id (int)
	 * @return 등록된 글 정보를 객체 형태 또는 null 반환.
	 */
	public YozmWriteRes writeArticle(String message, Params option);

	/**
	 * Yozm 에 자신의 글을 등록 한다.
	 * 
	 * @param message
	 *            보낼 Message
	 * @return 등록된 글 정보를 XML String 형태로 반환.
	 */
	public String writeArticleAsXML(String message);

	/**
	 * Yozm 에 자신의 글을 등록 한다.
	 * 
	 * @param message
	 *            보낼 Message
	 * @param option
	 *            - url_shorten : url_shorten 서비스를 이용해 url 을 줄임 (String)
	 *            - img_url : 첨부할 이미지 주소 (String)
	 *            - parent_msg_id : reply 로 달리게 될 글의 msg id (int)
	 *            
	 * @return 등록된 글 정보를 XML String 형태로 반환.
	 */
	public String writeArticleAsXML(String message, Params option);

	/**
	 * Yozm 에 자신의 글을 등록 한다.
	 * 
	 * @param message
	 *            보낼 Message
	 * @return 등록된 글 정보를 JSON String 형태로 반환.
	 */
	public String writeArticleAsJSON(String message);

	/**
	 * Yozm 에 자신의 글을 등록 한다.
	 * 
	 * @param message
	 *            보낼 Message
	 * @param option
	 *            - url_shorten : url_shorten 서비스를 이용해 url 을 줄임 (String)
	 *            - img_url : 첨부할 이미지 주소 (String)
	 *            - parent_msg_id : reply 로 달리게 될 글의 msg id (int)
	 *            
	 * @return 등록된 글 정보를 JSON String 형태로 반환.
	 */
	public String writeArticleAsJSON(String message, Params option);

	/**
	 * 모든 글 List 를 가지고 온다.
	 * 오류 발생시 null 반환.
	 * 
	 * @return 글 목록을 객체 형태 또는 NULL 반환.
	 */
	public YozmArticles getArticles();
	
	/**
	 * 모든 글 List 를 가지고 온다.
	 * 오류 발생시 NULL 반환.
	 * 
	 * @param option
	 *            - max_msg_id : 주어진 id 보다 작은 message를 가져온다. (int)
	 *            - since_msg_id : 주어진 id 보다 큰 message 를 가져온다. (int)
	 *            - count : 가져올 message의 수 (int)
	 *            
	 * @return 글 목록을 객체 형태 또는 NULL 반환.
	 */
	public YozmArticles getArticles(Params option);
	
	/**
	 * 모든 글 List 를 가지고 온다.
	 * 
	 * @return 글목록을 XML String 형태로 반환.
	 */
	public String getArticlesAsXML();

	/**
	 * 모든 글 List 를 가지고 온다.
	 * 
	 * @param option
	 *            - max_msg_id : 주어진 id 보다 작은 message를 가져온다. (int)
	 *            - since_msg_id : 주어진 id 보다 큰 message 를 가져온다. (int)
	 *            - count : 가져올 message의 수 (int)
	 *            
	 * @return 글 목록을 XML String 형태로 반환.
	 */
	public String getArticlesAsXML(Params option);

	/**
	 * 모든 글 List 를 가지고 온다.
	 * 
	 * @return 글 목록을 JSON String 형태로 반환.
	 */
	public String getArticlesAsJSON();

	/**
	 * 모든 글 List 를 가지고 온다.
	 * 
	 * @param option
	 *            - max_msg_id : 주어진 id 보다 작은 message를 가져온다. (int)
	 *            - since_msg_id : 주어진 id 보다 큰 message 를 가져온다. (int)
	 *            - count : 가져올 message의 수 (int)
	 * @return 글 목록을 JSON String 형태로 반환.
	 */
	public String getArticlesAsJSON(Params option);

	/**
	 * 사용자의 정보를 보여주는 Method option 없을 시에는 자기 자신의 정보를 보여준다.
	 * 오류 발생시 null 반환.
	 * 
	 * @return 사용자 정보를 객체 형태 또는 null 반환.
	 */
	public YozmUserInfo getUserInfo();

	/**
	 * 사용자의 정보를 보여주는 Method option 없을 시에는 자기 자신의 정보를 보여준다.
	 * 오류 발생 시 null 반환.
	 * 
	 * @param option
	 *            - url_name : 인기 리스트를 보고 싶은 사용자의 id ( string)
	 *            - nick_name : 인기 리스트를 보고 싶은 사용자의 요즘 nickName (string)
	 *            
	 * @return 사용자 정보를 객체 형태 또는 null 반환.
	 */
	public YozmUserInfo getUserInfo(Params option);

	/**
	 * 사용자의 정보를 보여주는 Method option 없을 시에는 자기 자신의 정보를 보여준다.
	 * 
	 * @return 사용자 정보를 XML String 형태로 반환.
	 */
	public String getUserInfoAsXML();

	/**
	 * 사용자의 정보를 보여주는 Method option 없을 시에는 자기 자신의 정보를 보여준다.
	 * 
	 * @param option
	 *            - url_name : 인기 리스트를 보고 싶은 사용자의 id ( string)
	 *            - nick_name : 인기 리스트를 보고 싶은 사용자의 요즘 nickName (string)
	 *            
	 * @return 사용자 정보를 XML String 형태로 반환.
	 */
	public String getUserInfoAsXML(Params option);

	/**
	 * 사용자의 정보를 보여주는 Method option 없을 시에는 자기 자신의 정보를 보여준다.
	 * 
	 * @return 사용자 정보를 JSON String 형태로 반환.
	 */
	public String getUserInfoAsJSON();

	/**
	 * 사용자의 정보를 보여주는 Method option 없을 시에는 자기 자신의 정보를 보여준다.
	 * 
	 * @param option
	 *            - url_name : 인기 리스트를 보고 싶은 사용자의 id ( string)
	 *            - nick_name : 인기 리스트를 보고 싶은 사용자의 요즘 nickName (string)
	 *            
	 * @return 사용자 정보를 JSON String 형태로 반환.
	 */
	public String getUserInfoAsJSON(Params option);

	/**
	 * 특정 사용자의 글 목록을 가져온다.
	 * 오류 발생시 null 반환.
	 * 
	 * @return 글 목록을 객체 형태 또는 null 반환.
	 */
	public YozmUserArticlesSet getUserArticles();

	/**
	 * 특정 사용자의 글 목록을 가져온다.
	 * 오류 발생시 null 반환.
	 * 
	 * @param option
	 *            - url_name : DaumID (String)
	 *            - next : 주어진 id 보다 최신의 message 반환 (int)
	 *            - count : 가져올 message 의 수 (int)
	 *            
	 * @return 글 목록을 객체 형태 또는 null 반환.
	 */
	public YozmUserArticlesSet getUserArticles(Params option);

	/**
	 * 특정 사용자의 글 목록을 가져온다.
	 * 
	 * @return 글 목록을 XML String 형태로 반환.
	 */
	public String getUserArticlesAsXML();

	/**
	 * 특정 사용자의 글 목록을 가져온다.
	 * 
	 * @param option
	 *            - url_name : DaumID (String)
	 *            - next : 주어진 id 보다 최신의 message 반환 (int)
	 *            - count : 가져올 message 의 수 (int)
	 *            
	 * @return 글 목록을 XML String 형태로 반환.
	 */
	public String getUserArticlesAsXML(Params option);

	/**
	 * 특정 사용자의 글 목록을 가져온다.
	 * 
	 * @return 글 목록을 JSON String 형태로 반환.
	 */
	public String getUserArticlesAsJSON();

	/**
	 * 특정 사용자의 글 목록을 가져온다.
	 * 
	 * @param option
	 *            - url_name : DaumID (String)
	 *            - next : 주어진 id 보다 최신의 message 반환 (int)
	 *            - count : 가져올 message 의 수 (int)
	 *            
	 * @return 글 목록을 JSON String 형태로 반환.
	 */
	public String getUserArticlesAsJSON(Params option);


}
