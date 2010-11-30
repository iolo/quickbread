package net.daum.dna.api.service;

import java.util.List;

import net.daum.dna.api.dao.CafeDAO;
import net.daum.dna.api.vo.cafe.CafeAlarmRes;
import net.daum.dna.api.vo.cafe.CafeBoard;
import net.daum.dna.api.vo.cafe.CafeBoardArticles;
import net.daum.dna.api.vo.cafe.CafeFavor;
import net.daum.dna.api.vo.cafe.CafeRecentArticles;
import net.daum.dna.api.vo.cafe.CafeWriteRes;
import net.daum.dna.oauth.DaumOAuth;
import net.daum.dna.params.Params;
import net.daum.dna.util.APIUtils;

// TODO: Auto-generated Javadoc
/**
 * The Class CafeService.
 */
public class CafeService {

	/** The cafe dao. */
	private CafeDAO cafeDAO;

	/**
	 * Instantiates a new cafe service.
	 * 
	 * @param oauth
	 *            the oauth
	 */
	public CafeService(DaumOAuth oauth) {
		cafeDAO = new CafeDAO(oauth);

	}

	/**
	 * Gets the oauth.
	 * 
	 * @return the oauth
	 */
	public DaumOAuth getOauth() {
		return cafeDAO.getOauth();
	}

	/**
	 * Sets the oauth.
	 * 
	 * @param oauth
	 *            the new oauth
	 */
	public void setOauth(DaumOAuth oauth) {
		cafeDAO.setOauth(oauth);
	}

	/**
	 * GetAlarmRes 함수 QueryStringBuilder.
	 *
	 * @return the alarm res
	 */
	public CafeAlarmRes getAlarmRes() {
		StringBuffer queryString = new StringBuffer();

		queryString.append(APIUtils._XML);
		return cafeDAO.getAlarmRes(queryString.toString());
	}

	/**
	 * GetAlarmRes 함수 QueryStringBuilder.
	 *
	 * @return the alarm res as xml
	 */
	public String getAlarmResAsXML() {
		StringBuffer queryString = new StringBuffer();

		queryString.append(APIUtils._XML);

		return cafeDAO.getAlarmResAsXML(queryString.toString());
	}

	/**
	 * GetAlarmRes 함수 QueryStringBuilder.
	 *
	 * @return the alarm res as json
	 */
	public String getAlarmResAsJSON() {
		StringBuffer queryString = new StringBuffer();

		queryString.append(APIUtils._XML);
		return cafeDAO.getAlarmResAsJSON(queryString.toString());
	}

	/**
	 * GetArticles 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @return the articles
	 */
	public CafeBoardArticles getArticles(Params required) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append("/");
		queryString.append(required.getOption("boardId"));
		queryString.append(".");
		queryString.append(APIUtils._XML);

