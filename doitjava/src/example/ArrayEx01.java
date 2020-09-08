package example;

public class ArrayEx01 {

	public static void main(String[] args) {
		char[] arr1 = new char[26];
		char ch = 'a';
		for(int i = 0; i< arr1.length; i++, ch++) {
			arr1[i] = ch;
			System.out.println(arr1[i]);
		}	
	}
}
