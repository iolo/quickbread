package net.daum.dna.api.vo.blog;

// TODO: Auto-generated Javadoc
/**
 * The Class RSS.
 */
public class BlogRSS {
	
	/** 아티클(글) 제목*/
	private String title;
	
	/** 아티클(글) 본문*/
	private String content;
	
	/** 아티클(글)에 대한 주소*/
	private String link;
	
	/** 아티클(글)을 작성한 시간*/
	private String pubDate;
	
	/** 아티클(글) 작성자 */
	private String author;
	
	/** 이미지URL*/
	private String enclosure;
	
	/**
	 * RSS 객체를 생성한다.
	 */
	public BlogRSS() {}
	
	/**
	 * RSS 객체를 생성하고  parameter값으로 초기화한다.
	 *
	 * @param title 아티클(글) 제목
	 * @param content 아티클(글) 본문
	 * @param link the 아티클(글)에 대한 주소
	 * @param pubDate 아티클(글)을 작성한 시간
	 * @param author 아티클(글) 작성자
	 * @param enclosure 이미지URL
	 */
	public BlogRSS(String title, String content, String link, String pubDate,
			String author, String enclosure) {
		super();
		this.title = title;
		this.content = content;
		this.link = link;
		this.pubDate = pubDate;
		this.author = author;
		this.enclosure = enclosure;
	}



	/**
	 * 아티클(글) 제목을 반환한다.
	 *
	 * @return 아티클(글) 제목
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * 아티클(글) 제목을 넣는다.
	 *
	 * @param title 아티클(글) 제목
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * 아티클(글) 본문을 반환한다.
	 *
	 * @return 아티클(글) 본문
	 */
	public String getContent() {
		return content;
	}
	
	/**
	 * 아티클(글) 본문을 넣는다.
	 *
	 * @param content 아티클(글) 본문
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * 아티클(글)에 대한 주소를 반환한다.
	 *
	 * @return 아티클(글)에 대한 주소
	 */
	public String getLink() {
		return link;
	}
	
	/**
	 * 아티클(글)에 대한 주소를넣는다.
	 *
	 * @param link 아티클(글)에 대한 주소
	 */
	public void setLink(String link) {
		this.link = link;
	}
	
	/**
	 * 아티클(글)을 작성시간을  반환한다.
	 *
	 * @return 아티클(글)을 작성한 시간
	 */
	public String getPubDate() {
		return pubDate;
	}
	
	/**
	 *  아티클(글)을 작성시간을 넣는다
	 *
	 * @param pubDate 아티클(글)을 작성한 시간
	 */
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	
	/**
	 * 아티클(글) 작성자를 반환한다.
	 *
	 * @return 작성자
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * 아티클(글)작성자를 넣는다.
	 *
	 * @param author 아티클(글) 작성자
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * 이미지URL을 반환한다.
	 *
	 * @return 이미지URL
	 */
	public String getEnclosure() {
		return enclosure;
	}
	
	/**
	 * 이미지URL을 넣는다
	 *
	 * @param enclosure 이미지URL
	 */
	public void setEnclosure(String enclosure) {
		this.enclosure = enclosure;
	}
	
	/**
	 * RSS 객체 에 있는 값들을 string 형태로 출력한다.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "RSS [author=" + author + ", content=" + content
				+ ", enclosure=" + enclosure + ", link=" + link + ", pubDate="
				+ pubDate + ", title=" + title + "]";
	}

}
