package chapter05;

public class CalcOverEx {

	public static void main(String[] args) {
		CalcOver myCalcu = new CalcOver();
		
		double result1 = myCalcu.areaRectangle(10);
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형의 넓이:" + result1);
		System.out.println("직사각형의 넓이:" + result2);
	}

}
