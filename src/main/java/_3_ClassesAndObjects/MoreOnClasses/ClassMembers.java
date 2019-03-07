package _3_ClassesAndObjects.MoreOnClasses;

/**
 * В этом разделе обсуждается использование ключевого слова
 * static для создания полей и методов, которые принадлежат
 * классу, а не экземпляру класса.
 * ------------- Переменные класса -------------------------
 * Когда несколько объектов создаются из одного и того же
 * проекта класса, каждый из них имеет свои собственные отдельные
 * копии переменных экземпляра. В случае класса Bicycle переменными
 * экземпляра являются cadence, gear, и speed. Каждый объект
 * Bicycle имеет свои собственные значения для этих переменных,
 * которые хранятся в разных местах памяти.
 *   Иногда нужно иметь переменные, которые являются общими
 * для всех объектов. Это достигается с помощью статического
 * модификатора. Поля, которые имеют модификатор static в своем
 * объявлении, называются статическими полями или переменными
 * класса. Они связаны с классом, а не с любым объектом. Каждый
 * экземпляр класса разделяет переменную класса, которая находится
 * в одном фиксированном месте в памяти. Любой объект может
 * изменить значение переменной класса, но с переменными класса
 * также можно манипулировать, не создавая экземпляр класса.
 *   Например, вы хотите создать несколько объектов Bicycle
 * и назначить каждому серийный номер, начиная с 1 для первого
 * объекта. Этот идентификационный номер уникален для каждого
 * объекта и поэтому является переменной экземпляра. В то
 * же время необходимо поле для отслеживания того, сколько
 * объектов Bicycle было создано, чтобы вы знали, какой идентификатор
 * назначить следующему. Такое поле относится не к какому-либо
 * отдельному объекту, а к классу в целом. Для этого понадобится
 * переменная класса numberOfBicycles следующим образом:
     * public class Bicycle {
     *
     *     private int cadence;
     *     private int gear;
     *     private int speed;
     *
     *     // добавить переменную экземпляра для идентификатора объекта
     *     private int id;
     *
     *     // добавить переменную класса для
     *     // количества созданных объектов Bicycle
     *     private static int numberOfBicycles = 0;
     *         ...
     * }
 * На переменные класса ссылается само имя класса, как в
 *          Bicycle.numberOfBicycles
 * Это дает понять, что они являются переменными класса.
 *   Примечание. Вы также можете ссылаться на статические
 *   поля с помощью ссылки на объект, например
 *          myBike.numberOfBicycles
 *   но это не рекомендуется, потому что это не дает понять,
 *   что они являются переменными класса.
 * Вы можете использовать конструктор Bicycle, чтобы установить
 * переменную экземпляра id и увеличить значение переменной
 * numberOfBicycles:
     * public class Bicycle {
     *
     *     private int cadence;
     *     private int gear;
     *     private int speed;
     *     private int id;
     *     private static int numberOfBicycles = 0;
     *
     *     public Bicycle(int startCadence, int startSpeed,
     *                    int startGear) {
     *         gear = startGear;
     *         cadence = startCadence;
     *         speed = startSpeed;
     *
     *         // увеличить количество Bicycles
     *         // и присваиваем идентификационный номер
     *         id = ++numberOfBicycles;
     *     }
     *
     *     // новый метод для возврата переменной
     *     //экземпляра идентификатора
     *     public int getID() {
     *         return id;
     *     }
     *         ...
     * }
 * ----------------- Методы класса -----------------------
 * Язык Java поддерживает статические методы, а также статические
 * переменные. Статические методы, которые имеют модификатор
 * static в своих объявлениях, должны вызываться с именем
 * класса, без необходимости создания экземпляра класса, как в
 *      ClassName.methodName(args)
 *   Примечание: вы также можете ссылаться на статические
 *   методы с помощью ссылки на объект, такой как
 *          instanceName.methodName(args)
 *   но это не рекомендуется, потому что это не дает понять,
 *   что они являются классовыми методами.
 * Обычное использование статических методов - доступ к статическим
 * полям. Например, мы могли бы добавить статический метод
 * в класс Bicycle для доступа к статическому полю numberOfBicycles:
     * public static int getNumberOfBicycles() {
     *     return numberOfBicycles;
     * }
 * Разрешены не все комбинации переменных и методов экземпляра
 * и класса:
 * - Методы экземпляра могут напрямую обращаться к переменным
 *   экземпляра и методам экземпляра.
 * - Методы экземпляра могут напрямую обращаться к переменным
 *   класса и методам класса.
 * - Методы класса могут обращаться к переменным класса и
 *   методам класса напрямую.
 * - Методы класса не могут обращаться к переменным экземпляра
 *   или методам экземпляра напрямую - они должны использовать
 *   ссылку на объект. Кроме того, методы класса не могут
 *   использовать ключевое слово this, так как для this
 *   нет экземпляра.
 *
 * ------------------- Константы --------------------------
 * Модификатор static в сочетании с модификатором final также
 * используется для определения констант. Последний модификатор
 * указывает, что значение этого поля не может измениться.
 * Например, следующее объявление переменной определяет константу
 * с именем PI, значение которой является приближением к
 * pi (отношение длины окружности к ее диаметру):
 *      static final double PI = 3.141592653589793;
 * Определенные таким образом константы не могут быть переназначены,
 * и это является ошибкой во время компиляции, если ваша программа
 * пытается это сделать. По договоренности имена постоянных
 * значений пишутся заглавными буквами. Если имя состоит из
 * более чем одного слова, слова разделяются подчеркиванием
 * (_).
 *   Примечание. Если примитивный тип или строка определены
 *   как константа, а значение известно во время компиляции,
 *   компилятор заменяет имя константы в любом месте кода
 *   на его значение. Это называется "константой времени
 *   компиляции". Если значение константы во внешнем мире
 *   изменяется (например, если законодательно установлено,
 *   что pi на самом деле должно быть 3,975), вам нужно будет
 *   перекомпилировать любые классы, которые используют эту
 *   константу, чтобы получить текущее значение.
 *
 * ------------- The Bicycle Class ---------------------------
 * После всех модификаций, сделанных в этом разделе, класс
 * Bicycle теперь:
 *
 * public class Bicycle {
 *
 *     private int cadence;
 *     private int gear;
 *     private int speed;
 *
 *     private int id;
 *
 *     private static int numberOfBicycles = 0;
 *
 *
 *     public Bicycle(int startCadence,
 *                    int startSpeed,
 *                    int startGear) {
 *         gear = startGear;
 *         cadence = startCadence;
 *         speed = startSpeed;
 *
 *         id = ++numberOfBicycles;
 *     }
 *
 *     public int getID() {
 *         return id;
 *     }
 *
 *     public static int getNumberOfBicycles() {
 *         return numberOfBicycles;
 *     }
 *
 *     public int getCadence() {
 *         return cadence;
 *     }
 *
 *     public void setCadence(int newValue) {
 *         cadence = newValue;
 *     }
 *
 *     public int getGear(){
 *         return gear;
 *     }
 *
 *     public void setGear(int newValue) {
 *         gear = newValue;
 *     }
 *
 *     public int getSpeed() {
 *         return speed;
 *     }
 *
 *     public void applyBrake(int decrement) {
 *         speed -= decrement;
 *     }
 *
 *     public void speedUp(int increment) {
 *         speed += increment;
 *     }
 * }
 */
public class ClassMembers {
}
