/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhp;



import config.dbConnector;
import dhp.Patientlogin;
import javax.swing.JOptionPane;

/**
 *
 * @author Gwapo ko
 */
public class FILLUPFORM extends javax.swing.JFrame {

    /**
     * Creates new form FILLUPFORM
     */
    public FILLUPFORM() {
        initComponents();
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        PWD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        stats = new javax.swing.JLabel();
        age1 = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        ads = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setText("AGE:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons8-health-100 (1).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("PATIENT SIGN UP FORM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 220, 20));

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setText("REGISTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel41.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name.setText("FIRSTNAME");
        jPanel41.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        age.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        age.setText("LASTNAME");
        jPanel41.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        address.setText("USERNAME");
        jPanel41.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        dob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dob.setText("PASSWORD");
        jPanel41.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        phone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phone.setText("ADDRESS");
        jPanel41.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        stats.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        stats.setText("AGE");
        jPanel41.add(stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        age1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age1ActionPerformed(evt);
            }
        });
        jPanel41.add(age1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 170, -1));

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel41.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 170, -1));

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel41.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 170, -1));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel41.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 170, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel41.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 170, -1));

        ads.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adsActionPerformed(evt);
            }
        });
        jPanel41.add(ads, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 170, -1));
        jPanel41.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel41.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void adsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adsActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void age1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(fname.getText().isEmpty()|| lname.getText().isEmpty()
            || username.getText().isEmpty()|| password.getText().isEmpty()|| ads.getText().isEmpty()|| age.getText().isEmpty()
            || PWD.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(password.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Characters password is 8 above!");
            password.setText("");

        }else{

            dbConnector dbc = new dbConnector();

            if (dbc.insertData("INSERT INTO user(r_fname, r_lname, r_username, r_password, r_address, r_age,status) "
                + "VALUES('" + fname.getText() + "', '" + lname.getText() + "', '"
                + username.getText() + "', '" + password.getText() + "', '" + age.getText() + "','"
                + ads.getText() + "','" + PWD.getText() + "', 'PENDING')")) {
            JOptionPane.showMessageDialog(null, "Register Successfully");

            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            Patientlogin ads = new Patientlogin();
            ads.setVisible(true);
            this.dispose();

        }else{
            JOptionPane.showMessageDialog(null, "Connection Error!");
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
         

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
            java.util.logging.Logger.getLogger(FILLUPFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FILLUPFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FILLUPFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FILLUPFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FILLUPFORM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PWD;
    private javax.swing.JLabel address;
    private javax.swing.JTextField ads;
    private javax.swing.JLabel age;
    private javax.swing.JTextField age1;
    private javax.swing.JLabel dob;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel name;
    private javax.swing.JTextField password;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel stats;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

  


}
