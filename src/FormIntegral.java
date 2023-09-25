import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormIntegral extends BaseFrame{

    FormIntegral(String title, int x, int y) {
        setTitle(title);
        setFrameSize(x, y);
    }

    public static void main(String[] args) {
        Integral i = new Integral();
        FormIntegral frm = new FormIntegral("", 350, 350);
        JLabel lblArea;
        JButton btnCalculate;
        JTextField txtA, txtB, txtN;

        frm.addPanel(PanelTypes.LABEL, "A:", 10, 10, 200, 20);
        txtA = (JTextField) frm.addPanel(PanelTypes.TEXTFIELD, "", 10, 30, 300, 30);
        frm.addPanel(PanelTypes.LABEL, "B:",10, 60, 200, 20);
        txtB = (JTextField) frm.addPanel(PanelTypes.TEXTFIELD, "", 10, 80, 300, 30);
        frm.addPanel(PanelTypes.LABEL, "N:", 10, 110, 200, 20);
        txtN = (JTextField) frm.addPanel(PanelTypes.TEXTFIELD, "", 10, 130, 300, 30);
        frm.addPanel(PanelTypes.LABEL, "", 10, 160, 200, 20);
        lblArea = (JLabel) frm.addPanel(PanelTypes.LABEL, "Area: ", 10, 180, 200, 20);
        frm.addPanel(PanelTypes.LABEL, "", 10, 220, 200, 20);

        btnCalculate = (JButton) frm.addPanel(PanelTypes.BUTTON, "Calcular", 10, 260, 300, 30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i.setA(Integer.parseInt(txtA.getText()));
                i.setB(Integer.parseInt(txtB.getText()));
                i.setN(Integer.parseInt(txtN.getText()));

                lblArea.setText("Area: " + i.getArea());
            }
        });
        frm.init();
    }
}
