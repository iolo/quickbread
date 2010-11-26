package net.daum.dna.api;

import java.util.List;

import net.daum.dna.api.vo.cafe.CafeBoardArticles;
import net.daum.dna.api.vo.cafe.CafeBoard;
import net.daum.dna.api.vo.cafe.CafeFavor;
import net.daum.dna.api.vo.cafe.CafeRecentArticles;
import net.daum.dna.api.vo.cafe.CafeWriteRes;
import net.daum.dna.api.vo.cafe.CafeAlarmRes;
import net.daum.dna.params.*;

// TODO: Auto-generated Javadoc
/**
 * The Interface CafeAPI.
 */
public interface CafeAPI {

	/**
	 * User의 등업 or 강등 의 정보와 카페 내의 User 의 글에 대한 반응글의 정보를 보여 준다.
	 * 오류 발생시 NULL 반환.
	 * 
	 * @return 알림 정보 객체 또는 null 반환
	 */
	public CafeAlarmRes getAlarmRes();

	/**
	 * User의 등업 or 강등 의 정보와 카페 내의 User 의 글에 대한 반응글의 정보를 보여 준다.
	 * 
	 * @return 알림 정보를 XML String 형태로 반환.
	 */
	public String getAlarmResAsXML();

	/**
	 * User의 등업 or 강등 의 정보와 카페 내의 User 의 글에 대한 반응글의 정보를 보여 준다.
	 * 
	 * @return 알림 정보를 JSON String 형태로 반환.
	 */
	public String getAlarmResAsJSON();

	/**
	 * 카페 내의 특정 게시판의 게시글을 보여준다.
	 * 오류 발생시 NULL 반환.
	 * 
	 * @param cafeCode
	 *            cafeCode
	 * @param boardId
	 *            게시판 id
	 * @return 게시글 목록을 객체 또는 NULL 반환.
	 */
	public CafeBoardArticles getArticles(String cafeCode, String boardId);

	/**
	 * 카페 내의 특정 게시판의 게시글을 보여준다.
	 * 오류 발생시 NULL 반환. 
	 * @param cafeCode
	 *            - Cafe Code
	 * @param boardId
	 *            - 게시판  id
	 * @param option
	 *            - page : 게시글 목록의 페이지 번호 (int)
	 * @return 게시글 목록을 객체 또는 NULL 반환.
	 */
	public CafeBoardArticles getArticles(String cafeCode, String boardId, Params option);

	/**
	 * 카페 내의 특정 게시판의 게시글을 보여준다.
	 * 
	 * @param cafeCode
	 *            - Cafe Code
	 * @param boardId
	 *            - 게시판 id
	 * @return 게시글 목록을 XML String 형태로 반환.
	 */
	public String getArticlesAsXML(String cafeCode, String boardId);

	/**
	 * 카페 내의 특정 게시판의 게시글을 보여준다.
	 * 
	 * @param cafeCode
	 *            the cafe code
	 * @param boardId
	 *            the board id
	 * @param option
	 *            - page : 게시글 목록의 페이지 번호 (int)
	 * @return 게시글 목록을 XML String 형태로 반환.
	 */
	public String getArticlesAsXML(String cafeCode, String boardId, Params option);

	/**
	 * 카페 내의 특정 게시판의 게시글을 보여준다.
	 * 
	 * @param cafeCode
	 *            - Cafe Code
	 * @param boardId
	 *            - 게시판 Code
	 * @return 게시글 목록을 JSON String 형태로 반환.
	 */
	public String getArticlesAsJSON(String cafeCode, String boardId);

	/**
	 * 카페 내의 특정 게시판의 게시글을 보여준다.
	 * 
	 * @param cafeCode
	 *            the cafe code
	 * @param boardId
	 *            the board id
	 * @param option
	 *            - page : 게시글 목록의 페이지 번호 (int)
	 *            
	 * @return 게시글 목록을 JSON String 형태로 반환.
	 */
	public String getArticlesAsJSON(String cafeCode, String boardId, Params option);

	/**
	 * 해당 카페의 게시판 목록을 보여 준다.
	 * 오류 발생시 NULL 반환.
	 * 
	 * @param cafeCode
	 *            - Cafe Code
	 * @return 게시판 목록을 객체 형태 , 또는 NULL 반환
	 */
	public List<CafeBoard> getBoards(String cafeCode);

	/**
	 * 해당 카페의 게시판 목록을 보여 준다.
	 * 오류 발생시 NULL 반환.
	 * 
	 * @param cafeCode
	 *            - Cafe Code
	 * @return 게시판 목록을 XML String 형태로 반환
	 */
	public String getBoardsAsXML(String cafeCode);

	/**
	 * 해당 카페의 게시판 목록을 보여 준다.
	 * 
	 * @param cafeCode
	 *            - Cafe Code
	 * @return 게시판 목록을 JSON String 형태로 반환
	 */
	public String getBoardsAsJSON(String cafeCode);

	/**
	 * User 가 자주 가는 Cafe 의 목록을 보여 준다.
	 * 오류 발생시 NULL 반환.
	 * 
	 * @return Cafe 목록을 객체 형태 또는 null 반환.
	 */
	public List<CafeFavor> getFavoriteCafes();

