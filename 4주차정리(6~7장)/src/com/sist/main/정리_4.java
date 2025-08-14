package com.sist.main; 
import java.util.*;
class GenieMusic{
	public void dataIn()
	{
		System.out.println("지니뮤직 크롤링");
	}
	public void list()
	{
		System.out.println("목록 출력!!");
	}
	public String titleFind(String fd)
	{
		System.out.println("제목으로 검색");
		return fd;		
	}
	// 가수/상세/동영상
}
class Melon extends GenieMusic{
	public void dataIn()
	{
		System.out.println("멜론 크롤링");
	}//오버라이딩
}
public class 정리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();//크기를 지정하지 않아도 됨(가변형) => 데이터형:Object
		//ArrayList<String> list=new ArrayList<String>(); 제네릭스
		list.add("홍길동");//list.get(0)
		list.add("심청이");//list.get(1)
		list.add("박문수");//list.get(2)
		list.add(100);
		String name=(String)list.get(0);//Object로 넘어오기 때문에 String 형변환을 해 줘야 함
	}

}
