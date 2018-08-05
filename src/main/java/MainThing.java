import Display.FullDisplay;
import Display.JavaWindow;

import javax.swing.*;

public class MainThing {

    public static void main(String[] args){

        JavaWindow javaWindow = new JavaWindow();

        int sal = javaWindow.getSalaryWindow();

        System.out.println("You entered " +sal );

        int rent = javaWindow.getRentWindow();

        System.out.println("The rent you entered was " + rent);

        int spending = javaWindow.getSpendingWindow();

        System.out.println("You entered " + spending);

        Calculations cal = new Calculations(sal);
       double cost =  cal.ni()+cal.student()+cal.tax();


       new FullDisplay();


    }
}
