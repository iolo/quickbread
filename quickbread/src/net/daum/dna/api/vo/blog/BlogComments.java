package net.daum.dna.api.vo.blog;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Comments.
 */
public class BlogComments {
	
	/** 응답코드 */
	private int status;
	
	/** 총 댓글 수  */
	private int totalCount;
	
	/** 코멘트 목록 */
	private List<BlogComment> comments;
	
	/**
	 * Comments 객체를 생성한다.
	 */
	public BlogComments () {
		this.comments = new ArrayList<BlogComment>();
	}

	/**
	 * Comments 객체를 생성하고  parameter값으로 초기화한다.
	 *
	 * @param status 응답코드
	 * @param totalCount 총 댓글 수 
	 * @param comments 코멘트 목록
	 */
	public BlogComments(int status, int totalCount, List<BlogComment> comments) {
		super();
		this.status = status;
		this.totalCount = totalCount;
		this.comments = comments;
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
	 * 총 댓글 수 를 반환합니다.
	 *
	 * @return 총 댓글 수 
	 */
	public int getTotalCount() {
		return totalCount;
	}

	/**
	 * 총 댓글 수를 넣습니다.
	 *
	 * @param totalCount 총 댓글 수
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * 코멘트 목록을 반환합니다.
	 *
	 * @return 코멘트 목록
	 */
	public List<BlogComment> getComments() {
		return comments;
	}

	/**
	 * 코멘트 목록을 넣습니다.
	 *
	 * @param comments 코멘트 목록
	 */
	public void setComments(List<BlogComment> comments) {
		this.comments = comments;
	}
	
	/**
	 * 코멘트를 추가합니다.
	 *
	 * @param comment 코멘트
	 */
	public void addComment ( BlogComment comment ) {
		comments.add( comment );
	}
	
	/**
	 * 특정 index의 코멘트를 얻습니다.
	 *
	 * @param index the index
	 * @return 코멘트
	 */
	public BlogComment getComment ( int index ) {
		return comments.get( index );
	}

	/**
	 * Comments 객체 에 있는 값들을 string 형태로 출력한다.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Comments [comments=" + comments + ", status=" + status
				+ ", totalCount=" + totalCount + "]";
	}
	
}
