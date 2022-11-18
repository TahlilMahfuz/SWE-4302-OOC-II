class TestEvenArray implements Property<Integer> {
    public boolean test(Integer i) {
        return i % 2 == 0;
    }
}