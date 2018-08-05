package Display;

import javax.swing.*;
import java.util.Optional;

public class JavaWindow {

    public int getSalaryWindow() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String salary = JOptionPane.showInputDialog(frame, "Enter your salary", null);
        Optional<String> salaryAsOptional = Optional.ofNullable(salary);
        int salaryAsInt =  salaryAsOptional.isPresent() ?  Integer.parseInt(salaryAsOptional.get()) : 0 ;
        if("".equals(salary)){
            salaryAsInt=0;
        }
        JOptionPane.showMessageDialog(null, "You entered " + salaryAsInt);
        return salaryAsInt;
    }


    public int getRentWindow(){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String rent = JOptionPane.showInputDialog(frame, "Enter your rent", null);
        Optional<String> rentAsOptional = Optional.ofNullable(rent);
        int rentAsInt =  rentAsOptional.isPresent() ?  Integer.parseInt(rentAsOptional.get()) : 0 ;
        if("".equals(rent)){
            rentAsInt=0;
        }
        JOptionPane.showMessageDialog(null, "You entered " + rentAsInt);
        return rentAsInt;
    }


}
