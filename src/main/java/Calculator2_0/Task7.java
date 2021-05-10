package Calculator2_0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task7 {

    // Создаём поля для хранения элементов:
    private double number1;
    private double number2;
    private char symbol;

    Scanner scanner = new Scanner(System.in);

    public void entryNumbers () {

        // Проверка, если пользователь ввёл цифру не через ',', а через '.':
        try {
        System.out.println("Введите первое число: ");
        number1 = scanner.nextDouble();
        } catch (InputMismatchException e){
            String num1 = scanner.nextLine();
            String[] numString1 = num1.split("\\.");
            number1 = Double.parseDouble(numString1[0]) + Double.parseDouble(numString1[1]) / 10;
        }

        try {
            System.out.println("Введите второе число: ");
            number2 = scanner.nextDouble();
        } catch (InputMismatchException e){
            String num2 = scanner.nextLine();
            String[] numString2 = num2.split("\\.");
            number2 = Double.parseDouble(numString2[0]) + Double.parseDouble(numString2[1]) / 10;
        }


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
