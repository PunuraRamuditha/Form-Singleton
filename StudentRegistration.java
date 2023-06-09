/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registration;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.* ;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;



/**
 *
 * @author Skyynemo
 */
public class StudentRegistration extends javax.swing.JFrame {
    Connection jdbc = Connection.getInstance();
                
                
    
    

    
    
    public StudentRegistration() {
        initComponents();
        chechboxPanel.setLayout(new BoxLayout(chechboxPanel, BoxLayout.Y_AXIS));
        chechboxPanel.setBorder(new TitledBorder("Courses"));
        jdbc.getCourseName();
        createCheckboxes();
        
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
        tfStudentName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfStudentContact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfStudentEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfStudentAge = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        chechboxPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Dynamic.setBackground(new java.awt.Color(51, 51, 51));
        Dynamic.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Registration");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Name");

        tfStudentName.setBackground(new java.awt.Color(102, 102, 102));
        tfStudentName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfStudentName.setForeground(new java.awt.Color(255, 255, 255));
        tfStudentName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        tfStudentName.setCaretColor(new java.awt.Color(255, 255, 255));
        tfStudentName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfStudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStudentNameActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        tfStudentContact.setBackground(new java.awt.Color(102, 102, 102));
        tfStudentContact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfStudentContact.setForeground(new java.awt.Color(255, 255, 255));
        tfStudentContact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        tfStudentContact.setCaretColor(new java.awt.Color(255, 255, 255));
        tfStudentContact.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfStudentContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStudentContactActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact");

        tfStudentEmail.setBackground(new java.awt.Color(102, 102, 102));
        tfStudentEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfStudentEmail.setForeground(new java.awt.Color(255, 255, 255));
        tfStudentEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        tfStudentEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        tfStudentEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfStudentEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStudentEmailActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Age");

