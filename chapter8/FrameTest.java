import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FrameTest {
    JFrame frame;
    Button btn1;
    JButton btn2;
    JPanel panel;
    JTextField field;

    public FrameTest(){
        frame = new JFrame("My Window");
        btn1 = new Button("Ok");
        btn2 = new JButton("Cancel");
        field = new JTextField("Hello, Java!",30);
        panel = new JPanel();
        panel.add(field);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER,30,10));
        frame.add(btn1);
        frame.add(btn2);
        frame.add(panel);

        //frame.setSize(500,300);
        //frame.setLocation(600,400);
        frame.setBounds(600,400,500,300);
        frame.setVisible(true);

        frame.setResizable(false);


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,e.getActionCommand());

                Object obj = e.getSource();
                if(obj instanceof Button){
                    System.out.println("It's a Button");
                }
                else if(obj instanceof JButton){
                    System.out.println("It's a JButton!");
                }
            }
        });

        frame.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                field.setText("Mouse Wheel moved!");
            }
        });

        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                field.setBackground(Color.blue);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                field.setText("Mouse moved，X:" + e.getX() + ",Y:"+e.getY());
            }
        });

    }

    public static void main(String[] args) {
        FrameTest frameTest = new FrameTest();
    }
}
