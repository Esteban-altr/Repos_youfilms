/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**import Model.Genero


/**
 *
 * @author Usuario
 */
public class Pelicula {
    private int id;
    private String Nombre;
    private String año;
    private String Fechalanzamiento;
    private int IdGenero;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getFechalanzamiento() {
        return Fechalanzamiento;
    }

    public void setFechalanzamiento(String Fechalanzamiento) {
        this.Fechalanzamiento = Fechalanzamiento;
    }

    public int getIdGenero() {
        return IdGenero;
    }

    public void setIdGenero(int IdGenero) {
        this.IdGenero = IdGenero;
    }
}
