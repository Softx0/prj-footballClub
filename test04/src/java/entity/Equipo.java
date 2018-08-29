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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "equipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipo.findAll", query = "SELECT e FROM Equipo e")
    , @NamedQuery(name = "Equipo.findById", query = "SELECT e FROM Equipo e WHERE e.id = :id")
    , @NamedQuery(name = "Equipo.findByNombre", query = "SELECT e FROM Equipo e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Equipo.findByCantJugadores", query = "SELECT e FROM Equipo e WHERE e.cantJugadores = :cantJugadores")
    , @NamedQuery(name = "Equipo.findByFechaCreacion", query = "SELECT e FROM Equipo e WHERE e.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Equipo.findByDueno", query = "SELECT e FROM Equipo e WHERE e.dueno = :dueno")
    , @NamedQuery(name = "Equipo.findByCopasGanadas", query = "SELECT e FROM Equipo e WHERE e.copasGanadas = :copasGanadas")
    , @NamedQuery(name = "Equipo.findByEstado", query = "SELECT e FROM Equipo e WHERE e.estado = :estado")
    , @NamedQuery(name = "Equipo.findByFKIdCoach", query = "SELECT e FROM Equipo e WHERE e.fKIdCoach = :fKIdCoach")})
public class Equipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Lob
    @Column(name = "Escudo")
    private byte[] escudo;
    @Size(max = 50)
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "CantJugadores")
    private Integer cantJugadores;
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Size(max = 50)
    @Column(name = "Dueno")
    private String dueno;
    @Column(name = "CopasGanadas")
    private Integer copasGanadas;
    @Column(name = "Estado")
    private Boolean estado;
    @Column(name = "FK_IdCoach")
    private Integer fKIdCoach;

    public Equipo() {
    }

    public Equipo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getEscudo() {
        return escudo;
    }

    public void setEscudo(byte[] escudo) {
        this.escudo = escudo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantJugadores() {
        return cantJugadores;
    }

    public void setCantJugadores(Integer cantJugadores) {
        this.cantJugadores = cantJugadores;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public Integer getCopasGanadas() {
        return copasGanadas;
    }

    public void setCopasGanadas(Integer copasGanadas) {
        this.copasGanadas = copasGanadas;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getFKIdCoach() {
        return fKIdCoach;
    }

    public void setFKIdCoach(Integer fKIdCoach) {
        this.fKIdCoach = fKIdCoach;
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
        if (!(object instanceof Equipo)) {
            return false;
        }
        Equipo other = (Equipo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
