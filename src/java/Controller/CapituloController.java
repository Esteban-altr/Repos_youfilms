/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Business.CapituloBL;
import Business.TemporadaBL;
import Model.Capitulo;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author Usuario
 */
public class CapituloController {    
    ModelAndView mav=new ModelAndView();
    CapituloBL capituloBL=new CapituloBL();
    TemporadaBL temporadaBL= new TemporadaBL();
    int id;
    List datos;
    
    @RequestMapping ("indexCapitulo.htm")
    public ModelAndView Listar(){
    datos=capituloBL.listar();
    mav.addObject("lsCapitulo",datos);
    mav.setViewName("indexCapitulo");
    return mav;
    }
    
    @RequestMapping(value="agregarCapitulo.htm",method=RequestMethod.GET)
    public ModelAndView Agregar(){
        mav.addObject(new Capitulo());
        datos = temporadaBL.listar();
        mav.addObject("lsTemporada", datos);
        mav.setViewName("agregarCapitulo");
        return mav;
    } 
    @RequestMapping(value="agregarCapitulo.htm",method=RequestMethod.POST)
    public ModelAndView Agregar(Capitulo c){        
        capituloBL.insertar(c);
        return new ModelAndView("redirect:/indexCapitulo.htm");
    }
    
    @RequestMapping(value="editarCapitulo.htm",method=RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        datos=capituloBL.buscar(id);
        mav.addObject("editCapitulo", datos);
        datos=temporadaBL.listar();
        mav.addObject("lsTemporada", datos);
        mav.setViewName("editarCapitulo");
        return mav;
    }
    
     @RequestMapping(value="editarCapitulo.htm",method=RequestMethod.POST)
    public ModelAndView Editar(Capitulo c)
    {
        capituloBL.actualizar(c);
        return new ModelAndView("redirect:/indexCapitulo.htm");
    }
    
    @RequestMapping("deleteCapitulo.htm")
    public ModelAndView Delete(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        capituloBL.eliminar(id);
        return new ModelAndView("redirect:/indexCapitulo.htm"); 
    }  
}
