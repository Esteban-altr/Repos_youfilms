/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Business.PeliculaBL;
import Business.GeneroBL;
import Model.Pelicula;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author Usuario
 */
public class PeliculaController {
    ModelAndView mav=new ModelAndView();
    PeliculaBL peliculaBL=new PeliculaBL();
    GeneroBL generoBL= new GeneroBL();
    int id;
    List datos;
    
    @RequestMapping ("indexPeliculaspelis.htm")
    public ModelAndView Listar(){
    datos=peliculaBL.listar();
    mav.addObject("lsPelicula",datos);
    mav.setViewName("indexPeliculaspelis");
    return mav;
    }
    
    @RequestMapping(value="agregarPeliculaspelis.htm",method=RequestMethod.GET)
    public ModelAndView Agregar(){
        mav.addObject(new Pelicula());
        datos = generoBL.listar();
        mav.addObject("lsGeneros", datos);
        mav.setViewName("agregarPeliculaspelis");
        return mav;
    } 
    @RequestMapping(value="agregarPeliculaspelis.htm",method=RequestMethod.POST)
    public ModelAndView Agregar(Pelicula p){        
        peliculaBL.insertar(p);
        return new ModelAndView("redirect:/indexPeliculaspelis.htm");
    }
    
    @RequestMapping(value="editarPeliculaspelis.htm",method=RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        datos=peliculaBL.buscar(id);
        mav.addObject("editPeliculaspelis", datos);
        datos=generoBL.listar();
        mav.addObject("lsGeneros", datos);
        mav.setViewName("editarPeliculaspelis");
        return mav;
    }
    
     @RequestMapping(value="editarPeliculaspelis.htm",method=RequestMethod.POST)
    public ModelAndView Editar(Pelicula p)
    {
        peliculaBL.actualizar(p);
        return new ModelAndView("redirect:/indexPeliculaspelis.htm");
    }
    
    @RequestMapping("deletePeliculaspelis.htm")
    public ModelAndView Delete(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        peliculaBL.eliminar(id);
        return new ModelAndView("redirect:/indexPeliculaspelis.htm"); 
    }  
}
