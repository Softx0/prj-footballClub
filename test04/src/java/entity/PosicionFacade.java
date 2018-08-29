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
public class PosicionFacade extends AbstractFacade<Posicion> {

    @PersistenceContext(unitName = "test04PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PosicionFacade() {
        super(Posicion.class);
    }

    //Metodo para las consultas flexibles
    public List<Posicion> filtrarPosiciones(String cadena) {

        Query query = em.createNativeQuery("SELECT `posicion`.`Id`,\n"
                + "    `posicion`.`Nombre`,\n"
                + "    `posicion`.`Descripcion`\n"
                + "FROM `fifabd`.`posicion`\n"
                + "WHERE Nombre LIKE '%" + cadena + "%';", Posicion.class);

        List<Posicion> listaFiltrada = query.getResultList();
        return listaFiltrada;
    }



}
