package _3_ClassesAndObjects.Classes;

/**
 * Вот пример кода для возможной реализации класса Bicycle,
 * чтобы дать обзор объявления класса.
 */
public class ReadMe_Classes {
}
class Bicycle {

    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;

    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}
/**
 * Объявление класса для MountainBike class, который является
 * подклассом Bicycle, может выглядеть следующим образом:
 */
class MountainBike extends Bicycle {

    // the MountainBike subclass has one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }
    // the MountainBike subclass has one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
/**
 * MountainBike наследует все поля и методы Bicycle и добавляет
 * поле seatHeight и метод для его установки (у горных велосипедов
 * есть места, которые можно перемещать вверх и вниз по мере
 * необходимости местности).
 */


