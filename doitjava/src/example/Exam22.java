package example;

import java.util.Scanner;

public class Exam22 {

	public static void main(String[] args) {
        int com = (int) (Math.random()*100); 
        int input = 0; 
        int count =0; 
         
        Scanner sc = new Scanner(System.in); 
        
        while(true) { 
            count++; 
            System.out.println("1과 100사이의 값을 입력하세요 : "); 
            input = sc.nextInt(); 
             
            if(input==com){ 
                System.out.println("정답입니다."); 
                System.out.printf("시도횟수는 %d번입니다.\n", count); 
            }else if(input > com){ 
                System.out.println("더 작은 수를 입력하세요.");
            }else if(input < com){ 
                System.out.println("더 큰 수를 입력하세요."); 
            } 
        }    
    } 
}
