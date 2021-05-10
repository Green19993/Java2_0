package Calculator2_0.Operations;

public class Operations {

    protected double x;
    protected double y;

    public Operations(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void rounding(double res) {
        // Добавим в исключение на бесконечноть (деление на ноль):
        try {
            if (Double.isInfinite(res)) {
                throw new infinityException("Result division - infinity!");
            } else
                System.out.printf("Результат операции:\n%.2f", res);
        } catch (infinityException e) {
            System.out.println("На ноль делить нельзя!\nЛучше разделим на 10: ");
            System.out.println(x/10);
        }
    }
}

