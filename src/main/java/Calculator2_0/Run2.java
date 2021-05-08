package Calculator2_0;

import Calculator.Operations.*;
import Calculator.Task5;
import java.io.*;


public class Run2 {
    public static void main(String[] args) throws IOException {
        Task5 entryData = new Task5();
        entryData.entryNumbers();
        entryData.entryOperation();

        System.out.println("Введенные данные: ");
        System.out.println(entryData.getNumber1() + " " + entryData.getSymbol() + " " + entryData.getNumber2());

        // Задание №7:
        // Запросим несуществующий файл с датой:
        try {
            File file = new File("C:\\Users\\User\\IdeaProjects\\Java2_0\\src\\main\\java\\ReadFile\\testTry.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            System.out.println("Дата создания калькулятора: " + line);
        } catch (FileNotFoundException e) {
            File file = new File("C:\\Users\\User\\IdeaProjects\\Java2_0\\src\\main\\java\\ReadFile\\catchFile.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();

            // Всегда будет считываться данный файл с датой 08.05.2021:
            System.out.println("Дата создания калькулятора: " + line);
        }

        Calculator.Run test = new Calculator.Run();
        test.getOperation(entryData);

    }

    double res = 0;

    public void getOperation(Task5 entryData) {

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
