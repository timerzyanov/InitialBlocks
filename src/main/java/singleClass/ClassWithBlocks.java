package singleClass;

public class ClassWithBlocks {

    static {
        System.out.println("Статический блок №1.");
    }

    public static String staticField = setStaticField();

    public ClassWithBlocks() {
        System.out.println("Конструктор.");
    }

    static {
        System.out.println("Статический блок №2.");
    }

    {
        System.out.println("Блок инициализации №1.");
    }

    public String nonStaticField = setNonStaticField();

    {
        System.out.println("Блок инициализации №2.");
    }

    private String setNonStaticField() {
        System.out.println("Не статическое поле.");
        return "nonStaticField";
    }

    private static String setStaticField() {
        System.out.println("Статическое поле.");
        return "staticField";
    }

    public static void print() {
        System.out.println("Метод static print.");
    }
}