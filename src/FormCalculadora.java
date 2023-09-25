import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormCalculadora extends JFrame {
    Calculadora c = new Calculadora();
    int count = 1;
    boolean canClean = false;

    void init(JTextField txtDisplay, JPanel pnlKeyboard) {
        GridLayout layout = new GridLayout(4,4, 0, 0);
        this.setLayout(new BorderLayout());
        this.add(txtDisplay, BorderLayout.NORTH);
        this.add(pnlKeyboard, BorderLayout.CENTER);
        pnlKeyboard.setLayout(layout);
        this.setTitle("Calculadora");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setResizable(false);
        this.setVisible(true);
    }

    JButton setBtnKey(char title, JTextField txtDisplay, CalcType type) {
        JButton btnKey = new JButton();
        btnKey.setText(""+title);
        btnKey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (type == CalcType.OPERATOR && count == 1) {
                    c.setN1(Double.parseDouble(txtDisplay.getText()));
                    c.setOp(title);
                    txtDisplay.setText("");
                    count++;
                } else if (title=='=') {
                        c.setN2(Double.parseDouble(txtDisplay.getText()));
                        double ans = c.calc();
                        txtDisplay.setText(""+ans);
                        c.setN1(ans);
                        c.setN2(0);
                        canClean = true;
                        count = 1;
                } else if (type == CalcType.OPERATOR && count == 2) {
                    c.setN2(Double.parseDouble(txtDisplay.getText()));
                    double ans = c.calc();
                    txtDisplay.setText(""+ans+title);
                    c.setOp(title);
                    count = 1;
                } else if (type == CalcType.NUMBER && count == 1 && canClean) {
                    txtDisplay.setText(""+title);
                    canClean = false;
                }
                else
                    txtDisplay.setText(txtDisplay.getText() + title);
            }
        });

        return btnKey;
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        FormCalculadora frm = new FormCalculadora();
        JPanel pnlKeyboard = new JPanel();
        JPanel pnlDisplay = new JPanel();
        JTextField txtDisplay = new JTextField(10), txtRes = new JTextField(10);
        txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDisplay.setFont(new Font("SansSerif", Font.BOLD, 20));
        txtDisplay.setEditable(false);
        txtRes.setEditable(false);

        JButton btnAns = frm.setBtnKey('=', txtDisplay, CalcType.OPERATOR);

        pnlKeyboard.add(frm.setBtnKey('7', txtDisplay, CalcType.NUMBER));
        pnlKeyboard.add(frm.setBtnKey('8', txtDisplay, CalcType.NUMBER));
        pnlKeyboard.add(frm.setBtnKey('9', txtDisplay, CalcType.NUMBER));
        pnlKeyboard.add(frm.setBtnKey('/', txtDisplay, CalcType.OPERATOR));
        pnlKeyboard.add(frm.setBtnKey('4', txtDisplay, CalcType.NUMBER));
        pnlKeyboard.add(frm.setBtnKey('5', txtDisplay, CalcType.NUMBER));
        pnlKeyboard.add(frm.setBtnKey('6', txtDisplay, CalcType.NUMBER));
        pnlKeyboard.add(frm.setBtnKey('*', txtDisplay, CalcType.OPERATOR));
        pnlKeyboard.add(frm.setBtnKey('1', txtDisplay, CalcType.NUMBER));
        pnlKeyboard.add(frm.setBtnKey('2', txtDisplay, CalcType.NUMBER));
        pnlKeyboard.add(frm.setBtnKey('3', txtDisplay, CalcType.NUMBER));
        pnlKeyboard.add(frm.setBtnKey('-', txtDisplay, CalcType.OPERATOR));
        pnlKeyboard.add(frm.setBtnKey('0', txtDisplay, CalcType.NUMBER));
        pnlKeyboard.add(frm.setBtnKey('.', txtDisplay, CalcType.NUMBER));
        pnlKeyboard.add(btnAns);
        pnlKeyboard.add(frm.setBtnKey('+', txtDisplay, CalcType.OPERATOR));



        frm.init(txtDisplay, pnlKeyboard);
    }

}
