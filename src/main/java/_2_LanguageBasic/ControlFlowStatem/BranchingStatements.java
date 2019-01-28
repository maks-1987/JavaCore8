package _2_LanguageBasic.ControlFlowStatem;

/**
 * Оператор break имеет две формы: помеченный и немаркированный.
 * Можно использовать break без метки для завершения цикла
 * for, while или do-while, как показано в следующей программе:
 */
public class BranchingStatements {
}

class BreakDemo {
    public static void main(String[] args) {

        int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076,
                            2000, 8, 622, 127 };
        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }
        if (foundIt) {
            System.out.println("Found " + searchfor +
                    " at index " + i);
        } else {
            System.out.println(searchfor +
                    " not in the array");
        }
    }
} // Found 12 at index 4
/**
 * Оператор без метки прерывает самый внутренний switch, for,
 * while или do-while, но помеченный break завершает инструкцию
 * незамедлтьельно.
 * Следующая программа, использует вложенные циклы for для
 * поиска значения в двумерном массиве. Когда значение найдено,
 * помеченный break завершает внешний цикл for (помеченный как «поиск»):
 */

class BreakWithLabelDemo {
    public static void main(String[] args) {

        int[][] arrayOfInts = {
                { 32, 87, 3, 589 },
                { 12, 1076, 2000, 8 },
                { 622, 127, 77, 955 }
        };
        int searchfor = 12;

        int i;
        int j = 0;
        boolean foundIt = false;

        search:
        for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length;
                 j++) {
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break search;
                }
            }
        }
        if (foundIt) {
            System.out.println("Found " + searchfor + " at " + i + ", " + j);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
} // Found 12 at 1, 0
/**
 * Оператор break завершает помеченный оператор; он не передает
 * поток управления. Поток управления переносится в оператор
 * сразу после помеченного (прекращенного) оператора.
 * -------------------------------------------------------------
 * Оператор continue пропускает текущую итерацию цикла for,
 * while или do-while. Немеченая форма пропускается до конца
 * тела самого внутреннего цикла и оценивает логическое выражение,
 * которое управляет циклом. Следующая программа проходит
 * через строку, считая вхождения буквы «p». Если текущий
 * символ не является p, оператор continue пропускает остаток
 * цикла и переходит к следующему символу. Если это «р»,
 * программа увеличивает количество букв.
 */
class ContinueDemo {
    public static void main(String[] args) {

        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;
            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
}// Found 9 p's in the string.
/**
 * Помеченный оператор continue пропускает текущую итерацию
 * внешнего цикла, помеченного данной меткой. В следующем
 * примере программы ContinueWithLabelDemo использует вложенные
 * циклы для поиска подстроки в другой строке. Требуются
 * два вложенных цикла: один для итерации по подстроке
 * и один для итерации по искомой строке. Следующая программа
 * использует помеченную форму continue, чтобы пропустить
 * итерацию во внешнем цикле.
 */
class ContinueWithLabelDemo {
    public static void main(String[] args) {

        String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;

        int max = searchMe.length() -
                substring.length();
        test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
            }
            foundIt = true;
            break test;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
}// Found it
/**
 * Последний из операторов ветвления является оператором
 * return. Оператор return выходит из текущего метода, а
 * поток управления возвращается туда, где был вызван метод.
 * Оператор return имеет две формы: одна возвращает значение,
 * а другая - нет. Чтобы вернуть значение, просто поместите
 * значение (или выражение, которое вычисляет значение)
 * после ключевого слова return.
 *      return ++count;
 * Тип данных возвращаемого значения должен соответствовать
 * типу объявленного возвращаемого значения метода. Когда
 * метод объявлен как void, используйте форму возврата,
 * которая не возвращает значение.
 *      return;
 */
