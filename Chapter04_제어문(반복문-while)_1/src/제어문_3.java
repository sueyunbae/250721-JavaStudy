//while 사용해서 파일 읽어오기 
import java.io.*;
public class 제어문_3 {

	public static void main(String[] args)
	throws Exception
	{
		// TODO Auto-generated method stub
		FileReader fr=
				new FileReader("C:\\jdk-17.0.2\\javaDev\\JavaStudy\\Chapter04_제어문(반복문-for)_3\\src\\제어문_정리.java");
								//파일경로확인:클래스에 우클릭->properties->location
		int i=0;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
	}

}
