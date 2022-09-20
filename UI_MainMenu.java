package test;

import java.sql.Connection;

public class UI_MainMenu extends javax.swing.JFrame {
    public UI_MainMenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namaMain = new javax.swing.JPanel();
        haloLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bm = new javax.swing.JButton();
        btnSedia = new javax.swing.JButton();
        bk = new javax.swing.JButton();
        btnBeli = new javax.swing.JButton();
        btnRetur = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        akun = new javax.swing.JMenuItem();
        br = new javax.swing.JMenuItem();
        sp = new javax.swing.JMenuItem();
        pn = new javax.swing.JMenuItem();
        kt = new javax.swing.JMenuItem();
        bM = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jurnalPersediaan = new javax.swing.JMenuItem();
        jurnalPembeliaan = new javax.swing.JMenuItem();
        laporanPersediaan = new javax.swing.JMenuItem();
        laporanPembelian = new javax.swing.JMenuItem();
        bukuBesar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        namaMain.setBackground(new java.awt.Color(153, 255, 153));
        namaMain.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                namaMainPropertyChange(evt);
            }
        });

        haloLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        haloLabel.setText("HALO");
        haloLabel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                haloLabelPropertyChange(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        bm.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        bm.setText("Barang Masuk");
        bm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmActionPerformed(evt);
            }
        });

        btnSedia.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnSedia.setText("Persediaan");
        btnSedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSediaMouseClicked(evt);
            }
        });

        bk.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        bk.setText("Barang Keluar");
        bk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bkMouseClicked(evt);
            }
        });

        btnBeli.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnBeli.setText("Pembelian");
        btnBeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBeliMouseClicked(evt);
            }
        });

        btnRetur.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnRetur.setText("Retur Persediaan");
        btnRetur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturMouseClicked(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton6.setText("Logout");

        nama.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        nama.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                namaPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout namaMainLayout = new javax.swing.GroupLayout(namaMain);
        namaMain.setLayout(namaMainLayout);
        namaMainLayout.setHorizontalGroup(
            namaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namaMainLayout.createSequentialGroup()
                .addGroup(namaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(namaMainLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(namaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSedia, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(namaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(namaMainLayout.createSequentialGroup()
                                    .addComponent(haloLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nama)
                                    .addGap(68, 68, 68)
                                    .addComponent(jLabel2))
                                .addComponent(bm, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73)
                        .addGroup(namaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bk, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(namaMainLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(btnRetur, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(357, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, namaMainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        namaMainLayout.setVerticalGroup(
            namaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namaMainLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(namaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(haloLabel)
                    .addComponent(jLabel2)
                    .addComponent(nama))
                .addGap(69, 69, 69)
                .addGroup(namaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bm)
                    .addComponent(bk))
                .addGap(29, 29, 29)
                .addGroup(namaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSedia)
                    .addComponent(btnBeli))
                .addGap(34, 34, 34)
                .addComponent(btnRetur)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        jMenu1.setText("Master");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        akun.setText("Akun");
        akun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akunActionPerformed(evt);
            }
        });
        jMenu1.add(akun);

        br.setText("Barang");
        br.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brActionPerformed(evt);
            }
        });
        jMenu1.add(br);

        sp.setText("Supplier");
        sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spActionPerformed(evt);
            }
        });
        jMenu1.add(sp);

        pn.setText("Pengguna");
        pn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnActionPerformed(evt);
            }
        });
        jMenu1.add(pn);

        kt.setText("Kategori");
        kt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ktActionPerformed(evt);
            }
        });
        jMenu1.add(kt);

        jMenuBar1.add(jMenu1);

        bM.setText("Transaksi");

        jMenuItem1.setText("Barang Masuk");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        bM.add(jMenuItem1);

        jMenuItem2.setText("Pembelian");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        bM.add(jMenuItem2);

        jMenuItem3.setText("Barang Keluar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        bM.add(jMenuItem3);

        jMenuItem4.setText("Persediaan");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        bM.add(jMenuItem4);

        jMenuItem5.setText("Retur Persediaan");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        bM.add(jMenuItem5);

        jMenuBar1.add(bM);

        jMenu3.setText("Laporan");

        jurnalPersediaan.setText("Jurnal Persediaan");
        jurnalPersediaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jurnalPersediaanMouseClicked(evt);
            }
        });
        jurnalPersediaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jurnalPersediaanActionPerformed(evt);
            }
        });
        jMenu3.add(jurnalPersediaan);

        jurnalPembeliaan.setText("Jurnal Pembelian");
        jurnalPembeliaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jurnalPembeliaanMouseClicked(evt);
            }
        });
        jurnalPembeliaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jurnalPembeliaanActionPerformed(evt);
            }
        });
        jMenu3.add(jurnalPembeliaan);

        laporanPersediaan.setText("Laporan Persediaan");
        laporanPersediaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laporanPersediaanMouseClicked(evt);
            }
        });
        laporanPersediaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanPersediaanActionPerformed(evt);
            }
        });
        jMenu3.add(laporanPersediaan);

        laporanPembelian.setText("Laporan Pembelian");
        laporanPembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laporanPembelianMouseClicked(evt);
            }
        });
        laporanPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanPembelianActionPerformed(evt);
            }
        });
        jMenu3.add(laporanPembelian);

        bukuBesar.setText("Buku Besar");
        bukuBesar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bukuBesarMouseClicked(evt);
            }
        });
        bukuBesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bukuBesarActionPerformed(evt);
            }
        });
        jMenu3.add(bukuBesar);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Logout");
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
            .addComponent(namaMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(namaMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void akunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akunActionPerformed
        // TODO add your handling code here:
        new UI_DataAccount().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_akunActionPerformed

    private void brActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brActionPerformed
        // TODO add your handling code here:
        new UI_DataBarang().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_brActionPerformed

    private void spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spActionPerformed
        // TODO add your handling code here:
        new UI_Supplier().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_spActionPerformed

    private void pnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnActionPerformed
        // TODO add your handling code here:
        new UI_DataPengguna().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new UI_DataBarangMasuk().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new UI_FormPembelian().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        new UI_DataBarangKeluar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        new UI_DataPersediaan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new UI_DataRetur().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void ktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ktActionPerformed
        new UI_DataKategori().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ktActionPerformed

    private void jurnalPersediaanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jurnalPersediaanMouseClicked
        // TODO add your handling code here:
        new UI_JurnalPersediaan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jurnalPersediaanMouseClicked

    private void jurnalPembeliaanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jurnalPembeliaanMouseClicked
        // TODO add your handling code here:
        new UI_JurnalPembelian().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jurnalPembeliaanMouseClicked

    private void laporanPersediaanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laporanPersediaanMouseClicked
        // TODO add your handling code here:
        new UI_LaporanPersediaan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_laporanPersediaanMouseClicked

    private void laporanPembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laporanPembelianMouseClicked
        // TODO add your handling code here:
        new UI_LaporanPembelian().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_laporanPembelianMouseClicked

    private void bukuBesarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bukuBesarMouseClicked
        // TODO add your handling code here:
        new UI_BukuBesar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bukuBesarMouseClicked

    private void jurnalPersediaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jurnalPersediaanActionPerformed
        // TODO add your handling code here:
        new UI_JurnalPersediaan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jurnalPersediaanActionPerformed

    private void jurnalPembeliaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jurnalPembeliaanActionPerformed
        // TODO add your handling code here:
         new UI_JurnalPembelian().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jurnalPembeliaanActionPerformed

    private void laporanPersediaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanPersediaanActionPerformed
        // TODO add your handling code here:
        new UI_LaporanPersediaan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_laporanPersediaanActionPerformed

    private void laporanPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanPembelianActionPerformed
        // TODO add your handling code here:
        new UI_LaporanPembelian().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_laporanPembelianActionPerformed

    private void bukuBesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bukuBesarActionPerformed
        // TODO add your handling code here:
        new UI_BukuBesar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bukuBesarActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
        new UI_Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void namaMainPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_namaMainPropertyChange
//        UI_Login login=new UI_Login();
//        String user=login.tUser.getText();
//        namaMain.setText(user);
    }//GEN-LAST:event_namaMainPropertyChange

    private void btnReturMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturMouseClicked
        new UI_DataRetur().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturMouseClicked

    private void btnBeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBeliMouseClicked
        new UI_DataPembelian().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBeliMouseClicked

    private void bkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bkMouseClicked
        new UI_DataBarangKeluar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bkMouseClicked

    private void btnSediaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSediaMouseClicked
        new UI_DataPersediaan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSediaMouseClicked

    private void bmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmActionPerformed
        // TODO add your handling code here:
        new UI_DataBarangMasuk().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bmActionPerformed

    private void haloLabelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_haloLabelPropertyChange
        UI_Login login=new UI_Login();
        String user=login.tUser.getText();
        System.out.println(user);
//        haloLabel.setText(user);
    }//GEN-LAST:event_haloLabelPropertyChange

    private void namaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_namaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_namaPropertyChange

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_MainMenu().setVisible(true);
            }});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem akun;
    private javax.swing.JMenu bM;
    private javax.swing.JButton bk;
    private javax.swing.JButton bm;
    private javax.swing.JMenuItem br;
    private javax.swing.JButton btnBeli;
    private javax.swing.JButton btnRetur;
    private javax.swing.JButton btnSedia;
    private javax.swing.JMenuItem bukuBesar;
    private javax.swing.JLabel haloLabel;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jurnalPembeliaan;
    private javax.swing.JMenuItem jurnalPersediaan;
    private javax.swing.JMenuItem kt;
    private javax.swing.JMenuItem laporanPembelian;
    private javax.swing.JMenuItem laporanPersediaan;
    public static final javax.swing.JLabel nama = new javax.swing.JLabel();
    private javax.swing.JPanel namaMain;
    private javax.swing.JMenuItem pn;
    private javax.swing.JMenuItem sp;
    // End of variables declaration//GEN-END:variables
}
