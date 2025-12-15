/*
 * 	문자열
 * 	String => 데이터형/클래스형(기능=>메소드)
 *  => 사용법
 *  	String 변수명="문자"
 *  				 ---- 제한이 없다
 *  	예) 회원 정보
 *  		------ id,pwd,name,address,phone,post
 *  				content ... birthday ... => 정보의 대부분은 String
 *  		게시판 정보
 *  		   no name subject content pwd regdate hit
 *       --> 제공하는 기능(메소드)
 *       변환
 *         toUpperCase():대문자 변환
 *         toLowerCase():소문자 변환
 *         ***** valueOf() : 모든 데이터형을 문자열로 변환(웹,윈도우는 모든 데이터형 String)
 *         -----------------------(사용빈도가 없다.데이터는 한글 중심이기 때문)
 *         		             예)valueOf(10) => "10"
 *       비교
 *       	equals() => 실제 문자열 비교
 *       	contains() => 포함 문자열
 *       	startsWith() => 시작 문자열
 *       	endsWith() => 끝 문자열(확장자에 많이 사용)
 *       검색
 *       	Hello Java!!
 *          0123456789
 *       	indexof("a") => 7
 *       	indexof("Java") => 6
 *       	=> 앞에서부터
 *       	lastIndexOf("a") => 9
 *       	=> 뒤에서부터
 *       제어
 *       	substring() : 문자를 자르기(맨 뒷 글자는 제외)(substring(1,5)=>4까지)
 *       	split() => 문자별 자르기
 *       	trim() => 공백문자 제거
 *
 * 
 * */
//substring 사용해서 문자열 자르기 
import java.io.*;
import java.util.Scanner;
public class 문자열_1 {
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		String msg="Hello Java";
//		// 1. 문자의 갯수 => " " => 문자
//		// => length() => 결과값은 int
//		int leng=msg.length();
//		System.out.println("문자 갯수:"+leng);
//		//2.자르기
//		String s=msg.substring(6);//인덱스 번호 6부터 맨끝까지 자른다
//		System.out.println(s);
//		s=msg.substring(0, 5);//endindex-1까지 출력
//		System.out.println(s);
		
		//파일명에서 확장자명 자르기 //맨 위에다가 import java.io.*; 넣기
		String name="문자열_1.java";//파일명
		String ext=name.substring(name.indexOf(".")+1);//+1을 해야 찾은곳까지 포함해서 출력
//		File dir=new File("c:\\jdk-17.0.2\\javaDev");
//		File [] lists=dir.listFiles();
//		for(File f:lists)
//		{
//			if(f.isFile())
//			{
//				String ss=f.getName();
//				System.out.println(ss.substring(ss.lastIndexOf(".")+1));
//				                                //마지막 "."이후의 문자(확장자명)을 출력
//			}
//			
//		}
		
		String msg1="                              Hello Java!! ";
		System.out.println(msg1.length());
		String ss=msg1.trim();
		System.out.println(ss.length());//trim() => 좌우 공백문자 제거(중간 공백은 X) => 검색, 로그인
		
		//split
		String msg2="Java Oracle HTML CSS JavaScript JSP JQuery Ajax SpringFramework VueJS SpringBoot "+
		         "Git GitAction Docker Docker-Compose Jenkins React Next TypeScript MSA Chatting NodeJS";
		
		//일치하는 단어가 있는지 찾기(대소문자 구분X)
		String[] datas=msg2.split(" ");
		Scanner scan=new Scanner(System.in);
		System.out.print("단어 입력:");
		String d=scan.next();		
		for(String data:datas)
		{
			if(data.equalsIgnoreCase(d))
			{
				System.out.println(data);
			}
			
		}
		
		}

}

