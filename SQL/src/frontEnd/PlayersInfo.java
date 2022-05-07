
package frontEnd;

import backEnd.Operator;
import backEnd.DataAccess;
import backEnd.Item;

import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.*;
import java.awt.Color;

public class PlayersInfo extends javax.swing.JFrame {

    public PlayersInfo(java.awt.Frame parent, boolean modal) {
        initComponents();
        
        Operator op = new Operator();
        ArrayList<Item> item = new ArrayList<Item>();
        
        op.showList(item, "Player");
        this.playersList.addItem("Players");
        for (int i = 0; i < item.size(); i++)
            this.playersList.addItem(item.get(i).name);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        nameL = new javax.swing.JLabel();
        ageL = new javax.swing.JLabel();
        heightL = new javax.swing.JLabel();
        weightL = new javax.swing.JLabel();
        genderL = new javax.swing.JLabel();
        healthL = new javax.swing.JLabel();
        energyL = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        height = new javax.swing.JLabel();
        weight = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        health = new javax.swing.JLabel();
        energy = new javax.swing.JLabel();
        playerSearch = new javax.swing.JTextField();
        playerSearchL = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        playerSelectL = new javax.swing.JLabel();
        playersList = new javax.swing.JComboBox<>();
        selectPlayer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 1050));

        title.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        title.setText("Player's Information");

        nameL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nameL.setText("Name: ");

        ageL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ageL.setText("Age: ");

        heightL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        heightL.setText("Height: ");

        weightL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        weightL.setText("Weight: ");

        genderL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        genderL.setText("Gender: ");

        healthL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        healthL.setText("Health: ");

        energyL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        energyL.setText("Energy: ");

        name.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        name.setText("N/A");

        age.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        age.setText("N/A");

        height.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        height.setText("N/A");

        weight.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        weight.setText("N/A");

        gender.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        gender.setText("N/A");

        health.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        health.setText("N/A");

        energy.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        energy.setText("N/A");

        playerSearch.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        playerSearchL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        playerSearchL.setText("Search Player's Name: ");

        search.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        playerSelectL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        playerSelectL.setText("Select Player's Name: ");

        playersList.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        selectPlayer.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        selectPlayer.setText("Select");
        selectPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPlayerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageL)
                            .addComponent(nameL)
                            .addComponent(heightL)
                            .addComponent(weightL)
                            .addComponent(genderL)
                            .addComponent(healthL)
                            .addComponent(energyL))
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(energy)
                            .addComponent(health)
                            .addComponent(gender)
                            .addComponent(weight)
                            .addComponent(height)
                            .addComponent(age)
                            .addComponent(name)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(playerSelectL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(playersList, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(playerSearchL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(339, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerSearchL)
                    .addComponent(playerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerSelectL)
                    .addComponent(playersList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectPlayer))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameL)
                    .addComponent(name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageL)
                    .addComponent(age))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightL)
                    .addComponent(height))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightL)
                    .addComponent(weight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderL)
                    .addComponent(gender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(healthL)
                    .addComponent(health))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(energyL)
                    .addComponent(energy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        Operator op = new Operator();
        op.search(this.playerSearch.getText());
        
        try {
            if (op.found.equals("False")){
                JOptionPane.showMessageDialog(this, "<html><h1 style=\"font-size:1.5em\">Player was not found!</h1></html>"); 
            }
            else{
                this.name.setText(op.name);
                this.age.setText(String.valueOf(op.age));
                this.height.setText(String.valueOf(op.height));
                this.weight.setText(String.valueOf(op.weight));
                this.gender.setText(op.gender);
                this.health.setText(String.valueOf(op.health) + "%");
                this.energy.setText(String.valueOf(op.energy) + "%");
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(this, "Error Code: " + ex);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void selectPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPlayerActionPerformed
        Operator op = new Operator();
        
        op.search(this.playersList.getSelectedItem().toString());
        try {
            if (op.found.equals("False")){
                JOptionPane.showMessageDialog(this, "<html><h1 style=\"font-size:1.5em\">Player was not found!</h1></html>"); 
            }
            else{
                this.name.setText(op.name);
                this.age.setText(String.valueOf(op.age));
                this.height.setText(String.valueOf(op.height));
                this.weight.setText(String.valueOf(op.weight));
                this.gender.setText(op.gender);
                this.health.setText(String.valueOf(op.health) + "%");
                this.energy.setText(String.valueOf(op.energy) + "%");
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(this, "Error Code: " + ex);
        }
    }//GEN-LAST:event_selectPlayerActionPerformed

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
            java.util.logging.Logger.getLogger(PlayersInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayersInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayersInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayersInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PlayersInfo dialog = new PlayersInfo(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
              //  new PlayersInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel ageL;
    private javax.swing.JLabel energy;
    private javax.swing.JLabel energyL;
    private javax.swing.JButton exit;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel genderL;
    private javax.swing.JLabel health;
    private javax.swing.JLabel healthL;
    private javax.swing.JLabel height;
    private javax.swing.JLabel heightL;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nameL;
    private javax.swing.JTextField playerSearch;
    private javax.swing.JLabel playerSearchL;
    private javax.swing.JLabel playerSelectL;
    private javax.swing.JComboBox<String> playersList;
    private javax.swing.JButton search;
    private javax.swing.JButton selectPlayer;
    private javax.swing.JLabel title;
    private javax.swing.JLabel weight;
    private javax.swing.JLabel weightL;
    // End of variables declaration//GEN-END:variables
    public ComboBoxModel model;
    
}
