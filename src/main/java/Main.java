public class Main {
    public static void main(String[] args) {
        SolarSystem solarSystem = SolarSystem.VENUS;
        System.out.println("Previous planet is: " + solarSystem.previous);
        System.out.println("Order number is: " + solarSystem.num);
        System.out.println("Distance from the Sun is : " + solarSystem.sunDistance);
        System.out.println("Distance from previous planet is: " + solarSystem.prevDistance);
        System.out.println("Radius of planet is: " + solarSystem.radius);
    }
}
