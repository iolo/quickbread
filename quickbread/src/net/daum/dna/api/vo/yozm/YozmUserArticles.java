package net.daum.dna.api.vo.yozm;

import java.util.ArrayList;
import java.util.List;

public class YozmUserArticles {

	private List<YozmUserArticle> yozmUserArticle;

	private Boolean hasMore;

	public YozmUserArticles() {
		this.yozmUserArticle = new ArrayList<YozmUserArticle>();
	}

	public List<YozmUserArticle> getYozmUserArticle() {
		return yozmUserArticle;
	}

	public void setYozmUserArticle(List<YozmUserArticle> yozmUserArticle) {
		this.yozmUserArticle = yozmUserArticle;
	}

	public Boolean isHasMore() {
		return hasMore;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}

	public YozmUserArticle getUserArticle(int index) {

		return yozmUserArticle.get(index);
	}

	/**
	 * Adds the article.
	 * 
	 * @param article
	 *            the article
	 */
	public void addUserArticle(YozmUserArticle article) {
		yozmUserArticle.add(article);
	}

}