		return cafeDAO.getArticles(queryString.toString());
	}

	/**
	 * GetArticles 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @param option the option
	 * @return the articles
	 */
	public CafeBoardArticles getArticles(Params required, Params option) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append("/");
		queryString.append(required.getOption("boardId"));
		queryString.append(".");
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(option));

		return cafeDAO.getArticles(queryString.toString());
	}

	/**
	 * GetArticles 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @return the articles as xml
	 */
	public String getArticlesAsXML(Params required) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append("/");
		queryString.append(required.getOption("boardId"));
		queryString.append(".");
		queryString.append(APIUtils._XML);
		return cafeDAO.getArticlesAsXML(queryString.toString());
	}

	/**
	 * GetArticles 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @param option the option
	 * @return the articles as xml
	 */
	public String getArticlesAsXML(Params required, Params option) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append("/");
		queryString.append(required.getOption("boardId"));
		queryString.append(".");
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(option));

		return cafeDAO.getArticlesAsXML(queryString.toString());
	}

	/**
	 * GetArticles 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @return the articles as json
	 */
	public String getArticlesAsJSON(Params required) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append("/");
		queryString.append(required.getOption("boardId"));
		queryString.append(".");
		queryString.append(APIUtils._XML);

		return cafeDAO.getArticlesAsJSON(queryString.toString());
	}

	/**
	 * GetArticles 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @param option the option
	 * @return the articles as json
	 */
	public String getArticlesAsJSON(Params required, Params option) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append("/");
		queryString.append(required.getOption("boardId"));
		queryString.append(".");
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(option));

		return cafeDAO.getArticlesAsJSON(queryString.toString());
	}

	/**
	 * GetBoards 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @return the boards
	 */
	public List<CafeBoard> getBoards(Params required) {

		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append(".");
		queryString.append(APIUtils._XML);

		return cafeDAO.getBoards(queryString.toString());
	}

	/**
	 * GetBoards 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @return the boards as xml
	 */
	public String getBoardsAsXML(Params required) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append(".");
		queryString.append(APIUtils._XML);

		return cafeDAO.getBoardsAsXML(queryString.toString());
	}

	/**
	 * GetBoards 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @return the boards as json
	 */
	public String getBoardsAsJSON(Params required) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append(".");
		queryString.append(APIUtils._XML);

		return cafeDAO.getBoardsAsJSON(queryString.toString());
	}

	/**
	 * GetBoards 함수 QueryStringBuilder.
	 *
	 * @return the favorite cafes
	 */
	public List<CafeFavor> getFavoriteCafes() {

		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);

		return cafeDAO.getFavoriteCafes(queryString.toString());
	}

	/**
	 * GetBoards 함수 QueryStringBuilder.
	 *
	 * @return the favorite cafes as xml
	 */
	public String getFavoriteCafesAsXML() {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);

		return cafeDAO.getFavoriteCafesAsXML(queryString.toString());
	}

	/**
	 * GetBoards 함수 QueryStringBuilder.
	 *
	 * @return the favorite cafes as json
	 */
	public String getFavoriteCafesAsJSON() {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);

		return cafeDAO.getFavoriteCafesAsJSON(queryString.toString());
	}

	/**
	 * GetBoards 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @return the recent articles
	 */
	public CafeRecentArticles getRecentArticles(Params required) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append(".");
		queryString.append(APIUtils._XML);

		return cafeDAO.getRecentArticles(queryString.toString());
	}

	/**
	 * GetRecentArticles 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @param option the option
	 * @return the recent articles
	 */
	public CafeRecentArticles getRecentArticles(Params required, Params option) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append(".");
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(option));

		return cafeDAO.getRecentArticles(queryString.toString());
	}

	/**
	 * GetRecentArticles 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @return the recent articles as xml
	 */
	public String getRecentArticlesAsXML(Params required) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append(".");
		queryString.append(APIUtils._XML);

		return cafeDAO.getRecentArticlesAsXML(queryString.toString());
	}

	/**
	 * GetRecentArticles 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @param option the option
	 * @return the recent articles as xml
	 */
	public String getRecentArticlesAsXML(Params required, Params option) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append(".");
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(option));

		return cafeDAO.getRecentArticlesAsXML(queryString.toString());
	}

	/**
	 * GetRecentArticles 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @return the recent articles as json
	 */
	public String getRecentArticlesAsJSON(Params required) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append(".");
		queryString.append(APIUtils._XML);

		return cafeDAO.getRecentArticlesAsJSON(queryString.toString());
	}

	/**
	 * GetRecentArticles 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @param option the option
	 * @return the recent articles as json
	 */
	public String getRecentArticlesAsJSON(Params required, Params option) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append(".");
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(option));

		return cafeDAO.getRecentArticlesAsJSON(queryString.toString());
	}

	/**
	 * WriteArticle 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @return the cafe write res
	 */
	public CafeWriteRes writeArticle(Params required) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append("/");
		queryString.append(required.getOption("boardId"));
		queryString.append(".");
		queryString.append(APIUtils._XML);
		
		Params content = new Params();
		content.setOption("content", required.getOption("content"));
		queryString.append(APIUtils.getInstance().buildQueryString(content));

		return cafeDAO.writeArticle(queryString.toString());
	}

	/**
	 * WriteArticle 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @param option the option
	 * @return the cafe write res
	 */
	public CafeWriteRes writeArticle(Params required, Params option) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append("/");
		queryString.append(required.getOption("boardId"));
		queryString.append(".");
		queryString.append(APIUtils._XML);
		
		Params content = new Params();
		content.setOption("content", required.getOption("content"));
		queryString.append(APIUtils.getInstance().buildQueryString(content , option));

		return cafeDAO.writeArticle(queryString.toString());
	}

	/**
	 * WriteArticle 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @return the string
	 */
	public String writeArticleAsXML(Params required) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append("/");
		queryString.append(required.getOption("boardId"));
		queryString.append(".");
		queryString.append(APIUtils._XML);
		
		Params content = new Params();
		content.setOption("content", required.getOption("content"));
		queryString.append(APIUtils.getInstance().buildQueryString(content));

		return cafeDAO.writeArticleAsXML(queryString.toString());
	}

	/**
	 * WriteArticle 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @param option the option
	 * @return the string
	 */
	public String writeArticleAsXML(Params required, Params option) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append("/");
		queryString.append(required.getOption("boardId"));
		queryString.append(".");
		queryString.append(APIUtils._XML);
		
		Params content = new Params();
		content.setOption("content", required.getOption("content"));
		queryString.append(APIUtils.getInstance().buildQueryString(content , option));

		return cafeDAO.writeArticleAsXML(queryString.toString());
	}

	/**
	 * WriteArticle 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @return the string
	 */
	public String writeArticleAsJSON(Params required) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append("/");
		queryString.append(required.getOption("boardId"));
		queryString.append(".");
		queryString.append(APIUtils._XML);
		
		Params content = new Params();
		content.setOption("content", required.getOption("content"));
		queryString.append(APIUtils.getInstance().buildQueryString(content));

		return cafeDAO.writeArticleAsJSON(queryString.toString());
	}

	/**
	 * WriteArticle 함수 QueryStringBuilder.
	 *
	 * @param required the required
	 * @param option the option
	 * @return the string
	 */
	public String writeArticleAsJSON(Params required, Params option) {
		StringBuffer queryString = new StringBuffer();

		queryString.append(required.getOption("cafeCode"));
		queryString.append("/");
		queryString.append(required.getOption("boardId"));
		queryString.append(".");
		queryString.append(APIUtils._XML);
		
		Params content = new Params();
		content.setOption("content", required.getOption("content"));
		queryString.append(APIUtils.getInstance().buildQueryString(content , option));

		return cafeDAO.writeArticleAsJSON(queryString.toString());
	}

}
