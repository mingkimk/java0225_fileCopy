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
		//BufferedInputStream은 주어진 InputStream인스턴스를 입력소스로 하며 지정된 크기의 버퍼를 갖는 BufferedInputStream인스턴스를 생성
		FileOutputStream fos = new FileOutputStream("test.jpg");

		byte[] indata = new byte[1024];
		int n = 0;
		int sum = 0;
		//int size = indata.length;
		while ((n = bi.read(indata)) != -1) {
		
		//	System.out.println(size);
			fos.write(indata, 0, n);
			fos.flush(); //flush, 버퍼의 모든 내용을 출력소스에 출력한 다음, 버퍼를 비운다
			sum = sum + n;
		}

		System.out.println(sum + "byte 전송 완료");
	}
	
	
}
