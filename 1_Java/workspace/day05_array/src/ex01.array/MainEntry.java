package ex01.array;

public class MainEntry {
    public static void main(String[] args) {
        //1.
        //char[] ch;  // 배열 선언
        //ch= new char[4]; // 배열 생성, 메모리에 할당

        //2.
        char[] ch2 = new char[4];   // 배열 선언 및 생성 // char(1Byte)*4 = 4Byte 메모리 공간 할당
        //배열 초기화
        ch2[0] = 'J';
        ch2[1] = 'A';
        ch2[2] = 'V';
        ch2[3] = 'A';

        System.out.println(ch2[0]);
        System.out.println(ch2[3]+"\n===");

        for(int i=0;i<ch2.length;i++) {
            System.out.println(ch2[i]);
        }
        System.out.println("================================");
        //3.
        char[] ch3 = {'a','k','P','D'};
        System.out.println(ch3[1]);

        System.out.println("array length: "+ch3.length);

        for(int i=0; i<ch3.length;i++) {
            System.out.println(ch3[i]);
        }
        System.out.println("================================");

        String[] str = {"a","B","Par"};

        for( int i=0;i<str.length;i++) {
            System.out.println(str[i]);
        }
    }
}