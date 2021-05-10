package hotel.automation.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HotelAutomationSystem extends JFrame implements ActionListener{

    public HotelAutomationSystem() {
        setBounds(5, 100, 1366, 565);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/automation/system/icons/first.jpg"));
        JLabel l1 = new JLabel(i1);
        setLayout(null);
        l1.setBounds(0, 0, 1366, 565);
        add(l1);
        
        JLabel l2 = new JLabel("HOTEL AUTOMATION SYSTEM");
        l2.setBounds(20, 440, 1000, 70);
        l2.setForeground(Color.cyan);
        l2.setFont(new Font("serif", Font.PLAIN, 50));
        l1.add(l2);
        
        JButton b1 = new JButton("NEXT");
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.WHITE);
        b1.setBounds(940, 450, 150, 30);
        b1.addActionListener(this);
        l1.add(b1);
        
        setVisible(true);
        while (true) {
            l2.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            l2.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
    
    public void actionPerformed(ActionEvent e)
    {
        new Login().setVisible(true);
        this.setVisible(false);
    }

    public static void main(String[] args) {
        new HotelAutomationSystem();
    }

}
