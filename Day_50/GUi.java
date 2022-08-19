import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUi implements ActionListener 
{
       JFrame f;
      JTextField t1,t2,t3;
      JButton b;
      
      GUi(){
        f=new JFrame("my Frame");
        f.setSize(700,300);
        f.setLayout(null);
        f.setLocationRelativeTo(null);// set JFrame in center of the screen
	f.setResizable(false);//Fix the Size of the JFrame  
	
        
        t1=new JTextField(10);
        t1.setBounds(50, 30, 100, 30);
        f.add(t1);
        
         t2=new JTextField(10);
        t2.setBounds(50, 80, 100, 30);
        f.add(t2);
        
         t3=new JTextField(10);
        t3.setBounds(50, 180, 100, 30);
        f.add(t3);
        
        t1.setToolTipText("enter first number");
         t2.setToolTipText("enter second number");
         
         b=new JButton("click");
         b.setBounds(60,130,80,30);
         
         f.add(b);
         b.addActionListener(this);
         f.setVisible(true);
      }
      public void actionPerformed(ActionEvent e){
          int a,b,c;
		a=Integer.parseInt(t1.getText());
		b=Integer.parseInt(t2.getText());
		c=a+b;
		t3.setText(String.valueOf(c));
      }
    public static void main(String[] args) {
              new GUi();
        
    }
    }
