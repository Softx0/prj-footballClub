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
public class EtapaFacade extends AbstractFacade<Etapa> {

    @PersistenceContext(unitName = "test04PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EtapaFacade() {
        super(Etapa.class);
    }

    public List<Etapa> filtrarPosiciones(String cadena) {

        Query query = em.createNativeQuery("SELECT `etapa`.`Id`,\n"
                + "    `etapa`.`Descripcion`,\n"
                + "    `etapa`.`FK_IdCopa`\n"
                + "FROM `fifabd`.`etapa`\n"
                + "WHERE Descripcion LIKE '%" + cadena + "%';", Etapa.class);

        List<Etapa> listaFiltrada = query.getResultList();
        return listaFiltrada;
    }
}
