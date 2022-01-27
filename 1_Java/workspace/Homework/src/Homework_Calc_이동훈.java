import java.util.Scanner;

public class Homework_Calc_이동훈 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\n입력 예시 : x + y\n입력: ");
        
        int x = sc.nextInt();
        char op = sc.next().charAt(0);
        int y = sc.nextInt();

        // if 구현
        try {
            if (op == '+') {
                System.out.println(x + "+" + y + "= " + (x + y));
            } else if (op == '-') {
                System.out.println(x + "+" + y + "= " + (x - y));
            } else if (op == '*') {
                System.out.println(x + "*" + y + "= " + (x * y));
            } else if (op == '/') {
                System.out.println(x + "/" + y + "= " + (x / y));
            } else {
                System.out.println("유효한 연산자를 입력하시오");
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("if 구현 완료");
        }

        System.out.println("----------------------");

        // switch 구현
        try {
            switch (op) {
                case '+':
                    System.out.print(x + "+" + y + "= " + (x + y));
                    break;
                case '-':
                    System.out.println(x + "+" + y + "= " + (x - y));
                    break;
                case '*':
                    System.out.println(x + "*" + y + "= " + (x * y));
                    break;
                case '/':
                    System.out.println(x + "/" + y + "= " + (x / y));
                    break;
                default:
                    System.out.println("유효한 연산자를 입력하시오");
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("\nswitch 구현 완료");
        }

        sc.close();
    }
}

/*
 * 과제2] 사칙연산 프로그램 작성(예외처리하기)
 * 숫자 2개 입력 받고, 연산자(+, -, *, /) 1개 입력 받아서
 * ( if, switch 이용 )
 * 
 * result>
 * 3
 * 5
 * +
 * 
 * 3 + 5 = 8
 */