/*
 * 1. 실행
 *                프로젝트(.class) => jar => 라이브러리 파일
 *                JSP : war / ThtmeLeaf : jar
 *   A.java ===== A.class ====== 실행
 *            |              |
 *           javac         java => JVM <=> 운영체제
 *           컴파일 (0,1)     인터프리터(번역된 문서를 한줄씩 읽어서 출력)
 *           컴퓨터 인식
 * 2. 들여쓰기
 *    자바
 *    class A{
 *    }
 *    C/C++
 *    class A
 *    {
 *    }
 * 3. 가독성(수정,추가=>주석) / 최적화(속도, StringBuffer)
 *                 ---
 *                 한줄주석 // => ctrl+/ => 한번 더 하면 해제
 *                 여러줄 주석 => ctrl+shift+/ => ctrl+shift+\ 해제
 *      => sysout + ctrl + space
 *      => main + ctrl + space
 *      => dos/linux(tab)
 * 4. 변수
 * 	   : 데이터 한개만 저장되는 메모리 주소의 이름
 * 		1) 변수 추출 => 웹사이트에서
 * 		2) 어떤 데이터형 => 문자열 / 실수 / 정수 ...
 *         기본형 : 자바에서 제공
 *           정수
 *           	byte(1byte) => -128~127
 *                             2진법 0,1 8개만 사용(8bit) => **8bit=1byte
 *           	int(4byte) => -21억4천~21억4천(32bit)
 *                         => default : 컴퓨터는 모든 정수를 int로 인식
 *           	long(8byte) => 64bit
 *              ------------------------ 구분(int/long) => 1L
 *              => 오버플로우(Max이상이면 Min값을 변경) / 인더플로우(Min이하 => Max값을 변경)
 *                 int
 *           실수(평균/별점/표준편차/확률/통계/예측)
 *           	double : 8byte => 정밀도 소수점 15자리 => 컴퓨터에서 default
 *           	float f=10.5 => 오류 (10.5를 double-기본값으로 인식하기 때문에 오른쪽 데이터형이 더 커서 오류)
 *            	float f=10.5f => 오류X
 *           문자 : 문자 한개 저장
 *           	char => 2byte(0~65535) => unicode => UTF-8
 *           	=> '' => null 이므로 오류
 *              => ' ' => 오류X           
 *           논리 : true / false만 저장
 *           	   boolean => 조건문/반복문
 *           	   1byte메모리 할당
 *         참조형 : 사용자 정의
 *         		  문자열 저장
 *         	      String => 일반 문자열 데이터 ""
 *          				필요시에는 클래스형으로 사용이 가능
 *          				=> 문자열과 관련된 기능(메소드)
 *          					문자열비교는 ==,!=를 사용하지 않는다 => equals를 사용한다
 *                 배열 : 같은 크기 데이터형을 여러개 모아서 관리
 *                       참조형 데이터형 => String => 클래스
 *                 클래스 : 다른 데이터형 여러개를 모아서 관리
 * 		3) 어떤 초기값(변수는 반드시 초기값이 있어야 사용가능, 필요시에는 변경해서 사용)
 *         # 명시적 초기화
 *           int no=1
 *         # 사용자 입력값을 받아서 초기값
 *           Scanner / BufferedReader
 *           일반 => 입력창
 *         # 임의로 지정 : 난수
 *            Math.random() => 0.0~0.99 사이의 임의 숫자
 *            Random r=new Random()
 *            r.nextInt(10) => 0~9
 *    -----------------------------------------
 *    1. 변수 활용 => 연산자
 *    	  연산처리를 위해 => 데이터를 저장 => 다시 사용
 *    2. 연산자 활용 => 제어문
 *    3. 제어문 활용 => 메소드
 *    4. 메소드 활용 => 객체지향
 *    ------------------------------------------
 *    => 설계 / 기능별분리 => 조립
 *    => 라이브러리(자료구조 / IO / 네트워크 / 오라클 연동)
 *    오류 방지 => 예외처리
 *    
 *    자바에서 제공하는 연산자
 *    -------------------
 *    5 + 6 
 *    피연산자 : 5,6
 *    연산자 : +    
 *    단항연상자 : 피연산자가 1개
 *    이항연상자 : 피연산자가 2개
 *    삼항연상자 : 피연산자가 3개
 *    ---------------------
 *     웹=> 2진법으로 계산하는 내용이 없다
 *    단항연산자
 *    	***= 부정연산자 : !(반대효과)(예약일이 아닌날, 수량이 없는 상품...)
 *                     결과값 : boolean(true/false) => if/for문에 사용
 *                     예) boolean bCheck=false;
 *                     	   !bCheck => true
 *    	***= 부호연산자 : 음수/양수
 *    					예) int a=-10;
 *    						a=-a => 10
 *    	***= 증감연산자 : ++(1개증가), --(1개감소)
 *            전치연산자 / 후치연산자
 *            int a=10;
 *            int b=++a; => a=11, b=11
 *            int a=10;
 *            int b=a++; => a=11, b=10
 *            int a=10
 *            System.out.println(a++) => 10출력, a=11
 *    	= 반전연산자 : ~ (양수를 음수로, 음수를 양수로)
 *    	***= 형변환연산자
 *    	 형식 : (데이터형) => (int) (byte) (double) (char)
 *    			데이터형의 크기
 *              ========================================> UpCasting
 *    			byte < short < int < long < float < double
 *                     char
 *               <======================================== DownCasting
 *        1. 자동형변환 : 데이터형을 크게 만드는 경우
 *           1) 값 대입
 *           	int a='A' => 자동으로 int로 변경 => a=65
 *           	long a=10 => 자동으로 long으로 변경 => a=10L
 *           	double d=10 => 자동으로 double로 변경 => a=10.0 
 *           2) 연산처리 => 같은 데이터형 크기로 변경(큰 데이터형으로 변경)
 *           	10+10.5 => 10.0+10.5 => 20.5
 *           	'A'+1 => 65+1
 *        2. 강제형변환 : 데이터형을 작게 만드는 경우 => 필요시에만 사용
 *            10+(int)10.5 => 10+10 => 20 downcasting
 *            10/(double)3 => 3.3333(소수점 출력) upcasting
 * -----------------------------------------------------------------
 *   이항연산자
 *    산술연산자(+,-,*,/,%)
 *     비트이동연산자(<<,>>)쉬프트연산자
 *     비트연산자(&(and),|(or),^(xor))
 *    비교연산자(==,!==,<,>,<=,>=) => 숫자, 문자만 가능(문자열은 X), boolean은 (==,!=만 사용 가능) 
 *     => 모든 결과값은 boolean(true/false)
 *     => 조건문 / 반복문에서주로 사용
 *    논리연산자(&&,||)
 *     (조건1)&&(조건2) => 조건1,조건2 둘 다 true 이면 true(직렬연산자) => 효율적인 연산을 하고 있다
 *      예) int x=10;
 *      	int y=9;
 *      	x<y && ++y == x => x=10,y=9(좌항이 false이므로 더 수행하지 않는다)
 *     (조건1)||(조건2) => 조건1,조건2 중 하나만 true 이면 true(직렬연산자)
 *    대입연산자 : 초기값, 연산 결과값
 *     => 연산순위가 마지막
 *     => 오른쪽에서 왼쪽
 *     int a=10;
 *     a=a+1
 *     => +=, -=, *=, /=, >>=, <<=, &=, |=, ^= => 복합대입연산자
 *  -----------------------------------------------------------------
 *   연산 => 출력
 *   입력값 받기
 *   => Scanner => 키보드 입력값 받기
 *   	1. Scanner 읽기 => 메모리에 저장
 *   	   Scanner scan=new Scanner(System.in)
 *         ------- ----     ----------------
 *          데이터형  변수     메모리할당    |
 *                                    키보드 입력값
 *         = nextInt() : 정수값 읽기
 *         = next() : 문자열 읽기
 *         ---------------------- 공백 전까지
 *         = nextLine() : enter 시 전체 문장열
 *    => 입력창
 *       2. JOptionPane.showInputDialog
 *         ------------------------------
 *          | 단점 : 문자열
 *          문자열=>정수 변경 : Integer.parseInt()
 *          문자열=>실수 변경 : Double.parseDouble()
 *          => 모든 데이터형을 String으로 변경
 *                         ------- valueOf()
 *                         
 *    출력
 *    	System.out.println() : 줄바꿈
 *      System.out.print() : 줄바꿈이 안된다 => 특수문자 사용해서 할 수 있음(\t, \n)
 *      System.out.printf() : 출력 형식을 만들어서 출력
 *      	=> 정수 출력 => %d
 *      	=> 실수 출력 => %f => 가장 많이 사용(소수점을 원하는 형식으로 출력)
 *      						%.1f, %.2f, %.3f ...
 *      	=> 문자 출력 => %c
 *      	=> 문자열 출력 => %s
 *      	=> 명령프롬프트에서만 사용 => 웹X, 윈도우X
 *      System.out.showMessageDialog()
 *     ------------------------------------------------
 *     산술규칙
 *      1) 데이터형이 다른 경우
 *      	'큰데이터형'으로 변경이 된다
 *      	10 + 10.5 => 10.0 + 10.5 => double
 *          자동형변환
 *          int + char = int
 *          int + double = double
 *          char + double = double
 *          int + long = long
 *          int + long + char + double = double
 *      2) int 이하 데이터형(byte, char, short)
 *        => 연산시에 모두 int로
 *         byte + byte = int
 *         char + char = int
 *         byte + char = int
 *     산술연산자
 *     + : 덧셈, 문자열 결합
 *     		문자열이 있는 경우에는 붙인다
 *     		"7"+7 => "77"
 *     		7 + 7 = 14
 *     - : 뺄셈
 *     * : 곱셈
 *     / : 나눗셈
 *     		1) 0으로 나누면 오류 발생
 *     		2) 정수/정수=정수
 *     % : 나누고 나머지 값
 *     		1) 결과값의 부호는 '왼쪽부호'가 남는다
 *     		    5%2 = 1        
 *     			-5%2 = -1
 *     			-5%-2 = -1
 *              5%-2 = 1
 *              비교) 5/2 = 2
 *     			    -5/2 = -2
 *     			    -5/-2 = 2
 *                  5/-2 = -2
 *           2) 5%0 => NaN(Not a Number) => 연산결과가 없는 경우
 *     		
 */

