package chapter14;

public class ArrayException {

	public static void main(String[] args) {
		try {
		int[] arr = new int[3];
		arr[2] = 100;
		System.out.println("���� �����߽��ϴ�.");
		} catch (Exception e) {
			System.out.println("��� ���꿡 ������ �߻��߽��ϴ�.");
			System.out.println(e.getMessage());
			System.out.println("�迭�� ������ ������ϴ�.");
			e.printStackTrace();
		} finally {
			System.out.println("������ �����ϴ� �����Դϴ�.");
		}
	}

}
