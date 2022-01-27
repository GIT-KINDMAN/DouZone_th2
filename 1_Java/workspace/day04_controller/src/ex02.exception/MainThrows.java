package ex02.exception;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MainThrows {
    public static void main(String[] args)
        throws ArithmeticException, InputMismatchException {

        Scanner sc = new Scanner(System.in);
        int x,y,result=0;

        System.out.print("Integer date 2 input: ");

        x = sc.nextInt();
        y = sc.nextInt();

        result = x/y;
        System.out.println(x+"/"+y+"="+result);

        sc.close();
    }
}
//exit(0);