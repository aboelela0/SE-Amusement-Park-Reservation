/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package group_7_online_amusement_park_reservation_system;


import static group_7_online_amusement_park_reservation_system.Group_7_Online_Amusement_Park_Reservation_System.customers;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;






public class OLDcustomer extends javax.swing.JFrame {

    /**
     * Creates new form OLDcustomer
     */
    public OLDcustomer() {
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

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        make_reservation = new javax.swing.JButton();
        view_reservation = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        Resid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ScheduleActivities = new javax.swing.JButton();
        Feedback = new javax.swing.JButton();
        ManageActivity = new javax.swing.JButton();
        Payment = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("welcome back !");

        make_reservation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        make_reservation.setForeground(new java.awt.Color(51, 51, 51));
        make_reservation.setText("make reservation");
        make_reservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                make_reservationActionPerformed(evt);
            }
        });

        view_reservation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        view_reservation.setText("view reservations");
        view_reservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_reservationActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("child lost ?");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        Resid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResidActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reservation ID");

        ScheduleActivities.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ScheduleActivities.setText("Schedule Activities");
        ScheduleActivities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleActivitiesActionPerformed(evt);
            }
        });

        Feedback.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Feedback.setText("Submit Feedback");
        Feedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeedbackActionPerformed(evt);
            }
        });

        ManageActivity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ManageActivity.setText("Manage Activity");
        ManageActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageActivityActionPerformed(evt);
            }
        });

        Payment.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Payment.setText("Add Payment");
        Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ScheduleActivities, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManageActivity, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Feedback, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(back))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(view_reservation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Resid, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(make_reservation)
                            .addComponent(Payment, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(Payment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(make_reservation)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Resid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(view_reservation)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(ScheduleActivities)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ManageActivity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Feedback)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(jButton4))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void make_reservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_make_reservationActionPerformed
       reservationGUI r=new reservationGUI();
       r.show();
       dispose();
       
    }//GEN-LAST:event_make_reservationActionPerformed

    private void view_reservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_reservationActionPerformed
 String Rid=Resid.getText();
 
java.sql.Connection conn = null;
Statement stmt = null;
try {
    conn = DB.getInstance().getConnection();
    stmt = conn.createStatement();

    java.sql.ResultSet rs = stmt.executeQuery(
        "SELECT * FROM reservation WHERE reservationID = '" + Rid + "'"
    );
    
    StringBuilder result = new StringBuilder();
    while (rs.next()) {
        String resID   = rs.getString("reservationID");
        String resDate = rs.getString("date");
        String resTime = rs.getString("time");
        result.append("Reservation ID: ").append(resID)
              .append(", Date: ").append(resDate)
              .append(", Time: ").append(resTime)
              .append("\n");
    }

    // 4) Display reservations or notify if none found
    if (result.length() == 0) {
        JOptionPane.showMessageDialog(this,
            "No reservations found for reservation ID: " + Rid,
            "Info", JOptionPane.INFORMATION_MESSAGE
        );
    } else {
        JOptionPane.showMessageDialog(this,
            result.toString(),
            "Reservations Found", JOptionPane.INFORMATION_MESSAGE
        );
    }

} catch (Exception e) {
    System.err.println("ERROR in fetching reservations: " + e);
    JOptionPane.showMessageDialog(this,
        "An unexpected error occurred:\n" + e.getMessage(),
        "Error", JOptionPane.ERROR_MESSAGE
    );
    }//GEN-LAST:event_view_reservationActionPerformed
    }
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       CustomerGUI custGUI=new CustomerGUI();
       custGUI.show();
       dispose();
       
    }//GEN-LAST:event_backActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
MapGui l=new MapGui();
        l.show();
        dispose();        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ResidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResidActionPerformed

    private void ScheduleActivitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleActivitiesActionPerformed
        ScheduleForm s=new ScheduleForm();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ScheduleActivitiesActionPerformed

    private void FeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedbackActionPerformed
       Feedbackform f=new Feedbackform();
       f.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_FeedbackActionPerformed

    private void ManageActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageActivityActionPerformed
        ManageActivityForm m=new ManageActivityForm();
        m.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_ManageActivityActionPerformed

    private void PaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentActionPerformed
        PaymentUI p=new PaymentUI();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PaymentActionPerformed

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
            java.util.logging.Logger.getLogger(OLDcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OLDcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OLDcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OLDcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new OLDcustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Feedback;
    private javax.swing.JButton ManageActivity;
    private javax.swing.JButton Payment;
    private javax.swing.JTextField Resid;
    private javax.swing.JButton ScheduleActivities;
    private javax.swing.JButton back;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JButton make_reservation;
    private javax.swing.JButton view_reservation;
    // End of variables declaration//GEN-END:variables
}
