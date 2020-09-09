/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Data.PeliculaDL;
import Model.Pelicula;
import java.util.List;
/**
 *
 * @author Usuario
 */
public class PeliculaBL {
    PeliculaDL peliculaDL=new PeliculaDL();  
    
    public List listar(){
        return peliculaDL.listar();
    }
    public void insertar(PeliculaDL p){
        peliculaDL.insertar(p);
    }
    public List buscar(int id){
        return peliculaDL.buscar(id);
    }
    public void actualizar(PeliculaDL p){
        peliculaDL.actualizar(p);
    }
    public void eliminar(int id){
        peliculaDL.eliminar(id);
    }   

    public void insertar(Pelicula p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void actualizar(Pelicula p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
