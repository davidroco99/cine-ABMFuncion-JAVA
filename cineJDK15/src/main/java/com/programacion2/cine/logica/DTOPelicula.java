
package com.programacion2.cine.logica;

import java.util.Date;

/**
 *
 * @author DavidRoco
 */
public class DTOPelicula {
    private String idPelicula;
    private String titulo;
    private String director;
    private String elenco;
    private String duracion;
    private String genero;
    private Date fechaAlta = new Date();
    private Date fechaBaja = new Date();

    public DTOPelicula() {
    }

    public DTOPelicula(String idPelicula, String titulo, String director, String elenco, String duracion, String genero) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.director = director;
        this.elenco = elenco;
        this.duracion = duracion;
        this.genero = genero;
    }

    public String getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(String idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    @Override
    public String toString() {
        return "DTOPelicula{" + "idPelicula=" + idPelicula + ", titulo=" + titulo + ", director=" + director + ", elenco=" + elenco + ", duracion=" + duracion + ", genero=" + genero + ", fechaAlta=" + fechaAlta + ", fechaBaja=" + fechaBaja + '}';
    }
              
}
