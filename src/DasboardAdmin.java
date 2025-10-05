import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class DasboardAdmin extends javax.swing.JFrame {

    public DasboardAdmin() {
        initComponents();
        loadDataBook();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BodyPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnPemgembalian = new javax.swing.JButton();
        btnBook = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnDaftarAnggota = new javax.swing.JButton();
        btnPeminjaman = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        Book = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelBook = new javax.swing.JTable();
        btnHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnEdit1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        DaftarAnggota = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Peminjaman = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Pengembalian = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("cjvjcvjcvjcbvjcbvjcvcjvcbjvbcjvcvjcv");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BodyPanel.setBackground(new java.awt.Color(0, 102, 102));

        jPanel5.setBackground(new java.awt.Color(0, 77, 128));

        btnPemgembalian.setText("PENGEMBALIAN");
        btnPemgembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPemgembalianActionPerformed(evt);
            }
        });

        btnBook.setText("BOOK");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dashboard Admin Perpus");

        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnDaftarAnggota.setText("DAFTAR ANGGOTA");
        btnDaftarAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarAnggotaActionPerformed(evt);
            }
        });

        btnPeminjaman.setText("PEMINJAMAN");
        btnPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeminjamanActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("(BOOK)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPemgembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDaftarAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel3)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDaftarAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPemgembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );

        MainPanel.setBackground(new java.awt.Color(245, 245, 245));
        MainPanel.setLayout(new java.awt.CardLayout());

        PanelBook.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(PanelBook);

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit1.setText("Edit");
        btnEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("BOOK");

        javax.swing.GroupLayout BookLayout = new javax.swing.GroupLayout(Book);
        Book.setLayout(BookLayout);
        BookLayout.setHorizontalGroup(
            BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BookLayout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        BookLayout.setVerticalGroup(
            BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        MainPanel.add(Book, "card2");

        jLabel4.setText("Daftar Anggota");

        javax.swing.GroupLayout DaftarAnggotaLayout = new javax.swing.GroupLayout(DaftarAnggota);
        DaftarAnggota.setLayout(DaftarAnggotaLayout);
        DaftarAnggotaLayout.setHorizontalGroup(
            DaftarAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DaftarAnggotaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(359, Short.MAX_VALUE))
        );
        DaftarAnggotaLayout.setVerticalGroup(
            DaftarAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DaftarAnggotaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addContainerGap(649, Short.MAX_VALUE))
        );

        MainPanel.add(DaftarAnggota, "card3");

        jLabel5.setText("Peminjaman");

        javax.swing.GroupLayout PeminjamanLayout = new javax.swing.GroupLayout(Peminjaman);
        Peminjaman.setLayout(PeminjamanLayout);
        PeminjamanLayout.setHorizontalGroup(
            PeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PeminjamanLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(359, Short.MAX_VALUE))
        );
        PeminjamanLayout.setVerticalGroup(
            PeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PeminjamanLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addContainerGap(649, Short.MAX_VALUE))
        );

        MainPanel.add(Peminjaman, "card4");

        jLabel6.setText("Pengembalian");

        javax.swing.GroupLayout PengembalianLayout = new javax.swing.GroupLayout(Pengembalian);
        Pengembalian.setLayout(PengembalianLayout);
        PengembalianLayout.setHorizontalGroup(
            PengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PengembalianLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(359, Short.MAX_VALUE))
        );
        PengembalianLayout.setVerticalGroup(
            PengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PengembalianLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addContainerGap(649, Short.MAX_VALUE))
        );

        MainPanel.add(Pengembalian, "card5");

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BodyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPemgembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPemgembalianActionPerformed
        // TODO add your handling code here:
        java.awt.CardLayout cl = (java.awt.CardLayout) MainPanel.getLayout();
        cl.show(MainPanel, "card5"); // "card2" itu panel Book di NetBeans

        loadDataBook(); // refresh tabel
    }//GEN-LAST:event_btnPemgembalianActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
                                             
        // Tutup dashboard
        this.dispose();  

        // Balik ke form login
        new FormLogin().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnDaftarAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarAnggotaActionPerformed
        // TODO add your handling code here:
        java.awt.CardLayout cl = (java.awt.CardLayout) MainPanel.getLayout();
        cl.show(MainPanel, "card3"); // "card2" itu panel Book di NetBeans

        loadDataBook(); // refresh tabel
    }//GEN-LAST:event_btnDaftarAnggotaActionPerformed

    private void btnPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeminjamanActionPerformed
        // TODO add your handling code here:
        java.awt.CardLayout cl = (java.awt.CardLayout) MainPanel.getLayout();
        cl.show(MainPanel, "card4"); // "card2" itu panel Book di NetBeans

        loadDataBook(); // refresh tabel
    }//GEN-LAST:event_btnPeminjamanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int viewRow = PanelBook.getSelectedRow();
        if (viewRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data dulu!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int modelRow = PanelBook.convertRowIndexToModel(viewRow);
        javax.swing.table.TableModel model = PanelBook.getModel();
        String id = model.getValueAt(modelRow, 1).toString(); // kolom 1 = ID

        int konfirmasi = JOptionPane.showConfirmDialog(this, "Yakin hapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (konfirmasi == JOptionPane.YES_OPTION) {
            try (Connection c = Koneksi.getConnection();
                 PreparedStatement p = c.prepareStatement("DELETE FROM buku WHERE id_buku=?")) {

                p.setInt(1, Integer.parseInt(id));
                p.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
                loadDataBook();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Gagal hapus: " + e.getMessage());
            }
        }
    


    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:String judul = JOptionPane.showInputDialog("Judul Buku:");
        String judul = JOptionPane.showInputDialog("Judul Buku:");
        String penulis = JOptionPane.showInputDialog("Penulis:");
        String tahun = JOptionPane.showInputDialog("Tahun:");
        String stok = JOptionPane.showInputDialog("Stok:");

        try {
            Connection c = Koneksi.getConnection();

            // ambil id terakhir
            String sqlGetId = "SELECT IFNULL(MAX(id_buku), 0) + 1 AS nextId FROM buku";
            PreparedStatement psId = c.prepareStatement(sqlGetId);
            ResultSet rs = psId.executeQuery();
            int nextId = 1;
            if (rs.next()) {
                nextId = rs.getInt("nextId");
            }

            // insert data
            String sql = "INSERT INTO buku (id_buku, judul, penulis, tahun, stok) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setInt(1, nextId);
            p.setString(2, judul);
            p.setString(3, penulis);
            p.setInt(4, Integer.parseInt(tahun));
            p.setInt(5, Integer.parseInt(stok));
            p.executeUpdate();

            JOptionPane.showMessageDialog(this, "Buku berhasil ditambahkan");
            loadDataBook(); // refresh tabel
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal tambah buku: " + e.getMessage());
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit1ActionPerformed
        // TODO add your handling code here:                                     
        int viewRow = PanelBook.getSelectedRow();
        if (viewRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data dulu!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Convert view row ke model row (aman kalau ada sorter)
        int modelRow = PanelBook.convertRowIndexToModel(viewRow);
        javax.swing.table.TableModel model = PanelBook.getModel();

        // Ambil dari model dengan index kolom yang sesuai:
        // 0 = No, 1 = ID, 2 = Judul, 3 = Penulis, 4 = Tahun, 5 = Stok
        String id = model.getValueAt(modelRow, 1).toString();
        String judul = model.getValueAt(modelRow, 2).toString();
        String penulis = model.getValueAt(modelRow, 3).toString();
        String tahun = model.getValueAt(modelRow, 4).toString();
        String stok = model.getValueAt(modelRow, 5).toString();

        // Tampilkan dialog edit (default value dari data saat ini)
        String newJudul   = JOptionPane.showInputDialog(this, "Edit Judul:", judul);
        String newPenulis = JOptionPane.showInputDialog(this, "Edit Penulis:", penulis);
        String newTahun   = JOptionPane.showInputDialog(this, "Edit Tahun:", tahun);
        String newStok    = JOptionPane.showInputDialog(this, "Edit Stok:", stok);

        // kalau cancel di salah satu dialog, batalkan update
        if (newJudul == null || newPenulis == null || newTahun == null || newStok == null) {
            return;
        }

        try (Connection c = Koneksi.getConnection();
             PreparedStatement p = c.prepareStatement(
                 "UPDATE buku SET judul=?, penulis=?, tahun=?, stok=? WHERE id_buku=?")) {

            p.setString(1, newJudul);
            p.setString(2, newPenulis);
            p.setInt(3, Integer.parseInt(newTahun));
            p.setInt(4, Integer.parseInt(newStok));
            p.setInt(5, Integer.parseInt(id));

            p.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate!");
            loadDataBook(); // refresh tabel
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal update: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEdit1ActionPerformed

    
    private void loadDataBook() {
    // model dengan nama kolom; kita override isCellEditable agar kolom No & ID tidak bisa diedit
    DefaultTableModel model = new DefaultTableModel(
        new Object[] {"No", "ID", "Judul", "Penulis", "Tahun", "Stok"}, 0
    ) {
        @Override
        public boolean isCellEditable(int row, int column) {
            // kolom 0 (No) dan 1 (ID) tidak boleh diedit oleh user
            return column != 0 && column != 1;
        }
    };

    try (Connection c = Koneksi.getConnection();
         Statement s = c.createStatement();
         ResultSet r = s.executeQuery("SELECT * FROM buku")) {

        int no = 1;
        while (r.next()) {
            model.addRow(new Object[] {
                no++,                       // No (urutan tampilan)
                r.getInt("id_buku"),        // ID (dipakai internal, nanti disembunyikan)
                r.getString("judul"),
                r.getString("penulis"),
                r.getInt("tahun"),
                r.getInt("stok")
            });
        }

        PanelBook.setModel(model);

        // Sembunyikan kolom ID secara visual (tetap ada di model)
        // Pastikan ada setAutoCreateRowSorter(false) dulu kalau mau konsisten
        if (PanelBook.getColumnModel().getColumnCount() > 1) {
            PanelBook.getColumnModel().getColumn(1).setMinWidth(0);
            PanelBook.getColumnModel().getColumn(1).setMaxWidth(0);
            PanelBook.getColumnModel().getColumn(1).setPreferredWidth(0);
        }

        // (opsional) set lebar kolom No kecil
        PanelBook.getColumnModel().getColumn(0).setPreferredWidth(40);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Gagal load data: " + e.getMessage());
    }
}




    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        java.awt.CardLayout cl = (java.awt.CardLayout) MainPanel.getLayout();
        cl.show(MainPanel, "card2"); // "card2" itu panel Book di NetBeans

        loadDataBook(); // refresh tabel
    }//GEN-LAST:event_btnBookActionPerformed

    


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
            java.util.logging.Logger.getLogger(DasboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DasboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DasboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DasboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DasboardAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JPanel Book;
    private javax.swing.JPanel DaftarAnggota;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTable PanelBook;
    private javax.swing.JPanel Peminjaman;
    private javax.swing.JPanel Pengembalian;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnDaftarAnggota;
    private javax.swing.JButton btnEdit1;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPemgembalian;
    private javax.swing.JButton btnPeminjaman;
    private javax.swing.JButton btnTambah;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
