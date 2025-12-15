//비트 이동 연산자
// << 왼쪽, >> 오른쪽 이동
/*
 * 		4<<2 == 16 ==> 0을 두개 붙인다
 * 		X<<y == x*2^y 
 * 		4>>2 == 1 ==> 0을 두개 제거한다
 *  	x>>y == x/2^y => 4/4 = 1
 *      *System.out.println(Integer.toBinaryString(27));*27을 2진법으로 바꾸는 명령어
 *      
 *      6 => 2진법 110
 *      6<<3 => 2진법 11000 => 10진법 48
 *      		6*2^3 = 48
 *      6>>2 => 2진법 1 => 10진법 1
 *              6/2^2 = 1
 *      
 * */
public class 비트이동연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(27));//11011
		System.out.println(27<<2);//108
		System.out.println(27>>2);//6

	}

}
