package ex04.Input;

public class MainInput {
    public static void main(String[] args) {
        System.out.println("string, int = ");

        String str = args[0];
//      String strSu = args[1];
//      int su = Integer.parseInt(strSu);
        int su = Integer.parseInt(args[1]);
        
        System.out.println(str);
        System.out.println(su + 33);

    }

}
