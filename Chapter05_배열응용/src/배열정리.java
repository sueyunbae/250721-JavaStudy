/*
 * 	1. 배열
 * 		=> 배열 선언
 * 			1) 배열의 갯수
 * 		=> 배열 초기화
 * 			1) 명시적 초기화(직접 값을 입력)
 * 				int[] arr={1,2,3,4,5}
 * 			***2) 파일 읽기
 * 			***3) 데이터베이스 읽기
 * 			***4) 크롤링 
 * 			5) 임의 추출
 * 			6) 입력값
 * 		=> 배열 출력
 * 			1) 일반 for => 인덱스번호
 * 			2) for-each => 출력만 할때
 * 		=> 정수배열 / 문자열 배열 
 * 	  ----------------------------------
 * 	2. 배열 특징 
 * 		변수 : 한개만 저장하는 메모리 공간
 * 	   ----------------------------
 * 		| 변수 여러개를 묶어서 한번에 저장공간 설정 => 배열
 * 		| 데이터 관리를 쉽게 만들어 준다
 * 		| 익숙하지 않아서 어려워 보인다
 * 	
 * 	문법 => 데이터형 / 변수 / 연산자 / 제어문
 *  ---- 묶는 것
 *  	 ----- 라이브러리를 연결 => 조립
 *  	=> 로그인 : if~else
 *  	=> 회원가입 : if~else
 *  	=> 목록 : for
 *  	=> 예약 : if => for
 *  => 메모리를 연속적으로 생성
 *  	=> 변수명을 자동 부여(인덱스 번호) 배열명[0] 배열명[1] ... 배열명[n] => 변수와 동일 => 읽기/쓰기 가능
 *  int[] arr=new int[5]
 *  arr[0]=100;
 *  arr[1]=200;
 *  => System.out.println(arr[0]) => 100
 *  
 *  int a=10,b=30,c=40,d=50,e=100; => for문으로 루프 돌리기 불가능
 *  => for문은 반드시 변수명이 1개여야 가능
 *  
 *  = 단점
 *  	=> 한번 선언하면 변경이 불가능하다
 *  		int[] arr=new int[5];
 *  		arr=new int[10]; //크기 바뀌긴 하지만 처음 선언한 5크기의 배열 값은 사라짐 => 새로운 배열이 생기는 것이다
 * 
 * */
public class 배열정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr=new int[5];
//		System.out.println(arr);
//		arr=new int[10];
//		System.out.println(arr); //주소값이 다르다 => 새로 생성된 것이다
//		int[] arr2=arr;
//		System.out.println(arr2);//주소값이 arr과 같다
//		arr2[0]=100;
//		System.out.println(arr[0]);//arr 값이 변경됨
//		int[] arr3=arr.clone();
//		arr3[0]=1000;
//		System.out.println(arr[0]);//변경되지 않음
		
		//배열의 크기를 늘리고 싶을 때 
		int[] arr={1,2,3,4,5};
//		int[] arr2=new int[10];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr2[i]=arr[i];
//		}
		
		int[] arr2=new int[10];
		

		
	}

}
