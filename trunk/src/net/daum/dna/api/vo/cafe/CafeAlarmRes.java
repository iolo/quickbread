package net.daum.dna.api.vo.cafe;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * Cafe 의 내글에 반응 Class 와 등업정보 Class 를 포함한다.
 * 
 * @author DAUM
 */

public class CafeAlarmRes {

	/** 내 글에 반응정보를 가지고 있는 Class List. */
	private List<CafeActivityRes> cafeActiveRes;

	/** Cafe 내의 나의 등업 정보를 가지고 있는 Class. */
	private List<CafeLevelInfo> cafeLevelInfo;

	/**
	 * Class 인스턴스화
	 */
	public CafeAlarmRes() {
		cafeActiveRes = new ArrayList<CafeActivityRes>();
		cafeLevelInfo = new ArrayList<CafeLevelInfo>();
	}

	/**
	 * Class 인스턴스화
	 * 
	 * @param cafeActiveActivityRes
	 *            the cafe active activity res
	 * @param cafeLevelInfo
	 *            the level info
	 */
	public CafeAlarmRes(List<CafeActivityRes> cafeActiveActivityRes,
			List<CafeLevelInfo> cafeLevelInfo) {
		this.cafeActiveRes = cafeActiveActivityRes;
		this.cafeLevelInfo = cafeLevelInfo;
	}

	/**
	 * cafe active res 객체를 불러온다.
	 * 
	 * @return the cafe active res
	 */
	public List<CafeActivityRes> getCafeActiveRes() {
		return cafeActiveRes;
	}

	/**
	 * cafe active res 객체를 입력한다.
	 * 
	 * @param cafeActiveRes
	 *            the new cafe active res
	 */
	public void setCafeActiveRes(CafeActivityRes cafeActiveRes) {
		this.cafeActiveRes.add(cafeActiveRes);
	}

	/**
	 * cafe level info 객체를 불러온다.
	 * 
	 * @return the cafe level info
	 */
	public List<CafeLevelInfo> getCafeLevelInfo() {
		return cafeLevelInfo;
	}

	/**
	 * cafe level info 객체를 입력한다.
	 * 
	 * @param cafeLevelInfo
	 *            the new cafe level info
	 */
	public void setCafeLevelInfo(CafeLevelInfo cafeLevelInfo) {
		this.cafeLevelInfo.add(cafeLevelInfo);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CafeAlarmRes [cafeActiveRes=" + cafeActiveRes
				+ ", cafeLevelInfo=" + cafeLevelInfo + "]";
	}

}
