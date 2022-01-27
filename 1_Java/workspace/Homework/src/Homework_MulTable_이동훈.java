import java.util.Scanner;

public class Homework_MulTable_이동훈 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("출력할 구구단의 단 입력: ");
        
        int x = sc.nextInt();

        System.out.println("-----------------------------------------------------------------------\n"+x+"단 테이블\n-----------------------------------------------------------------------");
        for(int i=1;i<=9;i++) {
            System.out.print(x*i+"\t");
        }

        sc.close();
    }
}
