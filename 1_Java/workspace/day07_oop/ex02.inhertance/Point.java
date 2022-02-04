public class Point {
    protected int x;
    protected int y;

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void disp() {
        System.out.println("x: " + x + "\ty: " + y);
    }
}
