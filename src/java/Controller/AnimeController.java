/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.AnimeBL;
import Business.GeneroBL;
import Business.TemporadaBL;
import Model.Anime;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author User
 */
public class AnimeController {
 ModelAndView mav=new ModelAndView();
    AnimeBL animeBL=new AnimeBL();
    TemporadaBL temporadaBL= new TemporadaBL();
    GeneroBL generoBL= new GeneroBL();
    int id;
    List datos;
    
    @RequestMapping ("indexAnime.htm")
    public ModelAndView Listar(){
    datos=animeBL.listar();
    mav.addObject("lsAnime",datos);
    mav.setViewName("indexAnime");
    return mav;
    }
    
    @RequestMapping(value="agregarAnime.htm",method=RequestMethod.GET)
    public ModelAndView Agregar(){
        mav.addObject(new Anime());
        datos = temporadaBL.listar();
        mav.addObject("lsTemporadas", datos);
        datos = generoBL.listar();
        mav.addObject("lsGeneros", datos);
        mav.setViewName("agregarAnime");
        return mav;
    } 
    @RequestMapping(value="agregarAnime.htm",method=RequestMethod.POST)
    public ModelAndView Agregar(Anime t){        
        animeBL.insertar(t);
        return new ModelAndView("redirect:/indexAnime.htm");
    }
    
    @RequestMapping(value="editarAnime.htm",method=RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        datos=animeBL.buscar(id);
        mav.addObject("editAnime",datos);
        datos=temporadaBL.listar();
        mav.addObject("lsTemporadas", datos);
        datos=generoBL.listar();
        mav.addObject("lsGeneros", datos);
        mav.setViewName("editarAnime");
        return mav;
    }
    
     @RequestMapping(value="editarAnime.htm",method=RequestMethod.POST)
    public ModelAndView Editar(Anime a)
    {
        animeBL.actualizar(a);
        return new ModelAndView("redirect:/indexAnime.htm");
    }
    
    @RequestMapping("deleteAnime.htm")
    public ModelAndView Delete(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        animeBL.eliminar(id);
        return new ModelAndView("redirect:/indexAnime.htm"); 
    }     
}
