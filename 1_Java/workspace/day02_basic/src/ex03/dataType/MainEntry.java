package ex03.dataType;

public class MainEntry {
    public static void main(String[] args) {
         int su = 10;
         System.out.printf("2진수: %b\n",su);
         System.out.printf("10진수: %d\n",su);
         System.out.printf("8진수: %o\n",su);
         System.out.printf("16진수: %x %X \n",su,su); // %x: 소문자, %X: 대문자
         
         System.out.printf("\n\n%d %x %o %X \n",10,10,10,10); 

         //0숫자-> 8진수, 0x숫자 -> 16진수
         System.out.printf("%d \n", 012); // 10
         System.out.printf("%d \n", 0xA); // 10

         double f = 12.34;
         System.out.println(f);
         float ff = 12.34f;
         System.out.println(ff);
    }
}

/**
public class MainEntry {
    public static void main(String[] args) {
        short sh = 32767; // short: -32,768 ~ 32,767
        int num = 32769; // int: -21억 ~ 21억

        System.out.println(sh+ " : " + num);
        sh = (short)num; // 묵시적 형변환 불가; 큰 자료형 -> 작은 자료형: 명시적 형변환 필요. 반대는 묵시적(자동) 형변환 적용
        System.out.println(sh+ " : " + num);
    }
}
*/

/**
package ex03.dataType;

public class MainEntry {
    public static void main(String[] args) {
        String str = "A"; // 문자열, " ", 2byte, A\0 (NULL 같이 들어가있음)
        char ch = 'A'; // 문자, '', 1byte (한글은 2byte)
        char ch2 = 67;
        char ch3 = 'b'; // ASCII 98
        int su = 20; String name = "happy"; double dd = 12.34, ff = 3.45;
        
        System.out.println(ch); // A
        System.out.println(str); // A (Byte 다름)
        System.out.println((int)ch); // ASCII 65
        System.out.println(ch2+ch3); // 됨 (67+98=165)
        System.out.println("name = "+name);
        System.out.println("실수형 데이터: "+dd);
        System.out.printf("%f %f \n",dd,ff);

        System.out.println("---------------------------");

        for(int i=65;i<=90;i++) System.out.print((char)i+" ");

        System.out.println("\n\n===================================");

        for(int i='a';i<='z';i++) System.out.print((char)i+" ");
        
        System.out.println("\n\nboolean type");
        boolean flag = true;
        // int b = flag; < C언어는 되지만 자바에서는 형변환 X
        System.out.println(flag);
    }
}
*/
