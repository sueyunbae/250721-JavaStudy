import java.util.Scanner;
public class 메소드_1_변환2 {
	// 난수 발생
	/*
	 * 사용자 입력
	 * 비교
	 * 종료
	 * */
	// 전역변수 사용 => 매개변수 자주 안써도 됨 
	static int[] com=new int[3];
	static int[] user=new int[3];
	static int s,b;
	static void rand()
	{
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
	}
	
	static void userInput()
	{
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
			break;//입력이 정상이면 종료해라
		}
	}
	
	static void compare()
	{
		s=0;
		b=0;
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
		System.out.printf("Input Number:%d%d%d,Result:%dS-%dB\n",user[0],user[1],user[2],s,b);	
	}
	static boolean isEnd()
	{
		boolean bCheck=false;
		if(s==3)
			bCheck=true;
		return bCheck;
	}
	
	static void process()
	{
		rand();
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			userInput();
			compare();			
			if(isEnd())
			{
				System.out.println("🎉🎉 축하합니다!! ");
				System.out.print("게임을 다시 할까요?(y/Y):");
				char c=scan.next().charAt(0);
				if(c=='y' || c=='Y')
				{
					System.out.println("새 게임을 시작합니다!!");
					process();//재귀 호출
					// 자신의 메소드를 호출
				}
				else
				{
					System.out.println("Game Over!!");
					System.exit(0);//프로그램 아예 종료
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

	/*
	 *  class 영역 => 전역변수 => 클래스 안에 있는 모든 메소드에서 사용이 가능
	 *  			 메소드에서 공통으로 사용되는 변수
	 * --------------------
	 *  method 영역 => 지역변수
	 *  method () => 매개변수
	 * -------------------- 스택 => 메소드 종료시 메모리 해제
	 * */
	
	/*
	 * 절차적 언어 => 재사용이 불가능
	 * 			   소스 수정이 어렵다
	 * => 개선사항
	 * 		재사용이 가능/ 게임 다시 수행 가능
	 * 		소스 관련내용을 모아서 관리 => 수정
	 * 		구조적인 프로그램(메소드)
	 * 		---------------------------
	 * 		매개변수 / 리턴형 너무 많다
	 * 		--------------------
	 * 		 | 전역변수 도입
	 * => 객체지향 프로그램
	 * 
	 * */
}
