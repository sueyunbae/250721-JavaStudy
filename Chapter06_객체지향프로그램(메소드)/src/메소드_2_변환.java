import java.util.Scanner;
public class 메소드_2_변환 {
	//입력 메소드
	static int input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("정수입력(0~32767):");
		int num=scan.nextInt();
		return num;
	}
	//처리 메소드
	static int[] binary(int num) //binary(int), binary(int,int[])
	{	
		int[] bin=new int[16];
		int index=bin.length-1;
		
		while(true) 
		{
			bin[index]=num%2;
			num/=2;
			
			if(num==0)
				break;
			
			index--;			
		}
		return bin;
		//return;생략
	}
	//출력 메소드(void)
	static void print(int[] bin) 
	{
		System.out.println("======= 결과값 ======");
		for(int i=0;i<bin.length;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(bin[i]);
		}
	}
	static void process()
	{	
		int num=input();
		int[] bin=new int[16]; 
		print(bin);
//		int[] bin=binary(num);
//		print(bin);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process(); 
	}

}
