package net.daum.dna.api.vo.yozm;

// TODO: Auto-generated Javadoc
/**
 * 일반 글 또는 반응글을 작성시 정보를 담는 Class.
 *
 * @author DAUM
 */

public class YozmWriteRes {
	
	/** 반응글의 원본 Class. */
	private YozmArticle parentArticle;
	
	/** 원본 글의 정보를 담는 Class. */
	private YozmArticle writeArticle;
	
	/**
	 * Class 인스턴스화.
	 */
	public YozmWriteRes () {
		this.parentArticle = new YozmArticle();
		this.writeArticle = new YozmArticle();
	}
	
	/**
	 * Class 인스턴스화.
	 *
	 * @param parentArticle the parent article
	 * @param writeArticle the write article
	 */
	public YozmWriteRes(YozmArticle parentArticle, YozmArticle writeArticle) {
		this.parentArticle = parentArticle;
		this.writeArticle = writeArticle;
	}

	/**
	 * parent article 객체를 가져온다.
	 *
	 * @return the parent article
	 */
	public YozmArticle getParentArticle() {
		return parentArticle;
	}

	/**
	 * parent article 객체를 입력한다.
	 *
	 * @param parentArticle the new parent article
	 */
	public void setParentArticle(YozmArticle parentArticle) {
		this.parentArticle = parentArticle;
	}

	/**
	 * write article 객체를 가져온다.
	 *
	 * @return the write article
	 */
	public YozmArticle getWriteArticle() {
		return writeArticle;
	}

	/**
	 * write article 객체를 입력한다.
	 *
	 * @param writeArticle the new write article
	 */
	public void setWriteArticle(YozmArticle writeArticle) {
		this.writeArticle = writeArticle;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YozmWriteRes [parentArticle=");
		builder.append(parentArticle);
		builder.append(", writeArticle=");
		builder.append(writeArticle);
		builder.append("]");
		return builder.toString();
	}
}