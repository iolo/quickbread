package net.daum.dna.api.vo.yozm;

import java.util.ArrayList;
import java.util.List;

public class YozmUserArticles {
	
	/** The articles. */
	private List<YozmUserArticleSet> userArticles;

	/** The has more. */
	private boolean hasMore;
	
	public YozmUserArticles () {
		userArticles = new ArrayList<YozmUserArticleSet>();
	}

	public List<YozmUserArticleSet> getUserArticles() {
		return userArticles;
	}

	public void setUserArticles(List<YozmUserArticleSet> userArticles) {
		this.userArticles = userArticles;
	}

	public boolean isHasMore() {
		return hasMore;
	}

	public void setHasMore(boolean hasMore) {
		this.hasMore = hasMore;
	}
	public YozmUserArticleSet getUserArticle(int index) {

		return userArticles.get(index);
	}
	
	public void addUserArticle(YozmUserArticleSet article) {
		userArticles.add(article);
	}

	@Override
	public String toString() {
		return "YozmUserArticlesSet [userArticles=" + userArticles + ", hasMore=" + hasMore + "]";
	}
	
}
