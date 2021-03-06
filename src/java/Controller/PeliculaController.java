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
    
    @RequestMapping ("indexPelicula.htm")
    public ModelAndView Listar(){
    datos=peliculaBL.listar();
    mav.addObject("lsPelicula",datos);
    mav.setViewName("indexPelicula");
    return mav;
    }
    
    @RequestMapping(value="agregarPelicula.htm",method=RequestMethod.GET)
    public ModelAndView Agregar(){
        mav.addObject(new Pelicula());
        datos = generoBL.listar();
        mav.addObject("lsGeneros", datos);
        mav.setViewName("agregarPelicula");
        return mav;
    } 
    @RequestMapping(value="agregarPelicula.htm",method=RequestMethod.POST)
    public ModelAndView Agregar(Pelicula p){        
        peliculaBL.insertar(p);
        return new ModelAndView("redirect:/indexPelicula.htm");
    }
    
    @RequestMapping(value="editarPelicula.htm",method=RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        datos=peliculaBL.buscar(id);
        mav.addObject("editPelicula", datos);
        datos=generoBL.listar();
        mav.addObject("lsGeneros", datos);
        mav.setViewName("editarPelicula");
        return mav;
    }
    
     @RequestMapping(value="editarPelicula.htm",method=RequestMethod.POST)
    public ModelAndView Editar(Pelicula p)
    {
        peliculaBL.actualizar(p);
        return new ModelAndView("redirect:/indexPelicula.htm");
    }
    
    @RequestMapping("deletePelicula.htm")
    public ModelAndView Delete(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        peliculaBL.eliminar(id);
        return new ModelAndView("redirect:/indexPelicula.htm"); 
    }  
}
