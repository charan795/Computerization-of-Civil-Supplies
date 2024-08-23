package civil1.java;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.event.*;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
public class Pwdialog1 extends JDialog implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6;
	static JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
	static JTable tb1,tb2,tb3,tb4;
	static String username = "Mysql@localhost:3306";
    static String password = "";
    static String url = "jdbc:mysql://localhost:3306/test";
    static Statement st;
    static Connection con;
	Pwdialog1(JFrame f)
	{
	super(f,"MASTER",true);
	b1=new JButton("exit");
	b2=new JButton("add");
	b3=new JButton("view");
	b4=new JButton("update");
	b5=new JButton("delete");
	b6=new JButton("save");
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
	tb1=new JTable(6,1);
	tb2=new JTable(6,1);
	tb3=new JTable(6,1);
	tb4=new JTable(6,1);
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
	add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);
	add(l15);add(tb1);add(l16);add(tb2);add(l17);add(tb3);add(l18);add(tb4);
	b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
	setSize(700,500);
	setVisible(false);
	setLayout(new FlowLayout(0,50,10));
	}
	public void showJDialog()
	{
	setVisible(true);
	}
	
	public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url,username,password);
        }
        catch(java.lang.ClassNotFoundException e){
            System.err.println(e.getMessage());
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        return con;
    }
	 public static void createTable() {
		 con=getConnection();
		   try{
		      System.out.println("Creating table in given database...");
		      st = (Statement) con.createStatement();
		      
		      String sql = "CREATE TABLE mastertable " +
		                   "(rno int(7) not NULL,chno int(7) not NULL,pc int(3) not NULL,doi date not NULL,shno varchar(5) not NULL,dolp date, " +
		                   "  ana varchar(1) not NULL,chadd varchar(50) not NULL,inc int(9) not NULL,nocyl int(1) not NULL,ad int(2) not NULL,maj int(2),min int(2)," + 
		                   " nom1 varchar(30) not NULL,nom2 varchar(30),nom3 varchar(30),nom4 varchar(30),nom5 varchar(30),nom6 varchar(30),  " + 
		                   " som1 varchar(4) not NULL,som2 varchar(4),som3 varchar(4),som4 varchar(4),som5 varchar(4),som6 varchar(4), " + 
		                   " aom1 varchar(4) not NULL,aom2 varchar(4),aom3 varchar(4),aom4 varchar(4),aom5 varchar(4),aom6 varchar(4),"+
		                   " rom1 varchar(30),rom2 varchar(30),rom3 varchar(30),rom4 varchar(30),rom5 varchar(30),rom6 varchar(30),"+
		                   "PRIMARY KEY ( rno,chno ))"; 

		      st.executeUpdate(sql);
		      System.out.println("Created table in given database...");
		   }catch(SQLException se){
		      se.printStackTrace();
		   }catch(Exception e){
		      e.printStackTrace();
		   }finally{
		      try{
		         if(st!=null)
		            con.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(con!=null)
		            con.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
		}
	 public static void insertRecord(){
	        con = getConnection();
	        String q = "Insert into mastertable Values('" + t1.getText() +"','" + t2.getText() +"','" + t3.getText() +"','" + t4.getText() +"','" + t5.getText() +"','" + t6.getText() +"','" + t7.getText() +"','" + t8.getText() +"','" + t9.getText() +"','" + t10.getText() +"','" + t11.getText() +"','" + t12.getText() +"','" + t13.getText() +"','" + tb1.getValueAt(0,0) +"','" + tb1.getValueAt(1,0) +"','" + tb1.getValueAt(2,0) +"','" + tb1.getValueAt(3,0) +"','" + tb1.getValueAt(4,0) +"','" + tb1.getValueAt(5,0) +"','" + tb2.getValueAt(0,0) +"','" + tb2.getValueAt(1,0) +"','" + tb2.getValueAt(2,0) +"','" + tb2.getValueAt(3,0) +"','" + tb2.getValueAt(4,0) +"','" + tb2.getValueAt(5,0) +"','" + tb3.getValueAt(0,0) +"','" + tb3.getValueAt(1,0) +"','" + tb3.getValueAt(2,0) +"','" + tb3.getValueAt(3,0) +"','" + tb3.getValueAt(4,0) +"','" + tb3.getValueAt(5,0) +"','" + tb4.getValueAt(0,0) +"','" + tb4.getValueAt(1,0) +"','" + tb4.getValueAt(2,0) +"','" + tb4.getValueAt(3,0) +"','" + tb4.getValueAt(4,0) +"','" + tb4.getValueAt(5,0) +"')";
	        try{
	            st= (Statement) con.createStatement();
	            st.executeUpdate(q);
	            st.close();
	            con.close();
	        }
	        catch(SQLException ex){
	            System.err.println(ex.getMessage());
	        }
	        JOptionPane.showMessageDialog(null,"Successfully inserted a record!");
	        t1.setText("");
	        t2.setText("");t3.setText("");t4.setText("");
	        t5.setText("");t6.setText("");t7.setText("");
	        t8.setText("");t9.setText("");t10.setText("");
	        t11.setText("");t12.setText("");t13.setText("");
	        tb1.setValueAt("",0,0);
	        tb1.setValueAt("",1,0);
	        tb1.setValueAt("",2,0);
	        tb1.setValueAt("",3,0);
	        tb1.setValueAt("",4,0);
	        tb1.setValueAt("",5,0);
	        tb2.setValueAt("",0,0);
	        tb2.setValueAt("",1,0);
	        tb2.setValueAt("",2,0);
	        tb2.setValueAt("",3,0);
	        tb2.setValueAt("",4,0);
	        tb2.setValueAt("",5,0);
	        tb3.setValueAt("",0,0);
	        tb3.setValueAt("",1,0);
	        tb3.setValueAt("",2,0);
	        tb3.setValueAt("",3,0);
	        tb3.setValueAt("",4,0);
	        tb3.setValueAt("",5,0);
	        tb4.setValueAt("",0,0);
	        tb4.setValueAt("",1,0);
	        tb4.setValueAt("",2,0);
	        tb4.setValueAt("",3,0);
	        tb4.setValueAt("",4,0);
	        tb4.setValueAt("",5,0);
	     }
	 public static void viewDetails() {
		con=getConnection();
		   try{
		      System.out.println("Creating statement...");
		      st = (Statement) con.createStatement();
		      String sql = "SELECT * from mastertable where rno like '" + t1.getText() + "'";
		      ResultSet rs = st.executeQuery(sql);
		      while(rs.next()){
			        t2.setText(rs.getString("chno"));t3.setText(rs.getString("pc"));t4.setText(rs.getString("doi"));
			        t5.setText(rs.getString("shno"));t6.setText(rs.getString("dolp"));t7.setText(rs.getString("ana"));
			        t8.setText(rs.getString("chadd"));t9.setText(rs.getString("inc"));t10.setText(rs.getString("nocyl"));
			        t11.setText(rs.getString("ad"));t12.setText(rs.getString("maj"));t13.setText(rs.getString("min"));
			        tb1.setValueAt(rs.getString("nom1"),0,0);
			        if(rs.getString("nom2")!=null)
			        tb1.setValueAt(rs.getString("nom2"),1,0);
			        else
			        	tb1.setValueAt("",1, 0);
			        if(rs.getString("nom3")!=null)
			        tb1.setValueAt(rs.getString("nom3"),2,0);
			        else
			        	tb1.setValueAt("",2, 0);
			        if(rs.getString("nom4")!=null)
			        tb1.setValueAt(rs.getString("nom4"),3,0);
			        else
			        	tb1.setValueAt("",3, 0);
			        if(rs.getString("nom5")!=null)
			        tb1.setValueAt(rs.getString("nom5"),4,0);
			        else
			        	tb1.setValueAt("",4, 0);
			        if(rs.getString("nom6")!=null)
			        tb1.setValueAt(rs.getString("nom6"),5,0);
			        else
			        	tb1.setValueAt("",5, 0);
			        tb2.setValueAt(rs.getString("som1"),0,0);
			        if(rs.getString("som2")!=null)
			        tb2.setValueAt(rs.getString("som2"),1,0);
			        else
			        	tb2.setValueAt("",1, 0);
			        if(rs.getString("som3")!=null)
			        tb2.setValueAt(rs.getString("som3"),2,0);
			        else
			        	tb2.setValueAt("",2, 0);
			        if(rs.getString("som4")!=null)
			        tb2.setValueAt(rs.getString("som4"),3,0);
			        else
			        	tb2.setValueAt("",3, 0);
			        if(rs.getString("som5")!=null)
			        tb2.setValueAt(rs.getString("som5"),4,0);
			        else
			        	tb2.setValueAt("",4, 0);
			        if(rs.getString("som6")!=null)
			        tb2.setValueAt(rs.getString("som6"),5,0);
			        else
			        	tb2.setValueAt("",5, 0);
			        tb3.setValueAt(rs.getString("aom1"),0,0);
			        if(rs.getString("aom2")!=null)
			        tb3.setValueAt(rs.getString("aom2"),1,0);
			        else
			        	tb3.setValueAt("",1, 0);
			        if(rs.getString("aom3")!=null)
			        tb3.setValueAt(rs.getString("aom3"),2,0);
			        else
			        	tb3.setValueAt("",2, 0);
			        if(rs.getString("aom4")!=null)
			        tb3.setValueAt(rs.getString("aom4"),3,0);
			        else
			        	tb3.setValueAt("",3, 0);
			        if(rs.getString("aom5")!=null)
			        tb3.setValueAt(rs.getString("aom5"),4,0);
			        else
			        	tb3.setValueAt("",4, 0);
			        if(rs.getString("aom6")!=null)
			        tb3.setValueAt(rs.getString("aom6"),5,0);
			        else
			        	tb3.setValueAt("",5, 0);
			        tb4.setValueAt(rs.getString("rom1"),0,0);
			        if(rs.getString("rom2")!=null)
			        tb4.setValueAt(rs.getString("rom2"),1,0);
			        else
			        	tb4.setValueAt("",1, 0);
			        if(rs.getString("rom3")!=null)
			        tb4.setValueAt(rs.getString("rom3"),2,0);
			        else
			        	tb4.setValueAt("",2, 0);
			        if(rs.getString("rom4")!=null)
			        tb4.setValueAt(rs.getString("rom4"),3,0);
			        else
			        	tb4.setValueAt("",3, 0);
			        if(rs.getString("rom5")!=null)	
  			        tb4.setValueAt(rs.getString("rom5"),4,0);
			        else
			        	tb4.setValueAt("",4, 0);
			        if(rs.getString("rom6")!=null)
			        tb4.setValueAt(rs.getString("rom6"),5,0);
			        else
			        	tb4.setValueAt("",5, 0);
		      }
		      rs.close();
		   }catch(SQLException se){
		      se.printStackTrace();
		   }catch(Exception e){
		      e.printStackTrace();
		   }finally{
		      try{
		         if(st!=null)
		            con.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(con!=null)
		            con.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
	 }
	 public static void updateDetails() {
		  con=getConnection();
		   try{
		      System.out.println("Creating statement...");
		      st = (Statement) con.createStatement();
		      String sql = "Update mastertable set chno = '" + t2.getText() +"',pc = '" + t3.getText() +"', doi= '" + t4.getText() +"', shno= '" + t5.getText() +"',dolp = '" + t6.getText() +"',ana = '" + t7.getText() +"',"+
		      "chadd = '" + t8.getText() +"',inc = '" + t9.getText() +"',nocyl = '" + t10.getText() +"',ad = '" + t11.getText() +"',maj = '" + t12.getText() +"',min = '" + t13.getText() +"',"+
		    		  "nom1='"+tb1.getValueAt(0,0)+"',nom2='"+tb1.getValueAt(1,0)+"',nom3='"+tb1.getValueAt(2,0)+"',nom4='"+tb1.getValueAt(3,0)+"',nom5='"+tb1.getValueAt(4,0)+"',nom6='"+tb1.getValueAt(5,0)+"',"+
		      "som1='"+tb2.getValueAt(0,0)+"',som2='"+tb2.getValueAt(1,0)+"',som3='"+tb2.getValueAt(2,0)+"',som4='"+tb2.getValueAt(3,0)+"',som5='"+tb2.getValueAt(4,0)+"',som6='"+tb2.getValueAt(5,0)+"',"+
		    		  "aom1='"+tb3.getValueAt(0,0)+"',aom2='"+tb3.getValueAt(1,0)+"',aom3='"+tb3.getValueAt(2,0)+"',aom4='"+tb3.getValueAt(3,0)+"',aom5='"+tb3.getValueAt(4,0)+"',aom6='"+tb3.getValueAt(5,0)+"',"+
		      "rom1='"+tb4.getValueAt(0,0)+"',rom2='"+tb4.getValueAt(1,0)+"',rom3='"+tb4.getValueAt(2,0)+"',rom4='"+tb4.getValueAt(3,0)+"',rom5='"+tb4.getValueAt(4,0)+"',rom6='"+tb4.getValueAt(5,0)+"'where rno = '" + t1.getText() + "'" ;
		      st.executeUpdate(sql);
		      sql = "SELECT * from mastertable";
		      ResultSet rs = st.executeQuery(sql);

		      while(rs.next()){
		    	  t2.setText(rs.getString("chno"));t3.setText(rs.getString("pc"));t4.setText(rs.getString("doi"));
			        t5.setText(rs.getString("shno"));t6.setText(rs.getString("dolp"));t7.setText(rs.getString("ana"));
			        t8.setText(rs.getString("chadd"));t9.setText(rs.getString("inc"));t10.setText(rs.getString("nocyl"));
			        t11.setText(rs.getString("ad"));t12.setText(rs.getString("maj"));t13.setText(rs.getString("min"));
			        tb1.setValueAt(rs.getString("nom1"),0,0);
			        tb1.setValueAt(rs.getString("nom2"),1,0);
			        tb1.setValueAt(rs.getString("nom3"),2,0);
			        tb1.setValueAt(rs.getString("nom4"),3,0);
			        tb1.setValueAt(rs.getString("nom5"),4,0);
			        tb1.setValueAt(rs.getString("nom6"),5,0);
			        tb2.setValueAt(rs.getString("som1"),0,0);
			        tb2.setValueAt(rs.getString("som2"),1,0);
			        tb2.setValueAt(rs.getString("som3"),2,0);
			        tb2.setValueAt(rs.getString("som4"),3,0);
			        tb2.setValueAt(rs.getString("som5"),4,0);
			        tb2.setValueAt(rs.getString("som6"),5,0);
			        tb3.setValueAt(rs.getString("aom1"),0,0);
			        tb3.setValueAt(rs.getString("aom2"),1,0);
			        tb3.setValueAt(rs.getString("aom3"),2,0);
			        tb3.setValueAt(rs.getString("aom4"),3,0);
			        tb3.setValueAt(rs.getString("aom5"),4,0);
			        tb3.setValueAt(rs.getString("aom6"),5,0);
			        tb4.setValueAt(rs.getString("rom1"),0,0);
			        tb4.setValueAt(rs.getString("rom2"),1,0);
			        tb4.setValueAt(rs.getString("rom3"),2,0);
			        tb4.setValueAt(rs.getString("rom4"),3,0);
			        tb4.setValueAt(rs.getString("rom5"),4,0);
			        tb4.setValueAt(rs.getString("rom6"),5,0); 
		      }
		      rs.close();
		   }catch(SQLException se){
		      se.printStackTrace();
		   }catch(Exception e){
		      e.printStackTrace();
		   }finally{
		      try{
		         if(st!=null)
		            con.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(con!=null)
		            con.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
		}
	 public static void deleteDetails()
	 {
	con=getConnection();
	   try{
	      System.out.println("Creating statement...");
	      st = (Statement) con.createStatement();
	      String sql = "delete from mastertable " +
	                   "where rno ='" + t1.getText() + "' ";
	      st.executeUpdate(sql);
	      sql = "select * from mastertable";
	      ResultSet rs = st.executeQuery(sql);
	      while(rs.next()){
	    	  t2.setText(rs.getString("chno"));t3.setText(rs.getString("pc"));t4.setText(rs.getString("doi"));
		        t5.setText(rs.getString("shno"));t6.setText(rs.getString("dolp"));t7.setText(rs.getString("ana"));
		        t8.setText(rs.getString("chadd"));t9.setText(rs.getString("inc"));t10.setText(rs.getString("nocyl"));
		        t11.setText(rs.getString("ad"));t12.setText(rs.getString("maj"));t13.setText(rs.getString("min"));
		        tb1.setValueAt(rs.getString("nom1"),0,0);
		        tb1.setValueAt(rs.getString("nom2"),1,0);
		        tb1.setValueAt(rs.getString("nom3"),2,0);
		        tb1.setValueAt(rs.getString("nom4"),3,0);
		        tb1.setValueAt(rs.getString("nom5"),4,0);
		        tb1.setValueAt(rs.getString("nom6"),5,0);
		        tb2.setValueAt(rs.getString("som1"),0,0);
		        tb2.setValueAt(rs.getString("som2"),1,0);
		        tb2.setValueAt(rs.getString("som3"),2,0);
		        tb2.setValueAt(rs.getString("som4"),3,0);
		        tb2.setValueAt(rs.getString("som5"),4,0);
		        tb2.setValueAt(rs.getString("som6"),5,0);
		        tb3.setValueAt(rs.getString("aom1"),0,0);
		        tb3.setValueAt(rs.getString("aom2"),1,0);
		        tb3.setValueAt(rs.getString("aom3"),2,0);
		        tb3.setValueAt(rs.getString("aom4"),3,0);
		        tb3.setValueAt(rs.getString("aom5"),4,0);
		        tb3.setValueAt(rs.getString("aom6"),5,0);
		        tb4.setValueAt(rs.getString("rom1"),0,0);
		        tb4.setValueAt(rs.getString("rom2"),1,0);
		        tb4.setValueAt(rs.getString("rom3"),2,0);
		        tb4.setValueAt(rs.getString("rom4"),3,0);
		        tb4.setValueAt(rs.getString("rom5"),4,0);
		        tb4.setValueAt(rs.getString("rom6"),5,0);
	      }
	      rs.close();
	   }catch(SQLException se){
	      se.printStackTrace();
	   }catch(Exception e){
	      e.printStackTrace();
	   }finally{
	      try{
	         if(st!=null)
	            con.close();
	      }catch(SQLException se){
	      }
	      try{
	         if(con!=null)
	            con.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }
	   }
	   }
	 public static void saveDetails(){
	        con = getConnection();
	        try{
	            st= (Statement) con.createStatement();
	            st.close();
	            con.close();
	        }
	        catch(SQLException ex){
	            System.err.println(ex.getMessage());
	        }
	        JOptionPane.showMessageDialog(null,"saved successfully");
	        t1.setText("");
	        t2.setText("");t3.setText("");t4.setText("");
	        t5.setText("");t6.setText("");t7.setText("");
	        t8.setText("");t9.setText("");t10.setText("");
	        t11.setText("");t12.setText("");t13.setText("");
	        tb1.setValueAt("",0,0);
	        tb1.setValueAt("",1,0);
	        tb1.setValueAt("",2,0);
	        tb1.setValueAt("",3,0);
	        tb1.setValueAt("",4,0);
	        tb1.setValueAt("",5,0);
	        tb2.setValueAt("",0,0);
	        tb2.setValueAt("",1,0);
	        tb2.setValueAt("",2,0);
	        tb2.setValueAt("",3,0);
	        tb2.setValueAt("",4,0);
	        tb2.setValueAt("",5,0);
	        tb3.setValueAt("",0,0);
	        tb3.setValueAt("",1,0);
	        tb3.setValueAt("",2,0);
	        tb3.setValueAt("",3,0);
	        tb3.setValueAt("",4,0);
	        tb3.setValueAt("",5,0);
	        tb4.setValueAt("",0,0);
	        tb4.setValueAt("",1,0);
	        tb4.setValueAt("",2,0);
	        tb4.setValueAt("",3,0);
	        tb4.setValueAt("",4,0);
	        tb4.setValueAt("",5,0);
	     }
	public void actionPerformed(ActionEvent ae)
	{
		//createTable();
	if(ae.getSource()==b1)
	setVisible(false);
	if(ae.getSource()==b2)
	    insertRecord();
	if(ae.getSource()==b3)
		viewDetails();
	if(ae.getSource()==b4)
		updateDetails();
	if(ae.getSource()==b5)
		deleteDetails();
	if(ae.getSource()==b6)
		saveDetails();
	}
}
