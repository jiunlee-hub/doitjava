package chapter04;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		int iNum;
		Scanner sc = new Scanner(System.in); //��ĳ�� �����ڵ�- ���氡���� ���� ������ ��
		
//		System.out.println("������ �Է��� �ּ���:");
//		System.out.print(">");
//		iNum = sc.nextInt(); //
//		System.out.println("�Է��� ����: " +iNum);
//		System.out.println();
//		System.out.print("�Ǽ��� �Է��� �ּ���:");
//		double dNum = sc.nextDouble();
//		System.out.println("�Է��� �Ǽ�: " +dNum);
//		System.out.println("�Է��� ����: " +iNum);
//		System.out.println();
//		System.out.print("�Ǽ��� �Է��� �ּ���:");
//		float fNum = sc.nextFloat();
//		System.out.println("�Է��� �Ǽ�: " +dNum);
//		System.out.print("���ڿ��� �Է��� �ּ���:");
//		String str = sc.next(); // ���ڿ� �Է¿��� next�� ��������� ������ ���� �� ����.
//		// ��ĳ�ʿ��� ������ ���� �� �Է��� �ǹ��մϴ�.
//		System.out.println("�Է��� ���ڿ�: " + str);
//		str = sc.next();
//		System.out.println("�Է��� ���ڿ�: " + str);
//		str = sc.next();
//		System.out.println("�Է��� ���ڿ�: " + str);
		String str = sc.nextLine();
		System.out.println("�Է��� ���ڿ�: " + str);
		sc.close(); // ��ĳ�ʸ� �� �̻� ������� �ʴ´ٸ� �ݾ���� �մϴ�.
	}
	

}
