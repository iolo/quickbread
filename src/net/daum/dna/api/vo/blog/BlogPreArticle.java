package net.daum.dna.api.vo.blog;

// TODO: Auto-generated Javadoc
/**
 * The Class PreArticle.
 */
public class BlogPreArticle {

	/** 이전 아티클(글)의 id*/
	private String id;
	
	/** 이전 아티클(글)의 제목*/
	private String title;
	
	/**
	 * PreArticle 객체를 생성한다.
	 */
	public BlogPreArticle() {};
	
	/**
	 * PreArticle 객체를 생성하고  parameter값으로 초기화한다.
	 *
	 * @param id 이전 아티클(글)의 id
	 * @param title 이전 아티클(글)의 제목
	 */
	public BlogPreArticle(String id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
	/**
	 * 이전 아티클(글)의 id를 반환한다.
	 *
	 * @return 이전 아티클(글)의 id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * 이전 아티클(글)의 id를 넣는다.
	 *
	 * @param id 이전 아티클(글)의 id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * 이전 아티클(글)의 제목을 반환한다.
	 *
	 * @return 이전 아티클(글)의 제목
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * 이전 아티클(글)의 제목을 넣는다.
	 *
	 * @param title 이전 아티클(글)의 제목
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * PreArticle 객체 에 있는 값들을 string 형태로 출력한다.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "PreArticle [id=" + id + ", title=" + title + "]";
	}
		
}
