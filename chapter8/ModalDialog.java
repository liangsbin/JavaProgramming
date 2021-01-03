import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModalDialog extends JFrame implements ActionListener {

    JButton btn1,btn2;
    public ModalDialog(){
        setTitle("Parent Windows");

        btn1 = new JButton("Show Dialog");
        btn2 = new JButton("Show Modal Dialog");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setBounds(300,300,400,300);
        setBackground(new Color(100,100,100));
        setLayout(new FlowLayout());
        add(btn1);
        add(btn2);
    }

    public void init(){
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();
        if(obj == btn1){
            JDialog dialog = new JDialog(this,"My Dialog");
            dialog.setModal(false);
            dialog.setSize(200,100);
            dialog.setVisible(true);

        }else if(obj == btn2){
            JDialog dialog = new JDialog(this,"My Dialog");
            dialog.setModal(true);
            dialog.setSize(300,100);
            dialog.setVisible(true);
        }
    }

    public static void main(String[] args) {
        ModalDialog md = new ModalDialog();
        md.init();
    }
}
