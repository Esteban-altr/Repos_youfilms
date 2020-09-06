/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.AnimeDL;
import Model.Anime;
import java.util.List;

/**
 *
 * @author User
 */
public class AnimeBL {
     AnimeDL animeDL=new AnimeDL();  
    
    public List listar(){
        return animeDL.listar();
    }
    public void insertar(Anime a){
        animeDL.insertar(a);
    }
    public List buscar(int id){
        return animeDL.buscar(id);
    }
    public void actualizar(Anime a){
        animeDL.actualizar(a);
    }
    public void eliminar(int id){
        animeDL.eliminar(id);
    }   
}
