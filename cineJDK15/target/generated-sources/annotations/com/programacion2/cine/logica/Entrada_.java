package com.programacion2.cine.logica;

import com.programacion2.cine.logica.Descuento;
import com.programacion2.cine.logica.Funcion;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-04T19:46:56", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Entrada.class)
public class Entrada_ { 

    public static volatile SingularAttribute<Entrada, Integer> nroAsiento;
    public static volatile SingularAttribute<Entrada, Boolean> vendida;
    public static volatile SingularAttribute<Entrada, Descuento> descuento;
    public static volatile SingularAttribute<Entrada, Float> precioEntradaConDescuento;
    public static volatile SingularAttribute<Entrada, Character> fila;
    public static volatile SingularAttribute<Entrada, Integer> nroEntrada;
    public static volatile SingularAttribute<Entrada, Funcion> funcion;

}