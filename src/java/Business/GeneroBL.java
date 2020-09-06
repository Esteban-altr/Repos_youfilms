/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.GeneroDL;
import Model.Genero;
import java.util.List;

/**
 *
 * @author User
 */
public class GeneroBL {
    GeneroDL generoDL=new GeneroDL();  
    
    public List listar(){
        return generoDL.listar();
    }
    public void insertar(Genero g){
        generoDL.insertar(g);
    }
    public List buscar(int id){
        return generoDL.buscar(id);
    }
    public void actualizar(Genero g){
        generoDL.actualizar(g);
    }
    public void eliminar(int id){
        generoDL.eliminar(id);
    }   
}
