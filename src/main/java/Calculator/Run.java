package Calculator;

import Calculator.Operations.*;

public class Run {
    public static void main(String[] args){
        Task5 entryData = new Task5();
        entryData.entryNumbers();
        entryData.entryOperation();

        System.out.println("Введенные данные: ");
        System.out.println(entryData.getNumber1() + " " + entryData.getSymbol() + " " + entryData.getNumber2());

        Run test = new Run();
        test.getOperation(entryData);

    }
    double res = 0;
    public void getOperation (Task5 entryData) {

        switch (entryData.getSymbol()) {
            case '+':
                Addition addition = new Addition(entryData.getNumber1(), entryData.getNumber2());
                res = addition.rounding(addition.doOperation()); // вычисление суммы
                break;
            case '-':
                Subtraction substraction = new Subtraction(entryData.getNumber1(), entryData.getNumber2());
                res = substraction.rounding(substraction.doOperation());  // вычисление частного
                break;
            case '*':
                Multiplication multiplication = new Multiplication(entryData.getNumber1(), entryData.getNumber2());
                res = multiplication.rounding(multiplication.doOperation()); // вычисление произведения
                break;
            case '/':
                Division division = new Division(entryData.getNumber1(), entryData.getNumber2());
                res = division.rounding(division.doOperation());  // вычисление разности
                break;
            default:
                System.out.println("неизвестная операция, введите снова");
        }
    }
}