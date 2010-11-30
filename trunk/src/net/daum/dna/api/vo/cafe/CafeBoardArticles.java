package net.daum.dna.api.vo.cafe;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * Cafe 특정 게시판의 게시글의 List 를 제공 한다.
 * 
 * @author DAUM
 */

public class CafeBoardArticles {

	/** 해당 게시판의 게시글의 총 갯수. */
	private int totalSize;

	/** 해당 게시판의 게시글중 새로 작성된 게시글의 총 갯수 . */
	private int totalNewSize;

	/** List 형태의 게시글 Class 를 가진다. */
	private List<CafeBoardArticle> cafeBoardArticles;

	/**
	 * Class 인스턴스화
	 */
	public CafeBoardArticles() {
		cafeBoardArticles = new ArrayList<CafeBoardArticle>();
	}

	/**
	 * Class 인스턴스화
	 * 
	 * @param totalSize
	 *            the total size
	 * @param totalNewSize
	 *            the total new size
	 */
	public CafeBoardArticles(int totalSize, int totalNewSize) {
		super();
		this.totalNewSize = totalNewSize;
		this.totalSize = totalSize;
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
	 * total new size 변수를 가져온다.
	 * 
	 * @return the total new size
	 */
	public int getTotalNewSize() {
		return totalNewSize;
	}

	/**
	 * total new size 변수를 입력한다.
	 * 
	 * @param totalNewSize
	 *            the new total new size
	 */
	public void setTotalNewSize(int totalNewSize) {
		this.totalNewSize = totalNewSize;
	}

	/**
	 * articles List 객체를 가져온다.
	 * 
	 * @return the articles
	 */
	public List<CafeBoardArticle> getArticles() {
		return cafeBoardArticles;
	}

	/**
	 * articles 객체를 입력한다.
	 * 
	 * @param articles
	 *            the new articles
	 */
	public void setArticles(List<CafeBoardArticle> articles) {
		this.cafeBoardArticles = articles;
	}

	/**
	 * article 객체를 가져온다.
	 * 
	 * @param index
	 *            the index
	 * @return the article
	 */
	public CafeArticle getArticle(int index) {
		return this.cafeBoardArticles.get(index);
	}

	/**
	 * article 객체를 입력한다.
	 * 
	 * @param article
	 *            the new article
	 */
	public void setArticle(CafeBoardArticle article) {
		this.cafeBoardArticles.add(article);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CafeArticleList [articles=");
		builder.append(cafeBoardArticles);
		builder.append(", totalNewSize=");
		builder.append(totalNewSize);
		builder.append(", totalSize=");
		builder.append(totalSize);
		builder.append("]");
		return builder.toString();
	}

}
