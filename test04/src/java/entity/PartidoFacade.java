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
public class PartidoFacade extends AbstractFacade<Partido> {

    @PersistenceContext(unitName = "test04PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PartidoFacade() {
        super(Partido.class);
    }

    public List<Partido> filtrarPosiciones(String cadena) {

        Query query = em.createNativeQuery("SELECT `partido`.`Id`,\n"
                + "    `partido`.`Fecha`,\n"
                + "    `partido`.`CantPuntosEquipo1`,\n"
                + "    `partido`.`CantPuntosEquipo2`,\n"
                + "    `partido`.`Descalificado`,\n"
                + "    `partido`.`FK_Equipo1`,\n"
                + "    `partido`.`FK_Equipo2`,\n"
                + "    `partido`.`FK_Arbitro`,\n"
                + "    `partido`.`FK_Copa`,\n"
                + "    `partido`.`FK_Estado`,\n"
                + "    `partido`.`FK_Etapa`\n"
                + "FROM `fifabd`.`partido`\n"
                + "WHERE Fecha LIKE '%"+cadena+"%';", Partido.class);

        List<Partido> listaFiltrada = query.getResultList();
        return listaFiltrada;
    }

}
