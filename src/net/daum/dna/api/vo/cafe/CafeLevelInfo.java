package net.daum.dna.api.vo.cafe;

// TODO: Auto-generated Javadoc
/**
 * 카페 내의 알림 정보에서 사용자의 등업 정보를 담는 Class.
 * 
 * @author DAUM
 */

public class CafeLevelInfo {

	/** 카페의 이름. */
	private String cafeName;

	/** 해당 Cafe 의 Code. */
	private String cafeCode;

	/**
	 * 알림 종류 LEVEL_UP_ADMIN - 운영자로 승인됨 LEVEL_UP - 등업 됨 LEVEL_CHANGE - 등급이 변경됨
	 * (강등) ACCEPT_JOIN - 가입 승인됨 DISMISS_ADMIN - 운영자 또는 게시판 지기 해제됨.
	 */
	private String alimType;

	/** 해당 알림의 추가 설명. */
	private String alimDesc;

	/**
	 * Class 인스턴스화
	 */
	public CafeLevelInfo() {
	}

	/**
	 * Class 인스턴스화
	 * 
	 * @param cafeName
	 *            the cafe name
	 * @param cafeCode
	 *            the cafe code
	 * @param alimType
	 *            the alim type
	 * @param alimDesc
	 *            the alim desc
	 */
	public CafeLevelInfo(String cafeName, String cafeCode, String alimType,
			String alimDesc) {
		this.cafeName = cafeName;
		this.cafeCode = cafeCode;
		this.alimType = alimType;
		this.alimDesc = alimDesc;
	}

	/**
	 * cafe name 변수를 가져온다.
	 * 
	 * @return the cafe name
	 */
	public String getCafeName() {
		return cafeName;
	}

	/**
	 * cafe name 변수를 입력한다.
	 * 
	 * @param cafeName
	 *            the new cafe name
	 */
	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
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
	 * alim type 변수를 가져온다.
	 * 
	 * @return the alim type
	 */
	public String getAlimType() {
		return alimType;
	}

	/**
	 * alim type 변수를 입력한다.
	 * 
	 * @param alimType
	 *            the new alim type
	 */
	public void setAlimType(String alimType) {
		this.alimType = alimType;
	}

	/**
	 * 알림 정보의 추가설명 정보를 가져온다.
	 * 
	 * @return the alim desc
	 */
	public String getAlimDesc() {
		return alimDesc;
	}

	/**
	 * 알림 정보의 추가 설명 정보를 입력한다.
	 * 
	 * @param alimDesc
	 *            the new alim desc
	 */
	public void setAlimDesc(String alimDesc) {
		this.alimDesc = alimDesc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CafeAlimiUser [alimDesc=");
		builder.append(alimDesc);
		builder.append(", alimType=");
		builder.append(alimType);
		builder.append(", cafeCode=");
		builder.append(cafeCode);
		builder.append(", cafeName=");
		builder.append(cafeName);
		builder.append("]");
		return builder.toString();
	}
}
