package ex01.If;

import java.util.Scanner;

public class MainEntry {
    public static void main(String[] args) {

        System.out.println("integer data input : ");
        int su = new Scanner(System.in);

        // 짝, 홀수 판정 if
        if(su%2==0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        System.out.println("================");

        if(su>0) {
            System.out.println("양수");
        } else if(su==0) {
            System.out.println("0");
        } else {
            System.out.println("음수");
        }        
    }
}
