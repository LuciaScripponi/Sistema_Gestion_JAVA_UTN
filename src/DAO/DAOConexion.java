
package DAO;
import java.sql.*;

/**
 *
 * @author lucia
 */
public class DAOConexion {
    protected Connection conn;
    protected PreparedStatement consulta;
    protected ResultSet datos;
    
    public void conectar(String servidor, String bd, String usuario, String password) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        this.conn = DriverManager.getConnection("jdbc:mysql://"+servidor+"/"+bd,usuario,password);
    }
    
    public void desconectar() throws SQLException{
        this.conn.close();
        this.consulta.close();
    }
    
    public void desconectar(ResultSet rs) throws SQLException{
        this.desconectar();
        rs.close();
    }
}
