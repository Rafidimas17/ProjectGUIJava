package test;

public class UI_SubMenu extends javax.swing.JFrame {

    public UI_SubMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtUser = new javax.swing.JLabel();
        halo = new javax.swing.JLabel();
        btnBarangMasuk = new javax.swing.JButton();
        btnBarangKeluar = new javax.swing.JButton();
        btnPembelian = new javax.swing.JButton();
        btnPersediaan = new javax.swing.JButton();
        btnRetur = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Master = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuBarang = new javax.swing.JMenuItem();
        MenuSupplier = new javax.swing.JMenuItem();
        MenuPengguna = new javax.swing.JMenuItem();
        MenuKategori = new javax.swing.JMenuItem();
        MenuBarangMasuk = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        MenuPembelian = new javax.swing.JMenuItem();
        MenuBarangKeluar = new javax.swing.JMenuItem();
        MenuPersediaan = new javax.swing.JMenuItem();
        MenuRetur = new javax.swing.JMenuItem();
        Laporan = new javax.swing.JMenu();
        MenuJurnalPersediaan = new javax.swing.JMenuItem();
        MenuJurnalPembelian = new javax.swing.JMenuItem();
        MenuLaporanPersediaan = new javax.swing.JMenuItem();
        MenuLaporanPembelian = new javax.swing.JMenuItem();
        MenuBukuBesar = new javax.swing.JMenuItem();
        Logout = new javax.swing.JMenu();

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel2.setText("Dr.Strange");

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel1.setText("HALO");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        txtUser.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtUser.setText("Dr.Strange");

        halo.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        halo.setText("HALO");

        btnBarangMasuk.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnBarangMasuk.setText("Barang Masuk");

        btnBarangKeluar.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnBarangKeluar.setText("Barang Keluar");

        btnPembelian.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnPembelian.setText("Pembelian");

        btnPersediaan.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnPersediaan.setText("Persediaan");

        btnRetur.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnRetur.setText("Retur Persediaan");

        btnLogout.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnLogout.setText("Logout");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(halo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUser))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnPersediaan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBarangMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(73, 73, 73)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnBarangKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(448, 448, 448)
                                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnRetur, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(halo)
                    .addComponent(txtUser))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBarangMasuk)
                    .addComponent(btnBarangKeluar))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPersediaan)
                    .addComponent(btnPembelian))
                .addGap(46, 46, 46)
                .addComponent(btnRetur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        Master.setText("Master");
        Master.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jMenuItem1.setText("Akun");
        Master.add(jMenuItem1);

        MenuBarang.setText("Barang");
        Master.add(MenuBarang);

        MenuSupplier.setText("Supplier");
        Master.add(MenuSupplier);

        MenuPengguna.setText("Pengguna");
        Master.add(MenuPengguna);

        MenuKategori.setText("Kategori");
        Master.add(MenuKategori);

        jMenuBar1.add(Master);

        MenuBarangMasuk.setText("Transaksi");
        MenuBarangMasuk.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jMenuItem6.setText("Barang Masuk");
        MenuBarangMasuk.add(jMenuItem6);

        MenuPembelian.setText("Pembelian");
        MenuBarangMasuk.add(MenuPembelian);

        MenuBarangKeluar.setText("Barang Keluar");
        MenuBarangMasuk.add(MenuBarangKeluar);

        MenuPersediaan.setText("Persediaan");
        MenuBarangMasuk.add(MenuPersediaan);

        MenuRetur.setText("Retur Persediaan");
        MenuBarangMasuk.add(MenuRetur);

        jMenuBar1.add(MenuBarangMasuk);

        Laporan.setText("Laporan");
        Laporan.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        MenuJurnalPersediaan.setText("Jurnal Persediaan");
        Laporan.add(MenuJurnalPersediaan);

        MenuJurnalPembelian.setText("Jurnal Pembelian");
        Laporan.add(MenuJurnalPembelian);

        MenuLaporanPersediaan.setText("Laporan Persediaan");
        Laporan.add(MenuLaporanPersediaan);

        MenuLaporanPembelian.setText("Laporan Pembelian");
        Laporan.add(MenuLaporanPembelian);

        MenuBukuBesar.setText("Buku Besar");
        Laporan.add(MenuBukuBesar);

        jMenuBar1.add(Laporan);

        Logout.setText("Logout");
        Logout.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jMenuBar1.add(Logout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(UI_SubMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_SubMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_SubMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_SubMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_SubMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Laporan;
    private javax.swing.JMenu Logout;
    private javax.swing.JMenu Master;
    private javax.swing.JMenuItem MenuBarang;
    private javax.swing.JMenuItem MenuBarangKeluar;
    private javax.swing.JMenu MenuBarangMasuk;
    private javax.swing.JMenuItem MenuBukuBesar;
    private javax.swing.JMenuItem MenuJurnalPembelian;
    private javax.swing.JMenuItem MenuJurnalPersediaan;
    private javax.swing.JMenuItem MenuKategori;
    private javax.swing.JMenuItem MenuLaporanPembelian;
    private javax.swing.JMenuItem MenuLaporanPersediaan;
    private javax.swing.JMenuItem MenuPembelian;
    private javax.swing.JMenuItem MenuPengguna;
    private javax.swing.JMenuItem MenuPersediaan;
    private javax.swing.JMenuItem MenuRetur;
    private javax.swing.JMenuItem MenuSupplier;
    private javax.swing.JButton btnBarangKeluar;
    private javax.swing.JButton btnBarangMasuk;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPembelian;
    private javax.swing.JButton btnPersediaan;
    private javax.swing.JButton btnRetur;
    private javax.swing.JLabel halo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
}
