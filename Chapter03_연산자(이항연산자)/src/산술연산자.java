/*
 * 산술연산자
 * => 자동형변환을 잘 해야 함
 *    1) 큰 데이터형으로 변경 후 연산
 *       10+10.5
 *       10.0+10.5 => 20.5
 *       int + char(int변환)
 *       double + char(double변환)
 *    2) int이하 데이터형(byte,char,short) => 다 int
 *       연산시에 결과값 => int
 *       char + char = int 
 *       short + byte = int
 *       byte + byte = int
 *    3) +,-보다 *,/,%가 우선순위
 *       3+(5*2) = 13
 *       (3+5)*2 = 16
 * + : 덧셈, 문자열결합(String)
 * 		=> 산술규칙
 *      => 7+"7"+7 => "777"
 *      => 7+7+"7"+7+7 = 14+"7"+7+7 = "147"+7+7 = "1477"+7 ==> "14777"
 * - : 뺄셈
 * * : 곱하기 5*2=10
 *     7+"7"*10 => 오류(+빼고 나머지는 문자열 연산이 되면 안된다)
 * / : 나누기
 *     1) 정수/정수=정수 5/2=2 10/3=3
 *                   5/2.0=2.5 10/3.0=3.33333 
 *     2) 0으로 나누면 오류 발생(By zero 오류)
 * % : 나누고 나머지 값 => 배수, 여러명 턴
 * 	   5%2 => 1 -5%2=-1 -5%-2=-1 5%-2=1 ==> 결과값은 항상 왼쪽 부호와 동일
 * 연산처리 => 자동형변환/복잡한계산은 ()사용, 오버플로우(데이터형 잘못 했을 떄)
 */

import java.util.Scanner;
public class 산술연산자 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a=369;
//		System.out.println(a/100);
//		System.out.println((a%100)/10);
//		System.out.println((a%10));
//		System.out.println((byte)468);
/*
		 * byte(340)
		340을 2진법으로
		
		256 128 64 32 16 8 4 2 1
		  1   0    1  0   1  0 1 0 0       byte형으로 하면 오버플로우
		
		256 | 128 64 32 16 8 4 2 1
		  1  |   0    1  0   1  0 1 0 0    이렇게 84로 처리 됨(앞이 0이라 양수)
		
		
		byte(468)
		468을 2진법으로
		111010100 byte형으로 하면 오버플로우 
		1|11010100 (앞이 1이라 음수)
 */		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("첫번째 정수:");
//		int num1=scan.nextInt();
//		System.out.print("두번째 정수:");
//		int num2=scan.nextInt();
//		
//		System.out.printf("=====결과=====");
//		System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
//		System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
//		System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
//		System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
//		System.out.printf("%d%%%d=%d\n",num1,num2,num1%num2); //%쓰려면 %% 
		
		Scanner scan=new Scanner(System.in);
		System.out.print("단어 입력:");
		
		/*String s1=scan.next();
		String s2=scan.next();
		String s3=scan.next();
		*/
		
		String s=scan.nextLine(); //세가지 단어 한번에 받기
		
		System.out.println("=====결과=====");
		System.out.println(s);
		
		
	}

}
