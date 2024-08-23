package civil1.java;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class pDialog4 extends JDialog implements ActionListener{
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
