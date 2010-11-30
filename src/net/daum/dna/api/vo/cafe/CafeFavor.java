package net.daum.dna.api.vo.cafe;

// TODO: Auto-generated Javadoc
/**
 * 사용자가 자주 가는 Cafe 목록을 담는 Class.
 * 
 * @author DAUM
 */

public class CafeFavor {

	/** 해당 Cafe 의 Code. */
	private String cafeCode;

	/** 해당 Cafe 의 이름. */
	private String name;

	/** 새글의 존재 여부. */
	private boolean updated;

	/**
	 * Class 인스턴스화
	 */
	public CafeFavor() {
	}

	/**
	 * Class 인스턴스화
	 * 
	 * @param cafeCode
	 *            the cafe code
	 * @param name
	 *            the name
	 * @param updated
	 *            the updated
	 */
	public CafeFavor(String cafeCode, String name, boolean updated) {
		this.cafeCode = cafeCode;
		this.name = name;
		this.updated = updated;
	}

	/**
	 * cafe code 변수를 가져온다.
	 * 
	 * @return the cafe code
	 */
	public String getCafeCode() {
		return cafeCode;
	}

	/**
	 * cafe code 변수를 입력한다.
	 * 
	 * @param cafeCode
	 *            the new cafe code
	 */
	public void setCafeCode(String cafeCode) {
		this.cafeCode = cafeCode;
	}

	/**
	 * name 변수를 가져온다.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * name 변수를 입력한다.
	 * 
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 새글의 존재 여부를 가져온다.
	 * 
	 * @return true, if is updated
	 */
	public boolean isUpdated() {
		return updated;
	}

	/**
	 * 새글의 존재 여부를 입력한다.
	 * 
	 * @param updated
	 *            the new updated
	 */
	public void setUpdated(boolean updated) {
		this.updated = updated;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CafeFavorite [cafeCode=");
		builder.append(cafeCode);
		builder.append(", name=");
		builder.append(name);
		builder.append(", updated=");
		builder.append(updated);
		builder.append("]");
		return builder.toString();
	}
}
