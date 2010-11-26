package net.daum.dna.api.vo.blog;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class RSSes.
 */
public class BlogRSSes {
	
	/** 응답코드 ( 200 : 성공 ) */
	private int status;
	
	/** RSS 목록 */
	private List<BlogRSS> rsses;
	
	/**
	 * RSSes 객체를 생성한다.
	 */
	public BlogRSSes () {
		rsses = new ArrayList<BlogRSS>();
	}
	
	/**
	 * RSSes 객체를 생성하고  parameter값으로 초기화한다.
	 *
	 * @param status 응답코드 ( 200 : 성공 )
	 * @param rsses RSS 목록
	 */
	public BlogRSSes(int status, List<BlogRSS> rsses) {
		super();
		this.status = status;
		this.rsses = rsses;
	}

	/**
	 *  응답코드를 반환한다.
	 *
	 * @return  응답코드
	 */
	public int getStatus() {
		return status;
	}
	
	/**
	 *  응답코드를 넣는다.
	 *
	 * @param status  응답코드
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	
	/**
	 * RSS 목록을 반환다.
	 *
	 * @return RSS 목록
	 */
	public List<BlogRSS> getRsses() {
		return rsses;
	}
	
	/**
	 * RSS 목록을 넣는다.
	 *
	 * @param rsses RSS 목록
	 */
	public void setRsses(List<BlogRSS> rsses) {
		this.rsses = rsses;
	}
	
	/**
	 * RSS를 넣는다.
	 *
	 * @param rss RSS
	 */
	public void addRss ( BlogRSS rss ) {
		rsses.add( rss );
	}
	
	/**
	 * RSS를 반환한다.
	 *
	 * @param index 특정 RSS의 index
	 * @return 특정 RSS 정보
	 */
	public BlogRSS getRss ( int index ) {
		return rsses.get( index );
	}
	
	/**
	 * RSSes 객체 에 있는 값들을 string 형태로 출력한다.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RSSes [rsses=");
		builder.append(rsses);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
}