	/**
	 * User 가 자주 가는 Cafe 의 목록을 보여 준다.
	 * 
	 * @return Cafe 목록을 XML String 형태로 반환.
	 */
	public String getFavoriteCafesAsXML();

	/**
	 * User 가 자주 가는 Cafe 의 목록을 보여 준다.
	 * 
	 * @return Cafe 목록을 JSON String 형태로 반환.
	 */
	public String getFavoriteCafesAsJSON();

	/**
	 * 카페 내의 최신글을 보여준다.
	 * 오류 발생시 null 반환.
	 * 
	 * @param cafeCode
	 *            - Cafe Code
	 * @return 최신글 목록을 객체형태 또는 null 반환.
	 */
	public CafeRecentArticles getRecentArticles(String cafeCode);

	/**
	 * 카페 내의 최신글을 보여준다.
	 * 오류 발생시 NULL 반환.
	 * 
	 * @param cafeCode
	 *            the cafe code
	 * @param option
	 *            - page : 게시글 목록의 페이지 번호 (int)
	 * @return 최신글 목록을 객체형태 또는 null 반환.
	 */
	public CafeRecentArticles getRecentArticles(String cafeCode, Params option);

	/**
	 * 카페 내의 최신글을 보여준다.
	 * 
	 * 
	 * @param cafeCode
	 *            - Cafe Code
	 * @return 최신글 목록을 XML String 형태로 반환.
	 */

	public String getRecentArticlesAsXML(String cafeCode);

	/**
	 * 카페 내의 최신글을 보여준다.
	 * 
	 * @param cafeCode
	 *            the cafe code
	 * @param option
	 *            - page : 게시글 목록의 페이지 번호 (int)
	 * @return 최신글 목록을 XML String 형태로 반환.
	 */
	public String getRecentArticlesAsXML(String cafeCode, Params option);

	/**
	 * 카페 내의 최신글을 보여준다.
	 * 
	 * @param cafeCode
	 *            - Cafe Code
	 * @return 최신글 목록을 JSON String 형태로 반환.
	 */
	public String getRecentArticlesAsJSON(String cafeCode);

	/**
	 * 카페 내의 최신글을 보여준다.
	 * 
	 * @param cafeCode
	 *            the cafe code
	 * @param option
	 *            - page : 게시글 목록의 페이지 번호 (int)
	 * @return 최신글 목록을 JSON String 형태로 반환.
	 */
	public String getRecentArticlesAsJSON(String cafeCode, Params option);

	/**
	 * 카페에 게시글을 작성 한다.
	 * 오류 발생시 null 반환.
	 * @param cafeCode
	 *            - Cafe Code
	 * @param boardId
	 *            - 게시판의 ID
	 * @return 게시글 작성 결과를 객체 형태 또는 null 반환.
	 */
	public CafeWriteRes writeArticle(String cafeCode, String boardId , String content);

	/**
	 * 카페에 게시글을 작성 한다.
	 * 오류 발생시 NULL 반환.
	 * 
	 * @param cafeCode
	 *            the cafe code
	 * @param boardId
	 *            the board id
	 * @param option
	 *            - content : 게시글에 작성할 내용 (string)
	 *            - hideyn : 비밀글 작성 여부 (Char) 비밀글 : Y , default : N
	 *            
	 * @return 게시글 작성 결과를 객체 형태 또는 null 반환.
	 */
	public CafeWriteRes writeArticle(String cafeCode, String boardId, String content , Params option);

	/**
	 * 카페에 게시글을 작성 한다.
	 * 오류 발생시 NULL 반환.
	 * 
	 * @param cafeCode
	 *            - Cafe Code
	 * @param boardId
	 *            - 게시판의 ID
	 * @return 게시글 작성 결과를 XML String 형태로 반환.
	 */
	public String writeArticleAsXML(String cafeCode, String boardId , String content);

	/**
	 * 카페에 게시글을 작성 한다.
	 * 
	 * @param cafeCode
	 *            the cafe code
	 * @param boardId
	 *            the board id
	 * @param option
	 *            - content : 게시글에 작성할 내용 (string)
	 *            - hideyn : 비밀글 작성 여부 (Char) 비밀글 : Y , default : N
	 *            
	 * @return 게시글 작성 결과를 XML String 형태로 반환.
	 */
	public String writeArticleAsXML(String cafeCode, String boardId, String content, Params option);

	/**
	 * 카페에 게시글을 작성 한다.
	 * 
	 * @param cafeCode
	 *            - Cafe Code
	 * @param boardId
	 *            - 게시판의 ID
	 * @return 게시글 작성 결과를 JSON String 형태로 반환.
	 */
	public String writeArticleAsJSON(String cafeCode, String boardId , String content);

	/**
	 * 카페에 게시글을 작성 한다.
	 * 
	 * @param cafeCode
	 *            the cafe code
	 * @param boardId
	 *            the board id
	 * @param option
	 *            - content : 게시글에 작성할 내용 (string)
	 *            - hideyn : 비밀글 작성 여부 (Char) 비밀글 : Y , default : N
	 *            
	 * @return 게시글 작성 결과를 JSON String 형태로 반환.
	 */
	public String writeArticleAsJSON(String cafeCode, String boardId, String content , Params option);

}
