/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sisfo_Penjualan_pulsa;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class form_admin extends javax.swing.JFrame {

    /**
     * Creates new form form_admin
     */
    public form_admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        itmtelkom = new javax.swing.JMenuItem();
        itmtri = new javax.swing.JMenuItem();
        itmclose = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        mtelkom = new javax.swing.JMenuItem();
        mtri = new javax.swing.JMenuItem();
        itmaddadmin = new javax.swing.JMenuItem();
        itmadmin = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        jMenu3.setText("Pulsa Data & Reguler");

        itmtelkom.setText("Telkomsel");
        itmtelkom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmtelkomActionPerformed(evt);
            }
        });
        jMenu3.add(itmtelkom);

        itmtri.setText("Tri");
        itmtri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmtriActionPerformed(evt);
            }
        });
        jMenu3.add(itmtri);

        jMenu1.add(jMenu3);

        itmclose.setText("Close");
        itmclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmcloseActionPerformed(evt);
            }
        });
        jMenu1.add(itmclose);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Data Master");

        jMenu5.setText("Tambah ");

        jMenu6.setText("Pulsa Data & Reguler");

        mtelkom.setText("Telkomsel");
        mtelkom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtelkomActionPerformed(evt);
            }
        });
        jMenu6.add(mtelkom);

        mtri.setText("TRI");
        mtri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtriActionPerformed(evt);
            }
        });
        jMenu6.add(mtri);

        jMenu5.add(jMenu6);

        itmaddadmin.setText("Admin atau Members");
        itmaddadmin.setToolTipText("");
        itmaddadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmaddadminActionPerformed(evt);
            }
        });
        jMenu5.add(itmaddadmin);

        jMenu2.add(jMenu5);

        itmadmin.setText("Riwayat");
        itmadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmadminActionPerformed(evt);
            }
        });
        jMenu2.add(itmadmin);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("About");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(721, 494));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmcloseActionPerformed
        this.dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_itmcloseActionPerformed

    private void itmtelkomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmtelkomActionPerformed
        form_pulsaTelkomsel telkom = new form_pulsaTelkomsel();
        telkom.show();
    }//GEN-LAST:event_itmtelkomActionPerformed

    private void itmtriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmtriActionPerformed
       form_pulsaTRI tri = new form_pulsaTRI();
        tri.show();
    }//GEN-LAST:event_itmtriActionPerformed

    private void itmadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmadminActionPerformed
       form_riwayatadmin ra = new form_riwayatadmin();
       ra.show();
    }//GEN-LAST:event_itmadminActionPerformed

    private void itmaddadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmaddadminActionPerformed
        form_adduseradmin add = new form_adduseradmin();
        add.show();
    }//GEN-LAST:event_itmaddadminActionPerformed

    private void mtriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtriActionPerformed
        form_DataPulsaTRI triku = new form_DataPulsaTRI();
        triku.show();
    }//GEN-LAST:event_mtriActionPerformed

    private void mtelkomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtelkomActionPerformed
        form_DataPulsaTelkomsel telkomku = new form_DataPulsaTelkomsel();
        telkomku.show();
    }//GEN-LAST:event_mtelkomActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        JOptionPane.showMessageDialog(null, "CREATED BY 181021 Kalvin Ryan Duma Lumiling\n"+"Form Admin");
    }//GEN-LAST:event_jMenu4ActionPerformed

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
            java.util.logging.Logger.getLogger(form_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmaddadmin;
    private javax.swing.JMenuItem itmadmin;
    private javax.swing.JMenuItem itmclose;
    private javax.swing.JMenuItem itmtelkom;
    private javax.swing.JMenuItem itmtri;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mtelkom;
    private javax.swing.JMenuItem mtri;
    // End of variables declaration//GEN-END:variables
}