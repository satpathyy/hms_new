
package hmssystem;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


public class Home extends JFrame implements ActionListener {
    Home(){
        setBounds(300,300,1471,984);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hmssystem/icons/home.png"));
        JLabel li = new JLabel(i1);
        li.setBounds(0,0,1420,850);
        add(li);
        
        JButton b1 = new JButton("Login");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.BLACK);
        b1.setBounds(630,750,140,30);
        b1.addActionListener(this);
        li.add(b1);
        
        
        
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        new Loginpage().setVisible(true);
        this.setVisible(false);
    }

    
    public static void main(String[] args) {
        new Home();
      
    }
    
}
