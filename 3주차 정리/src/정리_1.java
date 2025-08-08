/*
 * 		1. 기본
 * 		   --- 변수(데이터형) / 연산자 / 제어문
 * 			1) 변수 / 상수  
 * 				|	  | 여러개 => 열거형(생성자) 
 * 					    수정이 불가능 => final
 * 				여러개 => 배열
 * 				수정 가능
 * 			    한개의 데이터를 저장하는 메모리 공간
 * 				메모리크기 결정(데이터형)
 * 			2) 데이터형
 * 				기본형 : 메모리에 데이터형
 * 				  정수 저장 byte => 8bit => 네트워크 송수신/웹
 * 						  int => 32bit => 일반 정수 => default
 * 						  long => 64bit : 금융권 / 증권 
 * 				  실수 저장 double => 64bit => 소수점 15자리 => 일반 실수 => 건축에서 많이 씀(정밀도가 높아서)
 * 				  논리 저장 boolean => 8bit => 조건/반복
 * 				  문자 저장
 * 					char => 16bit => 양수만 사용(0~65535)
 * 				참조형 : 여러개 데이터를 저장하는 경우 => 주소
 *					   --------- 배열 / 클래스
 *					**String : 문자열 여러개 저장
 *					  클래스형 => 메소드 지원
 *					  = 비교
 *						***1) equals : 대소문자 구분 비교(로그인/회원가입) **boolean equals(String s)
 *																-------		   ---------
 *																  리턴형			비교대상문자 
 *						***2) contains : 대소문자 구분 => 포함여부
 *						   검색 
 *							** boolean contains(String fd)
 *												---------
 *												 포함 문자
 *						***3) startsWith : 대소문자 구분 => 시작문자열
 *							자동완성기 / 쿠키 찾기
 *							** boolean startsWith(String s)
 *												  --------
 *												   시작문자열
 *						4) endsWith : 대소문자 구분 => 끝 문자열
 *								이미지의 확장자
 *							** boolean endsWith(String s)
 *												--------
 *												 끝문자열
 *							= 제어
 *								1) substring : 자르기
 *									=> CSS
 *									=> 우편번호/주소/생성AI
 *									=> 오버로딩
 *										같은 이름의 메소드가 여러개 존재
 *										** 메소드명이 동일 
 *										** 리턴형과 관계없다
 *										** 매개변수의 갯수가 다르다
 *										** 매개변수의 데이터형이 다른경우
 *										** 비슷한 기능
 *										print(int a) => printInt() (우측이 더 편함)
 *										print(byte b) => printByte()
 *										print(short c) => printShort()
 *										print(long l) => 
 *						---------------------------------------------------------			
 *							
 *						 ** 원형
 *							String substring(int beginIndex)
 *							=> 지정된 위치에서 마지막 문자까지 자른다
 *							=> 웹 => 필요(MVC)
 *							=> 브라우저에서 서버연결 : URL주소
 *							   login.jsp?id=aaa&pwd=1234
 *						** String substring(int beginIndex,int endIndex)
 *											--------------	-----------
 *											    포함             미포함(endIndex-1)
 *						** 문자열의 원형은 변경되지 않는다
 *		
 *							= 찾기
 *								indexOf : 지정된 문자, 문자열의 인덱스번호 확인 => "앞"에서부터
 *								int indexOf(char c)
 *								int indexOf(String s)
 *								lastIndexOf : 지정된 문자, 문자열의 인덱스번호 확인 => "뒤"에서부터 
 * 								int lastIndexOf(char c)
 * 								int lastIndexOf(String c)
 * 								자바 구글 검색(원하는 문자 찾기 어려움)
 *								https://www.google.com/search?q=%EC%9E%90%EB%B0%94&sca_esv=8011337b228d5ddd&hl=ko&source=hp&ei=z1GVaO6bMdGg0-kPo5v_6AU&iflsig=AOw8s4IAAAAAaJVf3xVj-L_dvePHHw73FhIm_whiVod3&ved=0ahUKEwiuv-T8hvqOAxVR0DQHHaPNH10Q4dUDCA8&uact=5&oq=%EC%9E%90%EB%B0%94&gs_lp=Egdnd3Mtd2l6IgbsnpDrsJQyERAuGIAEGLEDGNEDGIMBGMcBMgsQABiABBixAxiDATIEEAAYAzILEAAYgAQYsQMYgwEyBBAAGAMyERAuGIAEGLEDGNEDGIMBGMcBMgsQLhiABBixAxiDATIIEAAYgAQYsQMyBBAAGAMyCBAuGIAEGLEDSJgMUJsFWJoLcAJ4AJABAZgBfKAB4wKqAQMwLjO4AQPIAQD4AQGYAgOgAoUBqAIKwgIaEAAYgAQYtAIY1AMY5QIYtwMYigUY6gIYigPCAgsQLhiABBjRAxjHAZgDBeIDBRIBMSBA8QUn6M_Oeg_zmpIHAzIuMaAHzh2yBwMwLjG4B3vCBwMyLTPIBww&sclient=gws-wiz
 *							= 변환
 *								replace : 문자/문자열
 *								------- 
 *								String replace(char c,char c1)
 *											   ------  ------- 
 *											   찾는 문자  변경할문자	
 *								  Hello Java  =>  ('a','b') => Hello Jbvb
 *								String replace(String s,String s1)
 *								  Hello Java  => ("Java","Oracle") => Hello Oracle
 *								 => 오라클에 데이터 추가
 *									--------------
 *   								https://img.megabox.co.kr/SharedImg/2025/07/25/4fLIzM7kJAnaPCu4ngQJLhgP7ak3GMrs_420.jpg
 *   								& => 입력 => 크롤링해서 오라클에 데이터 첨부할 때 많이 사용
 *   								=> 네트워크에서 채팅
 *   									\n => \t 변환할 때 사용
 *								replaceAll : 문자/문자열 => 정규식
 *								 String replaceAll(String regex,String s) //regex:정규식(특정 문자열의 규칙을 가지는 문자열의 집합을 표현하는 데 사용되는 언어)
 *								trim : 공백문자 => 좌우의 공백문자를 지움(중간의 공백은 지우지 못함)
 *										=> String trim()
 *										=> 로그인/회원가입/글쓰기/검색
 *
 *								valueOf : 모든 데이터형을 문자열 변환			
 *		
 *								192.168.10.1
 *								192.168.10.2
 *								192.168.10.3
 *								192.168.10.4
 *								192.168.10.5
 *								192.168.10.6
 *								192.168.10.7
 *								1111-1111
 *								555.555.555
 *								666.666.1
 *	
 *								전세계의 모든 ip : [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
 *								
 *								맛있는 맛있고 맛있었고 ....  => 맛있+
 *
 *								오늘 날씨와 추천하는 점심 추천 => 
 *
 * */
public class 정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://localhost:8080/member/login.jsp?id=admin&pwd=1234";
		String s=url.substring(url.lastIndexOf("/")+1,url.indexOf("?"));//마지막/뒤부터 ?전까지
		System.out.println(s);
		s=url.substring(url.indexOf("=")+1,url.indexOf("&"));//=뒤부터 &전까지
		System.out.println(s);
		// getRequestParam("id") 라는 함수를 이용해도 됨
		s=url.substring(url.lastIndexOf("=")+1); //=뒤로 끝까지 자르기
		System.out.println(s);
		
		String ss="blue|black|yellow|pink|green";
		String[] data=ss.split("\\|"); // |앞에 꼭 \\ 붙여주기
		for(String sss:data)
		{
			System.out.println(sss);
		}
		
	}

}
