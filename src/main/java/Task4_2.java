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
        System.out.println("Введите вес конфет Сникерс в кг: ");
        Candy snikers = new Candy("Сникерс", scan.nextDouble(), 550, "Нуга" );

        System.out.println("Введите вес конфет Марс в кг: ");
        Candy mars = new Candy("Марс", scan.nextDouble(), 535, "Карамель");

        System.out.println("Введите вес мармеладных динозавров в кг: ");
        Jellybean dino = new Jellybean("Дино", scan.nextDouble(), 425,"Зелёный");

        System.out.println("Введите вес Бабаевского шоколада в кг: ");
        Chocolate babaev = new Chocolate("Бабаевский", scan.nextDouble(), 510, "Горький");

        System.out.println("Введите вес шоколада Альпен Гольд в кг: ");
        Chocolate alpenGold = new Chocolate("Альпен Гольд", scan.nextDouble(), 600, "Солёный");

        scan.close();


        // Подсчёт цены и веса:
        double totalPrice = snikers.getWeight() * snikers.getPrice() + mars.getWeight() * mars.getPrice() + dino.getWeight() * dino.getPrice() +
                babaev.getWeight() * babaev.getPrice() + alpenGold.getWeight() * alpenGold.getPrice();

        double totalWeight = snikers.getWeight() + mars.getWeight() + dino.getWeight() + babaev.getWeight() + alpenGold.getWeight();

        System.out.println("Состав подарка:");

        Surprise [] boxSurprise = {snikers, mars, dino, babaev, alpenGold};
        for (Surprise box : boxSurprise) {
            if (box.getWeight() != 0){
                System.out.print(box.getName() + ": " + box.getWeight() + "кг");
            System.out.println();
            }
        }

        if (totalPrice != 0 && totalWeight != 0){
        System.out.println("Общий вес: " + totalWeight + " кг");
        System.out.println("Общая стоимость: " + totalPrice + " рублей");
        } else{
            System.out.println("Подарок пустой!");
        }
    }
}
