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
public class EquipoFacade extends AbstractFacade<Equipo> {

    @PersistenceContext(unitName = "test04PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EquipoFacade() {
        super(Equipo.class);
    }

    public List<Equipo> filtrarPosiciones(String cadena) {

        Query query = em.createNativeQuery("SELECT `equipo`.`Id`,\n"
                + "    `equipo`.`Escudo`,\n"
                + "    `equipo`.`Nombre`,\n"
                + "    `equipo`.`CantJugadores`,\n"
                + "    `equipo`.`FechaCreacion`,\n"
                + "    `equipo`.`Dueno`,\n"
                + "    `equipo`.`CopasGanadas`,\n"
                + "    `equipo`.`Estado`,\n"
                + "    `equipo`.`FK_IdCoach`\n"
                + "FROM `fifabd`.`equipo`\n"
                + "WHERE Nombre LIKE '%"+cadena+"%';", Equipo.class);

        List<Equipo> listaFiltrada = query.getResultList();
        return listaFiltrada;
    }

}
