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
public class PaisFacade extends AbstractFacade<Pais> {

    @PersistenceContext(unitName = "test04PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaisFacade() {
        super(Pais.class);
    }

    public List<Pais> filtrarPosiciones(String cadena) {

        Query query = em.createNativeQuery("SELECT `pais`.`Id`,\n"
                + "    `pais`.`Nombre`\n"
                + "FROM `fifabd`.`pais`\n"
                + "WHERE Nombre LIKE '%"+cadena+"%';", Pais.class);

        List<Pais> listaFiltrada = query.getResultList();
        return listaFiltrada;
    }
}
