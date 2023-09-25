import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormRetangulo extends BaseFrame {
    FormRetangulo(String title, int x, int y) {
        this.setTitle(title);
        this.setFrameSize(x, y);
    }
    public static void main(String[] args) {
        FormRetangulo frm = new FormRetangulo("", 600, 250);
        JLabel lblBase;
        JTextField txtBase;
        JLabel lblHeight;
        JTextField txtHeight;
        JLabel lblArea;
        JLabel lblPerimeter;
        JLabel lblDiagonal;
        JButton btnCalculate;

        lblBase = (JLabel) frm.addPanel(PanelTypes.LABEL, "Digite a base:", 20, 10, 200, 20);
        txtBase = (JTextField) frm.addPanel(PanelTypes.TEXTFIELD, "", 20, 30, 300, 30);
        lblHeight = (JLabel) frm.addPanel(PanelTypes.LABEL, "Digite a altura:", 20, 60, 200, 20);
        txtHeight = (JTextField) frm.addPanel(PanelTypes.TEXTFIELD, "", 20, 80, 300, 30);
        lblArea = (JLabel) frm.addPanel(PanelTypes.LABEL, "Área:", 20, 110, 200, 20);
        lblPerimeter = (JLabel) frm.addPanel(PanelTypes.LABEL, "Perimetro:", 20, 130, 200, 20);
        lblDiagonal = (JLabel) frm.addPanel(PanelTypes.LABEL, "Diagonal:", 20, 150, 200, 20);
        btnCalculate = (JButton) frm.addPanel(PanelTypes.BUTTON, "Calcular", 400, 175, 170, 30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Retangulo r = new Retangulo();
                r.setAltura(Double.parseDouble(txtHeight.getText()));
                r.setBase(Double.parseDouble(txtBase.getText()));

                lblArea.setText("Área: " + r.calcularArea());
                lblPerimeter.setText("Perimetro: " + r.calcularPerimetro());
                lblDiagonal.setText("Diagonal: " + r.calcularDiagonal());
            }
        });

        frm.init();
    }
}
