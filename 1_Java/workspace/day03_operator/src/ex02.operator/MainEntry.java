package ex02.operator;

public class MainEntry {
    public static void main(String[] args) {
        int x=20, y=20;

        if(x!=y)
            System.out.println("같지 않음");
        else
            System.out.println("같음");

        // if-else문 대체 가능한 삼항연산자 : (조건)? 참: 거짓;
        String msg = null; // msg = "";
        msg = (x!=y)? "같지 않음" : "같다";
        System.out.println(msg);

        int a=10, b=20, c=30, result=0;
        result =(a>b)? a: (b>c)? b:c;
        // result =(a>b)? a :
        //                   (b>c)? b : c;
    }
}

/**
 * package ex02.operator;

public class MainEntry {
    public static void main(String[] args) {
        //shift 연산자: <<, >>, <<<
        int x = 8, result;

//      result = x << 2; // left shift: 원래값 *2 ^ bit 수
        result = x >> 3; // left shift: 원래값 /2 ^ bit 수

//      System.out.println("left shift result: "+result); // 32
        System.out.println("right shift result: "+result); // 1
    }
}
*/