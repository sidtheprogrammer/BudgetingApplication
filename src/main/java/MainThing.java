import Display.JavaWindow;

import javax.swing.*;

public class MainThing {

    public static void main(String[] args){

        JavaWindow javaWindow = new JavaWindow();

        int sal = javaWindow.getSalaryWindow();

        System.out.println("You entered " +sal );

        int rent = javaWindow.getRentWindow();

        System.out.println("The rent you entered was " + rent);




    }
}
