package week11.lesson4.example3;

public enum MathOperation {
    SUM {
        public double doOperation(double a, double b){
            return a + b;
        }
        public String getOperationSign() { return "+"; }
    },
    SUBTRACT {
        public double doOperation(double a, double b){
            return a - b;
        }
        public String getOperationSign() { return "-"; }
    },
    MULTIPLY {
        public double doOperation(double a, double b){
            return a * b;
        }
        public String getOperationSign() { return "*"; }
    },
    DIVIDE {
        public double doOperation(double a, double b){
            return a / b;
        }
        public String getOperationSign() { return "/"; }
    };

    public abstract double doOperation(double a, double b);
    public abstract String getOperationSign();
}
