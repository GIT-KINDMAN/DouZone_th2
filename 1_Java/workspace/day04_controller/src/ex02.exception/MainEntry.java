package ex02.exception;

import java.util.Scanner;

public class MainEntry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x,y,result=0;

        System.out.print("Integer date 2 input: ");

        x= sc.nextInt();
        y= sc.nextInt();

        try {
            result = x/y;
            System.out.println(result);
        } catch(Exception e) {
            //System.out.println("0으로 나눌 수 없음");
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }//try end

        sc.close();
    }
}
//exit(0);