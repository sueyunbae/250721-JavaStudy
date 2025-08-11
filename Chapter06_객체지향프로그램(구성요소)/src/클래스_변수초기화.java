/*
 * 	초기화 => 변수에 값을 첨부
 * 	1. 명시적 초기화
 * 		class ClassName
 * 		{
 * 			변수 
 * 			--- 
 * 			기본형(int, double, boolean,...)
 * 			배열 
 * 			클래스
 * 		}
 * 
 * 		// 기본형
 * 		int a=100; => 명시적 초기화
 * 		int[] arr={10,20,30,40,50} => 명시적 초기화
 * 		A a=new A(); => 명시적 초기화
 * 
 * 		int a; //a=0
 * 		int[] arr; //null값 초기화
 * 		A a; //null
 * 		------------------------------ 선언만 가능
 * 
 * 	2. 초기화 블록
 * 		class ClassName
 * 		{
 * 			int a; => 선언
 * 			a=100; => 오류(구현)
 * 		}
 * 
 * 		class ClassName
 * 		{
 * 			int a; 
 * 			static int b;
 * 			= instance 블록 ===> 데이터베이스 드라이버 등록, 네트워크 서버연결 등에 많이 사용
 * 			{					
 * 				a=100; => static 변수 초기화 가능(static은 전역에서 사용 가능)
 * 			}
 * 			= static블록 ===> MyBatis 연동, 설정에 많이 사용
 * 			static
 * 			{
 * 				b=200; => 인스턴스 변수 초기화는 불가능
 * 			}
 * 			*** 상속 제외
 * 			*** 컴파일러에 의해 자동 호출
 * 			*** 크롤링 / 파일 읽기 / 데이터베이스값 채우기
 * 		}
 * 		==> 진화 => 생성자
 * 		
 * 		class ClassName
 * 		{
 * 			int a=100
 * 		}
 * 
 * 	3. 생성자 
 * 		초기값 ==== 명시적인 초기화 ==== 초기화 블록 ==== 생성자
 * 				  ----------------------------------
 * 						이 중에 한개 선택해서 초기화하기
 * 					static = 초기화 블록
 * 					instance = 생성자(new를 호출=>new뒤에 생성자가 옴) 							 
 * 
 * */

class Sawon{
	int sabun=10;
	{
		sabun=(int)(Math.random()*100)+1;//초기화 블록(인스턴스 블록)
		comName="SIST3";
	}
	static String comName="SIST";//명시적 초기화(필요한 값을 넣어주는것 )	
	static
	{
		comName="SIST2"; //구현해서 가져올 때 초기화 블록 이용해서 초기화
	}
} // comName=SIST3 : instance블록이 static블록 보다 나중에 호출 되었기 때문
public class 클래스_변수초기화 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1=new Sawon();
		System.out.println(s1.sabun);
		System.out.println(s1.comName);
		
		Sawon s2=new Sawon();
		System.out.println(s2.sabun);
		System.out.println(s2.comName);
		
		Sawon s3=new Sawon();
		System.out.println(s3.sabun);
		System.out.println(s3.comName);

	}

}
