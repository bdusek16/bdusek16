package OregonTrail;


import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.font.TextAttribute;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.awt.event.WindowEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Austin
 */
public class OregonTrail extends javax.swing.JFrame {
    
    private ArrayList<Item> items;
    private double weightAvailable;
    private double totalFoodWeight;
  
    /**
     * Creates new form JFrame
     */
    
    public OregonTrail() {
        initComponents();
        totalFoodWeight = 0;
        jTextField1.requestFocus();
        jTextArea1.setEditable(false);
        jTextArea2.setEditable(false);
        weightAvailable = 100;
        jLabel9.setText(weightAvailable + "");
        setSize(500,500);
        items = new ArrayList<Item>();
InputStreamReader itemScr = null;
            try {
            itemScr = new InputStreamReader( this.getClass().getResourceAsStream("/item/OregonTrailItems.csv"));
            } catch( Exception e ) { System.exit(1); }
        
            Scanner scanner = new Scanner( itemScr );
            // read in the file - assume it has correct format for each room of:
            // 1. Initial header line designating column data (read and ignore)
            // 2. Rows of comma-separated fields containing:
            //      a. room number (can ignore)
            //      b. room to the north (-1 = no connection)
            //      c. room to the south (-1 = no connection)
            //      d. room to the east (-1 = no connection)
            //      e. room to the west (-1 = no connection)
            //      f. room description
            
            String headerLine = scanner.nextLine(); // Ignores headerLine of CSV
            
            // Takes in input until there isn't anymore
            while ( scanner.hasNext() ) 
            {
                Scanner itemData = new Scanner( scanner.nextLine() ); // read in entire line
                itemData.useDelimiter(",");                           // Ignore comma's
                String name = itemData.next();                   // Read in item title
                double weight = itemData.nextDouble();                  // Read in room number
                boolean isFood = itemData.nextBoolean();
                Item newItem = new Item(weight,name,isFood);        // Create new object in item class with given CSV input
                items.add( newItem );                                 // Add object to the items array list
            }
            scanner.close();
            
            for(int i = 0; i < items.size(); i++)
            {
                if(items.get(i).isFood())
                {
                    String output = "Enter";
                    while(output.length() < 10)
                    {
                        output += " ";
                    }
                    output += items.get(i).getName() + "\n";
                    jTextArea1.append(output);
                }
                else
                {
                    jTextArea1.append(items.get(i).toString());
                }
            }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter item to take or end to start the game: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Weight:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Item:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Available");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Items Chosen");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Weight:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Item:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Weight Available: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel8)))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        String input = jTextField1.getText();
        if(input.equals("end"))
        {
            for(int i = 0; i < items.size(); i++)
            {
                if(items.get(i).isFood())
                {
                    items.get(i).setWeight(items.get(i).getCumulativeWeight());
                    items.get(i).setQuantity(1);
                }
            }
            for(int i = 0; i < items.size(); i++)
            {
                if(!items.get(i).isCarried())
                {
                    items.get(i).decreaseQuantity();
                }
            }
            ArrayList<Item> itemsCarried = new ArrayList<Item>();
            for(int i = 0; i < items.size(); i++)
            {
                if(items.get(i).isCarried())
                {
                    itemsCarried.add(items.get(i));
                }
            }
            PlayerUI playerUI = new  PlayerUI(itemsCarried);
            playerUI.setVisible(true);
            this.dispose();
        }
        for(int i = 0; i < items.size(); i++)
        {
            if(input.toLowerCase().equals(items.get(i).getName().toLowerCase()))
            {
                if(items.get(i).isFood())
                {
                    double weight = 0;
                    String inputDialog = JOptionPane.showInputDialog("How much " + items.get(i).getName().toLowerCase() + " would you like to take in lbs?");
                    while(weight == 0)
                    {
                    try
                    {
                    weight = Double.parseDouble(inputDialog);
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(this,"Please input a valid positive number!");
                        inputDialog = JOptionPane.showInputDialog("How much " + items.get(i).getName().toLowerCase() + " would you like to take in lbs?");
                    }
                    }
                    items.get(i).setWeight(weight);
                    items.get(i).addWeight(weight);
                    if(!items.get(i).isCarried())
                    {
                        items.get(i).carry();                           
                    }
                    jTextArea2.append(items.get(i).toString());
                    weightAvailable -= items.get(i).getWeight();
                    jLabel9.setText(weightAvailable + "");
                    if(weightAvailable < 0)
                    {
                        jLabel9.setText("0.00");
                    }
                }
                else
                {
                    if(items.get(i).isCarried())
                    {
                        items.get(i).addItem();
                    }
                    else
                    {
                    items.get(i).carry();
                    }
                    jTextArea2.append(items.get(i).toString());
                    weightAvailable -= items.get(i).getWeight();
                    jLabel9.setText(weightAvailable + "");
                    if(weightAvailable < 0)
                    {
                        jLabel9.setText("0.00");
                    }
                }
            }
        }
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OregonTrail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OregonTrail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OregonTrail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OregonTrail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OregonTrail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
