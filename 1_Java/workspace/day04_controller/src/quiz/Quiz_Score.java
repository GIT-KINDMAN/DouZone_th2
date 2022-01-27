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
        printGrade(std);

        sc.close();
    }

    private static void printGrade (Student std) {
        int avg = (std.kor+std.eng+std.com)/3;

        String grade = "";
        switch(avg/10) {
            case 10: case 9: 
                    grade = "A";
                    break;
            case 8: 
                    grade = "B";
                    break;
            case 7: 
                    grade = "C";
                    break;
            case 6: 
                    grade = "D";
                    break;
            default: grade = "F";
        }
        System.out.println("학점: " + grade);
    }

    private static void printMember(Student std) {
        System.out.println("이름: "+std.name+", 국어점수: "+std.kor+", 영어점수: "+std.eng+", 전산점수: " +std.com+ "\n평균점수: "+ (double)(std.kor+std.eng+std.com)/3);
    }
}