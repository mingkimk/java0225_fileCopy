package ex;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


public class Test4 {
	// �������� ����� ������ ����   ���� ȸ�� ����: ���� ���̵�
	

	

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
