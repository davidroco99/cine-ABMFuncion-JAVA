
package com.programacion2.cine.logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DavidRoco
 */

public class ExpertoABMFuncion {
    ControladoraLogica controla = ControladoraLogica.getInstance();
    
    
    public ExpertoABMFuncion() {
    }

    public void crearFuncion(DTOFuncion dtoFuncion) {
        Funcion funcion = new Funcion();
        //FECHA
        funcion.setFecha(dtoFuncion.getFecha());
        //FIN FECHA
        //HORARIO
        funcion.setHorario(dtoFuncion.getHorario());
        //FIN HORARIO
        //SALA
        String nombreSala = dtoFuncion.getNombreSala();
        ArrayList<DTOSala> salas = new ArrayList<DTOSala>();
        Sala sala = new Sala();
        
        salas = (ArrayList<DTOSala>) controla.traerSalas();
        
        for(DTOSala dtoSala: salas){
            if(nombreSala.equals(dtoSala.getNombreSala())){
                sala.setNroSala(Integer.parseInt(dtoSala.getNroSala()));
                sala.setNombreSala(nombreSala);
                sala.setCantAsientos(Integer.parseInt(dtoSala.getAsientosPorFila()));
                sala.setAsientosPorFila(Integer.parseInt(dtoSala.getAsientosPorFila()));
                sala.setFilas(dtoSala.getFilas());                
            }
        }
        
        funcion.setSala(sala);
        //FIN SALA
        
        //PELICULA
        String nombrePelicula = dtoFuncion.getNombrePelicula();
        ArrayList<DTOPelicula> peliculas = new ArrayList<DTOPelicula>();
        Pelicula pelicula = new Pelicula();
        
        peliculas = (ArrayList<DTOPelicula>) controla.traerPeliculas();
        
        for(DTOPelicula dtoPelicula: peliculas){
            if(nombrePelicula.equals(dtoPelicula.getTitulo())){
                pelicula.setIdPelicula(Integer.parseInt(dtoPelicula.getIdPelicula()));
                pelicula.setTitulo(dtoPelicula.getTitulo());
                pelicula.setDirector(dtoPelicula.getDirector());
                pelicula.setElenco(String.valueOf(dtoPelicula.getElenco()));
                pelicula.setDuracion(Integer.parseInt(dtoPelicula.getDuracion()));
                pelicula.setGenero(dtoPelicula.getGenero());        
                pelicula.setFechaAlta(dtoPelicula.getFechaAlta());
                pelicula.setFechaBaja(dtoPelicula.getFechaBaja());
        
            }
        }
        
        funcion.setPelicula(pelicula);
        //FIN PELICULA
        
        //PRECIO ENTRADA
        
        funcion.setPrecioEntradas(Float.parseFloat(dtoFuncion.getPrecioEntradas()));
        
        //FIN PRECIO ENTRADA
        
        //EstadoFuncion
        String nombreEstado = dtoFuncion.getNombreEstado();
        ArrayList<DTOEstadoFuncion> estados = new ArrayList<>();
        EstadoFuncion estado = new EstadoFuncion();
        
        estados = (ArrayList<DTOEstadoFuncion>) controla.traerEstadosFuncion();
        
        for(DTOEstadoFuncion dtoEstado: estados){
            if(nombreEstado.equals(dtoEstado.getNombreEstadoFuncion())){
                estado.setIdEstadoFuncion(Integer.parseInt(dtoEstado.getIdEstadoFuncion()));
                estado.setNombreEstadoFunción(dtoEstado.getNombreEstadoFuncion());
            }
        }
        funcion.setEstado(estado);
        //FIN ESTADOFUNCION
        
        System.out.println("==================================");
        System.out.println("======ExpertoCrearFuncion=========");
        System.out.println(funcion.toString());
        System.out.println("==================================");
        
        controla.guardadFuncion(funcion);
        
        crearEntradas(funcion);
        
    }

