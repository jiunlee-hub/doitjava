package example;

import java.util.Scanner;

public class Exam21 {

	public static void main(String[] args) {
		final int GA=0;
		final int BA=1;
		final int BO=2;
		int user, com;
		int score= 0;
		int life = 3;
		Scanner sc = new Scanner(System.in);
		sc.close();
		while(true) {
		com=(int)(Math.random()*3);
		System.out.println("가위바위보 게임입니다.");
		System.out.println("0:가위, 1:바위, 2:보");
		System.out.println(">");
		user=sc.nextInt();
		System.out.println("컴퓨터:" + (com==0 ? "가위":(com==1 ? "바위" : "보")));
		System.out.println("유저:" + (user==0 ? "가위":(user==1 ? "바위" : "보")));
		if((com==GA&&user==BA)||(com==BA&&user==BO)||(com==BO&&user==GA)) {
		System.out.println("유저 승");
		score += 100;
	} else if(com==user) {
		System.out.println("무승부");
		score += 10;
	} else {
		System.out.println("컴퓨터 승");
		life--;
			}
		//현재 점수와 남은 목숨 출력
		System.out.println("현재점수: " + score);
		System.out.println("남은 라이프 :" + life);
		//목숨이 0이 되면 게임을 종료
		if(life==0) {
			System.out.println("라이프가 0이라서 게임을 종료합니다.");
			sc.close();
			break;
		}
		}
	}
	
}
