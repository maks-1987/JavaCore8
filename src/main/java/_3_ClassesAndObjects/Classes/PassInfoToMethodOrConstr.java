package _3_ClassesAndObjects.Classes;

/**
 * ------Передача информации в метод или конструктор------
 * Объявление для метода или конструктора объявляет число
 * и тип аргументов для этого метода или конструктора.
 * Например, ниже приведен метод, который вычисляет ежемесячные
 * платежи по ипотечному кредиту на основе суммы кредита,
 * процентной ставки, срока кредита (количества периодов)
 * и будущей стоимости кредита:
 */
public class PassInfoToMethodOrConstr {

    public double computePayment(
            double loanAmt, // сумма кредита
            double rate, // процентная ставка
            double futureValue, // будущая стоимость
            int numPeriods) { // кол-во периодов

        double interest = rate/100.0;
        double partial1 = Math.pow((1 + interest),
                - numPeriods);
        double denominator = (1 - partial1) / interest;
        double answer = (-loanAmt / denominator) - (
                (futureValue * partial1) / denominator);
        return answer;
    }
}
/**
 * Этот метод имеет четыре параметра. Первые три - числа
 * с плавающей запятой двойной точности, а четвертое -
 * целое число. Параметры используются в теле метода и
 * во время выполнения будут принимать значения передаваемых
 * аргументов.
 * Параметры относятся к списку переменных в объявлении
 * метода. Аргументы - это фактические значения, которые
 * передаются при вызове метода. Когда вызываете метод,
 * используемые аргументы должны соответствовать параметрам
 * объявления в типе и порядке.
 * ----------Типы параметров------------------------------------
 * Вы можете использовать любой тип данных для параметра
 * метода или конструктора. Это включает в себя примитивные
 * типы данных, такие как double, float и integer и ссылочные
 * типы данных, такие как объекты и массивы.
 * Вот пример метода, который принимает массив в качестве
 * аргумента. В этом примере метод создает новый объект
 * Polygon и инициализирует его из массива объектов Point
 * (предположим, что Point является классом, представляющим
 * координаты x, y):
     * public Polygon polygonFrom(Point[] corners) {
     *     // method body goes here
     * }
 * Если вы хотите передать метод в метод, используйте
 * лямбда-выражение или ссылку на метод.
 * -------Произвольное количество аргументов-------------
 *          (Arbitrary Number of Arguments)
 * Вы можете использовать конструкцию varargs для передачи
 * произвольного числа значений в метод. Вы используете varargs,
 * когда не знаете, сколько аргументов определенного типа
 * будет передано методу. Это ярлык для создания массива вручную
 * (предыдущий метод мог использовать varargs, а не массив).
 * Чтобы использовать varargs, тип последнего параметра следует
 * за многоточием (три точки, ...), затем пробелом и именем
 * параметра. Затем метод может быть вызван с любым номером
 * этого параметра, включая ни одного.
 *
     * public Polygon polygonFrom(Point... corners) {
     *     int numberOfSides = corners.length;
     *     double squareOfSide1, lengthOfSide1;
     *     squareOfSide1 = (corners[1].x - corners[0].x)
     *             * (corners[1].x - corners[0].x)
     *             + (corners[1].y - corners[0].y)
     *             * (corners[1].y - corners[0].y);
     *     lengthOfSide1 = Math.sqrt(squareOfSide1);
     *   // Далее следует код тела метода, который создает
 *       // и возвращает многоугольник, соединяющий точки
 *     }
 * Можно увидеть, что внутри метода углы обрабатываются как
 * массив. Метод может быть вызван либо с массивом, либо с
 * последовательностью аргументов. Код в теле метода будет
 * обрабатывать параметр как массив в любом случае.
 * Вы будете чаще всего видеть varargs с методами печати;
 * например, этот метод printf:
 *  public PrintStream printf(String format, Object... args)
 * позволяет печатать произвольное количество объектов. Это
 * можно назвать так:
 *  System.out.printf("%s: %d, %s%n", name, idnum, address);
 * или как это:
 *  System.out.printf("%s: %d, %s, %s, %s%n", name,
 *                      idnum, address, phone, email);
 * или с еще другим количеством аргументов.
 * Еще один пример:
 */
