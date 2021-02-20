
package hmssystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Addnewhotel extends JFrame implements ActionListener {
    
    JTextField t1,t2,t3,t4;
    JButton b1;
    
    Addnewhotel(){
        JLabel l1 = new JLabel("Add New Hotel");
        l1.setFont(new Font("Consolas", Font.BOLD, 20));
        l1.setBounds(200,20,250,20);
        add(l1);
        
        JLabel name = new JLabel("NAME OF HOTEL");
        name.setBounds(60,60,120,30);
        add(name);
        
        t1 = new JTextField();
        t1.setBounds(300,60,150,30);
        add(t1);
        
        JLabel address = new JLabel("ADDRESS OF HOTEL");
        address.setBounds(60,100,150,30);
        add(address);
        
        t2 = new JTextField();
        t2.setBounds(300,100,150,30);
        add(t2);
        
        
        JLabel totalrooms = new JLabel("TOTAL ROOMS IN HOTEL");
        totalrooms.setBounds(60,140,160,30);
        add(totalrooms);
        
        t3 = new JTextField();
        t3.setBounds(300,140,150,30);
        add(t3);
        
        JLabel stars = new JLabel("ENTER STAR OF HOTEL");
        stars.setBounds(60,180,150,30);
        add(stars);
        
        t4 = new JTextField();
        t4.setBounds(300,180,150,30);
        add(t4);
        
        b1 = new JButton("ADD HOTEL");
        b1.setBounds(200,230,150,30);
        b1.addActionListener(this);
        add(b1);
       
        
        setLayout(null);
        setBounds(400,200,600,400);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String name = t1.getText();
        String address = t2.getText();
        String totalrooms = t3.getText();
        String stars = t4.getText();
        
        Dbconn e = new Dbconn();
        
        String str = "insert into addhotel values('"+name+"','"+address+"','"+totalrooms+"','"+stars+"')";
        try{
            e.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "New Hotel Added");
            this.setVisible(false);
            
            
        }catch(Exception c){
            System.out.println(c);
               
           
            
        }
    }
    
    public static void main(String[] args){
        new Addnewhotel().setVisible(true);
    
   
    }
    
}
