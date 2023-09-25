import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormQuadrado extends BaseFrame {
    FormQuadrado(String title, int x, int y) {
        setTitle(title);
        setFrameSize(x, y);
    }

    public static void main(String[] args) {
        FormQuadrado frm = new FormQuadrado("", 600, 250);
        JLabel lblQuest;
        JLabel lblArea;
        JLabel lblPerimeter;
        JLabel lblDiagonal;
        JButton btnCalculate;
        JTextField txtQuest;

        lblQuest = (JLabel) frm.addPanel(PanelTypes.LABEL, "Digite o tamanho do lado do Quadrado:", 10, 10, 300, 20);
        txtQuest = (JTextField) frm.addPanel(PanelTypes.TEXTFIELD, "", 10, 30, 300, 30);
        lblArea = (JLabel) frm.addPanel(PanelTypes.LABEL, "Área:", 10, 60, 300, 20);
        lblPerimeter = (JLabel) frm.addPanel(PanelTypes.LABEL, "Perimetro:", 10, 80, 300, 20);
        lblDiagonal = (JLabel) frm.addPanel(PanelTypes.LABEL, "Diagonal:", 10, 100, 300, 20);

        btnCalculate = (JButton) frm.addPanel(PanelTypes.BUTTON, "Calcular", 400, 175, 170, 30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Quadrado q = new Quadrado();
                double value = Double.parseDouble(txtQuest.getText());
                q.setLado(value);

                lblArea.setText("Área: " + q.calcularArea());
                lblPerimeter.setText("Perimetro: " + q.calcularPerimetro());
                lblDiagonal.setText("Diagonal: " + q.calcularDiagonal());

            }
        });


        frm.init();
    }
}
