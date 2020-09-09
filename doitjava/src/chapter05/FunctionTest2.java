package chapter05;

import java.util.Scanner;

public class FunctionTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student kim = new Student();
		Student seo = new Student();
		Student jo = new Student();
		
		System.out.println(kim == seo);
		kim.showStudentInfo(); // 객체는 초기값이 null이고, int는 0이고, boolean은 false이다.
//		객체의 멤버는 도트연산자(.)을 이용하여 접근할 수 있음.
		kim.studentID = 2020010001;
		kim.studentName = "김유신";
		kim.grade = 3;
		kim.address = "경주";
		kim.showStudentInfo();
		
		seo.studentID = 2020010002;
		seo.studentName = "서유진";
		seo.grade = 1;
		seo.address = "서울";
		seo.showStudentInfo();
		
		jo.studentID = 2020010003;
		
		
	}

}
