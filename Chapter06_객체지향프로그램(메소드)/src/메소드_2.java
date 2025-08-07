// 정수를 입력받아서 2진법 출력 
// => 10 => 0000 0000 0000 1010
import java.util.Scanner;
public class 메소드_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수입력(0~32767):");
		int num=scan.nextInt();
//------------------------------------------------------------------- 입력		
		// 저장 준비
		int[] bin=new int[16]; 
		// 배열 => 어느쪽부터 데이터를 채울지 결정해야함
		int index=bin.length-1;
		
		while(true) //반복 횟수가 지정 되지 않았을 경우(지정 되어있으면 for문)
		{
			bin[index]=num%2;
			num/=2;
			
			if(num==0)
				break;
			
			index--;			
		}
//--------------------------------------------------------------------- 처리		
		System.out.println("======= 결과값 ======");
		for(int i=0;i<bin.length;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(bin[i]);
		}
//---------------------------------------------------------------------- 출력
	}
}
