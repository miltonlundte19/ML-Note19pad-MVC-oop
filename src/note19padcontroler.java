import javax.swing.*;

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
    }

    public static void main(String[] args) {
        note19padcontroler controller = new note19padcontroler();
    }
}
