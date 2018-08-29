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
public class CoachFacade extends AbstractFacade<Coach> {

    @PersistenceContext(unitName = "test04PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CoachFacade() {
        super(Coach.class);
    }

    public List<Coach> filtrarPosiciones(String cadena) {

        Query query = em.createNativeQuery("SELECT `coach`.`Id`,\n"
                + "    `coach`.`Nombre`,\n"
                + "    `coach`.`Estado`\n"
                + "FROM `fifabd`.`coach`\n"
                + "WHERE Nombre LIKE '%"+cadena+"%';", Coach.class);

        List<Coach> listaFiltrada = query.getResultList();
        return listaFiltrada;
    }

}
