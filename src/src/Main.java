import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vec2 p1 = new Vec2(0, 0);
        Vec2 p2 = new Vec2(10, 0);
        Vec2 p3 = new Vec2(12, 1);
        Vec2 p4 = new Vec2(10, 2);
        Vec2 p5 = new Vec2(2, 2);
        Vec2 p6 = new Vec2(0, 1);

        Polygon polygon = new Polygon(new ArrayList<>(List.of(p1, p2, p3, p4, p5, p6)));

        List<Triangle> triangulated = polygon.triangulate();

        for (Triangle triangle : triangulated) {
            System.out.println(triangle);
        }
    }
}