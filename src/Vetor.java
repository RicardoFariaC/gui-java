import java.util.ArrayList;
import java.util.List;

public class Vetor {
    private List<Integer> num = new ArrayList<>();
    private int count = 0;

    public List<Integer> getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num.add(num);
        this.count++;
    }

    public int getCount() {
        return count;
    }

    public double getSoma() {
        double sum = 0;
        for (int i = 0; i < num.size(); i++) {
            sum += num.get(i);
        }

        return sum;
    }

    public double getMedia() {
        return this.getSoma()/this.count;
    }

    public int getMaior() {
        int maior = num.get(0);
        for (int i = 1; i < num.size(); i++) {
            if(maior < num.get(i)) {
                maior = num.get(i);
            }
        }
        return maior;
    }
}
