/*
 * 	2차 for
 *  ------
 * 
 *  형식) for() => 줄수(rows)
 *  	 {
 *  		for() => 화면 출력(cols)
 *  			{
 *  				실행문장
 *  			}
 * 		 }
 * 
 *    *
 *    **
 *    ***
 *    ****
 *    ***
 *    **
 *    *
 * 
 *       *
 *      ***
 *     *****
 *    *******
 *     ***** 
 *      ***
 *       *    
 *       
 *     *****
 *      ***
 *       *
 *      ***
 *     ***** 
 *     
 *     *   *   
 *     ** **
 *     *****
 *     ** **
 *     *   *
 * 
 * */
public class 제어문_4 {
	
	public static void main(String[] args) {

	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	for(int i=4;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		
		
		System.out.println();
	}
	
	}
}