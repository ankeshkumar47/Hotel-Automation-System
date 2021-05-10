package hotel.automation.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {

    JMenuBar mb;
    JMenu m1, m2;
    JMenuItem i1, i2, i3, i4;

    Dashboard() {
        
        
        mb = new JMenuBar();
        add(mb);

        m1 = new JMenu("HOTEL MANAGEMENT");
        m1.setForeground(Color.RED);
        mb.add(m1);

        m2 = new JMenu("ADMIN");
        m2.setForeground(Color.BLUE);
        mb.add(m2);

        i1 = new JMenuItem("RECEPTION");
        i1.addActionListener(this);
        m1.add(i1);

        i2 = new JMenuItem("ADD EMPLOYEE");
        i2.addActionListener(this);
        m2.add(i2);

        i3 = new JMenuItem("ADD ROOMS");
        i3.addActionListener(this);
        m2.add(i3);

        i4 = new JMenuItem("ADD DRIVERS");
        i4.addActionListener(this);
        m2.add(i4);

        mb.setBounds(0, 0, 1600, 30);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Hotel/Automation/System/icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1370, 720, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1370, 720);
        add(l1);

        JLabel l2 = new JLabel("HOTEL LANDMARK KANPUR, WELCOMES YOU");
        l2.setBounds(100, 200, 1300, 50);
        l2.setForeground(Color.YELLOW);
        l2.setFont(new Font("Tahoma", Font.BOLD, 50));
        l1.add(l2);

        JLabel l3 = new JLabel("Designed and Created in HBTU,Kanpur");
        l3.setBounds(470, 600, 1300, 50);
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l1.add(l3);
        
        JLabel l4 = new JLabel("© Developed and Maintained By ANKESH KUMAR 2020");
        l4.setBounds(350, 650, 1300, 50);
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l1.add(l4);
                
        setLayout(null);
        setBounds(0, 0, 1370, 750);
        setVisible(true);
     
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("RECEPTION")) {
          new Reception().setVisible(true);
        } else if (ae.getActionCommand().equals("ADD EMPLOYEE")) {
            new AddEmployee().setVisible(true);
        } else if (ae.getActionCommand().equals("ADD ROOMS")) {
            new AddRooms().setVisible(true);
        }else if(ae.getActionCommand().equals("ADD DRIVERS")){
         new AddDriver().setVisible(true);
        }

    }

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }

}
