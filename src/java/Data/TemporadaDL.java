/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Temporada;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author User
 */
public class TemporadaDL {
    Conexion con = new Conexion();
    JdbcTemplate jdbctemplate = new JdbcTemplate(con.conectar());
    List datos;
    
    public List listar() {
        String sql = "select * from temporada";
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }
    
public void insertar(Temporada t){
        String sql="insert into temporada "
                + "(Nombre,NumeroTemporada,CantidadCapitulos,Estacion,Ano) values (?,?,?,?,?)";       
        jdbctemplate.update(sql, t.getNombre(), t.getNumeroTemporada(), t.getCantidadCapitulos(), t.getEstacion(), t.getAno());        
    }

public List buscar(int id){
        String sql="select * from temporada where id="+ id;
        datos=jdbctemplate.queryForList(sql);
        return datos;
    }



public void actualizar(Temporada t){
        String sql="update temporada set "
                + "Nombre=?,NumeroTemporada=?,CantidadCapitulos=?,Estacion=?,Ano=?  where id=?";
                jdbctemplate.update(sql,t.getNombre(),t.getNumeroTemporada(),t.getCantidadCapitulos(),t.getEstacion(),t.getAno(), t.getId());        
    }

public void eliminar(int id){
        try {
            String sql = "delete from temporada where id=" + id;
            this.jdbctemplate.update(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }     
}
