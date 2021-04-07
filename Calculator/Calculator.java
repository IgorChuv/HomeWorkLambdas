package Calculator;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    Consumer<Integer> println = System.out::println;

    BinaryOperator<Integer> plus = (x, y) -> x + y; ;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;




    }
