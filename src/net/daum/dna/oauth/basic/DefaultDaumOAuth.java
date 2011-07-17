package net.daum.dna.oauth.basic;

import net.daum.dna.exception.OAuthCommonException;
import net.daum.dna.oauth.DaumOAuth;
import net.daum.dna.oauth.vo.DaumConsumer;
import net.daum.dna.oauth.vo.DaumToken;
import oauth.signpost.OAuthProvider;
import oauth.signpost.basic.DefaultOAuthConsumer;
import oauth.signpost.basic.DefaultOAuthProvider;

// TODO: Auto-generated Javadoc
/**
 * The Class DefaultDaumOAuth.
 */
@SuppressWarnings("serial")
public class DefaultDaumOAuth extends DefaultOAuthConsumer implements DaumOAuth {


	/** The request token url. */
	private final String _REQUEST_TOKEN_URL 	= "https://apis.daum.net/oauth/requestToken";
	
	/** The access token url. */
	private final String _ACCESS_TOKEN_URL 		= "https://apis.daum.net/oauth/accessToken";
	
	/** The authorize url. */
	private final String _AUTHORIZE_URL 		= "https://apis.daum.net/oauth/authorize";
	
	/** The oauth provider. */
	private OAuthProvider oauthProvider;
	
	/** The callback. */
	private String callback = "oob";

	/**
	 * Instantiates a new default daum oauth.
	 *
	 * @param consumer the consumer
	 * @throws Exception the exception
	 */
	public DefaultDaumOAuth( DaumConsumer consumer ) throws Exception {
		super( consumer.getKey(), consumer.getSecret() );
		this.callback = consumer.getCallback(); 
		try {
			 this.oauthProvider = createOAuthProvider();
		} catch (Exception e) {
			throw new OAuthCommonException();
		}
	}
	
	/**
	 * Instantiates a new default daum oauth.
	 *
	 * @param consumerKey the consumer key
	 * @param consumerSecret the consumer secret
	 */
	public DefaultDaumOAuth(String consumerKey, String consumerSecret) throws Exception {
		super(consumerKey, consumerSecret);
		try {
			this.oauthProvider = createOAuthProvider();		
		} catch (Exception e1) {				
			e1.printStackTrace();
			throw new OAuthCommonException();
		}
		
	}
	
	/**
	 * Instantiates a new default daum oauth.
	 *
	 * @param consumerKey the consumer key
	 * @param consumerSecret the consumer secret
	 * @param callback the callback
	 */
	public DefaultDaumOAuth( String consumerKey, String consumerSecret, String callback ) throws Exception{
		super(consumerKey, consumerSecret);
		try {
			this.oauthProvider = createOAuthProvider();
			this.callback = callback;
		} catch (Exception e) {
			throw new OAuthCommonException();
		}
	}
	
	/**
	 * Instantiates a new default daum oauth.
	 *
	 * @param consumer the consumer
	 * @param token the token
	 */
	public DefaultDaumOAuth ( DaumConsumer consumer, DaumToken token ) throws Exception{
		super( consumer.getKey(), consumer.getSecret() );
		try {
			this.setTokenWithSecret( token.getToken(), token.getTokenSecret() );
		} catch (Exception e) {
			throw new OAuthCommonException();
		}
	}
	
	/* (non-Javadoc)
	 * @see net.daum.dna.oauth.DaumOAuth#getAuthorizeURL()
	 */
	public String getAuthorizeURL() throws Exception {
		String authURL = null;
		try {
			authURL =  oauthProvider.retrieveRequestToken( this, this.callback ) ;
		}catch (Exception e) {
			throw new OAuthCommonException();
		}
		return authURL;
	}
	
	/* (non-Javadoc)
	 * @see net.daum.dna.oauth.DaumOAuth#getAuthorizeURL(java.lang.String)
	 */
	public String getAuthorizeURL ( String callback ) throws Exception {
		String authURL = null;
		try {
			authURL =  oauthProvider.retrieveRequestToken( this, callback );
		}catch (Exception e) {
			throw new OAuthCommonException();
		}
		return authURL;
	}
	
	/* (non-Javadoc)
	 * @see net.daum.dna.oauth.DaumOAuth#getAccessToken(java.lang.String)
	 */
	public DaumToken getAccessToken ( String verifier ) throws Exception{
		DaumToken token = new DaumToken();
		try {
			oauthProvider.retrieveAccessToken( this, verifier);
			token.setToken( this.getToken() );
			token.setTokenSecret( this.getTokenSecret() );
		} catch (Exception e) {
			throw new OAuthCommonException();
		}
		return token;
	}
	
	/* (non-Javadoc)
	 * @see net.daum.dna.oauth.DaumOAuth#setAccessToken(java.lang.String, java.lang.String)
	 */
	public void setAccessToken ( String token, String tokenSecret ) {
		this.setTokenWithSecret( token, tokenSecret );
	}
	
	/* (non-Javadoc)
	 * @see net.daum.dna.oauth.DaumOAuth#setAccessToken(net.daum.dna.oauth.vo.DaumToken)
	 */
	public void setAccessToken ( DaumToken token ) {
		this.setTokenWithSecret( token.getToken(), token.getTokenSecret() );
	}
	
	
	/**
	 * Creates the oauth provider.
	 *
	 * @return the oauth provider
	 */
	private OAuthProvider createOAuthProvider() {
			return new DefaultOAuthProvider(_REQUEST_TOKEN_URL, _ACCESS_TOKEN_URL, _AUTHORIZE_URL);
	}
	
	
}
