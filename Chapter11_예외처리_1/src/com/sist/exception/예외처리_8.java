package com.sist.exception;
// 예외 임의 발생 => throw => 견고한 프로그램인지 테스트
// 배포 전에 주로 사용 => 개발상에서는 사용 빈도가 낮다
import java.util.*;
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg); // 사용자 정의 예외처리 
	}
}
public class 예외처리_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("정수 입력:");
			int num=scan.nextInt();
			if(num%2==0)
				throw new MyException("홀수만 입력이 가능합니다");
			/*
			 * 	throw 예외처리 클래스의 생성자 호출
			 * 	-------------------------- 
			 * 	밑에는 코딩이 불가능
			 * 	
			 * 	if(조건문)
			 * 	{
			 * 		System.out.println(1);
			 * 		throw new Exception(); catch로 이동
			 * 		System.out.println(2); // Error
			 * 	}
			 * */
		}catch(MyException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

}
