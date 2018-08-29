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
public class EstadoFacade extends AbstractFacade<Estado> {

    @PersistenceContext(unitName = "test04PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstadoFacade() {
        super(Estado.class);
    }

    public List<Estado> filtrarPosiciones(String cadena) {

        Query query = em.createNativeQuery("SELECT `estado`.`Id`,\n"
                + "    `estado`.`Nombre`,\n"
                + "    `estado`.`FK_IdPais`\n"
                + "FROM `fifabd`.`estado`\n"
                + "WHERE Nombre LIKE '%"+cadena+"%';", Estado.class);

        List<Estado> listaFiltrada = query.getResultList();
        return listaFiltrada;
    }

}
