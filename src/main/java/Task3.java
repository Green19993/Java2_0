import java.util.Scanner;

/**
 * Created 07.04.2021
 * @author Klepko Grigoriy
 * App for calculations numbers or find max length word
 */
public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Какую программу запустить?\n1 - калькулятор, 2 - поиск максимального слова в массиве");
        int app = sc.nextInt();

        // Проверка, какую программу необходимо запустить:
        switch (app) {
            case 1: {
                calculator();
                break;
            }
            case 2: {
                maxString();
                break;
            }
            default:
                System.out.println("Неверный выбор программы!");
                break;
        }
        sc.close();
    }

    // Метод с арифмитическими действиями (калькулятор):
    public static void calculator() {
        // Считываем с клавиатуры два числа:
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double x = sc.nextDouble();

        System.out.println("Введите второе число: ");
        double y = sc.nextDouble();

        // Считываем с клавиатуры орифметический знак:
        System.out.println("Введите математический знак(+,-,*,/): ");
        char znak = sc.next().charAt(0); // Считываем арифметическое действие

        // Определяем знак и выполняем действие:
        switch (znak) {
            // Если выбрали сложение:
            case '+':
                System.out.printf("Сумма чисел равна: %.4f", (x + y)); // .4f указывает на количество знаков после запятой
                break;

            // Если выбрали вычитание:
            case '-':
                System.out.printf("Разность x и y равна: %.4f", (x - y));
                break;

            // Если выбрали деление:
            case '/':
                // Проверка деления на ноль:
                if (y == 0) {
                    System.out.println("Делить на ноль нельзя!");
                    break;
                } else
                    System.out.printf("Деление x на y равно: %.4f", (x / y));
                break;

            // Если выбрали умножение:
            case '*':
                System.out.printf("Произведение чисел равно: %.4f", (x * y));
                break;
            default:
                System.out.println("Арифметическая операция введена неверно!!!");
        }
        sc.close();
    }

    // Метод нахождения самого длинного слова в массиве:
    public static void maxString() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите длину массива: ");
        int arrayLength = sc.nextInt();
        sc.nextLine(); // Необходимо как разделитель после nextInt, выступает в роли завершения чтения чисел.
        String[] array = new String[arrayLength];

        // Заполнение массива:
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Укажите " + (i+1) + " элемент массива: ");
            array[i] = sc.nextLine();
        }

        // Нахождение самого длинного слова в массиве:
        String maxString = array[0];
        int maxIndex = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i].length() > array[maxIndex].length()) {
                maxIndex = i;
                maxString = array[maxIndex];
            }
        }
        System.out.println("Самое длинное слово это: " + maxString);
        sc.close();
    }
}