public record Triangle(int p1Index, int p2Index, int p3Index) {
    @Override
    public String toString() {
        return String.format("(%d, %d, %d)", p1Index, p2Index, p3Index);
    }
}
