package com.sist.exception;
/*
 * 		프로그램 
 * 				javac			   java
 * 		A.java ========= A.class ========= 실행
 * 		------   컴파일   --------- 인터프리터
 * 		원시소스           바이트 코드
 * 		  |				   |
 * 		자바개발자         컴퓨터가 인식하는 언어
 * 				  |               |
 * 			   컴파일시에러		    실행시에러
 * 			 CheckException    UnCheckException
 * 			----------------   ----------------
 * 		  컴파일시에 예외처리여부 확인     |
 * 		   => 반드시 예외처리		 필요시에만 예외처리
 * 		   => 파일읽기/크롤링		 자주 에러가 나는 부분
 * 			  네트워크/웹
 * 			  쓰레드
 * 		  --------------------	----------------
 * 		   		|						|
 * 			개발자 실수				     사용자 입력
 * 			=> URL 입력				 정수 = 문자열	
 * 			=> IP					 
 * 			=> 파일 경로
 * 			=> 배열의 인덱스가 틀린경우
 * 		전체 : 
 * 			 에러 : 소스 수정이 불가능
 * 			 예외 : 소스 수정이 가능 => 가벼운 에러
 * 		예외처리
 * 			정의 : 프로그램 실행시에 발생할 수 있는 에러에 대비한 코드
 * 					예외 => 프로그래머 실수(디버깅)
 * 						   사용자 입력(유효성 검사)
 * 			목적 : 비정상 종료를 방지하고 정상 상태 유지
 * 			--------------------------------
 * 			에러 : 심각한 에러
 * 				  => 메모리 부족 => 종료
 * 				  => 윈도우 종료
 * 			예외 : 가벼운 에러(소스상에서 수정이 가능)
 * 				  사이트 연결 => URL 주소
 * 				  파일 읽기 / 경로명의 문제
 * 				  서버연결 => IP / PORT
 * 			*** 예외처리를 하면 에러가 수정된다(X)
 * 			*** 에러를 건너뛴다 
 * 			===> 처리
 * 				1. 예외 복구 try ~ catch
 * 				2. 예외 회피
 * 					throws
 * 				3. 예외 발생
 * 					throw
 * 				4. 사용자 정의
 * 					class A extends Exception
 * 			1) 예외처리 상속 구조 
 * 				=> 상속 => 위로 올라갈 수록 크다
 * 						  Object
 * 							|
 * 						 Throwable : 예외처리의 최상위 클래스
 * 						    |
 * 					-----------------
 * 					|				|
 * 				  Error			  Exception
 * 									|
 * 						CheckException		UnCheckException
 * 							-----------------------------
 * 							|					    	|
 * 						IOException			        RuntimeException	
 * 						 입출력 관련				     실행시 에러
 * 						=> System.in			     	|
 * 						   예외처리반드시			    ***NumberFormatException
 * 						=> System.out			    문자열 => 정수형 변환이 안되는 경우
 * 						   예외처리 선택			    웹에서 주로 발생
 * 						  InterruptedException	    list.jsp?page=1 //공백없이입력!
 * 						   쓰레드 충돌				    ArrayIndexOutofBoundsException
 * 						  MalformedURLException	    => index 범위 초과
 * 							URL관련 => 크롤링		  	ClassCastException
 * 						  ClassNotFoundException	클래스 형변환의 문제
 * 						    리플랙션					***NullPointerException
 * 							=> 클래스명으로 메모리 할당		클래스의 메모리 할당이 안된 상태
 * 						  SQLException				String s;
 * 						  => 데이터베이스 관련			s.substring()
 * 						  => java.io				=> 데이터베이스
 * 							 java.net				
 * 							 java.sql
 * 						예외처리
 * 						= 예외 복구
 * 						try 
 * 						{
 * 							정상적으로 수행되는 부분
 * 							=> 지금까지 코딩한 부분 10/0
 * 							=> 출력
 * 						}catch(예외처리클래스)
 * 						{
 * 							에러를 잡아서 복구
 * 						}		
 * 
 * 						순서
 * 						1
 * 						2
 * 						3
 * 						try
 * 						{	4
 * 							5
 * 							6 =>error
 * 							7
 * 						}catch()
 * 						{
 * 							8
 * 						}
 * 						10
 * 						11
 * 						12            ====> 6,7을 건너뜀
 * 
 * 						==> 부분적
 * 							
 * 						try
 * 						{	
 * 							1
 * 							2
 * 							3 =>error
 * 							4
 * 							5
 * 						}catch()
 * 						{
 * 							6
 * 							7
 * 							8		  ====> 12678
 * 						}
 * 
 * */
class A
{
	
}
class B extends A
{
	
}
public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B(); // 자동 형변환 A a=new A(); 쓰면 오류남
		B b=(B)a; // 강제 형변환
	}

}
