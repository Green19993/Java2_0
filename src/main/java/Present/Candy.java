package Present;

public class Candy extends Surprise {
    private String filling; // Начинка

    public Candy(String name, double weight, double price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }

    // Геттеры:
    public String getFilling(){
        return filling;
    }

    // Сеттер:
    public void setFilling(String filling) {
        this.filling = filling;
    }

    public String toString() {
        return "Конфеты " + super.getName() + ", начинка " + filling + ", в подарке: " + super.getWeight() + " кг";
    }
}
