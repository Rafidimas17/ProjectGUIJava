package test;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class hapus {
    Koneksi konek=new Koneksi();
    public void hapusDataPengguna (String id){
        try{
            String sql="DELETE FROM tbl_pengguna WHERE id_pengguna='"+id+"'";
                   Connection con=(Connection)Koneksi.getConnection();
                   PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
                   pst.execute();
                   JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
        }catch(Exception e){
                   JOptionPane.showMessageDialog(null,"Data Gagal Dihapus"+e.getMessage());            
        }
    }
    public void hapusDataSupplier (String kode){
       try{
           String sql="DELETE FROM tbl_supplier WHERE KodeSupplier='"+kode+"'";
           Connection con=(Connection)Koneksi.getConnection();
                   PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
                   pst.execute();
                   JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Data Gagal dihapus"+e.getMessage());
       }
    }
    public void hapusDataKategori(String idKategori){
        try{
        String sqlKategori="DELETE FROM tbl_kategori WHERE idKategori='"+idKategori+"'";
        Connection con=(Connection)Koneksi.getConnection();
        PreparedStatement pst=(PreparedStatement)con.prepareStatement(sqlKategori);
        pst.execute();
        JOptionPane.showMessageDialog(null,"Data Berhasil dihapus");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data Gagal dihapus"+e.getMessage());
        
    }
    }
    public void hapusDataBarang(String idBarang){
        try{
        String sqlBarang="DELETE FROM tbl_barang WHERE id_barang='"+idBarang+"'";
        Connection con=(Connection)Koneksi.getConnection();
        PreparedStatement pst=(PreparedStatement)con.prepareStatement(sqlBarang);
        pst.execute();
        JOptionPane.showMessageDialog(null,"Data Berhasil dihapus");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data Gagal dihapus"+e.getMessage());
        
    }
    }
    public void hapusDataBarangMasuk(String idBarangMasuk){
        try{
        String sqlBarangMasuk="DELETE FROM tbl_databarangmasuk WHERE id_barang='"+idBarangMasuk+"'";
        Connection con=(Connection)Koneksi.getConnection();
        PreparedStatement pst=(PreparedStatement)con.prepareStatement(sqlBarangMasuk);
        pst.execute();
        JOptionPane.showMessageDialog(null,"Data Berhasil dihapus");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data Gagal dihapus"+e.getMessage());
        
    }
    }
    public void hapusDataBarangKeluar(String idBarangKeluar){
        try{
        String sqlBarangKeluar="DELETE FROM tbl_databarangkeluar WHERE id_barang='"+idBarangKeluar+"'";
        Connection con=(Connection)Koneksi.getConnection();
        PreparedStatement pst=(PreparedStatement)con.prepareStatement(sqlBarangKeluar);
        pst.execute();
        JOptionPane.showMessageDialog(null,"Data Berhasil dihapus");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data Gagal dihapus"+e.getMessage());
        
    }
    }
    public void hapusDataPembelian(String idPembelian){
        try{
        String sqlPembelian="DELETE FROM tbl_pembelianfix WHERE id_barang='"+idPembelian+"'";
        Connection con=(Connection)Koneksi.getConnection();
        PreparedStatement pst=(PreparedStatement)con.prepareStatement(sqlPembelian);
        pst.execute();
        JOptionPane.showMessageDialog(null,"Data Berhasil dihapus");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data Gagal dihapus"+e.getMessage());
        
    }
    }
    public void hapusDataPersediaan(String idPersediaan){
        try{
        String sqlPersediaan="DELETE FROM tbl_persediaanfix WHERE id_barang='"+idPersediaan+"'";
        Connection con=(Connection)Koneksi.getConnection();
        PreparedStatement pst=(PreparedStatement)con.prepareStatement(sqlPersediaan);
        pst.execute();
        JOptionPane.showMessageDialog(null,"Data Berhasil dihapus");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data Gagal dihapus"+e.getMessage());
        
    }
    }
    public void hapusDataRetur(String idRetur){
        try{
        String sqlRetur="DELETE FROM tbl_returfix WHERE id_barang='"+idRetur+"'";
        Connection con=(Connection)Koneksi.getConnection();
        PreparedStatement pst=(PreparedStatement)con.prepareStatement(sqlRetur);
        pst.execute();
        JOptionPane.showMessageDialog(null,"Data Berhasil dihapus");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data Gagal dihapus"+e.getMessage());
        
    }
    }
    public void hapusDataAccount(String idAccount){
      try{
          String sql="DELETE FROM tbl_account WHERE kodeakun='"+idAccount+"'";
          Connection con=(Connection)Koneksi.getConnection();
          PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
          pst.execute();
          JOptionPane.showMessageDialog(null,"Data Behasil Dihapus");
      } catch(Exception e){
          JOptionPane.showMessageDialog(null,"Data Gagal Dihapus"+e.getMessage());
      } 
        
    }
}
