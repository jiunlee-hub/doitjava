package example;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ������ �Է��� �ּ���:");
		int num1 = sc.nextInt();
		System.out.println("�� ��° ������ �Է��� �ּ���:");
		int num2 = sc.nextInt();
		
		if(num1==num2) {
			System.out.println("same");
		}
		else{
			System.out.println("different");
		System.out.println(num1==num2 ? "same2" : "different2");
		}
		sc.close();
	}

}
