/*
 * 	1. 객체지향프로그램
 * 		클래스
 * 		1) 클래스 구성요소
 *			-------------
 *			 ***변수
 *			  = 인스턴스변수 : 메모리 저장할 때 따로 저장되는 변수
 *							저장시기 => new 
 *							=> heap => 프로그래머가 관리
 *			  = 정적변수 : static => 메모리 공간 한 개 사용 => 공유하는 변수 => MethodArea
 *			  = 지역변수 : 메소드가 종료되면 사라지는 변수 => Stack => {} 메모리 = 자체관리
 *			-------------
 *			 ***메소드
 *			  목적
 *				= 반복되는 기능 제거
 *				  예) 데이터베이스, 네트워크에 많이 등장(서버=클라이언트)
 *                   --------  --------------------------- 
 *                    모든 기능         보내기 / 받기
 *                    오라클 연결
 *                    기능 처리
 *                    오라클 닫기
 *                    => 유지보수 : 기능
 *                    => 프로그램의 80%가 메소드이다
 *				= 소스가 간결해짐
 *				= 재사용(다른 클래스와 연결)
 *				  -------------------
 *				   오버로딩/오버라이딩 => 메소드
 *				= 단락을 나누는 과정
 *					=> 코드 관리가 쉽다(기능별 분리) => 가독성
 *				*****
 *				1. 가독성
 *				2. 최적화 scp,async
 *				3. 수정/추가 용이
 *				4. 공통으로 사용되는 기능 => 공통모듈
 *				*****
 *			-------------
 *			 생성자 : 변수에 대한 초기화
 *					 => 프로그램에서 가장 먼저 호출
 *					 => 시작과 동시에 구현
 *					 => 서버/데이터베이스/화면UI
 *					 => 자동로그인
 *					 => 메소드의 일종
 *					 => . => new 생성자()
 *			*** 함수 vs 메소드
 *				=> 둘다 기능 처리
 *				=> 함수:독립적(C++.파이썬)
 *				=> 메소드:클래스영역=>클래스종속(자바,C#)
 *			*** 라이브러리 / 프레임워크
 *				 |완제품    | 레고(조립해서 써야함)
 *			-------------
 *			1.변수 / 2.메소드
 *		2) 메소드 
 *		 	형식)
 *			[접근지정어][제어어] 리턴형 메소드명(매개변수 목록)
 *			{
 *				--- 명령문
 *				--- 
 *				--- 
 *				return 값;
 *			}		
 *			= 접근지정어(public, private, protected, default)
 *				default:같은 폴더안에서만 접근이 가능
 *			= 제어어(static, final,abstract)
 *			  static : => 컴파일시에 자동 저장
 *			  
 *			class A
 *			{
 *				void aaa(){} => 저장이 안됨
 *				static void bbb(){} => 저장 됨(5%)
 *
 *				void aaa(){}
 *					A a=new A() => 저장 됨(95%) => 인스턴스변수
 *		
 *			}
 *			
 *			= 리턴형
 *				=> 처리 결과값
 *				=> 기본형 (int, long, double, char, String)
 *				=> 데이터가 여러개 일 때 : 배열/클래스
 * 				=> 자바는 리턴형을 반드시 1개만 사용이 가능
 * 				=> 메소드 자체 처리
 * 					출력 / 추가 / 삭제 / 수정 => void
 * 				int 메소드명()
 * 				{ 
 * 					return 값; => int와 같거나 작은 데이터형(int, char, short, byte)
 * 				}
 * 
 * 				*** 변수명이 다른 경우
 * 				int a=10;
 * 				System.out.println(b)
 * 				*** 리턴형 값 다른 경우
 * 				-----------------------
 * 			= 메소드명 
 * 				=> 식별자
 * 					알파벳, 한글 사용가능 => 알파벳 사용을 권장
 * 						  ---
 * 						  자바() => %EDED%WW%DED => ??()
 * 					=> 대소문자 구분 O
 * 					=> 소문자로 시작 : 약속
 * 					=> 숫자 맨앞에 사용 X
 * 					=> 키워드 사용 X
 * 					=> 공백 사용 X
 * 					=> 가급적이면 의미가 부여 된 메소드명 사용(예:aaa()보다는 insert())
 * 			= 매개변수 : 사용자 요청 데이터 
 * 				=> 가공 => 결과값 도출
 * 				=> 없는 경우/여러 개/한 개 ...
 * 					예) 검색 요청 => 매개변수:검색어 1개 
 * 						로그인 요청 => 매개변수: id,pw 2개
 * 						회원가입 => 매개변수: id,pwd,name,sex,birthday... 여러개 => class 사용
 * 						정렬 => 배열 사용
 * 						--------------------------------------------------------------- 3개 이상이면 배열/클래스 사용
 * 				=> 동작
 * 					호출 => 매개변수 => 처리 => 결과값 돌려준다
 * 				=> 기본 : 재사용/다른 클래스 통신
 * 						 => 반드시 한개의 기능만 수행
 * 						 => 최대한 세부적으로 분리
 * 				=> static void aaa(int a){}
 * 					: 같은 클래스에서 호출
 * 						aaa(10) => int a에 10 입력
 * 					: 다른 클래스에서 호출
 * 						클래스명.aaa(20)
 * 			= static int aaa(int a, int b){}
 * 				=> int a=aaa(10,20)
 * 			= 메소드를 호출할 경우
 * 				=> 처음부터 끝까지 수행 => "호출한 위치로 원상 복귀"
 * 			=> 메소드 종료 : return이 있는 곳에서 종료
 * 				void aaa(int a)
 * 				{
 * 					if(a==10)
 * 						return;
 * 					else
 * 						return;
 * 				}
 * 				aaa(10) ==> if문장을 수행하고 종료
 *			=> 특별한 경우가 아니면 void에는 return을 생략
 *				 void aaa()
 *				{
 *					---
 *					---
 *					---	
 *					return은 자동으로 추가 => 컴파일러가 처리
 *				}
 *
 *		void aaa(int a)
 *		{
 *			System.out.println("진입");
 *			System.out.println("요청값="+a);
 *			System.out.println("종료");
 *		}			
 *
 *		aaa(1) => 진입 => 요청값=1 => 종료	
 *		aaa(2) => 진입 => 요청값=2 => 종료
 *		aaa(3) => 진입 => 요청값=3 => 종료
 *
 *		void bbb()
 *		{
 *			int a=10; => 3번의 메모리 생성(누적X)
 *			System.out.println(a)
 *			a++;
 *		}
 *		bbb() => 10	
 *		bbb() => 10
 *		bbb() => 10
 *  
 * */
