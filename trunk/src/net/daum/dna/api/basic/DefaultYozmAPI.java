package net.daum.dna.api.basic;

import java.util.List;

import net.daum.dna.api.YozmAPI;
import net.daum.dna.api.service.YozmService;
import net.daum.dna.api.vo.yozm.*;
import net.daum.dna.oauth.DaumOAuth;
import net.daum.dna.params.Params;

// TODO: Auto-generated Javadoc
/**
 * The Class DefaultYozmAPI.
 */
public class DefaultYozmAPI implements YozmAPI {

	/** The service. */
	private YozmService service;

	/**
	 * Instantiates a new default yozm api.
	 * 
	 * @param oauth
	 *            the oauth
	 */
	public DefaultYozmAPI(DaumOAuth oauth) {
		service = new YozmService(oauth);

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
	 * @see net.daum.dna.api.YozmAPI#checkUserJoin()
	 */
	@Override
	public YozmUserJoined checkUserJoin() {
		return service.checkUserJoin();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#checkUserJoinAsXML()
	 */
	@Override
	public String checkUserJoinAsXML() {
		return service.checkUserJoinAsXML();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#checkUserJoinAsJSON()
	 */
	@Override
	public String checkUserJoinAsJSON() {
		return service.checkUserJoinAsJSON();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#JoinYozm(java.lang.String)
	 */
	@Override
	public YozmUserJoin joinYozm(String nickname) {
		Params required = new Params();
		required.setOption("nickname", nickname);
		return service.JoinYozm(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#JoinYozm(java.lang.String,
	 * net.daum.dna.params.Params)
	 */
	@Override
	public YozmUserJoin joinYozm(String nickname, Params option) {
		Params required = new Params();
		required.setOption("nickname", nickname);
		return service.JoinYozm(required, option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#JoinYozmAsXML(java.lang.String)
	 */
	@Override
	public String joinYozmAsXML(String nickname) {
		Params required = new Params();
		required.setOption("nickname", nickname);
		return service.JoinYozmAsXML(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#JoinYozmAsXML(java.lang.String,
	 * net.daum.dna.params.Params)
	 */
	@Override
	public String joinYozmAsXML(String nickname, Params option) {
		Params required = new Params();
		required.setOption("nickname", nickname);
		return service.JoinYozmAsXML(required, option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#JoinYozmAsJSON(java.lang.String)
	 */
	@Override
	public String joinYozmAsJSON(String nickname) {
		Params required = new Params();
		required.setOption("nickname", nickname);
		return service.JoinYozmAsJSON(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#JoinYozmAsJSON(java.lang.String,
	 * net.daum.dna.params.Params)
	 */
	@Override
	public String joinYozmAsJSON(String nickname, Params option) {
		Params required = new Params();
		required.setOption("nickname", nickname);
		return service.JoinYozmAsJSON(required, option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#searchArticles(java.lang.String)
	 */
	@Override
	public YozmArticles searchArticles(String q) {
		Params required = new Params();
		required.setOption("q", q);
		return service.searchArticles(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#searchArticles(java.lang.String,
	 * net.daum.dna.params.Params)
	 */
	@Override
	public YozmArticles searchArticles(String q, Params option) {
		Params required = new Params();
		required.setOption("q", q);
		return service.searchArticles(required, option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#searchArticlesAsXML(java.lang.String)
	 */
	@Override
	public String searchArticlesAsXML(String q) {
		Params required = new Params();
		required.setOption("q", q);
		return service.searchArticlesAsXML(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#searchArticlesAsXML(java.lang.String,
	 * net.daum.dna.params.Params)
	 */
	@Override
	public String searchArticlesAsXML(String q, Params option) {
		Params required = new Params();
		required.setOption("q", q);
		return service.searchArticlesAsXML(required, option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#searchArticlesAsJSON(java.lang.String)
	 */
	@Override
	public String searchArticlesAsJSON(String q) {
		Params required = new Params();
		required.setOption("q", q);
		return service.searchArticlesAsJSON(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#searchArticlesAsJSON(java.lang.String,
	 * net.daum.dna.params.Params)
	 */
	@Override
	public String searchArticlesAsJSON(String q, Params option) {
		Params required = new Params();
		required.setOption("q", q);
		return service.searchArticlesAsJSON(required, option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#writeArticle(java.lang.String)
	 */
	@Override
	public YozmWriteRes writeArticle(String message) {
		Params required = new Params();
		required.setOption("message", message);
		return service.writeArticle(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#writeArticle(java.lang.String,
	 * net.daum.dna.params.Params)
	 */
	@Override
	public YozmWriteRes writeArticle(String message, Params option) {
		Params required = new Params();
		required.setOption("message", message);
		return service.writeArticle(required, option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#writeArticleAsXML(java.lang.String)
	 */
	@Override
	public String writeArticleAsXML(String message) {
		Params required = new Params();
		required.setOption("message", message);
		return service.writeArticleAsXML(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#writeArticleAsXML(java.lang.String,
	 * net.daum.dna.params.Params)
	 */
	@Override
	public String writeArticleAsXML(String message, Params option) {
		Params required = new Params();
		required.setOption("message", message);
		return service.writeArticleAsXML(required, option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#writeArticleAsJSON(java.lang.String)
	 */
	@Override
	public String writeArticleAsJSON(String message) {
		Params required = new Params();
		required.setOption("message", message);
		return service.writeArticleAsJSON(required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#writeArticleAsJSON(java.lang.String,
	 * net.daum.dna.params.Params)
	 */
	@Override
	public String writeArticleAsJSON(String message, Params option) {
		Params required = new Params();
		required.setOption("message", message);
		return service.writeArticleAsJSON(required, option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#articlesList()
	 */
	@Override
	public YozmArticles getArticles() {
		return service.articlesList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#articlesList(net.daum.dna.params.Params)
	 */
	@Override
	public YozmArticles getArticles(Params option) {
		return service.articlesList(option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#articlesListAsXML()
	 */
	@Override
	public String getArticlesAsXML() {
		return service.articlesListAsXML();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.daum.dna.api.YozmAPI#articlesListAsXML(net.daum.dna.params.Params)
	 */
	@Override
	public String getArticlesAsXML(Params option) {
		return service.articlesListAsXML(option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#articlesListAsJSON()
	 */
	@Override
	public String getArticlesAsJSON() {
		return service.articlesListAsJSON();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.daum.dna.api.YozmAPI#articlesListAsJSON(net.daum.dna.params.Params)
	 */
	@Override
	public String getArticlesAsJSON(Params option) {
		return service.articlesListAsJSON(option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#getUserInfo()
	 */
	@Override
	public YozmUserInfo getUserInfo() {
		return service.getUserInfo();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#getUserInfo(net.daum.dna.params.Params)
	 */
	@Override
	public YozmUserInfo getUserInfo(Params option) {
		return service.getUserInfo(option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#getUserInfoAsXML()
	 */
	@Override
	public String getUserInfoAsXML() {
		return service.getUserInfoAsXML();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.daum.dna.api.YozmAPI#getUserInfoAsXML(net.daum.dna.params.Params)
	 */
	@Override
	public String getUserInfoAsXML(Params option) {
		return service.getUserInfoAsXML(option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#getUserInfoAsJSON()
	 */
	@Override
	public String getUserInfoAsJSON() {
		return service.getUserInfoAsJSON();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.daum.dna.api.YozmAPI#getUserInfoAsJSON(net.daum.dna.params.Params)
	 */
	@Override
	public String getUserInfoAsJSON(Params option) {
		return service.getUserInfoAsJSON(option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#getUserArticles()
	 */
	@Override
	public YozmUserArticlesSet getUserArticles() {
		return service.getUserArticles();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#getUserArticles(net.daum.dna.params.Params)
	 */
	@Override
	public YozmUserArticlesSet getUserArticles(Params option) {
		return service.getUserArticles(option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#getUserArticlesAsXML()
	 */
	@Override
	public String getUserArticlesAsXML() {
		return service.getUserArticlesAsXML();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.daum.dna.api.YozmAPI#getUserArticlesAsXML(net.daum.dna.params.Params)
	 */
	@Override
	public String getUserArticlesAsXML(Params option) {
		return service.getUserArticlesAsXML(option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.daum.dna.api.YozmAPI#getUserArticlesAsJSON()
	 */
	@Override
	public String getUserArticlesAsJSON() {
		return service.getUserArticlesAsJSON();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.daum.dna.api.YozmAPI#getUserArticlesAsJSON(net.daum.dna.params.Params
	 * )
	 */
	@Override
	public String getUserArticlesAsJSON(Params option) {
		return service.getUserArticlesAsJSON(option);
	}

}
