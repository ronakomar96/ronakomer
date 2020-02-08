
package guimarketing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Zardisht
 */
public class JavaApplication45 {
    


    
    public static void main(String[] args) {
       
        
       
       
        
        JFrame frame = new JFrame();
      JPanel panel = new JPanel();
         panel.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Maketing Product", TitledBorder.CENTER, TitledBorder.TOP));
      String[][] rec = {
         {  "milk", " 2000" ,"1kg","2023","A"," Iraq"},
         {  "meats", "5000","1kg","2021"," B"," Turkya" },
        
      
         {  "cold drink", "1500","2750g" ,"2023","c"," Turkya"},
         {  "bread", "1000","750g","2dayes" ," D" ,"Duhok "},
         
          {  "egg", " 1000","750g","one week" ," F" ,"Sulmania"},
         
      };
      String[] header = { "product","price", " wight " ," expire", "position ","mad in" };
      JTable table = new JTable(rec, header);
      panel.add(new JScrollPane(table));
      
      frame.add(panel);
      
      frame.setSize(550, 400);
      frame.setVisible(true);
     
      

}
    }
    



