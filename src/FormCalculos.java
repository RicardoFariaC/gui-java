import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormCalculos extends BaseFrame {
    FormCalculos(String title, int x, int y) {
        setTitle(title);
        setFrameSize(x, y);
    }

    public static void main(String[] args) {
        Calculos c = new Calculos();
        FormCalculos frm = new FormCalculos("", 350, 400);
        JLabel lblResposta;
        JButton btnCalculate;
        JTextField txtA, txtB, txtN;

        frm.addPanel(PanelTypes.LABEL, "Numero 1:", 10, 10, 200, 20);
        txtA = (JTextField) frm.addPanel(PanelTypes.TEXTFIELD, "", 10, 30, 300, 30);
        frm.addPanel(PanelTypes.LABEL, "Numero 2:",10, 60, 200, 20);
        txtB = (JTextField) frm.addPanel(PanelTypes.TEXTFIELD, "", 10, 80, 300, 30);
        lblResposta = (JLabel) frm.addPanel(PanelTypes.LABEL, "Resposta: ", 10, 110, 200, 20);
        frm.addPanel(PanelTypes.LABEL, "", 10, 130, 200, 20);

        frm.addPanel(PanelTypes.BUTTON, "Somar", 10, 160, 300, 30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setN1(Double.parseDouble(txtA.getText()));
                c.setN2(Double.parseDouble(txtB.getText()));
                lblResposta.setText("Resposta: " + c.getSoma());
            }
        });

        frm.addPanel(PanelTypes.BUTTON, "Subtrair", 10, 200, 300, 30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setN1(Double.parseDouble(txtA.getText()));
                c.setN2(Double.parseDouble(txtB.getText()));
                lblResposta.setText("Resposta: " + c.getSubtracao());
            }
        });

        frm.addPanel(PanelTypes.BUTTON, "Multiplicação", 10, 240, 300, 30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setN1(Double.parseDouble(txtA.getText()));
                c.setN2(Double.parseDouble(txtB.getText()));
                lblResposta.setText("Resposta: " + c.getMultiplicacao());
            }
        });

        frm.addPanel(PanelTypes.BUTTON, "Divisão", 10, 280, 300, 30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setN1(Double.parseDouble(txtA.getText()));
                c.setN2(Double.parseDouble(txtB.getText()));
                lblResposta.setText("Resposta: " + c.getDivisao());
            }
        });

        frm.addPanel(PanelTypes.BUTTON, "Numero 1 ^ Numero 2", 10, 320, 300, 30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setN1(Double.parseDouble(txtA.getText()));
                c.setN2(Double.parseDouble(txtB.getText()));
                lblResposta.setText("Resposta: " + c.getPotencia());
            }
        });

        frm.init();
    }
}
