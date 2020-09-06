/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.TemporadaBL;
import Model.Temporada;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author User
 */
public class TemporadaController {
 ModelAndView mav=new ModelAndView();
    TemporadaBL temporadaBL=new TemporadaBL();
    int id;
    List datos;
    
    @RequestMapping ("indexTemporada.htm")
    public ModelAndView Listar(){
    datos=temporadaBL.listar();
    mav.addObject("lsTemporada",datos);
    mav.setViewName("indexTemporada");
    return mav;
    }
    
    @RequestMapping(value="agregarTemporada.htm",method=RequestMethod.GET)
    public ModelAndView Agregar(){
        mav.addObject(new Temporada());
        mav.setViewName("agregarTemporada");
        return mav;
    } 
    @RequestMapping(value="agregarTemporada.htm",method=RequestMethod.POST)
    public ModelAndView Agregar(Temporada t){        
        temporadaBL.insertar(t);
        return new ModelAndView("redirect:/indexTemporada.htm");
    }
    
    @RequestMapping(value="editarTemporada.htm",method=RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        datos=temporadaBL.buscar(id);
        mav.addObject("temporada",datos);
        mav.setViewName("editarTemporada");
        return mav;
    }
    
     @RequestMapping(value="editarTemporada.htm",method=RequestMethod.POST)
    public ModelAndView Editar(Temporada t)
    {
        temporadaBL.actualizar(t);
        return new ModelAndView("redirect:/indexTemporada.htm");
    }
    
    @RequestMapping("deleteTemporada.htm")
    public ModelAndView Delete(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        temporadaBL.eliminar(id);
        return new ModelAndView("redirect:/indexTemporada.htm"); 
    }     
}
