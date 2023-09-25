import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormVetor extends BaseFrame {
    FormVetor(String title, int x, int y) {
        this.setTitle(title);
        this.setFrameSize(x, y);
    }

    public static void main(String[] args) {
        Vetor v = new Vetor();
        FormVetor frm = new FormVetor("", 500, 250);
        JLabel lblQtd, lblMedia, lblMaior, lblSoma, lblQuest;
        JButton btnAdd;
        JTextField txtVec;

        lblQuest = (JLabel) frm.addPanel(PanelTypes.LABEL, "Digite um número: ", 20, 10, 300, 20);
        txtVec = (JTextField) frm.addPanel(PanelTypes.TEXTFIELD, "", 20, 30, 300, 30);
        lblQtd = (JLabel) frm.addPanel(PanelTypes.LABEL, "Quantidade de numeros digitados: 0", 20, 60, 300, 20);
        lblMedia = (JLabel) frm.addPanel(PanelTypes.LABEL, "Média: ", 20, 80, 300, 20);
        lblMaior = (JLabel) frm.addPanel(PanelTypes.LABEL, "Maior: ", 20, 100, 300, 20);
        lblSoma = (JLabel) frm.addPanel(PanelTypes.LABEL, "Soma de todos: ", 20, 120, 300, 20);
        btnAdd = (JButton) frm.addPanel(PanelTypes.BUTTON, "+", 320, 32, 150, 25, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.setNum(Integer.parseInt(txtVec.getText()));
                lblQtd.setText("Quantidade de números digitados: " + v.getCount());
                lblMedia.setText("Média: " + v.getMedia());
                lblMaior.setText("Maior: " + v.getMaior());
                lblSoma.setText("Soma de todos: " + v.getSoma());
                txtVec.setText("");
            }
        });



        frm.init();
    }
}
