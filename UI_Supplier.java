/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Asus
 */
public class UI_Supplier extends javax.swing.JFrame {

    /**
     * Creates new form UI_Supplier
     */
    public UI_Supplier() {
        initComponents();
        table();
    }
    public void table(){
        DefaultTableModel dtm=new DefaultTableModel();
        dtm.addColumn("Kode Supplier");
        dtm.addColumn("Nama Supplier");
        dtm.addColumn("Telepon");
        dtm.addColumn("Alamat");
        try{
            Statement st=(Statement)Koneksi.getConnection().createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM tbl_supplier");
            while(rs.next()){
                dtm.addRow(new Object[]{
                    rs.getString("KodeSupplier"),
                    rs.getString("nama_supplier"),
                    rs.getString("telepon"),
                    rs.getString("alamat"),
                
                });
                tblSupplier.setModel(dtm);
            }
        }catch(Exception e){
            
        }
        
    }
     void cari(){
        DefaultTableModel tbl=new DefaultTableModel();
         tbl.addColumn("Kode Supplier");
        tbl.addColumn("Nama Supplier");
        tbl.addColumn("Telepon");
        tbl.addColumn("Alamat");
        try{
            String sql="SELECT*FROM tbl_supplier WHERE nama_supplier like '%"+txtCari.getText()+"%'";
            Connection con=(Connection)Koneksi.getConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                tbl.addRow(new Object[]{
                rs.getString("KodeSupplier"),
                rs.getString("nama_supplier"),
                rs.getString("telepon"),
                rs.getString("alamat")
                });
                tblSupplier.setModel(tbl);
            }
        }catch(Exception e){
            
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

        jPanel1 = new javax.swing.JPanel();
        txtSupplier = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSupplier = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnPilihMasuk = new javax.swing.JButton();
        btnPilihKeluar = new javax.swing.JButton();
        btnPilihBeli = new javax.swing.JButton();
        btnPilihSedia = new javax.swing.JButton();
        btnPilihRetur = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        txtSupplier.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        txtSupplier.setText("Masukan Nama Supplier");

        btnCari.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCari.setText("Cari");
        btnCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariMouseClicked(evt);
            }
        });

        tblSupplier.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Supplier", "Nama Supplier", "Telepon", "Alamat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSupplier.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tblSupplier);
        tblSupplier.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btnTambah.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });

        btnPilihMasuk.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnPilihMasuk.setText("Pilih Supplier Masuk");
        btnPilihMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPilihMasukMouseClicked(evt);
            }
        });
        btnPilihMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihMasukActionPerformed(evt);
            }
        });

        btnPilihKeluar.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnPilihKeluar.setText("Pilih Supplier Keluar");
        btnPilihKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPilihKeluarMouseClicked(evt);
            }
        });
        btnPilihKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihKeluarActionPerformed(evt);
            }
        });

        btnPilihBeli.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnPilihBeli.setText("Pilih Supplier Beli");
        btnPilihBeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPilihBeliMouseClicked(evt);
            }
        });
        btnPilihBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihBeliActionPerformed(evt);
            }
        });

        btnPilihSedia.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnPilihSedia.setText("Pilih Supplier Sedia");
        btnPilihSedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPilihSediaMouseClicked(evt);
            }
        });
        btnPilihSedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihSediaActionPerformed(evt);
            }
        });

        btnPilihRetur.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnPilihRetur.setText("Pilih Supplier Retur");
        btnPilihRetur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPilihReturMouseClicked(evt);
            }
        });
        btnPilihRetur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihReturActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSupplier)
                        .addGap(18, 18, 18)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnCari))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPilihBeli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPilihMasuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPilihKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPilihSedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHapus))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPilihRetur)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSupplier)
                            .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnCari)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnPilihMasuk)
                    .addComponent(btnPilihKeluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPilihBeli)
                    .addComponent(btnPilihSedia)
                    .addComponent(btnPilihRetur))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));

        jToggleButton1.setBackground(new java.awt.Color(255, 51, 51));
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("X");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DATA SUPPLIER");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 615, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        UI_MainMenu mn=new UI_MainMenu();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        new UI_InputSupplier().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void loaddata(){
        
    }
    
    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        UI_FormEditSupplier edit=new UI_FormEditSupplier();
      int baris=tblSupplier.getSelectedRow();
        TableModel tm=tblSupplier.getModel();
        String kodesup = tblSupplier.getValueAt(baris,0).toString();
        edit.txtKode.setText(kodesup);
        String nama = tblSupplier.getValueAt(baris,1).toString();
        edit.txtNama.setText(nama);
        String telepon = tblSupplier.getValueAt(baris,2).toString();
        edit.tTelepon.setText(telepon);
        String alamat = tblSupplier.getValueAt(baris,3).toString();
        edit.tAlamat.setText(alamat);
        try{
            String sql="SELECT * FROM tbl_supplier WHERE KodeSupplier='"+tblSupplier.getValueAt(baris,0).toString()+"'";
            Connection con=(Connection)Koneksi.getConnection(); 
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
                ResultSet rs=pst.executeQuery(sql);
                while(rs.next()){
                    edit.textNPWP.setText(rs.getString("npwp"));
                }
                rs.last();
                rs.first();
        }catch(SQLException e){
            System.out.println("Terjadi Kesalahan");
        }
        edit.setVisible(true);
        edit.pack();
        edit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        UI_Supplier sup=new UI_Supplier();
        hapus hapus=new hapus();
        try{
        int row=tblSupplier.getSelectedRow();
        TableModel tbm = tblSupplier.getModel();
        String kode = tblSupplier.getValueAt(row,0).toString();
        hapus.hapusDataSupplier(kode);
        }catch(Exception e){
          JOptionPane.showMessageDialog(null,"Data Gagal dihapus"+e.getMessage());
      }
       sup.table(); 
    }//GEN-LAST:event_btnHapusMouseClicked

    private void btnPilihMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihMasukMouseClicked
        UI_FormBarangMasuk fbm=new UI_FormBarangMasuk();
        int baris=tblSupplier.getSelectedRow();
        TableModel tbm=tblSupplier.getModel();
        String idSupplier=tblSupplier.getValueAt(baris, 0).toString();
        fbm.txtIdSupplier.setText(idSupplier);
        String namaSupplier=tblSupplier.getValueAt(baris, 1).toString();
        fbm.txtNamaSupplier.setText(namaSupplier);
        fbm.setVisible(true);
        this.dispose();
        fbm.pack();
        fbm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_btnPilihMasukMouseClicked

    private void btnPilihMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihMasukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPilihMasukActionPerformed

    private void btnPilihKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihKeluarMouseClicked
        UI_FormBarangKeluar fbk=new UI_FormBarangKeluar();
        int baris=tblSupplier.getSelectedRow();
        TableModel tbm=tblSupplier.getModel();
        String idSupplier=tblSupplier.getValueAt(baris, 0).toString();
        fbk.txtIdSupplier.setText(idSupplier);
        String namaSupplier=tblSupplier.getValueAt(baris, 1).toString();
        fbk.txtNamaSupplier.setText(namaSupplier);
        fbk.setVisible(true);
        this.dispose();
        fbk.pack();
        fbk.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    }//GEN-LAST:event_btnPilihKeluarMouseClicked

    private void btnPilihKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihKeluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPilihKeluarActionPerformed

    private void btnPilihBeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihBeliMouseClicked
        UI_FormPembelian fb=new UI_FormPembelian();
        int baris=tblSupplier.getSelectedRow();
        TableModel tbm=tblSupplier.getModel();
        String idSupplier=tblSupplier.getValueAt(baris, 0).toString();
        fb.txtIdSupplier.setText(idSupplier);
        String namaSupplier=tblSupplier.getValueAt(baris, 1).toString();
        fb.txtNamaSupplier.setText(namaSupplier);
        fb.setVisible(true);
        this.dispose();
        fb.pack();
        fb.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnPilihBeliMouseClicked

    private void btnPilihBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihBeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPilihBeliActionPerformed

    private void btnPilihSediaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihSediaMouseClicked
        UI_FormPersediaan fp=new UI_FormPersediaan();
        int baris=tblSupplier.getSelectedRow();
        TableModel tbm=tblSupplier.getModel();
        String idSupplier=tblSupplier.getValueAt(baris, 0).toString();
        fp.txtIdSupplier.setText(idSupplier);
        String namaSupplier=tblSupplier.getValueAt(baris, 1).toString();
        fp.txtNamaSupplier.setText(namaSupplier);
        fp.setVisible(true);
        this.dispose();
        fp.pack();
        fp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnPilihSediaMouseClicked

    private void btnPilihSediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihSediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPilihSediaActionPerformed

    private void btnPilihReturMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihReturMouseClicked
        UI_FormRetur fr=new UI_FormRetur();
        int baris=tblSupplier.getSelectedRow();
        TableModel tbm=tblSupplier.getModel();
        String idSupplier=tblSupplier.getValueAt(baris, 0).toString();
        fr.txtIdSupplier.setText(idSupplier);
        String namaSupplier=tblSupplier.getValueAt(baris, 1).toString();
        fr.txtNamaSupplier.setText(namaSupplier);
        fr.setVisible(true);
        this.dispose();
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnPilihReturMouseClicked

    private void btnPilihReturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihReturActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPilihReturActionPerformed

    private void btnCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseClicked
        cari();        
    }//GEN-LAST:event_btnCariMouseClicked

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
            java.util.logging.Logger.getLogger(UI_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    public javax.swing.JButton btnHapus;
    public javax.swing.JButton btnPilihBeli;
    public javax.swing.JButton btnPilihKeluar;
    public javax.swing.JButton btnPilihMasuk;
    public javax.swing.JButton btnPilihRetur;
    public javax.swing.JButton btnPilihSedia;
    public javax.swing.JButton btnTambah;
    public javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tblSupplier;
    private javax.swing.JTextField txtCari;
    private javax.swing.JLabel txtSupplier;
    // End of variables declaration//GEN-END:variables
}