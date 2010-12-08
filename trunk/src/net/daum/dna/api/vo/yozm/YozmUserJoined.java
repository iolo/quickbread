package net.daum.dna.api.vo.yozm;


// TODO: Auto-generated Javadoc
/**
 * The Class YozmJoinInfo.
 */
public class YozmUserJoined {

	/** Yozm 가입 여부 */
	private boolean joined;

	/**
	 * Checks if is joined.
	 *
	 * @return true, if is joined
	 */
	public boolean isJoined() {
		return joined;
	}

	/**
	 * Sets the joined.
	 *
	 * @param joined the new joined
	 */
	public void setJoined(boolean joined) {
		this.joined = joined;
	}

	@Override
	public String toString() {
		return "YozmUserJoined [joined=" + joined + "]";
	}

}
