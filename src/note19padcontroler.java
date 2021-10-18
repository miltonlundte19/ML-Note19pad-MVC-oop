import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class note19padcontroler {
    private note19padview view;
    private note19padmodel model;

    public note19padcontroler() {
        view = new note19padview();
        model = new note19padmodel();

        JFrame frame = new JFrame("note19padview");
        frame.setContentPane(view.getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        view.getLoadbutton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    view.settexteria(model.getfilecontent());
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        note19padcontroler controller = new note19padcontroler();
    }

}
