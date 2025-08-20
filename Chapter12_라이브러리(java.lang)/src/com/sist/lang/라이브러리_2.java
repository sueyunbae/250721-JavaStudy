package com.sist.lang;

class Student
{
	int hakbun=1;
	String name="홍길동";
	public void print()
	{
		System.out.println("학번:"+hakbun);
		System.out.println("이름:"+name);
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.err.println("객체 소멸!!");
	}

public class 라이브러리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		
		s.hakbun=2;
		s.name="박문수";
		s.print();	
		
		s=null;
		s.hakbun=3;
		s.name="박문수2";
		s.print();	
	
	}
}

}
