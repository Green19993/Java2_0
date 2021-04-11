import java.util.Scanner;

/**
 * Created 06.04.2021
 * @author Klepko Grigoriy
 * Classes calculation
 * Пользователь указывает два числа и арифметическое действие
 * и в результате получает результат с округлением до 4 знаков
 * после запятой.
 */
public class Task1_2 {

    public static void main(String[] args) {

        //* Считываем с клавиатуры два числа:
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double x = sc.nextDouble();

        System.out.println("Введите второе число: ");
        double y = sc.nextDouble();

        // Считываем с клавиатуры орифметический знак:
        System.out.println("Введите математический знак(+,-,*,/): ");
        char znak = sc.next().charAt(0); // Считываем арифметическое действие

        // Определяем знак и выполняем действие:
        switch (znak){
            // Если выбрали сложение:
            case '+':
                System.out.printf("Сумма чисел равна: %.4f", (x+y)); // .4f указывает на количество знаков после запятой
                break;

            // Если выбрали вычитание:
            case '-':
                System.out.printf("Разность x и y равна: %.4f", (x-y));
                break;

            // Если выбрали деление:
            case '/':
                // Проверка деления на ноль:
                if (y == 0){
                    System.out.println("Делить на ноль нельзя!");
                    break;
                }
                else
                    System.out.printf("Деление x на y равно: %.4f", (x/y));
                break;

            // Если выбрали умножение:
            case '*':
                System.out.printf("Произведение чисел равно: %.4f", (x*y));
                break;
            default:
                System.out.println("Арифметическая операция введена неверно!!!");
        }
        sc.close();
    }
}
