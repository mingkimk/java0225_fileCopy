package ex;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


public class Test4 {
	// 물리적인 연결과 논리적인 연결   독점 회선 단점: 돈이 많이듬
	

	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String targetURL="http://www.human.or.kr";
		URL url=new URL(targetURL);
		
		
		InputStream in = url.openStream();
		InputStreamReader ins= new InputStreamReader(in); 
		BufferedReader bi = new BufferedReader(ins);
		
		String str="";
		while((str=bi.readLine()) !=null) {
			System.out.println(">"+str);
			
		}
		

	}

}
