package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;

public class CalculatorView extends JFrame {
    private JTextField P_TextField;
    private JTextField Q_TextField;
    private JLabel Label_raspuns;
    private JButton Add_Btn;
    private JButton Sub_Btn;
    private JButton Der_Btn;
    private JButton Integ_Btn;
    private JButton multBtn;
    public CalculatorView() {
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Polinom P:");
        lblNewLabel.setBounds(10, 11, 70, 14);
        getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Polinom Q:");
        lblNewLabel_1.setBounds(10, 32, 70, 14);
        getContentPane().add(lblNewLabel_1);

        P_TextField = new JTextField();
        P_TextField.setBounds(90, 8, 199, 20);
        getContentPane().add(P_TextField);
        P_TextField.setColumns(10);

        Q_TextField = new JTextField();
        Q_TextField.setBounds(90, 29, 199, 20);
        getContentPane().add(Q_TextField);
        Q_TextField.setColumns(10);

        Add_Btn = new JButton("P+Q");
        Add_Btn.setBounds(10, 57, 89, 23);
        getContentPane().add(Add_Btn);

        Sub_Btn = new JButton("P-Q");
        Sub_Btn.setBounds(100, 57, 89, 23);
        getContentPane().add(Sub_Btn);

        multBtn = new JButton("P*Q");
        multBtn.setBounds(10, 83, 89, 23);
        getContentPane().add(multBtn);

        JButton Div_Btn = new JButton("P/Q");
        Div_Btn.setBounds(100, 83, 89, 23);
        getContentPane().add(Div_Btn);

        Der_Btn = new JButton("Deriv P");
        Der_Btn.setBounds(10, 109, 89, 23);
        getContentPane().add(Der_Btn);

        Integ_Btn = new JButton("Integ P");
        Integ_Btn.setBounds(100, 109, 89, 23);
        getContentPane().add(Integ_Btn);

        JLabel lblNewLabel_2 = new JLabel("Raspuns:");
        lblNewLabel_2.setBounds(10, 143, 56, 14);
        getContentPane().add(lblNewLabel_2);

        Label_raspuns = new JLabel("");
        Label_raspuns.setBounds(65, 143, 212, 14);
        getContentPane().add(Label_raspuns);




    }

    public void addButtonListener(ActionListener actionListener) {
        this.Add_Btn.addActionListener(actionListener);
    }
    public void subButtonListener(ActionListener actionListener) {
        this.Sub_Btn.addActionListener(actionListener);
    }
    public void derivButtonListener(ActionListener actionListener) {
        this.Der_Btn.addActionListener(actionListener);
    }
    public void integButtonListener(ActionListener actionListener) {
        this.Integ_Btn.addActionListener(actionListener);
    }
    public void multButtonListener(ActionListener actionListener) {
        this.multBtn.addActionListener(actionListener);
    }


    public String getFieldText1(){
       return (String)P_TextField.getText();
    }
    public String getFieldText2(){
        return (String)Q_TextField.getText();
    }
    public void setAnswer(String s){
        if(this.Label_raspuns.getText()!="") {
                this.Label_raspuns.setText(Label_raspuns.getText() + " + " + s);
        }
        else{
            this.Label_raspuns.setText(s);
        }

        if(s=="")
        {
            this.Label_raspuns.setText("");
        }
    }
    public String getLabel(){
       return Label_raspuns.getText();
    }

}

