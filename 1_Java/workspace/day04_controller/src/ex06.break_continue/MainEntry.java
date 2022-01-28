package ex06.break_continue;

public class MainEntry {
    public static void main(String[] args) {
        // break, continue;

        for (int i = 1; i < 11; i++) {
            if (i == 7)
                continue; // do while문과 for문에서의 동작이 다르다? ?? 여튼 이 경우 7은 안나옴. 이번 루프는 여기서 끝이지만 다음 루프가 돌아감.
                          // goto라고 생각하면 되지 않나?
            System.out.println(i);
        }
        System.out.println("main end");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.print(i + "\t");
        }

        // 부정문 + continue로 끊어주는 방법
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                continue;
            System.out.print(i + "\t");
        }
    }
}
