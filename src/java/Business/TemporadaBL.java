/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.TemporadaDL;
import Model.Temporada;
import java.util.List;

/**
 *
 * @author User
 */
public class TemporadaBL {
     TemporadaDL temporadaDL=new TemporadaDL();  
    
    public List listar(){
        return temporadaDL.listar();
    }
    public void insertar(Temporada t){
        temporadaDL.insertar(t);
    }
    public List buscar(int id){
        return temporadaDL.buscar(id);
    }
    public void actualizar(Temporada t){
        temporadaDL.actualizar(t);
    }
    public void eliminar(int id){
        temporadaDL.eliminar(id);
    }    
}
