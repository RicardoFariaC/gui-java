import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormTriangulo extends BaseFrame {
    FormTriangulo(String title, int x, int y) {
        setTitle(title);
        setFrameSize(x, y);
    }

    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        FormTriangulo frm = new FormTriangulo("", 350, 350);
        JLabel lblTriangle, lblPerimeter, lblType, lblArea;
        JButton btnCalculate;
        JTextField txtA, txtB, txtC;

        frm.addPanel(PanelTypes.LABEL, "Lado A:", 10, 10, 200, 20);
        txtA = (JTextField) frm.addPanel(PanelTypes.TEXTFIELD, "", 10, 30, 300, 30);
        frm.addPanel(PanelTypes.LABEL, "Lado B:",10, 60, 200, 20);
        txtB = (JTextField) frm.addPanel(PanelTypes.TEXTFIELD, "", 10, 80, 300, 30);
        frm.addPanel(PanelTypes.LABEL, "Lado C:", 10, 110, 200, 20);
        txtC = (JTextField) frm.addPanel(PanelTypes.TEXTFIELD, "", 10, 130, 300, 30);
        frm.addPanel(PanelTypes.LABEL, "", 10, 240, 200, 20);
        lblTriangle = (JLabel) frm.addPanel(PanelTypes.LABEL, "é Triângulo? ", 10, 160, 200, 20);
        lblPerimeter = (JLabel) frm.addPanel(PanelTypes.LABEL, "Perimetro: ", 10, 180, 200, 20);
        lblType = (JLabel) frm.addPanel(PanelTypes.LABEL, "Tipo de triângulo: ", 10, 200, 300, 20);
        lblArea = (JLabel) frm.addPanel(PanelTypes.LABEL, "Área: ", 10, 220, 200, 20);
        frm.addPanel(PanelTypes.LABEL, "", 10, 240, 200, 20);

        btnCalculate = (JButton) frm.addPanel(PanelTypes.BUTTON, "Calcular", 10, 260, 300, 30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setLadoA(Integer.parseInt(txtA.getText()));
                t.setLadoB(Integer.parseInt(txtB.getText()));
                t.setLadoC(Integer.parseInt(txtC.getText()));
                lblTriangle.setText("é Triângulo? " + t.isTriangulo());
                if(!t.isTriangulo()) {
                    lblPerimeter.setText("Perimetro: IMPOSSÍVEL CALCULAR");
                    lblType.setText("Tipo de triângulo: IMPOSSÍVEL CALCULAR");
                    lblArea.setText("Área: IMPOSSÍVEL CALCULAR");
                } else {
                    lblPerimeter.setText("Perimetro: " + t.getPerimetro());
                    lblType.setText("Tipo de triângulo: " + t.tipo());
                    lblArea.setText("Área: " + t.getArea());
                }
            }
        });
        frm.init();
    }
}
