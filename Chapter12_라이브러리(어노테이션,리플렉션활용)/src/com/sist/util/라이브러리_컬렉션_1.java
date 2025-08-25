package com.sist.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * 	15장(컬렉션클래스) / 13장(제네릭스)
 * 	
 * 	16장 / 17장 / 19장(X)
 * 				------ 오라클
 * 		 ---- 네트워크
 *  9장 / 14장 / 18장  
 *  ----------------
 *  
 *  Collection
 *  ----------
 *  1) 데이터를 묶어서 쉽게 관리할 수 있게 만든 클래스의 집합
 *     ------------------ 자료구조(스택,큐,데큐)
 *     0 => length-1
 *     0 => 0
 *  2) Collection Framework
 *  			  --------- 
 *  			  => 표준화 => 동일한 형태의 소스코딩
 *  			  => Spring / MyBatis / JQuery / Vue, React
 *  			  => 일정 틀 => 쉽게 다른 개발자의 코딩분석
 *  3) 배열의 단점을 보완
 *     ---- 고정적 => 가변형
 *  4) 종류
 *  	Collection (interface)
 *  	----------------------
 *  			  |
 *  	----------------------
 *  	|		  |			 | 
 *    List		 Set        Map => interface
 *    	|		  |			 |
 *    		  --------		 ------------
 *    		  |	     |		 |		    |
 *    	  HashSet  TreeSet	Hashtable HashMap
 *    ---------------------- 구현된 클래스
 *    |			  |        |
 *    ArrayList	Vector LinkedList
 * 						   |
 * 						 Queue
 * 		  List
 * 			1) 순서를 가지고 있다(인덱스번호) => 0
 * 			2) 데이터 중복 저장 허용
 * 			3) CRUD를 주로 사용(추가,읽기,수정,삭제)
 * 			4) 비동기적 => 속도가 빠르다 => 데이터베이스 사용
 * 			5) 주요 기능 
 * 			   -------
 * 				1. 데이터 추가 : add(Object)
 * 				2. 데이터 읽기 : get(int index)
 * 				3. 데이터 수정 : set(int index,Object)
 * 				4. 데이터 삭제 : remove(int index)
 * 				5. 데이터 갯수 : size()
 * 				6. 전체 삭제 : clear()
 * 				7. 데이터 존재 여부 : isEmpty()
 * 			6) 구현된 클래스
 * 				= ArrayList : 가장 ***많이 사용되는 클래스
 * 					=> 데이터베이스 (비동기적-순서X,속도 빠름,신뢰성 낮음)
 * 				= Vector
 * 					=> 네트워크 (동기적) 					
 * 				= LinkedList : 양방향 => 저장되는 내용이 많음 메모리가 커진다
 * 			7) import 추가 => java.util
 * 		---------------------------------------------------------------
 * 		  Set
 * 			1) 순서가 없다(인덱스가 없다)
 * 			2) 중복된 데이터를 허용하지 않는다 
 * 				add(1) add(1) add(1) add(2) => add(1) add(2)만 저장
 * 			3) 주로 사용 ==> List에 중복된 데이터 제거
 * 			4) 구현된 클래스 : HashSet, TreeSet
 * 			5) 주요 기능
 * 				1. 데이터 추가 : add(Object)
 * 				2. 데이터 읽기 : get()
 * 				3. 데이터 수정 : set(Object)
 * 				4. 데이터 삭제 : remove(Object)
 * 
 * 				5. 데이터 갯수 : size()
 * 				6. 전체 삭제 : clear()
 * 				7. 데이터 존재 여부 : isEmpty()
 * 
 * */
public class 라이브러리_컬렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List names=new LinkedList();
		// 추가
		names.add("홍길동"); // 인덱스 0
		names.add("박문수"); // 1
		names.add("심청이"); // 2 => 3
		
		System.out.println("현재 인원:"+names.size());
		for(Object obj:names)
		{
			System.out.println(obj);
		}
		System.out.println();
		names.add("이순신"); // 3 => 4
		names.add(2,"강감찬"); // 2 
		
		System.out.println("현재 인원:"+names.size());
		for(Object obj:names)
		{
			System.out.println(obj);
		}
		System.out.println();
		
		names.remove(0);		
		System.out.println("현재 인원:"+names.size());
		for(Object obj:names)
		{
			System.out.println(obj);
		}
		
		System.out.println();
		names.set(2, "춘향이");
		System.out.println("현재 인원:"+names.size());
		for(Object obj:names)
		{
			System.out.println(obj);
		}
		
		System.out.println();
		
		names.clear();
		System.out.println("현재 인원:"+names.size());
		for(Object obj:names)
		{
			System.out.println(obj);
		}
		
		if(names.isEmpty())
		{
			System.out.println("인원이 없습니다");
		}
	}

}
