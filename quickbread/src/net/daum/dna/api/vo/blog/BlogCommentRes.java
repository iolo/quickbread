package net.daum.dna.api.vo.blog;

public class BlogCommentRes {
	
	/** 응답코드 */
	private int status;

	public BlogCommentRes() {}
	
	public BlogCommentRes(int status) {
		super();
		this.status = status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "blogCommentRes [status=" + status + "]";
	}

}