        tfStudentAge.setBackground(new java.awt.Color(102, 102, 102));
        tfStudentAge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfStudentAge.setForeground(new java.awt.Color(255, 255, 255));
        tfStudentAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        tfStudentAge.setCaretColor(new java.awt.Color(255, 255, 255));
        tfStudentAge.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfStudentAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStudentAgeActionPerformed(evt);
            }
        });

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

        chechboxPanel.setBackground(new java.awt.Color(255, 255, 255));
        chechboxPanel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout chechboxPanelLayout = new javax.swing.GroupLayout(chechboxPanel);
        chechboxPanel.setLayout(chechboxPanelLayout);
        chechboxPanelLayout.setHorizontalGroup(
            chechboxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        chechboxPanelLayout.setVerticalGroup(
            chechboxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout DynamicLayout = new javax.swing.GroupLayout(Dynamic);
        Dynamic.setLayout(DynamicLayout);
        DynamicLayout.setHorizontalGroup(
            DynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DynamicLayout.createSequentialGroup()
                .addGroup(DynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DynamicLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DynamicLayout.createSequentialGroup()
                        .addGroup(DynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DynamicLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81))
                            .addGroup(DynamicLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(DynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfStudentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfStudentAge, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfStudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(DynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DynamicLayout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DynamicLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(chechboxPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(49, 49, 49))
        );
        DynamicLayout.setVerticalGroup(
            DynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DynamicLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DynamicLayout.createSequentialGroup()
                        .addComponent(tfStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfStudentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfStudentAge, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfStudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chechboxPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(DynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dynamic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dynamic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfStudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStudentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStudentNameActionPerformed

    private void tfStudentContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStudentContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStudentContactActionPerformed

    private void tfStudentEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStudentEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStudentEmailActionPerformed

    private void tfStudentAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStudentAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStudentAgeActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
         tfStudentName.setText("");
        tfStudentEmail.setText("");
        tfStudentAge.setText("");
        tfStudentContact.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dispose();
        Menu r = new Menu();
        r.setTitle("Back to Menu");
        r.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
       String inputName = null;
       String inputEmail = null;
        String inputAge = null;
        String inputContact = null;
        System.out.println(courseList);
        if (!tfStudentName.getText().equals(DefaultName) && !tfStudentName.getText().equals("")) {
            inputName = tfStudentName.getText();
            tfStudentName.setForeground(Color.gray);
            tfStudentName.setText(DefaultName);
        }
         if (!tfStudentEmail.getText().equals(DefaultEmail) && !tfStudentEmail.getText().equals("")) {
            inputEmail = tfStudentEmail.getText();
            tfStudentEmail.setForeground(Color.gray);
            tfStudentEmail.setText(DefaultEmail);
        }
         if (!tfStudentAge.getText().equals(DefaultAge) && !tfStudentAge.getText().equals("")) {
            inputAge = tfStudentAge.getText();
            tfStudentAge.setForeground(Color.gray);
            tfStudentAge.setText(DefaultAge);
        }
        if (!tfStudentContact.getText().equals(DefaultContact) && !tfStudentContact.getText().equals("")) {
            inputContact = tfStudentContact.getText();
            tfStudentContact.setForeground(Color.gray);
            tfStudentContact.setText(DefaultContact);
        }

       try {
            int i = jdbc.StudentInsert(inputName, inputEmail, inputAge, inputContact);
            if (i>0){
                System.out.println("Data has been inserted");
            }
            else{
                System.out.println("error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int studentId = jdbc.studentId;
        System.out.println("STUDENT ID : " + studentId);
        
        try{
            for (Integer courseId : idList) {
                int l = jdbc.StudentCourseInsert(studentId, courseId);
                if (l>0){
                System.out.println("Data has been inserted");
                //display messege of record inserted
            JOptionPane.showMessageDialog(this, "Course Record Inserted");
            //close connection
            }
            else{
                System.out.println("error");
            }
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
           
    }//GEN-LAST:event_formWindowOpened

    private void tfStudentNameFocusGained(java.awt.event.FocusEvent evt) {                                      
        DefaultName = tfStudentName.getText();
        if (tfStudentName.getText().equals(DefaultName)) {
            tfStudentName.setForeground(Color.black);
            tfStudentName.setText("");
        }
    }                                     

    private void tfStudentNameFocusLost(java.awt.event.FocusEvent evt) {                                    
        if (tfStudentName.getText().equals("")) {
            tfStudentName.setForeground(Color.gray);
            tfStudentName.setText(DefaultName);
        }
    }                            
    private void tfStudentEmailFocusGained(java.awt.event.FocusEvent evt) {                                         
        DefaultEmail = tfStudentEmail.getText();
        if (tfStudentEmail.getText().equals(DefaultEmail)) {
           tfStudentEmail.setForeground(Color.black);
           tfStudentEmail.setText("");
        }
    }                                        

    private void tfStuAddressFocusLost(java.awt.event.FocusEvent evt) {                                       
        if (tfStudentEmail.getText().equals("")) {
            tfStudentEmail.setForeground(Color.gray);
            tfStudentEmail.setText(DefaultEmail);
        }
    }   
    
    private void tfStudentAgeFocusGained(java.awt.event.FocusEvent evt) {                                     
        DefaultAge = tfStudentAge.getText();
        if (tfStudentAge.getText().equals(DefaultAge)) {
            tfStudentAge.setForeground(Color.black);
            tfStudentAge.setText("");
        }
    }                                    

    private void tfStudentAgeFocusLost(java.awt.event.FocusEvent evt) {                                   
        if (tfStudentAge.getText().equals("")) {
            tfStudentAge.setForeground(Color.gray);
            tfStudentAge.setText(DefaultAge);
        }
    }                    
     private void tfStudentContactFocusGained(java.awt.event.FocusEvent evt) {                                        
        DefaultContact = tfStudentContact.getText();
        if (tfStudentContact.getText().equals(DefaultContact)) {
            tfStudentContact.setForeground(Color.black);
            tfStudentContact.setText("");
        }
    }                                       

    private void tfStudentContactFocusLost(java.awt.event.FocusEvent evt) {                                      
        if (tfStudentContact.getText().equals("")) {
            tfStudentContact.setForeground(Color.gray);
            tfStudentContact.setText(DefaultContact);
        }
    }       
    
     

    public void createCheckboxes() {

        for (int i = 0; i < courseList.size(); i++) {

            ItemListener itemListener = new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getSource() instanceof CheckBoxWithId) {
                        CheckBoxWithId checkBoxWithID = (CheckBoxWithId) e.getSource();
                        if (checkBoxWithID.isSelected()) {
                            idList.add(checkBoxWithID.getId());
                        } else {
                            idList.remove(checkBoxWithID.getId());
                        }
                    }
                }
            };

            CheckBoxWithId checkBoxWithId = new CheckBoxWithId(courseList.get(i).getCourseName(), courseList.get(i).getCourseId());
            checkBoxWithId.addItemListener(itemListener);
            chechboxPanel.add(checkBoxWithId);
        }

        chechboxPanel.repaint();
    }

    
    
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
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistration().setVisible(true);
            }
        });
    }

    
    //New Varivles Declaration
    Connection conn;
    String DefaultName;
    String DefaultAge;
    String DefaultEmail;
    String DefaultContact;
    List<Course> courseList = jdbc.courseList;
    List<Integer> idList = new ArrayList<>();
    // End of Variable Declaration
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dynamic;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPanel chechboxPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfStudentAge;
    private javax.swing.JTextField tfStudentContact;
    private javax.swing.JTextField tfStudentEmail;
    private javax.swing.JTextField tfStudentName;
    // End of variables declaration//GEN-END:variables
}
