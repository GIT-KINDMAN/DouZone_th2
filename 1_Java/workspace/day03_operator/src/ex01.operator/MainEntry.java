package ex01.operator;

public class MainEntry {
    public static void main(String[] args) {
        //산술연산자: +, -, *, /, %,......
        int x= 10, y= 20;
        int mul= x*y;

        System.out.println("x*y = "+mul);
        System.out.println("x*y = "+y*x);

        System.out.println(x+"*"+y+" = "+y*x);

        System.out.println("\n\n3+4*5 = " + (3+4*5));
        System.out.println("3+4*5 = " + ((3+4)*5));

        //정수 ( +, -, *, /, %,......) 정수 = 정수
        System.out.println("\n7/3 = " + (7/3)); // 2

        System.out.println("7%3 = " + (7%3));

        System.out.println("\n7/3. = " + (7/3.));
        System.out.println("7./3.0 = " + (7./3.0));        
    }
}

/**
public class MainEntry {
    public static void main(String[] args) {
        int x= 10, y;

        y = ~10; // 비트 부정 (이게 뭐지: 임베디드반?: 원래 값 + 1 = 11, 거기에 전체 -를 붙인다? -> -(원래값+1) => 출력결과 : 1의 보수 말하는건가?)
                 // 10 -> 1010 -> 111...0101
                 // -7 -> 000...110?
        
        System.out.println();
    }
}
*/

/**
public class MainEntry {
 public static void main(String[] args) {
    //단항연산자: 증강 ==> ++, --, ~,........
    int x = 10, y ;

    //y = x++; // 후위연산: 대입먼저, 연산나중
    //y = ++x; // 전위연산: 연산먼저, 대입나중
    //y = x--;

    ++x; // x++ 이 경우 전위든 후위든 똑같음
    y=x;

    System.out.println("x =" + x + "\ty = " + y);
 }   
}
*/
