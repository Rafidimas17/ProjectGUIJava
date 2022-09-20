/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
/**
 *
 * @author dicky
 */
public class jumlah{
    Koneksi connect=new Koneksi();
    public void jumlahsubtotal(int ID, String hak, String nama, String password, String username, String status){
        try{
//            System.out.println(username+nama+hak+password+status);
            String sql="SELECT SUM(jumlah_masuk) as jumlahsubtotal FROM tbl_databarangmasuk";
            Connection con=(Connection)Koneksi.getConnection();
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Berhasil disimpan");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Gagal disimpan"+e.getMessage());
            
        }
        
    }
}
