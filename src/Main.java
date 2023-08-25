public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Сумма: " + calculator.sum(2, 7));
        System.out.println("Разность: " + calculator.sub(2, 7));
        System.out.println("Произведение: " + calculator.mul(2, 7));
        System.out.println("Частное: " + calculator.div(5, 2));
        System.out.println(calculator.toString());     // Вызываем метод toString для нашего объекта
        System.out.println(Array.id);   // Обращаемся в Metaspace к статическому свойству класса
        Array array = new Array("Первый массив");    // Создаем в куче объект класса Array
        Array array1 = new Array("Второй массив");    // Создаем в куче объект класса Array
        Array array2 = new Array("Третий массив");    // Создаем в куче объект класса Array
        // ident находится в куче, id - в Metaspace. Смотреть конструктор класса
        System.out.println("ident: " + array.getIdent() + " id: " + array.id + " title: " + array.getTitle());
        System.out.println("ident: " + array1.getIdent() + " id: " + array1.id + " title: " + array1.getTitle());
        System.out.println("ident: " + array2.getIdent() + " id: " + array2.id + " title: " + array2.getTitle());
        // При помощи полиморфизма определим второй конструктор в классе Array - и воспользуемся им
        Array array3 = new Array();
        // Поскольку мы ничего не назначили переменным в куче, они будут иметь значение по умолчанию
        System.out.println("ident: " + array3.getIdent() + " id: " + array3.id + " title: " + array3.getTitle());
        // Выведем константу:
        System.out.println("Версия: " + Array.CLASS_VERSION);
    }

 //   Object
}
