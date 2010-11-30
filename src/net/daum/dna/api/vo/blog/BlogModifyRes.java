package net.daum.dna.api.vo.blog;

// TODO: Auto-generated Javadoc
/**
 * The Class ModifyRes.
 */
public class BlogModifyRes {

	/** 응답코드 */
	private Integer status;
	
	/** 아티클 id. */
	private Integer postId;
	
	/** 아티클(글)에 대한 Full URL */
	private String url;
	
	/**
	 * ModifyRes 객체를 생성한다.
	 */
	public BlogModifyRes() {}
	
	/**
	 * ModifyRes 객체를 생성하고  parameter값으로 초기화한다.
	 *
	 * @param status 응답코드
	 * @param postId 아티클 id
	 * @param url 아티클(글)에 대한 Full URL
	 */
	public BlogModifyRes(Integer status, Integer postId, String url) {
		super();
		this.status = status;
		this.postId = postId;
		this.url = url;
	}
	
	/**
	 * 응답코드를 반환한다.
	 *
	 * @return 응답코드
	 */
	public Integer getStatus() {
		return status;
	}
	
	/**
	 * 응답코드를 넣는다.
	 *
	 * @param status 응답코드
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	/**
	 * 아티클 id를 반환한다.
	 *
	 * @return 아티클 id
	 */
	public Integer getPostId() {
		return postId;
	}
	
	/**
	 * 아티클 id를 넣는다.
	 *
	 * @param postId 아티클 id
	 */
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	
	/**
	 * 아티클(글)에 대한 Full URL을 반환한다.
	 *
	 * @return 아티클(글)에 대한 Full URL
	 */
	public String getUrl() {
		return url;
	}
	
	/**
	 * 아티클(글)에 대한 Full URL을 넣는다.
	 *
	 * @param url 아티클(글)에 대한 Full URL
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	/**
	 * ModifyRes 객체 에 있는 값들을 string 형태로 출력한다.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "ModifyRes [postId=" + postId + ", status=" + status
				+ ", url=" + url + "]";
	}
	
}
