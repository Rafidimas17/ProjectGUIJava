/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class tambah {
    Koneksi connect=new Koneksi();
    public void tambahPengguna(int ID, String hak, String nama, String password, String username, String status){
        try{
//            System.out.println(username+nama+hak+password+status);
            String sql="INSERT INTO `tbl_pengguna` (`id_pengguna`,`hak_akses`,`nama_lengkap`,`password`,`username`,`status`)"
                    + "VALUES('"+ID+"','"+hak+"','"+nama+"','"+password+"','"+username+"','"+status+"')";
            Connection con=(Connection)Koneksi.getConnection();
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Berhasil disimpan");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Gagal disimpan"+e.getMessage());
            
        }
        
    }
    public void tambahSupplier(int kode, String nama, String jenis, String npwp, String alamat, String telepon){
        try{
          String sql="INSERT INTO tbl_supplier(`KodeSupplier`,`nama_supplier`,`jenis_usaha`,`npwp`,`alamat`,`telepon`)VALUES('"+kode+"','"+nama
                  +"','"+jenis+"','"+npwp+"','"+alamat+"','"+telepon+"')";
          Connection con=(Connection) Koneksi.getConnection();
          PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
          pst.execute();
          JOptionPane.showMessageDialog(null,"Berhasil Menyimpan");
        }catch(Exception e){
          JOptionPane.showMessageDialog(null,"Insert data gagal"+e.getMessage());
            
        }
    }
    public void tambahKategori(String idKategori, String KategoriBarang){
        UI_DataKategori dataKategori=new UI_DataKategori();
        UI_FormKategori formKategori=new UI_FormKategori();
        try{
            String sql="INSERT INTO tbl_kategori(`idKategori`,`KategoriBarang`)VALUES('"+idKategori+"','"+KategoriBarang+"')";
            Connection con=(Connection)Koneksi.getConnection();
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil ditambah");
            dataKategori.setVisible(true);
//            this.dispose();
            dataKategori.table();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data telah tersedia");
            formKategori.setVisible(true);
            
        }
    }
    public void tambahBarang(String harga_beli, String kategori_barang, String kode_barcode, String nama_barang, String satuan){
        try{
            String sql="INSERT INTO tbl_barang(`harga_beli`,`kategori_barang`, `kode_barcode`, `nama_barang`, `satuan`)VALUES('"+harga_beli+"','"+kategori_barang+"','"+kode_barcode+"','"+nama_barang+"','"+satuan+"')";
            Connection con=(Connection)Koneksi.getConnection();
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil ditambah");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Gagal tambah Barang "+e.getMessage());
        }
    }
    public void tambahBarangMasuk(String noTransaksi, String idSupplier, String namaSupplier, String tglTransaksi, String Keterangan, 
            String id_barang, String kode_barcode, String nama_barang, String jumlah_masuk, String satuan, String harga_satuan, 
            String subTotal, String nilaiPajak){
        try{
            String sql="INSERT INTO tbl_databarangmasuk(`noTransaksi`,`idSupplier`, `namaSupplier`, `tglTransaksi`, `Keterangan`, "
                    + "`id_barang`, `kode_barcode`, `nama_barang`, `jumlah_masuk`, `satuan`, `harga_satuan`, `sub_total`, `pajak`)"
                    + "VALUES('"+noTransaksi+"','"+idSupplier+"','"+namaSupplier+"','"+tglTransaksi+"','"+Keterangan+"','"+id_barang+"',"
                    + "'"+kode_barcode+"','"+nama_barang+"','"+jumlah_masuk+"','"+satuan+"','"+harga_satuan+"','"+subTotal+"','"+nilaiPajak+"')";
            
            Connection con=(Connection)Koneksi.getConnection();
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil ditambah");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Gagal tambah kategori "+e.getMessage());
        }
    }
    public void tambahBarangKeluar(String noTransaksi, String idSupplier, String namaSupplier, String tglTransaksi, String Keterangan, 
            String id_barang, String kode_barcode, String nama_barang, String jumlah_masuk, String satuan, String harga_satuan, 
            String subTotal, String nilaiPajak){
        try{
            String sql="INSERT INTO tbl_databarangkeluar(`noTransaksi`,`idSupplier`, `namaSupplier`, `tglTransaksi`, `Keterangan`, "
                    + "`id_barang`, `kode_barcode`, `nama_barang`, `jumlah_masuk`, `satuan`, `harga_satuan`, `sub_total`, `pajak`)"
                    + "VALUES('"+noTransaksi+"','"+idSupplier+"','"+namaSupplier+"','"+tglTransaksi+"','"+Keterangan+"','"+id_barang+"',"
                    + "'"+kode_barcode+"','"+nama_barang+"','"+jumlah_masuk+"','"+satuan+"','"+harga_satuan+"','"+subTotal+"','"+nilaiPajak+"')";
            
            Connection con=(Connection)Koneksi.getConnection();
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil ditambah");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Gagal tambah kategori "+e.getMessage());
        }
    }
    public void tambahPembelian(String noTransaksi, String idSupplier, String namaSupplier, String tglTransaksi, String Keterangan, 
            String Metode, String id_barang, String kode_barcode, String nama_barang, String jumlah_masuk, String satuan, 
            String harga_satuan, String subTotal, String nilaiPajak, String kadaluwarsa, String noNota, String Status){
        try{
            String sql="INSERT INTO tbl_pembelianfix(`noTransaksi`,`idSupplier`, `namaSupplier`, `tglTransaksi`, `Keterangan`, "
                    + "`Metode`, `id_barang`, `kode_barcode`, `nama_barang`, `jumlah_masuk`, `satuan`, `harga_satuan`,"
                    + " `sub_total`, `pajak`, `kadaluwarsa`, `noNota`, `Status`)VALUES"
                    + "('"+noTransaksi+"','"+idSupplier+"','"+namaSupplier+"','"+tglTransaksi+"','"+Keterangan+"','"+Metode+"',"
                    + "'"+id_barang+"','"+kode_barcode+"','"+nama_barang+"','"+jumlah_masuk+"','"+satuan+"','"+harga_satuan+"',"
                    + "'"+subTotal+"','"+nilaiPajak+"','"+kadaluwarsa+"','"+noNota+"','"+Status+"')";
            
            Connection con=(Connection)Koneksi.getConnection();
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil ditambah");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Gagal tambah kategori "+e.getMessage());
        }
    }
    public void tambahPersediaan(String noTransaksi, String idSupplier, String namaSupplier, String tglTransaksi, String Keterangan, 
            String Metode, String id_barang, String kode_barcode, String nama_barang, String jumlah_masuk, String satuan, 
            String harga_satuan, String subTotal, String nilaiPajak, String kadaluwarsa, String noNota, String Status){
        try{
            String sql="INSERT INTO tbl_persediaanfix(`noTransaksi`,`idSupplier`, `namaSupplier`, `tglTransaksi`, `Keterangan`, "
                    + "`Metode`, `id_barang`, `kode_barcode`, `nama_barang`, `jumlah_masuk`, `satuan`, `harga_satuan`,"
                    + " `sub_total`, `pajak`, `kadaluwarsa`, `noNota`, `Status`)VALUES"
                    + "('"+noTransaksi+"','"+idSupplier+"','"+namaSupplier+"','"+tglTransaksi+"','"+Keterangan+"','"+Metode+"',"
                    + "'"+id_barang+"','"+kode_barcode+"','"+nama_barang+"','"+jumlah_masuk+"','"+satuan+"','"+harga_satuan+"',"
                    + "'"+subTotal+"','"+nilaiPajak+"','"+kadaluwarsa+"','"+noNota+"','"+Status+"')";
            
            Connection con=(Connection)Koneksi.getConnection();
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil ditambah");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Gagal tambah kategori "+e.getMessage());
        }
    }
    public void tambahRetur(String noTransaksi, String idSupplier, String namaSupplier, String tglTransaksi, String Keterangan, 
            String Metode, String id_barang, String kode_barcode, String nama_barang, String jumlah_masuk, String satuan, 
            String harga_satuan, String subTotal, String nilaiPajak, String kadaluwarsa, String noNota, String Status){
        try{
            String sql="INSERT INTO tbl_returfix(`noTransaksi`,`idSupplier`, `namaSupplier`, `tglTransaksi`, `Keterangan`, "
                    + "`Metode`, `id_barang`, `kode_barcode`, `nama_barang`, `jumlah_masuk`, `satuan`, `harga_satuan`,"
                    + " `sub_total`, `pajak`, `kadaluwarsa`, `noNota`, `Status`)VALUES"
                    + "('"+noTransaksi+"','"+idSupplier+"','"+namaSupplier+"','"+tglTransaksi+"','"+Keterangan+"','"+Metode+"',"
                    + "'"+id_barang+"','"+kode_barcode+"','"+nama_barang+"','"+jumlah_masuk+"','"+satuan+"','"+harga_satuan+"',"
                    + "'"+subTotal+"','"+nilaiPajak+"','"+kadaluwarsa+"','"+noNota+"','"+Status+"')";
            
            Connection con=(Connection)Koneksi.getConnection();
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil ditambah");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Gagal tambah kategori "+e.getMessage());
        }
    }
    public void tambahBelidetail(String idKategori, String KategoriBarang){
        try{
            String sql="INSERT INTO tbl_kategori(`idKategori`,`KategoriBarang`)VALUES('"+idKategori+"','"+KategoriBarang+"')";
            Connection con=(Connection)Koneksi.getConnection();
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil ditambah");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Gagal tambah kategori"+e.getMessage());
        }
    }
    
    
}