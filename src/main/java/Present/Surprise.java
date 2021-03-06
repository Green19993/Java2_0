package Present;

/*
Общий класс для указания общих параметров
таких как: Имя, вес и цена.
 */
public class Surprise {
    private String name;
    private double weight;
    private double price;

    public Surprise(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
