// 가위 바위 보 
import java.util.Scanner;
public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴퓨터 => 0(가위) 1(바위) 2(보) 
		// 사용자
		int com=(int)(Math.random()*3); // 0,1,2 랜덤 
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0),바위(1),보(2):");
		int user=scan.nextInt();
		
		//배열 이용하여 출력 
		System.out.println("===== 결과값 =====");
		String[] res={"가위","바위","보"};//0일때 가위,1일때 바위,2일때 보 출력
		System.out.println("컴퓨터:"+res[com]);
		System.out.println("사용자:"+res[user]);
		
//		if(com==0)
//			System.out.println("컴퓨터:가위");
//		else if(com==1)
//			System.out.println("컴퓨터:바위");
//		else if(com==2)
//			System.out.println("컴퓨터:보");
//
//		if(user==0)
//			System.out.println("사용자:가위");
//		else if(user==1)
//			System.out.println("사용자:바위");
//		else if(user==2)
//			System.out.println("사용자:보");

	}

}
