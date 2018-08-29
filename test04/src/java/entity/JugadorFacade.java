/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author DELL
 */
@Stateless
public class JugadorFacade extends AbstractFacade<Jugador> {

    @PersistenceContext(unitName = "test04PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JugadorFacade() {
        super(Jugador.class);
    }

    public List<Jugador> filtrarPosiciones(String cadena) {

        Query query = em.createNativeQuery("SELECT `jugador`.`Cedula`,\n"
                + "    `jugador`.`Nombre`,\n"
                + "    `jugador`.`Apellido`,\n"
                + "    `jugador`.`FechaNacimiento`,\n"
                + "    `jugador`.`NoCamiseta`,\n"
                + "    `jugador`.`Altura`,\n"
                + "    `jugador`.`Peso`,\n"
                + "    `jugador`.`Debut`,\n"
                + "    `jugador`.`Estado`,\n"
                + "    `jugador`.`FK_IdEquipo`,\n"
                + "    `jugador`.`FK_Nacionalidad`,\n"
                + "    `jugador`.`FK_IdPosicion`\n"
                + "FROM `fifabd`.`jugador`\n"
                + "WHERE Nombre LIKE '%"+cadena+"%';", Jugador.class);

        List<Jugador> listaFiltrada = query.getResultList();
        return listaFiltrada;
    }

}
