package Model;

import View.CalculatorView;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Polinom{
    private ArrayList<Monom> lista;
    private String s;
    private int nr;
    public void setNumber(String s){
        int sum=0;
        for(int i=0;i< s.length();i++){
             if(s.charAt(i)=='x') {
                 sum++;
             }
        }

        this.nr=sum;
    }
    public void setString(String pol){
        this.s=pol;
    }
    public void setList(){
        int copyNr=nr+1;


            String[] array2=s.split("[+]+",copyNr);
            //System.out.println(array2[0]);

        ArrayList<Monom> myArrayList= new ArrayList<Monom>();
        for (int j=0;j<nr;j++)
        {

            Monom b=new Monom();
            String[] array3=array2[j].split("[x^]+",3);
            //System.out.println(array3[0]);
            b.setCoeficient(parseInt(array3[0]));
            //System.out.println(array3[1]);
            b.setPutere(parseInt(array3[1]));

            myArrayList.add(b);
        }
        this.lista=myArrayList;
    }
    public ArrayList<Monom> getLista(){
        return this.lista;
    }
}
