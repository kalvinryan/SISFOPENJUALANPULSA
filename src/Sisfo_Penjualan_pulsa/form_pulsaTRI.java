/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sisfo_Penjualan_pulsa;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class form_pulsaTRI extends javax.swing.JFrame {

    /**
     * Creates new form form_pulsaTelkomsel
     */
    public form_pulsaTRI() {
        initComponents();
//        data();
        
        cmbpulsa.addItem("Reguler");
        cmbpulsa.addItem("Data");
        txtstock.setVisible(false);
        txtidpulsa.setVisible(false);
        txtjumlah.setVisible(false);
        
    }
     
    public void refresh(){
        cmbharga.addItem(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txttransaksi = new javax.swing.JTextField();
        txthp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dttanggal = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        cmbharga = new javax.swing.JComboBox<>();
        txtbayar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtkembalian = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtoperator = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtkartu = new javax.swing.JTextField();
        btntransfer = new javax.swing.JButton();
        btnbersihkan = new javax.swing.JButton();
        cmbpulsa = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        txtharga = new javax.swing.JTextField();
        txtstock = new javax.swing.JTextField();
        txtidpulsa = new javax.swing.JTextField();
        txtjumlah = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TRANSAKSI PULSA TRI");

        jLabel2.setText("ID TRANSAKSI");

        jLabel3.setText("TANGGAL");

        jLabel4.setText("NOMOR HP");

        jLabel5.setText("HARGA");

        cmbharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbhargaActionPerformed(evt);
            }
        });

        txtbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbayarActionPerformed(evt);
            }
        });

        jLabel6.setText("BAYAR");

        jLabel7.setText("KEMBALIAN");

        jLabel8.setText("NAMA OPERATOR");

        jLabel9.setText("NAMA KARTU");

        btntransfer.setText("TRANSFER SEKARANG");
        btntransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransferActionPerformed(evt);
            }
        });

        btnbersihkan.setText("BERSIHKAN");
        btnbersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbersihkanActionPerformed(evt);
            }
        });

        cmbpulsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbpulsaActionPerformed(evt);
            }
        });

        jLabel10.setText("JENIS PULSA");

        btnclose.setText("CLOSE");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtkembalian)
                    .addComponent(txtbayar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txttransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtidpulsa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dttanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txthp)
                    .addComponent(cmbharga, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(141, 141, 141)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbpulsa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtoperator, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtkartu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btntransfer)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnbersihkan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnclose))))
                        .addGap(0, 42, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmbpulsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtidpulsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtkartu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txthp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtoperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btntransfer)
                    .addComponent(btnbersihkan)
                    .addComponent(btnclose))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(763, 325));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void btntransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransferActionPerformed
         int jumlah,stock;
           stock=Integer.parseInt(txtstock.getText());
           jumlah=stock-1;
           txtjumlah.setText(Integer.toString(jumlah));   
          try{
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String hari = sdf.format(dttanggal.getDate().getTime());
                    Connection c = koneksi.getkoneksi();
                    String sqldata = "INSERT INTO `tb_riwayat` (`id_transaksi`,`tanggal`, `hp`, `harga`, `bayar`, `kembali`, `namaoperator`, `namakartu`, `jenispulsa`) VALUES "
                            + "('"+txttransaksi.getText()+"','"+hari+"','"+txthp.getText()+"','"+txtharga.getText()+"','"+txtbayar.getText()+"',"
                            + "'"+txtkembalian.getText()+"','"+txtoperator.getText()+"','"+txtkartu.getText()+"','"+cmbpulsa.getSelectedItem()+"');";
                    PreparedStatement pst= c.prepareStatement(sqldata);
                    pst.execute();
                    
                    if(cmbpulsa.getSelectedItem().equals("Reguler")){
                        c =koneksi.getkoneksi();
                        String sqldata2 = "UPDATE tb_pulsatrireguler set stock=? where idpulsa=?";
                        pst=c.prepareStatement(sqldata2);
                        pst.setString(1, txtjumlah.getText());
                        pst.setString(2, txtidpulsa.getText());                  
                        pst.executeUpdate();  
                    }else{
                        c =koneksi.getkoneksi();
                        String sqldata2 = "UPDATE tb_pulsatridata set stock=? where idpulsa=?";
                        pst=c.prepareStatement(sqldata2);
                        pst.setString(1, txtjumlah.getText());
                        pst.setString(2, txtidpulsa.getText());                  
                        pst.executeUpdate();  
                    }
                    JOptionPane.showMessageDialog(null, " Pulsa Berhasil Terkirim");
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
         
           
           
       
    }//GEN-LAST:event_btntransferActionPerformed

    private void cmbpulsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbpulsaActionPerformed
        if (cmbpulsa.getSelectedItem().equals("Reguler")) {
            cmbharga.removeAllItems();
            String kd="";
            try{
                Connection c =koneksi.getkoneksi();
                Statement stm = c.createStatement();
                String sqldata="select * from tb_pulsatriguler";
                ResultSet res = stm.executeQuery(sqldata);
                while(res.next()){
                    cmbharga.addItem(res.getString("beli"));
                    txtoperator.setText(res.getString("namaoperator"));
                    txtkartu.setText(res.getString("namakartu"));                    
                }
            }catch(Exception e){

            }
        }else {
            cmbharga.removeAllItems();
            String kd="";
            try{
                Connection c =koneksi.getkoneksi();
                Statement stm = c.createStatement();
                String sqldata="select * from tb_pulsatridata";
                ResultSet res = stm.executeQuery(sqldata);
                while(res.next()){
                    cmbharga.addItem(res.getString("beli"));
                    txtoperator.setText(res.getString("namaoperator"));
                    txtkartu.setText(res.getString("namakartu"));
                }
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_cmbpulsaActionPerformed

    private void cmbhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbhargaActionPerformed
        if(cmbpulsa.getSelectedItem().equals("Reguler")){
            String kd="";
            int stock,jumlah;
               try{
                   Connection c =koneksi.getkoneksi();
                   Statement stm = c.createStatement();
                   String sqldata="select * from tb_pulsatrireguler where beli like '%"+cmbharga.getSelectedItem()+"%'";
                   ResultSet res = stm.executeQuery(sqldata);
                   while(res.next()){
                       txtidpulsa.setText(res.getString("idpulsa"));
                       txtharga.setText(res.getString("jual"));
                       stock =res.getInt("stock");                       
                       if(stock<1){
                           JOptionPane.showMessageDialog(null, "Pulsa "+res.getString("beli")+" "+res.getString("namakartu"));
                       }else{
                           txtstock.setText(Integer.toString(stock));
                       }
                   }
               }catch(Exception e){

               }
        }else{
            String kd="";
            int stock,jumlah;
               try{
                   Connection c =koneksi.getkoneksi();
                   Statement stm = c.createStatement();
                   String sqldata="select * from tb_pulsatridata where beli like '%"+cmbharga.getSelectedItem()+"%'";
                   ResultSet res = stm.executeQuery(sqldata);
                   while(res.next()){
                       txtidpulsa.setText(res.getString("idpulsa"));
                       txtharga.setText(res.getString("jual"));
                       stock =res.getInt("stock");                       
                       if(stock<1){
                           JOptionPane.showMessageDialog(null, "Pulsa "+res.getString("beli")+" "+res.getString("namakartu"));
                       }else{
                           txtstock.setText(Integer.toString(stock));
                       }
                   }
               }catch(Exception e){

               }
        }
       
    }//GEN-LAST:event_cmbhargaActionPerformed

    private void txtbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbayarActionPerformed
        int gettxtharga =Integer.parseInt(this.txtharga.getText());
        int gettxtbayar =Integer.parseInt(this.txtbayar.getText());
        
        int hasil=gettxtbayar - gettxtharga;
        txtkembalian.setText(Integer.toString(hasil));
    }//GEN-LAST:event_txtbayarActionPerformed

    private void btnbersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbersihkanActionPerformed
       txtbayar.setText("");
       txttransaksi.setText("");
       txthp.setText("");
       txtkembalian.setText("");
    }//GEN-LAST:event_btnbersihkanActionPerformed

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
            java.util.logging.Logger.getLogger(form_pulsaTRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_pulsaTRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_pulsaTRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_pulsaTRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_pulsaTRI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbersihkan;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btntransfer;
    private javax.swing.JComboBox<String> cmbharga;
    private javax.swing.JComboBox<String> cmbpulsa;
    private com.toedter.calendar.JDateChooser dttanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txthp;
    private javax.swing.JTextField txtidpulsa;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtkartu;
    private javax.swing.JTextField txtkembalian;
    private javax.swing.JTextField txtoperator;
    private javax.swing.JTextField txtstock;
    private javax.swing.JTextField txttransaksi;
    // End of variables declaration//GEN-END:variables
}
