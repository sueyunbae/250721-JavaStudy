/*
 * 형변환
 *  = 자동형변환
 *     큰데이터형 = 작은데이터형
 *        |          |
 *       --------------
 *             |
 *            자동형변환
 *     int a='A'; ==> 4byte에서 2byte로 ==> 'A'자동으로 65로 변경해서 저장
 *     long a=100; ==> 8byte에서 4byte로 ==> 100L
 *     double d='A' ==> 'A'를 double로 변경후에 저장 => 65.0
 *     -------------------------------------------------------------
 *     데이터형 = 같은데이터형
 *     ------------------
 *     int a=100
 *     char c='A' => 왼쪽이 크거나 같아야함 
 *                   작은 데이터가 들어오면 자동으로 데이터형이 변경
 *     오른쪽이 큰 경우
 *     작은데이터형 = 큰데이터형값
 *     int a=10.5 ==> error발생(자동으로 변경이 안된다)
 *                    강제로 변경해야함(데이터형)
 *                    (int), (double), (char)...
 *                    => int a=(int)10.5; => a=10
 *     => char c=(char)65.0; c='A'
 *     => 예외
 *        char c=65 => 가능
 *						'A'를 변환후에 저장	
 *     => byte b=(byte)350;	94가 나옴
 *        350 이진법 101011110 바이트로 바꾸면 01011110로 인식해서 94가 나옴
 *     => int a=10
 *        int b=3
 *        double d=a/b => 3.0 (정수/정수=정수)
 *        double d=a/(double)b => 3.33333 (정수/실수=실수)
 *                    	     
 *  = 강제형변환
 *    = UpCasting
 *    = DownCasting
 *  1. 데이터형의 크기
 *        ========> Upcasting
 *  	byte < short,char < int < long < float < double
 *        <=======  Downcasting
 *  2. 연산자 : 같은 데이터형만 연산이 가능
 *   		   double+int (X)
 *             int+int (O)
 *             double+double (O)
 *             
 *  1. 변수의 데이터형
 *      = 정수 => int
 *      = 실수 => double
 *      = 문자열 => String
 *      = 논리형 => boolean
 *  2. 형변환
 *      int => double : 평균, 나누기 할때 많이 쓰임
 *      double => int : 저장용도
 *      char => int : 
 *      int => char
 *      long => int : 파일 크기(long) => int
 *  3. 변수 선언
 *     데이터형 변수명
 *     *** 지역변수 => 반드시 초기값을 설정
 *           | 메소드안에서 선언 => 스택 => 메소드 종료시에 자동으로 삭제
 *     => 초기값
 *        명시적 => 직접 값 대입
 *        입력값 => Scanner/BufferedReader
 *                 scanf() / input()
 *        난수값 => 임의값 추출
 *      => 같은 데이터형
 *          int a,b,c,d,e;
 *          a=0;
 *          b=0;
 *          ... 
 *          a=b=c=d=e=0;
 *          int a=0,b=0,c=0,d=0,e=0;
 *  
 */ 
public class 데이터형변환_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*byte b=(byte)350;
		System.out.println(b);//350-256=94
		System.out.println(Integer.toBinaryString(350));*/
		int a=10;
		int b=3;
		double d=a/(double)b;
		System.out.println(d);
	}

}
