import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class note19padview {
    private JPanel panel1;
    private JButton clerbutton;
    private JTextArea textArea1;
    private JButton savebutton;
    private JButton loadbutton;


    public note19padview() {
        clerbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
            }
        });
    }

    public JPanel getPanel() {
        return panel1;
    }

    public JButton getSavebutton() {
        return savebutton;
    }

    public JButton getLoadbutton() {
        return loadbutton;
    }


    public void settexteria(String getfilecontent) {
        textArea1.setText(getfilecontent);
    }
}
