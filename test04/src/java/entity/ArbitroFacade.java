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
public class ArbitroFacade extends AbstractFacade<Arbitro> {

    @PersistenceContext(unitName = "test04PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ArbitroFacade() {
        super(Arbitro.class);
    }

    public List<Arbitro> filtrarPosiciones(String cadena) {

        Query query = em.createNativeQuery("SELECT `arbitro`.`Id`,\n"
                + "    `arbitro`.`Nombre`,\n"
                + "    `arbitro`.`Estado`\n"
                + "FROM `fifabd`.`arbitro`\n"
                + "WHERE Nombre LIKE '%" + cadena + "%';", Arbitro.class);

        List<Arbitro> listaFiltrada = query.getResultList();
        return listaFiltrada;
    }

}
