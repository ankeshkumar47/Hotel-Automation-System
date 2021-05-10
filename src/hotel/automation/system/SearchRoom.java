
package hotel.automation.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;

public class SearchRoom extends JFrame implements ActionListener{
    JComboBox c1;
    JCheckBox c2;
    JButton b1,b2;
    JTable t1;
    
    SearchRoom(){
        
        JLabel l1=new JLabel("SEARCH FOR ROOMS");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l1.setForeground(Color.BLUE);
        l1.setBounds(380, 30, 200, 30);
        add(l1);
        
        JLabel l2=new JLabel("Room Bed Type");
        l2.setBounds(50,100,100,20);
        add(l2);
        
        c1=new JComboBox(new String[]{"Single Bed","Double Bed"});
        c1.setBounds(150,100,150,25);
        c1.setBackground(Color.WHITE);
        add(c1);
        
        c2=new JCheckBox("Only Display Available");
        c2.setBounds(650,100,150,25);
        c2.setBackground(Color.WHITE);
        add(c2);
    
        t1=new JTable();
        t1.setBounds(0,200,1000,300);
        add(t1);
        
        b1=new JButton("SUBMIT");
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setBounds(350,520,120,30);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("BACK");
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setBounds(500,520,120,30);
        b2.addActionListener(this);
        add(b2);
        
        JLabel l3=new JLabel("Room Number");
        l3.setBounds(50,160,100,20);
        l3.setForeground(Color.BLUE);
        add(l3);
        
        JLabel l4=new JLabel("Availability");
        l4.setBounds(270,160,100,20);
        l4.setForeground(Color.BLUE);
        add(l4);
        
        JLabel l5=new JLabel("Cleaning Status");
        l5.setBounds(450,160,100,20);
        l5.setForeground(Color.BLUE);
        add(l5);
        
        JLabel l6=new JLabel("Price");
        l6.setBounds(670,160,100,20);
        l6.setForeground(Color.BLUE);
        add(l6);
        
        JLabel l7=new JLabel("Bed Type");
        l7.setBounds(870,160,100,20);
        l7.setForeground(Color.BLUE);
        add(l7);
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setBounds(200,70,1000,650);
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
    
        if(ae.getSource()==b1){
         String type=(String)c1.getSelectedItem();
            try{ 
                String str="select * from room where bed_type='"+type+"'";
                String str2="select * from room where available = 'Available' AND bed_type='"+type+"'";
                conn c=new conn();
                ResultSet rs;
                
                if(c2.isSelected())
                { rs=c.s.executeQuery(str2);
                t1.setModel(DbUtils.resultSetToTableModel(rs));
                }           
                else{
                rs=c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs));
                }
            
            }catch(Exception e){}
        }
        else if(ae.getSource()==b2){
         new Reception().setVisible(true);
         this.setVisible(false);    
        }
    }
    
    public static void main(String[] args){
    new SearchRoom().setVisible(true);
    }
    
}
