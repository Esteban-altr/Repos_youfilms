/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.SerieGeneroDL;
import Model.SerieGenero;
import java.util.List;

/**
 *
 * @author User
 */
public class SerieGeneroBL {
     SerieGeneroDL seriegeneroDL=new SerieGeneroDL();  
    
    public List listar(){
        return seriegeneroDL.listar();
    }
    public void insertar(SerieGenero sg){
        seriegeneroDL.insertar(sg);
    }
    public List buscar(int id){
        return seriegeneroDL.buscar(id);
    }
    public void actualizar(SerieGenero sg){
        seriegeneroDL.actualizar(sg);
    }
    public void eliminar(int id){
        seriegeneroDL.eliminar(id);
    }      
}
