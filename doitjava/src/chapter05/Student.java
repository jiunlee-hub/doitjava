package chapter05;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;
	
////	������ - ��ü�� ������ �� �����ϴ� ���
	Student(int num) { // �Ű������� ���� ������
		System.out.println("Student ��ü�� �����մϴ�" + num);
	} // ����Ʈ �����ڴ� �Ű������� ���� �����ڵ尡 ���� ������
	Student() { // �Ű������� ���� ������
		System.out.println("����Ʈ �����ڸ� �����մϴ�");
	} 
//	Student (){} // ����Ʈ ������: �����ڸ� ������� ������ �ڵ������� ����
	Student(long num) { // �Ű������� ���� ������
		System.out.println("Student ��ü�� �����մϴ�" + num);
	}
	Student(int num1, long num2) { 
		System.out.println("Student ��ü�� �����մϴ�");
	}
	Student(int num3, int num4) {
		System.out.println("Student ��ü�� �����մϴ�");
	} 
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
}
