package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-28T15:43:09")
@StaticMetamodel(Jugador.class)
public class Jugador_ { 

    public static volatile SingularAttribute<Jugador, Integer> fKIdPosicion;
    public static volatile SingularAttribute<Jugador, Date> debut;
    public static volatile SingularAttribute<Jugador, Boolean> estado;
    public static volatile SingularAttribute<Jugador, Date> fechaNacimiento;
    public static volatile SingularAttribute<Jugador, Long> peso;
    public static volatile SingularAttribute<Jugador, Long> altura;
    public static volatile SingularAttribute<Jugador, String> cedula;
    public static volatile SingularAttribute<Jugador, String> apellido;
    public static volatile SingularAttribute<Jugador, Integer> noCamiseta;
    public static volatile SingularAttribute<Jugador, Integer> fKNacionalidad;
    public static volatile SingularAttribute<Jugador, String> nombre;
    public static volatile SingularAttribute<Jugador, Integer> fKIdEquipo;

}