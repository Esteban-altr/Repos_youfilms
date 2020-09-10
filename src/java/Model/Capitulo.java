/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Usuario
 */
public class Capitulo {
    private int id;
    private int NumeroCapitulo;
    private String Nombre;
    private int IdTemporada;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroCapitulo() {
        return NumeroCapitulo;
    }

    public void setNumeroCapitulo(int NumeroCapitulo) {
        this.NumeroCapitulo = NumeroCapitulo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getIdTemporada() {
        return IdTemporada;
    }

    public void setIdTemporada(int IdTemporada) {
        this.IdTemporada = IdTemporada;
    }
}
