package com.sist.main;
/*
 * 		재사용법
 * 		 = 변경없이 재사용 => 포함 클래스(has-a) *****웹
 *       = 변경후 재사용 => 상속(is-a)
 *       1) 상속
 *       	기존의 클래스(이미 만들어진 클래스)의 모든 기능과 변수를 받아서 새로운 기능의 클래스를 만든다
 *       												  --------확장
 *       	=> 목적
 *       		코드 재사용(소스 간결하다)
 *       		신뢰성이 뛰어나다
 *       		유지보수가 용이하다
 *       	=> 키워드 : extends
 *       	=> 기능 변경이 가능 => 오버라이딩
 *       	=> 단점 : 속도가 늦다
 *       			 상속 내린 클래스 => 메모리 할당
 *       			 상속받은 클래스 => 메모리 할당
 *       			 메모리가 비대해짐
 *       	=> 상속의 예외 조건
 *       		= 생성자
 *       		= static => 사용이 가능하게
 *       		** private 상속은 된다 => 접근이 불가능 (protected를 쓰면 해결)
 *       	=> 가독성이 떨어진다
 *       	=> 자신의 클래스 => this
 *       	=> 상위클래스 => super
 *       	=> 자바는 단일 상속만 가능하다
 *       			------ 다중상속가능 : 인터페이스
 *       	=> 상속 내린 클래스 : 부모클래스, 슈퍼클래스, 베이스클래스, 상위클래스
 *       	=> 상속 받은 클래스 : 자식클래스, 서브클래스, 파생클래스, 하위클래스
 *       	       	
 *       	class A
 *       	{
 *       		int a,b,c;
 *       	}
 *       	class B extends A
 *       	{
 *       
 *       	} //a,b,c 포함(사용가능.하지만 알기 어렵다) 
 * */
class Super
{
	int age;
	String name;
	public void eat()
	{
		System.out.println("super:먹는다");
	}
	public void run()
	{
		System.out.println("super:달린다");
	}
}
class Sub extends Super
{
	
//	public Sub()
//	{
//		super();
//		age=50;
//		name="춘향이";		
//	}
	public void eat()
	{
		System.out.println("sub:먹는다");
	}
	public void run()
	{
		System.out.println("sub:달린다");
	}
}
public class 재사용 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 변수 => 선언되는 클래스
		 * 		Super ss = ss가 갖고 있는 변수
		 * 2. 메소드 => 생성자
		 * 		Super ss=new Sub()
		 * 				 --------- 메소드
		 * 		-------- 변수
		 * 
		 * */
		Super s=new Super();
		s.age=100;
		s.name="이순신";
		System.out.println("나이:"+s.age);
		System.out.println("이름:"+s.name);
		s.eat();
		s.run();
		
		System.out.println("==============");
		Sub sub=new Sub();
		sub.age=20;
		sub.name="심청이";
		System.out.println("나이:"+sub.age);
		System.out.println("이름:"+sub.name);
		sub.eat();
		sub.run();
		
		System.out.println("==============="); //인터페이스
		Super ss=new Sub(); // 크기 => 상속 내린 클래스 > 상속 받는 클래스 // 작은 클래스를 큰 클래스에 대입하는것이 가능
		System.out.println("나이:"+ss.age);
		System.out.println("이름:"+ss.name);
		ss.eat();
		ss.run();
		
	}

}
