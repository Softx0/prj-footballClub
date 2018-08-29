/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "partido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Partido.findAll", query = "SELECT p FROM Partido p")
    , @NamedQuery(name = "Partido.findById", query = "SELECT p FROM Partido p WHERE p.id = :id")
    , @NamedQuery(name = "Partido.findByFecha", query = "SELECT p FROM Partido p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "Partido.findByCantPuntosEquipo1", query = "SELECT p FROM Partido p WHERE p.cantPuntosEquipo1 = :cantPuntosEquipo1")
    , @NamedQuery(name = "Partido.findByCantPuntosEquipo2", query = "SELECT p FROM Partido p WHERE p.cantPuntosEquipo2 = :cantPuntosEquipo2")
    , @NamedQuery(name = "Partido.findByDescalificado", query = "SELECT p FROM Partido p WHERE p.descalificado = :descalificado")
    , @NamedQuery(name = "Partido.findByFKEquipo1", query = "SELECT p FROM Partido p WHERE p.fKEquipo1 = :fKEquipo1")
    , @NamedQuery(name = "Partido.findByFKEquipo2", query = "SELECT p FROM Partido p WHERE p.fKEquipo2 = :fKEquipo2")
    , @NamedQuery(name = "Partido.findByFKArbitro", query = "SELECT p FROM Partido p WHERE p.fKArbitro = :fKArbitro")
    , @NamedQuery(name = "Partido.findByFKCopa", query = "SELECT p FROM Partido p WHERE p.fKCopa = :fKCopa")
    , @NamedQuery(name = "Partido.findByFKEstado", query = "SELECT p FROM Partido p WHERE p.fKEstado = :fKEstado")
    , @NamedQuery(name = "Partido.findByFKEtapa", query = "SELECT p FROM Partido p WHERE p.fKEtapa = :fKEtapa")})
public class Partido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "CantPuntosEquipo1")
    private Integer cantPuntosEquipo1;
    @Column(name = "CantPuntosEquipo2")
    private Integer cantPuntosEquipo2;
    @Column(name = "Descalificado")
    private Integer descalificado;
    @Column(name = "FK_Equipo1")
    private Integer fKEquipo1;
    @Column(name = "FK_Equipo2")
    private Integer fKEquipo2;
    @Column(name = "FK_Arbitro")
    private Integer fKArbitro;
    @Column(name = "FK_Copa")
    private Integer fKCopa;
    @Column(name = "FK_Estado")
    private Integer fKEstado;
    @Column(name = "FK_Etapa")
    private Integer fKEtapa;

    public Partido() {
    }

    public Partido(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getCantPuntosEquipo1() {
        return cantPuntosEquipo1;
    }

    public void setCantPuntosEquipo1(Integer cantPuntosEquipo1) {
        this.cantPuntosEquipo1 = cantPuntosEquipo1;
    }

    public Integer getCantPuntosEquipo2() {
        return cantPuntosEquipo2;
    }

    public void setCantPuntosEquipo2(Integer cantPuntosEquipo2) {
        this.cantPuntosEquipo2 = cantPuntosEquipo2;
    }

    public Integer getDescalificado() {
        return descalificado;
    }

    public void setDescalificado(Integer descalificado) {
        this.descalificado = descalificado;
    }

    public Integer getFKEquipo1() {
        return fKEquipo1;
    }

    public void setFKEquipo1(Integer fKEquipo1) {
        this.fKEquipo1 = fKEquipo1;
    }

    public Integer getFKEquipo2() {
        return fKEquipo2;
    }

    public void setFKEquipo2(Integer fKEquipo2) {
        this.fKEquipo2 = fKEquipo2;
    }

    public Integer getFKArbitro() {
        return fKArbitro;
    }

    public void setFKArbitro(Integer fKArbitro) {
        this.fKArbitro = fKArbitro;
    }

    public Integer getFKCopa() {
        return fKCopa;
    }

    public void setFKCopa(Integer fKCopa) {
        this.fKCopa = fKCopa;
    }

    public Integer getFKEstado() {
        return fKEstado;
    }

    public void setFKEstado(Integer fKEstado) {
        this.fKEstado = fKEstado;
    }

    public Integer getFKEtapa() {
        return fKEtapa;
    }

    public void setFKEtapa(Integer fKEtapa) {
        this.fKEtapa = fKEtapa;
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
        if (!(object instanceof Partido)) {
            return false;
        }
        Partido other = (Partido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Partido[ id=" + id + " ]";
    }
    
}
