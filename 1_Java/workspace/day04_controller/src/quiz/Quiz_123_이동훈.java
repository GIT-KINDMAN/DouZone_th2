package quiz;

public class Quiz_123_이동훈 {
    
    static int i;
    static int j;
    static double sum;
        public static void main(String[] args) {

        i=1; j=1; sum=0;
        while (i <= 5) {
            while (j <= i) {
                sum += j;
                j++;
            }
            i++;
        }
        System.out.println("1번문제: "+sum);

        i=1; j=1; sum=0;
        while (i<=10) {
            if(i%2==0) {
                sum += i;
            } else {
                sum += -i;
            }
            i++;
        }
        System.out.println("2번문제: "+sum);

        i=1; j=1; sum=0;
        while (i<10) {
            sum += (double)i/(i+1);
            i++;
        }
        System.out.printf("3번문제: %.2f",sum);
    }
}