class VarArgs { // Демонстр varargs в java
    // Метод vaTest() допускает переменное число аргументов.
    // Происходит неявное создание массива
    static void vaTest(int ... v) {

        System.out.println("Numb argum: " + v.length);
        System.out.println("Exist: ");

        for(int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // Метод vaTest() может вызываться с переменным числом
        // аргументов
        vaTest(1);        // 1 аргумент
        vaTest(1, 2, 3);  // 3 аргумента
        vaTest();         // без аргументов
    }
}
/**
 * -----------------Имена параметров------------------------
 * Когда вы объявляете параметр в методе или конструкторе,
 * вы указываете имя этого параметра. Это имя используется
 * в теле метода для ссылки на переданный аргумент.
 * Имя параметра должно быть уникальным в своей области
 * видимости. Оно не может совпадать с именем другого параметра
 * для того же метода или конструктора и не может быть именем
 * локальной переменной в методе или конструкторе.
 * Параметр может иметь то же имя, что и одно из полей класса.
 * Если это так, говорят, что параметр затеняет поле. Затенение
 * полей может затруднить чтение кода и обычно используется
 * только внутри конструкторов и методов, которые устанавливают
 * определенное поле. Например, класс Circle и его метод setOrigin:
     *  public class Circle {
     *     private int x, y, radius;
     *     public void setOrigin(int x, int y) {
     *         ...
     *     }
     * }
 * Класс Circle имеет три поля: x, y и radius. Метод setOrigin()
 * имеет два параметра, каждый из которых имеет то же имя,
 * что и одно из полей. Каждый параметр метода затеняет поле,
 * которое делит с ним свое имя. Таким образом, использование
 * простых имен x или y в теле метода относится к параметру,
 * а не к полю (класса). Чтобы получить доступ к полю, надо
 * использовать полное имя.
 * -----Передача аргументов примитивного типа данных------------
 * Примитивные аргументы, такие как int или double, передаются в
 * методы по значению. Это означает, что любые изменения
 * значений параметров существуют только в рамках метода.
 * Когда метод возвращается, параметры исчезают и любые
 * изменения в них теряются.
 */
class PassPrimitiveByValue {

    public static void main(String[] args) {

        int x = 3;

        passMethod(x);

        // print x to see if its value has changed
        System.out.println("After invoking passMethod, x = " + x);
    }
    // change parameter in passMethod()
    public static void passMethod(int p) {
        p = 10;
    }
}// >>> After invoking passMethod, x = 3
/**
 * ------Передача аргументов ссылочных типов данных-----------
 * Параметры ссылочного типа данных, такие как объекты,
 * также передаются в методы по значению. Это означает,
 * что когда метод возвращается, переданная ссылка все еще
 * ссылается на тот же объект, что и раньше. Однако значения
 * полей объекта могут быть изменены в методе, если они
 * имеют надлежащий уровень доступа.
     *  public void moveCircle(Circle circle, int deltaX,
 *                              int deltaY) {
     *     // код для перемещения начала круга в x+deltaX, y+deltaY
     *     circle.setX(circle.getX() + deltaX);
     *     circle.setY(circle.getY() + deltaY);
     *
     *     // код для назначения новой ссылки на круг
     *     circle = new Circle(0, 0);
     * }
 * Пусть метод будет вызван с этими аргументами:
 *      moveCircle(myCircle, 23, 56)
 * Внутри метода circle изначально ссылается на myCircle.
 * Метод изменяет координаты x и y объекта, на который
 * ссылается circle (то есть myCircle), на 23 и 56 соответственно.
 * Эти изменения сохранятся, когда метод вернется. Тогда
 * circle присваивается ссылка на новый объект Circle
 * с  x = y = 0. Однако это переназначение не имеет постоянства,
 * поскольку ссылка была передана по значению и не может
 * быть изменена. Внутри метода объект, на который указывает
 * circle изменился, но, когда метод возвращается, myCircle
 * по-прежнему ссылается на тот же объект Circle, что и
 * до вызова метода.
 *
 *
 */



