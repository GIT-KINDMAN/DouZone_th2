package quiz;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
  
        System.out.print("행 입력: ");
        int r = sc.nextInt();

        System.out.print("열 입력: ");
        int c = sc.nextInt();

        
        int[][] a = new int[r][c];

        System.out.println("array date "+r+"row, "+c+"col = ");

        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print("a["+i+"]["+j+"]= ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n출력");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
