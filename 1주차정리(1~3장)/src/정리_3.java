// "변수/연산자/제어문"은 계속 나옴
// 묶기

/*
 * 변수 => 데이터를 저장 => 연산처리
 * ---                  ------ 응용:제어문
 * 변수+연산자+제어문=> 메소드
 * 메소드 여러개 묶음 => 클래스
 * 클래스 여러개 묶음 => 패키지 => .jar
 * 
 * 연산자 
 * 	= 단항연산자
 * 	  증감연산자(++,--)-1증가,1감소
 * 		전치연산자 : ++a
 * 		후치연산자 : a++
 * 		int a=10;
 * 		int b=++a; => 대입을 먼저 수행하고 나중에 a값을 증가
 * 		출력시에도 적용
 * 		int a=10;
 * 		System.out.println(a++); 출력 후 증가
 * 		System.out.println(++a); 증가 후 출력
 * 	  부정연산자(!) : 부정
 * 					boolean에서 사용이 가능
 * 					=> 조건문 1) 삼항연산자
 * 							 2) if
 *    형변환연산자(데이터형식)
 *  = 이항연산자
 *    산술연산자(+,-,*,/,%)
 *    => 자동형변환
 *    	=> 큰데이터형으로 변경 후 연산
 *         --------------------- # 연산은 같은 데이터형끼리만 연산
 *         double + int => int를 double로 변경 후 연산
 *         char + int => char가 int로 바뀐 후 연산 => 'A'+1 => 65+1 => 66
 *      => int 이하(char,byte)는 연산시에 결과값이 int(int보다 큰 데이터형으로 받을 수 있다)
 *      
 *     연산자 종류
 *     + : 덧셈, 문자열 결합. 연산방향은 왼쪽에서 오른쪽
 *     - : 뺄셈
 *     ----------------------- +,-보다 *, /, %가 우선순위
 *     * : 곱셈
 *     / : 0으로 나누면 오류발생 => Infinity
 *     	   정수/정수=>정수, 정수/실수=실수
 *     % : 나머지는 반드시 왼쪽 부호 따라감
 *     	   배수/숫자 자르는 경우=> 화폐 매수 구하기, 윤년구하기
 *    비교연산자(==,!=,>,<,>=,<=)
 *     => 실수, 정수, 문자(숫자취급)만 비교 가능
 *     => 예외: boolean(==, !=)
 *     => 조건문/반복문에서 주로 사용
 *     => 결과값은 boolean(true/false)
 *     => 문자열비교는 equals를 써야함
 *    논리연산자(&&,||)
 *      (조건) && (조건)
 *       true     true  => true
 *       true     false => false
 *       false    수행X  => false => 효율적인 연산(왼쪽 조건이 false면 오른쪽에 있는 조건은 수행하지 X)
 *     => 사용 : 범위, 기간 포함 여부 확인(페이징, 점수...)(오라클: Between ~ AND)
 *     	(조건) || (조건) => 조건 : true/false(부정,논리,비교)
 *       true     수행X  => true
 *       true     수행X  => true  => 왼쪽 조건값이 true면 오른쪽은 수행하지 않는다
 *       false    true  => true
 *       false    false => false 
 *     => 사용 : 범위, 기간 외, 잘못입력인 경우 오류처리
 *    알파벳 => 소문자
 *    c>='a' && c<'z'
 *    c>='A' && c<='Z'
 *    범위외
 *    a<0 || a>100
 *    세자리 정수 입력
 *    a>=100 && a<1000 
 *    대입연산자(=,+=,-=)
 *    	= 대입 +=, == : 복합 대입 연산자
 *    	  a+=1 ==> a=a+1
 *    	  a+=2 ==> a=a+2
 *    -------------------------------- 여러개 증가/감소 가능
 *  = 삼항연산자((조건)?값1:값2)
 *  			조건이 true면 값1, false면 값2
 *    => 소스가 간결 : 게임/웹에서 많이 씀
 *       일반 Application => if ~ else 
 *       예)
 *       <>
 *       <a href="list.jsp?page=<%=curpage>1?curpage-1;curpage>
 * */


public class 정리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x=10;
//		int y=10;
//		int z;
//		
//		x++;
//		++x;
//		System.out.println("x="+x);
//		
//		y--;
//		--y;
//		System.out.println("y="+y);
//		
//		z=x++;
//		System.out.println("z="+z);
//		z=++x;
//		System.out.println("x="+x);
//		
//		z= ++x + y++;
//		System.out.println("z="+z);
//		System.out.println("x="+x);
//		System.out.println("y="+y);
		
		/*
		 * boolean bCheck=false; System.out.println(bCheck);
		 * System.out.println(!bCheck);
		 * 
		 * System.out.println(65.0); System.out.println((int)65.0);
		 * System.out.println((char)65.0); System.out.println((double)'A');
		 * System.out.println((double)65);
		 */
		
		// byte < char < int < long < double (숫자 관련, boolean만 가능)
		// 큰데이터 = 작은 데이터형 => 자동으로 변경
		// 작은 데이터형 = 큰 데이터형
		//				--------- 작은 데이터형으로 변경
		// int i=10.5(오류발생)
		// int i=(int)10.5 => i=10
		// 예외) char c=65; => 선언과 동시에 초기값으로만 가능
		//      int i=65;
		//      char c=i; => 오류발생
		
		char c1='A';
		char c2='B';
		//char c3=c1+c2; 오류 => char 대신 int/long/float/double을 써야함
		
		byte b1=10;
		byte b2=20;
		//byte b3=b1+b2; 오류 => char 대신 int/long/float/double을 써야함 
	}
	
	

}
