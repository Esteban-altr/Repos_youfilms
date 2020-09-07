/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.SerieDL;
import Model.Serie;
import java.util.List;

/**
 *
 * @author User
 */
public class SerieBL {
     SerieDL serieDL=new SerieDL();  
    
    public List listar(){
        return serieDL.listar();
    }
    public void insertar(Serie s){
        serieDL.insertar(s);
    }
    public List buscar(int id){
        return serieDL.buscar(id);
    }
    public void actualizar(Serie s){
        serieDL.actualizar(s);
    }
    public void eliminar(int id){
        serieDL.eliminar(id);
    }      
}
