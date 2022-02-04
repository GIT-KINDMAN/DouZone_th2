package ex02.inheritance;

public class Circle extends Point{
    private int r;

    public int getR() {
        return this.r;
    }

    public void setR(int r) {
        this.r = r;
    }

    // output method
    public void disp() {
        System.out.println("x: "+x+"\ty: "+y);
    }

}