    public List<DTOFuncion> traerFunciones() {
       List<Funcion> listFunciones = controla.traerFunciones();
       ArrayList<DTOFuncion> listaDTOFuncion = new ArrayList<>();
                   
       int index = 0;
       
       //relleno la lista de DTOFuncion
       
       for (Funcion funcion: listFunciones){
           DTOFuncion dtoFuncion = new DTOFuncion();
           
           String idFuncion = String.valueOf(funcion.getIdFuncion());
           dtoFuncion.setIdFuncion(idFuncion);
                      
           Date fecha = funcion.getFecha();
           dtoFuncion.setFecha(fecha);
           
           String horario = funcion.getHorario();
           dtoFuncion.setHorario(horario);
           
           String nombreSala = funcion.getSala().getNombreSala();
           dtoFuncion.setNombreSala(nombreSala);
           
           String nombrePelicula = funcion.getPelicula().getTitulo();
           dtoFuncion.setNombrePelicula(nombrePelicula);
           
           String nombreEstado = funcion.getEstado().getNombreEstadoFuncion();
           dtoFuncion.setNombreEstado(nombreEstado);
           
           String precio = String.valueOf(funcion.getPrecioEntradas());
           dtoFuncion.setPrecioEntradas(precio);
           
           listaDTOFuncion.add(index, dtoFuncion);
           index += 1;
       } 
        
       return listaDTOFuncion; 
        
     
    }

    public void borrarFuncion(int idFuncion) {
           
            controla.borrarFuncion(idFuncion);
    }

    public void editarEstado(DTOFuncion dtoFuncion) {
        int idFuncion = Integer.parseInt(dtoFuncion.getIdFuncion());
        Funcion funcion = controla.buscarFuncion(idFuncion);
        
        ArrayList<DTOEstadoFuncion> estados = new ArrayList<>();
        EstadoFuncion estado = new EstadoFuncion();
        String estadoAbuscar = dtoFuncion.getNombreEstado();
        
         
        estados = (ArrayList<DTOEstadoFuncion>) controla.traerEstadosFuncion();
        
        for(DTOEstadoFuncion dtoEstado: estados){
            if(estadoAbuscar.equals(dtoEstado.getNombreEstadoFuncion())){
                estado.setIdEstadoFuncion(Integer.parseInt(dtoEstado.getIdEstadoFuncion()));
                estado.setNombreEstadoFunción(dtoEstado.getNombreEstadoFuncion());
            }
        }
        funcion.setEstado(estado);
                     
        controla.editarFuncion(funcion);
    }

    public DTOFuncion buscarDTOFuncion(int idFuncion) {
       
        Funcion funcion = controla.buscarFuncion(idFuncion);
        DTOFuncion dtoFuncion = new DTOFuncion();
        
        dtoFuncion.setIdFuncion(String.valueOf(funcion.getIdFuncion()));
        dtoFuncion.setFecha(funcion.getFecha());
        dtoFuncion.setHorario(funcion.getHorario());
        dtoFuncion.setCantidadRecaudada(String.valueOf(funcion.getCantidadRecaudada()));
        dtoFuncion.setPrecioEntradas(String.valueOf(funcion.getPrecioEntradas()));
        dtoFuncion.setCantidadRecaudada(String.valueOf(funcion.getCantidadRecaudada()));
        dtoFuncion.setNombrePelicula(funcion.getPelicula().getTitulo());
        dtoFuncion.setNombreSala(funcion.getSala().getNombreSala());
        dtoFuncion.setNombreEstado(funcion.getEstado().getNombreEstadoFuncion());
 
 
 
        return dtoFuncion;
        
    }

    public void editarPelicula(DTOFuncion dtoFuncion) {
        int idFuncion = Integer.parseInt(dtoFuncion.getIdFuncion());
        Funcion funcion = controla.buscarFuncion(idFuncion);
        
        ArrayList<DTOPelicula> peliculas = new ArrayList<>();
        Pelicula pelicula = new Pelicula();
        String peliculaAbuscar = dtoFuncion.getNombrePelicula();
        
         
        peliculas = (ArrayList<DTOPelicula>) controla.traerPeliculas();
        
        for(DTOPelicula dtoPelicula: peliculas){
            if(peliculaAbuscar.equals(dtoPelicula.getTitulo())){
                pelicula.setIdPelicula(Integer.parseInt(dtoPelicula.getIdPelicula()));
                pelicula.setTitulo(dtoPelicula.getTitulo());
                pelicula.setDirector(dtoPelicula.getDirector());
                pelicula.setDuracion(Integer.parseInt(dtoPelicula.getDuracion()));
                pelicula.setElenco(dtoPelicula.getElenco());
                pelicula.setGenero(dtoPelicula.getGenero());
                pelicula.setFechaAlta(dtoPelicula.getFechaAlta());
                pelicula.setFechaBaja(dtoPelicula.getFechaBaja());
            }
        }
        
        funcion.setPelicula(pelicula);
                     
        controla.editarFuncion(funcion);
    }

