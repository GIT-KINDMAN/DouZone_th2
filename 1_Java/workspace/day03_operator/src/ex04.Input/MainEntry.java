package ex04.Input;

// import java.lang.*; 자동 임포트
// import java.util.*; 메모리 소비
import java.util.Scanner;

public class MainEntry {
    public static void main(String[] args) {
        System.out.println("Hi~222");

        Scanner sc = new Scanner(System.in); // Heap에 있는 객체를 참조하는 열쇠를 Stack에 부여
        
        System.out.println("Integer, double, char date input ==> ");
        
        int x = sc.nextInt();
        double y = sc.nextDouble();
        char ch = sc.next().charAt(2);

        System.out.println(x);
        System.out.println(y);
        System.out.println(ch);

        System.out.println(x+", "+y+", "+ch);
        sc.close();
    }
}
