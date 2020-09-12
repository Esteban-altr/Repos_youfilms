/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Data.PelisGeneroDL;
import Model.PelisGenero;
import java.util.List;
/**
 *
 * @author Usuario
 */
public class PelisGeneroBL {
    PelisGeneroDL pelisGeneroDL=new PelisGeneroDL();  
    
    public List listar(){
        return pelisGeneroDL.listar();
    }
    public void insertar(PelisGenero pg){
        pelisGeneroDL.insertar(pg);
    }
    public List buscar(int id){
        return pelisGeneroDL.buscar(id);
    }
    public void actualizar(PelisGenero pg){
        pelisGeneroDL.actualizar(pg);
    }
    public void eliminar(int id){
        pelisGeneroDL.eliminar(id);
    }      
}
