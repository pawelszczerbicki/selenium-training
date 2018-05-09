package pl.testuj.selenium.objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Car domain object test")
class CarTest {

    private static final String MAKE = "some make";
    private static final String MODEL = "some model";

    private Car car;

    @BeforeEach
    public void createCar() {
        car = new Car(MAKE, MODEL);
    }

    @Test
    @DisplayName("Check make and model")
    void freshCarShouldHaveMakeAndModel() {
        //then
        Assertions.assertEquals(car.getMake(), MAKE);
        Assertions.assertEquals(car.getModel(), MODEL);
    }

    @Test
    void shouldAccelerate() {
        //given
        int speed = 10;

        //when
        accelerate(speed);

        //then
        Assertions.assertEquals(car.getSpeed(), speed);
    }

    @Test
    void shouldNotAccelerateOverSpeedLimit() {
        //given
        car.setSpeed(Car.SPEED_LIMIT - 1);

        //when
        accelerate(10);

        //then
        Assertions.assertEquals(Car.SPEED_LIMIT, car.getSpeed());

    }

    @Test
    void shouldStartWithZeroSpeed() {
        Assertions.assertEquals(0, car.getSpeed());
    }

    @Test
    void shouldSetSpeedProperly() {
        car.setSpeed(50);
        Assertions.assertEquals(50, car.getSpeed());
    }

    @Test
    void speedShouldNotBeLowerThanZero() {
        car.setSpeed(-5);
        Assertions.assertTrue(car.getSpeed() >= 0);
    }

    @Test
    void shouldNotBeAbleToSetSpeedOverLimit() {
        //given
        int currentSpeed = car.getSpeed();
        int newSpeed = Car.SPEED_LIMIT + 10;

        //when
        car.setSpeed(newSpeed);

        //then
        Assertions.assertEquals(car.getSpeed(), currentSpeed);
        Assertions.assertNotEquals(car.getSpeed(), newSpeed);
    }

    @Test
    void shouldStop() {
        //given
        car.accelerate();

        //when
        car.stop();

        //then
        Assertions.assertEquals(0, car.getSpeed());
    }

    private void accelerate(int times) {
        for (int i = 0; i < times; i++) {
            car.accelerate();
        }
    }
}