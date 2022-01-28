/**
 * (개선판 22.01.28)
 * 점수는 0~100점 사이만 입력 받기
 * y/n? 물어보고 y 입력시 입력값을 다시 받을 수 있도록 하기(while을 쓰던 do while을 쓰던 루프. n을 누르면 종료) *
 */
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

public class Homework_Score_이동훈 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("몇 명의 학생을 입력하시겠습니까?: ");
        int N = sc.nextInt();

        Student[] std = new Student[N];

        for (int i = 0; i < N; i++) {

            System.out.print(i + 1 + "번 학생\n이름: ");
            String name = sc.next();

            int kor = 0;
            int eng = 0;
            int com = 0;

            boolean flag = true;
            while (flag) {
                flag = false;

                System.out.print("국어: ");
                kor = sc.nextInt();

                System.out.print("영어: ");
                eng = sc.nextInt();

                System.out.print("전산: ");
                com = sc.nextInt();

                if ((0 > kor || kor > 100) || (0 > eng || eng > 100) || (0 > com || com > 100)) {
                    System.out.println(
                            "--------------------------------------------------------\n유효한 점수를 다시 입력하시오.\n--------------------------------------------------------");
                    flag = true;
                }
            }

            std[i] = new Student(name, kor, eng, com);

            System.out.println("--------------------------------------------------------");

            printMember(std[i]);
            printGrade(std[i]);
            printFail(std[i]);

            System.out.println("========================================================");
        }
        sc.close();
    }

    private static void printGrade(Student std) {
        int avg = (std.kor + std.eng + std.com) / 3;

        String grade = "";
        switch (avg / 10) {
            case 10:
            case 9:
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
            default:
                grade = "F";
        }
        System.out.println("학점: " + grade);
    }

    private static void printFail(Student std) {
        float avg = (std.kor + std.eng + std.com) / 3;

        if (std.kor < 40 || std.eng < 40 || std.com < 40 || avg < 60) {
            System.out.println("불합격");
        } else {
            System.out.println("합격");
        }
    }

    private static void printMember(Student std) {
        System.out.println("[성적표]\n이름: " + std.name + ", 국어점수: " + std.kor + ", 영어점수: " + std.eng + ", 전산점수: " + std.com);
        System.out.printf("평균점수: %.2f\n", (float) (std.kor + std.eng + std.com) / 3);
    }
}