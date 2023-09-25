public class Calculadora {
    private double n1 = 0;
    private double n2 = 0;
    private char op;

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public double calc() {
        switch (op) {
            case('+'):
                System.out.println("+");
                return n1+n2;
            case('-'):
                System.out.println("-");
                return n1-n2;
            case('*'):
                System.out.println("*");
                return n1*n2;
            case('/'):
                System.out.println("/");
                return n1/n2;
        }

        return 0;
    }

}
