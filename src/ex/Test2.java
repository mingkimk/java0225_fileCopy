package ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Test2 {
	public static void main(String[] args) throws IOException {
		System.out.println(" �ҷ��� ���� ���� �Է� �ϼ���");
		Scanner in = new Scanner(System.in);
		String fname = in.nextLine();
		System.out.println(" �ҷ��� ���� ���� �Է� �ϼ���");
		String sname = in.nextLine();

		FileInputStream fin = new FileInputStream(fname);
		FileOutputStream fos = new FileOutputStream(sname);

		byte[] indata = new byte[1024];
		int n=0;
		int sum=0;
		int size=indata.length; //1024
		while((n=fin.read(indata))!=-1) {
		// indata ��� �׸��� �о� �Ͷ�  n�� ����  ���� ����Ʈ�� �� n�� ���� ���� ����Ʈ �� ��ŭ ������
		if(n!=indata.length) {
			size=n;
		}
		
		//System.out.println(n);
		System.out.println(size);
		fos.write(indata,0,size);
		fos.flush();
		sum=sum+n;
	
	}

		System.out.println(sum+"byte ���� �Ϸ�");	
	
	
	
	}
}
