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
    PeliculaDL GeneroDL=new PeliculaDL();  
    
    public List listar(){
        return GeneroDL.listar();
    }
    public void insertar(Pelicula p){
        GeneroDL.insertar(p);
    }
    public List buscar(int id){
        return GeneroDL.buscar(id);
    }
    public void actualizar(Pelicula p){
        GeneroDL.actualizar(p);
    }
    public void eliminar(int id){
        GeneroDL.eliminar(id);
    }
}
