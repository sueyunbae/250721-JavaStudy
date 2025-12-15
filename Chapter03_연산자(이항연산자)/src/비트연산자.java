/*
 * 	& | ^ => 회로
 * 
 *      &(*)    |(+)    ^
 *  00   0       0      0
 *  01   0       1      1
 *  10   0       1      1
 *  11   1       1      0
 *  
 *   27과 13
 *    11011
 *    01101
 *   & 연산 : 01001 => 9
 *   | 연산 : 11111 => 31
 *   ^ 연산 " 10110 => 22
 *   
 *   35와 17 
 *    100011
 *    010001
 *   & 연산 : 000001 => 1
 *   | 연산 : 110011 => 51
 *   ^ 연산 " 110010 => 50
 *   
 *   비트이동 연산자 / 비트연산자 => 산술연산자
 *   x>>y ==> x/2^y 
 *   x<<y ==> x*2^y 
 *  
 * */
public class 비트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(35));
		System.out.println(Integer.toBinaryString(17));
		System.out.println(35&17);
		System.out.println(35|17);
		System.out.println(35^17);

	}

}
