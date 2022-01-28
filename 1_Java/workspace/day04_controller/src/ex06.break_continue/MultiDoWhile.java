package ex06.break_continue;

public class MultiDoWhile {
    public static void main(String[] args) {
        int a = 1, b = 1; //  변수 초기화

        do {
            b = 1; // while, do~while 문에서는?
            do {
                System.out.println(b + "\t");
                b++; // 증감식
            } while (b <= 3); //조건

            a++; // 증감
            System.out.println();
        } while (a <= 2); // 조건
    }
}
