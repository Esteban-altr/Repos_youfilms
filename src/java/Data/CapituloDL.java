/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Capitulo;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Usuario
 */
public class CapituloDL {

    Conexion con = new Conexion();
    JdbcTemplate jdbctemplate = new JdbcTemplate(con.conectar());
    List datos;

    public List listar() {
        String sql = "SELECT c.id, c.NumeroCapitulo, c.Nombre, t.Nombre as nomTemporada from capitulo c, temporada t where c.IdTemporada=t.id";
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }

    public void insertar(Capitulo c) {
        String sql = "insert into capitulo " + "(NumeroCapitulo, Nombre, IdTemporada) values (?,?,?)";
        jdbctemplate.update(sql, c.getNumeroCapitulo(), c.getNombre(), c.getIdTemporada());
    }

    public List buscar(int id) {
        String sql = "select * from capitulo where id=" + id;
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }

    public void actualizar(Capitulo p) {
        String sql = "update capitulo set "
                + "NumeroCapitulo=?,Nombre=?,IdTemporada=?  where id=?";
        jdbctemplate.update(sql, p.getNumeroCapitulo(), p.getNombre(), p.getIdTemporada());
    }

    public void eliminar(int id) {
        try {
            String sql = "delete from capitulo where id=" + id;
            this.jdbctemplate.update(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
