public class Task4 {
    public static void main(String[] args) {

        // Заполнение массива:
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = -10 + (int) (Math.random() * 20);
            // Вывод массива на экран:
            System.out.print(" (" + array[i] + ") ");
        }

        // Нахождение максимального отрицательного и минимального положительного значения:
        int maxNegative = -10;
        int minPositive = 10;
        int trade; // Для перекладывания двух значений
        // Счётчики положительных и отрицательных элементов (на случай если нет отрицательных или положительных чисел)
        int countPositive = 0;
        int countNegative = 0;
        // Сравнение и подсчёт элементов:
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (maxNegative >= array[i]) {
                    maxNegative = i;
                }
                countNegative++;
            } else {
                if (minPositive >= array[i]) {
                    minPositive = i;
                }
                countPositive++;

            }
        }
        System.out.println("\nПоложительных чисел: " + countPositive + "\nОтрицательных чисел: " + countNegative);
        System.out.println(("Максимальное отрицательное число на позицие: " + (maxNegative+1) +
                "\nМинимальное положительное число на позицие: " + (minPositive+1)));

        if (maxNegative != 0 && minPositive != 0){
            trade = array[minPositive];
            array[minPositive] = array[maxNegative];
            array[maxNegative] = trade;
        }

        // Вывод массива после перестановки двух элементов:
        for (int i = 0; i < array.length; i++) {
            // Вывод массива на экран:
            System.out.print(" (" + array[i] + ") ");
        }
    }
}
