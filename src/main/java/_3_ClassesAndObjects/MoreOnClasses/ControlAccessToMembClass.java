package _3_ClassesAndObjects.MoreOnClasses;

/**
 * Модификаторы уровня доступа определяют, могут ли другие классы
 * использовать конкретное поле или вызывать определенный метод.
 * Существует два уровня контроля доступа:
 * - На "верхнем уровне" - public или package-private (без явного
 *   модификатора).
 * - На "уровне участника" - public, private, protected, or
 *   package-private (без явного модификатора).
 * Класс может быть объявлен с модификатором public, и в этом
 * случае этот класс виден всем классам везде.
 * Если у класса нет модификатора (по умолчанию, также известного
 * как package-private), он виден только внутри своего собственного
 * пакета (пакеты называются группами связанных классов).
 *   На "уровне члена (участника)" также можно использовать public
 * модификатор или не использовать модификатор (package-private)
 * так же, как с классами "верхнего уровня", и с тем же значением.
 * Для участников есть два дополнительных модификатора доступа:
 * private и protected. Модификатор private указывает, что
 * член может быть доступен только в его собственном классе.
 * Protected модификатор указывает, что доступ к члену возможен
 * только в его собственном пакете (как в случае с package-private)
 * и, кроме того, с помощью подкласса его класса в другом пакете.
 * В следующей таблице показан доступ к элементам, разрешенным
 * каждым модификатором.
 *                  Access Levels
 * ---------------------------------------------
 * Modifier	  Class	  Package   Subclass   World
 * ---------------------------------------------
 * public	    Y	    Y	      Y	        Y
 * protected	Y	    Y	      Y	        N
 * no modifier	Y	    Y	      N	        N
 * private	    Y	    N	      N     	N
 * ---------------------------------------------
 * Первый столбец данных указывает, имеет ли сам класс доступ
 * к члену, определенному уровнем доступа. У класса всегда
 * есть доступ к своим членам. Во втором столбце указано, имеют
 * ли классы в том же пакете, что и класс (независимо от их
 * происхождения), доступ к члену. Третий столбец указывает,
 * имеют ли подклассы класса, объявленного вне этого пакета,
 * доступ к члену. Четвертый столбец указывает, все ли классы
 * имеют доступ к члену.
 *   Уровни доступа влияют на вас двумя способами. Во-первых,
 * когда вы используете классы, которые приходят из другого
 * источника, такого как классы на платформе Java, уровни доступа
 * определяют, какие члены этих классов могут использовать
 * ваши собственные классы. Во-вторых, когда вы пишете класс,
 * вам нужно решить, какой уровень доступа должна иметь каждая
 * переменная-член и каждый метод в вашем классе.
 *   Посмотрим на коллекцию классов, как уровни доступа влияют
 * на видимость. На следующем рисунке показаны четыре класса в
 * этом примере и их взаимосвязь.
 *      |package one|               |package two|
 *      |___________|    Subclass   |___________|
 *      |  Alpha <--|---------------| AlphaSub  |
 *      |-----------|               |-----------|
 *      |   Beta    |               |   Gamma   |
 *      |___________|               |___________|
 * В следующей таблице показано, где члены класса Alpha видны
 * для каждого из модификаторов доступа, которые могут быть
 * применены к ним.
 *                  Visibility
 * ---------------------------------------------
 * Modifier	  Alpha	  Beta	  AlphaSub	  Gamma
 * ---------------------------------------------
 * public	    Y	    Y	      Y	        Y
 * protected	Y	    Y	      Y	        N
 * no modifier	Y	    Y	      N	        N
 * private	    Y	    N	      N     	N
 * ---------------------------------------------
 * Советы по выбору уровня доступа:
 * Если другие программисты используют ваш класс, вы хотите,
 * чтобы ошибки от неправильного использования не возникали.
 * Уровни доступа могут помочь вам сделать это.
 *   Используйте наиболее ограниченный уровень доступа, который
 * имеет смысл для конкретного члена. Используйте private,
 * если нет веских причин не делать этого.
 *   Избегайте public полей, кроме констант. (Во многих примерах
 * из учебника используются открытые поля. Это может помочь в
 * сжатой иллюстрации некоторых моментов, но не рекомендуется
 * для производственного кода). Public поля имеют тенденцию
 * связывать вас с конкретной реализацией и ограничивают вашу
 * гибкость при изменении кода.
 */
public class ControlAccessToMembClass {
}




