package net.daum.dna.api.vo.blog;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Categories.
 */
public class BlogCategories {
	
	/** 응답코드 */
	private Integer status;
	
	/** 카테고리 목록 */
	private List<BlogCategory> categories;
	
	/**
	 * Categories 객체를 생성한다.
	 */
	public BlogCategories() {
		categories = new ArrayList<BlogCategory>();
	}
	
	/**
	 * Categories 객체를 생성하고  parameter값으로 초기화한다.
	 *
	 * @param status 응답코드
	 * @param categories 카테고리 목록
	 */
	public BlogCategories(Integer status, List<BlogCategory> categories) {
		this.status = status;
		this.categories = categories;
	}

	/**
	 * 응답코드를 반환합니다.
	 *
	 * @return 응답코드
	 */
	public Integer getStatus() {
		return status;
	}
	
	/**
	 * 응답코드를 넣습니다.
	 *
	 * @param status 응답코드
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	/**
	 * 카테고리 목록을 반환합니다.
	 *
	 * @return 카테고리 목록
	 */
	public List<BlogCategory> getCategories() {
		return categories;
	}
	
	/**
	 * 카테고리 목록을 넣습니다.
	 *
	 * @param categories 카테고리 목록
	 */
	public void setCategories(List<BlogCategory> categories) {
		this.categories = categories;
	}
	
	/**
	 * 카테고리를 카테고리 목록에 추가합니다.
	 *
	 * @param category 카테고리
	 */
	public void addCategory (BlogCategory category) {
		categories.add( category );
	}
	
	/**
	 * 지정한 index의 카테고리를 반환합니다.
	 *
	 * @param index 인덱스
	 * @return 지정한 index의 카테고리
	 */
	public BlogCategory getCategory ( int index ) {
		return categories.get(index);
	}
	
	/**
	 * Categories 객체 에 있는 값들을 string 형태로 출력한다.
	 *
	 * @return the string
	 */
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Categories [categories=");
		builder.append(categories);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
}
