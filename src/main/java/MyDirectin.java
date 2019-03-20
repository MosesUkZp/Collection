public enum MyDirectin {
    NORTH,
    EAST,
    WEST,
    SOUTH;

    @Override
    public String toString() {
        return "Direction is " + name();
    }
}
