import java.util.Scanner;
import Present.Candy;
import Present.Jellybean;
import Present.Chocolate;
import Present.Surprise;

/**
 * Created 19.04.2021
 * @author Klepko Grigoriy
 * App for forming gift sets
 */
public class Task4_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Создание сладостей и указание веса для подарка
        System.out.println("Введите вес конфет Сникерс: ");
        Candy snikers = new Candy();
        snikers.setWeight(scan.nextDouble());
        snikers.setName("Сникерс");
        snikers.setFilling("Нуга");
        snikers.setPrice(550);

        System.out.println("Введите вес конфет Марс: ");
        Candy mars = new Candy();
        mars.setWeight(scan.nextDouble());
        mars.setName("Марс");
        mars.setFilling("Карамель");
        mars.setPrice(535);

        System.out.println("Введите вес мармеладных динозавров: ");
        Jellybean dino = new Jellybean();
        dino.setWeight(scan.nextDouble());
        dino.setName("Дино");
        dino.setColor("Зелёный");
        dino.setPrice(425);

        System.out.println("Введите вес Бабаевского шоколада: ");
        Chocolate babaev = new Chocolate();
        babaev.setWeight(scan.nextDouble());
        babaev.setName("Бабаевский");
        babaev.setTaste("Горький");
        babaev.setPrice(560);

        System.out.println("Введите вес шоколада Альпен Гольд: ");
        Chocolate alpenGold = new Chocolate();
        alpenGold.setWeight(scan.nextDouble());
        alpenGold.setName("Альпен Гольд");
        alpenGold.setTaste("Солёный");
        alpenGold.setPrice(600);

        scan.close();


        // Подсчёт цены и веса:
        double totalPrice = snikers.getWeight() * snikers.getPrice() + mars.getWeight() * mars.getPrice() + dino.getWeight() * dino.getPrice() +
                babaev.getWeight() * babaev.getPrice() + alpenGold.getWeight() * alpenGold.getPrice();

        double totalWeight = snikers.getWeight() + mars.getWeight() + dino.getWeight() + babaev.getWeight() + alpenGold.getWeight();

        System.out.println("Состав подарка:");
        Surprise [] boxPresent = {snikers, mars, dino, babaev, alpenGold};
        for (Surprise box : boxPresent) {
            System.out.println(box.toString());
        }

        System.out.println("Общий вес: " + totalWeight + " кг");
        System.out.println("Общая стоимость: " + totalPrice + " рублей");
    }
}
