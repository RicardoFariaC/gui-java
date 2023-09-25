public class Bhaskara {
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    private double calcularDelta() {
        return (Math.pow(b, 2) - 4*a*c);
    }

    public double getX1() {
        return ((-b + Math.sqrt(calcularDelta())) / 2*a);
    }

    public double getX2() {
        return ((-b - Math.sqrt(calcularDelta())) / 2*a);
    }

}
