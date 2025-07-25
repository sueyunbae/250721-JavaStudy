/*
 * 	1. 12,1,2
 *     3,4,5
 *     6,7,8
 *     9,10,11
 * */
import java.util.Scanner;
public class 제어문_조건4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("월 입력: ");
		int month=scan.nextInt();
		
		System.out.println("====== 월 입력 ======");
		if(month==12||month==1||month==2)
			System.out.println(month+"월은 겨울입니다");
		
		if(month==3||month==4||month==5)
			System.out.println(month+"월은 봄입입니다");
		
		if(month==6||month==7||month==8)
			System.out.println(month+"월은 여름입니다");
		
		if(month==9||month==10||month==11)
			System.out.println(month+"월은 가을입니다");
		
		if(month>12||month<1)
			System.out.println(month+"잘못 입력");
		
	}

}
