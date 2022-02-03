package ex04.sort;

import java.util.Arrays;
public class ArraysSortTest {
    public static void main(String[] args) {
        int[] a =  {7, 3, 5, 2, 8};

        System.out.println("***** sort 이전 출력");
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]+"\t");
        }

        // Sort
        System.out.println("\n오름차순");
        Arrays.sort(a);



        System.out.println("***** sort 이후 출력");
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]+"\t");
        }

        System.out.println("\n내림차순");
        for (int i = a.length-1; i>=0; i--) {
            System.out.println(a[i]+"\t");
        }

    }
}
