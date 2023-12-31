

import Project.ConnectionProvider;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author NThang
 */
public class addNewEmployee extends javax.swing.JFrame {

    /**
     * Creates new form addNewDonor
     */
    public addNewEmployee() {
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

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtJob = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtContactNum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all page background image.png"))); // NOI18N
        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 130));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel1.setText("ADD NEW EMPLOYEE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 250, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("New Employee ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        ID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 0, 51));
        ID.setText("9");
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 30, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Job");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 160, -1));

        txtJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJobActionPerformed(evt);
            }
        });
        getContentPane().add(txtJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 160, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("ContactNum");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Update details.png"))); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit application.png"))); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        txtContactNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNumActionPerformed(evt);
            }
        });
        getContentPane().add(txtContactNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 160, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alooo.jpg"))); // NOI18N
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 5, true));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
       /* String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=BloodDonation;user=sa;password=ha15122003;encrypt=false";

         try (Connection con = ConnectionProvider.getCon(); Statement stmt = con.createStatement();) {
           ResultSet rs= stmt.executeQuery("SELECT MAX(DonorID) FROM Donor");
           if(rs.first())
           {
               int id = rs.getInt(1);
               id += 1;
               String str = String.valueOf(id);
               ID.setText(str);
           }
           else{
               ID.setText("1");
           }
      }catch(SQLException e){
          e.printStackTrace();
            JOptionPane.showMessageDialog(null,e);
      }*/
      
    }//GEN-LAST:event_formComponentShown

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJobActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new addNewEmployee().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Get all the data entered by the user
        String Name = txtName.getText();
        String ContactNum = txtContactNum.getText();
        String Job = txtJob.getText();
        String EmployeeID = ID.getText();

        // connect to SQL server

        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=BloodDonation;user=sa;password=ha15122003;encrypt=false";

        try (Connection con = ConnectionProvider.getCon(); Statement stmt = con.createStatement();) {
            stmt.executeUpdate("insert into employee values('"+EmployeeID+"','"+Name+"','"+ContactNum+"','"+Job+"')");
            JOptionPane.showMessageDialog(null,"Successfully Updated");
            setVisible(false);
            new addNewEmployee().setVisible(true);
            System.out.println(con.getCatalog());
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtContactNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNumActionPerformed

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
            java.util.logging.Logger.getLogger(addNewDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addNewDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addNewDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addNewDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addNewEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtContactNum;
    private javax.swing.JTextField txtJob;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
