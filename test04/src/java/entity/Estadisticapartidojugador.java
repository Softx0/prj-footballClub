/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "estadisticapartidojugador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estadisticapartidojugador.findAll", query = "SELECT e FROM Estadisticapartidojugador e")
    , @NamedQuery(name = "Estadisticapartidojugador.findById", query = "SELECT e FROM Estadisticapartidojugador e WHERE e.id = :id")
    , @NamedQuery(name = "Estadisticapartidojugador.findByFKIdJugador", query = "SELECT e FROM Estadisticapartidojugador e WHERE e.fKIdJugador = :fKIdJugador")
    , @NamedQuery(name = "Estadisticapartidojugador.findByFKIdPartido", query = "SELECT e FROM Estadisticapartidojugador e WHERE e.fKIdPartido = :fKIdPartido")
    , @NamedQuery(name = "Estadisticapartidojugador.findByGolesAFavor", query = "SELECT e FROM Estadisticapartidojugador e WHERE e.golesAFavor = :golesAFavor")
    , @NamedQuery(name = "Estadisticapartidojugador.findByTarjetasAmarilla", query = "SELECT e FROM Estadisticapartidojugador e WHERE e.tarjetasAmarilla = :tarjetasAmarilla")
    , @NamedQuery(name = "Estadisticapartidojugador.findByTarjetaRoja", query = "SELECT e FROM Estadisticapartidojugador e WHERE e.tarjetaRoja = :tarjetaRoja")
    , @NamedQuery(name = "Estadisticapartidojugador.findByBalonesRecuperados", query = "SELECT e FROM Estadisticapartidojugador e WHERE e.balonesRecuperados = :balonesRecuperados")
    , @NamedQuery(name = "Estadisticapartidojugador.findByBalonesPerdidos", query = "SELECT e FROM Estadisticapartidojugador e WHERE e.balonesPerdidos = :balonesPerdidos")
    , @NamedQuery(name = "Estadisticapartidojugador.findByFaltasRecibidas", query = "SELECT e FROM Estadisticapartidojugador e WHERE e.faltasRecibidas = :faltasRecibidas")})
public class Estadisticapartidojugador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "FKIdJugador")
    private Integer fKIdJugador;
    @Column(name = "FKIdPartido")
    private Integer fKIdPartido;
    @Column(name = "GolesAFavor")
    private Integer golesAFavor;
    @Column(name = "TarjetasAmarilla")
    private Integer tarjetasAmarilla;
    @Column(name = "TarjetaRoja")
    private Integer tarjetaRoja;
    @Column(name = "BalonesRecuperados")
    private Integer balonesRecuperados;
    @Column(name = "BalonesPerdidos")
    private Integer balonesPerdidos;
    @Column(name = "FaltasRecibidas")
    private Integer faltasRecibidas;

    public Estadisticapartidojugador() {
    }

    public Estadisticapartidojugador(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFKIdJugador() {
        return fKIdJugador;
    }

    public void setFKIdJugador(Integer fKIdJugador) {
        this.fKIdJugador = fKIdJugador;
    }

    public Integer getFKIdPartido() {
        return fKIdPartido;
    }

    public void setFKIdPartido(Integer fKIdPartido) {
        this.fKIdPartido = fKIdPartido;
    }

    public Integer getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(Integer golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public Integer getTarjetasAmarilla() {
        return tarjetasAmarilla;
    }

    public void setTarjetasAmarilla(Integer tarjetasAmarilla) {
        this.tarjetasAmarilla = tarjetasAmarilla;
    }

    public Integer getTarjetaRoja() {
        return tarjetaRoja;
    }

    public void setTarjetaRoja(Integer tarjetaRoja) {
        this.tarjetaRoja = tarjetaRoja;
    }

    public Integer getBalonesRecuperados() {
        return balonesRecuperados;
    }

    public void setBalonesRecuperados(Integer balonesRecuperados) {
        this.balonesRecuperados = balonesRecuperados;
    }

    public Integer getBalonesPerdidos() {
        return balonesPerdidos;
    }

    public void setBalonesPerdidos(Integer balonesPerdidos) {
        this.balonesPerdidos = balonesPerdidos;
    }

    public Integer getFaltasRecibidas() {
        return faltasRecibidas;
    }

    public void setFaltasRecibidas(Integer faltasRecibidas) {
        this.faltasRecibidas = faltasRecibidas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadisticapartidojugador)) {
            return false;
        }
        Estadisticapartidojugador other = (Estadisticapartidojugador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Estadisticapartidojugador[ id=" + id + " ]";
    }
    
}