import java.util.Scanner;
// 숫자야구
/*
 * 	난수 발생 : 임의의 수 3개 추출
 * ----------------
 * 	사용자 입력
 * 	배교
 * 	힌트
 * 	종료여부
 * ---------------- 메소드 5개
 * => 전체 조립
 * ---------------- 1개 process()
 * 
 * 1. 매개변수 전송
 * 2. 호출 위치
 * 3. 다시 게임 시작 => 재귀호출
 * ------------------------------
 * 
 * */
public class 메소드_1 {
//	static int[] rand()
//	{
//		int[] com=new int[3];
//		for(int i=0;i<com.length;i++)
//		{
//			com[i]=(int)(Math.random()*9)+1;
//			for(int j=0;j<i;j++)
//			{
//				
//				//j는 이미 저장, i는 지금 발생
//				if(com[j]==com[i])
//				{
//					i--;
//					break;
//				}
//			}
//		}
//		return com;
//	}
// 절차적 언어 ==> 구조적 언어 ==> 객체지향(OOP) ==> 횡단지향(AOP)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[3];
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)
			{
				
				//j는 이미 저장, i는 지금 발생
				if(com[j]==com[i])
				{
					i--;
					break;
				}
			}
		}
		// 사용자 입력 받기
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			// 사용자 입력
			System.out.print("세자리 정수 입력:");
			int input=scan.nextInt();
			// 오루 처리 ==> 입력이 잘못된 경우
			if(input<100 || input>999)
			{
				System.out.println("❌세 자리수를 입력하세요");
				// 다시 처음부터 실행 => while의 조건식으로 이동시킨다 => continue
				continue;
			}
			user[0]=input/100; //백의자리
			user[1]=(input%100)/10; //십의자리
			user[2]=input%10; //일의자리
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("❌중복된 수는 사용할 수 없습니다");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("❌0은 사용할 수 없습니다");
				continue;
			}
			
			// 비교 => 힌트 => s: 같은 위치에 같은 값, b : 다른 위치에 같은 값
			int s=0,b=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(com[i]==user[j])
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
			
			//종료
			if(s==3)
			{
				System.out.println("🎉🎉 축하합니다!!Game Over");
				break;//while문 종료
			}
		}
	}

}
