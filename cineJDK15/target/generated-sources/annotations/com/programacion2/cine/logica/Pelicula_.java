package com.programacion2.cine.logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-04T19:46:56", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Pelicula.class)
public class Pelicula_ { 

    public static volatile SingularAttribute<Pelicula, Date> fechaBaja;
    public static volatile SingularAttribute<Pelicula, Date> fechaAlta;
    public static volatile SingularAttribute<Pelicula, String> director;
    public static volatile SingularAttribute<Pelicula, String> elenco;
    public static volatile SingularAttribute<Pelicula, String> genero;
    public static volatile SingularAttribute<Pelicula, String> titulo;
    public static volatile SingularAttribute<Pelicula, Integer> duracion;
    public static volatile SingularAttribute<Pelicula, Integer> idPelicula;

}