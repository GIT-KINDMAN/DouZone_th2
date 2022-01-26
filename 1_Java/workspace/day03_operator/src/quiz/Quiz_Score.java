package quiz;

import java.util.Scanner;

class Student {

    String name;
    int kor;
    int eng;
    int com;

    public Student(String name, int kor, int eng, int com) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.com = com;
    }
}

public class Quiz_Score {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int com = sc.nextInt();
        
        Student std = new Student(name,kor,eng,com);
        
        printMember(std);
        sc.close();
    }

    private static void printMember(Student std) {
        System.out.println("이름: "+std.name+", 국어점수: "+std.kor+", 영어점수: "+std.eng+", 전산점수: " +std.com+ "\n평균점수: "+ (double)(std.kor+std.eng+std.com)/3);
    }
}