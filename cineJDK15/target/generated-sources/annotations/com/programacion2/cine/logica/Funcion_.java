package com.programacion2.cine.logica;

import com.programacion2.cine.logica.EstadoFuncion;
import com.programacion2.cine.logica.Pelicula;
import com.programacion2.cine.logica.Sala;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-04T19:46:56", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Funcion.class)
public class Funcion_ { 

    public static volatile SingularAttribute<Funcion, Date> fecha;
    public static volatile SingularAttribute<Funcion, EstadoFuncion> estado;
    public static volatile SingularAttribute<Funcion, Pelicula> pelicula;
    public static volatile SingularAttribute<Funcion, String> horario;
    public static volatile SingularAttribute<Funcion, Float> cantidadRecaudada;
    public static volatile SingularAttribute<Funcion, Integer> cantidadEntradasVendidas;
    public static volatile SingularAttribute<Funcion, Sala> sala;
    public static volatile SingularAttribute<Funcion, Integer> idFuncion;
    public static volatile SingularAttribute<Funcion, Float> precioEntradas;

}