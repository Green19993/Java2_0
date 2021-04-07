public class Task4 {
    public static void main(String[] args) {

        // Заполнение массива:
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = -10 + (int) (Math.random() * 20);
            // Вывод массива на экран:
            System.out.print(" (" + array[i] + ") ");
        }

        int trade; // Дополнительный параметр для перекладывания значений
        int maxNegative = 0; // Индекс наибольшего отрицательного значения
        int minPositive = 0; // Индекс наименьшего положительного значения

        // Чтобы значения оказались в "нужном" диапазоне создаю цикл.
        // Т.е. maxNegative сравнивал среди отрицательных чисел, а minPositive - среди положительных
        // Если все числа из одного диапазона, то сделаю счётчик posAndNeg, чтобы цикл не оказался бесконечным
        int posAndNeg = (array.length - 1);
        do {
            if (posAndNeg == 0){break;}
            if (array[maxNegative] >= 0) {maxNegative++;}
            if (array[minPositive] < 0) {minPositive++;}
            posAndNeg--;
        } while (array[maxNegative] > 0 || array[minPositive] < 0);

        // Счётчики положительных и отрицательных элементов (на случай если нет отрицательных или положительных чисел)
        int countPositive = 0;
        int countNegative = 0;

        // Нахождение максимального отрицательного и минимального положительного значения:
        // Сравнение и подсчёт элементов:
        for (int i = 0; i < array.length; i++) {
            // Отрацательные элементы:
            if (array[i] < 0) {
                if (array[maxNegative] <= array[i]) {
                    maxNegative = i;
                }
                countNegative++;
            } else {
                // Положительные элементы:
                if (array[minPositive] >= array[i]) {
                    minPositive = i;
                }
                countPositive++;
            }
        }
        System.out.println();

        /* Вывод количества положительных и отрицательных элементов массива.
        System.out.println("\nПоложительных чисел: " + countPositive + "\nОтрицательных чисел: " + countNegative);
        System.out.println(("Максимальное отрицательное число на позицие: " + (maxNegative+1) +
                "\nМинимальное положительное число на позицие: " + (minPositive+1)));
        */

        // Для понимания, что меняется:
        if (countNegative !=0 && countPositive != 0) {
            System.out.println("Меняем местами элементы: " + (minPositive + 1) + " и " + (maxNegative + 1));
        }
        // Проверка, что все числа не оказались положительными или отрицательными:
        if (countNegative != 0 && countPositive != 0){
            trade = array[minPositive];
            array[minPositive] = array[maxNegative];
            array[maxNegative] = trade;

            // Вывод массива после перестановки двух элементов:
            for (int i = 0; i < array.length; i++) {
                // Вывод массива на экран:
                System.out.print(" (" + array[i] + ") ");
            }
        } else {
            System.out.println("Все числа положительные/отрицательные");
        }
    }
}
