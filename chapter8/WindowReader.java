import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.*;

public class WindowReader extends JFrame implements ActionListener {
    JFileChooser fileChooser;
    JMenuBar menuBar;
    JMenu menuFile,menuEdit;
    JMenuItem itemOpen,itemSave,itemCut,itemPaste;
    JTextArea text;

    BufferedReader in;
    FileReader fr;
    BufferedWriter out;
    FileWriter fw;
    public WindowReader(){
        init();
        setBounds(500,400,400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void init(){
        Container container = this.getContentPane();
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (Exception e){
            e.printStackTrace();
        }

        text = new JTextArea(20,10);
        text.setFont(new Font("楷体",Font.PLAIN,20));

        menuBar = new JMenuBar();
        menuFile = new JMenu("File");
        menuFile.setMnemonic('F');
        menuEdit = new JMenu("Edit");
        menuEdit.setMnemonic('E');

        itemOpen = new JMenuItem("Open...");
        itemSave = new JMenuItem("Save...");
        itemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_MASK));

        itemSave.addActionListener(this);
        itemOpen.addActionListener(this);

        itemCut = new JMenuItem("Cut");
        itemPaste = new JMenuItem("Paste");
        itemCut.addActionListener(this);
        itemPaste.addActionListener(this);


        fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Please Choose Text File","txt","java");
        fileChooser.setFileFilter(filter);



        JScrollPane pane = new JScrollPane();
        pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        pane.setViewportView(text);
        container.add(pane,BorderLayout.CENTER);

        menuFile.add(itemOpen);
        menuFile.addSeparator();
        menuFile.add(itemSave);

        menuEdit.add(itemCut);
        menuEdit.add(itemPaste);

        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        setJMenuBar(menuBar);
    }

    public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();
        if(obj == itemOpen){
            int state = fileChooser.showOpenDialog(this);
            if(state == JFileChooser.APPROVE_OPTION){
                text.setText("");
                File dir = fileChooser.getCurrentDirectory();
                String name = fileChooser.getSelectedFile().getName();
                File file = new File(dir,name);
                try {
                    fr = new FileReader(file);
                    in = new BufferedReader(fr);
                    String str = null;
                    while( (str = in.readLine())!=null){

                        text.append(str+"\n");
                    }
                    in.close();
                    fr.close();
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }catch (IOException ioe){
                    ioe.printStackTrace();;
                }
            }
        }else if(obj == itemSave){

            int state = fileChooser.showSaveDialog(this);
            String saveText = text.getText();
            if(state == JFileChooser.APPROVE_OPTION){
                File dir = fileChooser.getCurrentDirectory();
                String filename = fileChooser.getSelectedFile().getName();
                File file = new File(dir,filename);
                try{
                    fw = new FileWriter(file);
                    out = new BufferedWriter(fw);
                    out.write(saveText);
                    out.close();
                    fw.close();
                }catch (IOException ioe2){
                    ioe2.printStackTrace();
                }

            }




        }else if(obj == itemCut){
            text.cut();
        }else if(obj == itemPaste){
            text.paste();
        }


    }

    public static void main(String[] args) {
        WindowReader wr = new WindowReader();
    }
}
