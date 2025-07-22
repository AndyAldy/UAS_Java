// --- GUI (Graphical User Interface) & Exception ---
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

// --- DATABASE (Java Database Connectivity - JDBC) ---
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

// --- MULTITHREADING GUI (Agar UI tidak 'freeze') ---
import javax.swing.SwingWorker;
import java.util.concurrent.ExecutionException;

// --- DATA FORMATTING (Angka dan Regional) ---
import java.text.NumberFormat;
import java.util.Locale;

public class User extends javax.swing.JFrame {
    
    private Admin frameAdmin; 

    public User() {
        initComponents();
        setupInitialUI();
        refreshDataMobil();
    }
    
    private void setupInitialUI(){
        this.setLocationRelativeTo(null);
        setTitle("Katalog Mobil");
        bpesan.setEnabled(false);
        
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        jTable1MouseClicked(evt);
    }
});
    }
    
    public final void refreshDataMobil(){
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        model.addColumn("ID Mobil");
        model.addColumn("Nama Mobil");
        model.addColumn("Merk Mobil");
        model.addColumn("Tipe Mobil");
        model.addColumn("Warna Mobil");
        model.addColumn("Harga Mobil");
        model.addColumn("Tahun Keluaran");
        model.addColumn("Status");

        String sql = "SELECT * FROM mobil_jerman ORDER BY ID_mobil ASC";
    
        try (Connection con = Koneksi.getKoneksi();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
        
            NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        
            while (rs.next()){
                String hargaFormatted = formatter.format(rs.getLong("Harga_mobil"));
                model.addRow(new Object[]{
                    rs.getInt("ID_mobil"),
                    rs.getString("nama_mobil"),
                    rs.getString("merk_mobil"),
                    rs.getString("tipe_mobil"),
                    rs.getString("warna_mobil"),
                    hargaFormatted,
                    rs.getString("Tahun"),
                    rs.getString("Status")
                });
            }
            jTable1.setModel(model);
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Gagal memuat data Mobil: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        bpesan.setEnabled(false);
    }
    
    public void setAdminFrame(Admin frameAdmin){
        this.frameAdmin = frameAdmin;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bpesan = new javax.swing.JButton();
        brefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("KATALOG MOBIL JERMAN");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        jTable1.setBackground(new java.awt.Color(102, 153, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(255, 51, 51));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 102));
        jScrollPane1.setViewportView(jTable1);

        bpesan.setBackground(new java.awt.Color(255, 51, 51));
        bpesan.setForeground(new java.awt.Color(255, 255, 255));
        bpesan.setText("Pesan");
        bpesan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bpesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpesanActionPerformed(evt);
            }
        });

        brefresh.setBackground(new java.awt.Color(255, 51, 51));
        brefresh.setForeground(new java.awt.Color(255, 255, 255));
        brefresh.setText("Refresh");
        brefresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        brefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(brefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(228, 228, 228)
                .addComponent(bpesan)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(brefresh)
                            .addComponent(bpesan))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bpesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpesanActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            return;
        }

        // Deklarasi final agar bisa diakses oleh inner class
        final String idMobil = jTable1.getValueAt(selectedRow, 0).toString();
        final String merk = jTable1.getValueAt(selectedRow, 1).toString();
        final String nama = jTable1.getValueAt(selectedRow, 2).toString();
        final String warna = jTable1.getValueAt(selectedRow, 4).toString();

        int konfirmasi = JOptionPane.showConfirmDialog(this, 
                "Anda yakin ingin memesan mobil " + merk + " " + nama + " " + warna + "?", 
                "Konfirmasi Pesanan", 
                JOptionPane.YES_NO_OPTION);

        if (konfirmasi == JOptionPane.YES_OPTION) {
            bpesan.setEnabled(false);
            new SwingWorker<Boolean, Void>() {
                @Override
                protected Boolean doInBackground() throws Exception {
                    String sql = "UPDATE mobil_jerman SET Status = 'Dipesan' WHERE ID_mobil = ?";
                    try (Connection con = Koneksi.getKoneksi();
                        PreparedStatement pst = con.prepareStatement(sql)) {
                        pst.setInt(1, Integer.parseInt(idMobil));
                        return pst.executeUpdate() > 0;
                    }
                }

                @Override
                protected void done() {
                    try {
                        if (get()) {
                            JOptionPane.showMessageDialog(User.this, "Pemesanan berhasil! Notifikasi dikirim ke Admin.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                            refreshDataMobil();
                            if (frameAdmin != null) {
                                frameAdmin.refreshDataMobil();
                                frameAdmin.terimaPermintaanDariUser(idMobil, merk, nama, warna);
                            }
                        } else {
                            JOptionPane.showMessageDialog(User.this, "Gagal melakukan pemesanan.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (HeadlessException | InterruptedException | ExecutionException e) {
                        JOptionPane.showMessageDialog(User.this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }.execute();
        }
    }//GEN-LAST:event_bpesanActionPerformed

    private void brefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brefreshActionPerformed
    refreshDataMobil();
    JOptionPane.showMessageDialog(this, "Data telah berhasil diperbarui.", "Refresh Berhasil", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_brefreshActionPerformed
     private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        int row = jTable1.getSelectedRow();
        if (row != -1){
            String status = jTable1.getValueAt(row, 7).toString();
            if (status.equalsIgnoreCase("tersedia")) {
                bpesan.setEnabled(true);
            } else {
                bpesan.setEnabled(false);
            }
        }
    }        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bpesan;
    private javax.swing.JButton brefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
