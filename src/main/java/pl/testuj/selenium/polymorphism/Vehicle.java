package pl.testuj.selenium.polymorphism;

public abstract class Vehicle {
    //should NOT use public field
    // for demo purpose

    public int wheels;
    public String color;
    public int speed;

    public void drive(){
        speed++;
    }
}
