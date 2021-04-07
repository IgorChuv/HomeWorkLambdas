package Calculator;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    Consumer<Integer> println = System.out::println;

    BinaryOperator<Integer> plus = (x, y) -> x + y; ; //Сложение
    BinaryOperator<Integer> minus = (x, y) -> x - y; //Вычитание
    BinaryOperator<Integer> multiply = (x, y) -> x * y; //Умножение
    BinaryOperator<Integer> divide = (x, y) -> x / y; // Деление

    UnaryOperator<Integer> pow = x -> x * x; //Квадрат числа
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1; //Абсолютная величина числа

    Predicate<Integer> isPositive = x -> x > 0; //Проверка положительное ли число




    }
