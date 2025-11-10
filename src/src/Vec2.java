public record Vec2(double x, double y) {

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }
}
