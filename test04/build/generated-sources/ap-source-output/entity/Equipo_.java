package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-28T15:43:09")
@StaticMetamodel(Equipo.class)
public class Equipo_ { 

    public static volatile SingularAttribute<Equipo, Integer> fKIdCoach;
    public static volatile SingularAttribute<Equipo, String> dueno;
    public static volatile SingularAttribute<Equipo, Boolean> estado;
    public static volatile SingularAttribute<Equipo, byte[]> escudo;
    public static volatile SingularAttribute<Equipo, Date> fechaCreacion;
    public static volatile SingularAttribute<Equipo, Integer> cantJugadores;
    public static volatile SingularAttribute<Equipo, Integer> id;
    public static volatile SingularAttribute<Equipo, Integer> copasGanadas;
    public static volatile SingularAttribute<Equipo, String> nombre;

}