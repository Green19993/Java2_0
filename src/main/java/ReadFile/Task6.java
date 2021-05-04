package ReadFile;

import java.io.*;
import java.util.*;


public class Task6 {

    public static void main(String[] args) throws FileNotFoundException {

        // Расположение файла:
        String path = typeCreatePath();

        if ("error".equals(path)) {
            System.out.println("Ошибка выбора способа создания ссылки!");
        } else {
            countWords(path);
        }
    }

    // Определение способа и создание ссылки на файл:
    static String typeCreatePath() {
        String path;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажете полное расположение файла без формата файла самостоятельно(1)" +
                " или укажете только имя файла(2)? ");
        int typeCreatePath = scanner.nextInt();
        if (typeCreatePath == 2) {
            path = createPath();
            System.out.println(path);
        } else {
            if (typeCreatePath == 1) {
                path = selectPath();
                System.out.println(path);
            } else {
                System.out.println();
                path = "error";
            }
        }
        return path;
    }

    // Создание ссылки "расположения файла:
    static String createPath() {

        Scanner scanner = new Scanner(System.in);
        String fileName;

        // Проверка на наличие txt файла в папке:
        do {
            System.out.println("Введить имя файла (Test1, Test2 или Test3)");
            fileName = scanner.nextLine();
        } while (!fileName.equals("Test1") & !fileName.equals("Test2") & !fileName.equals("Test3"));

        // Указание расположения файла txt:
        String separator = File.separator; // Определение разделителя в системе ('/' или '\')
        String path = "C:" +separator + "Users" + separator + "User" + separator + "IdeaProjects" + separator
                + "Java2_0" + separator + "src" + separator + "main" + separator + "java" + separator + "ReadFile"
                + separator + fileName;

        scanner.close();
        return path + ".txt";
    }

    // Указание расположения файла:
    static String selectPath() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите путь к файлу(без расширения): ");
        String path = scanner.nextLine();
        scanner.close();
        // Проверка на указание расширения:
        String test = path.substring(path.length() - 3);
        if (test.equals("txt")) {
            return path;
        } else {
            return path + ".txt";
        }
    }

    // Операции над считанным текстом:
    static void countWords (String path) throws FileNotFoundException {


        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new TreeMap<>();
        Set<String> set = new TreeSet<>();

        File file = new File(path);
        Scanner scanner = new Scanner(file);

        // Созранение слов в list:
        while (scanner.hasNext()){
            String word = scanner.next().toLowerCase();
            list.add(word);
        }
        System.out.println("Все слова из файла:");

        // вывод записанных слов из файла в ArrayList
        for (String word : list) {
            System.out.print(word + " ");
        }

        // Сортировка по алфавиту и поиск максимального количества повторений слов:
        String maxWord = null;
        int maxCount = 1;
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), Collections.frequency(list, list.get(i)));
            if (maxCount < Collections.frequency(list, list.get(i))) {
                maxCount = Collections.frequency(list, list.get(i));
                maxWord = list.get(i);
            }
        }

        // Создание списка, если слов несколько и сортировка их по алфавиту
        for (String words : list) {
            if (maxCount == Collections.frequency(list, words)) {
                set.add(words);
            }
        }

        System.out.println();
        System.out.println("\nCлова из файла отсортированы по алфавиту [слово=повторений]: \n" + map );
        System.out.println("\nСлово '" + maxWord + "' встречается в тексте " + maxCount +  " раз(а)");
        if (set.size() > 1) {
            System.out.println("Данные слова встречаются в тексте по " + maxCount + " раз(а) и отсортированы по алфавиту: \n" + set);
        }
    }
}
