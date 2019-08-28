import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Nn  {
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
    f.setContentPane(p);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
  public static void main(String[] args) throws Exception{
    new Nn();
  }
}
