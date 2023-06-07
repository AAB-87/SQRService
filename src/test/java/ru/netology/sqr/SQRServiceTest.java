package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @ParameterizedTest  // параметризованный тест
    @CsvSource(value = {"'InRange', 200, 300, 3", // задаём значения сразу для трёх тестов
            "'MinResult', 100, 100, 1",
            "'MaxResult', 100, 9801, 90"})
    void squareNumber(String testName, int numberMin, int numberMax, int expected) { // заданные значения подставляются сюда
        SQRService service = new SQRService(); // создаём экземпляр класса
        int actual = service.NumbersSquared(numberMin, numberMax); // вызываем метод

        assertEquals(expected, actual); //сравниваем ожидаемый и фактический результат
    }
}