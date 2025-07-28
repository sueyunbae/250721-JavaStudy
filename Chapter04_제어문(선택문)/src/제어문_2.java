import java.util.Scanner;
/*
 * 	1. 사용자 입력
 * 	2. 입력 처리	
 * 	3. 결과값 출력
 * 	
 * */
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("1~10 사이의 정수 입력:");
		
		int score=scan.nextInt();
//		switch(score)
//		{
//		case 10:
//		case 9:
//			System.out.println("A");
//			break;
//		case 8:
//			System.out.println("B");
//			break;
//		case 7:
//			System.out.println("C");
//			break;
//		case 6:
//			System.out.println("D");
//			break;
//		default:
//			System.out.println("F");
//		}
		
		//람다방식 => 콤마 사용

		switch(score)
		{
		case 10,9 -> {
			System.out.println("A");
			break;
		}
		case 8 -> {
			System.out.println("B");
			break;
		}
		case 7-> {
			System.out.println("C");
			break;
		}
		case 6-> {
			System.out.println("D");
			break;
		}
		default-> {
			System.out.println("F");
		}
		}

		
	}

}
