package net.daum.dna.api.vo.blog;


// TODO: Auto-generated Javadoc
/**
 * The Class ArticlesItem.
 */
public class BlogArticlesItem {
	
	/** The post id. 아티클 id*/
	private Integer postId;
	
	/** The nickname. 글쓴이 닉네임*/
	private String nickname;
	
	/** The title. 아티클(글) 제목*/
	private String title;
	
	/** The date. 작성 날짜*/
	private String date;
	
	/** The open. 아티클(글) 공개 여부*/
	private String open;
	
	/** The url. 아티클(글)에 대한 주소*/
	private String url;
	
	/** The view category id. */
	private String viewCategoryId;
	
	/** The view id. */
	private String viewId;
	
	/** The is scrap. 스크랩된 글인지의 여부*/
	private String isScrap;
	
	/** The comments. 댓글 수*/
	private Integer comments;
	
	/** The trackbacks. 트랙백 수*/
	private String trackbacks;
	

	/**
	 * ArticlesItem 객체를 생성한다.
	 */
	public BlogArticlesItem() {}
	
	/**
	 * ArticlesItem 객체를 생성하고, parameter값으로 초기화한다.
	 *
	 * @param postId the post id
	 * @param nickname the nickname
	 * @param title the title
	 * @param date the date
	 * @param open the open
	 * @param url the url
	 * @param viewCategoryId the view category id
	 * @param viewId the view id
	 * @param isScrap the is scrap
	 * @param comments the comments
	 * @param trackbacks the trackbacks
	 */
	public BlogArticlesItem(Integer postId, String nickname, String title,
			String date, String open, String url, String viewCategoryId,
			String viewId, String isScrap, Integer comments, String trackbacks) {
		super();
		this.postId = postId;
		this.nickname = nickname;
		this.title = title;
		this.date = date;
		this.open = open;
		this.url = url;
		this.viewCategoryId = viewCategoryId;
		this.viewId = viewId;
		this.isScrap = isScrap;
		this.comments = comments;
		this.trackbacks = trackbacks;
	}
	
	/**
	 * Gets the post id.
	 *
	 * @return 아티클 id
	 */
	public Integer getPostId() {
		return postId;
	}
	
	/**
	 * Sets 아티클 id.
	 *
	 * @param postId the new post id
	 */
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	
	/**
	 * Gets the nickname.
	 *
	 * @return 글쓴이 닉네임
	 */
	public String getNickname() {
		return nickname;
	}
	
	/**
	 * Sets 글쓴이 닉네임.
	 *
	 * @param nickname the new nickname
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	/**
	 * Gets the title.
	 *
	 * @return 아티클(글)제목
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Sets 아티클(글)제목.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the date.
	 *
	 * @return 작성날짜
	 */
	public String getDate() {
		return date;
	}
	
	/**
	 * Sets 작성날짜.
	 *
	 * @param date the new date
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	/**
	 * Gets the open.
	 *
	 * @return 아티클(글) 공개여부
	 */
	public String getOpen() {
		return open;
	}
	
	/**
	 * Sets 아티클(글) 공개여부.
	 *
	 * @param open the new open
	 */
	public void setOpen(String open) {
		this.open = open;
	}
	
	/**
	 * Gets the url.
	 *
	 * @return 아티클(글)에 대한 주소
	 */
	public String getUrl() {
		return url;
	}
	
	/**
	 * Sets 아티클(글)에 대한 주소.
	 *
	 * @param url the new url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	/**
	 * Gets the view category id.
	 *
	 * @return the view category id
	 */
	public String getViewCategoryId() {
		return viewCategoryId;
	}
	
	/**
	 * Sets the view category id.
	 *
	 * @param viewCategoryId the new view category id
	 */
	public void setViewCategoryId(String viewCategoryId) {
		this.viewCategoryId = viewCategoryId;
	}
	
	/**
	 * Gets the view id.
	 *
	 * @return the view id
	 */
	public String getViewId() {
		return viewId;
	}
	
	/**
	 * Sets the view id.
	 *
	 * @param viewId the new view id
	 */
	public void setViewId(String viewId) {
		this.viewId = viewId;
	}

	/**
	 * Gets the checks if is scrap.
	 *
	 * @return 스크렙된 글인지 여부
	 */
	public String getIsScrap() {
		return isScrap;
	}
	
	/**
	 * Sets 스크렙된 글인지 여부
	 *
	 * @param isScrap the new checks if is scrap
	 */
	public void setIsScrap(String isScrap) {
		this.isScrap = isScrap;
	}
	
	/**
	 * Gets the comments.
	 *
	 * @return 댓글 수
	 */
	public Integer getComments() {
		return comments;
	}
	
	/**
	 * Sets 댓글 수
	 *
	 * @param comments the new comments
	 */
	public void setComments(Integer comments) {
		this.comments = comments;
	}
	
	/**
	 * Gets the trackbacks.
	 *
	 * @return 트랙백 수
	 */
	public String getTrackbacks() {
		return trackbacks;
	}
	
	/**
	 * Sets 트랙백 수
	 *
	 * @param trackbacks the new trackbacks
	 */
	public void setTrackbacks(String trackbacks) {
		this.trackbacks = trackbacks;
	}
	
	/**
	 * ArticlesItem객체 에 있는 값들을 string 형태로 출력한다.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "ArticlesItem [comments=" + comments + ", date=" + date + ", isScrap=" + isScrap
				+ ", nickname=" + nickname + ", open=" + open + ", postId="
				+ postId + ", title=" + title + ", trackbacks=" + trackbacks
				+ ", url=" + url + ", viewCategoryId=" + viewCategoryId
				+ ", viewId=" + viewId + "]";
	}
}
