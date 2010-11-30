package net.daum.dna.api.vo.cafe;

// TODO: Auto-generated Javadoc
/**
 * Cafe 의 게시판 내의 게시글의 정보를 담고 있는 Class.
 * 
 * @author DAUM
 */

public class CafeArticle {

	/** 게시글 제목. */
	protected String name;

	/** 게시글 ID. */
	protected int articleId;

	/** 작성자 NickName. */
	protected String userName;

	/** 댓글 갯수. */
	protected int commentCount;

	/** 작성일. */
	protected String regDateTime;

	/** 조회 수. */
	protected int viewCount;

	/** 비밀글 여부 ( 한줄 메모장에 한함 ). */
	protected boolean hidden;

	/**
	 * Class 인스턴스화
	 */
	public CafeArticle() {
	}

	/**
	 * Class 인스턴스화
	 * 
	 * @param boardId
	 *            the board id
	 * @param name
	 *            the name
	 * @param articleId
	 *            the article id
	 * @param userName
	 *            the user name
	 * @param commentCount
	 *            the comment count
	 * @param regDateTime
	 *            the reg date time
	 * @param viewCount
	 *            the view count
	 * @param hidden
	 *            the hidden
	 */
	public CafeArticle(String boardId, String name, int articleId, String userName,
			int commentCount, String regDateTime, int viewCount, boolean hidden) {
		this.name = name;
		this.articleId = articleId;
		this.userName = userName;
		this.commentCount = commentCount;
		this.regDateTime = regDateTime;
		this.viewCount = viewCount;
		this.hidden = hidden;
	}

	/**
	 * name 변수를 불러온다.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * name 변수를 입력한다.
	 * 
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
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
	 * user name 변수를 불러온다.
	 * 
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * user name 변수를 입력한다.
	 * 
	 * @param userName
	 *            the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * comment count 변수를 불러온다.
	 * 
	 * @return the comment count
	 */
	public int getCommentCount() {
		return commentCount;
	}

	/**
	 * comment count 변수를 입력한다.
	 * 
	 * @param commentCount
	 *            the new comment count
	 */
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	/**
	 * reg date time 변수를 불러온다.
	 * 
	 * @return the reg date time
	 */
	public String getRegDateTime() {
		return regDateTime;
	}

	/**
	 * reg date time 변수를 입력한다.
	 * 
	 * @param regDateTime
	 *            the new reg date time
	 */
	public void setRegDateTime(String regDateTime) {
		this.regDateTime = regDateTime;
	}

	/**
	 * view count 변수를 불러온다.
	 * 
	 * @return the view count
	 */
	public int getViewCount() {
		return viewCount;
	}

	/**
	 * view count 변수를 입력한다.
	 * 
	 * @param viewCount
	 *            the new view count
	 */
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	/**
	 * 숨김글 인지 아닌지 검사한다.
	 * 
	 * @return true, if is hidden
	 */
	public boolean isHidden() {
		return hidden;
	}

	/**
	 * 숨김글 인지 아닌지 입력한다.
	 * 
	 * @param hidden
	 *            the new hidden
	 */
	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CafeArticle [articleId=");
		builder.append(articleId);
		builder.append(", boardId=");
		builder.append(", commentCount=");
		builder.append(commentCount);
		builder.append(", hidden=");
		builder.append(hidden);
		builder.append(", name=");
		builder.append(name);
		builder.append(", regDateTime=");
		builder.append(regDateTime);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", viewCount=");
		builder.append(viewCount);
		builder.append("]");
		return builder.toString();
	}
}
