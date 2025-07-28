/*
 * 프로그램 : 순차적
 * 			위에서 아래 => 한줄씩 번역
 * 프로그램의 종류
 * 	= 평문 : 일반 명령문만 수행 => HTML/CSS
 * 			=> 문법사항(변수선언, 연산처리)
 * 	= 조건문 : 필요시에만 명령문을 수행
 * 			  상황에 따라서 다른 기능을 수행
 * 			  => 검색(사이트)
 * 			  => 상세보기
 * 			  => 로그인 처리/아이디중복/아이디찾기/비밀번호찾기
 * 		1) *****단일 조건문 => 독립적 조건문 하나하나 검색 => 속도가 늦다
 * 						  => 중복적으로 수행(1~100중에 3,5,7의 배수=>공배수일때 중복)
 * 						  => 조건이 true일 때 수행
 * 		2) ***선택조건문
 * 			=> 조건이 true/false
 * 			=> 웹에서 사용빈도가 많다(결과값을 전송해서 결과값에 따라 다르게 처리)
 * 		3) 다중 조건문 
 * 			=> 한개의 문장만 수행 => 조건에 맞는 if문만 찾아 수행
 * 			=> 메뉴 제작
 * 		4) 중첩 조건문 : A => A+,A0,A-,...
 * 			조건&&조건... 112p
 *  1. 단일 조건문 => 문법/형식
 *     형식)***자바에서 지원하는 모든 제어문은 바로 밑에 있는 문장만 제어
 *     			(여러개의 문장을 제어 할 때 {}이용)
 *     			=> 가독성/수정 편리 => {}
 *     		*** 제어문에 특별한 경우가 아니면 ;을 사용하지 않는다
 *     		if(조건문)(이 다음에; 쓰지 X)
 *     		{
 *     			명령문;
 *     		}
 *     		if(조건문)
 *     			명령문;
 *     		if(조건문)
 *     			명령문; ==> if소속 => if문으로 제어
 *     			명령문; ==> if와 관련이 없는 문장 => 무조건 수행
 *     		if(조건문) ==> 조건문은 무조건 결과값이 true/false
 *     										 ---------- 부정연산자(!),비교연산자(==,!=,>,>=,<,<=),논리연산자(&&,||)
 *     		{
 *     			명령문;
 *     			명령문;
 *     		}
 *    2) 실행순서 => 형식, 문법, 실행
 *    	 if => 필요하면 명령문을 수행, 필요 없는 경우에는 건너뛴다
 *    		   필요시마다 상황을 다르게 만든다(왼/오/위/아래)
 *    	 if(조건문)
 *    	 {   | true
 *    		명령문; => 수행
 *    	 }
 *    	 if(조건문)
 *    	 {   | false
 *    		명령문; => 건너뛴다
 *    	 }
 *    	조건
 *    	=> 범위 0~99 ==> no>=0 && n<=99 or no>=0 && n<100
 *    		c>='A' && c<='Z'
 *    	=> no>=60
 *    	=> mno==1(예:영화의 번호가 같은 경우=>상세보기기능)
 *    	=> String : equals/container/startsWith/endsWidth => 결과값은 true/false
 *    	=> <button> / <select>
 * */
// 예제 : 최대값,최소값 => 정수를 3개 입력 받아서 최댓값, 최솟값 찾기
/*
 * 	난수 받기
 * 	 Math.random() => 임의의 실수를 추출
 * 					  --------- 0.0~0.99		
 * 	1~100 =>(int)(Math.random()*100)+1
 *  순서 : 	  2           1          3  
 * */


public class 제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
//		int max=a;
//		if(max<b)
//			max=b;
//		if(max<c)
//			max=c;
//		System.out.println("max="+max);
//		
//		int min=a;
//		if(min>b)
//			min=b;
//		if(min>c)
//			min=c;
//		System.out.println("min="+min);
		
		
		int max=a;
		if(max<b)
			{
			  max=b;
			  System.out.println("max<b 문장수행!!");
			}
		if(max<c)
			{
			  max=c;
			  System.out.println("max<c 문장수행!!");
			}
		System.out.println("max="+max);
		
		int min=a;
		if(min>b)
			min=b;
		if(min>c)
			min=c;
		System.out.println("min="+min);
	}

}
