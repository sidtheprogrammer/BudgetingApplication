package Display;

import javax.swing.*;

public class FullDisplay {

    public FullDisplay(){
        JavaWindow javaWindow = new JavaWindow();
       int rent= javaWindow.getRentAsInt();
       int salary =   javaWindow.getSalaryAsInt();
       int spending=  javaWindow.getSpendingAsInt()

        JFrame frame = new JFrame("Budgeting Application");
        JPanel panel = new JPanel();
        JLabel salaryLabel = new JLabel("Your salary is " + salary);
        JLabel rentLabel = new JLabel("Your rent is " + rent);
        JLabel spendingLabel = new JLabel("Your spending is " + spending);

        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        panel.add(salaryLabel);
        panel.add(rentLabel);
        panel.add(spendingLabel);


        frame.add(panel);
        frame.setVisible(true);
    }


}
