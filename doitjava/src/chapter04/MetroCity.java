package chapter04;
/*
 ��Ʈ���������� ����
 �����̰�, �α��� 100���̻� ���ڰ� 50���̻�, 1, 2 �� �ϳ��� �����ϸ� ��Ʈ��������
 */
public class MetroCity {

	public static void main(String[] args) {
		boolean isCapital = false;
		int citizens = 0;
		int riches = 0;
		boolean isMetro = false;
		
		System.out.println("���絵�ô� ��Ʈ���������Դϱ�?");
		isCapital = false;
		citizens= 80; // �������� ���
		riches = 30;
//		if(isCapital) {
//			if(citizens >=100) {
//				isMetro= true;
//			} else if(riches >=50) {
//				isMetro = true;
//			}
//		} else {
//			if(riches>50) {
//				isMetro = true;
//			}
//		}
//		
//		if(isCapital&&citizens >=100) {
//				isMetro= true;
//			} else if(riches >=50) {
//				isMetro = true;
//		} else {
//				isMetro = false;
//			}
//		
		isMetro = ( isCapital&& citizens >=100 ) || (riches >= 50) ? true : false;
		System.out.println("��������: " + isCapital);
		System.out.println("�α���: " + citizens);
		System.out.println("���ڼ�: " + riches);
		System.out.println(isMetro?"��Ʋ�������Դϴ�" : "���÷��������� �ƴմϴ�.");
	}

}
