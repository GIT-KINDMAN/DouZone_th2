package ex03.Switch;

import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {
        
        System.out.println("도시를 선택하세요 (s, d, b, j)= ");

        //String ch = new Scanner(System.in).next();
        char ch = new Scanner(System.in).next().charAt(0);

        switch(ch) { // 조건 - 문자형, 정수형(long형 제외), 실수형 안됨

            case 's':
                System.out.print("서울");
                break;
            case 'd':
                System.out.print("대구");
                break;
            case 'b':
                System.out.print("부산");
                break;
            case 'j':
                System.out.print("제주");
                break;
            default:
                System.out.print("s, d, b, j 중에서만 선택하세요.");
                system.exit(0); // 프로그램 강제 종료
        } // end switch

        System.out.println("을(를) 선택하셨습니다.");  
    }
}
