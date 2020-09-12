/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Anime;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author User
 */
public class AnimeDL {
    Conexion con = new Conexion();
    JdbcTemplate jdbctemplate = new JdbcTemplate(con.conectar());
    List datos;
    
    public List listar() {
        String sql = "select a.id, a.Nombre, a.Ano, a.CantidadTemporadas, a.linkImg, g.Nombre as nomGenero, t.Nombre as nomTemporada from temporada t, anime a, genero g where a.IdGenero=g.id AND a.IdTemporada=t.id";
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }
    
public void insertar(Anime a){
        String sql="insert into anime "
                + "(Nombre,Ano,CantidadTemporadas,linkImg,IdGenero,IdTemporada) values (?,?,?,?,?,?)";       
        jdbctemplate.update(sql, a.getNombre(), a.getAno(), a.getCantidadTemporadas(), a.getLinkImg(), a.getIdGenero(), a.getIdTemporada());        
    }

public List buscar(int id){
        String sql="select * from anime where id="+ id;
        datos=jdbctemplate.queryForList(sql);
        return datos;
    }



public void actualizar(Anime a){
        String sql="update anime set "
                + "Nombre=?,Ano=?,CantidadTemporadas=?,linkImg=?,IdGenero=?,IdTemporada=?  where id=?";
                jdbctemplate.update(sql,a.getNombre(),a.getAno(),a.getCantidadTemporadas(),a.getLinkImg(),a.getIdGenero(),a.getIdTemporada(), a.getId());        
    }

public void eliminar(int id){
        try {
            String sql = "delete from anime where id=" + id;
            this.jdbctemplate.update(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
}
