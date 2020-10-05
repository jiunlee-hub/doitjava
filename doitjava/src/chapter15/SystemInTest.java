package chapter15;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) throws IOException {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요.");
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("알파벳 단어를 쓰고 [Enter]를 누르세요.");
		int j;
		try {
			while((j = System.in.read()) != -1) {
				System.out.print((char)j);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
