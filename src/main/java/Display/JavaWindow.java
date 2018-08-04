package Display;

import javax.swing.*;
import java.util.Optional;

public class JavaWindow {

    public int getWindow() throws NullPointerException {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String salary = JOptionPane.showInputDialog(frame, "Enter your salary", null);
        Optional<String> salaryAsOptional = Optional.ofNullable(salary);
        int salaryAsInt =  salaryAsOptional.isPresent() ?  Integer.parseInt(salaryAsOptional.get()) : 0 ;
        if("".equals(salary)){
            salaryAsInt=0;
        }
        return salaryAsInt;
    }

         /*
        frame.setSize(400, 400);
        frame.setResizable(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        */
}
