package net.daum.dna.api.vo.blog;


public class BlogActivityRes {
	
	/**
	 * 글 제목
	 */
	private String title;
	/**
	 * 반응글의 ID
	 */
	private String postId;
	/**
	 * 반응글에 달린 아티클 작성시간
	 */
	private String pubDate;
	/**
	 * 반응에 대한 요약설명
	 */
	private String description;
	/**
	 * 작성자 이름
	 */
	private String author;
	/**
	 * 반응 종류 ( 방명록 , 댓글, 트랙백 )
	 * 반응 종류는 BlogAPI에 static final로 선언되어 있다.
	 * _GUEST_BOOK or _COMMENT or _TRACKBACK 중 선택가능
	 */
	private String type;
	
	/**
	 * ActivityRes 객체를 생성한다.
	 */
	public BlogActivityRes () {}
	
	
	/**
	 * ActivityRes 객체를 생성하고 parameter값으로 초기화한다.
	 * @param title 글 제목
	 * @param postId 반응글의 ID
	 * @param pubDate 반응글에 달린 아티클 작성시간
	 * @param description 반응에 대한 요약설명
	 * @param author 작성자 이름
	 * @param type 반응 종류 ( 방명록 , 댓글, 트랙백 ), 반응 종류는 BlogAPI에 static final로 선언되어 있다.
	 * _GUEST_BOOK or _COMMENT or _TRACKBACK 중 선택가능
	 */
	public BlogActivityRes(String title, String postId, String pubDate,
			String description, String author, String type) {
		super();
		this.title = title;
		this.postId = postId;
		this.pubDate = pubDate;
		this.description = description;
		this.author = author;
		this.type = type;
	}
	
	/**
	 * 제목을 반환한다.
	 * @return 제목
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 제목을 넣는다.
	 * @param title 제목
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 반응글 id를 반환한다.
	 * @return 반응글 id
	 */
	public String getPostId() {
		return postId;
	}
	/**
	 * 반응글 id를 넣는다.
	 * @param postId 반응글 id
	 */
	public void setPostId(String postId) {
		this.postId = postId;
	}
	/**
	 * 반응글에 달린 아티클 작성시간을 반환한다.
	 * @return 반응글에 달린 아티클 작성시간
	 */
	public String getPubDate() {
		return pubDate;
	}
	/**
	 * 반응글에 달린 아티클 작성시간을 넣는다
	 * @param pubDate 반응글에 달린 아티클 작성시간
	 */
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	/**
	 * 반응에 대한 요약설명을 반환한다.
	 * @return 반응에 대한 요약설명
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 반응에 대한 요약설명을 넣는다 
	 * @param description 반응에 대한 요약설명
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 작성자 이름을 반환한다.
	 * @return 작성자 이름
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * 작성자 이름을 넣는다
	 * @param author 작성자
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * 반응 종류 ( 방명록 , 댓글, 트랙백 )를 반환한다.
	 * @return 반응 종류 ( 방명록 , 댓글, 트랙백 )
	 */
	public String getType() {
		return type;
	}
	/**
	 * 반응 종류 ( 방명록 , 댓글, 트랙백 )를 넣는다.
	 * @param type 반응 종류 ( 방명록 , 댓글, 트랙백 ) _GUEST_BOOK or _COMMENT or _TRACKBACK 
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * ActivityRes 객체 에 있는 값들을 string 형태로 출력한다.
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BlogMyActivity [author=");
		builder.append(author);
		builder.append(", description=");
		builder.append(description);
		builder.append(", postId=");
		builder.append(postId);
		builder.append(", pubDate=");
		builder.append(pubDate);
		builder.append(", title=");
		builder.append(title);
		builder.append(", type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}
}
