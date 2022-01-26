package quiz;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int su = sc.nextInt();
        String[] str = new String[]{"시","분","초"};
        int div = 3600;
        sc.close();
        
        int i=0;
        while (i<3) {
            System.out.print((su/div)+ str[i]+" ");
            su %= div;
            div /= 60;
            i++;
        }
    }
}