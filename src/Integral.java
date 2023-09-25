public class Integral {
    private int a;
    private int b;
    private int n;

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

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    private double getIntegral(double x) {
        int n_i = n+1;
        return (Math.pow(x, n_i) / n_i);
    }

    public double getArea() {
        System.out.println(getIntegral(b));
        System.out.println(getIntegral(a));
        return getIntegral(b)-getIntegral(a);
    }
}
