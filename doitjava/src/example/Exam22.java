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
            System.out.println("1�� 100������ ���� �Է��ϼ��� : "); 
            input = sc.nextInt(); 
             
            if(input==com){ 
                System.out.println("�����Դϴ�."); 
                System.out.printf("�õ�Ƚ���� %d���Դϴ�.\n", count); 
            }else if(input > com){ 
                System.out.println("�� ���� ���� �Է��ϼ���.");
            }else if(input < com){ 
                System.out.println("�� ū ���� �Է��ϼ���."); 
            } 
        }    
    } 
}
