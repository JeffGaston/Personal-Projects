import java.util.Random;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Coin_Toss2 extends JFrame{
   
   private Random rand= new Random();
   private JPanel background;
   private JLabel image;
   private JButton tossButton;
   private String result;
   private JLabel notify;
   private int count= 1;
   
   
   public Coin_Toss2(){
      super("Coin Toss");
      setLayout(new FlowLayout());
      background= new JPanel();
      add(background);
      
      notify= new JLabel("Results of the coin toss will show here!");
      add(notify);
      
      image= new JLabel();
      image.setIcon(new ImageIcon("Head.jpg"));
      add(image);
      validate();
      
      tossButton= new JButton("Toss");
      add(tossButton);
      
      tossButton.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent clickToss){
               if(rand.nextBoolean()){
                  image.setIcon(new ImageIcon("Head.jpg"));
                  result = "Heads";                  
               }
               else{
                  image.setIcon(new ImageIcon("Tail.jpg"));
                  result = "Tails";
               }
               notify.setText("Toss "+ count +" resulted in "+ result);
               count++;
            }
         }
      );
   }
}