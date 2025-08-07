import java.util.Scanner;
public class 메소드_1_변환 {
	// 1. 3자리 난수발생
	static int[] rand()
	{
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
		return com;
	}
	// 2. 사용자 입력
	static int[] userInput()
	{
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
			break;//입력이 정상이면 종료해라
		}
		return user;
	}
	// 3. 비교 
	static int compare(int[] com,int[] user)//다른 메소드에서 받아와야하는 변수
	{
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
		System.out.printf("Input Number:%d%d%d,Result:%dS-%dB\n",user[0],user[1],user[2],s,b);	
		
		return s;
	}
	
	static boolean isEnd(int s)
	{
		boolean bCheck=false;
		if(s==3)
			bCheck=true;
		return bCheck;
	}
	
	// 조립 시작(main 밖에서 해야 재사용 가능)
	static void process()
	{
		//난수 값
		int[] com=rand();
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			int[] user=userInput();
			int s=compare(com,user);			
			if(isEnd(s))
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

}
