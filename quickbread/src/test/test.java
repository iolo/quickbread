package test;

import junit.framework.TestCase;
import net.daum.dna.api.BlogAPI;
import net.daum.dna.api.basic.DefaultBlogAPI;
import net.daum.dna.oauth.DaumOAuth;
import net.daum.dna.oauth.basic.DefaultDaumOAuth;
import net.daum.dna.oauth.vo.DaumConsumer;
import net.daum.dna.oauth.vo.DaumToken;
import net.daum.dna.params.Params;

public class test extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testDefaultBlogAPI() {
		fail("Not yet implemented");
	}

	public void testDefaultBlogAPIDaumOAuth() {
		fail("Not yet implemented");
	}

	public void testSetDaumOAuth() {
		fail("Not yet implemented");
	}

	public void testGetDaumoAuth() {
		fail("Not yet implemented");
	}

	public void testGetArticlesString() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);
		System.out.println( blogAPI.getArticles("sun1124") );	
	}

	public void testGetArticlesStringParams() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		Params option = new Params();
		option.getOptionMap().put("pageNo", "2");
		System.out.println( blogAPI.getArticles("kangdante", option) );		
	}

	public void testGetArticlesAsXMLString() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getArticlesAsXML("kangdante") );	//kangdante,sun1124		
	}

	public void testGetArticlesAsXMLStringParams() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		Params option = new Params();
		option.getOptionMap().put("pageNo", "2");
		System.out.println( blogAPI.getArticlesAsXML("kangdante", option) );
	}

	public void testGetArticlesAsJSONString() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getArticlesAsJSON("kangdante") );
	}

	public void testGetArticlesAsJSONStringParams() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		Params option = new Params();
		option.getOptionMap().put("pageNo", "2");
		System.out.println( blogAPI.getArticlesAsJSON("kangdante", option) );
	}

	public void testWriteArticleStringStringStringString() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.writeArticle("i-trust-y", "11/23테스트", "test1", "test1"));
		
	}

	public void testWriteArticleStringStringStringStringParams() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		Params option = new Params();
		option.setOption("categoryId","2");
		option.setOption("open", BlogAPI._ARTICLE_FRIEND_OPEN);
		System.out.println( blogAPI.writeArticle("i-trust-y", "11/23테스트", "test1", "test1", option));
		
	}

	public void testWriteArticleAsXMLStringStringStringString() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.writeArticleAsXML("i-trust-y", "11/23테스트", "test1", "test1" ));
		
	}

	public void testWriteArticleAsXMLStringStringStringStringParams() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		Params option = new Params();
		option.setOption("categoryId","2");
		option.setOption("open", BlogAPI._ARTICLE_FRIEND_OPEN);
		System.out.println( blogAPI.writeArticleAsXML("i-trust-y", "11/23테스트", "test1", "test1" , option));
	}

	public void testWriteArticleAsJSONStringStringStringString() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.writeArticleAsJSON("i-trust-y", "11/23", "test1", "test1"));

	}

	public void testWriteArticleAsJSONStringStringStringStringParams() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		Params option = new Params();
		option.setOption("categoryId","2");
		option.setOption("open", BlogAPI._ARTICLE_FRIEND_OPEN);
		System.out.println( blogAPI.writeArticleAsJSON("i-trust-y", "11/23", "test1", "test1", option));
		
	}

	public void testModifyArticleStringStringStringStringString() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.modifyArticle("i-trust-y", "69", "11/23수정2", "수정2", "수정2"));
	}

	public void testModifyArticleStringStringStringStringStringParams() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		Params option = new Params();
		option.setOption("categoryId","2");
		option.setOption("open", BlogAPI._ARTICLE_FRIEND_OPEN);
		System.out.println( blogAPI.modifyArticle("i-trust-y", "69", "11/23수정2", "수정2", "수정2", option));
	}

	public void testModifyArticleAsXMLStringStringStringStringString() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.modifyArticleAsXML("i-trust-y", "69", "11/23수정xml", "test1수정", "test1수정"));
	}

	public void testModifyArticleAsXMLStringStringStringStringStringParams() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		Params option = new Params();
		option.setOption("categoryId","2");
		option.setOption("open", BlogAPI._ARTICLE_FRIEND_OPEN);
		System.out.println( blogAPI.modifyArticleAsXML("i-trust-y", "69", "11/23수정xml", "test1수정", "test1수정", option));
	}

	public void testModifyArticleAsJSONStringStringStringStringString() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.modifyArticleAsJSON("i-trust-y", "69", "11/23수정json", "test1수정", "test1수정"));
	}

	public void testModifyArticleAsJSONStringStringStringStringStringParams() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		Params option = new Params();
		option.setOption("categoryId","2");
		option.setOption("open", BlogAPI._ARTICLE_FRIEND_OPEN);
		System.out.println( blogAPI.modifyArticleAsJSON("i-trust-y", "69", "11/23수정json", "test1수정", "test1수정", option));
	}

	public void testGetArticle() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getArticle("kangdante", "15604554"));
	}

	public void testGetArticleAsXML() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getArticleAsXML("kangdante", "15604554"));
	}

	public void testGetArticleAsJSON() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getArticleAsJSON("kangdante", "15604554"));
	}

	public void testGetCategories() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getCategories("kangdante"));
	}

	public void testGetCategoriesAsXML() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getCategoriesAsXML("sun1124") );		
	}

	public void testGetCategoriesAsJSON() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getCategoriesAsJSON("kangdante"));
	}

	public void testGetComments() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getComments("i-trust-y", "32"));
	}

	public void testGetCommentsAsXML() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");	
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getCommentsAsXML("kangdante", "15604554"));
	}

	public void testGetCommentsAsJSON() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");			
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getCommentsAsJSON("kangdante", "15604554"));
	}

	public void testWriteComment() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");			
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.writeComment( "i-trust-y", "66" , "11/23댓글테스트입니다", false));
	}

	public void testWriteCommentAsXML() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");			
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.writeCommentAsXML( "i-trust-y", "66" , "11/23댓글테스트입니다", false));
	}

	public void testWriteCommentAsJSON() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");			
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.writeCommentAsJSON( "i-trust-y", "66" , "11/23댓글테스트입니다", false));
	}
	
	public void testGetRsses() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");			
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getRsses("kangdante"));
	}

	public void testGetRssesAsXML() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");			
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getRssesAsXML("kangdante") );
	}

	public void testGetRssesAsJSON() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");			
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getRssesAsJSON("kangdante"));
	}

	public void testGetInfo() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");			
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getInfo("kangdante"));
	}

	public void testGetInfoAsXML() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");			
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getInfoAsXML("kangdante") );
	}

	public void testGetInfoAsJSON() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");			
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getInfoAsJSON("kangdante"));
	}

	public void testGetActivityRes() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");			
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getActivityRes("i-trust-y"));
	}

	public void testGetActivityResAsXML() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");			
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getActivityResAsXML("i-trust-y") );
	}

	public void testGetActivityResAsJSON() throws Exception {
		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");			
		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
		BlogAPI blogAPI = new DefaultBlogAPI(oauth);	
		System.out.println( blogAPI.getActivityResAsJSON("i-trust-y"));
	}

}
