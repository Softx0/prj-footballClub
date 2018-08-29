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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "copa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Copa.findAll", query = "SELECT c FROM Copa c")
    , @NamedQuery(name = "Copa.findById", query = "SELECT c FROM Copa c WHERE c.id = :id")
    , @NamedQuery(name = "Copa.findByDescripcion", query = "SELECT c FROM Copa c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "Copa.findByFecha", query = "SELECT c FROM Copa c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Copa.findBySede", query = "SELECT c FROM Copa c WHERE c.sede = :sede")})
public class Copa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Size(max = 150)
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "Sede")
    private Integer sede;

    public Copa() {
    }

    public Copa(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getSede() {
        return sede;
    }

    public void setSede(Integer sede) {
        this.sede = sede;
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
        if (!(object instanceof Copa)) {
            return false;
        }
        Copa other = (Copa) object;
        return ((this.getId() == other.getId()));
    }

    @Override
    public String toString() {
        return descripcion;
    }

}
