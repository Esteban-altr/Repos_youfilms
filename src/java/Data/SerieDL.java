/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Serie;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author User
 */
public class SerieDL {
    Conexion con = new Conexion();
    JdbcTemplate jdbctemplate = new JdbcTemplate(con.conectar());
    List datos;
    
    public List listar() {
        String sql = "select s.id,s.Nombre,s.Ano,s.CantidadTemporadas,s.Descripcion, g.Nombre as nomGenero, t.Nombre as nomTemporada from temporada t, serie s, genero g where s.IdGenero=g.id AND s.IdTemporada=t.id";
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }
    
public void insertar(Serie s){
        String sql="insert into serie "
                + "(Nombre,Ano,CantidadTemporadas,Descripcion,IdGenero,IdTemporada) values (?,?,?,?,?,?)";       
        jdbctemplate.update(sql, s.getNombre(), s.getAno(), s.getCantidadTemporadas(),s.getDescripcion(), s.getIdGenero(), s.getIdTemporada());        
    }

public List buscar(int id){
        String sql="select * from serie where id="+ id;
        datos=jdbctemplate.queryForList(sql);
        return datos;
    }



public void actualizar(Serie s){
        String sql="update anime set "
                + "Nombre=?,Ano=?,CantidadTemporadas=?,Descripcion=?,IdGenero=?,IdTemporada=?  where id=?";
                jdbctemplate.update(sql,s.getNombre(),s.getAno(),s.getCantidadTemporadas(),s.getDescripcion(),s.getIdGenero(),s.getIdTemporada(), s.getId());        
    }

public void eliminar(int id){
        try {
            String sql = "delete from serie where id=" + id;
            this.jdbctemplate.update(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }      
}
