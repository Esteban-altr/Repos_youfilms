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
public class Anime {
    
    
    private int id;
    private String Nombre;
    private String Ano;
    private int CantidadTemporadas;
    private String linkImg;
    private int IdGenero;
    private int IdTemporada;

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

    public String getAno() {
        return Ano;
    }

    public void setAno(String Ano) {
        this.Ano = Ano;
    }

    public int getCantidadTemporadas() {
        return CantidadTemporadas;
    }

    public void setCantidadTemporadas(int CantidadTemporadas) {
        this.CantidadTemporadas = CantidadTemporadas;
    }

    public int getIdGenero() {
        return IdGenero;
    }

    public void setIdGenero(int IdGenero) {
        this.IdGenero = IdGenero;
    }

    public int getIdTemporada() {
        return IdTemporada;
    }

    public void setIdTemporada(int IdTemporada) {
        this.IdTemporada = IdTemporada;
    }

    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }
}
