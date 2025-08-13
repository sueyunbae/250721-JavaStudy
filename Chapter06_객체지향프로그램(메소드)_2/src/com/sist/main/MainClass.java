package com.sist.main;
import com.sist.a.Board;//package 위에 쓰면 오류남
// 메소드/클래스/생성자=>다른 패키지에 있는 클래스와 연결
// 접근지정어 public
// => 변수:private => public getter/setter
// 여러 개의 클래스를 만들어서 => 조립
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board b=new Board();
		b.board_list();
		b.board_상세보기(1);
	}

}
