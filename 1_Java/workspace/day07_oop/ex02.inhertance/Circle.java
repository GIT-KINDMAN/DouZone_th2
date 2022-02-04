package ex02.inheritance;

public class Circle extends Point{
    private int r;

    public Circle() { // 생성자 함수
        x=y=10;
    }
    
    public int getR() {
        return this.r;
    }

    public void setR(int r) {
        this.r = r;
    }

    // output method
    
    public void disp() {
        super.disp();
        System.out.println("\tr: "+r);
        //System.out.println("x: "+x+"\ty: "+y);
    }

}
