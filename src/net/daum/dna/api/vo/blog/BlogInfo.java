package net.daum.dna.api.vo.blog;

// TODO: Auto-generated Javadoc
/**
 * The Class Info.
 */
public class BlogInfo {
	
	/** 응답코드 */
	private int status;
	
	/** 블로그 id*/
	private String id;
	
	/** 블로그 이름 */
	private String name;
	
	/** 닉네임 */
	private String nickname;
	
	/** 블로그 title*/
	private String title;
	
	/** The description. */
	private String description;
	
	/** 블로그 주소*/
	private String url;
	
	/** The rss url. */
	private String rssUrl;
	
	/** The mycon image url. */
	private String myconImageUrl;
	
	/** The profile thumbnail image url. */
	private String profileThumbnailImageUrl;
	
	/** The profile image url. */
	private String profileImageUrl;
	
	/** 방명록 새글 여부*/
	private boolean isNewGuestbookExists;
	
	/** 오늘의 방문자 수 */
	private int visitorCount;
	
	/**
	 * Info 객체를 생성한다.
	 */
	public BlogInfo() {}
		
	/**
	 * Info 객체를 생성하고  parameter값으로 초기화한다.
	 *
	 * @param status 응답코드
	 * @param id 블로그 id
	 * @param name  블로그 이름
	 * @param nickname 닉네임
	 * @param title 블로그 title
	 * @param description the description
	 * @param url 블로그 주소
	 * @param rssUrl the rss url
	 * @param myconImageUrl the mycon image url
	 * @param profileThumbnailImageUrl the profile thumbnail image url
	 * @param profileImageUrl the profile image url
	 * @param isNewGuestbookExists 방명록 새글 여부
	 * @param visitorCount 오늘의 방문자 수
	 */
	public BlogInfo(int status, String id, String name, String nickname,
			String title, String description, String url, String rssUrl,
			String myconImageUrl, String profileThumbnailImageUrl,
			String profileImageUrl, boolean isNewGuestbookExists,
			int visitorCount) {
		super();
		this.status = status;
		this.id = id;
		this.name = name;
		this.nickname = nickname;
		this.title = title;
		this.description = description;
		this.url = url;
		this.rssUrl = rssUrl;
		this.myconImageUrl = myconImageUrl;
		this.profileThumbnailImageUrl = profileThumbnailImageUrl;
		this.profileImageUrl = profileImageUrl;
		this.isNewGuestbookExists = isNewGuestbookExists;
		this.visitorCount = visitorCount;
	}



	/**
	 * 응답코드를 반환합니다.
	 *
	 * @return 응답코드
	 */
	public int getStatus() {
		return status;
	}
	
	/**
	 * 응답코드를 넣습니다.
	 *
	 * @param status 응답코드
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	
	/**
	 * 블로그 id를 반환합니다.
	 *
	 * @return 블로그 id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * 블로그 id 를 넣습니다.
	 *
	 * @param id 블로그 id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * 블로그 이름을 반환합니다.
	 *
	 * @return 블로그 이름
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 블로그 이름을 넣습니다.
	 *
	 * @param name 블로그 이름
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 닉네임을 반환합니다. 
	 *
	 * @return 닉네임
	 */
	public String getNickname() {
		return nickname;
	}
	
	/**
	 * 닉네임을 넣습니다.
	 *
	 * @param nickname 닉네임
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	/**
	 * 블로그 title을 반환합니다.
	 * 
	 * @return 블로그 title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * 블로그 title을 넣습니다.
	 *
	 * @param title 블로그 title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * 블로그에 대한 설명을 반환합니다.
	 *
	 * @return 블로그에 대한 설명
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 블로그에 대한 설명을 넣습니다.
	 *
	 * @param description 블로그에 대한 설명
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * 블로그 주소를 반환합니다.
	 *
	 * @return 블로그 주소
	 */
	public String getUrl() {
		return url;
	}
	
	/**
	 * 블로그 주소를 넣습니다.
	 *
	 * @param url 블로그 주소
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	/**
	 * rss 주소를 반환합니다. 
	 * 
	 * @return rss 주소
	 */
	public String getRssUrl() {
		return rssUrl;
	}
	
	/**
	 * rss 주소를 넣습니다.
	 *
	 * @param rssUrl rss 주소
	 */
	public void setRssUrl(String rssUrl) {
		this.rssUrl = rssUrl;
	}
	
	/**
	 * mycon image url을 반환합니다. 
	 *
	 * @return the mycon image url
	 */
	public String getMyconImageUrl() {
		return myconImageUrl;
	}
	
	/**
	 * the mycon image url 을 넣습니다.
	 *
	 * @param myconImageUrl the new mycon image url
	 */
	public void setMyconImageUrl(String myconImageUrl) {
		this.myconImageUrl = myconImageUrl;
	}
	
	/**
	 * the profile thumbnail image url을 반환합니다. 
	 *
	 * @return the profile thumbnail image url
	 */
	public String getProfileThumbnailImageUrl() {
		return profileThumbnailImageUrl;
	}
	
	/**
	 * the profile thumbnail image url을  넣습니다.
	 *
	 * @param profileThumbnailImageUrl the new profile thumbnail image url
	 */
	public void setProfileThumbnailImageUrl(String profileThumbnailImageUrl) {
		this.profileThumbnailImageUrl = profileThumbnailImageUrl;
	}
	
	/**
	 * the profile image url을 반환합니다.
	 *
	 * @return the profile image url
	 */
	public String getProfileImageUrl() {
		return profileImageUrl;
	}
	
	/**
	 * the profile image url을 넣습니다.
	 *
	 * @param profileImageUrl the new profile image url
	 */
	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}
	
	/**
	 * 방명록 새글여부를 반환합니다.
	 *
	 * @return 방명록 새글 여부
	 */
	public boolean getIsNewGuestbookExists() {
		return isNewGuestbookExists;
	}
	
	/**
	 * 방명록 새글 여부를 넣습니다.
	 *
	 * @param isNewGuestbookExists 방명록 새글 여부
	 */
	public void setIsNewGuestbookExists(boolean isNewGuestbookExists) {
		this.isNewGuestbookExists = isNewGuestbookExists;
	}
	
	/**
	 * 오늘의 방문자 수를 반환합니다.
	 *
	 * @return 오늘의 방문자 수
	 */
	public int getVisitorCount() {
		return visitorCount;
	}
	
	/**
	 * 오늘의 방문자 수를 넣습니다.
	 *
	 * @param visitorCount 오늘의 방문자 수
	 */
	public void setVisitorCount(int visitorCount) {
		this.visitorCount = visitorCount;
	}
	
	/**
	 * Info 객체 에 있는 값들을 string 형태로 출력한다.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Info [description=");
		builder.append(description);
		builder.append(", id=");
		builder.append(id);
		builder.append(", isNewGuestbookExists=");
		builder.append(isNewGuestbookExists);
		builder.append(", myconImageUrl=");
		builder.append(myconImageUrl);
		builder.append(", name=");
		builder.append(name);
		builder.append(", nickname=");
		builder.append(nickname);
		builder.append(", profileImageUrl=");
		builder.append(profileImageUrl);
		builder.append(", profileThumbnailImageUrl=");
		builder.append(profileThumbnailImageUrl);
		builder.append(", rssUrl=");
		builder.append(rssUrl);
		builder.append(", status=");
		builder.append(status);
		builder.append(", title=");
		builder.append(title);
		builder.append(", url=");
		builder.append(url);
		builder.append(", visitorCount=");
		builder.append(visitorCount);
		builder.append("]");
		return builder.toString();
	}
}
