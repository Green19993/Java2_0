package Calculator.Operations;

public class Operations {

    protected double x;
    protected double y;

    public Operations(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double rounding (double res) {
        System.out.printf("Результат операции:\n%.4f", res);
        return res;
    }
}
