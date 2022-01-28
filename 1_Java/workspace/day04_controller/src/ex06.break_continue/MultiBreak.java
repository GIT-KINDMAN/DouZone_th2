package ex06.break_continue;

public class MultiBreak {
    public static void main(String[] args) {
    
        boolean flag = true;

        first : {
            second : {
                third : {
                        int k = 100;
                        System.out.println("Before the break");                

                        if(flag) break second; // 일반적으로 break를 이 블럭에 쓰면 third를 break하게 되지만, break second라고 쓰면 second 블럭을 break하게 된다.

                        System.out.println("이건 실행되지 않을 것임");
                    } // end third

                System.out.println("두번째 블럭의 출력");
            }//end second
            System.out.println("첫번째 블럭의 출력");
        }//end first
    }
    
}
/**
 * 식별자 : {
 *  
 *      식별자 : {
 * 
 *           break 식별자;
 *      }
 * }
 */