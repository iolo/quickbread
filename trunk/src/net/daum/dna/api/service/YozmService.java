package net.daum.dna.api.service;

import java.util.List;

import net.daum.dna.api.dao.YozmDAO;
import net.daum.dna.api.vo.yozm.*;

import net.daum.dna.oauth.DaumOAuth;
import net.daum.dna.params.Params;
import net.daum.dna.util.APIUtils;

// TODO: Auto-generated Javadoc
/**
 * The Class YozmService.
 */
public class YozmService {

	/** The yozm dao. */
	private YozmDAO yozmDAO;

	/**
	 * Instantiates a new yozm service.
	 * 
	 * @param oauth
	 *            the oauth
	 */
	public YozmService(DaumOAuth oauth) {
		yozmDAO = new YozmDAO(oauth);

	}

	/**
	 * Gets the oauth.
	 * 
	 * @return the oauth
	 */
	public DaumOAuth getOauth() {
		return yozmDAO.getOauth();
	}

	/**
	 * Sets the oauth.
	 * 
	 * @param oauth
	 *            the new oauth
	 */
	public void setOauth(DaumOAuth oauth) {
		yozmDAO.setOauth(oauth);

	}

	/**
	 * checkUserJoin 함수 QueryStringBuilder.
	 * 
	 * @return the yozm join info
	 */
	public YozmUserJoined checkUserJoin() {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);

