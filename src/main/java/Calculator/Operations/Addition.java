package Calculator.Operations;

    public class Addition extends Operations implements DoOperation {

        public Addition(double x, double y) {
            super(x, y);
        }

        public double doOperation() {
            return (super.x + super.y);
        }
    }

