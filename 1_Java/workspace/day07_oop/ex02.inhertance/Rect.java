public class Rect extends Point { // Sub

    private int x2;
    private int y2;

    public int getX2() {
        return this.x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return this.y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void disp() {
        System.out.println("x: " + x + "\ty: " + y+"\ttx2: "+x2+"\ty2: "+y2 );
    }
}
