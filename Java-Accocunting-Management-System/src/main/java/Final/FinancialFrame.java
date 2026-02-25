
package Final;

import static Final.AppSettings.darkMode;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author YUNUS
 */
public class FinancialFrame extends javax.swing.JFrame {

    DbManagement dbm;

    public FinancialFrame(DbManagement d) {
        initComponents();
        dbm = d;
        if (darkMode) {
            panel.setBackground(new Color(0, 0, 26));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        Filter = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        table5 = new javax.swing.JTable();
        back = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        I = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        N = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(204, 204, 204));
        panel.setForeground(new java.awt.Color(102, 102, 102));

        Filter.setBackground(new java.awt.Color(102, 102, 102));
        Filter.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Filter.setForeground(new java.awt.Color(204, 204, 204));
        Filter.setText("Filter");
        Filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterActionPerformed(evt);
            }
        });

        combo.setBackground(new java.awt.Color(102, 102, 102));
        combo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        combo.setForeground(new java.awt.Color(204, 204, 204));
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        table5.setBackground(new java.awt.Color(204, 204, 204));
        table5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        table5.setForeground(new java.awt.Color(102, 102, 102));
        table5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Transaction ID", "Date", "Type", "Category", "Amount", "Description", "User", "Currency"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table5MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(table5);

        back.setBackground(new java.awt.Color(102, 102, 102));
        back.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(204, 204, 204));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        save.setBackground(new java.awt.Color(102, 102, 102));
        save.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(204, 204, 204));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Income");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Expence");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Net Balance");

        I.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        I.setForeground(new java.awt.Color(102, 102, 102));

        E.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        E.setForeground(new java.awt.Color(102, 102, 102));

        N.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        N.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Filter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(I, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(E, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(back))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(back)
                .addGap(24, 24, 24)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

    private void table5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table5MouseClicked

    }//GEN-LAST:event_table5MouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if (dbm.isUserOfType(dbm.user.getName(), "user")) {
            new MainFrameUser(dbm).setVisible(true);
            dispose();
        } else {
            new MainFrame(dbm).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_backActionPerformed

    private void FilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterActionPerformed
        try {

            int month = combo.getSelectedIndex() + 1; 
            if (combo.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "Lütfen bir ay seçiniz.");
                return;
            }

            List<Transaction> filtered = dbm.getTransactionsByTypeAndMonth(month);

            DefaultTableModel model = (DefaultTableModel) table5.getModel();
            model.setRowCount(0);

            for (Transaction t : filtered) {
                model.addRow(new Object[]{
                    t.getTransactionId(),
                    t.getTransactionDate(),
                    t.getType(),
                    t.getCategory(),
                    t.getAmount(),
                    t.getDescription(),
                    t.getCurrency(),
                    t.getUsername()
                });
            }
            float totalIncome = 0;
            float totalExpense = 0;

            for (int i = 0; i < model.getRowCount(); i++) {
                String type = model.getValueAt(i, 2).toString(); 
                float amount = Float.parseFloat(model.getValueAt(i, 4).toString());
                String currency = model.getValueAt(i, 6).toString();

                // Döviz dönüşüm
                switch (currency) {
                    case "USD":
                        amount *= 30;
                        break;
                    case "EURO":
                        amount *= 44;
                        break;
                    case "TL":
                    default:
                    
                        break;
                }

                if (type.equalsIgnoreCase("Income")) {
                    totalIncome += amount;
                } else if (type.equalsIgnoreCase("Expense")) {
                    totalExpense += amount;
                }
            }

            float netBalance = totalIncome - totalExpense;

            // Label'lara yaz
            I.setText(String.format("%.2f TL", totalIncome));
            E.setText(String.format("%.2f TL", totalExpense));
            N.setText(String.format("%.2f TL", (totalIncome - totalExpense)));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Filtreleme hatası: " + ex.getMessage());
        }
    }//GEN-LAST:event_FilterActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(this);

            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();

                if (!file.getName().toLowerCase().endsWith(".txt")) {
                    file = new File(file.getAbsolutePath() + ".txt");
                }

                // Label'lardan verileri al
                String incomeText = I.getText();
                String expenseText = E.getText();
                String netBalanceText = N.getText();

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    writer.write(combo.getSelectedItem().toString() + "'s Financial Reports");
                    writer.newLine();
                    writer.write("Total Income: " + incomeText);
                    writer.newLine();
                    writer.write("Total Expence: " + expenseText);
                    writer.newLine();
                    writer.write("Net Balance: " + netBalanceText);
                    writer.newLine();
                }

                JOptionPane.showMessageDialog(this, "Rapor başarıyla kaydedildi.");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Dosya yazılırken hata oluştu: " + ex.getMessage());
        }
    }//GEN-LAST:event_saveActionPerformed

    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FinancialFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinancialFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinancialFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinancialFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinancialFrame(dbm).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel E;
    private javax.swing.JButton Filter;
    private javax.swing.JLabel I;
    private javax.swing.JLabel N;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel panel;
    private javax.swing.JButton save;
    private javax.swing.JTable table5;
    // End of variables declaration//GEN-END:variables
}
