package shapes;

public class TestShapes {
    
    public static void main(String[] args) {
//        Point point1 = new Point(0,0);
//        Point point2 = new Point(10,10);
//        Line line = new Line(point1, point2);
//        Shape point3 = new Point(2, 3);
//
//        System.out.println("P1: " + point1.toString());
//        System.out.println("L : " + line.toString());
//        line.move(5, 5);
//        System.out.println("L : " + line.toString());
//        System.out.println("P1: " + point1.toString());
//        point3.move(10, 10);
//        System.out.println("P3: " + point3.toString());

            // stvorec
        Square stvorec = new Square(5);
        stvorec.print();
        stvorec.setColor('#');
        System.out.println();
        stvorec.print();
        System.out.println();

        //obdlznik
        Rectangle obdlznik = new Rectangle(7,4,'X');
        obdlznik.print();

        //trojuholnik
        Triangle trojuholnik = new Triangle(8);
        trojuholnik.print();




    }
}
