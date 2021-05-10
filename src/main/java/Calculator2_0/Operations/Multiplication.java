package Calculator2_0.Operations;


import Calculator2_0.Operations.*;

public class Multiplication extends Operations implements DoOperation {

    public Multiplication(double x, double y) {
        super(x, y);
    }

    public double doOperation() {
        return (super.x * super.y);
    }
}
