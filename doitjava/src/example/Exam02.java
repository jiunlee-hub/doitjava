package example;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		int iNum;
		Scanner sc = new Scanner (System.in);
		System.out.println("���ڸ� �Է��� �ּ���:");
		System.out.print(">");
		iNum = sc.nextInt();
		System.out.println("Ȧ���ΰ���? ¦���ΰ���?");
		if(iNum%2==0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�");
			sc.close();
		}
	}

}
