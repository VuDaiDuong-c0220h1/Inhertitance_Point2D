public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3, 5);
        System.out.println(point2D);
        Point3D point3D = new Point3D(3, 5, 7);
        System.out.println(point3D);
        MovablePoint movablePoint = new MovablePoint(3, 5, 2, 5);
        movablePoint.move();
        System.out.println(movablePoint);

    }
}
