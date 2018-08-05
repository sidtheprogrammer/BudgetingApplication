package Display;

import javax.swing.*;
import java.util.Optional;

public class JavaWindow {
    int salaryAsInt;
    int rentAsInt;
    int spendingAsInt;

    public int getSalaryWindow() {

        JFrame frame = new JFrame();

        String salary = JOptionPane.showInputDialog(frame, "Enter your salary", null);
        frame.setDefaultCloseOperation(JOptionPane.CLOSED_OPTION);
        Optional<String> salaryAsOptional = Optional.ofNullable(salary);
        salaryAsInt =  salaryAsOptional.isPresent() ?  Integer.parseInt(salaryAsOptional.get()) : 0 ;
        if("".equals(salary)){
            salaryAsInt=0;
        }
        JOptionPane.showMessageDialog(null, "You entered " + salaryAsInt);
        return salaryAsInt;
    }


    public int getRentWindow(){

        JFrame frame = new JFrame();
        String rent = JOptionPane.showInputDialog(frame, "Enter your rent", null);
        frame.setDefaultCloseOperation(JOptionPane.CLOSED_OPTION);
        Optional<String> rentAsOptional = Optional.ofNullable(rent);
        rentAsInt =  rentAsOptional.isPresent() ?  Integer.parseInt(rentAsOptional.get()) : 0 ;
        if("".equals(rent)){
            rentAsInt=0;
        }
        JOptionPane.showMessageDialog(null, "You entered " + rentAsInt);
        return rentAsInt;
    }


    public int getSpendingWindow(){

        JFrame frame = new JFrame();
        String spending = JOptionPane.showInputDialog(frame, "Enter how much you would spend per week", null);
        frame.setDefaultCloseOperation(JOptionPane.CLOSED_OPTION);
        Optional<String> spendingAsOptional = Optional.ofNullable(spending);
        spendingAsInt =  spendingAsOptional.isPresent() ?  Integer.parseInt(spendingAsOptional.get()) : 0 ;
        if("".equals(spending)){
            spendingAsInt=0;
        }
        JOptionPane.showMessageDialog(null, "You entered " + spendingAsInt*4);
        return spendingAsInt*4;
    }

    public int getSalaryAsInt(){
        return salaryAsInt;
    }

    public int getRentAsInt() {
        return rentAsInt;
    }

    public int getSpendingAsInt() {
        return spendingAsInt;
    }
}
