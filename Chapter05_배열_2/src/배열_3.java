// 숫자 야구게임 
/*
 * 난수 발생 => 3 6 9 
 * -----------------
 * 		456 => 1B
 * 		379 => 2S
 * 			..
 * 			   3S
 * */
import java.util.Arrays;
import java.util.Scanner;
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. 컴퓨터 난수 => 중복없는 난수 => 1~9
		 * 2. 사용자 입력
		 * 3. 힌트
		 * 4. 종료 여부(break) 
		 *    --------------- 반복문
		 * */
		int[] com=new int[3];
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j]) //중복된 값 확인
				{
					i--;
					break;
				}
			}
		}

		
		Scanner scan=new Scanner(System.in);
		int[] user=new int[3];
		while(true) //정답을 맞출 횟수가 지정이 안된 경우
		{
			System.out.print("⏰세자리 정수를 입력:");
			int input=scan.nextInt();
			
			if(input<100 || input>999)
			{
				System.out.println("❌세자리 정수만 입력해야 합니다");
				continue; //while문 처음으로
				//  | 
				// wile->조건식으로, for->증가식으로
			}
			
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			//👽비정상적 입력일 때
			if(user[0]==user[1] || user[0]==user[2] || user[1]==user[2])
			{
				System.out.println("👽중복된 수는 사용할 수 없습니다");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("👽0은 사용할 수 없습니다");
				continue;
			}
			
			//정상입력일 때
			int s=0,b=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(com[i]==user[j])//같은 수가 있는지
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			System.out.printf("😎Input Number:%d,Result:%dS-%dB\n",input,s,b);
			// 종료
			if(s==3)
			{
				System.out.println("🎉축하합니다🎉");
				break; //while문 종료
			}
		}
 
		
	}

}
