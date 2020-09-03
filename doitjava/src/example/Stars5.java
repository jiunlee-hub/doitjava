package example;

public class Stars5 {

	public static void main(String[] args) {
		for(int i = 4; i >= 0; i--) {
			for(int j = 0; j<= i; j++) {
				if(i==j) {
					System.out.println(i+1);
				} else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
