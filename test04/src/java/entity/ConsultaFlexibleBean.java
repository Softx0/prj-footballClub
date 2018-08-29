/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author DELL
 */
@Named(value = "consultaFlexibleBean")
@SessionScoped
public class ConsultaFlexibleBean implements Serializable {

    /**
     * Creates a new instance of ConsultaFlexibleBean
     */
    private String textoBuscar = null;
    private List<Arbitro> listaArbitros = new ArrayList<>();
    private List<Coach> listaCoach = new ArrayList<>();
    private List<Copa> listaCopa = new ArrayList<>();
    private List<Equipo> listaEquipo = new ArrayList<>();
    private List<Estadisticapartidojugador> listaEstadistica = new ArrayList<>();
    private List<Estado> listaEstado = new ArrayList<>();
    private List<Etapa> listaEtapa = new ArrayList<>();
    private List<Jugador> listaJugador = new ArrayList<>();
    private List<Pais> listaPais = new ArrayList<>();
    private List<Partido> listaPartido = new ArrayList<>();
    private List<Posicion> listaPosiciones = new ArrayList<>();

    @EJB
    private PosicionFacade connPosicion;

    @EJB
    private ArbitroFacade connArbitro;

    @EJB
    private CoachFacade connCoach;

    @EJB
    private CopaFacade connCopa;

    @EJB
    private EquipoFacade connEquipo;

    @EJB
    private EstadisticapartidojugadorFacade connEstadistica;

    @EJB
    private EstadoFacade connEstado;

    @EJB
    private EtapaFacade connEtapa;

    @EJB
    private JugadorFacade connJugador;

    @EJB
    private PaisFacade connPais;

    @EJB
    private PartidoFacade connPartido;

    
    public String getTextoBuscar() {
        return textoBuscar;
    }

    public void setTextoBuscar(String textoBuscar) {
        this.textoBuscar = textoBuscar;
    }

    public List<Arbitro> getListaArbitros() {
        return listaArbitros;
    }

    public void setListaArbitros(List<Arbitro> listaArbitros) {
        this.listaArbitros = listaArbitros;
    }

    public List<Coach> getListaCoach() {
        return listaCoach;
    }

    public void setListaCoach(List<Coach> listaCoach) {
        this.listaCoach = listaCoach;
    }

    public List<Copa> getListaCopa() {
        return listaCopa;
    }

    public void setListaCopa(List<Copa> listaCopa) {
        this.listaCopa = listaCopa;
    }

    public List<Equipo> getListaEquipo() {
        return listaEquipo;
    }

    public void setListaEquipo(List<Equipo> listaEquipo) {
        this.listaEquipo = listaEquipo;
    }

    public List<Estadisticapartidojugador> getListaEstadistica() {
        return listaEstadistica;
    }

    public void setListaEstadistica(List<Estadisticapartidojugador> listaEstadistica) {
        this.listaEstadistica = listaEstadistica;
    }

    public List<Estado> getListaEstado() {
        return listaEstado;
    }

    public void setListaEstado(List<Estado> listaEstado) {
        this.listaEstado = listaEstado;
    }

    public List<Etapa> getListaEtapa() {
        return listaEtapa;
    }

    public void setListaEtapa(List<Etapa> listaEtapa) {
        this.listaEtapa = listaEtapa;
    }

    public List<Jugador> getListaJugador() {
        return listaJugador;
    }

    public void setListaJugador(List<Jugador> listaJugador) {
        this.listaJugador = listaJugador;
    }

    public List<Pais> getListaPais() {
        return listaPais;
    }

    public void setListaPais(List<Pais> listaPais) {
        this.listaPais = listaPais;
    }

    public List<Partido> getListaPartido() {
        return listaPartido;
    }

    public void setListaPartido(List<Partido> listaPartido) {
        this.listaPartido = listaPartido;
    }

    public List<Posicion> getListaPosiciones() {

        return listaPosiciones;
    }

    public void setListaPosiciones(List<Posicion> listaPosiciones) {
        this.listaPosiciones = listaPosiciones;
    }

    public void llenarTablaFiltradaaArbitros() {
        listaArbitros = connArbitro.filtrarPosiciones(textoBuscar);
    }

    public void llenarTablaFiltradaCoach() {
        listaCoach = connCoach.filtrarPosiciones(textoBuscar);
    }

    public void llenarTablaFiltradaCopa() {
        listaCopa = connCopa.filtrarPosiciones(textoBuscar);
    }

    public void llenarTablaFiltradaEquipo() {
        listaEquipo = connEquipo.filtrarPosiciones(textoBuscar);
    }

    public void llenarTablaFiltradaEstadistica() {
        listaEstadistica = connEstadistica.filtrarPosiciones(textoBuscar);
    }

    public void llenarTablaFiltradaEstado() {
        listaEstado = connEstado.filtrarPosiciones(textoBuscar);
    }

    public void llenarTablaFiltradaEtapa() {
        listaEtapa = connEtapa.filtrarPosiciones(textoBuscar);
    }

    public void llenarTablaFiltradaJugador() {
        listaJugador = connJugador.filtrarPosiciones(textoBuscar);
    }

    public void llenarTablaFiltradaPais() {
        listaPais = connPais.filtrarPosiciones(textoBuscar);
    }

    public void llenarTablaFiltradaPartido() {
        listaPartido = connPartido.filtrarPosiciones(textoBuscar);
    }

    public void llenarTablaFiltradaPosiciones() {
        listaPosiciones = connPosicion.filtrarPosiciones(textoBuscar);
    }

    public ConsultaFlexibleBean() {
    }

}
