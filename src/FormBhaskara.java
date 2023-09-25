import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBhaskara extends BaseFrame {
    FormBhaskara(String title, int x, int y) {
        setTitle(title);
        setFrameSize(x, y);
    }

    public static void main(String[] args) {
        Bhaskara b = new Bhaskara();
        FormBhaskara frm = new FormBhaskara("", 350, 350);
        JLabel lblX1, lblX2;
        JButton btnCalculate;
        JTextField txtA, txtB, txtC;

        frm.addPanel(PanelTypes.LABEL, "A:", 10, 10, 200, 20);
        txtA = (JTextField) frm.addPanel(PanelTypes.TEXTFIELD, "", 10, 30, 300, 30);
        frm.addPanel(PanelTypes.LABEL, "B:",10, 60, 200, 20);
        txtB = (JTextField) frm.addPanel(PanelTypes.TEXTFIELD, "", 10, 80, 300, 30);
        frm.addPanel(PanelTypes.LABEL, "C:", 10, 110, 200, 20);
        txtC = (JTextField) frm.addPanel(PanelTypes.TEXTFIELD, "", 10, 130, 300, 30);
        frm.addPanel(PanelTypes.LABEL, "", 10, 160, 200, 20);
        lblX1 = (JLabel) frm.addPanel(PanelTypes.LABEL, "X1? ", 10, 180, 200, 20);
        lblX2 = (JLabel) frm.addPanel(PanelTypes.LABEL, "X2? ", 10, 200, 200, 20);
        frm.addPanel(PanelTypes.LABEL, "", 10, 220, 200, 20);

        btnCalculate = (JButton) frm.addPanel(PanelTypes.BUTTON, "Calcular", 10, 260, 300, 30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b.setA(Integer.parseInt(txtA.getText()));
                b.setB(Integer.parseInt(txtB.getText()));
                b.setC(Integer.parseInt(txtC.getText()));

                lblX1.setText("X1? " + b.getX1());
                lblX2.setText("X2? " + b.getX2());
            }
        });
        frm.init();
    }
}
