package ex03.Switch;

public class MainEntry {
    public static void main(String[] args) {
        System.out.println("당신의 포인트 점수는?(1~3점) input: " + args[0]);

        Scanner sc = new Scanner(System.in);

        int point = sc.nextInt();

        switch (point) {
            case 1:
                System.out.println("포인트 점수 1점입니다.");
            case 2:
                System.out.println("포인트 점수 2점입니다.");
            case 3:
                System.out.println("포인트 점수 3점입니다.");
            default:
                System.out.println("1~3점 내에서 입력하세요.");
        }
    }
}
