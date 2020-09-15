package chapter08;

public class CarExtendsEx {

	public static void main(String[] args) {
		CarExtends car = new CarExtends();
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1:
				System.out.println("¾Õ¿ÞÂÊ HanKookTire·Î ±³Ã¼");
				car.frontLeftTire = new HankookTire("¾Õ¿ÞÂÊ", 15);
				break;
			case 2:
				System.out.println("¾Õ¿À¸¥ÂÊ KumhoTire·Î ±³Ã¼");
				car.frontRightTire = new KumhoTire("¾Õ¿À¸¥ÂÊ", 13);
				break;
			case 3:
				System.out.println("µÞ¿ÞÂÊ HankookTire·Î ±³Ã¼");
				car.frontRightTire = new HankookTire("µÞ¿ÞÂÊ", 14);
				break;
			case 4:
				System.out.println("µÞ¿À¸¥ÂÊ KumhoTire·Î ±³Ã¼");
				car.frontRightTire = new KumhoTire("µÞ¿À¸¥ÂÊ", 17);
				break;
			}
			System.out.println("=========================");

		}

	}

}
