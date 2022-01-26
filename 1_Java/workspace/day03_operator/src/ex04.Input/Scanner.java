package ex04.Input;

import java.util.Scanner;

public class Scanner {
    public static void main(String[] args) {
        System.out.println("next() vs nextLine() ");
        System.out.println("string input: ");
        Scanner sc = new Scanner(System.in);
//      String s1 = sc.next(); // 공백 인식 못함
        String s1 = sc.nextLine();
    }    
}
