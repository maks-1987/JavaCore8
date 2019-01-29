package _2_LanguageBasic.Variables;

/**
 * В языке программирования Java используются термины «поле»
 * и «переменная». Язык программирования Java определяет следующие
 * виды переменных:
 * - Instance Variables (Non-Static Fields)
 * - Class Variables (Static Fields)
 * - Local Variables
 * - Parameters
 *  Переменные экземпляра - Технически говоря, объекты хранят свои
 * отдельные состояния в «нестатических полях», то есть в
 * полях, объявленных без ключевого слова static. Нестатические
 * поля также известны как переменные экземпляра, потому что их
 * значения уникальны для каждого экземпляра класса (другими
 * словами, для каждого объекта); текущая скорость одного велосипеда
 * не зависит от текущей скорости другого.
 *  Переменные класса - Переменная класса - это любое поле,
 * объявленное с модификатором static; это говорит компилятору,
 * что существует ровно одна копия этой переменной, независимо
 * от того, сколько раз был создан экземпляр класса. Поле,
 * определяющее количество передач для конкретного вида велосипеда,
 * может быть помечено как статическое, поскольку концептуально
 * одинаковое количество передач будет применяться ко всем экземплярам.
 * Код статический int numGears = 6; создаст такое статическое
 * поле. Кроме того, можно добавить ключевое слово final, чтобы
 * указать, что число передач никогда не изменится.
 *  Локальные переменные - Подобно тому, как объект сохраняет свое
 * состояние в полях, метод часто сохраняет свое временное
 * состояние в локальных переменных. Синтаксис объявления локальной
 * переменной аналогичен объявлению поля (например, int count = 0;).
 * Не существует специального ключевого слова, обозначающего переменную
 * как локальную; это определение целиком исходит из места,
 * в котором объявлена ​​переменная - между открывающей и закрывающей
 * скобками метода. Таким образом, локальные переменные видны
 * только тем методам, в которых они объявлены; они не доступны
 * из остальной части класса.
 *  Параметры - как в классе Bicycle, так и в основном методе
 * "Hello World!" приложение. Подпись для метода main является
 * public static void main (String [] args). Здесь переменная
 * args является параметром этого метода. Важно помнить,
 * что параметры всегда классифицируются как «переменные», а
 * не «поля». Это относится и к другим конструкциям, принимающим
 * параметры (таким как конструкторы и обработчики исключений).
 */
public class ReadMeVar {
    /**
     * объект сохраняет свое состояние в полях.
      */
    int cadence = 0;
    int speed = 0;
    int gear = 1;

}
/**
 * -------------------------------------------------------------------
 *                      Naming (Именование)
 * -------------------------------------------------------------------
 *  Имена переменных чувствительны к регистру. Имя переменной
 * может быть любым допустимым идентификатором - последовательность
 * символов Unicode неограниченной длины, начинающаяся с буквы,
 * знака доллара "$" или символа подчеркивания "_". Соглашение,
 * однако, заключается в том, что имена переменных всегда должны
 * начинаться с буквы, а не «$» или «_». Кроме того, знак
 * доллара, по соглашению, никогда не используется вообще. Вы
 * можете столкнуться с некоторыми ситуациями, когда автоматически
 * сгенерированные имена будут содержать знак доллара, но имена
 * переменных всегда должны избегать его использования. Аналогичное
 * соглашение существует для символа подчеркивания; хотя технически
 * законно начинать имя вашей переменной с "_", такая практика
 * не рекомендуется. Пробелы не допускаются.
 *  Последующими символами могут быть буквы, цифры, знаки
 * доллара или символы подчеркивания. Условные обозначения
 * (и здравый смысл) применимы и к этому правилу. При выборе
 * имени для ваших переменных используйте полные слова вместо
 * загадочных сокращений. Это облегчит чтение и понимание
 * вашего кода. Во многих случаях это также сделает ваш код
 * самодокументированным; например, поля с именами cadence,
 * speed и gear гораздо более интуитивны, чем сокращенные
 * версии, такие как s, c и g. Также имейте в виду, что выбранное
 * вами имя не должно быть ключевым словом или зарезервированным
 * словом.
 *  Если выбранное вами имя состоит только из одного слова,
 * пишите это слово строчными буквами. Если оно состоит из
 * более чем одного слова, используйте заглавные буквы первой
 * буквы каждого последующего слова. Названия gearRatio и
 * currentGear являются основными примерами этого соглашения.
 * Если ваша переменная хранит постоянное значение, такое
 * как static final int NUM_GEARS = 6, соглашение изменяется
 * незначительно, с заглавной буквы каждой буквы и разделяя
 * последующие слова символом подчеркивания. По соглашению
 * символ подчеркивания никогда не используется в другом
 * месте.
 */
