public class Triangulo {
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    boolean isTriangulo() {
        if(this.ladoA < ladoB+ladoC && ladoB < ladoA+ladoC && ladoC < ladoA+ladoB)
            return true;

        return false;
    }

    int getPerimetro() {
        return ladoA+ladoB+ladoC;
    }

    String tipo() {
        if(ladoC==ladoA && ladoC==ladoB)
            return "Equilátero";
        else if(ladoC != ladoA && ladoC != ladoB)
            return "Escaleno";
        else
            return "Isósceles";
    }

    double getArea() {
        int p = (ladoA+ladoC+ladoB) / 2;
        return Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
    }


}
