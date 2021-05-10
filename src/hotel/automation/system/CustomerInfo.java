
package hotel.automation.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class CustomerInfo extends JFrame implements ActionListener {
    
    JTable t1;
    JButton b1,b2;
    
    CustomerInfo(){
 
    t1=new JTable();
    t1.setBounds(0,40,1000,500);
    add(t1);
    
    JLabel l1=new JLabel("Document Type");
    l1.setBounds(15,10,100,20);
    l1.setForeground(Color.BLUE);
    add(l1);
       
    JLabel l2=new JLabel("Number");
    l2.setBounds(160,10,70,20);
    l2.setForeground(Color.BLUE);
    add(l2);
       
    JLabel l3=new JLabel("Name");
    l3.setBounds(290,10,70,20);
    l3.setForeground(Color.BLUE);
    add(l3);
       
    JLabel l4=new JLabel("Gender");
    l4.setBounds(410,10,70,20);
    l4.setForeground(Color.BLUE);
    add(l4);
       
    JLabel l5=new JLabel("Country");
    l5.setBounds(540,10,70,20);
    l5.setForeground(Color.BLUE);
    add(l5);
       
    JLabel l6=new JLabel("Room Number");
    l6.setBounds(640,10,100,20);
    l6.setForeground(Color.BLUE);
    add(l6);
       
    JLabel l7=new JLabel("Status");
    l7.setBounds(790,10,70,20);
    l7.setForeground(Color.BLUE);
    add(l7);
       
    JLabel l8=new JLabel("Deposit");
    l8.setBounds(900,10,70,20);
    l8.setForeground(Color.BLUE);
    add(l8);
        
    b1=new JButton("Load Data");
    b1.setBounds(350,560,120,30);
    b1.addActionListener(this);
    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.WHITE);
    add(b1);
        
    b2=new JButton("Back");
    b2.setBounds(530,560,120,30);
    b2.addActionListener(this);
    b2.setBackground(Color.BLACK);
    b2.setForeground(Color.WHITE);
    add(b2);
    
    getContentPane().setBackground(Color.WHITE);
          
    setLayout(null);
    setBounds(180,70,1000,650);
    setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==b1){
       try{
       conn c=new conn();
       String str="select * from customer";
       ResultSet rs = c.s.executeQuery(str);
       
       t1.setModel(DbUtils.resultSetToTableModel(rs));
       }
       catch(Exception e){}
      }
      else if(ae.getSource()==b2){
        new Reception().setVisible(true);  
        this.setVisible(false);
    }
    }
    
    public static void main(String[] args){
    new CustomerInfo().setVisible(true);
    }
}