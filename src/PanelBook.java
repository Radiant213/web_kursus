import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class PanelBook extends JPanel {
    private JTable tabelBuku;
    private JScrollPane scrollPane;

    public PanelBook() {
        setLayout(new java.awt.BorderLayout());

        tabelBuku = new JTable();
        scrollPane = new JScrollPane(tabelBuku);
        add(scrollPane, java.awt.BorderLayout.CENTER);

        loadData();
    }

    public void loadData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Judul");
        model.addColumn("Penulis");
        model.addColumn("Tahun");
        model.addColumn("Stok");

        try {
            Connection c = Koneksi.getConnection();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM buku");

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id_buku"),
                    rs.getString("judul"),
                    rs.getString("penulis"),
                    rs.getInt("tahun"),
                    rs.getInt("stok")
                });
            }
            tabelBuku.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal load data: " + e.getMessage());
        }
    }

    public JTable getTable() {
        return tabelBuku;
    }
}
