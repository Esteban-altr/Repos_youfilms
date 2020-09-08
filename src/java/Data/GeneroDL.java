/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Genero;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author User
 */
public class GeneroDL {
     Conexion con = new Conexion();
    JdbcTemplate jdbctemplate = new JdbcTemplate(con.conectar());
    List datos;
    
    public List listar() {
        String sql = "select * from genero";
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }
    
public void insertar(Genero g){
        String sql="insert into genero "
                + "(Nombre) values (?)";       
        jdbctemplate.update(sql,g.getNombre());        
    }

public List buscar(int id){
        String sql="select * from genero where id="+ id;
        datos=jdbctemplate.queryForList(sql);
        return datos;
    }
public void actualizar(Genero g){
        String sql="update genero set " + "Nombre=? where id=?";
                jdbctemplate.update(sql,g.getNombre(),g.getid());        
    }

public void eliminar(int id){
        try {
            String sql = "delete from genero where id=" + id;
            this.jdbctemplate.update(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }  
}
