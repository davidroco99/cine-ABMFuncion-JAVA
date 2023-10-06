
package com.programacion2.cine.logica;

/**
 *
 * @author DavidRoco
 */
public class DTOEntrada {
    private String nroEntrada;
    private String precioEntradaConDescuento;
    private String nroAsiento;
    private String fila;
    private boolean vendida;
    private String nombreDescuento;
    private String idFuncion;

    public DTOEntrada() {
    }

    public DTOEntrada(String nroEntrada, String precioEntradaConDescuento, String nroAsiento, String fila, boolean vendida, String nombreDescuento, String idFuncion) {
        this.nroEntrada = nroEntrada;
        this.precioEntradaConDescuento = precioEntradaConDescuento;
        this.nroAsiento = nroAsiento;
        this.fila = fila;
        this.vendida = vendida;
        this.nombreDescuento = nombreDescuento;
        this.idFuncion = idFuncion;
    }

    public String getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(String nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public String getPrecioEntradaConDescuento() {
        return precioEntradaConDescuento;
    }

    public void setPrecioEntradaConDescuento(String precioEntradaConDescuento) {
        this.precioEntradaConDescuento = precioEntradaConDescuento;
    }

    public String getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(String nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public boolean isVendida() {
        return vendida;
    }

    public void setVendida(boolean vendida) {
        this.vendida = vendida;
    }

    public String getNombreDescuento() {
        return nombreDescuento;
    }

    public void setNombreDescuento(String nombreDescuento) {
        this.nombreDescuento = nombreDescuento;
    }

    public String getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(String idFuncion) {
        this.idFuncion = idFuncion;
    }

    @Override
    public String toString() {
        return "DTOEntrada{" + "nroEntrada=" + nroEntrada + ", precioEntradaConDescuento=" + precioEntradaConDescuento + ", nroAsiento=" + nroAsiento + ", fila=" + fila + ", vendida=" + vendida + ", nombreDescuento=" + nombreDescuento + ", idFuncion=" + idFuncion + '}';
    }
    
    
    
}
