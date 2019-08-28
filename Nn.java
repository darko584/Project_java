import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Login implements ActionListener{
 JFrame f1;
 JButton b14,b15;
 JLabel l11,l21;
 JTextField t11;
 JPasswordField pa1;
 GridLayout gd;
 JPanel p11;
 public Login(){
   f1= new JFrame("ACCESS_POINT");
   b14=new JButton("Login");
   b15=new JButton("Cancel");
   l11= new JLabel("User name");
   l21= new JLabel("Password");
   gd = new GridLayout(3,2);
   t11 = new JTextField();
   pa1 =new JPasswordField();
   f1.setSize(500,500);
   p11 = new JPanel(gd);
   p11.add(l11);
   p11.add(t11);
   p11.add(l21);
   p11.add(pa1);
   p11.add(b14);
   p11.add(b15);
   b15.addActionListener(this);
   b14.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e11){
       String name = t11.getText();
       String password=pa1.getText();
       if(name.equals("Nischal") && password.equals("9860") )
        {
          f1.dispose();//to dispose unused jframe
          Nn fff = new Nn();//calling out anoother jframe if correct 
        }
        else {
          JOptionPane.showMessageDialog(null,"INVALID");
        }
     }
   });
   f1.setContentPane(p11);
   f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   f1.setVisible(true);
 }
 public void actionPerformed(ActionEvent e44){
   f1.dispose();
 }
}
public class Nn implements ActionListener {
  JFrame f;
  JLabel l,l1,l2,l3;
  JTextField t;
  GridLayout g;
  JComboBox c,c1;
  JPanel p,p1;
  JRadioButton r1,r2,r3;
  ButtonGroup bg;
  JButton b1,b2;
  public Nn(){
    f = new JFrame("WINDOW");
    b1 = new JButton("ADD");
    b2 = new JButton("CANCEL");
    String[] a = {"U.S","NEPAL"};
    String[] b = {"BBA","BCIS","BBA-IT"};
    c =new JComboBox(a);
    c1=new JComboBox(b);
    g = new GridLayout(5,2);
    p = new JPanel(g);
    t = new JTextField();
    l = new JLabel("NAME");
    l1 = new JLabel("Gender");
    l2 = new JLabel("Program");
    l3 = new JLabel("Adress");
    r1= new JRadioButton("Male");
    r2 = new JRadioButton("Female");
    r3 = new JRadioButton("Other");
    bg =new ButtonGroup();
    bg.add(r1);bg.add(r2);bg.add(r3);
    p1 = new JPanel();
    p1.add(r1);
    p1.add(r2);
    p1.add(r3);
    f.setSize(500,500);
    p.add(l);
    p.add(t);
    p.add(l1);
    p.add(p1);
    p.add(l3);
    p.add(c);
    p.add(l2);
    p.add(c1);
    p.add(b1);
    p.add(b2);
    b1.addActionListener(this);
    b2.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        f.dispose();//closes at button click
      }
    });
    f.setContentPane(p);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
  public static void main(String[] args){
    new Login();
  }
  public void actionPerformed(ActionEvent e) { //cannot take throws gives exception abstract not implemented
    String s0 = l.getText();
    String s= t.getText();
    String s1 = l1.getText();
    JRadioButton select = null;// for JRadioButton diffrent file input method
    if(r1.isSelected())
      select = r1;
    else if (r2.isSelected())
      select=r2;
    else if (r3.isSelected())
      select= r3;
    String s2 =select.getText();
    String s3 = l2.getText();
    String s4 = c.getSelectedItem().toString();// for JComboBox file input method different or rather reading process is different.
    String s5 = l3.getText();
    String s6 = c1.getSelectedItem().toString();//Jcombobox READING process
    try{
  DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\ABC.txt"));
    dos.writeUTF(s0);
    dos.writeUTF(s);
    dos.writeUTF(s1);
    dos.writeUTF(s2);
    dos.writeUTF(s3);
    dos.writeUTF(s4);
    dos.writeUTF(s5);
    dos.writeUTF(s6);
    dos.close();
  }catch(Exception e1){System.out.println(e1);}
  }
}
