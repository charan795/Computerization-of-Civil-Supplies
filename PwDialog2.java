package civil1.java;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class PwDialog2 extends JDialog implements ActionListener
{
	JButton b2,b3;JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;JTable t3,t4,t5,t6,t7,t8;JTextField t1,t2;
	PwDialog2(JFrame f)
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
