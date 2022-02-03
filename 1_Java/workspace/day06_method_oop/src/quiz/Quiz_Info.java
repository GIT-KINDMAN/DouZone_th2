/**
 * info() 이름, 연락처, 주소 출력 함수
 * abs(int x) 절대값 출력하는 함수
 * max() 두 개 정수 입력 받아서 큰 수 리턴하는 함수
*/
package quiz;

import java.util.Scanner;

public class Quiz_Info {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        info();
        System.out.print("1개의 수 입력(abs) : ");
        int T = sc.nextInt();
        System.out.println("절대값: "+abs(T));
        
        System.out.print("2개의 수 입력(max) : ");
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println("큰 수: "+max(N,M));
        

        System.out.print("2개의 수 입력(사칙연산) : ");
        int X = sc.nextInt();
        int Y = sc.nextInt();
        add(X,Y);
        sub(X,Y);
        mul(X,Y);
        div(X,Y);

        sc.close();
    }

    public static void info() {
        System.out.println("이름: 이동훈");
        System.out.println("연락처: 010-1234-5678");
        System.out.println("주소: 서울특별시 강동구");
    }

    public static int abs(int T) {
        return Math.abs(T);
    }

    public static int max(int N, int M) {
        if (N>M) return N;
        else return M;
    }

    public static void add(int X, int Y) {
        System.out.println(X+Y);
    }

    public static int sub(int X, int Y) {
        return X-Y;
    }

    public static int mul(int X, int Y) {
        return X*Y;
    }

    public static int div(int X, int Y) {
        try {
            return X/Y;
        } catch (ArithmeticException e) {
                System.out.println("불능");
            }
        }
    }

    // sub, mul: return 타입 적용
    // try catch: div


