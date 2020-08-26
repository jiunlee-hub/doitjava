package example;

public class PingPong {

	public static void main(String[] args) {
		for (int i=1; i<=100; i++) {
			if(i%3==0&&i%5==0) {
			System.out.println(i+"pingpong");
			} else if(i%3==0) {
				System.out.println(i+"ping");
				} else if(i%5==0) {
				System.out.println(i+"pong");
				} else {
				System.out.println(i);
			}
		}
			for(int i=1; i<=100; i++) {
				System.out.println(i + " ");
				if(i%3==0) {
					System.out.println("ping");
				}
				if(i%5==0) {
					System.out.println("pong");
				}
				System.out.println();
			}
		}
	}


