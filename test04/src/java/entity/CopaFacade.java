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
public class CopaFacade extends AbstractFacade<Copa> {

    @PersistenceContext(unitName = "test04PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CopaFacade() {
        super(Copa.class);
    }

    public List<Copa> filtrarPosiciones(String cadena) {

        Query query = em.createNativeQuery("SELECT `copa`.`Id`,\n"
                + "    `copa`.`Descripcion`,\n"
                + "    `copa`.`Fecha`,\n"
                + "    `copa`.`Sede`\n"
                + "FROM `fifabd`.`copa`\n"
                + "WHERE Descripcion LIKE '%"+cadena+"%';", Copa.class);

        List<Copa> listaFiltrada = query.getResultList();
        return listaFiltrada;
    }

}
