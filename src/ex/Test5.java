package ex;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test5 {

	private ArrayList<String> list = new ArrayList<>();

	public static void main(String[] args) throws Exception {
		String fileName = null;
		String targetURL = "http://www.human.or.kr";
		URL url = new URL(targetURL);

		InputStream in = url.openStream();
		InputStreamReader ins = new InputStreamReader(in);
		BufferedReader bi = new BufferedReader(ins);

		String str = "";
		int cnt = 1;

		while ((str = bi.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str, "\"");
			while (st.hasMoreTokens()) {
				String token = "";
				token = st.nextToken();
				if ((token.contains("http") && token.contains("png"))) {
					String result = token.substring(token.indexOf("http"), token.indexOf("png") + 3);
					System.out.println(cnt + result);
				}
				if ((token.contains("http") && token.contains("jpg"))) {
					String result1 = token.substring(token.indexOf("http"), token.indexOf("jpg") + 3);

					System.out.println(cnt + result1);

					cnt++;
					
					
					// 여기서 부터는 jpg 저장 하는 소스 짜야하는데 아직 못한 부분
					FileOutputStream fos = new FileOutputStream("cnt.jpg");

					byte[] indata = new byte[1024];
					int n = 0;

					while ((n = bi.read(indata)) != -1) {

						fos.write(n);
						fos.flush();

					}

					System.out.println("byte 전송 완료");
				}

			}
		}
	}

	//private static void save() {
		

		
	}

