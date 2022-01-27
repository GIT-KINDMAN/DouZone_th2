package ex04.For;

public class MainEntry {
    
    public static void main(String[] args) {
        for(int i=0;i<100;i++) {
            if(i%10==0) {
                System.out.println();
            }
            System.out.print(i+1+"\t");
        }

        //문제] 1~100까지 중에서 3의 배수의 개수와 합을 구하는 프로그램 작성
        int sum=0;
        int count=0;
        for(int i=1;i<=100;i++) {
            if(i%3==0) {
                sum += i;
                count++;
            }
        }
        /*과제2] 사칙연산 프로그램 작성(예외처리하기)
        숫자 2개 입력 받고, 연산자(+, -, *, /) 1개 입력 받아서
        ( if, switch 이용 ) 
   
        result> 
        3
        5
        +

        3 + 5 = 8
        */

        
    

        System.out.println("\n\n3의 배수의 개수: "+count);
        System.out.println("3의 배수의 합: "+sum);
    }
}