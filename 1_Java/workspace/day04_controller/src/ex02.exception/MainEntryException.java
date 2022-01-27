package ex02.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEntryException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x,y,result=0;

        System.out.print("Integer date 2 input: ");

        try {
            x= sc.nextInt();
            y= sc.nextInt();
    
            result = x/y;
            System.out.println(x+"/"+y+"="+result);
        } catch(InputMismatchException e) {
            //e.printStackTrace();
            System.out.println("InputMismatchException !!!");
        } catch(ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("ArithmeticException !!!");
        } catch(RuntimeException e) {
            //e.printStackTrace();
            System.out.println("RuntimeException !!!");
        } catch(Exception e) {
            //e.printStackTrace();
            System.out.println("Exception !!!");
        } finally {
            System.out.println("finally는 무조건 출력되는 블록");
        }

        sc.close();
    }
}
//exit(0);