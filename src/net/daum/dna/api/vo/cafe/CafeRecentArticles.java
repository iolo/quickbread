package net.daum.dna.api.vo.cafe;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * Cafe의 최신 글 List 를 담는 Class.
 * 
 * @author DAUM
 */

public class CafeRecentArticles {

	/** 최신글의 갯수. */
	private int totalSize;

	/** 최신글을 RecentArticle 형 List 로 가짐. */
	private List<CafeRecentArticle> cafeRecentArticles;

	/**
	 * Class 인스턴스화
	 */
	public CafeRecentArticles() {
		this.cafeRecentArticles = new ArrayList<CafeRecentArticle>();
	}

	/**
	 * Class 인스턴스화
	 * 
	 * @param totalSize
	 *            the total size
	 * @param cafeRecentArticles
	 *            the recent articles
	 */
	public CafeRecentArticles(int totalSize, List<CafeRecentArticle> cafeRecentArticles) {
		this.totalSize = totalSize;
		this.cafeRecentArticles = cafeRecentArticles;
	}

	/**
	 * total size 변수를 가져온다.
	 * 
	 * @return the total size
	 */
	public int getTotalSize() {
		return totalSize;
	}

	/**
	 * total size 변수를 입력한다.
	 * 
	 * @param totalSize
	 *            the new total size
	 */
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	/**
	 * recent articles 객체를 가져온다.
	 * 
	 * @return the recent articles
	 */
	public List<CafeRecentArticle> getRecentArticles() {
		return cafeRecentArticles;
	}

	/**
	 * recent articles 객체를 입력한다.
	 * 
	 * @param cafeRecentArticles
	 *            the new recent articles
	 */
	public void setRecentArticles(List<CafeRecentArticle> cafeRecentArticles) {
		this.cafeRecentArticles = cafeRecentArticles;
	}

	/**
	 * recent article 객체를 가져온다.
	 * 
	 * @param index
	 *            the index
	 * @return the recent article
	 */
	public CafeRecentArticle getRecentArticle(int index) {
		return cafeRecentArticles.get(index);
	}

	/**
	 * recent article 객체를 입력한다.
	 * 
	 * @param cafeRecentArticle
	 *            the new recent article
	 */
	public void setRecentArticle(CafeRecentArticle cafeRecentArticle) {
		cafeRecentArticles.add(cafeRecentArticle);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CafeRecentArticleList [recentArticles=");
		builder.append(cafeRecentArticles);
		builder.append(", totalSize=");
		builder.append(totalSize);
		builder.append("]");
		return builder.toString();
	}

}
