package net.daum.dna.api.basic;

import java.util.List;

import net.daum.dna.api.CafeAPI;
import net.daum.dna.api.service.CafeService;
import net.daum.dna.api.vo.cafe.CafeAlarmRes;
import net.daum.dna.api.vo.cafe.CafeBoard;
import net.daum.dna.api.vo.cafe.CafeBoardArticles;
import net.daum.dna.api.vo.cafe.CafeFavor;
import net.daum.dna.api.vo.cafe.CafeRecentArticles;
import net.daum.dna.api.vo.cafe.CafeWriteRes;
import net.daum.dna.oauth.DaumOAuth;
import net.daum.dna.params.Params;

// TODO: Auto-generated Javadoc
/**
 * The Class DefaultCafeAPI.
 */
public class DefaultCafeAPI implements CafeAPI {

	/** The service. */
	private CafeService service;

	/**
	 * Instantiates a new default cafe api.
	 * 
	 * @param oauth
	 *            the oauth
	 */
	public DefaultCafeAPI(DaumOAuth oauth) {
		service = new CafeService(oauth);
	}

	/**
	 * Gets the oauth.
	 * 
	 * @return the oauth
	 */
	public DaumOAuth getOauth() {
		return service.getOauth();
	}

	/**
	 * Sets the oauth.
	 * 
	 * @param oauth
	 *            the new oauth
	 */
	public void setOauth(DaumOAuth oauth) {
		service.setOauth(oauth);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getAlarmRes()
	 */
	public CafeAlarmRes getAlarmRes() {

		return service.getAlarmRes();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getAlarmResAsXML()
	 */
	public String getAlarmResAsXML() {
		return service.getAlarmResAsXML();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getAlarmResAsJSON()
	 */
	public String getAlarmResAsJSON() {
		return service.getAlarmResAsJSON();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getArticles(java.lang.String,
	 * java.lang.String)
	 */
	public CafeBoardArticles getArticles(String cafeCode, String boardId) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);
		required.setOption("boardId", boardId);

		return service.getArticles(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getArticles(java.lang.String,
	 * java.lang.String, net.daum.dna.params.Params)
	 */
	@Override
	public CafeBoardArticles getArticles(String cafeCode, String boardId, Params option) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);
		required.setOption("boardId", boardId);

		return service.getArticles(required, option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getArticlesAsXML(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public String getArticlesAsXML(String cafeCode, String boardId) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);
		required.setOption("boardId", boardId);

		return service.getArticlesAsXML(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getArticlesAsXML(java.lang.String,
	 * java.lang.String, net.daum.dna.params.Params)
	 */
	@Override
	public String getArticlesAsXML(String cafeCode, String boardId, Params option) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);
		required.setOption("boardId", boardId);

		return service.getArticlesAsXML(required, option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getArticlesAsJSON(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public String getArticlesAsJSON(String cafeCode, String boardId) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);
		required.setOption("boardId", boardId);

		return service.getArticlesAsJSON(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getArticlesAsJSON(java.lang.String,
	 * java.lang.String, net.daum.dna.params.Params)
	 */
	@Override
	public String getArticlesAsJSON(String cafeCode, String boardId, Params option) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);
		required.setOption("boardId", boardId);

		return service.getArticlesAsJSON(required, option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getBoards(java.lang.String)
	 */
	@Override
	public List<CafeBoard> getBoards(String cafeCode) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);

		return service.getBoards(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getBoardsAsXML(java.lang.String)
	 */
	@Override
	public String getBoardsAsXML(String cafeCode) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);

		return service.getBoardsAsXML(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getBoardsAsJSON(java.lang.String)
	 */
	@Override
	public String getBoardsAsJSON(String cafeCode) {

		Params required = new Params();
		required.setOption("cafeCode", cafeCode);

		return service.getBoardsAsJSON(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getFavoriteCafes()
	 */
	@Override
	public List<CafeFavor> getFavoriteCafes() {
		return service.getFavoriteCafes();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getFavoriteCafesAsXML()
	 */
	@Override
	public String getFavoriteCafesAsXML() {
		return service.getFavoriteCafesAsXML();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getFavoriteCafesAsJSON()
	 */
	@Override
	public String getFavoriteCafesAsJSON() {
		return service.getFavoriteCafesAsJSON();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getRecentArticles(java.lang.String)
	 */
	@Override
	public CafeRecentArticles getRecentArticles(String cafeCode) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);

		return service.getRecentArticles(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getRecentArticles(java.lang.String,
	 * net.daum.dna.params.Params)
	 */
	@Override
	public CafeRecentArticles getRecentArticles(String cafeCode, Params option) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);

		return service.getRecentArticles(required, option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getRecentArticlesAsXML(java.lang.String)
	 */
	@Override
	public String getRecentArticlesAsXML(String cafeCode) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);

		return service.getRecentArticlesAsXML(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getRecentArticlesAsXML(java.lang.String,
	 * net.daum.dna.params.Params)
	 */
	@Override
	public String getRecentArticlesAsXML(String cafeCode, Params option) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);

		return service.getRecentArticlesAsXML(required, option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getRecentArticlesAsJSON(java.lang.String)
	 */
	@Override
	public String getRecentArticlesAsJSON(String cafeCode) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);

		return service.getRecentArticlesAsJSON(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#getRecentArticlesAsJSON(java.lang.String,
	 * net.daum.dna.params.Params)
	 */
	@Override
	public String getRecentArticlesAsJSON(String cafeCode, Params option) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);

		return service.getRecentArticlesAsJSON(required, option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#writeArticle(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public CafeWriteRes writeArticle(String cafeCode, String boardId , String content) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);
		required.setOption("boardId", boardId);
		required.setOption("content", content);

		return service.writeArticle(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#writeArticle(java.lang.String,
	 * java.lang.String, net.daum.dna.params.Params)
	 */
	@Override
	public CafeWriteRes writeArticle(String cafeCode, String boardId, String content ,Params option) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);
		required.setOption("boardId", boardId);
		required.setOption("content", content);

		return service.writeArticle(required, option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#writeArticleAsXML(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public String writeArticleAsXML(String cafeCode, String boardId , String content) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);
		required.setOption("boardId", boardId);
		required.setOption("content", content);
		
		return service.writeArticleAsXML(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#writeArticleAsXML(java.lang.String,
	 * java.lang.String, net.daum.dna.params.Params)
	 */
	@Override
	public String writeArticleAsXML(String cafeCode, String boardId, String content , Params option) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);
		required.setOption("boardId", boardId);
		required.setOption("content", content);
		
		return service.writeArticleAsXML(required, option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#writeArticleAsJSON(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public String writeArticleAsJSON(String cafeCode, String boardId , String content) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);
		required.setOption("boardId", boardId);
		required.setOption("content", content);
		
		return service.writeArticleAsJSON(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.CafeAPI#writeArticleAsJSON(java.lang.String,
	 * java.lang.String, net.daum.dna.params.Params)
	 */
	@Override
	public String writeArticleAsJSON(String cafeCode, String boardId, String content , Params option) {
		Params required = new Params();
		required.setOption("cafeCode", cafeCode);
		required.setOption("boardId", boardId);
		required.setOption("content", content);
		
		return service.writeArticleAsJSON(required, option);
	}

}
