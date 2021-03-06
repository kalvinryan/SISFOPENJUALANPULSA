/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sisfo_Penjualan_pulsa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ASUS
 */
public class form_riwayat extends javax.swing.JFrame {

    DefaultTableModel dtm;
    public form_riwayat() {
        initComponents();
        load_data();
    }
     public void load_data(){
        dtm = new DefaultTableModel ( );
        tbtabel.setModel(dtm);
        dtm.addColumn("ID Transaksi");
        dtm.addColumn("Tanggal");
        dtm.addColumn("NO. Handphone");
        dtm.addColumn("Harga");
        dtm.addColumn("Bayar");
        dtm.addColumn("Kembali");
        dtm.addColumn("Nama Operator");
        dtm.addColumn("Nama Kartu");
        dtm.addColumn("Jenis Pulsa");
        tbtabel.setModel(dtm);
     try{
            Connection c = koneksi.getkoneksi();
            Statement stm = c.createStatement();
            String sqldata1 = "SELECT * FROM tb_riwayat";
            ResultSet res = stm.executeQuery(sqldata1);

           while(res.next ()){
                Object[ ] obj = new Object[9];
                obj[0] = res.getString("id_transaksi");
                obj[1] = res.getString("tanggal");
                obj[2] = res.getString("hp");
                obj[3] = res.getString("harga");
                obj[4] = res.getString("bayar");
                obj[5] = res.getString("kembali");
                obj[6] = res.getString("namaoperator");
                obj[7] = res.getString("namakartu");
                obj[8] = res.getString("jenispulsa");
                dtm.addRow(obj);
            }
      }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
      }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbtabel = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        btncetak1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbtabel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbtabel);

        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        btncetak1.setText("Cetak");
        btncetak1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetak1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                        .addComponent(btncetak1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnclose)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncari)
                    .addComponent(btnclose)
                    .addComponent(btncetak1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );

        setSize(new java.awt.Dimension(829, 256));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        dtm = new DefaultTableModel ();
        dtm.addColumn("ID Transaksi");
        dtm.addColumn("Tanggal");
        dtm.addColumn("NO. Handphone");
        dtm.addColumn("Harga");
        dtm.addColumn("Bayar");
        dtm.addColumn("Kembali");
        dtm.addColumn("Nama Operator");
        dtm.addColumn("Nama Kartu");
        dtm.addColumn("Jenis Pulsa");
            
        tbtabel.setModel(dtm);
    
        try{
            Connection k = koneksi.getkoneksi();
            Statement st = k.createStatement();
            String sql   = "SELECT * from tb_riwayat "
                    + "WHERE hp"+" LIKE '%"+txtcari.getText()+"%'"
                    + " OR jenispulsa LIKE '%"+txtcari.getText()+"%'";
            ResultSet res  = st.executeQuery(sql);
            
            while(res.next ()){
                Object[ ] obj = new Object[9];
                obj[0] = res.getString("id_transaksi");
                obj[1] = res.getString("tanggal");
                obj[2] = res.getString("hp");
                obj[3] = res.getString("harga");
                obj[4] = res.getString("bayar");
                obj[5] = res.getString("kembali");
                obj[6] = res.getString("namaoperator");
                obj[7] = res.getString("namakartu");
                obj[8] = res.getString("jenispulsa");
                dtm.addRow(obj);
            }
        }
        catch(SQLException e){
            System.out.println("Maaf Data Tidak Ditampilkan" + e.toString() );
        }
    }//GEN-LAST:event_btncariActionPerformed

    private void btncetak1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetak1ActionPerformed
        // TODO add your handling code here:
        try {
//            String path ="D:\\Project_Program\\New Folder\\Sisfo Penjualan Pulsa\\src\\Sisfo_Penjualan_pulsa\\riwayat.jrxml";
            JasperPrint jp =JasperFillManager.fillReport(getClass().getResourceAsStream("riwayat.jasper"), null, koneksi.getkoneksi());
            JasperViewer.viewReport(jp, true);
        } catch (Exception e) {
        }  
    }//GEN-LAST:event_btncetak1ActionPerformed

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
            java.util.logging.Logger.getLogger(form_riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_riwayat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncari;
    private javax.swing.JButton btncetak1;
    private javax.swing.JButton btnclose;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbtabel;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
}
