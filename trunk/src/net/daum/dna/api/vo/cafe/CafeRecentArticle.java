package net.daum.dna.api.vo.cafe;

// TODO: Auto-generated Javadoc
/**
 * 해당 Cafe 의 최신글 각각의 정보를 담는 Class.
 * 
 * @author DAUM
 */

public class CafeRecentArticle extends CafeArticle {

	/** 게시판 ID. */
	private String boardId;

	/** 게시판의 이름. */
	private String boardName;

	/**
	 * Class 인스턴스화
	 */
	public CafeRecentArticle() {
	}

	/**
	 * Class 인스턴스화
	 * 
	 * @param boardId
	 *            the board id
	 * @param boardName
	 *            the board name
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
	public CafeRecentArticle(String boardId, String boardName, String name,
			int articleId, String userName, int commentCount,
			String regDateTime, int viewCount, boolean hidden) {
		this.boardId = boardId;
		this.boardName = boardName;
		this.name = name;
		this.articleId = articleId;
		this.userName = userName;
		this.commentCount = commentCount;
		this.regDateTime = regDateTime;
		this.viewCount = viewCount;
		this.hidden = hidden;
	}

	/**
	 * board id 변수를 가져온다.
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
	 * board name 변수를 가져온다.
	 * 
	 * @return the board name
	 */
	public String getBoardName() {
		return boardName;
	}

	/**
	 * board name 변수를 입력한다.
	 * 
	 * @param boardName
	 *            the new board name
	 */
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	@Override
	public String toString() {
		return "RecentArticle [boardId=" + boardId + ", boardName=" + boardName
				+ ", name=" + name + ", articleId=" + articleId + ", userName="
				+ userName + ", commentCount=" + commentCount
				+ ", regDateTime=" + regDateTime + ", viewCount=" + viewCount
				+ ", hidden=" + hidden + "]";
	}

}
