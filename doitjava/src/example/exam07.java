package example;

public class exam07 {

	public static void main(String[] args) {
		int cnt=0;
		for(int i =1; i<=50; i++) {
			if(i%3==0) {
			cnt++;		
			}	
		}
		System.out.println("1부터 50까지 3의 배수의 개수는" +cnt+ "입니다.");
	}
}
