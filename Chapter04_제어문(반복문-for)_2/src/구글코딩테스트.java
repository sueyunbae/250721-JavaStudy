// 문자열을 입력 받아서 좌우 대칭여부 확인(예:ABBA)
// 모든 문자열은 짝수여야 함
import java.util.Scanner;
public class 구글코딩테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String msg="";
		for(;;)
		{	
			System.out.print("문자열 입력(짝수):");
			msg=scan.next();
			if(msg.length()%2==0)
			{
				break;
			}
		}
		
		boolean bCheck=true;
		
		for(int i=0;i<msg.length()/2;i++)
		{
			if(msg.charAt(i)!=msg.charAt(msg.length()-1-i))//첫글자vs끝글자, 두번째글자vs뒤에서두번째글자...
			{
				bCheck=false;
				break;
			}
		}
		if(bCheck==true)
		{
			System.out.println(msg+"는(은) 좌우대칭입니다");
		}
		else
		{
			System.out.println(msg+"는(은) 좌우대칭이 아닙니다");
		}
	}

}
