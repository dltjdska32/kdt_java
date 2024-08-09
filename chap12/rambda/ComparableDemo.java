package chap12.rambda;

public class ComparableDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(100, 51);
        Rectangle r2 = new Rectangle(10, 20);
        Rectangle r3 = new Rectangle(40, 500);


        Object[] obs = {r1, r2, r3};

        for (Object ob : obs) {

        }

    }
}

class Rectangle implements Comparable<Rectangle> {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int findArea() {
        return width * height;
    }

    public String toString() {
        return String.format("Rectangle[width=%d, height=%d]", width, height);
    }

    public int compareTo(Rectangle r) {
        return findArea() - r.findArea();
    }
}
