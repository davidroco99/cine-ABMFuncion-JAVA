
package com.programacion2.cine.persistencia;

import com.programacion2.cine.logica.Descuento;
import com.programacion2.cine.logica.Entrada;
import com.programacion2.cine.logica.EstadoFuncion;
import com.programacion2.cine.logica.Funcion;
import com.programacion2.cine.logica.Pelicula;
import com.programacion2.cine.logica.Sala;
import com.programacion2.cine.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DavidRoco
 */
public class ControladoraPersistencia {
    private static ControladoraPersistencia instance = null;
     SalaJpaController salaJPA = new SalaJpaController();
     DescuentoJpaController descuentoJPA = new DescuentoJpaController();
     EstadoFuncionJpaController estadoFuncionJPA = new EstadoFuncionJpaController();
     PeliculaJpaController peliculaJPA = new PeliculaJpaController();
     FuncionJpaController funcionJPA = new FuncionJpaController();
     EntradaJpaController entradaJPA = new EntradaJpaController();
     
    public ControladoraPersistencia() {
    }
    public static ControladoraPersistencia getInstance() {
        if (instance == null) {
            instance = new ControladoraPersistencia();
        }
        return instance;
    }

    public void guardarSala(Sala sala) {
        salaJPA.create(sala);        
    }

    public List<Sala> buscarSalas() {
        List <Sala> listaSalas = salaJPA.findSalaEntities();
        return listaSalas;
    }

    public void borrarSala(int nroSala) {
        try {
            salaJPA.destroy(nroSala);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Sala buscar(int nroSala) {
        return salaJPA.findSala(nroSala);
    }

    public void editarSala(Sala sala) {
        try {
            salaJPA.edit(sala);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guardarDescuento(Descuento descuento) {
       descuentoJPA.create(descuento);
    }

    public List<Descuento> buscarDescuentos() {
       List <Descuento> listaDescuentos = descuentoJPA.findDescuentoEntities();
       return listaDescuentos;
    }

    public Descuento buscarDescuento(int nroDescuento) {
       return descuentoJPA.findDescuento(nroDescuento);
    }

    public void editarDescuento(Descuento descuento) throws Exception {
       try {
        descuentoJPA.edit(descuento);
         } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarDescuento(int nroDescuento) {
        try {
            descuentoJPA.destroy(nroDescuento);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guardarEstadoFuncion(EstadoFuncion estado) {
        estadoFuncionJPA.create(estado);
    }

    public EstadoFuncion buscarEstadoFuncion(int idEstado) {
        return estadoFuncionJPA.findEstadoFuncion(idEstado);
    }

    public List<EstadoFuncion> buscarEstados() {
        List<EstadoFuncion> listaEstados = estadoFuncionJPA.findEstadoFuncionEntities();
        return listaEstados;
    }

    public void borrarEstadoFuncion(int idEstadoFuncion) throws NonexistentEntityException {
        try {
        estadoFuncionJPA.destroy(idEstadoFuncion);
       } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    public void editarFuncionEstado(EstadoFuncion estado) {
        try {
            estadoFuncionJPA.edit(estado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guardarPelicula(Pelicula pelicula) {
        peliculaJPA.create(pelicula);
    }

    public List<Pelicula> buscarPeliculas() {
        try {
            List<Pelicula> listPeliculas = peliculaJPA.findPeliculaEntities();
            return listPeliculas;
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            List<Pelicula> listPeliculas = null;
            return listPeliculas;
        }
                
    }

    public Pelicula buscarPelicula(int idPelicula) {
        return peliculaJPA.findPelicula(idPelicula);
    }

    public void editarPelicula(Pelicula pelicula) {
        try {
            peliculaJPA.edit(pelicula);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarPelicula(int idPelicula) {
        try {
            peliculaJPA.destroy(idPelicula);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guardarFuncion(Funcion funcion) {
        funcionJPA.create(funcion);
    }

    public List<Funcion> buscarFunciones() {
        List<Funcion> listaFunciones = funcionJPA.findFuncionEntities();
        return listaFunciones;
    }

    public void borrarFuncion(int idFuncion) {
        try {
            funcionJPA.destroy(idFuncion);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarFuncion(Funcion funcion) {
        try {
            funcionJPA.edit(funcion);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Funcion buscarFuncion(int idFuncion) {
        return funcionJPA.findFuncion(idFuncion);
    }

    public void guardarEntrada(Entrada entrada) {
        entradaJPA.create(entrada);
    }

    public List<Entrada> traerEntradas() {
        List<Entrada> listaEntradas = entradaJPA.findEntradaEntities();
        return listaEntradas;
    }

   
}