/*import java.util.Random;*/
//import javax.swing.*;
public class 산술연산자_1 {

	public static void main(String[] args) {
				
//		Random r=new Random();
//		int value = r.nextInt(10); //=> 0~9
//		System.out.println(value);
		
//		int max=Integer.MAX_VALUE;
//		System.out.println(max);
//		System.out.println(max+1); //오버플로우 => int대신 long을 쓰면 오버플로우가 발생하지 않음
//		
//		long max1=Integer.MAX_VALUE;
//		System.out.println(max1);
//		System.out.println(max1+1); 
//		
//		
//		int min=Integer.MIN_VALUE;
//		System.out.println(min);
//		System.out.println(min-1);//언더플로우 => int대신 long을 쓰면 오버플로우가 발생하지 않음
//		
//		System.out.println(10000000000000000L);//long형임을 꼭 표시해야함
		
//		int a=10;
//		a++;
//		System.out.println(a++);
//		System.out.println(a);
		
		/* 창을 띄워서 
		 * // 정수 두개를 받아서 산술 연산 처리 결과 출력// String
		 * num1=JOptionPane.showInputDialog("첫번쨰 정수 입력:"); String
		 * num2=JOptionPane.showInputDialog("두번쨰 정수 입력:");
		 * 
		 * //정수로 변경 int n1=Integer.parseInt(num1); int n2=Integer.parseInt(num2);
		 * 
		 * String result=n1+"+"+n2+"="+(n1+n2)+"\n" +n1+"-"+n2+"="+(n1-n2)+"\n"
		 * +n1+"*"+n2+"="+(n1*n2)+"\n" +n1+"/"+n2+"="+(n1/n2)+"\n"
		 * +n1+"%"+n2+"="+(n1%n2)+"\n"; JOptionPane.showMessageDialog(null, result);
		 */
		
	}

}
