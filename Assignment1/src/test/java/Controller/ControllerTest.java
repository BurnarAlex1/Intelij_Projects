package Controller;

import Model.Monom;
import Model.Polinom;
import View.CalculatorView;
import org.junit.jupiter.api.Test;

import static Model.Operatii.*;
import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    @Test
    public void testAdunare() {
        CalculatorView a=new CalculatorView();
        Polinom p=new Polinom();
        p.setString("2x^2+3x^1");
        p.setNumber("2x^2+3x^1");
        p.setList();
        Polinom q=new Polinom();
        q.setString("5x^2+2x^0");
        q.setNumber("5x^2+2x^0");
        q.setList();
        Adunare(a,p.getLista(),q.getLista());
        assertEquals("7x^2 + 3x^1 + 2x^0",a.getLabel());

    }
    @Test
    public void testDerivare() {
        CalculatorView a=new CalculatorView();
        Polinom p=new Polinom();
        p.setString("2x^2+3x^1");
        p.setNumber("2x^2+3x^1");
        p.setList();
        Derivare(a,p.getLista());
        assertEquals("4x^1 + 3x^0",a.getLabel());

    }
    @Test
    public void testScadere() {
        CalculatorView a=new CalculatorView();
        Polinom p=new Polinom();
        p.setString("2x^2+3x^1");
        p.setNumber("2x^2+3x^1");
        p.setList();
        Polinom q=new Polinom();
        q.setString("5x^2+2x^0");
        q.setNumber("5x^2+2x^0");
        q.setList();
        Scadere(a,p.getLista(),q.getLista());
        assertEquals("-3x^2 + 3x^1 + -2x^0",a.getLabel());

    }

    @Test
    public void testInmultire() {
        CalculatorView a=new CalculatorView();
        Polinom p=new Polinom();
        p.setString("2x^2+3x^1");
        p.setNumber("2x^2+3x^1");
        p.setList();
        Polinom q=new Polinom();
        q.setString("5x^2+2x^0");
        q.setNumber("5x^2+2x^0");
        q.setList();
        Inmultire(a,p.getLista(),q.getLista());
        assertEquals("10x^4 + 4x^2 + 15x^3 + 6x^1",a.getLabel());

    }

}