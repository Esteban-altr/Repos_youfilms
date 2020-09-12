/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.PelisGenero;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 *
 * @author Usuario
 */
public class PelisGeneroDL {
    Conexion con = new Conexion();
    JdbcTemplate jdbctemplate = new JdbcTemplate(con.conectar());
    List datos;
    
    public List listar() {
        String sql = "select pg.id, p.Nombre as nomPelicula, g.Nombre as nomGenero from pelicula p, pelisgenero pg, genero g where pg.IdGenero=g.id AND pg.IdPelicula=p.id";
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }
    
public void insertar(PelisGenero pg){
        String sql="insert into pelisgenero " + "(IdPelicula,IdGenero) values (?,?)";       
        jdbctemplate.update(sql,pg.getIdPelicula(),pg.getIdGenero());        
    }

public List buscar(int id){
        String sql="select * from pelisgenero where id="+ id;
        datos=jdbctemplate.queryForList(sql);
        return datos;
    }



public void actualizar(PelisGenero pg){
        String sql="update pelisgenero set " + "IdPelicula=?, IdGenero=?  where id=?";
                jdbctemplate.update(sql,pg.getIdPelicula(),pg.getIdGenero(), pg.getId());        
    }

public void eliminar(int id){
        try {
            String sql = "delete from pelisgenero where id=" + id;
            this.jdbctemplate.update(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }     
}
