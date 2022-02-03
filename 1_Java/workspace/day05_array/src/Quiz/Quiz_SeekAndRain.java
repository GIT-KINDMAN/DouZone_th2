/**
 * 문제1] int[] a = {1,7,5,7,2,8,7,9,12,5,7,99} -> int seek=7 일때 return 7's count
 * 문제2] 기상청: 1월의 평균 강수량 구하는 프로그램 작성 ( 단, 30일 기준) -> int[] arr = new int[30];
 */
package Quiz;

public class Quiz_SeekAndRain {

    static int count;
    static double sum;
    
    public static void main(String[] args) {

        //문제1
        int[] a = {1,7,5,7,2,8,7,9,12,5,7,99};

        for(int i=0;i<a.length;i++) {
            if(a[i]==7) {
            count++;
            }
        }
        System.out.println("7의 개수: "+count);


        //문제2
        double[] b = new double[30];

        for(int i=0;i<b.length;i++) {
            b[i] = (double)(Math.random()*1000);
        }

        for(int i=0;i<b.length;i++) {
            sum += b[i];
        }

        double avg = sum/b.length;

        System.out.printf("월 평균 강수량: %.2f",avg);

    }
}
