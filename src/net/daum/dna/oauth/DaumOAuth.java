package net.daum.dna.oauth;

import net.daum.dna.oauth.vo.DaumToken;
import oauth.signpost.OAuthConsumer;

// TODO: Auto-generated Javadoc
/**
 * The Interface DaumOAuth.
 */
public interface DaumOAuth extends OAuthConsumer{
	
	/**
	 * Gets the authorize url.
	 *
	 * @return the authorize url
	 * @throws Exception 
	 */
	public String getAuthorizeURL () throws Exception;
	
	/**
	 * Gets the authorize url.
	 *
	 * @param callback the callback
	 * @return the authorize url
	 * @throws Exception 
	 */
	public String getAuthorizeURL ( String callback ) throws Exception;
	
	/**
	 * Gets the access token.
	 *
	 * @param verifier the verifier
	 * @return the access token
	 * @throws Exception 
	 */
	public DaumToken getAccessToken ( String verifier ) throws Exception;
	
	/**
	 * Sets the access token.
	 *
	 * @param token the token
	 * @param tokenSecret the token secret
	 */
	public void setAccessToken ( String token, String tokenSecret );
	
	/**
	 * Sets the access token.
	 *
	 * @param token the new access token
	 */
	public void setAccessToken ( DaumToken token );
}
