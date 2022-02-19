package Model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import View.CalculatorView;

public class Operatii {

    public static void Adunare(CalculatorView a,ArrayList<Monom> p,ArrayList<Monom> q){

        for (Monom var : p) {
            int enable = 0;
            for (Monom var2 : q) {
                if (var.getPutere() == var2.getPutere()) {
                    int newNumber;
                    newNumber = var.getCoeficient() + var2.getCoeficient();
                    var.setCoeficient(newNumber);
                    var2.setCoeficient(0);
                    a.setAnswer(var.getCoeficient() + "x^" + var.getPutere());
                    enable = 1;
                    break;
                }
            }
            if (enable == 0) {
                a.setAnswer(var.getCoeficient() + "x^" + var.getPutere());
            }
        }
        for (Monom var2 : q) {
            if (var2.getCoeficient() != 0)
                a.setAnswer(var2.getCoeficient() + "x^" + var2.getPutere());
        }
    }

    public static void Scadere(CalculatorView a,ArrayList<Monom> p,ArrayList<Monom> q){

        for (Monom var : p) {
            int enable = 0;
            for (Monom var2 : q) {
                if (var.getPutere() == var2.getPutere()) {
                    int newNumber;
                    newNumber = var.getCoeficient() - var2.getCoeficient();
                    var.setCoeficient(newNumber);
                    var2.setCoeficient(0);
                    a.setAnswer(var.getCoeficient() + "x^" + var.getPutere());
                    enable = 1;
                    break;
                }
            }
            if (enable == 0) {
                a.setAnswer(var.getCoeficient() + "x^" + var.getPutere());
            }
        }
        for (Monom var2 : q) {
            if (var2.getCoeficient() != 0)
                a.setAnswer(-var2.getCoeficient() + "x^" + var2.getPutere());
        }
    }
    public static void Derivare(CalculatorView a,ArrayList<Monom> p){
        for(Monom var1: p){
            int newCoeficient,newPutere;
            newCoeficient=var1.getCoeficient()*var1.getPutere();
            newPutere=var1.getPutere()-1;
            if(newPutere>-1)
            a.setAnswer(newCoeficient + "x^" + newPutere);
        }
    }

    public static void Integrare(CalculatorView a,ArrayList<Monom> p){
        for(Monom var1: p){
            int newPutere;
            double newCoeficient;
            double putere=var1.getPutere();
            newCoeficient=var1.getCoeficient()/putere;
            newPutere=var1.getPutere()+1;
            DecimalFormat df = new DecimalFormat("###.###");
            if(newPutere!=1)
                a.setAnswer(df.format(newCoeficient) + "x^" + newPutere);
            else if(newPutere==1)
            {
                a.setAnswer(var1.getCoeficient()+"x^" + newPutere);
            }
        }
    }

    public static void Inmultire(CalculatorView a,ArrayList<Monom> p, ArrayList<Monom> q){
        ArrayList<Monom> newList = new ArrayList<Monom>();
        for(Monom var1: p){
             for(Monom var2: q){
                 Monom m=new Monom();
                 m.setCoeficient(var1.getCoeficient()*var2.getCoeficient());
                 m.setPutere(var1.getPutere()+var2.getPutere());
              newList.add(m);
             }
        }
        int enable,check;
        for(Monom var3: newList) {
            enable=0;
            check=0;
           for(Monom var4: newList){
               if(var3.getPutere()==var4.getPutere() && enable==1 && var3.getPutere()!=-100){
                   a.setAnswer(var3.getCoeficient()+var4.getCoeficient()+"x^"+var3.getPutere());
                  check=1;
                  var4.setPutere(-100);
               }
               if(var3.getPutere()==var4.getPutere()){
                   enable=1;
               }
           }
           if(check==0 && var3.getPutere()!=-100){
               a.setAnswer(var3.getCoeficient()+"x^"+var3.getPutere());
           }
        }
    }
}
