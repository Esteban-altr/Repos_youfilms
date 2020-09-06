/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.GeneroBL;
import Model.Genero;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author User
 */
public class GeneroController {
 ModelAndView mav=new ModelAndView();
    GeneroBL generoBL=new GeneroBL();
    int id;
    List datos;
    
    @RequestMapping ("indexGenero.htm")
    public ModelAndView Listar(){
    datos=generoBL.listar();
    mav.addObject("lsGenero",datos);
    mav.setViewName("indexGenero");
    return mav;
    }
    
    @RequestMapping(value="agregarGenero.htm",method=RequestMethod.GET)
    public ModelAndView Agregar(){
        mav.addObject(new Genero());
        mav.setViewName("agregarGenero");
        return mav;
    } 
    @RequestMapping(value="agregarGenero.htm",method=RequestMethod.POST)
    public ModelAndView Agregar(Genero g){        
        generoBL.insertar(g);
        return new ModelAndView("redirect:/indexGenero.htm");
    }
    
    @RequestMapping(value="editarGenero.htm",method=RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        datos=generoBL.buscar(id);
        mav.addObject("genero",datos);
        mav.setViewName("editarGenero");
        return mav;
    }
    
     @RequestMapping(value="editarGenero.htm",method=RequestMethod.POST)
    public ModelAndView Editar(Genero g)
    {
        generoBL.actualizar(g);
        return new ModelAndView("redirect:/indexGenero.htm");
    }
    
    @RequestMapping("deleteGenero.htm")
    public ModelAndView Delete(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        generoBL.eliminar(id);
        return new ModelAndView("redirect:/indexGenero.htm"); 
    }   
}
