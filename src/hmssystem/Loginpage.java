
package hmssystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


Hello I got Misconduct



public class Loginpage extends JFrame implements ActionListener {
    
    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    
    Loginpage(){
       
        l1 = new JLabel("Enter Name");
        l1.setBounds(40,20,100,30);
        add(l1);
        
        l2 = new JLabel("Enter Password");
        l2.setBounds(40,70,100,30);
        add(l2);
        
        t1 = new JTextField();
        t1.setBounds(150,20,150,30);
        add(t1);
        
        t2= new JPasswordField();
        t2.setBounds(150,70,150,30);
        add(t2);
        
        b1= new JButton("Login");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(40,150,120,30);
        b1.addActionListener(this);
        add(b1);
        
        b2= new JButton("Cancel");
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.setBounds(180,150,120,30);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hmssystem/icons/usericon.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l3 = new JLabel(i3);
        l3.setBounds(400,10,150,200);
        add(l3);
        
        
        
        
        setLayout(null);
        
        setBounds(500,300,600,300);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
            String username = t1.getText();
            String password = t2.getText();
            Dbconn c = new Dbconn();
            
            String str = "select * from login where username = '"+username+"' and password = '"+password+"'";
            try{
                 ResultSet rs = c.s.executeQuery(str);
                 
                 if(rs.next()){
                     new Searchpage().setVisible(true);
                     this.setVisible(false);
                 }else{
                     JOptionPane.showMessageDialog(null,"Invalid Username Or Password");
                     this.setVisible(false);
                 }
                
            }catch(Exception e){
                
            }
           
            
        }else if(ae.getSource()==b2){
            System.exit(0);
        }
        
    }
    
    public static void main(String[] args){
        new Loginpage();
        
    }
    
}
