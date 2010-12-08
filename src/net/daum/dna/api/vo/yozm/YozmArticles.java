package net.daum.dna.api.vo.yozm;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class YozmArticlesList.
 */
public class YozmArticles {

	/** The articles. */
	private List<YozmArticleSet> articleSet;
	
	/** The has more. */
	private boolean hasMore;

	/**
	 * Gets the articles.
	 *
	 * @return the articles
	 */
	public List<YozmArticleSet> getArticles() {
		return articleSet;
	}

	/**
	 * Sets the articles.
	 *
	 * @param articles the new articles
	 */
	public void setArticles(List<YozmArticleSet> articles) {
		this.articleSet = articles;
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
	 * Gets the article.
	 *
	 * @param index the index
	 * @return the article
	 */
	public YozmArticleSet getArticle(int index) {

		return articleSet.get(index);
	}

	/**
	 * Adds the article.
	 *
	 * @param article the article
	 */
	public void addArticle(YozmArticleSet article) {
		articleSet.add(article);
	}

	@Override
	public String toString() {
		return "YozmArticles [articleSet=" + articleSet + ", hasMore="
				+ hasMore + "]";
	}

	
}
