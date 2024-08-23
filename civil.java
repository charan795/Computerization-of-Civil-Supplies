import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class civil extends JFrame implements ActionListener
{
JButton b1,b2,b3,b4;JLabel l1,l2,l3,l4,l5,l6;
pwDialog1 p1;pwDialog2 p2;pwDialog3 p3;FlowLayout f1;
civil()
{
super("MAIN");
b1=new JButton("1");
b2=new JButton("2");
b3=new JButton("3");
b4=new JButton("4");
l1=new JLabel("Master Entry");
l2=new JLabel("Transaction Entry");
l3=new JLabel("Report");
l4=new JLabel("Exit");
l5=new JLabel("CIVIL SUPPLIES CORPORATION Main -Menu");
//l6=new JLabel("Main - Menu");
add(l5);//add(l6);
add(b1);add(l1);
add(b2);add(l2);
add(b3);add(l3);
add(b4);add(l4);
setSize(400,400);
setVisible(true);
setLayout(new FlowLayout(1,100,10));
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if((JButton)e.getSource()==b1)
{
p1=new pwDialog1(this);
p1.showJDialog();
}
if((JButton)e.getSource()==b2)
{
p2=new pwDialog2(this);
p2.showJDialog();
}
if((JButton)e.getSource()==b3)
{
p3=new pwDialog3(this);
p3.showJDialog();
}
if((JButton)e.getSource()==b4)
System.exit(0);
}
public static void main(String args[])
{
civil c=new civil();
}
}
class pwDialog1 extends JDialog implements ActionListener
{
JButton b1;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
JTable tb1,tb2,tb3,tb4;
pwDialog1(JFrame f)
{
super(f,"MASTER",true);
b1=new JButton("exit");
t1=new JTextField(10);t2=new JTextField(10);t3=new JTextField(10);
t4=new JTextField(10);t5=new JTextField(10);t6=new JTextField(10);
t7=new JTextField(10);t8=new JTextField(20);
t9=new JTextField(10);t10=new JTextField(10);
t11=new JTextField(10);t12=new JTextField(10);t13=new JTextField(10);
l1=new JLabel("Ration Card No");l2=new JLabel("Card Holder No");l3=new JLabel("Purchase Code");
l4=new JLabel("Date of Issue");l5=new JLabel("Shop No");l6=new JLabel("Date Last Purchased");
l7=new JLabel("Active/NonActive");l8=new JLabel("Card Holder Address");
l9=new JLabel("Income");l10=new JLabel("No of Cylinders");
l11=new JLabel("Adult");l12=new JLabel("Major");l13=new JLabel("Minor");
l14=new JLabel("CIVIL SUPPLIES CORPORATION");
l15=new JLabel("Name of the member");
l16=new JLabel("Sex");
l17=new JLabel("Age");
l18=new JLabel("Relation");
t1.setEditable(true);
t2.setEditable(true);
t3.setEditable(true);
t4.setEditable(true);
t5.setEditable(true);
t6.setEditable(true);
t7.setEditable(true);
t8.setEditable(true);
t9.setEditable(true);
t10.setEditable(true);
t11.setEditable(true);
t12.setEditable(true);
t13.setEditable(true);
tb1=new JTable(10,1);
tb2=new JTable(10,1);
tb3=new JTable(10,1);
tb4=new JTable(10,1);
add(l14);
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
add(l4);add(t4);
add(l5);add(t5);
add(l6);add(t6);
add(l7);add(t7);
add(l8);add(t8);
add(l9);add(t9);
add(l10);add(t10);
add(l11);add(t11);
add(l12);add(t12);
add(l13);add(t13);
add(b1);
add(l15);add(tb1);add(l16);add(tb2);add(l17);add(tb3);add(l18);add(tb4);
b1.addActionListener(this);
setSize(300,300);
setVisible(false);
setLayout(new FlowLayout(0,50,10));
}
public void showJDialog()
{
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
setVisible(false);
}
}
class pwDialog2 extends JDialog implements ActionListener
{
JButton b2,b3;JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;JTable t3,t4,t5,t6,t7,t8;JTextField t1,t2;
pwDialog2(JFrame f)
{
super(f,"TRANSACTION",true);
b2=new JButton("Exit");
b3=new JButton("Add");
l1=new JLabel("Date of Purchase");
l2=new JLabel("CIVIL SUPPLIES CORPORATION");l3=new JLabel("Serial Num");l4=new JLabel("Card Num");l5=new JLabel("Product Num");
l6=new JLabel("Product Description");l7=new JLabel("Quantity");l8=new JLabel("Amount");
l9=new JLabel("Total Amount");
t1=new JTextField(10);
t2=new JTextField(10);
t3=new JTable(10,1);t4=new JTable(10,1);t5=new JTable(10,1);t6=new JTable(10,1);t7=new JTable(10,1);t8=new JTable(10,1);
add(l2);add(l1);add(t1);add(b3);add(l3);add(t3);add(l4);add(t4);add(l5);add(t5);add(l6);add(t6);add(l7);add(t7);add(l8);add(t8);add(l9);add(t2);add(b2);
b2.addActionListener(this);
setSize(300,300);
setVisible(false);
setLayout(new FlowLayout(1,50,10));
}
public void showJDialog()
{
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b2)
setVisible(false);
}
}
class pwDialog3 extends JDialog implements ActionListener
{
JButton b1,b2,b3,b4,b5;
JLabel l1,l2,l3,l4,l5,l6;
pDialog1 p1;pDialog2 p2;pDialog3 p3;pDialog4 p4;
pwDialog3(JFrame f)
{
super(f,"REPORT",true);
l1=new JLabel("Customer Wise Reports(Daily)");
l2=new JLabel("Customer Wise Reports(Monthly)");
l3=new JLabel("Product Wise Reports(Daily)");
l4=new JLabel("Product Wise Reports(Monthly)");
l5=new JLabel("Exit");
l6=new JLabel("CIVIL SUPPLIES CORPORATION Report - Menu");
b1=new JButton("1");
b2=new JButton("2");
b3=new JButton("3");
b4=new JButton("4");
b5=new JButton("5");
add(l6);add(b1);add(l1);
add(b2);add(l2);
add(b3);add(l3);
add(b4);add(l4);
add(b5);add(l5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
setSize(300,300);
setVisible(false);
setLayout(new FlowLayout(1,100,10));
}
public void showJDialog()
{
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if((JButton)ae.getSource()==b1)
{
p1=new pDialog1(this);
p1.showJDialog();
}
if((JButton)ae.getSource()==b2)
{
p2=new pDialog2(this);
p2.showJDialog();
}
if((JButton)ae.getSource()==b3)
{
p3=new pDialog3(this);
p3.showJDialog();
}
if((JButton)ae.getSource()==b4)
{
p4=new pDialog4(this);
p4.showJDialog();
}
if(ae.getSource()==b5)
setVisible(false);
}
}
class pDialog1 extends JDialog implements ActionListener
{
JButton b1;
pDialog1(JDialog d)
{
super(d,"dialog1",true);
b1=new JButton("exit");
add(b1);
b1.addActionListener(this);
setSize(300,400);
setVisible(false);
setLayout(new FlowLayout());
}
public void showJDialog()
{
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
setVisible(false);
}
}
class pDialog2 extends JDialog implements ActionListener
{
JButton b1;
pDialog2(JDialog d)
{
super(d,"dialog2",true);
b1=new JButton("exit");
add(b1);
b1.addActionListener(this);
setSize(300,400);
setVisible(false);
setLayout(new FlowLayout());
}
public void showJDialog()
{
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
setVisible(false);
}
}
class pDialog3 extends JDialog implements ActionListener
{
JButton b1;
pDialog3(JDialog d)
{
super(d,"dialog1",true);
b1=new JButton("exit");
add(b1);
b1.addActionListener(this);
setSize(300,400);
setVisible(false);
setLayout(new FlowLayout());
}
public void showJDialog()
{
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
setVisible(false);
}
}
class pDialog4 extends JDialog implements ActionListener
{
JButton b1;
pDialog4(JDialog d)
{
super(d,"dialog1",true);
b1=new JButton("exit");
add(b1);
b1.addActionListener(this);
setSize(300,400);
setVisible(false);
setLayout(new FlowLayout());
}
public void showJDialog()
{
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
setVisible(false);
}
}
 
