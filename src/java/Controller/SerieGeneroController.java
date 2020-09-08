/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.SerieGeneroBL;
import Business.GeneroBL;
import Business.SerieBL;
import Model.SerieGenero;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author User
 */
public class SerieGeneroController {
 ModelAndView mav=new ModelAndView();
    SerieGeneroBL seriegeneroBL=new SerieGeneroBL();
    SerieBL serieBL= new SerieBL();
    GeneroBL generoBL= new GeneroBL();
    int id;
    List datos;
    
    @RequestMapping ("indexSerieGenero.htm")
    public ModelAndView Listar(){
    datos=seriegeneroBL.listar();
    mav.addObject("lsSerieGenero",datos);
    mav.setViewName("indexSerieGenero");
    return mav;
    }
    
    @RequestMapping(value="agregarSerieGenero.htm",method=RequestMethod.GET)
    public ModelAndView Agregar(){
        mav.addObject(new SerieGenero());
        datos = serieBL.listar();
        mav.addObject("lsseries", datos);
        datos = generoBL.listar();
        mav.addObject("lsGeneros", datos);
        mav.setViewName("agregarSerieGenero");
        return mav;
    } 
    @RequestMapping(value="agregarSerieGenero.htm",method=RequestMethod.POST)
    public ModelAndView Agregar(SerieGenero sg){        
        seriegeneroBL.insertar(sg);
        return new ModelAndView("redirect:/indexSerieGenero.htm");
    }
    
    @RequestMapping(value="editarSerieGenero.htm",method=RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        datos=seriegeneroBL.buscar(id);
        mav.addObject("editSerieGenero",datos);
        datos=serieBL.listar();
        mav.addObject("lsSeries", datos);
        datos=generoBL.listar();
        mav.addObject("lsGeneros", datos);
        mav.setViewName("editarSerieGenero");
        return mav;
    }
    
     @RequestMapping(value="editarSerieGenero.htm",method=RequestMethod.POST)
    public ModelAndView Editar(SerieGenero sg)
    {
        seriegeneroBL.actualizar(sg);
        return new ModelAndView("redirect:/indexSerieGenero.htm");
    }
    
    @RequestMapping("deleteSerieGenero.htm")
    public ModelAndView Delete(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        seriegeneroBL.eliminar(id);
        return new ModelAndView("redirect:/indexSerieGenero.htm"); 
    }     
}
