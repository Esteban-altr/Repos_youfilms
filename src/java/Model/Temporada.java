/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
public class Temporada {
    private int id;
    private String Nombre;
    private int NumeroTemporada;
    private int CantidadCapitulos;
    private String Estacion;
    private String Ano;

    public String getEstacion() {
        return Estacion;
    }

    public void setEstacion(String Estacion) {
        this.Estacion = Estacion;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String Ano) {
        this.Ano = Ano;
    }

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

    public int getNumeroTemporada() {
        return NumeroTemporada;
    }

    public void setNumeroTemporada(int NumeroTemporada) {
        this.NumeroTemporada = NumeroTemporada;
    }

    public int getCantidadCapitulos() {
        return CantidadCapitulos;
    }

    public void setCantidadCapitulos(int CantidadCapitulos) {
        this.CantidadCapitulos = CantidadCapitulos;
    }
    
}
