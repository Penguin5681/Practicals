public class Practical17 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(12, 4);
        Rectangle r2 = new Rectangle(12);
        Rectangle r3 = new Rectangle();
    }
}

class Rectangle {
    private int altitude;
    private int breadth;

    public Rectangle() {
        altitude = 0;
        breadth = 0;
    }

    public Rectangle(int altitude, int breadth) {
        this.altitude = altitude;
        this.breadth = breadth;
    }

    public Rectangle(int altitude) {
        this.altitude = altitude;
        breadth = 0;
    }
}