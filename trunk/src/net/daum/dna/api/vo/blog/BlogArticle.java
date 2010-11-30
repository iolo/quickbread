package net.daum.dna.api.vo.blog;

import java.util.ArrayList;
import java.util.List;

public class BlogArticle {

	/**
	 * 응답코드 ( 200 - 성공)
	 */
	private Integer status; 
	/**
	 * 글 번호
	 */
	private Integer postId;
	/**
	 * 글 제목
	 */
	private String title;
	/**
	 * 아티클(글)의  내용
	 */
	private String content;
	/**
	 * 글쓴이 닉네임
	 */
	private String nickname;
	/**
	 * 댓글 수 
	 */
	private Integer comments;
	/**
	 * 트랙백 수 
	 */
	private String trackbacks;
	/**
	 * 글에 대한 태그
	 */
	private String tag;
	/**
	 * 아티클(글)에 대한 Full URL
	 */
	private String url;
	/**
	 * 작성날짜
	 */
	private String date;
	/**
	 * 카테고리id ( ex) "1"
	 */
	private String categoryId;
	/**
	 * 카테고리 이름 ( ex) "식물", "동물"
	 */
	private String categoryName;
	/**
	 * 
	 */
	private String scrapPrmtKind;
	/**
	 * 검색 허용 여부 ex) "Y" - 허용
	 */
	private String searchPrmt;
	/**
	 * 글 공개 여부
	 */
	private String open;
	/**
	 * 아티클(글)에 삽입된 이미지 URL들
	 */
	private List<String> imageUrls;
	/**
	 * 이전 글 노드
	 * 이전글이 없을 경우에는 null값을 갖는다.
	 */
	private BlogPreArticle preArticle;
	/**
	 * 다음 글 노드
	 * 다음글이 없는경우에는 null값을 갖는다.
	 */
	private BlogNextArticle nextArticle;

	
	/**
	 * Acticle 객체를 생성한다.
	 */
	public BlogArticle() {	
		imageUrls = new ArrayList<String>();
		preArticle = new BlogPreArticle();
		nextArticle = new BlogNextArticle();
	}
	
	/**
	 * Article 객체를 생성하고  parameter값으로 초기화한다.
	 * @param status
	 * @param postId
	 * @param title
	 * @param content
	 * @param nickname
	 * @param comments
	 * @param trackbacks
	 * @param tag
	 * @param url
	 * @param date
	 * @param categoryId
	 * @param categoryName
	 * @param scrapPrmtKind
	 * @param searchPrmt
	 * @param open
	 * @param imageUrls
	 * @param preArticle
	 * @param nextArticle
	 */
	
	public BlogArticle(Integer status, Integer postId, String title,
			String content, String nickname, Integer comments,
			String trackbacks, String tag, String url, String date,
			String categoryId, String categoryName, String scrapPrmtKind,
			String searchPrmt, String open, List<String> imageUrls,
			BlogPreArticle preArticle, BlogNextArticle nextArticle) {
		super();
		this.status = status;
		this.postId = postId;
		this.title = title;
		this.content = content;
		this.nickname = nickname;
		this.comments = comments;
		this.trackbacks = trackbacks;
		this.tag = tag;
		this.url = url;
		this.date = date;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.scrapPrmtKind = scrapPrmtKind;
		this.searchPrmt = searchPrmt;
		this.open = open;
		this.imageUrls = imageUrls;
		this.preArticle = preArticle;
		this.nextArticle = nextArticle;
	}


