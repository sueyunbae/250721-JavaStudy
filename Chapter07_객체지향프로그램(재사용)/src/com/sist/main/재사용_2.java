package com.sist.main;
/*
 * 	class A
 * 	{
 * 		int a;
 * 		int b;
 * 		public void aaa(){}
 * 	}
 * 	class B extends A
 * 	{
 * 		int c;
 * 		public void bbb(){}
 * 
// * 		int a;
// * 		int b;
// * 		public void aaa(){} 안보이지만 메모리안에 얘네도 가지고 있음
 * 
 * 	}
 * 
 * 	B bb=new B();
 *     스택
 * 	---bb-----
 * 	 저장된 주소
 * 	----------   -----------------------
 * 					----- super -----
 * 					   -----a-----
 * 
 *          		   -----b-----
 *                         
 *                     ------------
 *                         aaa()
 *                     -----------
 *                  ------------------
 *                  
 *                   ----- this -------
 *                     ----- c ------
 *                    
 *                     --------------
 *                         bbb()
 *                     -------------- 	
 * 				 -----------------------
 * 
 * */
public class 재사용_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
