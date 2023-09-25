public class Quadrado {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    double calcularArea() {
        return Math.pow(lado, 2);
    }

    double calcularPerimetro() {
        return lado*4;
    }

    double calcularDiagonal() {
        return lado*Math.sqrt(2);
    }



}
