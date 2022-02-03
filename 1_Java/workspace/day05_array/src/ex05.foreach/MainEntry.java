package ex05.foreach;

/**
 * 확장 for문
 * 
 * for(자료형 변수명: 컬렉션명 or 배열명) {
 * 반복구문
 * }
 * 
*/
public class MainEntry {
   public static void main(String[] args) {
       int[] a = {7,3,5,2,8,100,89,90};

       System.out.println("***** for 출력");
       for (int i=0; i<a.length; i++) {
           System.out.println(a[i]+"\t");
       }

       //for(자료형 변수명 : 컬렉션명 or 배열명) { 반복구문; }
       System.out.println("***** for each 출력");
       for (int item : a) {
           System.out.println(item + "\t");
       }
   } 
}
