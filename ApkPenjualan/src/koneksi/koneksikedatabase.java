/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Berfungsi Sebagai penghubung Anatara database mysql dan java netbeans 
*/
package koneksi;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class koneksikedatabase {
    private static Connection koneksi_db=null;
    public static Connection ambilKoneksiDatabase(){
        MysqlDataSource dbjual=new MysqlDataSource();
        dbjual.setDatabaseName("penjualan");
        dbjual.setPassword("");
        dbjual.setUser("root");
        try {
          koneksi_db=dbjual.getConnection();
          JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
          
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal" +e.getMessage());
        }
        return koneksi_db;
    }
}
