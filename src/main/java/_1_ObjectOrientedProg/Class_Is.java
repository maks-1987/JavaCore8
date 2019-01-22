package _1_ObjectOrientedProg;

/**
 * В реальном мире вы часто найдете множество отдельных объектов
 * одного и того же вида. Могут существовать тысячи других
 * велосипедов, все той же марки и модели. Каждый велосипед был
 * построен из одного и того же набора чертежей и, следовательно,
 * содержит одинаковые компоненты. В объектно-ориентированных
 * терминах мы говорим, что ваш велосипед является экземпляром
 * класса объектов, известных как велосипеды. Класс - это
 * проект, из которого создаются отдельные объекты.
 */
class Class_Is {

    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBreakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence: " +
                cadence + " speed: " +
                speed + " gear " + gear);
    }

    /**
     *
     * Поля cadence, speed и gear представляют состояние объекта,
     * а методы (changeCadence, changeGear, speedUp и т.д.)
     * Определяют его взаимодействие с внешним миром.
     */
}

/**
 * Ответственность за создание и использование новых объектов
 * Bicycle принадлежит другому классу в вашем приложении.
 * Вот класс BicycleDemo, который создает два отдельных
 * объекта Bicycle и вызывает их методы:
 */
class BicycleDemo {
    public static void main(String[] args) {

        // Create two different
        // Bicycle objects
        Class_Is bike1 = new Class_Is();
        Class_Is bike2 = new Class_Is();

        // Invoke methods on
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}/*
>>> cadence: 50 speed: 10 gear 2
    cadence: 40 speed: 20 gear 3
*/