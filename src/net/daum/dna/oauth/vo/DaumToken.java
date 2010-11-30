package net.daum.dna.oauth.vo;

// TODO: Auto-generated Javadoc
/**
 * The Class DaumToken.
 */
public class DaumToken {
	
	/** The token. */
	private String token;
	
	/** The token secret. */
	private String tokenSecret;
	
	/**
	 * Instantiates a new daum token.
	 */
	public DaumToken () {}

	/**
	 * Instantiates a new daum token.
	 *
	 * @param token the token
	 * @param tokenSecret the token secret
	 */
	public DaumToken(String token, String tokenSecret) {
		super();
		this.token = token;
		this.tokenSecret = tokenSecret;
	}

	/**
	 * Gets the token.
	 *
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * Sets the token.
	 *
	 * @param token the new token
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * Gets the token secret.
	 *
	 * @return the token secret
	 */
	public String getTokenSecret() {
		return tokenSecret;
	}

	/**
	 * Sets the token secret.
	 *
	 * @param tokenSecret the new token secret
	 */
	public void setTokenSecret(String tokenSecret) {
		this.tokenSecret = tokenSecret;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DaumToken [token=");
		builder.append(token);
		builder.append(", tokenSecret=");
		builder.append(tokenSecret);
		builder.append("]");
		return builder.toString();
	}
}
