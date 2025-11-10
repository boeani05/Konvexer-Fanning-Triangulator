import java.util.ArrayList;
import java.util.List;

public record Polygon(List<Vec2> points) {

    public List<Triangle> triangulate() {
        int numberOfPoints = points.size();
        
        if (numberOfPoints < 3) {
            return new ArrayList<>();
        }
        
        List<Triangle> triangles = new ArrayList<>();
        
        int p1Index = 0;

        for (int i = 1; i <= numberOfPoints - 2; i++) {
            int p3Index = i + 1;
            triangles.add(new Triangle(p1Index, i, p3Index));
        }

        return triangles;
    }
}
