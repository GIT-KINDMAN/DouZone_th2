import java.util.Scanner;

public class Homework_Stars_이동훈 {

    static int i, j, k;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        Star1();
        Star2();
        Star3();
        Star4();

        sc.close();
    }

    private static void selectStar() {

    }

    private static void Star1() {
        for (i = 1; i <= N; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Star2() {
        for (i = N; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Star3() {
        for (i = 1; i <= N; i++) {
            for (j = N; j >= 1; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Star4() {
        for (i = 1; i <= N; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (j = N; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println();
    }

    private static void Star5() {
        for (i = 1; i <= N; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Star6() {
        for (i = 1; i <= N; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Star7() {
        for (i = 1; i <= N; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println();
    }
}

/*
 * 
 * 
 * 
 * 스위치 메소드
 * 1
 * return 별1 메소드
 * break;
 * 2
 * ...
 * 3
 * 4
 * 5
 * 6
 * 7
 * }
 * 
 * 별1 메소드
 * 별2 메소드
 */