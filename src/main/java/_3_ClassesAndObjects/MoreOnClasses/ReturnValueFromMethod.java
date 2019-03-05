package _3_ClassesAndObjects.MoreOnClasses;

/**
 * Метод возвращает код, который его вызвал, когда:
     * завершает все утверждения в методе,
     * достигает возврата (return), или
     * выдает исключение, что произойдет первым.
 * Вы объявляете тип возвращаемого значения метода в объявлении
 * метода. В теле метода используете оператор return для
 * возврата значения.
 * Любой метод объявленный как void не возвращает значение.
 * Он не должен содержать оператор возврата, но он может
 * это сделать. В таком случае оператор return может использоваться
 * для перехода из блока потока управления и выхода из метода
 * и просто используется следующим образом:
 *      return;
 * Если попытаться вернуть значение из метода, который объявлен
 * как void, вы получите ошибку компилятора.
 * Любой метод, который не объявлен как void, должен содержать
 * инструкцию return с соответствующим возвращаемым значением,
 * например так:
 *      return returnValue;
 * Тип данных возвращаемого значения должен соответствовать
 * объявленному типу возврата метода; вы не можете вернуть
 * целочисленное значение из метода, объявленного для возврата
 * логического значения.
 * Метод getArea() в классе Rectangle, который обсуждался в
 * разделах об объектах, возвращает целое число:
 *     //метод для вычисления площади прямоугольника
 *     public int getArea() {
 *         return width * height;
 *     }
 * Этот метод возвращает целое число, для которого вычисляется
 * выражение width * height.
 * Метод getArea возвращает тип примитива. Метод также может
 * возвращать ссылочный тип. Например, в программе для
 * манипулирования объектами Bicycle у нас может быть такой
 * метод:
 *
 * public Bicycle seeWhosFastest(Bicycle myBike, Bicycle yourBike,
 *                               Environment env) {
 *     Bicycle fastest;
 *     // code to calculate which bike is
 *     // faster, given each bike's gear
 *     // and cadence and given the
 *     // environment (terrain and wind)
 *     return fastest;
 * }
 * ----------Возвращение класса или интерфейса------------
 * Когда метод использует имя класса в качестве возвращаемого
 * типа, как, например, whosFastest, класс возвращаемого объекта
 * должен быть либо подклассом, либо точным классом возвращаемого
 * типа. Предположим, что у вас есть иерархия классов, в которой
 * ImaginaryNumber является подклассом java.lang.Number, который,
 * в свою очередь, является подклассом Object, как показано на
 * следующем рисунке.
 *              |Object|
 *               ------
 *                  |
 *              |Number|
 *               ------
 *                  |
 *          |ImaginaryNumber|
 *           ---------------
 * Теперь предположим, что есть метод, объявленный для возврата
 * числа:
         * public Number returnANumber() {
         *     ...
         * }
 * Метод returnANumber может возвращать ImaginaryNumber, но
 * не Object. ImaginaryNumber - это Number, потому что это подкласс
 * Number. Однако объект не обязательно является числом - это
 * может быть строка или другой тип.
 *  Вы можете переопределить метод и определить его для возврата
 *  подкласса исходного метода, например так:
         *  public ImaginaryNumber returnANumber() {
         *     ...
         * }
 * Этот метод, называемый ковариантным типом возврата, означает,
 * что тип возвращаемого значения может изменяться в том же
 * направлении, что и подкласс.
 *    Примечание. Вы также можете использовать имена интерфейсов
 *    в качестве типов возврата. В этом случае возвращаемый объект
 *    должен реализовывать указанный интерфейс.
 *
 * ======     ковариантный тип возврата     ======
 *      (дополнить эту тему!!!!!!)
 *
 *
 */
public class ReturnValueFromMethod {
}
