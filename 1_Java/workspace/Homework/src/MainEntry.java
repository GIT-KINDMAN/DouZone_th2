class Point {
    private int x,y;

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

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "toString";
    }
    


    
}

public class MainEntry {
    public static void main(String[] args) {
        Point pt = new Point();
        System.out.println(pt);
    }    
}
