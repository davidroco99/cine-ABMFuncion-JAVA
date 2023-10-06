package com.programacion2.cine.logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-04T19:46:56", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Descuento.class)
public class Descuento_ { 

    public static volatile SingularAttribute<Descuento, String> nombreDescuento;
    public static volatile SingularAttribute<Descuento, Integer> idDescuento;
    public static volatile SingularAttribute<Descuento, Float> porcentajeDescuento;
    public static volatile SingularAttribute<Descuento, Date> fechaAltaDescuento;
    public static volatile SingularAttribute<Descuento, Date> fechaBajaDescuento;

}