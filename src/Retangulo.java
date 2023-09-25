public class Retangulo {
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return altura*base;
    }

    public double calcularPerimetro() {
        return 2 * altura + 2 * base;
    }

    public double calcularDiagonal() {
        double altura2 = Math.pow(altura, 2);
        double base2 = Math.pow(base, 2);
        return Math.sqrt(base2 + altura2);
    }
}
