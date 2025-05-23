/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package group_7_online_amusement_park_reservation_system;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.sql.SQLException;

public class AddAdmin extends javax.swing.JFrame {

    /**
     * Creates new form AddAdmin
     */
    public AddAdmin() {
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

        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        adminSIGNUPbtn = new javax.swing.JButton();
        backBTN5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        adminidTXT5 = new javax.swing.JTextField();
        jobtitleTXT5 = new javax.swing.JTextField();
        adminnameTXT5 = new javax.swing.JTextField();
        departmentTXT5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        junioraddadmin = new javax.swing.JRadioButton();
        senioraddadmin = new javax.swing.JRadioButton();
        passlabel = new javax.swing.JLabel();
        adminPassword2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD ADMIN");

        adminSIGNUPbtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        adminSIGNUPbtn.setForeground(new java.awt.Color(0, 102, 102));
        adminSIGNUPbtn.setText("Add Admin");
        adminSIGNUPbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSIGNUPbtnActionPerformed(evt);
            }
        });

        backBTN5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        backBTN5.setForeground(new java.awt.Color(0, 102, 102));
        backBTN5.setText("Back");
        backBTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTN5ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name:");

        label7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("Job Title:");

        label8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("Department:");

        adminidTXT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminidTXT5ActionPerformed(evt);
            }
        });

        adminnameTXT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminnameTXT5ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Role:");

        buttonGroup3.add(junioraddadmin);
        junioraddadmin.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        junioraddadmin.setForeground(new java.awt.Color(255, 255, 255));
        junioraddadmin.setText("Junior");
        junioraddadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                junioraddadminActionPerformed(evt);
            }
        });

        buttonGroup3.add(senioraddadmin);
        senioraddadmin.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        senioraddadmin.setForeground(new java.awt.Color(255, 255, 255));
        senioraddadmin.setText("Senior");
        senioraddadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senioraddadminActionPerformed(evt);
            }
        });

        passlabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        passlabel.setForeground(new java.awt.Color(255, 255, 255));
        passlabel.setText("Password:");

        adminPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminPassword2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBTN5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(adminnameTXT5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(adminidTXT5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(senioraddadmin)
                                    .addComponent(junioraddadmin))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label7)
                            .addComponent(label8)
                            .addComponent(passlabel))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jobtitleTXT5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminSIGNUPbtn)
                            .addComponent(departmentTXT5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(label7)
                    .addComponent(adminidTXT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobtitleTXT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(label8)
                    .addComponent(adminnameTXT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departmentTXT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(junioraddadmin)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passlabel)
                        .addComponent(adminPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senioraddadmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBTN5)
                    .addComponent(adminSIGNUPbtn))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Boolean seniorSelected ;
Boolean juniorSelected;
    private void adminSIGNUPbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSIGNUPbtnActionPerformed
        int ID = Integer.parseInt(adminidTXT5.getText());
        String Name = adminnameTXT5.getText();
        String JobTitle = jobtitleTXT5.getText();
        String Department = departmentTXT5.getText();
        String Role = seniorSelected ? "Senior" : "Junior";
        char[] Password = adminPassword2.getPassword();

        if (Name.isEmpty() || JobTitle.isEmpty() || Department.isEmpty() || Password.length == 0) {
            JOptionPane.showMessageDialog(this, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Admin a = new Admin(ID, Name, JobTitle, Department, Role, Password);
            try {
                int rowsInserted = a.saveAdminToDatabase();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, Role + " admin added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to add admin.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Clear fields
            adminidTXT5.setText("");
            adminnameTXT5.setText("");
            jobtitleTXT5.setText("");
            departmentTXT5.setText("");
            adminPassword2.setText("");
        }
    }//GEN-LAST:event_adminSIGNUPbtnActionPerformed

    private void backBTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTN5ActionPerformed
        AdminMenu f4=new AdminMenu();
        f4.setVisible(true);
        f4.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backBTN5ActionPerformed

    private void adminnameTXT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminnameTXT5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminnameTXT5ActionPerformed

    private void junioraddadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_junioraddadminActionPerformed
         seniorSelected = false ;
         juniorSelected = true;
    }//GEN-LAST:event_junioraddadminActionPerformed

    private void adminPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminPassword2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminPassword2ActionPerformed

    private void senioraddadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senioraddadminActionPerformed
         seniorSelected=true;
         juniorSelected=false;
    }//GEN-LAST:event_senioraddadminActionPerformed

    private void adminidTXT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminidTXT5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminidTXT5ActionPerformed

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
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField adminPassword2;
    private javax.swing.JButton adminSIGNUPbtn;
    private javax.swing.JTextField adminidTXT5;
    private javax.swing.JTextField adminnameTXT5;
    private javax.swing.JButton backBTN5;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField departmentTXT5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jobtitleTXT5;
    private javax.swing.JRadioButton junioraddadmin;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel passlabel;
    private javax.swing.JRadioButton senioraddadmin;
    // End of variables declaration//GEN-END:variables
}
