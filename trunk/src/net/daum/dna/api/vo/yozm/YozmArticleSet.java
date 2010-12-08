package net.daum.dna.api.vo.yozm;

// TODO: Auto-generated Javadoc
/**
 * The Class YozmArticles.
 */
public class YozmArticleSet {
	
	/** The write article. */
	private YozmArticle writeArticle;
	
	/** The parent article. */
	private YozmArticle parentArticle;
	
	/** The original article. */
	private YozmArticle originalArticle;
	
	/**
	 * Instantiates a new yozm articles.
	 */
	public YozmArticleSet() {
		writeArticle = new YozmArticle();
		parentArticle = new YozmArticle();
		originalArticle = new YozmArticle();
		
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
	 * Instantiates a new yozm articles.
	 *
	 * @param writeArticle the write article
	 * @param parentArticle the parent article
	 * @param originalArticle the original article
	 */
	public YozmArticleSet(YozmArticle writeArticle, YozmArticle parentArticle,
			YozmArticle originalArticle) {
		super();
		this.writeArticle = writeArticle;
		this.parentArticle = parentArticle;
		this.originalArticle = originalArticle;
	}

	@Override
	public String toString() {
		return "YozmArticleSet [originalArticle=" + originalArticle
				+ ", parentArticle=" + parentArticle + ", writeArticle="
				+ writeArticle + "]";
	}
	
	
}
