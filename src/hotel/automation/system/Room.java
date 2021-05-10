package hotel.automation.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.*;

public class Room extends JFrame implements ActionListener {

    JTable t1;
    JButton b1, b2;

    Room() {

        t1 = new JTable();
        t1.setBounds(0, 40, 500, 400);
        add(t1);
        
        JLabel l1=new JLabel("Room Number");
        l1.setBounds(10,10,100,20);
        l1.setForeground(Color.BLUE);
        add(l1);
        
        JLabel l2=new JLabel("Availabity");
        l2.setBounds(120,10,100,20);
        l2.setForeground(Color.BLUE);
        add(l2);
     
        JLabel l3=new JLabel("Status");
        l3.setBounds(230,10,100,20);
        l3.setForeground(Color.BLUE);
        add(l3);
        
        JLabel l4=new JLabel("Price");
        l4.setBounds(330,10,100,20);
        l4.setForeground(Color.BLUE);
        add(l4);

        JLabel l5=new JLabel("Bed Type");
        l5.setBounds(410,10,100,20);
        l5.setForeground(Color.BLUE);
        add(l5);

        b1 = new JButton("LOAD DATA");
        b1.setBounds(100, 480, 120, 30);
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(250, 480, 120, 30);
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/automation/system/icons/eight.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(500, 0, 600, 600);
        add(icon);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(180, 80, 1100, 600);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {

                conn c = new conn();
                String str = "select * from room";

                ResultSet rs = c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
            }
        } else if (ae.getSource() == b2) {
            new Reception().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Room().setVisible(true);
    }
}
