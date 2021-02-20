package hmssystem;
import javax.swing.*;
import java.awt.*;



public class Searchbyname extends JFrame {
    
    JTextField t1;
    JButton b1;
    
    Searchbyname(){
        
        JLabel l1 = new JLabel("Search Hotel By Name");
        l1.setFont(new Font("Consolas", Font.BOLD, 20));
        l1.setBounds(200,20,250,20);
        add(l1);
        
        
        JLabel address = new JLabel("Enter Hotel Name");
        address.setBounds(160,85,120,30);
        add(address);
        
        t1 = new JTextField();
        t1.setBounds(300,85,170,30);
        add(t1);
        
        b1 = new JButton("Search Hotel");
        b1.setBounds(220,160,150,30);
        add(b1);
        
        setBounds(450,200,600,300);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Searchbyname().setVisible(true);
    }
    
}