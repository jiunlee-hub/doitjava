package chapter13;

class OutClass {
	private int num = 10;
	private static int sNum = 20;
	
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
	
	void inTest() {
		System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���)");
		System.out.println("OutClass inNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
		System.out.println("OutClass num = " + sNum + "(�ܺ� Ŭ������ ���� ����)");
	}
	static void sTest() {
		System.out.println("OutClass inNum = " + sInNum + "(�ܺ� Ŭ������ ���� ���� ���)");
		System.out.println("OutClass inNum = " + sNum + "(���� Ŭ������ �ν��Ͻ� ���� ���)");
	}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ������ ���� �޼��� ȣ��");
		OutClass.InStaticClass.sTest();
		
		
	}

}