    public void editarSala(DTOFuncion dtoFuncion) {
        int idFuncion = Integer.parseInt(dtoFuncion.getIdFuncion());
        Funcion funcion = controla.buscarFuncion(idFuncion);
        
        ArrayList<DTOSala> salas = new ArrayList<>();
        Sala sala = new Sala();
        String salaAbuscar = dtoFuncion.getNombreSala();
               
        salas = (ArrayList<DTOSala>)controla.traerSalas();
               
        for(DTOSala dtoSala: salas){
            if(salaAbuscar.equals(dtoSala.getNombreSala())){
                sala.setNroSala(Integer.parseInt(dtoSala.getNroSala()));
                sala.setNombreSala(dtoSala.getNombreSala());
                sala.setCantAsientos(Integer.parseInt(dtoSala.getCantAsientos()));
                sala.setAsientosPorFila(Integer.parseInt(dtoSala.getAsientosPorFila()));
                sala.setFilas(dtoSala.getFilas());
                               
            }
        }
        
        funcion.setSala(sala);
                     
        controla.editarFuncion(funcion);     
        
    }

    public void editarFechaHorarioPrecio(DTOFuncion dtoFuncion) {
        int idFuncion = Integer.parseInt(dtoFuncion.getIdFuncion());
        Funcion funcion = controla.buscarFuncion(idFuncion);
        
        funcion.setFecha(dtoFuncion.getFecha());
        funcion.setPrecioEntradas(Float.parseFloat(dtoFuncion.getPrecioEntradas()));
        funcion.setHorario(dtoFuncion.getHorario());
        
        controla.editarFuncion(funcion);
    }

    private void crearEntradas(Funcion funcion) {
        Sala sala= funcion.getSala();
        int j= sala.getFilas().length();
        int k= sala.getAsientosPorFila();
        String filaLetras = sala.getFilas();
        
        for(int fila = 0; fila < j; fila++){
            for(int Asiento = 1; Asiento <= k; Asiento++){
                
                Entrada entrada = new Entrada();
                
                entrada.setFila(filaLetras.charAt(fila));
                entrada.setNroAsiento(Asiento);
                entrada.setVendida(false);
                entrada.setFuncion(funcion);
                
                controla.crearEntrada(entrada);
                
                System.out.println("Crear Entrada: NumeroEntrada");
                System.out.println("Fila: "+filaLetras.charAt(fila)+" Asiento:"+Asiento);
                
                
            }
            
        }
                       
    }

    public List<DTOEntrada> traerDTOEntradas(String idFuncion) {
       
        int idFuncion1 = Integer.parseInt(idFuncion);
        Funcion funcion = controla.buscarFuncion(idFuncion1);
        ArrayList<DTOEntrada> listaDTOEntradas = new ArrayList<>();
        ArrayList<Entrada> todasLasEntradas = new ArrayList<>();
        
        todasLasEntradas = (ArrayList<Entrada>)controla.traerEntradas();
        System.out.println("==============experto de vuelta del método===============================");
        int index = 0;
        
        for (Entrada entrada: todasLasEntradas){
            
            if (String.valueOf(entrada.getFuncion().getIdFuncion()).equals(String.valueOf(funcion.getIdFuncion()))){
                DTOEntrada dtoEntrada = new DTOEntrada();
                
                dtoEntrada.setIdFuncion(String.valueOf((char) funcion.getIdFuncion()));
                dtoEntrada.setNroEntrada(String.valueOf(entrada.getNroEntrada()));
                dtoEntrada.setPrecioEntradaConDescuento(String.valueOf(entrada.getPrecioEntradaConDescuento()));
                dtoEntrada.setFila(String.valueOf(entrada.getFila()));
                dtoEntrada.setNroAsiento(String.valueOf(entrada.getNroAsiento()));
                dtoEntrada.setVendida(entrada.isVendida());
                if (String.valueOf(entrada.getDescuento()).equals(String.valueOf("null"))){
                    dtoEntrada.setNombreDescuento("null");
                    }else{
                    dtoEntrada.setNombreDescuento(String.valueOf(entrada.getDescuento().getNombreDescuento()));
                }
                
                
                System.out.println("========================================");
                System.out.println(dtoEntrada.toString());
                listaDTOEntradas.add(index,dtoEntrada);
                index+=1;
            }
            
        }
             
        
        
        return listaDTOEntradas;
    }

    
}
