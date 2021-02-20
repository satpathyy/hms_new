
package hmssystem;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


public class Searchpage extends JFrame implements ActionListener {
    
    JMenuBar mb;
    JMenu m1,m2;
    JMenuItem i1,i2,i3,i4,i5;
    
    Searchpage(){
        
        mb = new JMenuBar();
        mb.setForeground(Color.WHITE);
        add(mb);
        
        m1 = new JMenu("Search Hotels");
        m1.setForeground(Color.WHITE);
        mb.add(m1);
                
        m2 = new JMenu("Admin Controls");
        m2.setForeground(Color.WHITE);
        mb.add(m2);
        
        i1 = new JMenuItem("Search Hotel By Star");
        i1.addActionListener(this);
        m1.add(i1);
        
        i2 = new JMenuItem("Search Hotel By Name");
        i2.addActionListener(this);
        m1.add(i2);
        
        i3 = new JMenuItem("Add New Hotel");
        i3.addActionListener(this);
        m2.add(i3);
        
        i4 = new JMenuItem("Cancel Previous Booking");
        m2.add(i4);
        
        i5 = new JMenuItem("Billing Info");
        m2.add(i5);
        
        
        
        mb.setBounds(120,120,300,50);
        setLayout(null);
        setBounds(500,300,600,300);
        setVisible(true);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Search Hotel By Star")){
        new Searchbystar().setVisible(true);
            
        }else if(ae.getActionCommand().equals("Add New Hotel")){
            new Addnewhotel().setVisible(true);
            
            
        }else if(ae.getActionCommand().equals("Search Hotel By Name")){
            new Searchbyname().setVisible(true);
    }
    
        
    
    
}

    public static void main(String[] args){
        new Searchpage().setVisible(true);
        
    }
}
    
    
    
   
        
    
    
        
        
        
  