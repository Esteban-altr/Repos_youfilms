/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Business.PelisGeneroBL;
import Business.GeneroBL;
import Business.PeliculaBL;
import Model.PelisGenero;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author Usuario
 */
public class PelisGeneroController {
    ModelAndView mav=new ModelAndView();
    PelisGeneroBL pelisGeneroBL=new PelisGeneroBL();
    PeliculaBL peliculaBL= new PeliculaBL();
    GeneroBL generoBL= new GeneroBL();
    int id;
    List datos;
    
    @RequestMapping ("indexPelisGenero.htm")
    public ModelAndView Listar(){
    datos=pelisGeneroBL.listar();
    mav.addObject("lsPelisGenero",datos);
    mav.setViewName("indexPelisGenero");
    return mav;
    }
    
    @RequestMapping(value="agregarPelisGenero.htm",method=RequestMethod.GET)
    public ModelAndView Agregar(){
        mav.addObject(new PelisGenero());
        datos = peliculaBL.listar();
        mav.addObject("lsPelicula", datos);
        datos = generoBL.listar();
        mav.addObject("lsGeneros", datos);
        mav.setViewName("agregarPelisGenero");
        return mav;
    } 
    @RequestMapping(value="agregarPelisGenero.htm",method=RequestMethod.POST)
    public ModelAndView Agregar(PelisGenero pg){        
        pelisGeneroBL.insertar(pg);
        return new ModelAndView("redirect:/indexPelisGenero.htm");
    }
    
    @RequestMapping(value="editarPelisGenero.htm",method=RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        datos=pelisGeneroBL.buscar(id);
        mav.addObject("editPelisGenero",datos);
        datos=peliculaBL.listar();
        mav.addObject("lsPelicula", datos);
        datos=generoBL.listar();
        mav.addObject("lsGeneros", datos);
        mav.setViewName("editarPelisGenero");
        return mav;
    }
    
     @RequestMapping(value="editarPelisGenero.htm",method=RequestMethod.POST)
    public ModelAndView Editar(PelisGenero pg)
    {
        pelisGeneroBL.actualizar(pg);
        return new ModelAndView("redirect:/indexPelisGenero.htm");
    }
    
    @RequestMapping("deletePelisGenero.htm")
    public ModelAndView Delete(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        pelisGeneroBL.eliminar(id);
        return new ModelAndView("redirect:/indexpelisGenero.htm"); 
    }     
}
