package net.daum.dna.api.vo.cafe;

// TODO: Auto-generated Javadoc
/**
 * Cafe 의 게시판 내의 게시글의 정보를 담고 있는 Class.
 * 
 * @author DAUM
 */

public class CafeBoardArticle extends CafeArticle {

	/** The board id. */
	private String boardId;

	/**
	 * Class 인스턴스화
	 */
	public CafeBoardArticle() {
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
	public CafeBoardArticle(String boardId, String name, int articleId,
			String userName, int commentCount, String regDateTime,
			int viewCount, boolean hidden) {

		this.boardId = boardId;
		this.name = name;
		this.articleId = articleId;
		this.userName = userName;
		this.commentCount = commentCount;
		this.regDateTime = regDateTime;
		this.viewCount = viewCount;
		this.hidden = hidden;
	}

	/**
	 * board id 정보를 가져온다.
	 * 
	 * @return the board id
	 */
	public String getBoardId() {
		return boardId;
	}

	/**
	 * board id 정보를 입력한다.
	 * 
	 * @param boardId
	 *            the new board id
	 */
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}

	@Override
	public String toString() {
		return "BoardArticle [boardId=" + boardId + ", name=" + name
				+ ", articleId=" + articleId + ", userName=" + userName
				+ ", commentCount=" + commentCount + ", regDateTime="
				+ regDateTime + ", viewCount=" + viewCount + ", hidden="
				+ hidden + "]";
	}
}
