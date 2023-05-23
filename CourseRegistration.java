/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registration;
import java.awt.Color;
import java.sql.* ;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Skyynemo
 */
public class CourseRegistration extends javax.swing.JFrame {

    /**
     * Creates new form CourseRegistration
     */
    public CourseRegistration() {
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

        Dynamic = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        tfCourseName = new javax.swing.JTextField();
        tfCoursePrice = new javax.swing.JTextField();
        tfCoursePeriod = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Dynamic.setBackground(new java.awt.Color(51, 51, 51));
        Dynamic.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Course Registration");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Course Name");

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Course Price");

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Course Period");

        btnReset.setBackground(new java.awt.Color(255, 102, 102));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 0, 0));
        btnReset.setText("Reset");
        btnReset.setActionCommand("btnReset");
        btnReset.setBorder(null);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(153, 255, 153));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(0, 0, 0));
        btnSubmit.setText("Submit");
        btnSubmit.setActionCommand("btnSubmit");
        btnSubmit.setBorder(null);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(153, 153, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setText("Back");
        btnBack.setActionCommand("btnBack");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tfCourseName.setBackground(new java.awt.Color(102, 102, 102));
        tfCourseName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfCourseName.setForeground(new java.awt.Color(255, 255, 255));
        tfCourseName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        tfCourseName.setCaretColor(new java.awt.Color(255, 255, 255));
        tfCourseName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfCourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCourseNameActionPerformed(evt);
            }
        });

        tfCoursePrice.setBackground(new java.awt.Color(102, 102, 102));
        tfCoursePrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfCoursePrice.setForeground(new java.awt.Color(255, 255, 255));
        tfCoursePrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        tfCoursePrice.setCaretColor(new java.awt.Color(255, 255, 255));
        tfCoursePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCoursePriceActionPerformed(evt);
            }
        });

        tfCoursePeriod.setBackground(new java.awt.Color(102, 102, 102));
        tfCoursePeriod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfCoursePeriod.setForeground(new java.awt.Color(255, 255, 255));
        tfCoursePeriod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        tfCoursePeriod.setCaretColor(new java.awt.Color(255, 255, 255));
        tfCoursePeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCoursePeriodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DynamicLayout = new javax.swing.GroupLayout(Dynamic);
        Dynamic.setLayout(DynamicLayout);
        DynamicLayout.setHorizontalGroup(
            DynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DynamicLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addGroup(DynamicLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(DynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DynamicLayout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(DynamicLayout.createSequentialGroup()
                        .addGroup(DynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(DynamicLayout.createSequentialGroup()
                        .addGroup(DynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCoursePeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCoursePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        DynamicLayout.setVerticalGroup(
            DynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DynamicLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCoursePeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCoursePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(DynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jLabel2.getAccessibleContext().setAccessibleName("");
        jLabel3.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dynamic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dynamic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Dynamic.getAccessibleContext().setAccessibleName("Course Period");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        tfCourseName.setText("");
        tfCoursePeriod.setText("");
        tfCoursePrice.setText("");
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
         String inputName = null;
        String inputDescription = null;
        String inputPeriod = null;
        String inputPrice = null;
        if(!tfCourseName.getText().equals(DefaultName) && !tfCourseName.getText().equals("")){
            inputName = tfCourseName.getText();
            tfCourseName.setForeground(Color.gray);
            tfCourseName.setText(DefaultName);
        }
        
        if(!tfCoursePeriod.getText().equals(DefaultPeriod) && !tfCoursePeriod.getText().equals("")){
            inputPeriod = tfCoursePeriod.getText();
            tfCoursePeriod.setForeground(Color.gray);
            tfCoursePeriod.setText(DefaultPeriod);
        }
        if(!tfCoursePrice.getText().equals(DefaultPrice) && !tfCoursePrice.getText().equals("")){
            inputPrice = tfCoursePrice.getText();
            tfCoursePrice.setForeground(Color.gray);
            tfCoursePrice.setText(DefaultPrice);
        }
        Connection jdbc = Connection.getInstance();
        try {
            int i = jdbc.CourseInsert(inputName, inputPeriod, inputPrice);
            if (i>0){
                System.out.println("Data has been inserted");
            }
            else{
                System.out.println("error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
     
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dispose();
        Menu r = new Menu();
        r.setTitle("Back to Menu");
        r.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed
 private void tfCourseNameFocusGained(java.awt.event.FocusEvent evt) {                                         
        DefaultName = tfCourseName.getText();
        if(tfCourseName.getText().equals(DefaultName)){
            tfCourseName.setForeground(Color.black);
            tfCourseName.setText("");
        }
    }  
 
  private void tfCourseNameFocusLost(java.awt.event.FocusEvent evt) {                                       
        if(tfCourseName.getText().equals("")){
            tfCourseName.setForeground(Color.gray);
            tfCourseName.setText(DefaultName);
        }
    }    
   private void tfCoursePeriodFocusGained(java.awt.event.FocusEvent evt) {                                           
        DefaultPeriod = tfCoursePeriod.getText();
        if(tfCoursePeriod.getText().equals(DefaultPeriod)){
            tfCoursePeriod.setForeground(Color.black);
            tfCoursePeriod.setText("");
        }
    }                                          

    private void tfCoursePeriodFocusLost(java.awt.event.FocusEvent evt) {                                         
        if(tfCoursePeriod.getText().equals("")){
            tfCoursePeriod.setForeground(Color.gray);
            tfCoursePeriod.setText(DefaultPeriod);
        }
    }                                        

    private void tfCoursePriceFocusGained(java.awt.event.FocusEvent evt) {                                          
        DefaultPrice = tfCoursePrice.getText();
        if(tfCoursePrice.getText().equals(DefaultPrice)){
            tfCoursePrice.setForeground(Color.black);
            tfCoursePrice.setText("");
        }
    }                                         

    private void tfCoursePriceFocusLost(java.awt.event.FocusEvent evt) {                                        
        if(tfCoursePrice.getText().equals("")){
            tfCoursePrice.setForeground(Color.gray);
            tfCoursePrice.setText(DefaultPrice);
        }
    }                                       

    private void tfCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCourseNameActionPerformed

    private void tfCoursePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCoursePriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCoursePriceActionPerformed

    private void tfCoursePeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCoursePeriodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCoursePeriodActionPerformed

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
            java.util.logging.Logger.getLogger(CourseRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseRegistration().setVisible(true);
            }
        });
    }
 //New Varivles Declaration
    java.sql.Connection conn;
    Statement stmt;
    String DefaultName;
    String DefaultPrice;
    String DefaultPeriod;
    // End of Variable Declaration
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dynamic;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfCourseName;
    private javax.swing.JTextField tfCoursePeriod;
    private javax.swing.JTextField tfCoursePrice;
    // End of variables declaration//GEN-END:variables
}