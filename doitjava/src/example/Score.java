package example;

import java.util.Scanner;

public class Score {
	/*
	 * ���� ���� ���� ������ �Է¹޾Ƽ� ����� ����� �� a b c ��� �������� f ��� ��� ������ ����� ����ϼ���
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է����ּ���.");
		int koScore = sc.nextInt();
		System.out.println("���� ������ �Է����ּ���.");
		int engScore = sc.nextInt();
		System.out.println("���� ������ �Է����ּ���.");
		int maScore = sc.nextInt();
		int sum = koScore + engScore + maScore;
		double avg = sum / 3.0;
		if (avg > 91) {
			System.out.println(avg + "���Դϴ�.");
			System.out.println("A����Դϴ�.");
		} else if (avg > 81) {
			System.out.println(avg + "���Դϴ�.");
			System.out.println("B����Դϴ�.");
		} else if (avg > 71) {
			System.out.println(avg + "���Դϴ�.");
			System.out.println("C����Դϴ�.");
		} else {
			System.out.println(avg + "���Դϴ�.");
			System.out.println("F����Դϴ�.");
		}
		char grade;
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
		default:
			grade = 'F';
		}
		System.out.println("����� ��� ������" + avg + "���̰�" + grade + "����Դϴ�.");
		sc.close();
	}

}
