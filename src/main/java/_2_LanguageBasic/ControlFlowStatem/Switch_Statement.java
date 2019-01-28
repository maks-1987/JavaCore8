package _2_LanguageBasic.ControlFlowStatem;

/**
 * В отличие от операторов if-then и if-then-else, оператор
 * switch может иметь несколько возможных путей выполнения.
 * Переключатель работает с примитивными типами данных byte,
 * short, char и int. Он также работает с перечисляемыми
 * типами (обсуждаемыми в типах Enum), классом String и несколькими
 * специальными классами, которые обертывают определенные
 * примитивные типы: Character, Byte, Short и Integer (обсуждаемые
 * в Numbers and Strings).
 * В следующем примере кода, SwitchDemo, объявляется int с
 * именем month, значение которого представляет месяц. Код
 * отображает название месяца на основе значения месяца с
 * помощью оператора switch.
 */
public class Switch_Statement {
}

class SwitchDemo {
    public static void main(String[] args) {

        int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);
    }
} //  August
/**
 * Тело оператора switch называется блоком switch. Оператор
 * в блоке switch может быть помечен одной или несколькими
 * метками case или default. Оператор switch оценивает свое
 * выражение, а затем выполняет все операторы, которые следуют
 * за соответствующей меткой регистра.
 * Также можно отобразить название месяца с помощью операторов
     * if-then-else:
     * int month = 8;
     * if (month == 1) {
     *     System.out.println("January");
     * } else if (month == 2) {
     *     System.out.println("February");
     * }
     * ...  // and so on
 * Решение о том, использовать ли операторы if-then-else
 * или оператор switch, зависит от читабельности и выражения,
 * которое проверяет оператор. Оператор if-then-else может
 * проверять выражения на основе диапазонов значений или условий,
 * тогда как оператор switch проверяет выражения, основанные
 * только на единственном целом числе, перечисляемом значении
 * или объекте String.
 * Еще один интересный момент - это заявление о перерыве.
 * Каждый оператор break завершает вмещающий оператор switch.
 * Поток управления продолжается с первого оператора, следующего
 * за блоком переключателей. Операторы break необходимы,
 * потому что без них операторы в блоках переключателей не
 * работают: все операторы после соответствующей метки регистра
 * выполняются последовательно, независимо от выражения последующих
 * меток регистра, до тех пор, пока не встретится оператор
 * break. Программа SwitchDemoFallThrough показывает операторы
 * в блоке переключателя, которые проваливаются. Программа
 * отображает месяц, соответствующий целочисленному месяцу,
 * и месяцы, следующие за годом:
 */
class SwitchDemoFallThrough {

    public static void main(String[] args) {
        java.util.ArrayList<String> futureMonths =
                new java.util.ArrayList<String>();

        int month = 8;

        switch (month) {
            case 1:  futureMonths.add("January");
            case 2:  futureMonths.add("February");
            case 3:  futureMonths.add("March");
            case 4:  futureMonths.add("April");
            case 5:  futureMonths.add("May");
            case 6:  futureMonths.add("June");
            case 7:  futureMonths.add("July");
            case 8:  futureMonths.add("August");
            case 9:  futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                    break;
            default: break;
        }
        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
                System.out.println(monthName);
            }
        }
    }
} /*    August
        September
        October
        November
        December  */
/**
 * Технически, окончательный break не требуется, потому
 * что поток выпадает из оператора switch. Рекомендуется
 * использовать break, чтобы изменение кода было проще и
 * менее подвержено ошибкам. Раздел default обрабатывает
 * все значения, которые явно не обрабатываются одним из
 * разделов case.
 * В следующем примере кода, SwitchDemo2, показано, как
 * оператор может иметь (multiple case labels) несколько
 * меток регистра. Пример кода вычисляет количество дней
 * в конкретном месяце:
 */
class SwitchDemo2 {
    public static void main(String[] args) {

        int month = 2;
        int year = 2000;
        int numDays = 0;

        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = "
                + numDays);
    }
} // Number of Days = 29
/**
 * В Java SE 7 и более поздних версиях можно использовать
 * объект String в выражении оператора switch. В следующем
 * примере кода, StringSwitchDemo, отображается номер месяца
 * на основе значения строки с именем month:
 */
class StringSwitchDemo {

    private static int getMonthNumber(String month) {

        int monthNumber = 0;

        if (month == null) {
            return monthNumber;
        }

        switch (month.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default:
                monthNumber = 0;
                break;
        }

        return monthNumber;
    }
    public static void main(String[] args) {

        String month = "August";

        int returnedMonthNumber =
                StringSwitchDemo.getMonthNumber(month);

        if (returnedMonthNumber == 0) {
            System.out.println("Invalid month");
        } else {
            System.out.println(returnedMonthNumber);
        }
    }
} // The output from this code is 8.
/**
 * String в выражении switch сравнивается с выражениями,
 * связанными с каждой меткой case, как если бы использовался
 * метод String.equals. Чтобы пример StringSwitchDemo мог
 * принимать любой месяц независимо от регистра, месяц
 * конвертируется в нижний регистр (с помощью метода toLowerCase),
 * а все строки, связанные с метками регистра, - в нижнем
 * регистре.
 * Примечание. В этом примере проверяется, является ли выражение
 * в операторе switch нулевым. Убедитесь, что выражение в
 * любом операторе switch не является нулевым, чтобы предотвратить
 * появление исключения NullPointerException.
 */


