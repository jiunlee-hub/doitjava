package chapter04;

public class SwitchEx2 {

	public static void main(String[] args) {
		int now = 10;
		
		System.out.println("����ð���"+ now + "���Դϴ�.");
		System.out.println("���� ������ ������ �����ϴ�.");
		
		switch(now) {
			case 9 :
				System.out.println("9�ÿ��� ����� �մϴ�.");
			case 10:
				System.out.println("10�ÿ��� ��ħ ��ȸ�� �մϴ�.");
			case 11:
				System.out.println("11�ÿ��� ���������� �����մϴ�.");
			case 12:
				System.out.println("12�ÿ��� ������ �Խ��ϴ�.");
		}
		
		String pos = "����";
		switch(pos) {
		case "����" :
			System.out.println("������� ������ 400�����Դϴ�.");
			break;
		case "����" :
			System.out.println("������� ������ 300�����Դϴ�.");
			break;
		case "�븮" :
			System.out.println("�븮���� ������ 200�����Դϴ�.");
			break;
		default :
			System.out.println("�Ϲ� ����� ������ 150�����Դϴ�.");
		}
	}

}