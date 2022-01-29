import java.util.Scanner;

public class Homework_Stars_이동훈 {

    static int i, j;
    static int N, select;
    static boolean flag = true;

    public static void main(String[] args) {
        execute();
    }

    private static void execute() {
        Scanner sc = new Scanner(System.in);

        while (flag) {

            System.out.print("출력할 줄의 수를 입력하시오: ");
            N = sc.nextInt();

            System.out.print("출력할 문제 번호를 입력하시오.(8 입력 시 모두 출력, 0 입력시 종료): ");
            select = sc.nextInt();
            selectStar(select);
        }

        sc.close();
    }

    private static void selectStar(int select) {
        switch (select) {
            case 1:
                Star1();
                break;
            case 2:
                Star2();
                break;
            case 3:
                Star3();
                break;
            case 4:
                Star4();
                break;
            case 5:
                Star5();
                break;
            case 6:
                Star6();
                break;
            case 7:
                Star7();
                break;
            case 8:
                Star1();
                Star2();
                Star3();
                Star4();
                Star5();
                Star6();
                Star7();
                break;
            case 0:
                flag = false;
                break;
            default:
                System.out.println("올바른 번호를 입력하시오.\n");
        }
    }

    private static void Star1() {
        System.out.println("문제1)");
        for (i = 1; i <= N; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Star2() {
        System.out.println("문제2)");
        for (i = N; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Star3() {
        System.out.println("문제3)");
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
        System.out.println("문제4)");
        for (i = 1; i <= N; i++) {
            for (j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (j = N; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println();
    }

    private static void Star5() {
        System.out.println("문제5)");
        for (int i = 1; i <= N; i++) {
            for (int j = N - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Star6() {
        System.out.println("문제6)");
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = (N - i + 1) * 2 - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Star7() {
        System.out.println("문제7)");
        for (int i = 1; i <= N; i++) {
            for (int j = N - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = (N - i) * 2 - 1; j >= 1; j--) {
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