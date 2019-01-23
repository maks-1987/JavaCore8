package _2_LanguageBasic.Operators;

/**
 * The Simple Assignment Operator (Оператор простого присваивания)
 * '=' - он присваивает значение справа от операнда слева.
 *      int cadence = 0;
 *      int speed = 0;
 * Этот оператор также можно использовать для объектов для
 * назначения ссылок на объекты.
 * ------------------------------------------------------------
 * The Arithmetic Operators
 * Java предоставляет операторы, которые выполняют сложение,
 * вычитание, умножение и деление. Единственный символ, который
 * может показаться вам новым, - это «%», который делит один
 * операнд на другой и возвращает остаток в качестве результата.
 * Можно также комбинировать арифметические операторы с простым
 * оператором присваивания для создания составных присваиваний.
 * Например, х += 1; и х = х+1; оба увеличивают значение х на 1.
 * Оператор '+' также можно использовать для объединения
 * (присоединения) двух строк, как показано в следующей программе
 * ConcatDemo:
 */
public class ArithmetUnaryAssignOperators {
}

class ConcatDemo {
    public static void main(String[] args){
        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString+secondString;
        System.out.println(thirdString);
    }
}
/**
 * К концу этой программы переменная thirdString содержит
 * «Это конкатенированная строка.», Которая выводится на
 * стандартный вывод.
 * ----------------------------------------------------------
 * The Unary Operators
 * +	Унарный плюс оператор; указывает на положительное
 *      значение (однако числа без этого положительные)
 * -	Унарный минус оператор; отрицает выражение
 * ++	Оператор приращения; увеличивает значение на 1
 * --	Оператор декремента; уменьшить значение на 1
 * !	Оператор логического дополнения; инвертирует
 *      значение логического
 */
class UnaryDemo {

    public static void main(String[] args) {

        int result = +1;
        // result is now 1
        System.out.println(result);

        result--;
        // result is now 0
        System.out.println(result);

        result++;
        // result is now 1
        System.out.println(result);

        result = -result;
        // result is now -1
        System.out.println(result);

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);
    }
}
/**
 * Операторы increment/decrement могут применяться до (prefix)
 * или после (postfix) операнда. Код result++; и ++result;
 * будет оба результата в результате увеличения на единицу.
 * Единственное отличие состоит в том, что версия префикса
 * (++result) оценивается в увеличенное значение, тогда как
 * версия постфикса (result++) оценивается в исходное значение.
 * Если вы просто выполняете простое increment/decrement, не
 * имеет значения, какую версию вы выберете. Но если вы используете
 * этот оператор в части большего выражения, то тот, который
 * вы выберете, может существенно изменить ситуацию.
 * Следующая программа PrePostDemo иллюстрирует унарный оператор
 * префикса/постфикса:
 */
class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        i++;
        // prints 4
        System.out.println(i);
        ++i;
        // prints 5
        System.out.println(i);
        // prints 6
        System.out.println(++i);
        // prints 6
        System.out.println(i++);
        // prints 7
        System.out.println(i);
    }
}
/**
 * -----------------------------------------------------------
 * Equality, Relational, and Conditional Operators
 * (Равенство, реляционные и условные операторы)
 * Операторы равенства и отношения определяют, является ли
 * один операнд больше, меньше, равен или не равен другому
 * операнду. Надо использовать "==", а не "=", при тестировании,
 * если два примитивных значения равны.
     * ==      equal to
     * !=      not equal to
     * >       greater than
     * >=      greater than or equal to
     * <       less than
     * <=      less than or equal to
 */

class ComparisonDemo {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");
    }
}/*     value1 != value2
        value1 <  value2
        value1 <= value2 */
/**
 * && и || операторы выполняют операции «Условное И» и «Условное
 * ИЛИ» над двумя логическими выражениями. Эти операторы
 * демонстрируют поведение «короткого замыкания», что означает,
 * что второй операнд оценивается только при необходимости.
 */
class ConditionalDemo1 {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");
    }
}
/**
 * Другим условным оператором является?:, Который можно
 * рассматривать как сокращение для оператора if-then-else.
 * Этот оператор также известен как троичный оператор, потому
 * что он использует три операнда. В следующем примере этот
 * оператор должен читаться как: «Если someCondition имеет
 * значение true, присвойте значение value1 результату.
 * В противном случае присвойте значение value2 результату».
 */

class ConditionalDemo2 {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;

        System.out.println(result);
    }
}
/**
 *   Поскольку someCondition имеет значение true, эта программа
 * выводит «1» на экран. Используйте оператор?: Вместо оператора
 * if-then-else, если он делает ваш код более читабельным;
 * например, когда выражения компактны и не имеют побочных
 * эффектов (таких как присваивания).
 * ----------------------------------------------------------------
 * The Type Comparison Operator instanceof
 * Оператор instanceof сравнивает объект с указанным типом.
 * Вы можете использовать его, чтобы проверить, является
 * ли объект экземпляром класса, экземпляром подкласса или
 * экземпляром класса, который реализует определенный интерфейс.
 * Следующая программа, InstanceofDemo, определяет родительский
 * класс (с именем Parent), простой интерфейс (с именем MyInterface)
 * и дочерний класс (с именем Child), который наследуется
 * от родительского и реализует интерфейс.
 */
class InstanceofDemo {
    public static void main(String[] args) {

        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        System.out.println("obj1 instanceof Parent: "
                + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: "
                + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: "
                + (obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parent: "
                + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: "
                + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: "
                + (obj2 instanceof MyInterface));
    }
}

class Parent {}
class Child extends Parent implements MyInterface {}
interface MyInterface {}
    /*  obj1 instanceof Parent: true
        obj1 instanceof Child: false
        obj1 instanceof MyInterface: false
        obj2 instanceof Parent: true
        obj2 instanceof Child: true
        obj2 instanceof MyInterface: true    */
/**
 * При использовании оператора instanceof помните, что
 * null не является экземпляром чего-либо.
 * ------------------------------------------------------------
 * Битовые и битовые операторы сдвига
 * Java также предоставляет операторы, которые выполняют
 * побитовые и битовые операции над целочисленными типами.
 * Унарный оператор побитового дополнения "~" инвертирует
 * битовую комбинацию; это может быть применено к любому
 * из целочисленных типов, делая каждый «0» «1» и каждый
 * «1» «0». Например, байт содержит 8 битов; применение этого
 * оператора к значению, чей битовый шаблон равен «00000000»,
 * изменит его шаблон на «11111111».
 * Оператор сдвига влево со знаком «<<» сдвигает битовую
 * комбинацию влево, а оператор сдвига влево со знаком «>>»
 * сдвигает битовую комбинацию вправо. Битовая комбинация
 * задается левым операндом, а число позиций для смещения -
 * правым операндом. Оператор смещения вправо без знака
 * «>>>» смещает ноль в крайнее левое положение, а крайнее
 * левое положение после «>>» зависит от расширения знака.
 * Побитовый оператор & выполняет побитовую операцию И.
 * Побитовый оператор ^ выполняет побитовую исключающую
 * операцию ИЛИ.
 * Побитовой | Оператор выполняет побитовую операцию ИЛИ.
 * Следующая программа, BitDemo, использует побитовый оператор
 * AND для вывода числа «2» на стандартный вывод.
 */
class BitDemo {
    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        System.out.println(val & bitmask);
    }
}
