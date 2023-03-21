public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        System.out.println(calc.plus.apply(5, 6));
        System.out.println(calc.minus.apply(5, 6));

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);

        //Мы получали ошибку по той причине, что в переменную "c" пытались записать результат деления на ноль.
        //Сделал условие, что если делим на ноль, то ноль и возвращаем
        calc.println.accept(c);
    }
}
