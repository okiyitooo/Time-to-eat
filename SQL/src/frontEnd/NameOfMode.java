
package frontEnd;

import backEnd.Operator;
import backEnd.DataAccess;
import backEnd.Item;

import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class NameOfMode extends javax.swing.JFrame {

    public NameOfMode(java.awt.Frame parent, boolean modal) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        foodBttn = new javax.swing.JButton();
        activityBttn = new javax.swing.JButton();
        time = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        playerInfoBttn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageBoard2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Name Of Mode");
        title.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        foodBttn.setIcon(new javax.swing.ImageIcon("C:\\Users\\timho\\Desktop\\TimeToEat\\Refrigerador.jpg")); // NOI18N
        foodBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodBttnActionPerformed(evt);
            }
        });

        activityBttn.setIcon(new javax.swing.ImageIcon("C:\\Users\\timho\\Desktop\\TimeToEat\\ManRunning.jpg")); // NOI18N
        activityBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityBttnActionPerformed(evt);
            }
        });

        time.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("00:00");

        jList1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jList1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        playerInfoBttn.setIcon(new javax.swing.ImageIcon("C:\\Users\\timho\\Desktop\\TimeToEat\\Faceless.jpg")); // NOI18N
        playerInfoBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playerInfoBttnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                playerInfoBttnMouseReleased(evt);
            }
        });
        playerInfoBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerInfoBttnActionPerformed(evt);
            }
        });

        messageBoard2.setEditable(false);
        messageBoard2.setColumns(10);
        messageBoard2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        messageBoard2.setRows(3);
        messageBoard2.setText("Message Board");
        jScrollPane2.setViewportView(messageBoard2);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(foodBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(activityBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerInfoBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(foodBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(activityBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerInfoBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playerInfoBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerInfoBttnActionPerformed
        PlayersInfo info = new PlayersInfo(this, true);
        this.playerInfoBttn.setBackground(new Color(250, 120, 120));
        info.setVisible(true);
        //this.playerInfoBttn.setBackground(new Color(250, 120, 120));
    }//GEN-LAST:event_playerInfoBttnActionPerformed

    private void foodBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodBttnActionPerformed
        //Intialize
        Operator op = new Operator();
        ArrayList<Item> items = new ArrayList<Item>();
        
        //task: Change other button back to default color
        this.activityBttn.setBackground(new Color(240, 240, 240));
        
        //task: Change button to red or dark gray color
        this.foodBttn.setBackground(new Color(250, 120, 120));
        
        //task: Add Food List
        op.showList(items, "Food");
        this.jList1.setModel(model);
        if (!model.isEmpty())
            model.clear();
        for(int i = 0; i < items.size(); i++)
            model.addElement(items.get(i).list);
        
        //task: Message Board to Food message
        this.messageBoard2.setText("What do you want \n" + "to eat?");
    }//GEN-LAST:event_foodBttnActionPerformed

    private void activityBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityBttnActionPerformed
        //Intialize
        Operator op = new Operator();
        ArrayList<Item> items = new ArrayList<Item>();
        
        //task: Change other button back to default color
        this.foodBttn.setBackground(new Color(240, 240, 240));
        
        //task: Change button to red or dark gray color
        this.activityBttn.setBackground(new Color(250, 120, 120));
        
        //task: Add Food List
        op.showList(items, "Activities");
        this.jList1.setModel(model);
        if (!model.isEmpty())
            model.clear();
        for(int i = 0; i < items.size(); i++)
            model.addElement(items.get(i).list);
        
        //task: Message Board to Food message
        this.messageBoard2.setText("What do you want \nto do?");
    }//GEN-LAST:event_activityBttnActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
       if(evt.getClickCount() == 2)
        JOptionPane.showMessageDialog(this, "<html><h1 style=\"font-size:1.5em\">" + this.jList1.getSelectedValue() + "</h1></html>"); 
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void playerInfoBttnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerInfoBttnMousePressed
        this.playerInfoBttn.setBackground(new Color(250, 120, 120));
    }//GEN-LAST:event_playerInfoBttnMousePressed

    private void playerInfoBttnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerInfoBttnMouseReleased
        this.playerInfoBttn.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_playerInfoBttnMouseReleased

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
            java.util.logging.Logger.getLogger(NameOfMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NameOfMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NameOfMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NameOfMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NameOfMode nom = new NameOfMode(new javax.swing.JFrame(), true);
                nom.setVisible(true);
              //  new NameOfMode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activityBttn;
    private javax.swing.JButton foodBttn;
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea messageBoard2;
    private javax.swing.JButton playerInfoBttn;
    private javax.swing.JLabel time;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
    public DefaultListModel model = new DefaultListModel();

}
