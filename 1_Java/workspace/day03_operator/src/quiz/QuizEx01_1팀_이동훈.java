package quiz;

import java.util.Scanner;

public class QuizEx01_1팀_이동훈 {
    public static void main(String[] args) {
        // %, / 산술연산자 이용한 계산 결과 출력하기
        /*
         * int won_10000 = pay/10000;
         * int won_1000 = (pay-won_10000*10000)/1000;
         * int won_100 = (pay-won_10000*10000-won_1000*1000)/100;
         * int won_10 = (pay-won_10000*10000-won_1000*1000-won_100*100)/10;
         */
        /*
         * int won_10000, won_1000, won_100, won_10, tmp;
         * 
         * int pay; // pay: 월급
         * 
         * Scanner sc = new Scanner(System.in);
         * 
         * pay = sc.nextInt();
         * 
         * won_10000 = pay/10000;
         * tmp = pay%10000;
         * 
         * won_1000 = tmp/1000;
         * tmp = tmp%1000;
         * 
         * won_100 = tmp/100;
         * tmp = tmp%100;
         * 
         * won_10 = tmp/10;
         * tmp = tmp%10;
         * 
         * System.out.println("result: ");
         * System.out.println("만원: "+won_10000);
         * System.out.println("천원: "+won_1000);
         * System.out.println("백원: "+won_100);
         * System.out.println("십원: "+won_10);
         */

        Scanner sc = new Scanner(System.in);
        int pay = sc.nextInt();
        String[] str = new String[]{"만","천","백","십"};
        int money = 10000;
        sc.close();

        int i=0;
        while (i<=3) {
            System.out.println(str[i]+"원 : "+pay/money);
            pay %= money;
            money /= 10;
            i++;
        }

        /*
         * result:
         * 만원: 56장
         * 천원: 7장
         * 백원: 8개
         * 십원: 9개
         */

    }
}