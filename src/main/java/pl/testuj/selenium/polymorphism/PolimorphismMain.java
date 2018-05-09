package pl.testuj.selenium.polymorphism;

public class PolimorphismMain {
    public static void main(String[] args) {
        Vehicle bmw = new Car();
        drive(bmw);
    }

    public static void drive(Vehicle v) {
      v.drive();
    }
}
