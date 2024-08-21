
package ninozoilo.bsit2e;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class zoilonino extends JFrame{
    
    
    public zoilonino(){
        setLayout(new FlowLayout());
        
        JLabel lblname = new JLabel("Username");
        JTextField txtname = new JTextField(20);
        
        JLabel lblpass = new JLabel("Password");
        JPasswordField pfpass = new JPasswordField(20);
        
        JButton btnEnter = new JButton("Enter");
        
        
        
        
       add(lblname);
       add(txtname);
        add(lblpass);
        add(pfpass);
        add(btnEnter);
    }
    
    
   
        
        
   
   
    

}