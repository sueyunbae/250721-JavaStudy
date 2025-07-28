// if~else 114p
// 결과값이 2개로 나눠지는 경우 if ~ else
//입력을 받아서 로그인 처리
//id,pwd => 오라클에서 처리
import java.util.Scanner;
public class 제어문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 임의로 ID,PWD 설정
		final String ID="admin";
		final String PWD="1234"; 
		//final : 상수 => 상수는 변수와 구분 하기 위해 모든 키워드를 대문자로 설정
		Scanner scan=new Scanner(System.in);
		System.out.println("아이디 입력:");
		String id=scan.next();
		
		System.out.println("비밀번호 입력:");
		String pwd=scan.next();
		
		/*
		 * scan.nextInt() : 정수 int에 저장
		 * scan.nextDouble() : 실수 double에 저장
		 * scan.nextBoolean() : true/false boolean에 저장
		 * 
		 * scan.next()
		 * scan.nextLine() => String에 저장
		 * */
		
		 System.out.println("==== 결과 ====");
		 if(id.equals(ID) && pwd.equals(PWD))
		 	System.out.println("로그인되었습니다");
		 	
		 else
			 System.out.println("아이디나 비밀번호가 틀립니다");
	}

}
