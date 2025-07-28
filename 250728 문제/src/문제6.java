public class 문제6{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int change=(int)(Math.random()*2); //0.0~0.99 => 0.0~1.99 => 정수변경
		char c=' ';
		if(change==0)
			c=(char)(Math.random()*26+65); //0~25 사이의 난수를 문자로 변경 => 대문자
		else
			c=(char)(Math.random()*26+97); //소문자
		
		System.out.println("==== 결과 ====");
		
		if(c>'A'&&c<='Z')
			System.out.println(c+"은(는) 대문자입니다");
		else
			System.out.println(c+"은(는) 소문자입니다");

	}

}
