public class Array {

    public static int id = 1;  // Глобальная переменная - поскольку переменная статическая, к ней можно обратиться через имя класса
    private int ident;
    private String title;
    public static final int CLASS_VERSION = 1;     // Создаем константу, она не меняет свое значение. Константы принято писать большими буквами, а слова разделять нижним подчеркиванием

    public Array() {

    }

    public Array(String title) {
        this.title = title;  // Привсаиваем значение названию
        ident = id;          // Присваеваем в кучу свойству ident значение id из Metaspace
        id++;                // После каждого создания объекта меняем значение id в Metaspace
        // В результате у каждого объекта будет уникальное значение ident - аналог функции AUTOINCREMENT в sql
    }

    public int getIdent() {
        return ident;
    }

    public String getTitle() {
        return title;
    }
}
