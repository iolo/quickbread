package test;

import java.util.Scanner;

import net.daum.dna.oauth.basic.DefaultDaumOAuth;
import net.daum.dna.oauth.vo.DaumToken;





public class TestMain {

	/**
	 * @param args
	 * @throws Exception 
	 */
	

	
	public static void main(String[] args) throws Exception {
		
		DefaultDaumOAuth oauth = new DefaultDaumOAuth("ced48b93-7e09-4ce2-b061-8e72bf18dad5", "3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00");
		System.out.println(oauth.getAuthorizeURL("http://blog.daum.net/i-trust-y"));
		Scanner sc = new Scanner( System.in );
		String veri = sc.nextLine();	
		DaumToken token =  oauth.getAccessToken(veri);
		System.out.println(token);

// 태일님꺼
//		DaumConsumer consumer = new DaumConsumer("ba6c8594-d25e-40cb-aade-001bd66a26c4", "R6.9k7q9pvmempPfTvH3jPaWDqjR3JR7nporu9DyWL91PTBV_pMU.w00","http://blog.daum.net/painhealer");	
//		DaumToken token = 		new DaumToken("66c33306-48ff-4a98-afd5-ff8accc4c9e1", "WsXL2k_a37.9IcU-QvTTn-m.D3s4DZ4gkrGiAfY36Y39XHiBO87DHA00");
	
//		DaumConsumer consumer = new DaumConsumer("ced48b93-7e09-4ce2-b061-8e72bf18dad5","3MNJouFjolp7pf_XcjKu-5wXgxti.IpXf-hbI5oCJWI5y6pf5iBvNQ00","http://blog.daum.net/i-trust-y");	
//		DaumToken token = new DaumToken("7e355237-e16e-4a77-9b64-cad203510e93","PqLk1_9RzCjwdHY.-o-kRqgfSwY5N7sY9NIqhXNQ3mVpXsFp52xtiQ00");		
//	
//		DaumOAuth oauth = new DefaultDaumOAuth(consumer,token);		
//		BlogAPI blogAPI = new DefaultBlogAPI(oauth);


//		Params option = new Params();
//		option.setOption("pageNo", "1");
//		param.setOption("","2010-11-16 06:00:00");
//		param.setOption("minDate", "2010-11-13 06:00:00");
//		option.setOption("categoryId","2");
//		option.setOption("open", BlogAPI._ARTICLE_FRIEND_OPEN);
//		param.setOption("fileType","txt");
//		param.setOption("fileName","d");
//		param.setOption("fileSize", "1024");

//		System.out.println( blogAPI.getArticles("kangdante", option) );
//		System.out.println( blogAPI.getArticlesAsXML("kangdante") );	//kangdante,sun1124
//		System.out.println( blogAPI.getArticlesAsJson("kangdante") );

//		System.out.println( blogAPI.writeArticle("i-trust-y", "11/23테스트", "test1", "test1", option));
//		System.out.println( blogAPI.writeArticleAsXML("i-trust-y", "11/23테스트", "test1", "test1" , option));
//		System.out.println( blogAPI.writeArticleAsJson("i-trust-y", "11/23", "test1", "test1", option));
		
//		System.out.println( blogAPI.modifyArticle("i-trust-y", "69", "11/23수정2", "수정2", "수정2", option));
//		System.out.println( blogAPI.modifyArticleAsXML("i-trust-y", "69", "11/23수정xml", "test1수정", "test1수정", option));
//		System.out.println( blogAPI.modifyArticleAsJson("i-trust-y", "69", "11/23수정json", "test1수정", "test1수정", option));
		
//		System.out.println( blogAPI.getArticle("kangdante", "15604554"));
//		System.out.println( blogAPI.getArticleAsXML("kangdante", "15604554"));
//		System.out.println( blogAPI.getArticleAsJson("kangdante", "15604554"));


//		System.out.println( blogAPI.getCategories("kangdante"));
//		System.out.println( blogAPI.getCategoriesAsXML("sun1124") );
//		System.out.println( blogAPI.getCategoriesAsJson("kangdante"));


//		System.out.println( blogAPI.getComments("i-trust-y", "32"));
//		System.out.println( blogAPI.getCommentsAsXML("kangdante", "15604554"));
//		System.out.println( blogAPI.getCommentsAsJson("kangdante", "15604554"));
	

//		System.out.println( blogAPI.writeComment( "i-trust-y", "66" , "11/23댓글테스트입니다", false));
		
//		System.out.println( blogAPI.getRsses("kangdante"));
//		System.out.println( blogAPI.getRssesAsXML("kangdante") );
//		System.out.println( blogAPI.getRssesAsJson("kangdante"));
	
//		System.out.println( blogAPI.getInfo("kangdante"));
//		System.out.println( blogAPI.getInfoAsXML("kangdante") );
//		System.out.println( blogAPI.getInfoAsJson("kangdante"));

//		System.out.println( blogAPI.getActivityRes("i-trust-y"));
//		System.out.println( blogAPI.getActivityResAsXML("i-trust-y") );
//		System.out.println( blogAPI.getActivityResAsJson("i-trust-y"));
					

		
	}

}
