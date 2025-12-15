// 10번 가위바위보 결과값 표시 => 가위바위보 5승 1무 4패
import java.util.Scanner;
/*
 *   <경우의 수>===> com-user  win
 * 		com 0
 * 			user 0    0   
 * 			user 1   -1       u
 * 			user 2   -2       c
 * 		com 1
 * 			user 0    1       c
 * 			user 1    0
 * 			user 2   -1       u
 * 		com 2
 * 			user 0    2       u
 * 			user 1    1       c
 * 			user 2    0
 * */ 
public class 제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int win=0;
		int lose=0;
		int same=0;
		
		for(int i=1;i<=10;i++)
		{
			//1. compute => 난수
			int com=(int)(Math.random()*3);
			//2. 사용자 입력
			System.out.println("가위(0),바위(1),보(2):");
			int user=scan.nextInt();
			
			if(user<0||user>2)
			{
				System.err.println("가위,바위,보를 입력해야됩니다");
				i--;//***잘못 입력했을 때 전 상태로 돌리기 위해 
				continue;// for 문으로 다시 돌아가서 i++
			}
			
			// 정상 입력이 된 상태라면
			int res=com-user;
			if(res==-2 || res==1)
			{
				lose++;
				System.out.println("컴퓨터 Win!!");
			}
			else if (res==2 || res==-1)
			{
				win++;
				System.out.println("플레이어 Win!!");
			}
			else
			{
				same++;
				System.out.println("비겼다");
			}			
			
			//3. 승/무/패
		}
		System.out.println("==== 결과값 ====");
		System.out.printf("%d승 %d무 %d패\n",win,same,lose);
	}

}
