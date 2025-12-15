//계산기 프로그램 => 종료전까지
import java.util.Scanner;
public class 제어문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{			
			System.out.print("첫번쨰 정수 입력:");
			int num1=scan.nextInt();
			
			System.out.print("연산자 입력(+,-,*,/):");
			String Op=scan.next();
			
			System.out.println("두번쨰 정수 입력:");
			int num2=scan.nextInt();
			
			switch(Op)
			{
				case "+" ->{
					System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
				}
				
				case "-" ->{
					System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
				}
				
				case "*" ->{
					System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
				}
				
				case "/" ->{
					if(num2!=0)
						System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
					else
						System.out.println("0값으로 나눌 수 없습니다");
				}
				default ->{
					System.out.println("잘못된 연산자입니다");
				}
			}
			System.out.println("종료할까요?(Y,N)");
			String s=scan.next();
			char c=s.charAt(0);
			//scanner => char를 받지 못한다(입력값에는 char X)
			// String => charAt(index)를 이용해서 한글자로 자른다
			// 문자열의 인덱스번호는 0번부터 시작한다
			if(c=='Y'||c=='y')
			{
				System.out.println("프로그램 종료");
				break;
			}
		}
		

	}

}
