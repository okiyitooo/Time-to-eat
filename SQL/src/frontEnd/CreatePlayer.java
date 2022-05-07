
package frontEnd;

import backEnd.Operator;
import backEnd.DataAccess;

import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.*;

public class CreatePlayer extends javax.swing.JFrame {

    public CreatePlayer(java.awt.Frame parent, boolean modal) {//
       // super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        title = new javax.swing.JLabel();
        nameL = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        ageL = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        heightL = new javax.swing.JLabel();
        height = new javax.swing.JTextField();
        weightL = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        genderL = new javax.swing.JLabel();
        male = new javax.swing.JCheckBox();
        female = new javax.swing.JCheckBox();
        create = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        title.setText("Create Player");

        nameL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nameL.setText("Name: ");

        name.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        ageL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ageL.setText("Age: ");

        age.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        heightL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        heightL.setText("Height: ");

        height.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        weightL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        weightL.setText("Weight: ");

        weight.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        genderL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        genderL.setText("Gender: ");

        male.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        male.setText("Male");

        female.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        female.setText("Female");

        create.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        create.setText("Create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\timho\\Desktop\\TimeToEat\\Faceless.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameL)
                            .addComponent(ageL)
                            .addComponent(heightL)
                            .addComponent(genderL))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(90, 90, 90)
                                    .addComponent(weightL)
                                    .addGap(18, 18, 18)
                                    .addComponent(weight))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(male)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(female)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(create))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(title)
                        .addGap(62, 62, 62)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameL)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageL)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightL)
                    .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightL)
                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderL)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(male)
                        .addComponent(female)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create)
                    .addComponent(exit))
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        Operator op = new Operator();
        String n, a, ht, wt, g, h, e, gender;
        gender = "";
        
        try {
            if(this.male.isSelected() && !this.female.isSelected()){
                gender = "M";
            }        
            else if(this.female.isSelected() && !this.male.isSelected()){
                gender = "F";
            }        
            else if(this.male.isSelected() && this.female.isSelected()){
                JOptionPane.showMessageDialog(this, "Please select only one gender!");
            }        
            else if(!this.male.isSelected() && !this.female.isSelected()){
                JOptionPane.showMessageDialog(this, "Please select a gender!");
            }
            else {
                JOptionPane.showMessageDialog(this, "A problem occured!");
            }
        
            if (gender == "M" || gender == "F"){
                n = this.name.getText();
                a = this.age.getText();
                ht = this.height.getText();
                wt = this.weight.getText();
                g = gender;
                h = "100";
                e = "100";
                op.createPlayer(n, a, ht, wt, g, h, e);
                JOptionPane.showMessageDialog(this, "<html><h1 style=\"font-size:1.5em\">Player was successfully created!</h1></html>"); 
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(this, "Error Code: " + ex);
        }
        
    }//GEN-LAST:event_createActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PlayersInfo info = new PlayersInfo(this, true);
        info.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(CreatePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreatePlayer create = new CreatePlayer(new javax.swing.JFrame(), true);
                create.setVisible(true);
             //   new CreatePlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JLabel ageL;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton create;
    private javax.swing.JButton exit;
    private javax.swing.JCheckBox female;
    private javax.swing.JLabel genderL;
    private javax.swing.JTextField height;
    private javax.swing.JLabel heightL;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox male;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameL;
    private javax.swing.JLabel title;
    private javax.swing.JTextField weight;
    private javax.swing.JLabel weightL;
    // End of variables declaration//GEN-END:variables
}
