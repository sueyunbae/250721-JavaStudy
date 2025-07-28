import java.util.Scanner;
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("세 정수를 입력하세요:");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		int max=num1;
		if (num1<num2)
			max=num2;
		if (num2<num3)
			max=num3;
		System.out.println("최댓값:"+max);
		
		int min=num1;
		if (num1>num2)
			min=num2;
		if (num2>num3)
			min=num3;
		System.out.println("최솟값:"+min);
		
	}

}
