package quiz;

import java.util.Scanner;

public class Quiz_Leap_이동훈 {
    
    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        Leap(year);
        
        sc.close();
    }

    private static void Leap (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "년은 윤년");
		} else {
			System.out.println(year + "년은 평년");
        }
    }
}