/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sisfo_Penjualan_pulsa;

import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class form_DataPulsaTelkomsel extends javax.swing.JFrame {

    /**
     * Creates new form form_DataPulsaTelkomsel
     */
    DefaultTableModel dtm;
    public form_DataPulsaTelkomsel() {
        initComponents();
//        cmbpulsa.addItem("Pilihan");
        cmbpulsa.addItem("Pilihan");
        cmbpulsa.addItem("Reguler");
        cmbpulsa.addItem("Data");
        
    }
    
    public void formUIdisable(){
        txtnamaoperator.disable();
        txtbeli.disable();
        txtjual.disable();
        txtpulsa.disable();
        txtnamakartu.disable();
        txtoperator.disable();
        btnsimpan.disable();
        btnedit.disable();
        btnhapus.disable();
        btnrefresh.disable();
        tbtabel.disable();
    }
    public void formUIenable(){
        txtnamaoperator.enable();
        txtbeli.enable();
        txtjual.enable();
        txtpulsa.enable();
        txtnamakartu.enable();
        txtoperator.enable();
        btnsimpan.enable();
        btnedit.disable();
        btnhapus.disable();
        btnrefresh.enable();
        tbtabel.enable();
        
    }
    public void load_datatrireguler(){
         dtm = new DefaultTableModel ( );
        tbtabel.setModel(dtm);
        dtm.addColumn("ID Pulsa");
        dtm.addColumn("ID Operator");
        dtm.addColumn("Nama Operator");
        dtm.addColumn("Nama Kartu");
        dtm.addColumn("Harga Beli");
        dtm.addColumn("Harga Jual");
        dtm.addColumn("STOCK");
        dtm.addColumn("Jenis Pulsa");
        tbtabel.setModel(dtm);
     try{
            Connection c = koneksi.getkoneksi();
            Statement stm = c.createStatement();
            String sqldata1 = "SELECT * FROM tb_pulsatelkomreguler";
            ResultSet res = stm.executeQuery(sqldata1);

           while(res.next ()){
                Object[ ] obj = new Object[8];
                obj[0] = res.getString("idpulsa");
                obj[1] = res.getString("idoperator");
                obj[2] = res.getString("namaoperator");
                obj[3] = res.getString("namakartu");
                obj[4] = res.getString("beli");
                obj[5] = res.getString("jual");
                obj[6] = res.getString("stock");
                obj[7] = res.getString("jenispulsa");
                dtm.addRow(obj);
            }
      }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
      }
    }

    public void load_datatridata(){
         dtm = new DefaultTableModel ( );
        tbtabel.setModel(dtm);
        dtm.addColumn("ID Pulsa");
        dtm.addColumn("ID Operator");
        dtm.addColumn("Nama Operator");
        dtm.addColumn("Nama Kartu");
        dtm.addColumn("Harga Beli");
        dtm.addColumn("STOCK");
        dtm.addColumn("Jenis Pulsa");
        tbtabel.setModel(dtm);
     try{
            Connection c = koneksi.getkoneksi();
            Statement stm = c.createStatement();
            String sqldata1 = "SELECT * FROM tb_pulsatelkomdata";
            ResultSet res = stm.executeQuery(sqldata1);

           while(res.next ()){
                Object[ ] obj = new Object[8];
                obj[0] = res.getString("idpulsa");
                obj[1] = res.getString("idoperator");
                obj[2] = res.getString("namaoperator");
                obj[3] = res.getString("namakartu");
                obj[4] = res.getString("beli");
                obj[5] = res.getString("jual");
                obj[6] = res.getString("stock");
                obj[7] = res.getString("jenispulsa");
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
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtpulsa = new javax.swing.JTextField();
        txtoperator = new javax.swing.JTextField();
        txtnamaoperator = new javax.swing.JTextField();
        txtnamakartu = new javax.swing.JTextField();
        txtbeli = new javax.swing.JTextField();
        txtjual = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbtabel = new javax.swing.JTable();
        btnsimpan = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        cmbpulsa = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Data Pulsa Telkomsel");

        jLabel2.setText("ID PULSA");

        jLabel3.setText("ID OPERATOR");

        jLabel4.setText("NAMA OPERATOR");

        jLabel5.setText("NAMA KARTU");

        jLabel6.setText("HARGA BELI");

        jLabel7.setText("HARGA JUAL");

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
        tbtabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbtabel);

        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnrefresh.setText("REFRESH");

        btnclose.setText("CLOSE");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        cmbpulsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbpulsaActionPerformed(evt);
            }
        });

        jLabel8.setText("JENIS PULSA");

        jLabel9.setText("STOCK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtpulsa, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtnamaoperator, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtoperator, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbpulsa, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtnamakartu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtjual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                                    .addComponent(txtbeli, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnedit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnhapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnrefresh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnclose)))
                        .addGap(15, 15, 15)))
                .addGap(9, 9, 9))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(324, 324, 324))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpulsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbpulsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtoperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnamaoperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnamakartu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtjual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnedit)
                    .addComponent(btnhapus)
                    .addComponent(btnrefresh)
                    .addComponent(btnclose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(771, 503));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbpulsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbpulsaActionPerformed
         if (cmbpulsa.getSelectedItem().equals("Reguler")){
            load_datatrireguler();
        }else if(cmbpulsa.getSelectedItem().equals("Data")){
            load_datatridata();
        }else{
            dtm = new DefaultTableModel ( );
            tbtabel.setModel(dtm);
            dtm.addColumn("ID Pulsa");
            dtm.addColumn("ID Operator");
            dtm.addColumn("Nama Operator");
            dtm.addColumn("Nama Kartu");
            dtm.addColumn("Harga Beli");
            dtm.addColumn("Harga Jual");
            dtm.addColumn("STOCK");
            dtm.addColumn("Jenis Pulsa");
            tbtabel.setModel(dtm);
        }
    }//GEN-LAST:event_cmbpulsaActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        if (cmbpulsa.getSelectedItem().equals("Reguler")){
            try{
                   Connection c = koneksi.getkoneksi();
                    String sqldata = "INSERT INTO `tb_pulsatelkomreguler` (`idpulsa`,`idoperator`, `namaoperator`, `namakartu`, `beli`, `jual`,`stock`, `jenispulsa`) VALUES "
                            + "('"+txtpulsa.getText()+"','"+txtoperator.getText()+"','"+txtnamaoperator.getText()+"','"+txtnamakartu.getText()+"',"
                            + "'"+txtbeli.getText()+"','"+txtjual.getText()+"','"+txtstock.getText()+"','"+cmbpulsa.getSelectedItem()+"');";
                    PreparedStatement pst= c.prepareStatement(sqldata);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
//                    membersihkan();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
       load_datatrireguler();
        }else if(cmbpulsa.getSelectedItem().equals("Data")){
            try{
                   Connection c = koneksi.getkoneksi();
                    String sqldata = "INSERT INTO tb_pulsatelkomdata(idpulsa, idoperator,namaoperator, namakartu, beli,jual,stock,jenispulsa) VALUES "
                            + "('"+txtpulsa.getText()+"','"+txtoperator.getText()+"','"+txtnamaoperator.getText()+"','"+txtnamakartu.getText()+"',"
                            + "'"+txtbeli.getText()+"','"+txtjual.getText()+"','"+txtstock.getText()+"','"+cmbpulsa.getSelectedItem()+"')";
                    PreparedStatement pst= c.prepareStatement(sqldata);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
//                    membersihkan();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
       load_datatridata();
        }else{
            JOptionPane.showMessageDialog(null, "Data Tidak ada");
        }
        
        
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        if (cmbpulsa.getSelectedItem().equals("Reguler")){
                try{
                 Connection c = koneksi.getkoneksi();
                 String sql2 = "DELETE FROM `tb_pulsatelkomreguler` WHERE idpulsa = '"+txtpulsa.getText()+"';";
                 PreparedStatement ps= c.prepareStatement(sql2);
                 ps.execute();
                 JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
     //            membersihkan();
             }
             catch (SQLException e) {
                 JOptionPane.showMessageDialog(this, e.getMessage());
             }
             load_datatrireguler();
        }else if(cmbpulsa.getSelectedItem().equals("Data")){
            try{
                 Connection c = koneksi.getkoneksi();
                 String sql2 = "DELETE FROM `tb_pulsatelkomdata` WHERE idpulsa = '"+txtpulsa.getText()+"';";
                 PreparedStatement ps= c.prepareStatement(sql2);
                 ps.execute();
                 JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
     //            membersihkan();
             }
             catch (SQLException e) {
                 JOptionPane.showMessageDialog(this, e.getMessage());
             }
             load_datatridata();
        }else{
            JOptionPane.showMessageDialog(null, "Data Tidak ada");
        }
        
    }//GEN-LAST:event_btnhapusActionPerformed

    private void tbtabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtabelMouseClicked
        if (cmbpulsa.getSelectedItem().equals("Reguler")){
            int baris = tbtabel.getSelectedRow();
            txtpulsa.setText(dtm.getValueAt(baris, 0).toString());
            txtoperator.setText(dtm.getValueAt(baris, 1).toString());
            txtnamaoperator.setText(dtm.getValueAt(baris, 2).toString());
            txtnamakartu.setText(dtm.getValueAt(baris, 3).toString());
            txtbeli.setText(dtm.getValueAt(baris, 4).toString());
            txtjual.setText(dtm.getValueAt(baris, 5).toString());
        }else if(cmbpulsa.getSelectedItem().equals("Data")){
            int baris = tbtabel.getSelectedRow();
            txtpulsa.setText(dtm.getValueAt(baris, 0).toString());
            txtoperator.setText(dtm.getValueAt(baris, 1).toString());
            txtnamaoperator.setText(dtm.getValueAt(baris, 2).toString());
            txtnamakartu.setText(dtm.getValueAt(baris, 3).toString());
            txtbeli.setText(dtm.getValueAt(baris, 4).toString());
            txtjual.setText(dtm.getValueAt(baris, 5).toString());
        }else{
            JOptionPane.showMessageDialog(null, "Data Tidak ada");
        }
       
    }//GEN-LAST:event_tbtabelMouseClicked

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        if (cmbpulsa.getSelectedItem().equals("Reguler")){
            try {
            Connection c=koneksi.getkoneksi();
            String sqldata = "UPDATE tb_pulsatelkomreguler set idoperator=?, namaoperator=?, namakartu=?, beli=?, jual=?,stock=? jenispulsa=? where idpulsa=?";
            PreparedStatement pst=c.prepareStatement(sqldata);
            pst.setString(1, txtoperator.getText());
            pst.setString(2, txtnamaoperator.getText());
            pst.setString(3, txtnamakartu.getText());
            pst.setString(4, txtbeli.getText());
            pst.setString(5, txtjual.getText());
            pst.setString(6, txtstock.getText());
            pst.setString(7, cmbpulsa.getSelectedItem().toString());
            pst.setString(8, txtpulsa.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            load_datatrireguler();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        }else if(cmbpulsa.getSelectedItem().equals("Data")){
           try {
            Connection c=koneksi.getkoneksi();
            String sqldata = "UPDATE tb_pulsatelkomdata set idoperator=?, namaoperator=?, namakartu=?, beli=?, jual=?,stock=? where idpulsa=?";
            PreparedStatement pst=c.prepareStatement(sqldata);
            pst.setString(1, txtoperator.getText());
            pst.setString(2, txtnamaoperator.getText());
            pst.setString(3, txtnamakartu.getText());
            pst.setString(4, txtbeli.getText());
            pst.setString(5, txtjual.getText());
            pst.setString(6, txtstock.getText());
            pst.setString(7, cmbpulsa.getSelectedItem().toString());
            pst.setString(8, txtpulsa.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            load_datatrireguler();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        }else{
            JOptionPane.showMessageDialog(null, "Data Tidak ada");
        }
        
    }//GEN-LAST:event_btneditActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

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
            java.util.logging.Logger.getLogger(form_DataPulsaTelkomsel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_DataPulsaTelkomsel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_DataPulsaTelkomsel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_DataPulsaTelkomsel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_DataPulsaTelkomsel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbpulsa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbtabel;
    private javax.swing.JTextField txtbeli;
    private javax.swing.JTextField txtjual;
    private javax.swing.JTextField txtnamakartu;
    private javax.swing.JTextField txtnamaoperator;
    private javax.swing.JTextField txtoperator;
    private javax.swing.JTextField txtpulsa;
    private javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables
}
