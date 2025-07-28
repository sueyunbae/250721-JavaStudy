//문자 1개 입력 => 대문자, 소문자, 숫자, 한글
//0과 '0'은 다르다('0'은 48), '1'은 49, '2'는 50...


/*
 * package
 * import
 * import...
 * class ClassName{
 * 
 * }
 * */

import java.util.Scanner;
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		char c=s.charAt(0);
		
		if(c>='A' && c<='Z')
		{
			System.out.println(c+"는(은) 대문자입니다");
		}
		
		else if(c>='a' && c<='z')
		{
			System.out.println(c+"는(은) 소문자입니다");
		}
		
		else if(c>='0' && c<='9')
		{
			System.out.println(c+"는(은) 숫자입니다");
		}
		
		else
		{
			System.out.println("알파벳이나 숫자가 아닌 문자입니다");
		}
	}

}
