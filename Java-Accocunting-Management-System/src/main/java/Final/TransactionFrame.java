package Final;

import static Final.AppSettings.darkMode;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TransactionFrame extends javax.swing.JFrame {

    DbManagement dbm;

    public TransactionFrame(DbManagement b) {
        initComponents();
        dbm = b;
        id.setEnabled(false);
        if (darkMode) {
            panel.setBackground(new Color(0, 0, 26));
            panel1.setBackground(new Color(0, 0, 26));
            panel2.setBackground(new Color(0, 0, 26));
        }
    }

    public void clearFields() {
        id.setText("");
        amount.setText("");
        Description.setText("");
        combo.setSelectedIndex(0);

        Income.setSelected(false);
        Expense.setSelected(false);

        TL.setSelected(false);
        USD.setSelected(false);
        EURO.setSelected(false);
    }

    private void loadTransactionTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0); // Mevcut satırları temizliyo bu

            List<Transaction> list = dbm.getAllTransactions();
            for (Transaction t : list) {
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

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Tablo yüklenirken hata oluştu: " + ex.getMessage());
        }
    }

//    private void updateTable(List<Transaction> list) {
//        DefaultTableModel model = (DefaultTableModel) table.getModel();
//        model.setRowCount(0);
//
//        for (Transaction t : list) {
//            Object[] row = {
//                t.getTransactionId(),
//                t.getTransactionDate(),
//                t.getType(),
//                t.getCategory(),
//                t.getAmount(),
//                t.getDescription(),
//                t.getCurrency(),
//                t.getUsername()
//            };
//            model.addRow(row);
//        }
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        filter = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        delete = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        amount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        USD = new javax.swing.JRadioButton();
        TL = new javax.swing.JRadioButton();
        EURO = new javax.swing.JRadioButton();
        Income = new javax.swing.JRadioButton();
        Expense = new javax.swing.JRadioButton();
        add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(204, 204, 204));
        panel.setForeground(new java.awt.Color(102, 102, 102));

        back.setBackground(new java.awt.Color(102, 102, 102));
        back.setForeground(new java.awt.Color(204, 204, 204));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(102, 102, 102));
        jTabbedPane1.setForeground(new java.awt.Color(204, 204, 204));

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.setForeground(new java.awt.Color(102, 102, 102));

        table.setBackground(new java.awt.Color(204, 204, 204));
        table.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        table.setForeground(new java.awt.Color(102, 102, 102));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Transaction ID", "Date", "Type", "Category", "Amount", "Description", "Currency", "User"
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        filter.setBackground(new java.awt.Color(102, 102, 102));
        filter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        filter.setForeground(new java.awt.Color(204, 204, 204));
        filter.setText("Filter");
        filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterActionPerformed(evt);
            }
        });

        list.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.lightGray));
        list.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "All", "Rent", "Salary", "Food", "Utilities", "Transportation", "Others" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(list);

        delete.setBackground(new java.awt.Color(102, 102, 102));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(204, 204, 204));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(filter, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("VIEW/DELETE", panel1);

        panel2.setBackground(new java.awt.Color(204, 204, 204));
        panel2.setForeground(new java.awt.Color(102, 102, 102));

        amount.setBackground(new java.awt.Color(102, 102, 102));
        amount.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Amount");

        combo.setBackground(new java.awt.Color(102, 102, 102));
        combo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        combo.setForeground(new java.awt.Color(204, 204, 204));
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rent", "Salary", "Food", "Utilities", "Transportation", "Others" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        USD.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(USD);
        USD.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        USD.setForeground(new java.awt.Color(102, 102, 102));
        USD.setText("USD");

        TL.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(TL);
        TL.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        TL.setForeground(new java.awt.Color(102, 102, 102));
        TL.setText("TL");

        EURO.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(EURO);
        EURO.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        EURO.setForeground(new java.awt.Color(102, 102, 102));
        EURO.setText("EURO");

        Income.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup2.add(Income);
        Income.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Income.setForeground(new java.awt.Color(102, 102, 102));
        Income.setText("Income");

        Expense.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup2.add(Expense);
        Expense.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Expense.setForeground(new java.awt.Color(102, 102, 102));
        Expense.setText("Expense");

        add.setBackground(new java.awt.Color(102, 102, 102));
        add.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add.setForeground(new java.awt.Color(204, 204, 204));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        Description.setBackground(new java.awt.Color(102, 102, 102));
        Description.setColumns(20);
        Description.setRows(5);
        jScrollPane1.setViewportView(Description);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Description:");

        update.setBackground(new java.awt.Color(102, 102, 102));
        update.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        update.setForeground(new java.awt.Color(204, 204, 204));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        id.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Id:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Type:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Category:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Currency:");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Income)
                                        .addComponent(Expense, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(62, 62, 62)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EURO)
                                    .addComponent(jLabel6)
                                    .addComponent(USD)
                                    .addComponent(TL)))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(692, Short.MAX_VALUE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Income)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Expense))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(USD)
                        .addGap(18, 18, 18)
                        .addComponent(TL)
                        .addGap(18, 18, 18)
                        .addComponent(EURO)))
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ADD/UPDATE", panel2);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if (dbm.isUserOfType(dbm.user.getName(), "user")) {
            new MainFrameUser(dbm).setVisible(true);
            dispose();
        } else {
            new MainFrame(dbm).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_backActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        try {

            String type = Income.isSelected() ? "Income" : Expense.isSelected() ? "Expense" : "";
            String category = combo.getSelectedItem().toString();
            String currency = "";
            if (TL.isSelected()) {
                currency = "TL";
            } else if (USD.isSelected()) {
                currency = "USD";
            } else if (EURO.isSelected()) {
                currency = "EURO";
            }
            String amountText = amount.getText().trim();
            String description = Description.getText().trim();

            if (type.isEmpty() || category.isEmpty() || currency.isEmpty()
                    || amountText.isEmpty() || description.isEmpty()) {
                throw new MyException();
            }
            if (!amountText.matches("^\\d{1,9}(\\.\\d{1,2})?$")) {
                JOptionPane.showMessageDialog(this, "Miktar en fazla 9 basamaklı ve geçerli bir sayı olmalıdır.");
                return;
            }

            if (!description.matches("^.{1,100}$")) {
                JOptionPane.showMessageDialog(this, "Açıklama en fazla 100 karakter olabilir.");
                return;
            }

            float amount = Float.parseFloat(amountText);
            String username = dbm.user.getName();

            dbm.add(type, category, amount, description, currency, username);
            JOptionPane.showMessageDialog(this, "İşlem başarıyla eklendi.");
            loadTransactionTable();
            clearFields();
        } catch (MyException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
        }
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Lütfen güncellemek için bir kayıt seçin.");
            return;
        }

        int transactionId = (int) table.getValueAt(selectedRow, 0);

        String type = Income.isSelected() ? "income" : "expense";
        String category = (String) combo.getSelectedItem();
        String currency = TL.isSelected() ? "TL" : (USD.isSelected() ? "USD" : "EURO");
        if (type.isEmpty() || category.isEmpty() || currency.isEmpty()
                || amount.getText().isEmpty() || Description.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen tüm alanları doldurun.");
            return;
        }
        if (!amount.getText().matches("^\\d{1,9}(\\.\\d{1,2})?$")) {
            JOptionPane.showMessageDialog(this, "Miktar en fazla 9 basamaklı ve geçerli bir sayı olmalıdır.");
            return;
        }

        if (!Description.getText().matches("^.{1,100}$")) {
            JOptionPane.showMessageDialog(this, "Açıklama en fazla 100 karakter olabilir.");
            return;
        }

        try {
            float amountn = Float.parseFloat(amount.getText());
            String description = Description.getText();

            boolean success = dbm.update(transactionId, type, category, amountn, description, currency);
            loadTransactionTable();
            clearFields();
            if (success) {
                JOptionPane.showMessageDialog(this, "Kayıt başarıyla güncellendi.");
                loadTransactionTable();
            } else {
                JOptionPane.showMessageDialog(this, "Güncelleme başarısız.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Geçerli bir tutar giriniz.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Veritabanı hatası.");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Lütfen silmek için bir kayıt seçin.");
            return;
        }

        int transactionId = (int) table.getValueAt(selectedRow, 0);

        int confirm = JOptionPane.showConfirmDialog(this, "Bu işlemi silmek istediğinize emin misiniz?", "Onayla", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                if (dbm.delete(transactionId)) {
                    JOptionPane.showMessageDialog(this, "Kayıt başarıyla silindi.");
                    loadTransactionTable();
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(this, "Silme işlemi başarısız.");
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Veritabanı hatası.");
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterActionPerformed
        String selectedCategory = list.getSelectedValue();

        List<Transaction> transactions;
        try {

            if (selectedCategory == null || selectedCategory.equals("All")) {

                transactions = dbm.getAllTransactions();
            } else {
                transactions = dbm.getTransactionsByCategory(selectedCategory);
            }

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);

            for (Transaction t : transactions) {
                model.addRow(new Object[]{
                    t.getTransactionId(),
                    t.getTransactionDate().toString(),
                    t.getType(),
                    t.getCategory(),
                    t.getAmount(),
                    t.getDescription(),
                    t.getCurrency(),
                    t.getUsername()
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Veri çekilirken hata oluştu: " + ex.getMessage());
        }
    }//GEN-LAST:event_filterActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {

            int modelRow = table.convertRowIndexToModel(selectedRow);

            String idStr = table.getModel().getValueAt(modelRow, 0).toString();
            id.setText(idStr);

            String type = table.getModel().getValueAt(modelRow, 2).toString().toLowerCase();
            if (type.equals("income")) {
                Income.setSelected(true);
            } else if (type.equals("expense")) {
                Expense.setSelected(true);
            }

            String category = table.getModel().getValueAt(modelRow, 3).toString();
            combo.setSelectedItem(category);

            String amountStr = table.getModel().getValueAt(modelRow, 4).toString();
            amount.setText(amountStr);

            String desc = table.getModel().getValueAt(modelRow, 5).toString();
            Description.setText(desc);

            String currency = table.getModel().getValueAt(modelRow, 6).toString().toUpperCase();
            switch (currency) {
                case "USD":
                    USD.setSelected(true);
                    break;
                case "TL":
                    TL.setSelected(true);
                    break;
                case "EURO":
                    EURO.setSelected(true);
                    break;
                default:

                    USD.setSelected(false);
                    TL.setSelected(false);
                    EURO.setSelected(false);
                    break;
            }
        }
    }//GEN-LAST:event_tableMouseClicked

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

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
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransactionFrame(dbm).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Description;
    private javax.swing.JRadioButton EURO;
    private javax.swing.JRadioButton Expense;
    private javax.swing.JRadioButton Income;
    private javax.swing.JRadioButton TL;
    private javax.swing.JRadioButton USD;
    private javax.swing.JButton add;
    private javax.swing.JTextField amount;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton delete;
    private javax.swing.JButton filter;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> list;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
