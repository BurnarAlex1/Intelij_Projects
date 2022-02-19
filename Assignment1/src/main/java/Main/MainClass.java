package Main;

import Controller.Controller;
import View.CalculatorView;

public class MainClass {

    public static void main(String[] args) {
        CalculatorView a = new CalculatorView();
        Controller ctrl= new Controller(a);
        a.setVisible(true);


    }
}