package ex;

import java.io.BufferedInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Test3 {
	

	public static void main(String[] args) throws IOException {

		String str = "http://imgnews.naver.net/image/477/2019/11/12/0000217942_001_20191112144417362.jpg";
		URL url = new URL(str);
		

		InputStream in = url.openStream();
		
		BufferedInputStream bi = new BufferedInputStream(in);
		//BufferedInputStream�� �־��� InputStream�ν��Ͻ��� �Է¼ҽ��� �ϸ� ������ ũ���� ���۸� ���� BufferedInputStream�ν��Ͻ��� ����
		FileOutputStream fos = new FileOutputStream("test.jpg");

		byte[] indata = new byte[1024];
		int n = 0;
		int sum = 0;
		//int size = indata.length;
		while ((n = bi.read(indata)) != -1) {
		
		//	System.out.println(size);
			fos.write(indata, 0, n);
			fos.flush(); //flush, ������ ��� ������ ��¼ҽ��� ����� ����, ���۸� ����
			sum = sum + n;
		}

		System.out.println(sum + "byte ���� �Ϸ�");
	}
	
	
}
