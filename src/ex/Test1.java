package ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws IOException {

		System.out.println(" �ҷ���  ���� ���� �Է� �ϼ���");
		Scanner in = new Scanner(System.in);
		String fname = in.nextLine();

		if (!fname.substring(fname.length() - 3).equals("jpg")) { // contain
			System.out.println("jpg ���ϸ� ���� �մϴ�.");
			System.exit(0);
		}
		System.out.println(" �ҷ��� ���� ���� �Է� �ϼ���");
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
		System.out.println(sum + "byte ���� �Ϸ�");
	}
}
//	public static void file() {
//		String newfile = "";
//		while (true) {
//			String fname = newfile;
//			if (newfile.equals(".jpg")) {
//				System.out.println("����");
//			} else if (!newfile.equals(".jpg")) {
//				System.out.println(" ���� ���� �Ұ�");
//			}
//		}

//		switch(fname.charAt==('.jpg')) {
//		case'jpg':
//			System.out.println();
//		}


