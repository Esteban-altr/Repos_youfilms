/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.SerieGenero;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author User
 */
public class SerieGeneroDL {
    Conexion con = new Conexion();
    JdbcTemplate jdbctemplate = new JdbcTemplate(con.conectar());
    List datos;
    
    public List listar() {
        String sql = "select sg.id,s.Nombre as nomSerie, g.Nombre as nomGenero from serie s, seriegenero sg, genero g where sg.IdGenero=g.id AND sg.IdSerie=s.id";
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }
    
public void insertar(SerieGenero sg){
        String sql="insert into seriegenero "
                + "(IdSerie,IdGenero) values (?,?)";       
        jdbctemplate.update(sql,sg.getIdSerie(),sg.getIdGenero());        
    }

public List buscar(int id){
        String sql="select * from seriegenero where id="+ id;
        datos=jdbctemplate.queryForList(sql);
        return datos;
    }



public void actualizar(SerieGenero sg){
        String sql="update seriegenero set "
                + "IdSerie=?, IdGenero=?  where id=?";
                jdbctemplate.update(sql,sg.getIdSerie(),sg.getIdGenero(), sg.getId());        
    }

public void eliminar(int id){
        try {
            String sql = "delete from seriegenero where id=" + id;
            this.jdbctemplate.update(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }     
}
