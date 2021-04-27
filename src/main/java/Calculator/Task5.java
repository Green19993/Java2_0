package Calculator;

import java.util.Scanner;

public class Task5 {

    // Создаём поля для хранения элементов:
    private double number1;
    private double number2;
    private char symbol;

    Scanner scanner = new Scanner(System.in);

    public void entryNumbers () {
        System.out.println("Введите первое число: ");
        number1 = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        number2 = scanner.nextDouble();
    }

    public void entryOperation () {
        System.out.println("Введите необходимую операцию\n(сложение '+'," +
                " вычитание '-', умножение '*', деление '/'): " );
        symbol = scanner.next().charAt(0);
        scanner.close();
    }

    // Получение чисел/знака:
    public double getNumber1 () {
        return number1;
    }
    public double getNumber2 () {
        return number2;
    }
    public char getSymbol () {
        return symbol;
    }
}
