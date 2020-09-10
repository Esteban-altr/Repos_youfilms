/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Data.CapituloDL;
import Model.Capitulo;
import java.util.List;
/**
 *
 * @author Usuario
 */
public class CapituloBL {
    CapituloDL capituloDL=new CapituloDL();  
    
    public List listar(){
        return capituloDL.listar();
    }
    public void insertar(Capitulo c){
        capituloDL.insertar(c);
    }
    public List buscar(int id){
        return capituloDL.buscar(id);
    }
    public void actualizar(Capitulo c){
        capituloDL.actualizar(c);
    }
    public void eliminar(int id){
        capituloDL.eliminar(id);
    }
}
