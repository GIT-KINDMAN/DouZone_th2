package ex03.Switch;

import java.util.Scanner;

public class SwitchBreak {
    public static void main(String[] args) {
        
        System.out.print("당신의 포인트 = ");

        Scanner sc = new Scanner(System.in);

        int point = sc.nextInt();

        switch(point) { // 조건 - 문자형, 정수형(long형 제외), 실수형 안됨
            case 1:
                System.out.print("집"); break;
            case 2:
                System.out.print("피아노"); break;
            case 3:
                System.out.print("우산"); break;
        } // end switch

        System.out.print(" 상품에 당첨되셨습니다. 축하합니다!");

        sc.close();
    }
}