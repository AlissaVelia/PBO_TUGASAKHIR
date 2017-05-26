
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alif Mauludi
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        selectData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        cari = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nopol = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        harga = new javax.swing.JTextField();
        struk = new javax.swing.JTextField();
        kembali = new com.toedter.calendar.JDateChooser();
        pinjam = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        print = new javax.swing.JButton();
        save = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        refresh = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tanggal Kembali");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 51, 0)));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("SF Espresso Shack", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("RENTAL ZAINAL MOTOR");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 0, 470, 50);

        search.setText("Cari");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(500, 10, 60, 30);
        jPanel1.add(cari);
        cari.setBounds(570, 10, 180, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 770, 70);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Harga");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 440, 190, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Peminjam");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 11, 190, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Alamat Peminjam");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 70, 190, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No. Struk");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 200, 190, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No. Polisi");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 260, 190, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tanggal Pinjam");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 320, 190, 20);
        jPanel2.add(nopol);
        nopol.setBounds(10, 280, 190, 30);

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 190, 100);
        jPanel2.add(harga);
        harga.setBounds(10, 460, 190, 30);
        jPanel2.add(struk);
        struk.setBounds(10, 220, 190, 30);
        jPanel2.add(kembali);
        kembali.setBounds(10, 400, 190, 30);
        jPanel2.add(pinjam);
        pinjam.setBounds(10, 340, 190, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(10, 40, 190, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 70, 210, 520);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(null);

        jScrollPane2.setBackground(new java.awt.Color(255, 0, 0));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Alamat", "Struk", "Nopol", "Pinjam", "Kembali", "Harga"
            }
        ));
        jScrollPane2.setViewportView(tabel);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 51, 530, 450);

        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel3.add(print);
        print.setBounds(450, 10, 80, 30);

        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel3.add(save);
        save.setBounds(10, 10, 80, 30);

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel3.add(clear);
        clear.setBounds(120, 10, 80, 30);

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete);
        delete.setBounds(340, 10, 80, 30);

        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel3.add(refresh);
        refresh.setBounds(220, 10, 80, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(210, 70, 560, 520);

        setBounds(0, 0, 780, 622);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tglp = dateFormat.format(pinjam.getDate());
        String tglk = dateFormat.format(kembali.getDate());
        if(jTextField1.getText().equals("") || alamat.getText().equals("") || struk.getText().equals("") ||
                nopol.getText().equals("") || harga.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Harap lengkapi data","Error",
            JOptionPane.WARNING_MESSAGE);
        } else {
                String SQL = "INSERT INTO `tb_rental`(Nama, Alamat, Struk, Nopol, Pinjam, Kembali, Harga)"
                        + "VALUES('"+jTextField1.getText()+"','"+alamat.getText()+"','"+struk.getText()+"','"+nopol.getText()+"','"+tglp+"','"+tglk+"','"+harga.getText()+"')";
                int status = KoneksiDB.execute(SQL);
                if(status==1){
                    JOptionPane.showMessageDialog(this,"Data Berhasil Ditambahkan", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
                    selectData();
                } else {
                    JOptionPane.showMessageDialog(this,"Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
                }
            }        
    }//GEN-LAST:event_saveActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        jTextField1.setText("");
        alamat.setText("");
        struk.setText("");
        nopol.setText("");
        pinjam.setDate(null);
        kembali.setDate(null);
        harga.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         int baris = tabel.getSelectedRow();
        if(baris != -1){
            String Nama = tabel.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM tb_rental WHERE Nama='"+Nama+"'";
            int status = KoneksiDB.execute(SQL);
            if(status==1){
                JOptionPane.showMessageDialog(this,"Data berhasil dihapus","Sukses",JOptionPane.INFORMATION_MESSAGE);
            } else{
                JOptionPane.showMessageDialog(this, "Data gagal dihapus","Gagal",JOptionPane.WARNING_MESSAGE);
            }
        } else{
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu","Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        selectData();
    }//GEN-LAST:event_refreshActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
       MessageFormat header = new MessageFormat("Biodata Siswa SMK Telko Malang");
        MessageFormat footer = new MessageFormat("Page (0,number,integer)   ");
        
        try{
            tabel.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        } catch(java.awt.print.PrinterException e) {
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_printActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
            search();
        } catch (ParseException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

        public void search() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormat.format(cari.getDate());
        String kolom[] = {"Id","Nama","Alamat","No Struk","No Pol","Tgl Pinjam","Tgl Kembali","Harga"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        //SELECT * FROM `rental` WHERE tgl_pinjam <= 101217 AND tgl_kembali >= 101217
        String SQL = "SELECT * FROM tb_rental WHERE Pinjam <= '"+date+"' AND Kembali >= '"+date+"' ";
        System.out.println(SQL);
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try{
            while(rs.next()) {
                        String Nama = rs.getString(1);
                        String Alamat = rs.getString(2);
                        String Struk = rs.getString(3);
                        String Nopol = rs.getString(4);
                        String Pinjam = rs.getString(5);
                        String Kembali = rs.getString(6);
                        String Harga = rs.getString(7);
                        String data[] = {Nama,Alamat,Struk,Nopol,Pinjam,Kembali,Harga};
                        dtm.addRow(data);
            }
        } catch (SQLException ex){
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE,null,ex);
        }
        tabel.setModel(dtm);
    }

        private void selectData() {
        String kolom[]={"Nama","Alamat","Struk","Nopol","Pinjam","Kembali","Harga"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT `Nama`, `Alamat`, `Struk`, `Nopol`, `Pinjam`, `Kembali`, `Harga` FROM `tb_rental`";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
                try{
                    while(rs.next()){
                        String Nama = rs.getString(1);
                        String Alamat = rs.getString(2);
                        String Struk = rs.getString(3);
                        String Nopol = rs.getString(4);
                        String Pinjam = rs.getString(5);
                        String Kembali = rs.getString(6);
                        String Harga = rs.getString(7);
                        String data[] = {Nama,Alamat,Struk,Nopol,Pinjam,Kembali,Harga};
                        dtm.addRow(data);
                    }
                }catch(SQLException ex){
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                        }
                tabel.setModel(dtm);
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private com.toedter.calendar.JDateChooser cari;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private com.toedter.calendar.JDateChooser kembali;
    private javax.swing.JTextField nopol;
    private com.toedter.calendar.JDateChooser pinjam;
    private javax.swing.JButton print;
    private javax.swing.JButton refresh;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JTextField struk;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
