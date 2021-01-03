import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calc extends JFrame implements ActionListener {
    String result = "";
    double d1=0.0,d2=0.0;
    String sign = "";
    JButton[] btn = new JButton[10];
    JButton btnAdd = new JButton("+");
    JButton btnSub = new JButton("-");
    JButton btnMul = new JButton("*");
    JButton btnDev = new JButton("/");
    JButton btnMod = new JButton("%");
    JButton btnEq = new JButton("=");
    JButton btnDot = new JButton(".");
    JButton btnCE = new JButton("CE");
    JButton btnC = new JButton("C");
    JButton btnE = new JButton("1/x");
    JTextField text = new JTextField("0");
    public void init(){


        setLayout(new BorderLayout());
        add(text,BorderLayout.NORTH);
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4,5));
        for(int i=0;i<10;i++)
        {
            btn[i] = new JButton(String.valueOf(i));
            btn[i].addActionListener(this);
            p.add(btn[i]);
        }
        p.add(btnAdd);
        btnAdd.addActionListener(this);
        p.add(btnSub);
        btnSub.addActionListener(this);
        p.add(btnMul);
        btnMul.addActionListener(this);
        p.add(btnDev);
        btnDev.addActionListener(this);
        p.add(btnMod);
        btnMod.addActionListener(this);
        p.add(btnDot);
        btnDot.addActionListener(this);
        p.add(btnE);
        btnE.addActionListener(this);
        p.add(btnC);
        btnC.addActionListener(this);
        p.add(btnCE);
        btnCE.addActionListener(this);
        p.add(btnEq);
        btnEq.addActionListener(this);




        this.setVisible(true);
        this.setBounds(500,400,500,400);
        this.add(p,BorderLayout.CENTER);
        this.pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        result = text.getText();
        String val = e.getActionCommand();
        if(result.equals("0"))
            result="";
        switch (val){
            case "9":
                text.setText(result + "9");
                break;
            case "8":
                text.setText(result + "8");
                break;
            case "7":
                text.setText(result + "7");
                break;
            case "6":
                text.setText(result + "6");
                break;
            case "5":
                text.setText(result + "5");
                break;
            case "4":
                text.setText(result + "4");
                break;
            case "3":
                text.setText(result + "3");
                break;
            case "2":
                text.setText(result + "2");
                break;
            case "1":
                text.setText(result + "1");
                break;
            case "0":
                text.setText(result + "0");
                break;
            case ".":
                if(result.length() ==0)
                    text.setText("0" + ".");
                else
                    text.setText(result + ".");
                break;
        }
        switch (val){
            case "+":
                d1 = Double.parseDouble(result);
                text.setText("");
                sign = "+";
                break;
            case "-":
                d1 = Double.parseDouble(result);
                text.setText("");
                sign = "-";
                break;
            case "*":
                d1 = Double.parseDouble(result);
                text.setText("");
                sign = "*";
                break;
            case "/":
                d1 = Double.parseDouble(result);
                text.setText("");
                sign = "/";
                break;
            case "%":
                d1 = Double.parseDouble(result);
                text.setText("");
                sign = "%";
                break;
            case "=":
                d2 = Double.parseDouble(result);
                if(sign.equals("+"))
                    text.setText(String.valueOf(d1+d2));
                else if(sign.equals("-"))
                    text.setText(String.valueOf(d1-d2));
                else if(sign.equals("*"))
                    text.setText(String.valueOf(d1*d2));
                else if(sign.equals("/") && d2!=0)
                    text.setText(String.valueOf(d1/d2));
                else
                    text.setText("NaN");

        }

        if(val.equals("CE")){
            String s = result.substring(0,result.length()-1);
            text.setText(s);
        }
        else if(val.equals("C")){

            text.setText("0");
        }
        else if(val.equals("1/x"))
        {
            text.setText(String.valueOf(1.0/Double.parseDouble(result)));
        }
    }

    public static void main(String[] args) {
        Calc c = new Calc();
        c.init();
    }
}
