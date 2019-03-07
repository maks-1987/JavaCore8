package _3_ClassesAndObjects.MoreOnClasses;

/**
 * Вы часто можете указать начальное значение для поля в его
 * объявлении:
     * public class BedAndBreakfast {
     *
     *     // initialize to 10
     *     public static int capacity = 10;
     *
     *     // initialize to false
     *     private boolean full = false;
     * }
 * Это хорошо работает, когда значение инициализации доступно,
 * и инициализация может быть помещена в одну строку. Однако
 * эта форма инициализации имеет ограничения из-за своей простоты.
 * Если для инициализации требуется некоторая логика (например,
 * обработка ошибок или цикл for для заполнения сложного массива),
 * простого присваивания недостаточно. Переменные экземпляра
 * можно инициализировать в конструкторах, где можно использовать
 * обработку ошибок или другую логику. Чтобы обеспечить такую
 * же возможность для переменных класса, язык программирования
 * Java включает в себя статические блоки инициализации.
 *   Примечание. Нет необходимости объявлять поля в начале
 *   определения класса, хотя это наиболее распространенная
 *   практика. Необходимо только, чтобы они были объявлены
 *   и инициализированы перед использованием.
 * -------------- Статические блоки инициализации -----------------
 * Блок статической инициализации - это обычный блок кода,
 * заключенный в фигурные скобки {} и перед которым стоит
 * ключевое слово static. Вот пример:
     * static {
     *   // любой код, необходимый для инициализации, идет сюда
     * }
 * Класс может иметь любое количество статических блоков
 * инициализации, и они могут появляться в любом месте тела
 * класса. Система времени выполнения гарантирует, что статические
 * блоки инициализации вызываются в том порядке, в котором
 * они появляются в исходном коде.
 * Есть альтернатива статическим блокам - вы можете написать
 * приватный статический метод:
     * class Whatever {
     *    public static varType myVar = initializeClassVariable();
     *
     *    private static varType initializeClassVariable() {
     *        //код инициализации идет здесь
     *    }
     * }
 * Преимущество приватных статических методов заключается
 * в том, что они могут быть повторно использованы позже,
 * если вам нужно повторно инициализировать переменную класса.
 * ------------- Инициализация членов экземпляра --------------
 * Обычно код для инициализации переменной экземпляра помещается
 * в конструкторе. Существует две альтернативы использованию
 * конструктора для инициализации переменных экземпляра:
 * блоки инициализатора и финальные методы.
 * Блоки инициализатора для переменных экземпляра выглядят
 * как статические блоки инициализатора, но без ключевого
 * слова static:
     * {
     *    // whatever code is needed for initialization goes here
     * }
 * Компилятор Java копирует блоки инициализатора в каждый
 * конструктор. Следовательно, этот подход можно использовать
 * для совместного использования блока кода между несколькими
 * конструкторами.
 * Последний метод не может быть переопределен в подклассе.
 * Это обсуждается в уроке об интерфейсах и наследовании.
 * Вот пример использования финального метода для инициализации
 * переменной экземпляра:
     * class Whatever {
     *    private varType myVar = initializeInstanceVariable();
     *
     *    protected final varType initializeInstanceVariable() {
     *
     *        // initialization code goes here
     *     }
     * }
 * Это особенно полезно, если подклассы могут захотеть повторно
 * использовать метод инициализации. Метод является окончательным,
 * потому что вызов не финальных методов во время инициализации
 * экземпляра может вызвать проблемы.
 */
public class InitializingFields {
}
