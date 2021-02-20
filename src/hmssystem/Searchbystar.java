
package hmssystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Searchbystar extends JFrame implements ActionListener {
    
    JTextField t1;
    JButton b1,b2,b3,b4,b5;
    
    Searchbystar(){
        
        JLabel l1 = new JLabel("Search By Star");
        l1.setFont(new Font("Consolas", Font.BOLD, 20));
        l1.setBounds(320,20,250,20);
        add(l1);
        
        
        
        
        b1 = new JButton("ONE STAR HOTELS");
        b1.setBounds(322,80,150,40);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("TWO STAR HOTELS");
        b2.setBounds(322,140,150,40);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("THREE STAR HOTELS");
        b3.setBounds(322,200,150,40);
        b3.addActionListener(this);
        add(b3);
        
        b4 = new JButton("FOUR STAR HOTELS");
        b4.setBounds(322,260,150,40);
        b4.addActionListener(this);
        add(b4);
        
        b5 = new JButton("FIVE STAR HOTELS");
        b5.setBounds(322,320,150,40);
        b5.addActionListener(this);
        add(b5);
        
        setBounds(450,200,800,500);
        setLayout(null);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            new Onestarholidayinn().setVisible(true);
            
        }else if(ae.getSource()==b2){
            new Twostarholidayinn().setVisible(true);
            
        }else if(ae.getSource()==b3){
            new Threestarholidayinn().setVisible(true);
            
        }else if(ae.getSource()==b4){
            new Fourstarholidayinn().setVisible(true);
            
        }else if(ae.getSource()==b5){
            new Fivestarholidayinn().setVisible(true);
            
        }
        
                
    
    }
    
    
    
    public static void main(String[] args){
        new Searchbystar().setVisible(true);
    }
    
}
