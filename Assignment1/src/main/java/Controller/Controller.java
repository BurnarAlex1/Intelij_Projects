package Controller;

import Model.Monom;
import Model.Operatii;
import Model.Polinom;
import View.CalculatorView;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    public Controller(CalculatorView a) {


        a.addButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a.setAnswer("");
                Polinom p = new Polinom();
                p.setNumber(a.getFieldText1());
                p.setString(a.getFieldText1());

                Polinom q = new Polinom();
                q.setNumber(a.getFieldText2());
                q.setString(a.getFieldText2());

                p.setList();
                q.setList();
                Operatii.Adunare(a,p.getLista(),q.getLista());

            }
        });

        a.subButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a.setAnswer("");
                Polinom p = new Polinom();
                p.setNumber(a.getFieldText1());
                p.setString(a.getFieldText1());

                Polinom q = new Polinom();
                q.setNumber(a.getFieldText2());
                q.setString(a.getFieldText2());

                p.setList();
                q.setList();

                Operatii.Scadere(a,p.getLista(),q.getLista());
            }
        });
        a.derivButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a.setAnswer("");
                Polinom p = new Polinom();
                p.setNumber(a.getFieldText1());
                p.setString(a.getFieldText1());

                p.setList();

                Operatii.Derivare(a,p.getLista());
            }
            });

        a.integButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a.setAnswer("");
                Polinom p = new Polinom();
                p.setNumber(a.getFieldText1());
                p.setString(a.getFieldText1());

                p.setList();

                Operatii.Integrare(a,p.getLista());
            }
        });

        a.multButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a.setAnswer("");
                Polinom p = new Polinom();
                p.setNumber(a.getFieldText1());
                p.setString(a.getFieldText1());

                Polinom q = new Polinom();
                q.setNumber(a.getFieldText2());
                q.setString(a.getFieldText2());

                p.setList();
                q.setList();

                Operatii.Inmultire(a,p.getLista(),q.getLista());
            }
        });
    }
}









