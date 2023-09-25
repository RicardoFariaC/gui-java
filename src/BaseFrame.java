import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

abstract class BaseFrame extends JFrame{
    private String title;
    private int[] frameSize = new int[2];
    private JPanel pnlCreate = new JPanel();

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public void setFrameSize(int x, int y) {
        this.frameSize[0] = x;
        this.frameSize[1] = y;
    }

    public String getFrameSize() {
        return "x: "+ frameSize[0] + "\ny: " + frameSize[1];
    }

    void init() {
        pnlCreate.setLayout(null);
        this.setTitle(this.title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(this.frameSize[0], this.frameSize[1]);

        this.setVisible(true);
    }

    JComponent addPanel(PanelTypes type, String text, int xCord, int yCord, int width, int height) {
        switch (type) {
            case TEXTFIELD:
                JTextField txt = new JTextField(10);
                txt.setText(text);
                txt.setBounds(xCord, yCord, width, height);
                txt.setFont(new Font(txt.getFont().getName(), txt.getFont().getStyle(), (int)Math.ceil(.55*height)));
                pnlCreate.add(txt);
                this.add(pnlCreate);
                return txt;
            case LABEL:
                JLabel lbl = new JLabel();
                lbl.setText(text);
                lbl.setBounds(xCord, yCord, width, height);
                pnlCreate.add(lbl);
                this.add(pnlCreate);
                return lbl;
            default:
                return null;
        }
    }

    Component addPanel(PanelTypes type, String text, int xCord, int yCord, int width, int height, ActionListener al) {
        switch (type) {
            case BUTTON:
                JButton btn = new JButton();
                btn.setText(text);
                btn.setBounds(xCord, yCord, width, height);
                btn.addActionListener(al);
                pnlCreate.add(btn);
                this.add(pnlCreate);
                return btn;
            default:
                return null;
        }
    }



}