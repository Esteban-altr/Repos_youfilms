/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import Model.Pelicula;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 *
 * @author Usuario
 */
public class PeliculaDL {
    Conexion con = new Conexion();
    JdbcTemplate jdbctemplate = new JdbcTemplate(con.conectar());
    List datos;
    private ResultSet rs;
    private Statement statement;
    
    public List listar() {
        String sql = "select p.id,p.Nombre,p.Ano, p.FechaLanzamiento, g.Nombre as nomGenero from pelicula p, genero g where p.IdGenero=g.id";
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }

    public void insertar(Pelicula p) {
        String sql = "insert into pelicula "
                + "(Nombre,Año,Fechalanzamiento,IdGenero) values (?,?,?,?)";
        jdbctemplate.update(sql, p.getNombre(), p.getAño(), p.getFechalanzamiento(), p.getIdGenero());
    }

    public List buscar(int id) {
        String sql = "select * from pelicula where id=" + id;
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }
    public void actualizar(Pelicula p) {
        String sql = "update pelicula set Nombre=?,Ano=?,Fechalanzamiento=?,IdGenero=? where id=?";
        jdbctemplate.update(sql, p.getNombre(),p.getAño(), p.getFechalanzamiento(),p.getIdGenero());
    }
    public void eliminar(int id){
        try {
            String sql = "delete from pelicula where id=" + id;
            this.jdbctemplate.update(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
