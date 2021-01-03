import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddOpterater extends JFrame {
    JButton btnAdd;
    JLabel result;
    JTextField param1,param2;

    public AddOpterater(){
        btnAdd = new JButton("相加");
        param1 = new JTextField(10);
        param2 = new JTextField(10);
        result = new JLabel("");

        setLayout(new FlowLayout());
        add(new JLabel("操作数1："));
        add(param1);
        add(new JLabel("操作数2："));
        add(param2);
        add(result);
        add(btnAdd);

        setBounds(500,300,500,120);
        setVisible(true);

        btnAdd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double d1 = Double.parseDouble(param1.getText()); //String-->double
                double d2 = Double.parseDouble(param2.getText());

                double d = d1+d2;
                result.setText(String.valueOf(d)); //double-->String

            }
        });  //ActionListener

    }

    public static void main(String[] args) {
        AddOpterater addOpterater = new AddOpterater();
    }
}
