package net.daum.dna.oauth.vo;

// TODO: Auto-generated Javadoc
/**
 * The Class DaumConsumer.
 */
public class DaumConsumer {
	
	/** The key. */
	private String key;
	
	/** The secret. */
	private String secret;
	
	/** The callback. */
	private String callback;
	
	/**
	 * Instantiates a new daum consumer.
	 */
	public DaumConsumer() {}

	/**
	 * Instantiates a new daum consumer.
	 *
	 * @param key the key
	 * @param secret the secret
	 * @param callback the callback
	 */
	public DaumConsumer(String key, String secret, String callback) {
		this.key = key;
		this.secret = secret;
		this.callback = callback;
	}

	/**
	 * Gets the key.
	 *
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Sets the key.
	 *
	 * @param key the new key
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * Gets the secret.
	 *
	 * @return the secret
	 */
	public String getSecret() {
		return secret;
	}

	/**
	 * Sets the secret.
	 *
	 * @param secret the new secret
	 */
	public void setSecret(String secret) {
		this.secret = secret;
	}

	/**
	 * Gets the callback.
	 *
	 * @return the callback
	 */
	public String getCallback() {
		return callback;
	}

	/**
	 * Sets the callback.
	 *
	 * @param callback the new callback
	 */
	public void setCallback(String callback) {
		this.callback = callback;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DaumConsumer [callback=");
		builder.append(callback);
		builder.append(", key=");
		builder.append(key);
		builder.append(", secret=");
		builder.append(secret);
		builder.append("]");
		return builder.toString();
	}
	
}
