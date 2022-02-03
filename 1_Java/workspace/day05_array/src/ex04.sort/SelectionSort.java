package ex04.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a =  {7, 3, 5, 2, 8};

        System.out.println("***** sort 이전 출력");
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]+"\t");
        }

        // Selection Sort
        int tmp;
        for(int i=0; i<a.length; i++) {
            for(int j=i+1; j<a.length; j++) {
                if(a[i]>a[j]) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }



        System.out.println("***** sort 이후 출력");
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]+"\t");
        }

    }
}
