package _3_ClassesAndObjects.Objects;

/**
 * Типичная Java-программа создает множество объектов, которые
 * взаимодействуют, вызывая методы. Посредством этих взаимодействий
 * объектов программа может выполнять различные задачи, такие
 * как реализация графического интерфейса пользователя,
 * запуск анимации или отправка и получение информации по
 * сети. Как только объект завершил работу, для которой он
 * был создан, его ресурсы используются повторно для использования
 * другими объектами.
 * Вот небольшая программа под названием CreateObjectDemo,
 * которая создает три объекта: один объект Point и два объекта
 * Rectangle.
 */
/*public class CreateObjectDemo {

    public static void main(String[] args) {

        // Объявит и создает point объект и два прямоугольных объекта
        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);

        // отображать ширину, высоту и площадь прямоугольника
        System.out.println("Width of rectOne: " + rectOne.width);
        System.out.println("Height of rectOne: " + rectOne.height);
        System.out.println("Area of rectOne: " + rectOne.getArea());

        // set rectTwo's position
        rectTwo.origin = originOne;

        // display rectTwo's position
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);

        // move rectTwo and display its new position
        rectTwo.move(40, 72);
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
    }
} >>>   Width of rectOne: 100
        Height of rectOne: 200
        Area of rectOne: 20000
        X Position of rectTwo: 23
        Y Position of rectTwo: 94
        X Position of rectTwo: 40
        Y Position of rectTwo: 72    */

public class ReadMe_Obj {
}