		return yozmDAO.checkUserJoin(queryString.toString());
	}

	/**
	 * checkUserJoin 함수 QueryStringBuilder.
	 * 
	 * @return the string
	 */
	public String checkUserJoinAsXML() {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);

		return yozmDAO.checkUserJoinAsXML(queryString.toString());
	}

	/**
	 * checkUserJoin 함수 QueryStringBuilder.
	 * 
	 * @return the string
	 */
	public String checkUserJoinAsJSON() {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);

		return yozmDAO.checkUserJoinAsJSON(queryString.toString());
	}

	/**
	 * JoinYozm 함수 QueryStringBuilder.
	 * 
	 * @param required
	 *            the required
	 * @return the yozm join
	 */
	public YozmUserJoin JoinYozm(Params required) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(required));

		return yozmDAO.JoinYozm(queryString.toString());
	}

	/**
	 * JoinYozm 함수 QueryStringBuilder.
	 * 
	 * @param required
	 *            the required
	 * @param option
	 *            the option
	 * @return the yozm join
	 */
	public YozmUserJoin JoinYozm(Params required, Params option) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(required, option));

		return yozmDAO.JoinYozm(queryString.toString());
	}

	/**
	 * JoinYozm 함수 QueryStringBuilder.
	 * 
	 * @param required
	 *            the required
	 * @return the string
	 */
	public String JoinYozmAsXML(Params required) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(required));

		return yozmDAO.JoinYozmAsXML(queryString.toString());
	}

	/**
	 * JoinYozm 함수 QueryStringBuilder.
	 * 
	 * @param required
	 *            the required
	 * @param option
	 *            the option
	 * @return the string
	 */
	public String JoinYozmAsXML(Params required, Params option) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(required, option));

		return yozmDAO.JoinYozmAsXML(queryString.toString());
	}

	/**
	 * JoinYozm 함수 QueryStringBuilder.
	 * 
	 * @param required
	 *            the required
	 * @return the string
	 */
	public String JoinYozmAsJSON(Params required) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(required));

		return yozmDAO.JoinYozmAsJSON(queryString.toString());
	}

	/**
	 * JoinYozm 함수 QueryStringBuilder.
	 * 
	 * @param required
	 *            the required
	 * @param option
	 *            the option
	 * @return the string
	 */
	public String JoinYozmAsJSON(Params required, Params option) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(required, option));

		return yozmDAO.JoinYozmAsJSON(queryString.toString());
	}

	/**
	 * SearchArticles 함수 QueryStringBuilder.
	 * 
	 * @param required
	 *            the required
	 * @return the yozm articles list
	 */
	public YozmArticles searchArticles(Params required) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(required));

		return yozmDAO.searchArticles(queryString.toString());
	}

	/**
	 * SearchArticles 함수 QueryStringBuilder.
	 * 
	 * @param required
	 *            the required
	 * @param option
	 *            the option
	 * @return the yozm articles list
	 */
	public YozmArticles searchArticles(Params required, Params option) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(required, option));

		return yozmDAO.searchArticles(queryString.toString());
	}

	/**
	 * SearchArticles 함수 QueryStringBuilder.
	 * 
	 * @param required
	 *            the required
	 * @return the string
	 */
	public String searchArticlesAsXML(Params required) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(required));

		return yozmDAO.searchArticlesAsXML(queryString.toString());
	}

	/**
	 * SearchArticles 함수 QueryStringBuilder.
	 * 
	 * @param required
	 *            the required
	 * @param option
	 *            the option
	 * @return the string
	 */
	public String searchArticlesAsXML(Params required, Params option) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(required, option));

		return yozmDAO.searchArticlesAsXML(queryString.toString());
	}

	/**
	 * SearchArticles 함수 QueryStringBuilder.
	 * 
	 * @param required
	 *            the required
	 * @return the string
	 */
	public String searchArticlesAsJSON(Params required) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(required));

		return yozmDAO.searchArticlesAsJSON(queryString.toString());

	}

	/**
	 * SearchArticles 함수 QueryStringBuilder.
	 * 
	 * @param required
	 *            the required
	 * @param option
	 *            the option
	 * @return the string
	 */
	public String searchArticlesAsJSON(Params required, Params option) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(required, option));

		return yozmDAO.searchArticlesAsJSON(queryString.toString());
	}

	/**
	 * WriteArticle 함수 QueryStringBuilder.
	 * 
	 * @param required
	 *            the required
	 * @return the yozm write res
	 */
	public YozmWriteRes writeArticle(Params required) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(required));

		return yozmDAO.writeArticle(queryString.toString());
	}

	/**
	 * WriteArticle 함수 QueryStringBuilder.
	 * 
	 * @param required
	 *            the required
	 * @param option
	 *            the option
	 * @return the yozm write res
	 */
	public YozmWriteRes writeArticle(Params required, Params option) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(required, option));

		return yozmDAO.writeArticle(queryString.toString());
	}

	/**
	 * WriteArticle 함수 QueryStringBuilder.
	 * 
	 * @param required
	 *            the required
	 * @return the string
	 */
	public String writeArticleAsXML(Params required) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(required));

		return yozmDAO.writeArticleAsXML(queryString.toString());
	}

	/**
	 * WriteArticle 함수 QueryStringBuilder.
	 * 
	 * @param required
	 *            the required
	 * @param option
	 *            the option
	 * @return the string
	 */
	public String writeArticleAsXML(Params required, Params option) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(required, option));
		return yozmDAO.writeArticleAsXML(queryString.toString());
	}

	/**
	 * WriteArticle 함수 QueryStringBuilder.
	 * 
	 * @param required
	 *            the required
	 * @return the string
	 */
	public String writeArticleAsJSON(Params required) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(required));

		return yozmDAO.writeArticleAsJSON(queryString.toString());
	}

	/**
	 * WriteArticle 함수 QueryStringBuilder.
	 * 
	 * @param required
	 *            the required
	 * @param option
	 *            the option
	 * @return the string
	 */
	public String writeArticleAsJSON(Params required, Params option) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(required, option));

		return yozmDAO.writeArticleAsJSON(queryString.toString());
	}

	/**
	 * ArticlesList 함수 QueryStringBuilder.
	 * 
	 * @return the yozm articles list
	 */
	public YozmArticles articlesList() {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);

		return yozmDAO.articlesList(queryString.toString());
	}

	/**
	 * ArticlesList 함수 QueryStringBuilder.
	 * 
	 * @param option
	 *            the option
	 * @return the yozm articles list
	 */
	public YozmArticles articlesList(Params option) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(option));
		return yozmDAO.articlesList(queryString.toString());
	}

	/**
	 * ArticlesList 함수 QueryStringBuilder.
	 * 
	 * @return the string
	 */
	public String articlesListAsXML() {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		return yozmDAO.articlesListAsXML(queryString.toString());
	}

	/**
	 * ArticlesList 함수 QueryStringBuilder.
	 * 
	 * @param option
	 *            the option
	 * @return the string
	 */
	public String articlesListAsXML(Params option) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(option));
		return yozmDAO.articlesListAsXML(queryString.toString());
	}

	/**
	 * ArticlesList 함수 QueryStringBuilder.
	 * 
	 * @return the string
	 */
	public String articlesListAsJSON() {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		return yozmDAO.articlesListAsJSON(queryString.toString());
	}

	/**
	 * ArticlesList 함수 QueryStringBuilder.
	 * 
	 * @param option
	 *            the option
	 * @return the string
	 */
	public String articlesListAsJSON(Params option) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(option));
		return yozmDAO.articlesListAsJSON(queryString.toString());
	}

	/**
	 * GetUserInfo 함수 QueryStringBuilder.
	 * 
	 * @return the user info
	 */
	public YozmUserInfo getUserInfo() {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		return yozmDAO.getUserInfo(queryString.toString());
	}

	/**
	 * GetUserInfo 함수 QueryStringBuilder.
	 * 
	 * @param option
	 *            the option
	 * @return the user info
	 */
	public YozmUserInfo getUserInfo(Params option) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(option));
		return yozmDAO.getUserInfo(queryString.toString());
	}

	/**
	 * GetUserInfo 함수 QueryStringBuilder.
	 * 
	 * @return the user info as xml
	 */
	public String getUserInfoAsXML() {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		return yozmDAO.getUserInfoAsXML(queryString.toString());

	}

	/**
	 * GetUserInfo 함수 QueryStringBuilder.
	 * 
	 * @param option
	 *            the option
	 * @return the user info as xml
	 */
	public String getUserInfoAsXML(Params option) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(option));
		return yozmDAO.getUserInfoAsXML(queryString.toString());
	}

	/**
	 * GetUserInfo 함수 QueryStringBuilder.
	 * 
	 * @return the user info as json
	 */
	public String getUserInfoAsJSON() {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		return yozmDAO.getUserInfoAsJSON(queryString.toString());
	}

	/**
	 * GetUserInfo 함수 QueryStringBuilder.
	 * 
	 * @param option
	 *            the option
	 * @return the user info as json
	 */
	public String getUserInfoAsJSON(Params option) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(option));
		return yozmDAO.getUserInfoAsJSON(queryString.toString());
	}

	/**
	 * GetUserArticles 함수 QueryStringBuilder.
	 * 
	 * @return the user articles
	 */
	public List<YozmUserArticles> getUserArticles() {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		return yozmDAO.getUserArticles(queryString.toString());
	}

	/**
	 * GetUserArticles 함수 QueryStringBuilder.
	 * 
	 * @param option
	 *            the option
	 * @return the user articles
	 */
	public List<YozmUserArticles> getUserArticles(Params option) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(option));
		return yozmDAO.getUserArticles(queryString.toString());
	}

	/**
	 * GetUserArticles 함수 QueryStringBuilder.
	 * 
	 * @return the user articles as xml
	 */
	public String getUserArticlesAsXML() {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		return yozmDAO.getUserArticlesAsXML(queryString.toString());
	}

	/**
	 * GetUserArticles 함수 QueryStringBuilder.
	 * 
	 * @param option
	 *            the option
	 * @return the user articles as xml
	 */
	public String getUserArticlesAsXML(Params option) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(option));
		return yozmDAO.getUserArticlesAsXML(queryString.toString());
	}

	/**
	 * GetUserArticles 함수 QueryStringBuilder.
	 * 
	 * @return the user articles as json
	 */
	public String getUserArticlesAsJSON() {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		return yozmDAO.getUserArticlesAsJSON(queryString.toString());
	}

	/**
	 * GetUserArticles 함수 QueryStringBuilder.
	 * 
	 * @param option
	 *            the option
	 * @return the user articles as json
	 */
	public String getUserArticlesAsJSON(Params option) {
		StringBuffer queryString = new StringBuffer();
		queryString.append(APIUtils._XML);
		queryString.append(APIUtils.getInstance().buildQueryString(option));
		return yozmDAO.getUserArticlesAsJSON(queryString.toString());
	}

}
