/*
 * 1. 연산자 => 단항연산자/이항연산자(산술연산자)
 * 		1) 기본: 변수/연산/제어
 * 		2) 데이터를 묶어서 사용
 *                -----
 *                같은 데이터 : 배열
 *                ***다른 데이터 : 객체
 *      3) 관련된 명령문 : 기능
 *         게시판 => 목록출력/글쓰기/상세보기/수정/삭제
 *         => 기능(메소드)
 *         => 재사용 가능
 *         => 기능 추가 => 답변/수정 => 목록(이미지도 가능)
 *  2025-07-22 정리
 *  --------------
 *  1. 자바실행 과정
 *  	=> 클래스명과 파일저장명이 동일(대소문자 구분)
 *          class MainClass => mainClass.java
 *          	  --------- 일치----------
 *      => EditPlus / 울투라Edit
 *      => A.java =========== A.class ========= 실행
 *         원시소스             바이트코드(0,1)
 *                     |                    |  
 *                    javac                java
 *                    컴파일                인터프리터
 *                    어셈블러(컴퓨터언어로변경) (한줄씩 읽어서 출력)
 *                     |                    |
 *                    컴파일영역              실행시
 *                    -------문법            입력값
 *                    =>에러는 프로그래머실수    사용자실수
 *       => 프로그램개발 => 다시 사용해야하는 데이터
 *                       ------------------- 메모리에 저장(변수)
 *       변수 : 한개의 데이터만 저장하는 메모리 공간의 이름
 *                                 ---- 주소값
 *       변수를 사용
 *       -------- 메모리 크기
 *                --------- 데이터형 / 자료형
 *       정수
 *       	byte (-127~128) => 8bit = 1byte
 *          int (-21억4천7백 ~ 21억4천7백) => 32bit => 4byte ====> 기본(컴퓨터는 모든 정수를 int로 인식)
 *          long => 64bit => 8byte
 *       실수
 *       	double => 8byte => 소수점 15자리 ====> 기본
 *       문자
 *       	문자 한개만 저장 => 0~65535 (각국의 언어 사용 가능, 유니코드)
 *       	char => 표현식 ''
 *       논리
 *        	제어문 / 연산자(비교연산자, 부정연산자, 논리연산자)
 *          ----- 조건문, 반복문
 *          boolean => true/false
 *       문자열
 *       	String : 일반 데이터형/참조 데이터형
 *       변수 선언 : 변수는 반드시 초기값을 첨부, 값 변경 가능(상수는 변경이 불가능-final 데이터형 변수 => 상수)
 *       	(1) 선언
 *       	   값 저장
 *       	   데이터형 변수;
 *       	   변수=값
 *       	(2) 선언과 동시에 값을 부여
 *       	   데이터형 변수명=값
 *                         -- 리터럴(실제 저장된 값)
 *             int a=10
 *          정수 표현법
 *             => 10진법 : 10,20..
 *             => 2진법 : 0b11100, 0B
 *             => 8진법 : 0123 (앞에 0만 붙기 때문에 주의하기)
 *             => 16진법 : 0X, 0x
 *          문자 표현법
 *           'A','홍'
 *          문자열 표현
 *           "ABC"
 *           문장이 길 경우
 *           """
 *            문장
 *           """
 *    --------------------------------- 형변환 / 문자열 => 60p
 *    형변환
 *     자동형변환
 *       = 변수에 값 대입
 *          int a='A'
 *                --- char => int (65)
 *          char c=65
 *                 -- int => char ('A')
 *          double d=10
 *                   -- 
 *                   int => double (10.0)
 *          int a=d; => 오류(왼쪽 데이터형이 크거나 같으면 자동으로 됨)
 *       = 연산처리(데이터형이 동일하면 연산) => 큰 데이터형으로 변경 후에 처리
 *         int + int => 결과값은 int
 *         long + int => 결과값은 long(int가 long으로 변환 되어서 계산)
 *         10 + 'A' => 10+65(변환) => 75
 *         double + long + int + char => double형(가장 큰 데이터형)
 *         char + char => int 
 *         byte + byte => int
 *         char + byte => int
 *         ***int 이하 데이터(byte,char,short)들은 연산처리가 되면 결과값은 다 int(기억하기)
 *         결과값 int => int/long/float/double
 *         결과값 long => long/float/double
 *         결과값 float => float/double
 *     강제형변환 : 객체에서 많이 씀(연산에서는 잘 안씀)
 *     		인간 a=남자 => is-a
 *          남자 a=인간 => 말이 안됨
 *          남자 a=(남자)인간 => 말이 됨
 *      => (데이터형)값
 *          -------
 *          => 큰데이터형 변경(UpCasting)
 *          => 작은데이터형 변경(DownCasting)
 *          (double)10 => 10.0
 *          (int)'A' => 65
 *          (char)65 => 'A'
 *          (int)10.5 => 10
 *          
 *          ** boolean은 변환이 안된다(87p)
 *          
 *          String : 모든 데이터형을 문자열로 변환
 *          int => String => int
 *          -------------
 *          String.valueOf(10) => "10"
 *          long => String => long
 *                                Integer.parseInt("10") => 10(라이브러리. 첫문자 대문자)
 *          String.valueOf(10L) => "10"         
 *          double => String => double 
 *                               Long.parseLong("10") => 10L                               
 *          String.valueOf(10.5) => "10.5"
 *                                  Double.parseDouble("10.5") => 10.5
 *          boolean => String => boolean
 *          String.valueOf(true) => "true"
 *                                  Boolean.parseBoolean("true") => true
 *          => 각데이터형을 쉽게 사용할 수 있게
 *             클래스화 => Wrapper
 *             int => Integer
 *             long => Long
 *             double => Double
 *             boolean => Boolean
 *      ** 윈도우 개발 / 웹 개발 => 데이터는 String
 *            <input type="text">
 *            JTextField
 *            
 *      입출력 69p
 *      System.out.println() : 가장 많이 사용 => 웹 => 입력값확인, 오류 메세지 출력
 *                             사용을 하면 줄바꿈이 됨
 *      System.out.print() : 문법 사항 => 줄바꿈이 안된다. 가로로 출력(예: 한명에 대한 데이터 출력)
 *      System.out.printf() : 출력 서식을 만들어서 출력(C언어에서 주로 사용)
 *        printf("서식",값...)
 *                ---
 *                정수값 : %d
 *                왼쪽정렬 %-3d, 오른쪽정렬 %3d
 *                90을 %-5d로 출력하면,
 *                9 0 
 *                - - - - - 
 *                90을 %5d로 출력하면,
 *                      9 0
 *                - - - - - 
 *                실수값 : %f
 *                       %.2f (소수점 두번째 자리까지 출력)
 *                       %.3f (소수점 세번째 자리까지 출력)
 *                       %.1f (소수점 첫번째 자리까지 출력)
 *                문자 : %c
 *                문자열 : %s
 *                
 *                *** 특수문자
 *                \n : 줄바꿈
 *                \t : 일정 간격
 *                \" : " 출력 (html전송 시, MyBatis에 주로 사용)
 *                \\ : \ 출력 (파일 경로명에 많이 사용)
 *      ----------------------
 *      Scanner(입력)
 *      ------ 클래스화 => 키보드 입력값
 *      Scanner scan = new Scanner(System.in)
 *      ------- ----   ---         --------- 키보드 입력값
 *              변수    저장(새롭게 메모리 할당)-클래스에 정보만 바꿔서 새롭게 저장 가능
 *      사용자 정의 데이터형(예: 클래스 이름 public class 자바문법=>모든클래스는 사용자 정의 데이터형)
 *      클래스는 데이터를 모아서 한번에 저장하려는 목적. 클래스변수 = 객체 (데이터 단위 : 변수 -> 배열 -> 객체)
 *      
 *      1. 정수 => scan.nextInt()
 *      2. 실수 => scan.nextDouble()
 *      3. 논리 => scan.nextBoolean()
 *      4. 문자열 => scan.next()
 *      
 *      입력 : 공백 => 메모리에 저장 => 엔터
 * */

