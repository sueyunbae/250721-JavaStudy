package com.sist.io;
import java.io.*;
import java.net.*;

import javax.net.ssl.HttpsURLConnection;
// https://www.10000recipe.com/index.html
public class 입출력_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			URL url=new URL("https://www.10000recipe.com/recipe/list.html");
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			if(conn!=null)
			{
				BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream()));
				while(true)
				{
					String s=in.readLine();
					System.out.print(s);
				}
				
			}
		}catch(Exception ex) {}
	}

}
