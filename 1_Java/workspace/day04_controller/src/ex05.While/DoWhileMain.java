package ex05.While;

import java.util.Scanner;

public class DoWhileMain {
    public static void main(String[] args) {
        // su 정수 데이터 1개 입력 받아서 (0~100 사이값만 입력) 출력하는 프로그램 작성 (do~while)

        Scanner sc = new Scanner(System.in);
        int su;

        do {
            System.out.print("입력: ");
            su = sc.nextInt();
            System.out.print("출력: "+ su+"\n");
        } while(0<=su&&su<=100);

        sc.close();
    }
}
