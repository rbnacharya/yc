/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpst.yc.server.ui;

/**
 *
 * @author Pavan Poudel
 */
public class Frm_UserDetails extends javax.swing.JFrame {

    /**
     * Creates new form Frm_UserDetails
     */
    public Frm_UserDetails() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("yellocafe?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        tblUserQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM TblUser t");
        tblUserList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tblUserQuery.getResultList();
        tblUserQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM TblUser t");
        tblUserList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tblUserQuery1.getResultList();
        tblUserQuery2 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM TblUser t");
        tblUserList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tblUserQuery2.getResultList();
        tblUserQuery3 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM TblUser t");
        tblUserList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tblUserQuery3.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_user = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btn_close = new javax.swing.JButton();
        btn_addNew = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();

        setTitle("User");
        setPreferredSize(new java.awt.Dimension(850, 620));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_user.setAutoCreateRowSorter(true);
        tbl_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_user.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbl_user.setRowHeight(20);
        tbl_user.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblUserList3, tbl_user, "");
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${loginID}"));
        columnBinding.setColumnName("Login ID");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fullName}"));
        columnBinding.setColumnName("Full Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${userType}"));
        columnBinding.setColumnName("User Type");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${payment}"));
        columnBinding.setColumnName("Payment");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${balance}"));
        columnBinding.setColumnName("Balance");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${gender}"));
        columnBinding.setColumnName("Gender");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${age}"));
        columnBinding.setColumnName("Age");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${phone}"));
        columnBinding.setColumnName("Phone");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${address}"));
        columnBinding.setColumnName("Address");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tbl_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_userMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_user);
        tbl_user.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, 820, 460));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 840, 10));

        btn_close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_close.setForeground(new java.awt.Color(102, 0, 0));
        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, 100, 30));

        btn_addNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_addNew.setForeground(new java.awt.Color(0, 51, 0));
        btn_addNew.setText("Add New ...");
        btn_addNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addNewActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        btn_edit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(0, 0, 51));
        btn_edit.setText("Edit ...");
        btn_edit.setEnabled(false);
        getContentPane().add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 100, 30));

        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(51, 0, 0));
        btn_delete.setText("Delete ...");
        btn_delete.setEnabled(false);
        getContentPane().add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 100, 30));

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addNewActionPerformed
        UserRegistration ur = new UserRegistration();
        ur.setVisible(true);
    }//GEN-LAST:event_btn_addNewActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void tbl_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_userMouseClicked
        //tbl_user.getSelectedRow();
        int i = tbl_user.getSelectedRowCount();
        if(i==1)
        {
            btn_edit.setEnabled(true);
            btn_delete.setEnabled(true);
        }
       else
        {
            btn_edit.setEnabled(false);
            btn_delete.setEnabled(false);
        }
    }//GEN-LAST:event_tbl_userMouseClicked

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
            java.util.logging.Logger.getLogger(Frm_UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_UserDetails().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addNew;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private java.util.List<com.rpst.yc.database.TblUser> tblUserList;
    private java.util.List<com.rpst.yc.database.TblUser> tblUserList1;
    private java.util.List<com.rpst.yc.database.TblUser> tblUserList2;
    private java.util.List<com.rpst.yc.database.TblUser> tblUserList3;
    private javax.persistence.Query tblUserQuery;
    private javax.persistence.Query tblUserQuery1;
    private javax.persistence.Query tblUserQuery2;
    private javax.persistence.Query tblUserQuery3;
    private javax.swing.JTable tbl_user;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}