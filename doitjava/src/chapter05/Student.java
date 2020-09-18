package chapter05;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;
	
////	생성자 - 객체를 생성할 때 실행하는 블록
	Student(int num) { // 매개변수가 없는 생성자
		System.out.println("Student 객체를 생성합니다" + num);
	} // 디폴트 생성자는 매개변수가 없고 실행코드가 없는 생성자
	Student() { // 매개변수가 없는 생성자
		System.out.println("디폴트 생성자를 생성합니다");
	} 
//	Student (){} // 디폴트 생성자: 생성자를 명시하지 않으면 자동적으로 생성
	Student(long num) { // 매개변수가 없는 생성자
		System.out.println("Student 객체를 생성합니다" + num);
	}
	Student(int num1, long num2) { 
		System.out.println("Student 객체를 생성합니다");
	}
	Student(int num3, int num4) {
		System.out.println("Student 객체를 생성합니다");
	} 
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
}
