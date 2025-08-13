package com.sist.a;

public class Board {
	public void board_list()//public을 써야만 다른 패키지나 원하는 위치에서 사용할 수 있다
	{
		System.out.println("게시판 목록처리");
	}
	public void board_상세보기(int no)
	{
		System.out.println(no+"번째 게시물 상세보기");
	}

}
