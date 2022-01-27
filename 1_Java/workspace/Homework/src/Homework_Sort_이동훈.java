import java.util.Scanner;

public class Homework_Sort_이동훈 {

    public static void main(String[] args) {

        // 논리연산자
        int a = 3;
        int b = 4;
        int c = 5;

        int[] num = new int[3];

        // abc acb bac bca cab cba
        if(a>b&&a>c) { // abc acb
            if(b>c) {
                num[0] = a;
                num[1] = b;
                num[2] = c;
            } else {
                num[0] = a;
                num[1] = c;
                num[2] = b;
            }
        } else if (b>a&&b>c) { // bac bca
            if(a>c) {
                num[0] = b;
                num[1] = a;
                num[2] = c;
            } else {
                num[0] = b;
                num[1] = c;
                num[2] = a;
            }
        } else if (c>a&&c>b) { // cab cba
            if(a>b) {
                num[0] = c;
                num[1] = a;
                num[2] = b;
            } else {
                num[0] = c;
                num[1] = b;
                num[2] = a;
            }
        }
        System.out.println("논리 연산자 활용 - 3,4,5 내림차순 정렬: ");
        for(int i=0;i<num.length;i++) System.out.println(num[i]);

        System.out.println("--------------------");

// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        
        // 범용
        Scanner sc = new Scanner(System.in);

        System.out.println("범용(내림차순) - 정렬할 수의 개수 입력: ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        System.out.println("\n"+N+"개의 수 입력");
        System.out.println("--------------------");

        for (int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr, arr.length);
        printArr(arr);

        sc.close();
    }

    private static void printArr(int[] arr) {
        System.out.println("--------------------");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void sort(int[] arr, int size) {

        for(int i = 0; i < size - 1; i++) {
			int max_index = i;	
			
			for(int j = i + 1; j < size; j++) {
				if(arr[j] > arr[max_index]) {
					max_index = j;
				}
			}
			swap(arr, max_index, i);
		}
	}

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}