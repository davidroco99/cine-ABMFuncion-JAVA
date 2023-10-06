package com.programacion2.cine.logica;

/**
 *
 * @author DavidRoco
 */

import java.util.ArrayList;
import java.util.List;
import com.programacion2.cine.persistencia.ControladoraPersistencia;
import com.programacion2.cine.persistencia.exceptions.NonexistentEntityException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraLogica {
    private static ControladoraLogica instance = null;
    
    
    public ControladoraLogica() {
    }
    public static ControladoraLogica getInstance() {
        if (instance == null) {
            instance = new ControladoraLogica();
        }
        return instance;
    }

    public void agregarSala(DTOSala dtoSala) {
        Sala sala = new Sala();
        sala.setNombreSala(dtoSala.getNombreSala());
        sala.setCantAsientos(Integer.parseInt(dtoSala.getCantAsientos()));
        sala.setFilas(dtoSala.getFilas());
        sala.setAsientosPorFila(Integer.parseInt(dtoSala.getAsientosPorFila()));
        
       
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.guardarSala(sala);
        
    }

    public void agregarDescuento(DTODescuento dtoDescuento) {
        Descuento descuento = new Descuento();
        
        descuento.setNombreDescuento(dtoDescuento.getNombreDescuento());
        descuento.setPorcentajeDescuento(Float.parseFloat(dtoDescuento.getPorcentajeDescuento()));
        descuento.setFechaAltaDescuento(dtoDescuento.getFechaAlta());
        descuento.setFechaBajaDescuento(dtoDescuento.getFechaBaja());
        
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.guardarDescuento(descuento);
        
    }
    
    public void agregarEstadoFuncion(DTOEstadoFuncion dtoEstado) {
        EstadoFuncion estado = new EstadoFuncion();
        estado.setNombreEstadoFunción(dtoEstado.getNombreEstadoFuncion());
        
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.guardarEstadoFuncion(estado);
    }
    
    public void agregarPelicula(DTOPelicula dtoPelicula) {
        Pelicula pelicula = new Pelicula();
        pelicula.setTitulo(dtoPelicula.getTitulo());
        pelicula.setDirector(dtoPelicula.getDirector());
        pelicula.setElenco(dtoPelicula.getElenco());
        pelicula.setDuracion(Integer.parseInt(dtoPelicula.getDuracion()));
        pelicula.setGenero(dtoPelicula.getGenero());
        
        pelicula.setFechaAlta(dtoPelicula.getFechaAlta());
        pelicula.setFechaBaja(dtoPelicula.getFechaBaja());
        
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.guardarPelicula(pelicula);
        
    }
   
    public List<DTOSala> traerSalas() {
       ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
       List <Sala> listSala = persistencia.buscarSalas();
       ArrayList <DTOSala> listaDTOSala;
       listaDTOSala = new ArrayList<>();
       int index = 0;
       //relleno la lista de DTOSala       
       for (Sala sala: listSala){
           DTOSala dtoSala = new DTOSala();
           
           String nroSala = String.valueOf(sala.getNroSala());
           dtoSala.setNroSala(nroSala);
           
           String cantidadAsientos = String.valueOf(sala.getCantAsientos());
           dtoSala.setCantAsientos(cantidadAsientos);
           
           String nombreSala = String.valueOf(sala.getNombreSala());
           dtoSala.setNombreSala(nombreSala);
           
           String filas = String.valueOf(sala.getFilas());
           dtoSala.setFilas(filas);
           
           String asientosPorFila = String.valueOf(sala.getAsientosPorFila());
           dtoSala.setAsientosPorFila(asientosPorFila);
           
           listaDTOSala.add(index, dtoSala);
           index += 1;
       } 
        
       return listaDTOSala;
    }

    public List<DTODescuento> traerDescuentos() {
       ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
       List <Descuento> listDescuentos = persistencia.buscarDescuentos();
       ArrayList <DTODescuento> listaDTODescuentos;
       listaDTODescuentos = new ArrayList<>();
       int index = 0;
       //relleno la lista de DTODescuento       
       for (Descuento descuento: listDescuentos){
           DTODescuento dtoDescuento = new DTODescuento();
                     
           String nroDescuento = String.valueOf(descuento.getIdDescuento());
           dtoDescuento.setIdDescuento(nroDescuento);
           
           String nombreDescuento = String.valueOf(descuento.getNombreDescuento());
           dtoDescuento.setNombreDescuento(nombreDescuento);
           
           String porcentajeDescuento = String.valueOf(descuento.getPorcentajeDescuento());
           dtoDescuento.setPorcentajeDescuento(porcentajeDescuento);
           
           dtoDescuento.setFechaAlta(descuento.getFechaAltaDescuento());
           
           dtoDescuento.setFechaBaja(descuento.getFechaBajaDescuento());
           
           listaDTODescuentos.add(index, dtoDescuento);
           index += 1;
       } 
        
       return listaDTODescuentos; 
    }
    
    
    public List<DTOEstadoFuncion> traerEstadosFuncion() {
        
       ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
       
       List <EstadoFuncion> listaEstados = persistencia.buscarEstados();
       ArrayList <DTOEstadoFuncion> listaDTOEstado;
       
       listaDTOEstado = new ArrayList<>();
       
       int index = 0;
       //relleno la lista de DTODescuento       
       
       for (EstadoFuncion estado: listaEstados){
           
           DTOEstadoFuncion dtoEstado = new DTOEstadoFuncion();
                     
           String idEstadoFuncion = String.valueOf(estado.getIdEstadoFuncion());
           dtoEstado.setIdEstadoFuncion(idEstadoFuncion);
           
           String nombreEstado = String.valueOf(estado.getNombreEstadoFuncion());
           dtoEstado.setNombreEstadoFuncion(nombreEstado);
                      
           listaDTOEstado.add(index,dtoEstado);
           index += 1;
       } 
        
       return listaDTOEstado; 
        
    }

    public List<DTOPelicula> traerPeliculas() {
       ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
       
       List <Pelicula> listPeliculas = persistencia.buscarPeliculas();
       
       ArrayList <DTOPelicula> listaDTOPeliculas;
       listaDTOPeliculas = new ArrayList<>();
       int index = 0;
       //relleno la lista de DTOPelicula       
       for (Pelicula pelicula: listPeliculas){
           DTOPelicula dtoPelicula = new DTOPelicula();
                     
           String idPelicula = String.valueOf(pelicula.getIdPelicula());
           dtoPelicula.setIdPelicula(idPelicula);
                      
           String titulo = String.valueOf(pelicula.getTitulo());
           dtoPelicula.setTitulo(titulo);
           
           String director = String.valueOf(pelicula.getDirector());
           dtoPelicula.setDirector(director);
           
           String elenco = String.valueOf(pelicula.getElenco());
           dtoPelicula.setElenco(elenco);
           
           String duracion = String.valueOf(pelicula.getDuracion());
           dtoPelicula.setDuracion(duracion);
           
           String genero = String.valueOf(pelicula.getGenero());
           dtoPelicula.setGenero(genero);
           
           dtoPelicula.setFechaAlta(pelicula.getFechaAlta());
           
           dtoPelicula.setFechaBaja(pelicula.getFechaBaja());
           
           
           listaDTOPeliculas.add(index, dtoPelicula);
           index += 1;
       } 
        
       return listaDTOPeliculas; 
        
        
    }
    
        
    public DTOSala buscarSala(int nroSala) {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        Sala sala = persistencia.buscar(nroSala);
                
        DTOSala dtoSala = new DTOSala();
        
        String nroSala1 = String.valueOf(sala.getNroSala());
        dtoSala.setNroSala(nroSala1);
           
        String cantidadAsientos = String.valueOf(sala.getCantAsientos());
        dtoSala.setCantAsientos(cantidadAsientos);
           
        String nombreSala = String.valueOf(sala.getNombreSala());
        dtoSala.setNombreSala(nombreSala);
          
        String filas = String.valueOf(sala.getFilas());
        dtoSala.setFilas(filas);
           
        String asientosPorFila = String.valueOf(sala.getAsientosPorFila());
        dtoSala.setAsientosPorFila(asientosPorFila);
           
        return dtoSala;
    }
    
    public DTODescuento buscarDescuento(int nroDescuento) {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
       
        Descuento descuento = persistencia.buscarDescuento(nroDescuento);
        
        DTODescuento dtoDescuento = new DTODescuento();
            
        String nroDescuento1 = String.valueOf(descuento.getIdDescuento());
        dtoDescuento.setIdDescuento(nroDescuento1);
           
        String nombreDescuento = String.valueOf(descuento.getNombreDescuento());
        dtoDescuento.setNombreDescuento(nombreDescuento);
           
        String porcentajeDescuento = String.valueOf(descuento.getPorcentajeDescuento());
        dtoDescuento.setPorcentajeDescuento(porcentajeDescuento);
           
        dtoDescuento.setFechaAlta(descuento.getFechaAltaDescuento());
        dtoDescuento.setFechaBaja(descuento.getFechaBajaDescuento());
           
               
    return dtoDescuento; 
    }

     public DTOEstadoFuncion buscarEstadoFuncion(int idEstado) {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        
        EstadoFuncion estado = persistencia.buscarEstadoFuncion(idEstado);
        DTOEstadoFuncion dtoestado = new DTOEstadoFuncion();
        
        String idEstadoFuncion = String.valueOf(estado.getIdEstadoFuncion());
        dtoestado.setIdEstadoFuncion(idEstadoFuncion);
        
        
        String nombreEstado = String.valueOf(estado.getNombreEstadoFuncion());
        dtoestado.setNombreEstadoFuncion(nombreEstado);
        
        return dtoestado;
        
    }
    
    public DTOPelicula buscaPelicula(int idPelicula) {
        
        
        
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
       
        Pelicula pelicula = persistencia.buscarPelicula(idPelicula);
        
                  
        DTOPelicula dtoPelicula = new DTOPelicula();
                     
           String idPelicula1 = String.valueOf(pelicula.getIdPelicula());
           dtoPelicula.setIdPelicula(idPelicula1);
                      
           String titulo = String.valueOf(pelicula.getTitulo());
           dtoPelicula.setTitulo(titulo);
           
           String director = String.valueOf(pelicula.getDirector());
           dtoPelicula.setDirector(director);
           
           String elenco = String.valueOf(pelicula.getElenco());
           dtoPelicula.setElenco(elenco);
           
           String duracion = String.valueOf(pelicula.getDuracion());
           dtoPelicula.setDuracion(duracion);
           
           String genero = String.valueOf(pelicula.getGenero());
           dtoPelicula.setGenero(genero);
           
           dtoPelicula.setFechaAlta(pelicula.getFechaAlta());
           
           dtoPelicula.setFechaBaja(pelicula.getFechaBaja());
               
    return dtoPelicula; 
        
    }
     
    public void editarSala(DTOSala dtoSala) {
        Sala sala = new Sala();
        
        int nroSala = Integer.parseInt(dtoSala.getNroSala());
        sala.setNroSala(nroSala);
           
        int cantidadAsientos = Integer.parseInt(dtoSala.getCantAsientos());
        sala.setCantAsientos(cantidadAsientos);
           
        String nombreSala = String.valueOf(dtoSala.getNombreSala());
        sala.setNombreSala(nombreSala);
          
        String filas = String.valueOf(dtoSala.getFilas());
        sala.setFilas(filas);
           
        int asientosPorFila = Integer.parseInt(dtoSala.getAsientosPorFila());
        sala.setAsientosPorFila(asientosPorFila);
        
        
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.editarSala(sala);
    }

    public void editarDescuento(DTODescuento dtoDescuento) throws Exception {
        Descuento descuento = new Descuento();
        
        descuento.setIdDescuento(Integer.parseInt(dtoDescuento.getIdDescuento()));
        descuento.setNombreDescuento(dtoDescuento.getNombreDescuento());
        descuento.setPorcentajeDescuento(Float.parseFloat(dtoDescuento.getPorcentajeDescuento()));
        descuento.setFechaAltaDescuento(dtoDescuento.getFechaAlta());
        descuento.setFechaBajaDescuento(dtoDescuento.getFechaBaja());
        
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.editarDescuento(descuento);
        
    }

    public void editarEstadoFuncion(DTOEstadoFuncion dtoEstado) {
        EstadoFuncion estado = new EstadoFuncion();
        
        estado.setIdEstadoFuncion(Integer.parseInt(dtoEstado.getIdEstadoFuncion()));
        estado.setNombreEstadoFunción(dtoEstado.getNombreEstadoFuncion());
                
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.editarFuncionEstado(estado);
    }
    
    public void editarPelicula(DTOPelicula dtoPelicula) {
        Pelicula pelicula = new Pelicula();
        pelicula.setIdPelicula(Integer.parseInt(dtoPelicula.getIdPelicula()));
        pelicula.setTitulo(dtoPelicula.getTitulo());
        pelicula.setDirector(dtoPelicula.getDirector());
        pelicula.setElenco(dtoPelicula.getElenco());
        pelicula.setDuracion(Integer.parseInt(dtoPelicula.getDuracion()));
        pelicula.setGenero(dtoPelicula.getGenero());
        
        pelicula.setFechaAlta(dtoPelicula.getFechaAlta());
        pelicula.setFechaBaja(dtoPelicula.getFechaBaja());
        
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.editarPelicula(pelicula);
    }
    
    public void borrarSala(int nroSala) {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.borrarSala(nroSala);
    }

    public void borrarDescuento(int nroDescuento) {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.borrarDescuento(nroDescuento);
    }
    
    public void borrarEstadoFuncion(int idEstadoFuncion)  {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        try {
            persistencia.borrarEstadoFuncion(idEstadoFuncion);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraLogica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarPelicula(int idPelicula) {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.borrarPelicula(idPelicula);
                
    }

    public void bajaPelicula(int idPelicula) {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        Pelicula pelicula = persistencia.buscarPelicula(idPelicula);
        
        Date fechaHoy = new Date();
        pelicula.setFechaBaja(fechaHoy);
        
        persistencia.editarPelicula(pelicula);
        
        
    }

    public void guardadFuncion(Funcion funcion) {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.guardarFuncion(funcion);
    }

    public List<Funcion> traerFunciones() {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        return persistencia.buscarFunciones();
    }

    public void borrarFuncion(int idFuncion) {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.borrarFuncion(idFuncion);
    }

    
    public void editarFuncion(Funcion funcion) {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        
        persistencia.editarFuncion(funcion);
    }

    public Funcion buscarFuncion(int idFuncion) {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        Funcion funcion = persistencia.buscarFuncion(idFuncion);
        return funcion;
    }

    void crearEntrada(Entrada entrada) {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.guardarEntrada(entrada);
    }

    public ArrayList<Entrada> traerEntradas() {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        ArrayList<Entrada> listEntrada = new ArrayList<>();
        
        int index = 0;
        
        List<Entrada> listaEntrada = persistencia.traerEntradas();
        for (Entrada entrada:listaEntrada){
            System.out.println(entrada.toString());
            listEntrada.add(index,entrada);
            index+=1;
        }
        
        
        return listEntrada;
    }
    
}
