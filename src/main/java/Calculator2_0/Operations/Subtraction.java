package Calculator2_0.Operations;

import Calculator2_0.Operations.*;

public class Subtraction extends Operations implements DoOperation {

    public Subtraction(double x, double y) {
        super(x, y);
    }

    public double doOperation() {
        return super.x - super.y;
    }
}
