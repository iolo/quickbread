package net.daum.dna.api.vo.blog;

import java.util.ArrayList;
import java.util.List;


/**
 * The Class Articles.
 */
public class BlogArticles {
	
	/** 응답코드. */
	private Integer status;
	
	/** 총아티클 수. */
	private Integer totalCount;
	
	/** 가장 큰 Post ID. */
	private Integer maxNo;
	
	/** 가장 작은 post ID. */
	private Integer minNo;
	
	/** 가장 최신날짜(형식:yyyymmddHHmiss). */
	private String maxDate;
	
	/** 가장 과거 날짜 (형식:yyyymmddHHmiss). */
	private String minDate;	
	
	/** 아티클 정보를 가지고 있는 아티클 리스트. */
	private List<BlogArticlesItem> articles;	
	/**
	 * Articles 객체를 생성한다.
	 */
	public BlogArticles() {
		articles = new ArrayList<BlogArticlesItem>();
	}
	
	/**
	 * Articles 객체를 생성하고  parameter값으로 초기화한다.
	 *
	 * @param status 응답코드
	 * @param totalCount 총 아티클 수
	 * @param maxNo 가장 큰 postId
	 * @param minNo 가장 작은 postId
	 * @param maxDate 가장 최신날짜
	 * @param minDate 가장 과거 날짜
	 * @param articles 아티클 정보를 가지고 있는 아티클 리스트
	 * 
	 */
	public BlogArticles(Integer status, Integer totalCount, Integer maxNo,
			Integer minNo, String maxDate, String minDate, List<BlogArticlesItem> articles) {
		this.status = status;
		this.totalCount = totalCount;
		this.maxNo = maxNo;
		this.minNo = minNo;
		this.maxDate = maxDate;
		this.minDate = minDate;
		this.articles = articles;
	}

	/**
	 * 응답코드.
	 *
	 * @return 응답코드를 반환한다.
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 응답코드를 넣는다.
	 * @param status 응답코드
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 전체의 아티클 수를 반환한다.
	 * @return 전체의 아티클 수
	 */
	public Integer getTotalCount() {
		return totalCount;
	}

	/**
	 * 전체의 아티클 수를 넣습니다.
	 *
	 * @param totalCount 전체의 아티클 수
	 */
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	
	/**
	 * 가장 큰 Post ID를 반환합니다.
	 * @return 가장 큰 Post ID
	 */
	public Integer getMaxNo() {
		return maxNo;
	}
	/**
	 * 가장 큰 Post ID를 넣습니다.
	 * @param maxNo 가장 큰 Post ID
	 */
	public void setMaxNo(Integer maxNo) {
		this.maxNo = maxNo;
	}
	
	/**
	 * 가장 작은 Post ID를 반환합니다.
	 *
	 * @return 가장 작은 Post ID
	 */
	public Integer getMinNo() {
		return minNo;
	}
	
	/**
	 * 페이지 내 가장 작은 Post ID를 넣습니다.
	 *
	 * @param minNo 가장 작은 Post ID
	 */
	public void setMinNo(Integer minNo) {
		this.minNo = minNo;
	}
	
	/**
	 * 아티클이 작성된 가장 최신 날짜를 반환합니다.
	 *
	 * @return 가장 최신 날짜 (형식:yyyymmddHHmiss)
	 */
	public String getMaxDate() {
		return maxDate;
	}
	
	/**
	 * 아티클이 작성된 가장 최신 날짜 (형식:yyyymmddHHmiss)를 넣습니다.
	 *
	 * @param maxDate the new max date
	 */
	public void setMaxDate(String maxDate) {
		this.maxDate = maxDate;
	}
	
	/**
	 * 아티클이 작성된 가장  과거 날짜를 반환합니다.
	 *
	 * @return 가장 과거 날짜 (형식:yyyymmddHHmiss)
	 */
	public String getMinDate() {
		return minDate;
	}
	
	/**
	 * Sets 가장 과거 날짜 (형식:yyyymmddHHmiss)
	 *
	 * @param minDate 가장 과거 날짜를 반한합니다.
	 */
	public void setMinDate(String minDate) {
		this.minDate = minDate;
	}
	
	/**
	 * 아티클 정보를 가지고 있는 아티클 리스트를 반환합니다.
	 *
	 * @return 아티클 정보를 가지고 있는 아티클 리스트
	 */
	public List<BlogArticlesItem> getArticles() {
		return articles;
	}
	
	/**
	 * 아티클 정보를 가지고 있는 아티클 리스트 넣습니다.
	 *
	 * @param articles 아티클 정보를 가지고 있는 아티클 리스트
	 */
	public void setArticles(List<BlogArticlesItem> articles) {
		this.articles = articles;
	}

	/**
	 * 아티클 리스트에서 특정한 아티클을 반환합니다.
	 * 
	 * @param index 특정한 아티클의 index
	 * @return 특정한 아티클
	 */
	public BlogArticlesItem getArticle(int index){
		
		return articles.get(index);
	}
	
	/**
	 * 아티클 리스트에 아티클을 추가합니다.
	 * @param article 아티클
	 */
	public void addArticle(BlogArticlesItem article){
		articles.add(article);
	}
	
	
	/**
	 * Articles 객체에 있는 값들을 string 형태로 출력한다.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Articles [maxDate=");
		builder.append(maxDate);
		builder.append(", maxNo=");
		builder.append(maxNo);
		builder.append(", minDate=");
		builder.append(minDate);
		builder.append(", minNo=");
		builder.append(minNo);
		builder.append(", posts=");
		builder.append(articles);
		builder.append(", status=");
		builder.append(status);
		builder.append(", totalCount=");
		builder.append(totalCount);
		builder.append("]");
		return builder.toString();
	}
	
}
