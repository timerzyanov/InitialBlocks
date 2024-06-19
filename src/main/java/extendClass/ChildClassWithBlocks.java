package extendClass;

public class ChildClassWithBlocks extends ParentClassWithBlocks {

    static {
        System.out.println("Статический блок №1 дочернего класса.");
    }

    public static String childStatic = setChildStatic();

    static {
        System.out.println("Статический блок №2 дочернего класса.");
    }

    public String childNonStatic1 = setChildNonStatic1();

    {
        System.out.println("Блок инициализации №1 дочернего класса.");
    }

    public String childNonStatic2 = setChildNonStatic2();

    {
        System.out.println("Блок инициализации №2 дочернего класса.");
    }

    public ChildClassWithBlocks() {
        System.out.println("Конструктор дочернего класса.");
    }

    private String setChildNonStatic2() {
        System.out.println("Не статическое поле дочернего класса №2.");
        return "childNonStatic";
    }

    private static String setChildStatic() {
        System.out.println("Статическое поле дочернего класса.");
        return "childStatic";
    }

    public static void print() {
        System.out.println("Метод child print.");
    }
}
