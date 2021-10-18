import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class note19padmodel {
    private String filpaf;

    public String getfilecontent() throws FileNotFoundException {
        JFileChooser filcho = new JFileChooser();
        int result =    filcho.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            filpaf = filcho.getSelectedFile().getAbsolutePath();
        } else {
            filpaf = "exempel.txt";
        }
        File file = new File(filpaf);
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        return sc.next();
    }



}
