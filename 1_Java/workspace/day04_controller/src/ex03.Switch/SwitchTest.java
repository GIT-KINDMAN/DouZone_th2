package ex03.Switch;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("31일");
            case 2:
                System.out.println("28일");
            case 3:
                System.out.println("31일");
            case 4:
                System.out.println("30일");
            case 5:
                System.out.println("31일");
            case 6:
                System.out.println("30일");
            case 7:
                System.out.println("31일");
            case 8:
                System.out.println("31일");
            case 9:
                System.out.println("30일");
            case 10:
                System.out.println("31일");
            case 11:
                System.out.println("30일");
            case 12:
                System.out.println("31일");

        }

        sc.close();
    }
}
