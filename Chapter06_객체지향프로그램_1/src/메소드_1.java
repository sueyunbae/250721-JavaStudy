/*	사용자로부터 정수(2~9)를 받아서 해당 구구단 출력 
 * 	----------------매개변수      -------- **1) void => 메소드 안에서 처리
 * 									  	 2) String으로 전송
 * 									     3) 배열
 * 	====> 리턴형 X 매개변수 O
 * 
 * */
// 메소드 동작 순서 표시 
import java.util.Scanner;
/*
 * static void gugudan(int dan) 
 * 
 * => gugudan(3) 
 * => gugudan(int dan) dan=3
 *            ------- 매개변수 => 지역변수와 동일(메소드 안에서만 사용하는 변수) 
 *            			| 
 *                    사용자로부터 요청값을 받을 경우
 * => 소스는 동일
 * 	  기능별로 나눠서 처리 => 가독성 / 디버깅편리 / 에러 발견 및 처리 용이
 * 	  ---------------------------------------------------
 * 		
 * */
public class 메소드_1 {
	static void gugudan(int dan) //구구단 출력 기능 -> 재사용 가능
	{
		System.out.println("3.사용자로부터 받은 값:"+dan);
		System.out.println("4.gugudan:진입");
		for(int i=1;i<=9;i++)
		{
			System.out.println(dan+"*"+i+"="+(i*dan));
		}		
		System.out.println("5.gugudan():종료");
	}
	static void process() //단 입력받기 -> 재사용 가능
	{
		System.out.println("2.process():진입");
		Scanner scan=new Scanner(System.in);
		System.out.println("2~9 사이의 정수 입력:");
		int dan=scan.nextInt();
		gugudan(dan);//클래스 내에서 메소드 사용
		System.out.println("6.process():종료");
	}
	
	// 시작점 : 제일 먼저 main부터 시작(프로그램은 main이 없는 경우에는 실행이 안된다 => 모든 프로그램은 main이 한 개 이상 존재)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.main():진입");
		process();//클래스 내에서 메소드 사용
		System.out.println("7.main():종료");
	}

}
