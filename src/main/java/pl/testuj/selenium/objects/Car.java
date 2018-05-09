package pl.testuj.selenium.objects;

public class Car {
    private int speed = 0;
    private String make;
    private String model;
    static final int SPEED_LIMIT = 250;

    //max speed

    //konstruktor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void accelerate() {
        if (speed < 250)
            speed++;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        if (newSpeed < SPEED_LIMIT && newSpeed > 0)
            speed = newSpeed;
    }

    public void stop() {
        speed = 0;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
