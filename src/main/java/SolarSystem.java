enum SolarSystem {
    MERCURY(0, 0, null),
    VENUS(130, 98, MERCURY),
    EARTH(110, 100, VENUS),
    MARS(130, 109, EARTH),
    JUPITER(120, 103, MARS),
    SATURN(106, 100, JUPITER),
    URANUS(100, 97, SATURN),
    NEPTUNE(101, 98, URANUS),
    PlUTON(98, 100, NEPTUNE);

    final public int num;
    final public int prevDistance;
    final public int radius;
    final public int sunDistance;
    final public SolarSystem previous;
    private SolarSystem next;


    SolarSystem(int prevDistance, int radius, SolarSystem previous) {
        this.prevDistance = prevDistance;
        this.radius = radius;
        if (previous == null) {
            this.num = 1;
            this.sunDistance = 198;
            this.previous = null;
        } else {
            this.num = previous.num + 1;
            this.sunDistance = previous.sunDistance + prevDistance;
            this.previous = previous;
            this.previous.next = this;
        }

    }

}















