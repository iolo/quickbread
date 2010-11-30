package net.daum.dna.api.vo.yozm;

// TODO: Auto-generated Javadoc
/**
 * 일반 글 또는 반응글을 작성할 때 각 글의 정보를 담는 Class.
 * 
 * @author DAUM
 */

public class YozmArticle {

	/** message 의 고유 ID. */
	private int msgId;

	/**
	 * message 의 종류.
	 * 
	 * 0 - 일반 Q - 소문글 R - 반응 글 N - 공지사항
	 */
	private String type;

	/** DB에 입력된 메세지 내용(치환자를 포함하고 있음). */
	private String text;

	/** 순수한 입력 메세지. */
	private String plainText;

	/** yozm 내부에서 사용하는 태그 등을 치환한 html text. */
	private String htmlText;

	/** message 의 작성 출처 이름. */
	private String sourceName;

	/** 해당 글에 대한 반응 갯수. */
	private int replyCnt;

	/** 해당 글에 대한 소문 갯수. */
	private int quoteCnt;

	/** 사용자가 해당 message 에 대하여 즐겨 찾기 했는지 여부. */
	private String favorited;

	/** message 고유의 url. */
	private String permanentURL;

	/** message 작성 일. */
	private String pubDate;

	/** daum id 이자 yozm 개인 url. */
	private String userURLName;

	/** 사용자의 nick name. */
	private String userNickName;

	/** 사용자 프로필 이미지 url. */
	private String userProfileImgURL;

	/** message 첨부 데이터의 종류. */
	private String attachmentType;

	/** 첨부된 아이템 key. */
	private String attachmentKey;

	/** 첨부 type 이름. */
	private String attachmentName;

	/** 썸네일url. */
	private String attachmentThumbnailURL;

	/** 이미지url. */
	private String attachmentImageURL;

	/**
	 * Class 인스턴스화.
	 */
	public YozmArticle() {
	}

	/**
	 * Class 인스턴스화.
	 *
	 * @param msgId the msg id
	 * @param type the type
	 * @param text the text
	 * @param plainText the plain text
	 * @param htmlText the html text
	 * @param sourceName the source name
	 * @param replyCnt the reply cnt
	 * @param quoteCnt the quote cnt
	 * @param favorited the favorited
	 * @param permanentURL the permanent url
	 * @param pubDate the pub date
	 * @param userURLName the user url name
	 * @param userNickName the user nick name
	 * @param userProfileImgURL the user profile img url
	 * @param attachmentType the attachment type
	 * @param attachmentKey the attachment key
	 * @param attachmentName the attachment name
	 * @param attachmentThumbnailURL the attachment thumbnail url
	 * @param attachmentImageURL the attachment image url
	 */
	public YozmArticle(int msgId, String type, String text, String plainText,
			String htmlText, String sourceName, int replyCnt, int quoteCnt,
			String favorited, String permanentURL, String pubDate,
			String userURLName, String userNickName, String userProfileImgURL,
			String attachmentType, String attachmentKey, String attachmentName,
			String attachmentThumbnailURL, String attachmentImageURL) {
		this.msgId = msgId;
		this.type = type;
		this.text = text;
		this.plainText = plainText;
		this.htmlText = htmlText;
		this.sourceName = sourceName;
		this.replyCnt = replyCnt;
		this.quoteCnt = quoteCnt;
		this.favorited = favorited;
		this.permanentURL = permanentURL;
		this.pubDate = pubDate;
		this.userURLName = userURLName;
		this.userNickName = userNickName;
		this.userProfileImgURL = userProfileImgURL;
		this.attachmentType = attachmentType;
		this.attachmentKey = attachmentKey;
		this.attachmentName = attachmentName;
		this.attachmentThumbnailURL = attachmentThumbnailURL;
		this.attachmentImageURL = attachmentImageURL;
	}

	/**
	 * msg id 변수를 가져온다.
	 * 
	 * @return the msg id
	 */
	public int getMsgId() {
		return msgId;
	}

