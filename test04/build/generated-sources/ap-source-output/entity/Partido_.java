package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-28T15:43:09")
@StaticMetamodel(Partido.class)
public class Partido_ { 

    public static volatile SingularAttribute<Partido, Date> fecha;
    public static volatile SingularAttribute<Partido, Integer> cantPuntosEquipo2;
    public static volatile SingularAttribute<Partido, Integer> fKArbitro;
    public static volatile SingularAttribute<Partido, Integer> fKEtapa;
    public static volatile SingularAttribute<Partido, Integer> id;
    public static volatile SingularAttribute<Partido, Integer> cantPuntosEquipo1;
    public static volatile SingularAttribute<Partido, Integer> fKEquipo1;
    public static volatile SingularAttribute<Partido, Integer> fKCopa;
    public static volatile SingularAttribute<Partido, Integer> descalificado;
    public static volatile SingularAttribute<Partido, Integer> fKEquipo2;
    public static volatile SingularAttribute<Partido, Integer> fKEstado;

}