package civil1.java;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
public class PwDialog3 extends JDialog implements ActionListener {
	JButton b1,b2,b3,b4,b5;
	JLabel l1,l2,l3,l4,l5,l6;
	pDialog1 p1;pDialog2 p2;pDialog3 p3;pDialog4 p4;
	PwDialog3(JFrame f)
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
