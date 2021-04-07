package Calculator;

public class Main {
    public static void main (String [] args ) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(2, 1);
        int c = calc.divide.apply(a, b);
        int d = calc.multiply.apply(2, 4);
        int e = calc.pow.apply(2);
        int f = calc.abs.apply(b);
        boolean g = calc.isPositive.test(c);

        System.out.println("a = " + a
         + "\nb = " + b
         + "\nc = " + c
         + "\nd = " + d
         + "\ne = " + e
         + "\nf = " + f
         + "\ng = " + g);

        //calc.println.accept(a);
        //calc.println.accept(b);
        //calc.println.accept(c);
        //calc.println.accept(d);
        //calc.println.accept(e);
        //calc.println.accept(f);
        //System.out.println(g);

    }
}
