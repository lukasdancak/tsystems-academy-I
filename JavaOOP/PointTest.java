public class PointTest {


    public static void main(String[] args) {
        Point p1 = new Point(3,4);
        Point p2 = p1; // kopiruje sa referencia na ten jeden objekt

        p1.move(10,20);
        System.out.println(p1);
        System.out.println(p2);
    }


}
