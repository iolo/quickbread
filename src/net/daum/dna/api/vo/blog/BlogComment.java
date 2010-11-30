package net.daum.dna.api.vo.blog;

// TODO: Auto-generated Javadoc
/**
 * The Class Comment.
 */
public class BlogComment {
	
	/** 코멘트 id. */
	private String commentId;
	
	/** The parent id. */
	private String parentId;
	
	/** 댓글 내용 */
	private String content;
	
	/** 작성자 */
	private String name;
	
	/** 댓글 작성 날짜 */
	private String date;
	
	/** 작성자의 블로그 주소*/
	private String url;
	
	/**
	 * Comment 객체를 생성한다.
	 */
	public BlogComment() {}
	
	/**
	 * Comment객체를 생성하고  parameter값으로 초기화한다.
	 *
	 * @param commentId the 코멘트 id
	 * @param parentId the parent id
	 * @param content 댓글 내용 
	 * @param name 작성자
	 * @param date 댓글 작성 날짜
	 * @param url 작성자의 블로그 주소
	 */
	public BlogComment(String commentId, String parentId, String content,
			String name, String date, String url) {
		super();
		this.commentId = commentId;
		this.parentId = parentId;
		this.content = content;
		this.name = name;
		this.date = date;
		this.url = url;
	}


	/**
	 * 코멘트 id를 반환합니다.
	 *
	 * @return the 코멘트 id
	 */
	public String getCommentId() {
		return commentId;
	}
	
	/**
	 * 코멘트 id를 지정합니다.
	 *
	 * @param commentId 코멘트 id
	 */
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	
	/**
	 * parent id를 반환합니다
	 *
	 * @return the parent id
	 */
	public String getParentId() {
		return parentId;
	}
	
	/**
	 * parent id를 지정합니다.
	 *
	 * @param parentId
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	/**
	 * 댓글 내용을 반환합니다.
	 *
	 * @return 댓글 내용
	 */
	public String getContent() {
		return content;
	}
	
	/**
	 * 댓글 내용을 작성합니다.
	 *
	 * @param content 댓글 내용
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * 작성자를 반환합니다.
	 *
	 * @return 작성자
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 작성자를 지정합니다.
	 *
	 * @param name 작성자
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 댓글 작성 날짜를 반환합니다.
	 *
	 * @return 댓글 작성 날짜
	 */
	public String getDate() {
		return date;
	}
	
	/**
	 * 댓글 작성 날짜를 지정합니다.
	 *
	 * @param date 댓글작성 날짜
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	/**
	 * 작성자의 블로그 주소를 반환합니다.
	 *
	 * @return 작성자의 블로그 주소
	 */
	public String getUrl() {
		return url;
	}
	
	/**
	 * 작성자의 블로그 주소를 설정합니다.
	 *
	 * @param url 작성자의 블로그 주소
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	/**
	 * Comment 객체 에 있는 값들을 string 형태로 출력한다.
	 *
	 * @return Comment 객체안에 있는 모든 값
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comment [commentId=");
		builder.append(commentId);
		builder.append(", content=");
		builder.append(content);
		builder.append(", date=");
		builder.append(date);
		builder.append(", name=");
		builder.append(name);
		builder.append(", parentId=");
		builder.append(parentId);
		builder.append(", url=");
		builder.append(url);
		builder.append("]");
		return builder.toString();
	}
	
}
