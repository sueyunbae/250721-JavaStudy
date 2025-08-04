/*
 *  문자열 => String : 1,2,3,4 프로젝트 
 *                   -------------- 사용하는 변수/배열/클래스
 *                   				여기에 사용되는 데이터형의 85%가 String
 *  = 문자 여러개를 동시에 저장
 *    String == char[]
 *      | ==> String이 더 쉽게 제어할 수 있다
 *    저장방법
 *    	String s="문자열"  => 일반데이터형
 *      String s=new String("문자열","문자코드")
 *      		 ---------------------------
 *      						ISO-8859_1 ASC
 *      						=> UTF-8
 *      						=> 한글:자음+모음 2byte
 *      new : 새로운 메모리 공간에 저장해라
 *      
 *    제어하는 기능
 *    --------- 메소드는 반드시 결과값이 있다
 *    1. 변환
 *    	String toUpperCase() = 대문자 변환
 *    	String toLowerCase() = 소문자 변환
 *    	------------------------ 검색
 *    	***valueOf() --- 모든 데이터형을 문자열 변환
 *    	String valueOf(10) => "10" 문자로 변경    
 *           *오버로딩 같은 이름으로 새로운 기능을 만들 때
 *            오버라이딩 우리 프로그램에 맞게 변경해서 쓰는 것    
 *    2. 제어
 *    	 문자 자르기
 *    	 String substring(int beginIndex)
 *    	 String substring(int beginIndex,int endIndex)
 *    									 ------------ 
 *    									 endIndex-1까지
 *     	 문자를 자른다 => 구분 문자별
 *     				  " " "," "|" ... 
 *     	 green,blue,black
 *     	 String[] split(String del)
 *     	 String trim() => 좌우 공백 제거
 *     
 *     	 문자열 결합
 *     	 String concat(String s) ***** 사용빈도 거의 없음(결합 연산자 + 사용이 더 편함)
 *     		"ABC" + "DEF"  ==> 오라클
 *     		"ABC".concast("DEF") ==> MySQL
 *    3. 변경
 *    		replace(char c1,char c2)
 *    		replace(String s1, String s2)
 *    		String ss="Hello Java";
 *    		ss.replace('a','b')
 *    			=> "Hello jbvb"
 *    		ss.replace("Java","Oracle")
 *    			=> "Hello Oracle"
 *    		String replaceAll(바꿀 대상문자(문자열),문자열) => 정규식 [가-힣] [A-Z]...
 *    4. 찾기
 *    	 char charAt(int index) => 문자한개 추출
 *    	 "Hello Java"
 *    	  0123456789  => charAt(7) => 'a'
 *    	
 *    	  int indexOf(char)
 *    	  int lastUndexOf(char)
 *    		indexOf('l') => 2 => 크롤링
 *     		lastUndexOf('l') => 3 => 경로명/URL,확장자
 *    5. 비교
 *    	 boolean equals(String s)
 *    		=> 대소문자 구분(로그인 처리/아이디 중복체크)
 *    	 boolean equalsIgnoreCase(String s)
 *    		=> 대소문자 구분 X(검색)
 *    	 boolean startsWith(String s)
 *    		=> 시작문자열이 같은지 확인 : 대소문자 구분
 *    		   자동완성기
 *             => 쿠키 저장 => 시작문자열이 같은 경우
 *       boolean endsWith(String s)
 *       	=> 끝나는 문자열이 같은경우 : 대소문자 구분
 *       compareTo(String s)
 *       "Hello".compareTo("Java") 양수 2 
 *       "Hello".compareTo("Hello") 0   
 *       "Java".compareTo("Hello") 음수 -2
 *    
 * */

// 모든 문자열 배열값을 대문자로 변환하기 
import java.util.Arrays;
public class 문자열배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		System.out.println(s.toUpperCase());
//		char[] ch= {'a','B','c','d','E','K'};
//		
//		for(int i=0;i<ch.length;i++)
//		{
//			if(ch[i]>='a' && ch[i]<='z')
//				ch[i]=(char)(ch[i]-32);
//		}
//		// 인덱스가 존재 => 데이터값을 변경
//		// for-each => 값을 받는 변수만 이용 => 출력
//		System.out.println(Arrays.toString(ch));
//		
//		//이렇게 해도 같은 결과
//		String s="aBcdEK";
//		System.out.println(s.toUpperCase());
//		/*
//		 * 	char[] => String
//		 *  int => Integer
//		 *  long => Long...
//		 *  --------------------Wrapper 클래스
//		 * */
		
		
		// 문자열은 자체가 메모리 주소다
		// 같은 문자열은 같은 주소를 가지고 있다
//		String s1="Hello";
//		String s2="Hello";
//		String s3=new String("Hello");
//		
//		if(s1==s2)
//			System.out.println("같다");
//		else
//			System.out.println("다르다");//같다
//		if(s1==s3)
//			System.out.println("같다");
//		else
//			System.out.println("다르다");//다르다		
		
		int[] arr= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		/*
		 * 	arr : 주소 ==> 1 2 3 4 5
		 * */
		int[] arr2=arr;
		System.out.println(Arrays.toString(arr2));
		
		arr2[0]=100;
		arr2[1]=200;
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr);
		System.out.println(arr2);// 클래스에서 제외 => String => 일반 데이터형
		
		int[] arr3=arr.clone();//깊은 복사
		System.out.println(arr3);
		
		String s1="Hello";
		String s2="Java";
		int res=s1.compareTo(s2); //문자 비교 => 0 => 정렬할때 사용
		System.out.println(res);
		
		int aa=100;
		int bb=200;
		aa=bb;
		bb=aa;
		System.out.println(aa+"|"+bb);		

		aa=100;
		bb=200;
		int tt=aa;//임시변수 선언
		aa=bb;
		bb=tt;
		System.out.println(aa+"|"+bb);
								
	}

}
