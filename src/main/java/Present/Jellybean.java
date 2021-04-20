package Present;

public class Jellybean extends Surprise {
    private String color; // Цвет

    public Jellybean(String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    // Геттеры:
    public String getColor(){
        return color;
    }

    // Сеттеры:
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Конфеты " + super.getName() + ", цвет " + color + ", в подарке: " + super.getWeight() + " кг";
    }
}
