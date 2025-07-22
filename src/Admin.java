// --- GUI (Graphical User Interface) - Komponen Visual dan Tata Letak ---
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

// --- DATABASE (Java Database Connectivity - JDBC) ---
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

// --- MULTITHREADING GUI (Agar UI tidak 'freeze') ---
import javax.swing.SwingWorker;
import java.util.concurrent.ExecutionException;

// --- DATA FORMATTING (Angka, Tanggal, dan Waktu) ---
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// --- PRINTING (Fungsi untuk Mencetak) ---
import java.awt.print.PrinterException;

public class Admin extends javax.swing.JFrame {

    private String selectedCarID = null;
    private User frameUser;
    
    public Admin() {
        initComponents();
        setupInitialUI();
        tampilDataMobil();
    }
    
    public void setUserFrame(User frameUser){
        this.frameUser = frameUser;
    }
    
    private void notifyUserFrameToRefresh(){
    if (frameUser != null){
        frameUser.refreshDataMobil();
    }
}
    
    public void terimaPermintaanDariUser(String idMobil, String merk, String nama, String warna){
        JOptionPane.showMessageDialog(this,
                "User meminta informasi untuk Mobil: \nID: " + idMobil + "\nMerk: " + merk + "\nNama: " + nama + "\nWarna: " + warna,
                "Permintaan Info dari User",
                JOptionPane.INFORMATION_MESSAGE);
    }
    public void refreshDataMobil() {
        tampilDataMobil();
    }
    private void setupInitialUI() {
        setTitle("Tambah Mobil");
        progressBar.setVisible(false);
        bedit.setEnabled(false);
        bhapus.setEnabled(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        bhapus = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        bkeluar = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        cb1 = new javax.swing.JComboBox<>();
        bbaru = new javax.swing.JToggleButton();
        btambah = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        bedit = new javax.swing.JToggleButton();
        tahun = new javax.swing.JFormattedTextField();
        harga = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        cb2 = new javax.swing.JComboBox<>();
        bcetak = new javax.swing.JButton();
        txtwarna = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("TIPE MOBIL");

        bhapus.setBackground(new java.awt.Color(255, 87, 34));
        bhapus.setForeground(new java.awt.Color(255, 255, 255));
        bhapus.setText("Hapus");
        bhapus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("MERK MOBIL");

        bkeluar.setBackground(new java.awt.Color(255, 87, 34));
        bkeluar.setForeground(new java.awt.Color(255, 255, 255));
        bkeluar.setText("Keluar");
        bkeluar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("HARGA MOBIL");

        jTable1.setBackground(new java.awt.Color(102, 153, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setSelectionBackground(new java.awt.Color(255, 51, 51));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 102));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("TAHUN");

        progressBar.setBackground(new java.awt.Color(0, 51, 255));
        progressBar.setForeground(new java.awt.Color(255, 51, 51));
        progressBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cb1.setBackground(new java.awt.Color(55, 71, 79));
        cb1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cb1.setForeground(new java.awt.Color(255, 255, 255));
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilihan--", "BMW", "Mercedes-Benz", "Audi", "Volkswagen (VW)", "Porsche", "Opel  ", "Maybach" }));
        cb1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        bbaru.setBackground(new java.awt.Color(255, 87, 34));
        bbaru.setForeground(new java.awt.Color(255, 255, 255));
        bbaru.setText("Baru");
        bbaru.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bbaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbaruActionPerformed(evt);
            }
        });

        btambah.setBackground(new java.awt.Color(255, 87, 34));
        btambah.setForeground(new java.awt.Color(255, 255, 255));
        btambah.setText("Tambah");
        btambah.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btambahActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("DATA MOBIL JERMAN");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 204, 255))); // NOI18N

        bedit.setBackground(new java.awt.Color(255, 87, 34));
        bedit.setForeground(new java.awt.Color(255, 255, 255));
        bedit.setText("Edit");
        bedit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });

        tahun.setBackground(new java.awt.Color(55, 71, 79));
        tahun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tahun.setForeground(new java.awt.Color(255, 255, 255));

        harga.setBackground(new java.awt.Color(55, 71, 79));
        harga.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        harga.setForeground(new java.awt.Color(255, 255, 255));
        harga.setText("Rp");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("NAMA MOBIL");

        txtnama.setBackground(new java.awt.Color(55, 71, 79));
        txtnama.setForeground(new java.awt.Color(255, 255, 255));
        txtnama.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cb2.setBackground(new java.awt.Color(55, 71, 79));
        cb2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cb2.setForeground(new java.awt.Color(255, 255, 255));
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilihan--", "Sedan", "Hatchback", "SUV", "MPV", "Coupe", "Convertible", "EV", "Wagon", "Sports", "Pickup" }));
        cb2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cb2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        bcetak.setBackground(new java.awt.Color(255, 87, 34));
        bcetak.setForeground(new java.awt.Color(255, 255, 255));
        bcetak.setText("Cetak");
        bcetak.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bcetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcetakActionPerformed(evt);
            }
        });

        txtwarna.setBackground(new java.awt.Color(55, 71, 79));
        txtwarna.setForeground(new java.awt.Color(255, 255, 255));
        txtwarna.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("WARNA MOBIL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(jLabel1)
                .addGap(158, 309, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bcetak)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtwarna)
                                    .addComponent(harga, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cb1, 0, 465, Short.MAX_VALUE)
                                    .addComponent(tahun, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtnama, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cb2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btambah, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bedit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bbaru)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(bbaru))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bedit)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bhapus)
                        .addGap(18, 18, 18)
                        .addComponent(bkeluar)
                        .addGap(18, 18, 18)
                        .addComponent(btambah))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtwarna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(bcetak)
                .addGap(18, 18, 18)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        if (selectedCarID == null) {
            JOptionPane.showMessageDialog(this, "Silakan pilih data mobil dari tabel yang ingin diubah.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String namaMobil = txtnama.getText().trim();
        String warnaMobil = txtwarna.getText().trim();
        String hargaInput = harga.getText().trim();
        String tahunInput = tahun.getText().trim();
        long hargaValue;
        int tahunValue;

        if (cb1.getSelectedIndex() == 0 || namaMobil.isEmpty() || cb2.getSelectedIndex() == 0 || warnaMobil.isEmpty() || hargaInput.isEmpty() || tahunInput.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            hargaValue = Long.parseLong(hargaInput.replaceAll("[^\\d]", ""));
            tahunValue = Integer.parseInt(tahunInput);
            if (tahunInput.length() != 4) {
                JOptionPane.showMessageDialog(this, "Tahun harus 4 digit angka!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Harga dan Tahun harus diisi dengan angka yang valid!", "Error Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        setTombolsEnabled(false);
        progressBar.setVisible(true);
        progressBar.setIndeterminate(true);
        String merk = cb1.getSelectedItem().toString();
        String tipe = cb2.getSelectedItem().toString();
        
        new SwingWorker<Boolean, Void>() {
            @Override
            protected Boolean doInBackground() throws Exception {
                String sql = "UPDATE mobil_jerman SET merk_mobil = ?, nama_mobil = ?, tipe_mobil = ?, warna_mobil = ?, Harga_mobil = ?, Tahun = ? WHERE ID_mobil = ?";
                try (Connection con = Koneksi.getKoneksi(); PreparedStatement pst = con.prepareStatement(sql)) {
                    pst.setString(1, merk);
                    pst.setString(2, namaMobil);
                    pst.setString(3, tipe);
                    pst.setString(4, warnaMobil);
                    pst.setLong(5, hargaValue);
                    pst.setInt(6, tahunValue);
                    pst.setInt(7, Integer.parseInt(selectedCarID));
                    Thread.sleep(2000);
                    return pst.executeUpdate() > 0;
                }
            }

            @Override
            protected void done() {
                try {
                    if (get()) {
                        JOptionPane.showMessageDialog(Admin.this, "Data mobil berhasil diubah!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                        tampilDataMobil();
                        bersihkanForm();
                    } else {
                        JOptionPane.showMessageDialog(Admin.this, "Gagal mengubah data mobil.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (HeadlessException | InterruptedException | ExecutionException e) {
                    JOptionPane.showMessageDialog(Admin.this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                } finally {
                    progressBar.setIndeterminate(false);
                    progressBar.setVisible(false);
                    setTombolsEnabled(true);
                }
            }
        }.execute();     
    }//GEN-LAST:event_beditActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        if (selectedCarID == null) {
            JOptionPane.showMessageDialog(this, "Silakan pilih data mobil dari tabel yang ingin dihapus.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int konfirmasi = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data mobil ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (konfirmasi == JOptionPane.YES_OPTION) {
            setTombolsEnabled(false);
            progressBar.setVisible(true);
            progressBar.setIndeterminate(true);

            new SwingWorker<Boolean, Void>() {
                @Override
                protected Boolean doInBackground() throws Exception {
                    String sql = "DELETE FROM mobil_jerman WHERE ID_mobil = ?";
                    try (Connection con = Koneksi.getKoneksi(); PreparedStatement pst = con.prepareStatement(sql)) {
                        pst.setInt(1, Integer.parseInt(selectedCarID));
                        Thread.sleep(2000);
                        return pst.executeUpdate() > 0;
                    }
                }

                @Override
                protected void done() {
                    try {
                        if (get()) {
                            JOptionPane.showMessageDialog(Admin.this, "Data mobil berhasil dihapus!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                            tampilDataMobil();
                            bersihkanForm();
                        } else {
                            JOptionPane.showMessageDialog(Admin.this, "Gagal menghapus data mobil.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(Admin.this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        progressBar.setIndeterminate(false);
                        progressBar.setVisible(false);
                        setTombolsEnabled(true);
                    }
                }
            }.execute();
        }
    }

    private void bersihkanForm() {
        txtnama.setText("");
        txtwarna.setText("");
        cb2.setSelectedIndex(0);
        harga.setText("Rp");
        tahun.setText("");
        cb1.setSelectedIndex(0);
        selectedCarID = null;
        jTable1.clearSelection();

        bedit.setEnabled(false);
        bhapus.setEnabled(false);
    }//GEN-LAST:event_bhapusActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
        int konfirmasi = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin keluar dari aplikasi?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);

        if (konfirmasi == JOptionPane.YES_OPTION) {
            setTombolsEnabled(false);
            progressBar.setVisible(true);
            progressBar.setIndeterminate(true);

            new SwingWorker<Void, Void>() {
                @Override
                protected Void doInBackground() throws Exception {
                    Thread.sleep(1500);
                    return null;
                }
                @Override
                protected void done() {
                    System.exit(0);
                }
            }.execute();
        }
    }//GEN-LAST:event_bkeluarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if (row != -1) {
            selectedCarID = jTable1.getValueAt(row, 0).toString();
            String merk = jTable1.getValueAt(row, 1).toString();
            String nama = jTable1.getValueAt(row, 2).toString();
            String tipe = jTable1.getValueAt(row, 3).toString();
            String warna = jTable1.getValueAt(row, 4).toString();
            String hargaFormatted = jTable1.getValueAt(row, 5).toString();
            String tahunValue = jTable1.getValueAt(row, 6).toString();

            cb1.setSelectedItem(merk);
            txtnama.setText(nama);
            cb2.setSelectedItem(tipe);
            txtwarna.setText(warna);
            harga.setText(hargaFormatted);
            tahun.setText(tahunValue);

            bedit.setEnabled(true);
            bhapus.setEnabled(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void bbaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbaruActionPerformed
        if (isFormKosong()){
        txtnama.requestFocus();
        return;
        }
        setTombolsEnabled(false);
        progressBar.setVisible(true);
        progressBar.setIndeterminate(true);

        new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                Thread.sleep(1000);
                return null;
            }

            @Override
            protected void done() {
                bersihkanForm();
                progressBar.setIndeterminate(false);
                progressBar.setVisible(false);
                setTombolsEnabled(true);
                btambah.setEnabled(true);
                txtnama.requestFocus();
            }
        }.execute();
}
        private boolean isFormKosong() {
        boolean merkKosong = (cb1.getSelectedIndex() == 0);
        boolean namaKosong = txtnama.getText().trim().isEmpty();
        boolean tipeKosong = (cb2.getSelectedIndex() == 0);
        boolean warnaKosong = txtwarna.getText().trim().isEmpty();
        String hargaText = harga.getText().trim();
        boolean hargaKosong = hargaText.isEmpty() || hargaText.equalsIgnoreCase("Rp");
        boolean tahunKosong = tahun.getText().trim().isEmpty();
        return merkKosong && namaKosong && tipeKosong && warnaKosong && hargaKosong && tahunKosong;
    }//GEN-LAST:event_bbaruActionPerformed

    private void btambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btambahActionPerformed
        String namaInput = txtnama.getText().trim();
        String warnaInput = txtwarna.getText().trim();
        String hargaInput = harga.getText().trim();
        String tahunInput = tahun.getText().trim();
        long hargaValue;
        int tahunValue;

        if (cb1.getSelectedIndex() == 0 || cb2.getSelectedIndex() == 0 || warnaInput.isEmpty() || namaInput.isEmpty() || hargaInput.isEmpty() || tahunInput.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            hargaValue = Long.parseLong(hargaInput.replaceAll("[^\\d]", ""));
            tahunValue = Integer.parseInt(tahunInput);
            if (tahunInput.length() != 4) {
                JOptionPane.showMessageDialog(this, "Tahun harus 4 digit angka!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Harga dan Tahun harus diisi dengan angka yang valid!", "Error Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        setTombolsEnabled(false);
        progressBar.setVisible(true);
        progressBar.setIndeterminate(true);
        String merk = cb1.getSelectedItem().toString();
        String tipe = cb2.getSelectedItem().toString();

        new SwingWorker<Boolean, Void>() {
            @Override
            protected Boolean doInBackground() throws Exception {
                String sql = "INSERT INTO mobil_jerman (merk_mobil, nama_mobil, tipe_mobil, warna_mobil, Harga_mobil, Tahun, Status) VALUES (?, ?, ?, ?, ?, ?, ?)";
                try (Connection con = Koneksi.getKoneksi(); PreparedStatement pst = con.prepareStatement(sql)) {
                    pst.setString(1, merk);
                    pst.setString(2, namaInput);
                    pst.setString(3, tipe);
                    pst.setString(4, warnaInput);
                    pst.setLong(5, hargaValue);
                    pst.setInt(6, tahunValue);
                    pst.setString(7, "tersedia");
                    Thread.sleep(2000);
                    return pst.executeUpdate() > 0;
                }
            }

            @Override
            protected void done() {
                try {
                    if (get()) {
                        JOptionPane.showMessageDialog(Admin.this, "Data mobil berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                        tampilDataMobil();
                        notifyUserFrameToRefresh();
                        bersihkanForm();
                    } else {
                        JOptionPane.showMessageDialog(Admin.this, "Gagal menambahkan data.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(Admin.this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                } finally {
                    progressBar.setIndeterminate(false);
                    progressBar.setVisible(false);
                    setTombolsEnabled(true);
                }
            }
        }.execute();
    }

    private void tampilDataMobil() {
        DefaultTableModel model = new DefaultTableModel() { /* ... */ };
        model.addColumn("ID Mobil");
        model.addColumn("Merk Mobil");
        model.addColumn("Nama Mobil");
        model.addColumn("Tipe Mobil");
        model.addColumn("Warna Mobil");
        model.addColumn("Harga");
        model.addColumn("Tahun");
        model.addColumn("Status");

        String sql = "SELECT * FROM mobil_jerman ORDER BY ID_mobil ASC";
        try (Connection con = Koneksi.getKoneksi(); Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("ID_mobil"), rs.getString("merk_mobil"), rs.getString("nama_mobil"),
                    rs.getString("tipe_mobil"), rs.getString("warna_mobil"), formatter.format(rs.getLong("Harga_mobil")),
                    rs.getInt("Tahun"), rs.getString("Status")
                });
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data Admin: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btambahActionPerformed

    private void numhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numhargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numhargaActionPerformed

    private void numtahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numtahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numtahunActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipe1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipe1ActionPerformed

    private void bcetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcetakActionPerformed
    Object[] options = {"Cetak Invoice Terpilih", "Cetak Laporan Semua Data", "Batal"};
    int choice = JOptionPane.showOptionDialog(this, "Silakan pilih opsi pencetakan yang Anda inginkan:", "Pilihan Cetak", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

    String teksUntukPreview = "";
    String judulPreview = "";

    switch (choice) {
        case 0: // Opsi "Cetak Invoice Terpilih"
            if (jTable1.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "Silakan pilih dulu data dari tabel.", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return; // Keluar jika tidak ada yang dipilih
            }
            teksUntukPreview = siapkanTeksInvoiceTerpilih();
            judulPreview = "Preview Invoice";
            break;
        case 1: // Opsi "Cetak Laporan Semua Data"
            teksUntukPreview = siapkanTeksLaporanSemua();
            judulPreview = "Preview Laporan Semua Data";
            break;
        default:
            return; // Keluar jika memilih batal atau menutup dialog
    }

    // Tampilkan jendela preview jika ada teks yang dihasilkan
    if (teksUntukPreview != null && !teksUntukPreview.isEmpty()) {
        tampilkanPreviewCetak(teksUntukPreview, judulPreview);
    }
}

/**
 * [BARU] Menampilkan JDialog preview dengan teks yang diberikan.
 */
private void tampilkanPreviewCetak(String teks, String judul) {
    // Membuat dialog baru yang modal (harus ditutup dulu)
    JDialog previewDialog = new JDialog(this, judul, true);
    previewDialog.setSize(500, 600);
    previewDialog.setLocationRelativeTo(this);
    previewDialog.setLayout(new BorderLayout());

    // Area teks untuk menampilkan preview
    JTextArea previewTextArea = new JTextArea(teks);
    previewTextArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
    previewTextArea.setEditable(false);
    
    // Tambahkan scrollbar jika teksnya panjang
    JScrollPane scrollPane = new JScrollPane(previewTextArea);

    // Panel untuk tombol-tombol
    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    
    JButton printButton = new JButton("✅ Cetak ke Printer");
    printButton.addActionListener((ActionEvent e) -> {
        try {
            // Logika print sekarang ada di sini
            boolean complete = previewTextArea.print();
            if (complete) {
                JOptionPane.showMessageDialog(previewDialog, "Pencetakan Selesai!", "Status", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(previewDialog, "Pencetakan Dibatalkan.", "Status", JOptionPane.WARNING_MESSAGE);
            }
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(previewDialog, "Gagal Mencetak: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        previewDialog.dispose(); // Tutup jendela preview setelah mencetak
    });

    JButton cancelButton = new JButton("❌ Batal");
    cancelButton.addActionListener((ActionEvent e) -> {
        previewDialog.dispose(); // Cukup tutup jendela preview
    });

    buttonPanel.add(cancelButton);
    buttonPanel.add(printButton);

    // Menambahkan komponen ke dialog
    previewDialog.add(scrollPane, BorderLayout.CENTER);
    previewDialog.add(buttonPanel, BorderLayout.SOUTH);

    // Tampilkan dialog
    previewDialog.setVisible(true);
}


// --- Metode-metode di bawah ini sekarang hanya bertugas menyiapkan String ---
private String siapkanTeksInvoiceTerpilih() {
    int selectedRow = jTable1.getSelectedRow();
    StringBuilder sb = new StringBuilder();
    formatDataInvoice(sb, selectedRow);
    return sb.toString();
}

private String siapkanTeksLaporanSemua() {
    int rowCount = jTable1.getRowCount();
    if (rowCount == 0) {
        JOptionPane.showMessageDialog(this, "Tabel tidak memiliki data untuk ditampilkan.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        return null; // Kembalikan null jika tidak ada data
    }
    StringBuilder sb = new StringBuilder();
    sb.append("         LAPORAN PENJUALAN MOBIL\n");
    sb.append("========================================================\n\n");
    for (int i = 0; i < rowCount; i++) {
        formatDataDetail(sb, i);
        if (i < rowCount - 1) {
            sb.append("--------------------------------------------------------\n");
        }
    }
    sb.append("\n========================================================\n");
    return sb.toString();
}

/*
 * Semua kode UI (JDialog, JTextArea) telah dihapus.
 */
private void formatDataInvoice(StringBuilder sb, int row) {
    // Mengambil data dari tabel (sesuaikan indeks kolom jika perlu)
    String id = jTable1.getValueAt(row, 0).toString();
    String nama = jTable1.getValueAt(row, 1).toString();
    String merk = jTable1.getValueAt(row, 2).toString();
    String tipe = jTable1.getValueAt(row, 3).toString();
    String warna = jTable1.getValueAt(row, 4).toString();
    String harga = jTable1.getValueAt(row, 5).toString();
    String tahun = jTable1.getValueAt(row, 6).toString();
    String tanggalCetak = new SimpleDateFormat("dd MMMM yyyy, HH:mm").format(new Date());

    // Membangun teks invoice
    sb.append("================================================\n");
    sb.append("              INVOICE PEMESANAN\n");
    sb.append("================================================\n\n");
    sb.append("Tanggal Cetak : ").append(tanggalCetak).append("\n");
    sb.append("ID Pesanan    : ").append(id).append("\n\n");
    sb.append("---------------- DETAIL MOBIL ----------------\n");
    sb.append(String.format("%-15s: %s\n", "Nama Mobil", nama));
    sb.append(String.format("%-15s: %s\n", "Merk Mobil", merk));
    sb.append(String.format("%-15s: %s\n", "Tipe Mobil", tipe));
    sb.append(String.format("%-15s: %s\n", "Warna Mobil", warna));
    sb.append(String.format("%-15s: %s\n", "Tahun", tahun));
    sb.append("------------------------------------------------\n");
    sb.append(String.format("%-15s: %s\n", "HARGA", harga));
    sb.append("================================================\n\n");
    sb.append("      TERIMA KASIH ATAS PEMBELIAN ANDA\n");
    sb.append("     Car DEALER - Terpercaya & Berkualitas\n\n\n");
    sb.append("TTD Pembeli: \n\n\n");
    sb.append(".......................\n");
}

/*
 * untuk laporan "Cetak Semua Data".
 */
private void formatDataDetail(StringBuilder sb, int row) {
    // Mengambil data dari tabel (sesuaikan indeks kolom jika perlu)
    String id = jTable1.getValueAt(row, 0).toString();
    String nama = jTable1.getValueAt(row, 1).toString();
    String merk = jTable1.getValueAt(row, 2).toString();
    String harga = jTable1.getValueAt(row, 5).toString();
    
    sb.append(String.format("ID    : %s\n", id));
    sb.append(String.format("Mobil : %s (%s)\n", nama, merk));
    sb.append(String.format("Harga : %s\n", harga));
}

/**
 * Metode ini bertanggung jawab untuk proses pencetakan.
 * Tidak ada perubahan di sini, sudah benar.
 */
private void cetakData(String dataUntukDicetak) {
    JTextArea textArea = new JTextArea(dataUntukDicetak);
    textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
    try {
        boolean complete = textArea.print();
        if (complete) {
            JOptionPane.showMessageDialog(this, "Pencetakan Selesai!", "Status", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Pencetakan Dibatalkan.", "Status", JOptionPane.WARNING_MESSAGE);
        }
    } catch (PrinterException ex) {
        JOptionPane.showMessageDialog(this, "Gagal Mencetak: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_bcetakActionPerformed

    private void setTombolsEnabled(boolean isEnabled) {
        btambah.setEnabled(isEnabled);
        bedit.setEnabled(isEnabled);
        bhapus.setEnabled(isEnabled);
        bbaru.setEnabled(isEnabled);
        bkeluar.setEnabled(isEnabled);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bbaru;
    private javax.swing.JButton bcetak;
    private javax.swing.JToggleButton bedit;
    private javax.swing.JToggleButton bhapus;
    private javax.swing.JToggleButton bkeluar;
    private javax.swing.JToggleButton btambah;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JFormattedTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JFormattedTextField tahun;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtwarna;
    // End of variables declaration//GEN-END:variables
}
