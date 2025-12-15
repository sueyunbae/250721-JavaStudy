/*
 * 		문자열 저장
 * 		-------- 기능
 * 		String : 데이터형+클래스
 * 						----- 기능처리(메소드)
 *		println() print => 화면 출력, random() 임의 실수 추출
 *		
 *		1. 저장 방법
 *			String 변수명="문자열" => 제한이 없다
 *		2. 문자열 제어가능하게 기능처리(메소드 제공)
 *			메소드 
 *			1) 리턴형	
 *			2) 메소드명
 *			3) 매개변수
 *			4) 어떤 기능인지 확인 
 *			------------------ 이미 제작되어 있음 => 암기(String => 변경할 수 없다)
 *			=> 변경이 안되는 클래스
 *				String / System / Math => 중단 클래스(final)
 *			=> 형태
 *				리턴형 메소드명(매개변수_list) 
 *				---- ----- ------ 암기해야함
 *			1) 문자의 갯수
 *				length() => 원형:int length() => 앞에 .(주소 접근 연산자)
 *			2) toUpperCase() aaa=>AAA 대문자로 변환
 *			   toLowerCase() AAA=>aaa 소문자로 변환
 *			   => 원형 : String toUpperCase()
 *						String toLowerCase()
 *			3) substring() => 원하는 문자열을 자르는 경우 사용
 *				=> 원형 : String substring(int beginIndex)
 *						  => beginIndex부터 마지막 문자열 자르기
 *						 Hello Java
 *						 0123456789
 *						 String substring(int beginIndex,int endIndex)
 *					*** 메소드는 같은 이름으로 제작할 수 없다
 *					*** 예외조건 : 매개변수의 갯수나 데이터형이 다르면 다른 메소드로 인식
 *								 => 오버로딩
 *				예) 전화번호
 *
 * 
 * */
public class 정리_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="0123456789";
//		System.out.println("갯수:"+s.length());
//		String s1="Hello 자바 12345";
//		System.out.println(s1.toUpperCase());//s1의 값 자체(원래값)는 변하지 않음
//		System.out.println(s1.toLowerCase());
		String s="0123456789";
		System.out.println(s.substring(5));//index번호 5부터 끝까지
		System.out.println(s.substring(5,9));//index번호 9번은 포함X
	}	

}
