package net.daum.dna.api.vo.blog;

// TODO: Auto-generated Javadoc
/**
 * The Class Category.
 */
public class BlogCategory {
	
	/** 카테고리 id. */
	private int categoryId;
	
	/** 카테고리 공개 여부*/
	private String open;
	
	/** 카테고리 이름*/
	private String name;
	
	/**
	 * Category 객체를 생성한다.
	 */
	public BlogCategory() {}

	/**
	 * Category 객체를 생성하고  parameter값으로 초기화한다.
	 *
	 * @param categoryId 카테고리 id
	 * @param open 카테고리 공개 여부
	 * @param name 카테고리 이름
	 */
	public BlogCategory(int categoryId, String open, String name) {
		super();
		this.categoryId = categoryId;
		this.open = open;
		this.name = name;
	}



	/**
	 * 카테고리 id를 반환합니다.
	 *
	 * @return 카테고리 id
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * 카테고리 id를 넣습니다.
	 *
	 * @param categoryId 카테고리 id
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * 카테고리 공개여부를 반환합니다.
	 *
	 * @return 카테고리 공개 여부
	 */
	public String getOpen() {
		return open;
	}

	/**
	 * 카테고리 공개 여부를 설정합니다.
	 *
	 * @param open 카테고리 공개 여부
	 */
	public void setOpen(String open) {
		this.open = open;
	}

	/**
	 * 카테고리 이름을 반환합니다.
	 *
	 * @return 카테고리 이름
	 */
	public String getName() {
		return name;
	}

	/**
	 * 카테고리 이름을 설정합니다.
	 *
	 * @param name 카테고리 이름
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Category 객체에 있는 값들을 string 형태로 출력한다.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Category [categoryId=");
		builder.append(categoryId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", open=");
		builder.append(open);
		builder.append("]");
		return builder.toString();
	}
	
}
