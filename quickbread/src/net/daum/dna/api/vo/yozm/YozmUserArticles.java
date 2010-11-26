package net.daum.dna.api.vo.yozm;

// TODO: Auto-generated Javadoc
/**
 * The Class YozmUserArticles.
 */
public class YozmUserArticles {
	
	/** The write article. */
	private YozmArticle writeArticle;
	
	/** The parent article. */
	private YozmArticle parentArticle;
	
	/** The original article. */
	private YozmArticle originalArticle;
	
	/** The article user info. */
	private YozmUserInfo articleUserInfo;
	
	/** The parent user info. */
	private YozmUserInfo parentUserInfo;
	
	/** The original user info. */
	private YozmUserInfo originalUserInfo;
	
	/** The has more. */
	private boolean hasMore;
	
	/**
	 * Instantiates a new yozm user articles.
	 */
	public YozmUserArticles () {}
	
	/**
	 * Instantiates a new yozm user articles.
	 *
	 * @param writeArticle the write article
	 * @param parentArticle the parent article
	 * @param originalArticle the original article
	 * @param articleUserInfo the article user info
	 * @param parentUserInfo the parent user info
	 * @param originalUserInfo the original user info
	 * @param hasMore the has more
	 */
	public YozmUserArticles(YozmArticle writeArticle,
			YozmArticle parentArticle, YozmArticle originalArticle,
			YozmUserInfo articleUserInfo, YozmUserInfo parentUserInfo,
			YozmUserInfo originalUserInfo, boolean hasMore) {
		super();
		this.writeArticle = writeArticle;
		this.parentArticle = parentArticle;
		this.originalArticle = originalArticle;
		this.articleUserInfo = articleUserInfo;
		this.parentUserInfo = parentUserInfo;
		this.originalUserInfo = originalUserInfo;
		this.hasMore = hasMore;
	}
	
	/**
	 * Checks if is checks for more.
	 *
	 * @return true, if is checks for more
	 */
	public boolean isHasMore() {
		return hasMore;
	}
	
	/**
	 * Sets the checks for more.
	 *
	 * @param hasMore the new checks for more
	 */
	public void setHasMore(boolean hasMore) {
		this.hasMore = hasMore;
	}
	
	/**
	 * Gets the write article.
	 *
	 * @return the write article
	 */
	public YozmArticle getWriteArticle() {
		return writeArticle;
	}
	
	/**
	 * Sets the write article.
	 *
	 * @param writeArticle the new write article
	 */
	public void setWriteArticle(YozmArticle writeArticle) {
		this.writeArticle = writeArticle;
	}
	
	/**
	 * Gets the parent article.
	 *
	 * @return the parent article
	 */
	public YozmArticle getParentArticle() {
		return parentArticle;
	}
	
	/**
	 * Sets the parent article.
	 *
	 * @param parentArticle the new parent article
	 */
	public void setParentArticle(YozmArticle parentArticle) {
		this.parentArticle = parentArticle;
	}
	
	/**
	 * Gets the original article.
	 *
	 * @return the original article
	 */
	public YozmArticle getOriginalArticle() {
		return originalArticle;
	}
	
	/**
	 * Sets the original article.
	 *
	 * @param originalArticle the new original article
	 */
	public void setOriginalArticle(YozmArticle originalArticle) {
		this.originalArticle = originalArticle;
	}
	
	/**
	 * Gets the article user info.
	 *
	 * @return the article user info
	 */
	public YozmUserInfo getArticleUserInfo() {
		return articleUserInfo;
	}
	
	/**
	 * Sets the article user info.
	 *
	 * @param articleUserInfo the new article user info
	 */
	public void setArticleUserInfo(YozmUserInfo articleUserInfo) {
		this.articleUserInfo = articleUserInfo;
	}
	
	/**
	 * Gets the parent user info.
	 *
	 * @return the parent user info
	 */
	public YozmUserInfo getParentUserInfo() {
		return parentUserInfo;
	}
	
	/**
	 * Sets the parent user info.
	 *
	 * @param parentUserInfo the new parent user info
	 */
	public void setParentUserInfo(YozmUserInfo parentUserInfo) {
		this.parentUserInfo = parentUserInfo;
	}
	
	/**
	 * Gets the original user info.
	 *
	 * @return the original user info
	 */
	public YozmUserInfo getOriginalUserInfo() {
		return originalUserInfo;
	}
	
	/**
	 * Sets the original user info.
	 *
	 * @param originalUserInfo the new original user info
	 */
	public void setOriginalUserInfo(YozmUserInfo originalUserInfo) {
		this.originalUserInfo = originalUserInfo;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "YozmUserArticles [writeArticle=" + writeArticle
				+ ", parentArticle=" + parentArticle + ", originalArticle="
				+ originalArticle + ", articleUserInfo=" + articleUserInfo
				+ ", parentUserInfo=" + parentUserInfo + ", originalUserInfo="
				+ originalUserInfo + ", hasMore=" + hasMore + "]";
	}

}