	/**
	 * msg id 변수를 입력한다.
	 * 
	 * @param msgId
	 *            the new msg id
	 */
	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}

	/**
	 * type 변수를 가져온다.
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * type 변수를 입력한다.
	 * 
	 * @param type
	 *            the new type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * text 변수를 가져온다.
	 * 
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * text 변수를 입력한다.
	 * 
	 * @param text
	 *            the new text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * plain text 변수를 가져온다.
	 * 
	 * @return the plain text
	 */
	public String getPlainText() {
		return plainText;
	}

	/**
	 * plain text 변수를 입력한다.
	 * 
	 * @param plainText
	 *            the new plain text
	 */
	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}

	/**
	 * html text 변수를 가져온다.
	 * 
	 * @return the html text
	 */
	public String getHtmlText() {
		return htmlText;
	}

	/**
	 * html text 변수를 입력한다.
	 * 
	 * @param htmlText
	 *            the new html text
	 */
	public void setHtmlText(String htmlText) {
		this.htmlText = htmlText;
	}

	/**
	 * source name 변수를 가져온다.
	 * 
	 * @return the source name
	 */
	public String getSourceName() {
		return sourceName;
	}

	/**
	 * source name 변수를 입력한다.
	 * 
	 * @param sourceName
	 *            the new source name
	 */
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	/**
	 * reply cnt 변수를 가져온다.
	 * 
	 * @return the reply cnt
	 */
	public int getReplyCnt() {
		return replyCnt;
	}

	/**
	 * reply cnt 변수를 입력한다.
	 * 
	 * @param replyCnt
	 *            the new reply cnt
	 */
	public void setReplyCnt(int replyCnt) {
		this.replyCnt = replyCnt;
	}

	/**
	 * quote cnt 변수를 가져온다.
	 * 
	 * @return the quote cnt
	 */
	public int getQuoteCnt() {
		return quoteCnt;
	}

	/**
	 * quote cnt 변수를 입력한다.
	 * 
	 * @param quoteCnt
	 *            the new quote cnt
	 */
	public void setQuoteCnt(int quoteCnt) {
		this.quoteCnt = quoteCnt;
	}

	/**
	 * favorited 변수를 가져온다.
	 * 
	 * @return the favorited
	 */
	public String getFavorited() {
		return favorited;
	}

	/**
	 * favorited 변수를 입력한다.
	 * 
	 * @param favorited
	 *            the new favorited
	 */
	public void setFavorited(String favorited) {
		this.favorited = favorited;
	}

	/**
	 * permanent url 변수를 가져온다.
	 * 
	 * @return the permanent url
	 */
	public String getPermanentURL() {
		return permanentURL;
	}

	/**
	 * permanent url 변수를 입력한다.
	 * 
	 * @param permanentURL
	 *            the new permanent url
	 */
	public void setPermanentURL(String permanentURL) {
		this.permanentURL = permanentURL;
	}

	/**
	 * pub date 변수를 가져온다.
	 * 
	 * @return the pub date
	 */
	public String getPubDate() {
		return pubDate;
	}

	/**
	 * pub date 변수를 입력한다.
	 * 
	 * @param pubDate
	 *            the new pub date
	 */
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	/**
	 * user url name 변수를 가져온다.
	 * 
	 * @return the user url name
	 */
	public String getUserURLName() {
		return userURLName;
	}

	/**
	 * user url name 변수를 입력한다.
	 * 
	 * @param userURLName
	 *            the new user url name
	 */
	public void setUserURLName(String userURLName) {
		this.userURLName = userURLName;
	}

	/**
	 * user nick name 변수를 가져온다.
	 * 
	 * @return the user nick name
	 */
	public String getUserNickName() {
		return userNickName;
	}

	/**
	 * user nick name 변수를 입력한다.
	 * 
	 * @param userNickName
	 *            the new user nick name
	 */
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	/**
	 * user profile img url 변수를 가져온다.
	 * 
	 * @return the user profile img url
	 */
	public String getUserProfileImgURL() {
		return userProfileImgURL;
	}

	/**
	 * user profile img url 변수를 입력한다.
	 * 
	 * @param userProfileImgURL
	 *            the new user profile img url
	 */
	public void setUserProfileImgURL(String userProfileImgURL) {
		this.userProfileImgURL = userProfileImgURL;
	}

	/**
	 * attachment type 변수를 가져온다.
	 * 
	 * @return the attachment type
	 */
	public String getAttachmentType() {
		return attachmentType;
	}

	/**
	 * attachment key 변수를 가져온다.
	 * 
	 * @return the attachment key
	 */
	public String getAttachmentKey() {
		return attachmentKey;
	}

	/**
	 * attachment key 변수를 입력한다.
	 * 
	 * @param attachmentKey
	 *            the new attachment key
	 */
	public void setAttachmentKey(String attachmentKey) {
		this.attachmentKey = attachmentKey;
	}

	/**
	 * attachment name 변수를 가져온다.
	 * 
	 * @return the attachment name
	 */
	public String getAttachmentName() {
		return attachmentName;
	}

	/**
	 * attachment name 변수를 입력한다.
	 * 
	 * @param attachmentName
	 *            the new attachment name
	 */
	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	/**
	 * attachment type 변수를 입력한다.
	 * 
	 * @param attachmentType
	 *            the new attachment type
	 */
	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}

	/**
	 * attachment thumbnail url 변수를 가져온다.
	 * 
	 * @return the attachment thumbnail url
	 */
	public String getAttachmentThumbnailURL() {
		return attachmentThumbnailURL;
	}

	/**
	 * attachment thumbnail url 변수를 입력한다.
	 * 
	 * @param attachmentThumbnailURL
	 *            the new attachment thumbnail url
	 */
	public void setAttachmentThumbnailURL(String attachmentThumbnailURL) {
		this.attachmentThumbnailURL = attachmentThumbnailURL;
	}

	/**
	 * attachment image url 변수를 가져온다.
	 * 
	 * @return the attachment image url
	 */
	public String getAttachmentImageURL() {
		return attachmentImageURL;
	}

	/**
	 * attachment image url 변수를 입력한다.
	 * 
	 * @param attachmentImageURL
	 *            the new attachment image url
	 */
	public void setAttachmentImageURL(String attachmentImageURL) {
		this.attachmentImageURL = attachmentImageURL;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "YozmArticle [msgId=" + msgId + ", type=" + type + ", text="
				+ text + ", plainText=" + plainText + ", htmlText=" + htmlText
				+ ", sourceName=" + sourceName + ", replyCnt=" + replyCnt
				+ ", quoteCnt=" + quoteCnt + ", favorited=" + favorited
				+ ", permanentURL=" + permanentURL + ", pubDate=" + pubDate
				+ ", userURLName=" + userURLName + ", userNickName="
				+ userNickName + ", userProfileImgURL=" + userProfileImgURL
				+ ", attachmentType=" + attachmentType + ", attachmentKey="
				+ attachmentKey + ", attachmentName=" + attachmentName
				+ ", attachmentThumbnailURL=" + attachmentThumbnailURL
				+ ", attachmentImageURL=" + attachmentImageURL + "]";
	}

}
