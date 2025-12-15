// 폭탄 맞추기 게임 
import java.util.Scanner;
public class 제어문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("등급 입력(3~7):"); //몇번 맞추는지
		int bomb=(int)(Math.random()*10)+1;
		int level=scan.nextInt();
		
		int success=0;
		
		System.out.println("☢️ 폭탄피하기 게임(1~10) 사이의 정수 입력:");
		while(success<level)
		{
			System.out.println("정수 입력:");
			int input=scan.nextInt();
			
			if(input<1 || input>10)
			{
				System.err.println("❌ 사용할 수 없는 숫자입니다");
				continue;//처음으로 다시 돌아간다
			}
			
			if(input == bomb)
			{
				System.out.println("🤢 게임 OVER(폭탄 위치는 "+bomb+"번에 있습니다)");
				break;//while문 종료
			}
			
			else
			{
				System.out.println("😍 게임을 계속 진행하세요");
				success++;
			}
		}
		
		if(success==level)
		{
			System.out.println("🌈축하합니다!! 폭탄을 피했습니다");
		}

	}

}
