package ex04.For;

import java.util.Scanner;

public class MainFor {
    public static void main(String[] args) {

        System.out.println("구구단 출력\n------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int i=1;i<=9;i++) {
            for(int j=1;j<=9;j++) {
                System.out.print(i+"*"+j+"= "+i*j+"\t\t");
            }
            System.out.print("\n");
        }
    }
}
