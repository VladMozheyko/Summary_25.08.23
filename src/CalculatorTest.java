import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*; // Библиотека для тестирования

public class CalculatorTest {

    Calculator calculator = new Calculator(); // Создаем объект для калькулятора

    @AfterEach   // Вызывается после каждого теста
    public void afterEach(){
        System.out.println("Тест пройден");
    }

    @BeforeEach   // Вызывается перед каждым теста
    public void beforeEach(){
        System.out.println("Тест начат:");
    }

    @BeforeAll // Вызывается один раз в начале тестирования
    public static void beforeAll(){ // static - добавляет метод в Metaspace, он будет единым для всех объектов тестирования
        System.out.println("Начато тестирование:");
    }

    @AfterAll // Вызывается один раз в начале тестирования
    public static void afterAll(){ // static - добавляет метод в Metaspace, он будет единым для всех объектов тестирования
        System.out.println("Тестирование закончено.");
    }

    @Test   // Аннотация
    public void testSum(){
        // Для суммы 2 и 2 эталонное значение 4, укажем его в Assertions и вызовем метод sum с параметрами 2 и 2
        System.out.println("Тестируем сумму:");
        Assertions.assertEquals(4, calculator.sum(2, 2));
    }

    @Test   // Аннотация
    public void testSub(){
        // Для разности 6 и 2 эталонное значение 4, укажем его в Assertions и вызовем метод sum с параметрами 2 и 2
        System.out.println("Тестируем разность:");
        Assertions.assertEquals(4, calculator.sub(6, 2));
    }


    @Test   // Аннотация
    public void testMul(){
        // Для произведения 2 и 2 эталонное значение 4, укажем его в Assertions и вызовем метод mul с параметрами 6 и 2
        System.out.println("Тестируем произведение:");
        Assertions.assertEquals(4, calculator.mul(2, 2));
    }

    @Test   // Аннотация
    public void testDiv(){
        // Для деления 8 и 2 эталонное значение 4, укажем его в Assertions и вызовем метод sum с параметрами 2 и 2
        System.out.println("Тестируем деление(частное):");
        Assertions.assertEquals(4, calculator.div(8, 2));
    }

}
