package test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
public class DaftarData {
    Koneksi connect=new Koneksi();
    public void DataPengguna(String idPengguna){
        try{
            String sql="SELECT * FROM tbl_pengguna WHERE id_pengguna='"+idPengguna+"'";
            Connection con=(Connection)Koneksi.getConnection(); 
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();  
            JOptionPane.showMessageDialog(null,"Data Berhasil diperbarui");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data Gagal diperbarui"+e.getMessage());
            
        }
    }
    public void DataBarang(String idBarang){
        try{
            String sql="SELECT * FROM tbl_barang WHERE id_barang='"+idBarang+"'";
            Connection con=(Connection)Koneksi.getConnection(); 
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil diperbarui");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data Gagal diperbarui"+e.getMessage());
            
        }
    }
    public void DataSupplier(){
        try{
            
        }catch(Exception e){
            
        }
    }
    public void DataKategori(String idKategori){
        try{
            UI_DataKategori dKategori=new UI_DataKategori();
            String sql="SELECT * FROM tbl_kategori WHERE idKategori='"+idKategori+"'";
            Connection con=(Connection)Koneksi.getConnection(); 
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil diperbarui");
            dKategori.setVisible(true);
           
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data Gagal diperbarui"+e.getMessage());
            
        }
    }
    public void DataSupplier(String kodeSupplier){
        try{
            UI_Supplier dSupplier=new UI_Supplier();
            String sql="SELECT * FROM tbl_supplier WHERE KodeSupplier='"+kodeSupplier+"'";
            Connection con=(Connection)Koneksi.getConnection(); 
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil diperbarui");
            dSupplier.setVisible(true);
           
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data Gagal diperbarui"+e.getMessage());
            
        }
    }
    
    public void DataPembelianDetail(String idPembelianDetail){
        try{
            UI_DataPembelian dPembelian=new UI_DataPembelian();
            String sql="SELECT * FROM tbl_pembeliandetail WHERE id_PembelianDetail='"+idPembelianDetail+"'";
            Connection con=(Connection)Koneksi.getConnection(); 
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil diperbarui");
            dPembelian.setVisible(true);
           
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data Gagal diperbarui"+e.getMessage());
            
        }   
    }
    
    public void DataPembelianHeader(String idPembelianHeader){
        try{
            UI_DataPembelian dPembelian=new UI_DataPembelian();
            String sql="SELECT * FROM tbl_pembelianheader WHERE id_PembelianHeader='"+idPembelianHeader+"'";
            Connection con=(Connection)Koneksi.getConnection(); 
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil diperbarui");
            dPembelian.setVisible(true);
           
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data Gagal diperbarui"+e.getMessage());
            
        }   
    }
} 