package net.daum.dna.api.vo.blog;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class BlogActivityReses.
 */
public class BlogActivityReses {
	
	/** 응답코드 ( 200 - 성공). */
	private Integer status;
	
	/** 내가 작성한 아티클에 대한 반응글들. */
	private List<BlogActivityRes> activities;
	
	/**
	 * ActivityReses 객체를 생성한다.
	 */
	public BlogActivityReses() {
		activities = new ArrayList<BlogActivityRes>();
	};
	
	/**
	 * ActivityReses 객체를 생성하고, parameter값으로 초기화한다.
	 *
	 * @param status 응답코드 ( 200 - 성공)
	 * @param activities 내가 작성한 아티클에 대한 반응글들
	 */
	public BlogActivityReses(Integer status,
			List<BlogActivityRes> activities) {
		super();
		this.status = status;
		this.activities = activities;
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
	 * 내가 작성한 아티클의  반응글들을 반환한다. 
	 * 
	 * @return 내가 작성한 아티클의  반응글들
	 */
	public List<BlogActivityRes> getActivities() {
		return activities;
	}

	/**
	 * 내가 작성한 아티클의 반응글들을 넣는다.
	 * 
	 * @param activities 내가 작성한 아티클의 반응글들
	 */
	public void setActivities(List<BlogActivityRes> activities) {
		this.activities = activities;
	}

	
	/**
	 * 내가 작성한 아티클에 대한 반응글을 추가한다.
	 *
	 * @param blogActivityRes 내가 작성한 아티클에 대한 반응글
	 */
	public void addActivity(BlogActivityRes blogActivityRes){
		activities.add(blogActivityRes);
	}
	
	/**
	 * 특정한 반응글을 반환한다.
	 *
	 * @param index 특정한 반응글에 대한 index
	 * @return index에 대한 반응글
	 */
	public BlogActivityRes getActivity(int index){
		return activities.get(index);
	}
	
	
	/**
	 * ActivityReses 객체 에 있는 값들을 string 형태로 출력한다.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "BlogActivityReses [activities=" + activities + ", status="
				+ status + "]";
	}


}
