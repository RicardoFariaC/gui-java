public class Calculos {
    private double n1;
    private double n2;

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

    public double getSoma() {
        return n1+n2;
    }

    public double getSubtracao() {
        return n1-n2;
    }

    public double getMultiplicacao() {
        return n1*n2;
    }

    public double getDivisao() {
        return n1/n2;
    }

    public double getPotencia() {
        return Math.pow(n1, n2);
    }
}
