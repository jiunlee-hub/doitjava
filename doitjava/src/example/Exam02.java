package example;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		int iNum;
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자를 입력해 주세요:");
		System.out.print(">");
		iNum = sc.nextInt();
		System.out.println("홀수인가요? 짝수인가요?");
		if(iNum%2==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다");
			sc.close();
		}
	}

}
