package example;

import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day;
		System.out.println("몇 월달의 마지막 일자를 알고 싶은가요?");
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
			System.out.println(thisMon + "월은 31일까지 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			System.out.println(thisMon + "월은 30일까지 입니다.");
			break;
		default:
			day = 28;
			System.out.println(thisMon + "월은 28일까지 입니다.");
			sc.close();
		}
	}

}
