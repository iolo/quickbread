package net.daum.dna.api.vo.cafe;

// TODO: Auto-generated Javadoc
/**
 * 각 게시판의 정보를 가지고 있는 Class.
 * 
 * @author DAUM
 */

public class CafeBoard {

	/** 해당 게시판의 ID. */
	private String boardId;

	/** 해당 게시판의 이름. */
	private String name;

	/** 새글의 존재 여부. */
	private boolean hasNewChild;

	/** 게시판의 종류. */
	private String boardType;

	/** 게시판의 감춤 여부. */
	private boolean display;

	/** 익명 게시판인지의 여부. */
	private boolean anonymous;

	/**
	 * Class 인스턴스화
	 */
	public CafeBoard() {
	}

	/**
	 * Class 인스턴스화
	 * 
	 * @param boardId
	 *            the board id
	 * @param name
	 *            the name
	 * @param hasNewChild
	 *            the has new child
	 * @param boardType
	 *            the board type
	 * @param display
	 *            the display
	 * @param anonymous
	 *            the anonymous
	 */
	public CafeBoard(String boardId, String name, boolean hasNewChild,
			String boardType, boolean display, boolean anonymous) {
		this.boardId = boardId;
		this.name = name;
		this.hasNewChild = hasNewChild;
		this.boardType = boardType;
		this.display = display;
		this.anonymous = anonymous;
	}

	/**
	 * board id 변수를 입력한다.
	 * 
	 * @return the board id
	 */
	public String getBoardId() {
		return boardId;
	}

	/**
	 * board id 변수를 불러온다.
	 * 
	 * @param boardId
	 *            the new board id
	 */
	public void setBoardId(String boardId) {
		this.boardId = boardId;
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
	 * 새글의 존재 여부를 알아낸다.
	 * 
	 * @return true, if is checks for new child
	 */
	public boolean isHasNewChild() {
		return hasNewChild;
	}

	/**
	 * 새글의 존재 여부를 지정한다.
	 * 
	 * @param hasNewChild
	 *            the new checks for new child
	 */
	public void setHasNewChild(boolean hasNewChild) {
		this.hasNewChild = hasNewChild;
	}

	/**
	 * board type 변수를 불러온다.
	 * 
	 * @return the board type
	 */
	public String getBoardType() {
		return boardType;
	}

	/**
	 * board type 변수를 입력한다.
	 * 
	 * @param boardType
	 *            the new board type
	 */
	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}

	/**
	 * 게시판 감춤 여부를 알아낸다.
	 * 
	 * @return true, if is display
	 */
	public boolean isDisplay() {
		return display;
	}

	/**
	 * 게시판 감춤 여부를 지정한다.
	 * 
	 * @param display
	 *            the new display
	 */
	public void setDisplay(boolean display) {
		this.display = display;
	}

	/**
	 * 익명 게시판 여부를 알아낸다.
	 * 
	 * @return true, if is anonymous
	 */
	public boolean isAnonymous() {
		return anonymous;
	}

	/**
	 * 익명 게시판 여부를 지정한다.
	 * 
	 * @param anonymous
	 *            the new anonymous
	 */
	public void setAnonymous(boolean anonymous) {
		this.anonymous = anonymous;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CafeBoard [anonymous=");
		builder.append(anonymous);
		builder.append(", boardId=");
		builder.append(boardId);
		builder.append(", boardType=");
		builder.append(boardType);
		builder.append(", display=");
		builder.append(display);
		builder.append(", hasNewChild=");
		builder.append(hasNewChild);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
