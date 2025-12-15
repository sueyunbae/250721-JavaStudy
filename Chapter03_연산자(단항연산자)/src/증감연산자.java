/*
 * 81page
 * 증감연산자 => 제어문(반복문)
 * 					  |
 *                   게임 => 총알발사
 *                   비행기 => 자동이동
 *                   
 *   ++(1증가), --(1감소)
 *   1) 전치연산자 
 *      ++a : 먼저 증가하고 다른 연산 수행
 *   2) 후치연산자
 *      a++ : 다른 연산 수행 후에 나중에 증가
 *      
 *   예) 
 *      int a=10;
 *      int b=++a;
 *      a=11, b=11
 *      
 *      int a=10;
 *      int b=a++;
 *      a=11, b=10
 *      
 *      int a=10;
 *      int b=++a + ++a;
 *      a=12, b=11+12=23
 *      
 *      int a=10;
 *      int b=a++ + a++;
 *      a=12, b=10+11=21
 *      
 *      int a=10;
 *      int b=++a + a++;
 *      a=12, b=11+11=22
 *      
 *      int a=10;
 *      int b=++a + a++ + ++a + a++;
 *      a=14, b=11+11+13+13=48
 *      
 *      int a=10;
 *      int b=a++ + a++ + ++a + a++
 *      a=14, b=10+11+13+13=47
 *      
 *      int a=10;
 *      int b=a++ + --a + a-- + a++
 *      a=10, b=10+10+10+9=39
 *      int a=10;
 *      int b=a-- + a-- + --a + --a;
 *      a=6,b=10+9+7+6=32
 * */
public class 증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=++a;
		System.out.println("a="+a+",b="+b);
		
		a=10;
		b=a++;
		// b=a => b=10
		// a=a+1 => a=10+1=11
		// 후치연산 => 대입을 먼저 하고 나중에 증가
		
		a=10;
		b=++a + ++a; // 11+12 => 23
	    System.out.println("a="+a+",b="+b);

	    a=10;
	    b=--a;	    
	    System.out.println("a="+a+",b="+b);
	    
	    /*
	     * double d=123456.78;
	     * int i=123456
	     * int a=(int)((d-i)*100); => 77 => double과 int로 데이터형이 달라서 77.999..를 int형으로 바꾸기 때문에
	     * */
	    
	    /*
	     * ++, -- => 무조건 1개 증가/감소
	     * int a=10
	     * 
	     * */
	    
	    char c='A';
	    char c1=c++;
	    System.out.println(c);
	    System.out.println(c1); //char는 연산이 수행되는 자동으로 int로 변경
	}

}
