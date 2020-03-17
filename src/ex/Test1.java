package ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws IOException {

		System.out.println(" 불러올  파일 명을 입력 하세요");
		Scanner in = new Scanner(System.in);
		String fname = in.nextLine();

		if (!fname.substring(fname.length() - 3).equals("jpg")) { // contain
			System.out.println("jpg 파일만 가능 합니다.");
			System.exit(0);
		}
		System.out.println(" 불러올 파일 명을 입력 하세요");
		String sname = in.nextLine();

		FileInputStream fin = new FileInputStream(fname);
		FileOutputStream fos = new FileOutputStream(sname);

		byte[] indata = new byte[1024];
		
		int n = 0;
		int sum=0;
		int size = indata.length;
		while ((n = fin.read(indata)) != -1) {
			if (n != indata.length) {
				size = n;
			}
			System.out.println(size);
			fos.write(indata, 0, size);
			fos.flush();
			 sum=sum+n;
		}
		System.out.println(sum + "byte 전송 완료");
	}
}
//	public static void file() {
//		String newfile = "";
//		while (true) {
//			String fname = newfile;
//			if (newfile.equals(".jpg")) {
//				System.out.println("전송");
//			} else if (!newfile.equals(".jpg")) {
//				System.out.println(" 파일 전송 불가");
//			}
//		}

//		switch(fname.charAt==('.jpg')) {
//		case'jpg':
//			System.out.println();
//		}