	/**
	 * 응답코드를 반환한다.
	 * @return 응답코드
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
	 * 글 번호를 반환한다.
	 * @return 글 번호
	 */
	public Integer getPostId() {
		return postId;
	}	
	/**
	 * 글번호를 넣는다.
	 * @param postId 글번호
	 */
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	/**
	 * 아티클(글)에 대한 Full URL를 반환한다.
	 * @return 아티클(글)에 대한 Full URL
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 아티클(글)에 대한 Full URL를 넣는다.
	 * @param url 아티클(글)에 대한 Full URL
	 */
	public void setUrl(String url) {
		this.url = url;
	}	
	/**
	 * 글 제목을 반환한다.
	 * @return 글 제목
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 글 제목을 넣는다.
	 * @param title 글 제목
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 아티클(글)의  내용을 반환한다.
	 * @return 아티클(글)의  내용
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 아티클(글)의  내용을 넣는다.
	 * @param content 아티클(글)의  내용
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 글쓴이 닉네임을 반환한다.
	 * @return 글쓴이 닉네임
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * 글쓴이 닉네임을 넣는다
	 * @param nickname 글쓴이 닉네임
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * 댓글수를 반환한다.
	 * @return 댓글 수 
	 */
	public Integer getComments() {
		return comments;
	}
	/**
	 * 댓글 수 를 넣는다.
	 * @param comments 댓글 수 
	 */
	public void setComments(Integer comments) {
		this.comments = comments;
	}
	/**
	 * 트랙백 수를 반환한다.
	 * @return 트랙백 수
	 */
	public String getTrackbacks() {
		return trackbacks;
	}
	/**
	 * 트랙백 수를 넣는다.
	 * @param trackbacks 트랙백 수
	 */
	public void setTrackbacks(String trackbacks) {
		this.trackbacks = trackbacks;
	}
	/**
	 * 태그를 반환한다.
	 * @return 태그
	 */
	public String getTag() {
		return tag;
	}
	/**
	 * 태그를 넣는다.
	 * @param tag 태그
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}
	/**
	 * 작성날짜를 반환한다.
	 * @return 작성날짜
	 */
	public String getDate() {
		return date;
	}
	/**
	 * 작성날짜를 넣는다.
	 * @param date 작성날짜
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * 카테고리 Id를 반환한다.
	 * @return 카테고리 Id
	 */
	public String getCategoryId() {
		return categoryId;
	}
	/**
	 * 카테고리 Id 를 넣는다.
	 * @param categoryId 카테고리 Id
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * 카테고리 이름을 반환한다.
	 * @return 카테고리 이름
	 */
	public String getCategoryName() {
		return categoryName;
	}
	/**
	 * 카테고리 이름를 넣는다.
	 * @param categoryName 카테고리 이름
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	/**
	 * 
	 * @return scrapPrmtKind
	 */
	public String getScrapPrmtKind() {
		return scrapPrmtKind;
	}

	/**
	 * 
	 * @param scrapPrmtKind
	 */
	public void setScrapPrmtKind(String scrapPrmtKind) {
		this.scrapPrmtKind = scrapPrmtKind;
	}
	/**
	 * 검색 허용 여부를 알려준다.
	 * @return 검색 허용 여부
	 */
	public String getSearchPrmt() {
		return searchPrmt;
	}
	/**
	 * 검색 허용 여부 설정한다.
	 * @param searchPrmt 검색 허용 여부
	 */
	public void setSearchPrmt(String searchPrmt) {
		this.searchPrmt = searchPrmt;
	}
	/**
	 * 글 공개 여부를 알려준다.
	 * @return 글 공개 여부
	 */
	public String getOpen() {
		return open;
	}
	/**
	 * 글 공개 여부를 설정한다. (BlogAPI에 static final 로 설정되어있다.
	 * _ARTICLE_OPEN or _ARTICLE_CLOSE = "N" or _ARTICLE_FRIEND_OPEN 중 하나 선택가능
	 * @param open 글 공개 여부 
	 */
	public void setOpen(String open) {
		this.open = open;
	}
	/**
	 * 아티클(글)에 삽입된 이미지 URL들을 반환한다.
	 * @return 아티클(글)에 삽입된 이미지 URL들
	 */
	public List<String> getImageUrls() {
		return imageUrls;
	}
	/**
	 * 아티클(글)에 삽입된 이미지 URL들을 넣는다.
	 * @param imageUrls 아티클(글)에 삽입된 이미지 URL들
	 */
	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}	
	/**
	 * 이전 글 노드를 반환한다.
	 * @return 이전 글 노드
	 */
	public BlogPreArticle getpreArticle() {
		return preArticle;
	}
	/**
	 * 이전 글 노드를 설정한다.
	 * @param preArticle 이전 글 노드
	 */
	public void setpreArticle(BlogPreArticle preArticle) {
		this.preArticle = preArticle;
	}
	/**
	 * 다음 글 노드를 반환한다.
	 * @return 다음 글 노드
	 */
	public BlogNextArticle getNextArticle() {
		return nextArticle;
	}
	/**
	 * 다음 글 노드를 설정한다.
	 * @param nextArticle 다음 글 노드
	 */
	public void setNextArticle(BlogNextArticle nextArticle) {
		this.nextArticle = nextArticle;
	}

	/**
	 * Article 객체에 있는 값들을 string 형태로 출력한다.
	 */
	@Override
	public String toString() {
		return "Article [categoryId=" + categoryId + ", categoryName="
				+ categoryName + ", comments=" + comments + ", content="
				+ content + ", date=" + date + ", imageUrls=" + imageUrls
				+ ", nextArticle=" + nextArticle + ", nickname=" + nickname
				+ ", open=" + open + ", postId=" + postId + ", preArticle="
				+ preArticle + ", scrapPrmtKind=" + scrapPrmtKind
				+ ", searchPrmt=" + searchPrmt + ", status=" + status
				+ ", tag=" + tag + ", title=" + title + ", trackbacks="
				+ trackbacks + ", url=" + url + "]";
	}
	
}
