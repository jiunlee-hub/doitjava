package example;

public class Continue1 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i%2 != 0) {
//				System.out.print("�������� ����: ");
				continue;
			}
			System.out.println(i);
		}
	}

}