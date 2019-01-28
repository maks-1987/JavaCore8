package _2_LanguageBasic.ControlFlowStatem;

/**
 * Оператор while непрерывно выполняет блок операторов, в то
 * время как определенное условие выполняется.
 * Оператор while вычисляет выражение, которое должно возвращать
 * логическое значение. Если выражение имеет значение true,
 * оператор while выполняет оператор(ы) в блоке while. Оператор
 * while продолжает тестировать выражение и выполнять его
 * блок, пока выражение не станет ложным. Использование оператора
 * while для вывода значений от 1 до 10 может быть выполнено,
 * как в следующей программе WhileDemo:
 */
public class WhileDoWholeStatements {
}

class WhileDemo {
    public static void main(String[] args){
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}
/**
 * Можно реализовать бесконечный цикл, используя оператор while
 * следующим образом:
     * while (true){
     *     // your code goes here
     * }
 * Java также предоставляет оператор do-while, который может
 * быть выражен следующим образом:
     * do {
     *      statement(s)
     * } while (expression);
     *
 * Разница между do-while и while заключается в том, что
 * do-while оценивает выражение в нижней части цикла, а не
 * в верхней части. Поэтому операторы внутри блока do всегда
 * выполняются как минимум один раз:
 */
class DoWhileDemo {
    public static void main(String[] args){
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}



