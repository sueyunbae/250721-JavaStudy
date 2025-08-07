// 암호화 => encoding / 복호화 =>decoding 
// 시저스암호화 => 3칸 이동 ABC => DEF => ed4559 rsa
// https://www.google.com/search?q=%EC%9E%90%EB%B0%94&sca_esv=38b8b35f2fe0540c&sxsrf=AE3TifNHYdJbU0th5cYoQLd4m6ale8Vjqg%3A1754461422846&ei=7vSSaPi4M5_T1e8P8bLI0Qg&ved=0ahUKEwj454WPxvWOAxWfafUHHXEZMooQ4dUDCBA&uact=5&oq=%EC%9E%90%EB%B0%94&gs_lp=Egxnd3Mtd2l6LXNlcnAiBuyekOuwlDIKECMYgAQYJxiKBTIKECMYgAQYJxiKBTIKECMYgAQYJxiKBTILEAAYgAQYsQMYgwEyBBAAGAMyERAuGIAEGLEDGNEDGIMBGMcBMgQQABgDMgsQLhiABBjHARivATIREC4YgAQYsQMY0QMYgwEYxwEyCxAuGIAEGLEDGIMBSLIYUABY3RdwB3gBkAEBmAHSAaABrwuqAQUwLjcuMrgBA8gBAPgBAZgCDaAChgioAhHCAgUQABiABMICCBAAGIAEGLEDwgIHEAAYgAQYCsICCRAAGIAEGAoYKsICBxAuGIAEGArCAgUQLhiABMICBBAuGAPCAhoQLhiABBixAxiDARiXBRjcBBjeBBjfBNgBAcICBxAjGCcY6gLCAg0QIxjwBRgnGMkCGOoCwgIUEAAYgAQY4wQYtAIY6QQY6gLYAQHCAgQQIxgnwgIREC4YgAQYsQMYgwEYxwEYrwGYAwjxBXyNC-TNUoovugYGCAEQARgUkgcFNy41LjGgB-CAAbIHBTAuNS4xuAfiB8IHCDAuMS4xMS4xyAdD&sclient=gws-wiz-serp
//                                 ------------------'자바' 인코딩
// %EC%9E%90%EB%B0%94
import java.net.*;
public class 메소드_5 {
	static String encoder(String s) throws Exception
	{
		return URLEncoder.encode(s,"UTF-8");
	}
	static String decoder(String s) throws Exception
	{
		return URLDecoder.decode(s,"UTF-8");
	}	
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
//		String s="자바";
//		String en=URLEncoder.encode(s,"UTF-8");
//		System.out.println(en);
//		String ko=URLDecoder.decode(s,"UTF-8");
//		System.out.println(ko);
		
	}

}
