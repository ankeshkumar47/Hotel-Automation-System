package hotel.automation.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddRooms extends JFrame implements ActionListener {

    JTextField t1, t2;
    JComboBox c1, c2, c3;
    JButton b1, b2;

    AddRooms() {

        JLabel l1 = new JLabel("Add Rooms");
        l1.setBounds(150, 20, 100, 20);
        l1.setFont(new Font("Tahoma", Font.BOLD, 18));
        l1.setForeground(Color.BLUE);
        add(l1);

        JLabel room = new JLabel("Room No.");
        room.setBounds(60, 80, 120, 30);
        room.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(room);

        t1 = new JTextField();
        t1.setBounds(200, 80, 150, 30);
        add(t1);

        JLabel available = new JLabel("Available");
        available.setBounds(60, 130, 120, 30);
        available.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(available);

        c1 = new JComboBox(new String[]{"Available", "Occupied"});
        c1.setBounds(200, 130, 150, 30);
        c1.setBackground(Color.WHITE);
        add(c1);

        JLabel status = new JLabel("Cleaning Status");
        status.setBounds(60, 180, 120, 30);
        status.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(status);

        c2 = new JComboBox(new String[]{"Cleaned", "Dirty"});
        c2.setBounds(200, 180, 150, 30);
        c2.setBackground(Color.WHITE);
        add(c2);

        JLabel price = new JLabel("Price");
        price.setBounds(60, 230, 120, 30);
        price.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(price);

        t2 = new JTextField();
        t2.setBounds(200, 230, 150, 30);
        add(t2);

        JLabel type = new JLabel("Bed Type");
        type.setBounds(60, 280, 120, 30);
        type.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(type);

        c3 = new JComboBox(new String[]{"Single Bed", "Double Bed"});
        c3.setBounds(200, 280, 150, 30);
        c3.setBackground(Color.WHITE);
        add(c3);

        b1 = new JButton("ADD ROOMS");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(60, 350, 130, 30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CANCEL");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(220, 350, 130, 30);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/automation/system/icons/twelve.jpg"));
        JLabel l2 = new JLabel(i1);
        l2.setBounds(400, 30, 500, 350);
        add(l2);

        getContentPane().setBackground(Color.WHITE);

        setBounds(200, 150, 940, 470);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==b1)
    { String room=t1.getText();
      String available=(String)c1.getSelectedItem();
      String status=(String)c2.getSelectedItem();
      String price=t2.getText();
      String type=(String)c3.getSelectedItem();
      
      conn c=new conn();
      try{
       String str ="insert into room values('"+room+"','"+available+"','"+status+"','"+price+"','"+type+"')";
       c.s.executeUpdate(str);
       JOptionPane.showMessageDialog(null,"New Rooms Successfully Added");
       this.setVisible(false);
      }
      
      catch(Exception e){}
      
      
      
    }
    else if(ae.getSource()==b2)
    { this.setVisible(false);
    }
    
    }

    public static void main(String[] args) {
        new AddRooms().setVisible(true);
    }
}
