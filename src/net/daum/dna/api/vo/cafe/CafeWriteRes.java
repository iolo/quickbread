package net.daum.dna.api.vo.cafe;

// TODO: Auto-generated Javadoc
/**
 * 한줄 메모장에 게시글을 작성했을 때 정보를 담는 Class.
 * 
 * @author DAUM
 */

public class CafeWriteRes extends CafeArticle {

	/** profile img 정보를 담는 변수 */
	private String profileImg;

	/**
	 * Class 인스턴스화
	 */
	public CafeWriteRes() {
	}

	/**
	 * Class 인스턴스화
	 * 
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
	public CafeWriteRes(String name, int articleId, String userName,
			int commentCount, String regDateTime, int viewCount,
			boolean hidden, String profileImg) {
		this.name = name;
		this.articleId = articleId;
		this.userName = userName;
		this.commentCount = commentCount;
		this.regDateTime = regDateTime;
		this.viewCount = viewCount;
		this.hidden = hidden;
		this.profileImg = profileImg;
	}

	/**
	 * profile img 변수를 가져온다.
	 * 
	 * @return the profile img
	 */
	public String getProfileImg() {
		return profileImg;
	}

	/**
	 * profile img 변수를 입력한다.
	 * 
	 * @param profileImg
	 *            the new profile img
	 */
	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	@Override
	public String toString() {
		return "WriteRes [profileImg=" + profileImg + ", name=" + name
				+ ", articleId=" + articleId + ", userName=" + userName
				+ ", commentCount=" + commentCount + ", regDateTime="
				+ regDateTime + ", viewCount=" + viewCount + ", hidden="
				+ hidden + "]";
	}
}
