package net.daum.dna.api.vo.cafe;

// TODO: Auto-generated Javadoc
/**
 * The Class ActivityRes.
 */

public class CafeActivityRes {

	/** The cafe name. */
	private String cafeName; //

	/** The cafe code. */
	private String cafeCode;

	/** The alim type. */
	private String alimType;

	/** The board id. */
	private String boardId;

	/** The article id. */
	private int articleId;

	/** The article title. */
	private String articleTitle;

	/**
	 * Class 인스턴스화
	 */
	public CafeActivityRes() {
	}

	/**
	 * Class 인스턴스화
	 * 
	 * @param cafeName
	 *            the cafe name
	 * @param cafeCode
	 *            the cafe code
	 * @param alimType
	 *            the alim type
	 * @param boardId
	 *            the board id
	 * @param articleId
	 *            the article id
	 * @param articleTitle
	 *            the article title
	 */
	public CafeActivityRes(String cafeName, String cafeCode, String alimType,
			String boardId, int articleId, String articleTitle) {
		this.cafeName = cafeName;
		this.cafeCode = cafeCode;
		this.alimType = alimType;
		this.boardId = boardId;
		this.articleId = articleId;
		this.articleTitle = articleTitle;
	}

	/**
	 * cafe name 변수를 불러온다.
	 * 
	 * @return the cafe name
	 */
	public String getCafeName() {
		return cafeName;
	}

	/**
	 * cafe name 변수를 입력한다. 
	 * 
	 * @param cafeName
	 *            the new cafe name
	 */
	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}

	/**
	 * cafe code 변수를 불러온다.
	 * 
	 * @return the cafe code
	 */
	public String getCafeCode() {
		return cafeCode;
	}

	/**
	 * cafe code 변수를 입력한다.
	 * 
	 * @param cafeCode
	 *            the new cafe code
	 */
	public void setCafeCode(String cafeCode) {
		this.cafeCode = cafeCode;
	}

	/**
	 * alim type 변수를 불러온다
	 * 
	 * @return the alim type
	 */
	public String getAlimType() {
		return alimType;
	}

	/**
	 * alim type 변수를 입력한다.
	 * 
	 * @param alimType
	 *            the new alim type
	 */
	public void setAlimType(String alimType) {
		this.alimType = alimType;
	}

	/**
	 * board id 변수를 불러온다.
	 * 
	 * @return the board id
	 */
	public String getBoardId() {
		return boardId;
	}

	/**
	 * board id 변수를 입력한다.
	 * 
	 * @param boardId
	 *            the new board id
	 */
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}

	/**
	 * article id 변수를 불러온다.
	 * 
	 * @return the article id
	 */
	public int getArticleId() {
		return articleId;
	}

	/**
	 * article id 변수를 입력한다.
	 * 
	 * @param articleId
	 *            the new article id
	 */
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	/**
	 * article title 변수를 불러온다.
	 * 
	 * @return the article title
	 */
	public String getArticleTitle() {
		return articleTitle;
	}

	/**
	 * article title 변수를 입력한다.
	 * 
	 * @param articleTitle
	 *            the new article title
	 */
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CafeAlimiBBS [alimType=");
		builder.append(alimType);
		builder.append(", articleId=");
		builder.append(articleId);
		builder.append(", articleTitle=");
		builder.append(articleTitle);
		builder.append(", boardId=");
		builder.append(boardId);
		builder.append(", cafeCode=");
		builder.append(cafeCode);
		builder.append(", cafeName=");
		builder.append(cafeName);
		builder.append("]");
		return builder.toString();
	}

}
