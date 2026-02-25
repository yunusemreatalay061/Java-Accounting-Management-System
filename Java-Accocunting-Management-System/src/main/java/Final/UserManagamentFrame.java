
package Final;

import static Final.AppSettings.darkMode;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class UserManagamentFrame extends javax.swing.JFrame {

    
    DbManagement dbm;

    public UserManagamentFrame(DbManagement b) {
        initComponents();
        dbm = b;
        id.setEnabled(false);
        if (darkMode) {
            panel1.setBackground(new Color(0, 0, 26));
            panel2.setBackground(new Color(0, 0, 26));
        }
    }

    private void refreshTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel(); 
            model.setRowCount(0);

            for (User user : dbm.getAllUsers()) {
                model.addRow(new Object[]{
                    user.getId(),
                    user.getName(),
                    user.getPassword(),
                    user.getRole()
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void clearFields() {
        name.setText("");
        p1.setText("");
        id.setText("");
        buttonGroup1.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSplitPane2 = new javax.swing.JSplitPane();
        panel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        searchbuton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        add1 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        p1 = new javax.swing.JPasswordField();
        check = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(204, 204, 204));

        table.setBackground(new java.awt.Color(204, 204, 204));
        table.setForeground(new java.awt.Color(102, 102, 102));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "User Id", "User Name", "User Password", "User Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        search.setBackground(new java.awt.Color(102, 102, 102));
        search.setForeground(new java.awt.Color(204, 204, 204));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        searchbuton.setBackground(new java.awt.Color(102, 102, 102));
        searchbuton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        searchbuton.setForeground(new java.awt.Color(204, 204, 204));
        searchbuton.setText("SEARCH");
        searchbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbutonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(searchbuton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchbuton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(search)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane2.setLeftComponent(panel1);

        panel2.setBackground(new java.awt.Color(204, 204, 204));

        name.setBackground(new java.awt.Color(102, 102, 102));
        name.setForeground(new java.awt.Color(204, 204, 204));

        r1.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        r1.setForeground(new java.awt.Color(102, 102, 102));
        r1.setText("User");

        r2.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        r2.setForeground(new java.awt.Color(102, 102, 102));
        r2.setText("Admin");

        id.setBackground(new java.awt.Color(102, 102, 102));
        id.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("User Name:");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("User Id:");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("User Type:");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("User Password:");

        update.setBackground(new java.awt.Color(102, 102, 102));
        update.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        update.setForeground(new java.awt.Color(204, 204, 204));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        add1.setBackground(new java.awt.Color(102, 102, 102));
        add1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add1.setForeground(new java.awt.Color(204, 204, 204));
        add1.setText("ADD");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(102, 102, 102));
        delete.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(204, 204, 204));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        p1.setBackground(new java.awt.Color(102, 102, 102));
        p1.setForeground(new java.awt.Color(204, 204, 204));

        check.setBackground(new java.awt.Color(204, 204, 204));
        check.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        check.setForeground(new java.awt.Color(102, 102, 102));
        check.setText("I allow my information to be used");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel2Layout.createSequentialGroup()
                            .addGap(111, 111, 111)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(p1)
                                .addComponent(r2)
                                .addComponent(r1)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(name)
                                .addComponent(id)))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r2)
                .addGap(36, 36, 36)
                .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        jSplitPane2.setRightComponent(panel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
    }//GEN-LAST:event_searchActionPerformed

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        String type;
        String username = name.getText();
        String password = new String(p1.getPassword());

        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kullanici ismini yaziniz");
            return;
        }

        if (!username.matches("^[a-zA-Z]{2,}$")) {
            JOptionPane.showMessageDialog(null, "Kullanıcı ismi en az 2 harf olmalı ve boşluk içermemelidir");
            return;
        }

        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kullanici sifresini yaziniz");
            return;
        }

        if (!password.matches(".*[A-Z].*")) {
            JOptionPane.showMessageDialog(null, "Şifre en az bir büyük harf içermelidir");
            return;
        }

        if (r1.isSelected() || r2.isSelected()) {
            type = r2.isSelected() ? "admin" : "user";
        } else {
            JOptionPane.showMessageDialog(null, "Kullanici turu seciniz");
            return;
        }

        if (!check.isSelected()) {
            JOptionPane.showMessageDialog(null, "Sozlesmeyi kabul ediniz");
            return;
        }

        try {
            boolean success = dbm.add(username, password, type);
            if (success) {
                JOptionPane.showMessageDialog(null, "Kullanıcı eklendi!");
                refreshTable();
                clearFields();
            } else {
                JOptionPane.showMessageDialog(null, "Ekleme başarısız!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hata: " + ex.getMessage());
        }
    }//GEN-LAST:event_add1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Silinecek kullanıcıyı seçin!");
            return;
        }

        int userId = (int) table.getValueAt(selectedRow, 0);

        int confirm = JOptionPane.showConfirmDialog(null, "Kullanıcıyı silmek istediğinize emin misiniz?", "Onay", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            boolean success = dbm.deleteUser(userId);
            if (success) {
                JOptionPane.showMessageDialog(null, "Kullanıcı silindi!");
                refreshTable();
                clearFields();

            } else {
                JOptionPane.showMessageDialog(null, "Silme başarısız!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hata: " + ex.getMessage());
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Lütfen bir kullanıcı seçin.");
            return;
        }

        int userId = (int) table.getValueAt(selectedRow, 0);
        String username = name.getText();
        String password = new String(p1.getPassword());
        String type = r2.isSelected() ? "admin" : "user";
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kullanici ismini yaziniz");
            return;
        }

        if (!username.matches("^[a-zA-Z]{2,}$")) {
            JOptionPane.showMessageDialog(null, "Kullanıcı ismi en az 2 harf olmalı ve boşluk içermemelidir");
            return;
        }

        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kullanici sifrenizi yaziniz");
            return;
        }

        if (!password.matches(".*[A-Z].*")) {
            JOptionPane.showMessageDialog(null, "Şifreniz en az bir büyük harf içermelidir");
            return;
        }

        try {
            boolean success = dbm.update(userId, username, password, type);
            if (success) {
                JOptionPane.showMessageDialog(this, "Kullanıcı güncellendi.");
                refreshTable();
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Güncelleme başarısız.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void searchbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbutonActionPerformed
        String keyword = search.getText();

        try {
            List<User> list = dbm.searchUsers(keyword);
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            for (User u : list) {
                model.addRow(new Object[]{u.getId(), u.getName(), u.getPassword(), u.getRole()});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_searchbutonActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int row = table.getSelectedRow();
        name.setText(table.getValueAt(row, 1).toString());
        p1.setText(table.getValueAt(row, 2).toString());
        String type = table.getValueAt(row, 3).toString();
        id.setText(table.getValueAt(row, 0).toString());
        if (type.equals("admin")) {
            r2.setSelected(true);
        } else {
            r1.setSelected(true);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MainFrame(dbm).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserManagamentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserManagamentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserManagamentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserManagamentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox check;
    private javax.swing.JButton delete;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField p1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextField search;
    private javax.swing.JButton searchbuton;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
