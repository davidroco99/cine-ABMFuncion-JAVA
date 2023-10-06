
package com.programacion2.cine.logica;

import java.util.Date;
/**
 *
 * @author DavidRoco
 */

public class DTOFuncion {
    private String idFuncion;
    private String horario;
    private String cantidadEntradasVendidas;
    private String precioEntradas;
    private String cantidadRecaudada;
    private String nombrePelicula;
    private String nombreSala;
    private String nombreEstado;
    private Date fecha;

    public DTOFuncion(String idFuncion, String horario, String cantidadEntradasVendidas, String precioEntradas, String cantidadRecaudada, String nombrePelicula, String nombreSala, String nombreEstado, Date fecha) {
        this.idFuncion = idFuncion;
        this.horario = horario;
        this.cantidadEntradasVendidas = cantidadEntradasVendidas;
        this.precioEntradas = precioEntradas;
        this.cantidadRecaudada = cantidadRecaudada;
        this.nombrePelicula = nombrePelicula;
        this.nombreSala = nombreSala;
        this.nombreEstado = nombreEstado;
        this.fecha = fecha;
    }

    public DTOFuncion() {
    }

    public String getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(String idFuncion) {
        this.idFuncion = idFuncion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCantidadEntradasVendidas() {
        return cantidadEntradasVendidas;
    }

    public void setCantidadEntradasVendidas(String cantidadEntradasVendidas) {
        this.cantidadEntradasVendidas = cantidadEntradasVendidas;
    }

    public String getPrecioEntradas() {
        return precioEntradas;
    }

    public void setPrecioEntradas(String precioEntradas) {
        this.precioEntradas = precioEntradas;
    }

    public String getCantidadRecaudada() {
        return cantidadRecaudada;
    }

    public void setCantidadRecaudada(String cantidadRecaudada) {
        this.cantidadRecaudada = cantidadRecaudada;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
