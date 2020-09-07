/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.SerieBL;
import Business.GeneroBL;
import Business.TemporadaBL;
import Model.Serie;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author User
 */
public class SerieController {
 ModelAndView mav=new ModelAndView();
    SerieBL serieBL=new SerieBL();
    TemporadaBL temporadaBL= new TemporadaBL();
    GeneroBL generoBL= new GeneroBL();
    int id;
    List datos;
    
    @RequestMapping ("indexSerie.htm")
    public ModelAndView Listar(){
    datos=serieBL.listar();
    mav.addObject("lsSerie",datos);
    mav.setViewName("indexSerie");
    return mav;
    }
    
    @RequestMapping(value="agregarSerie.htm",method=RequestMethod.GET)
    public ModelAndView Agregar(){
        mav.addObject(new Serie());
        datos = temporadaBL.listar();
        mav.addObject("lsTemporadas", datos);
        datos = generoBL.listar();
        mav.addObject("lsGeneros", datos);
        mav.setViewName("agregarSerie");
        return mav;
    } 
    @RequestMapping(value="agregarSerie.htm",method=RequestMethod.POST)
    public ModelAndView Agregar(Serie t){        
        serieBL.insertar(t);
        return new ModelAndView("redirect:/indexSerie.htm");
    }
    
    @RequestMapping(value="editarSerie.htm",method=RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        datos=serieBL.buscar(id);
        mav.addObject("editSerie",datos);
        datos=temporadaBL.listar();
        mav.addObject("lsTemporadas", datos);
        datos=generoBL.listar();
        mav.addObject("lsGeneros", datos);
        mav.setViewName("editarSerie");
        return mav;
    }
    
     @RequestMapping(value="editarSerie.htm",method=RequestMethod.POST)
    public ModelAndView Editar(Serie s)
    {
        serieBL.actualizar(s);
        return new ModelAndView("redirect:/indexSerie.htm");
    }
    
    @RequestMapping("deleteSerie.htm")
    public ModelAndView Delete(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        serieBL.eliminar(id);
        return new ModelAndView("redirect:/indexSerie.htm"); 
    }      
}
