package example;

import java.util.Scanner;

public class Score {
	/*
	 * 국어 영어 수학 점수를 입력받아서 평균을 출력한 후 a b c 등급 나머지는 f 등급 평균 점수와 등급을 출력하세요
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 성적을 입력해주세요.");
		int koScore = sc.nextInt();
		System.out.println("영어 성적을 입력해주세요.");
		int engScore = sc.nextInt();
		System.out.println("영어 성적을 입력해주세요.");
		int maScore = sc.nextInt();
		int sum = koScore + engScore + maScore;
		double avg = sum / 3.0;
		if (avg > 91) {
			System.out.println(avg + "점입니다.");
			System.out.println("A등급입니다.");
		} else if (avg > 81) {
			System.out.println(avg + "점입니다.");
			System.out.println("B등급입니다.");
		} else if (avg > 71) {
			System.out.println(avg + "점입니다.");
			System.out.println("C등급입니다.");
		} else {
			System.out.println(avg + "점입니다.");
			System.out.println("F등급입니다.");
		}
		char grade;
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
		default:
			grade = 'F';
		}
		System.out.println("당신의 평균 점수는" + avg + "점이고" + grade + "등급입니다.");
		sc.close();
	}

}
