package Present;

public class Chocolate extends Surprise {
    private String name, taste; //Название и вкус
    private  double  weight, price; // Вес и цена

    public Chocolate(String name, double weight, double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    // Геттеры:
    public String getTaste(){
        return taste;
    }

    // Сеттеры:
    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String toString() {
        return "Конфеты " + super.getName() + ", вкус " + taste + ", в подарке: " + super.getWeight() + " кг";
    }
}