import java.util.Scanner; // class Scanner{}가 불러와짐 = include <stdio.h> (C언어)
public class 자동형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*double d=10;
		System.out.println(d);
		int a=(int)d;
		System.out.println(a);
		byte b1=10;
		byte b2=20;
		int b3=b1+b2;
		System.out.println(b3);
		
		
		System.out.printf("%-5d%-5d%-5d",10,20,30);
		System.out.printf("%f\n",10/3.0);
		System.out.printf("%.2f\n",10/3.0);
		System.out.printf("%.1f\n",10/3.0);
		System.out.printf("%02d\n",12);
		System.out.printf("%s\n","배수연");
		*/
		
		// ctr+shift+/ : 전체 주석처리 (ctr+shift+\ 하면 주석  풀림)
		// ctr+/ 하면 한줄 주석처리(한번 더 하면 주석  풀림)
		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("국어 점수:");
//		int kor=scan.nextInt();
//		System.out.print("영어 점수:");
//		int eng=scan.nextInt();
//		System.out.print("수학 점수:");
//		int math=scan.nextInt();
		
		Scanner scan=new Scanner(System.in);
//		System.out.println("국어 영어 수학입력(90 90 90):");
//		int kor=scan.nextInt();
//		int eng=scan.nextInt();
//		int math=scan.nextInt();
//		System.out.printf("%3d%3d%3d\n",kor,eng,math);
//		System.out.println("문자열 입력:");
//		String msg=scan.next();//공백 전까지만 출력
//		String msg=scan.nextLine();//공백 포함해서 엔터 치기 전까지 다 출력
//		System.out.println(msg);
//		System.out.println("true/false입력:");
//		boolean b=scan.nextBoolean();
//		System.out.println(b);
		System.out.print("실수 입력:");
		double d=scan.nextInt();
		System.out.println(d);
	}

	
}
