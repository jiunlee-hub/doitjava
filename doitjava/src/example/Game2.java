package example;

import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day;
		System.out.println("�� ������ ������ ���ڸ� �˰� ��������?");
		int thisMon = sc.nextInt();
		
		switch (thisMon) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			System.out.println(thisMon + "���� 31�ϱ��� �Դϴ�.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			System.out.println(thisMon + "���� 30�ϱ��� �Դϴ�.");
			break;
		default:
			day = 28;
			System.out.println(thisMon + "���� 28�ϱ��� �Դϴ�.");
			sc.close();
		}
	}

}
