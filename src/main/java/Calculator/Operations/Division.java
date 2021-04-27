package Calculator.Operations;

public class Division extends Operations implements DoOperation {


    public Division(double x, double y) {
        super(x, y);
    }

    public double doOperation() {
        return (super.x / super.y);
    }
}
