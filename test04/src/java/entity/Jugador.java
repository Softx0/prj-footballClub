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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "jugador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jugador.findAll", query = "SELECT j FROM Jugador j")
    , @NamedQuery(name = "Jugador.findByCedula", query = "SELECT j FROM Jugador j WHERE j.cedula = :cedula")
    , @NamedQuery(name = "Jugador.findByNombre", query = "SELECT j FROM Jugador j WHERE j.nombre = :nombre")
    , @NamedQuery(name = "Jugador.findByApellido", query = "SELECT j FROM Jugador j WHERE j.apellido = :apellido")
    , @NamedQuery(name = "Jugador.findByFechaNacimiento", query = "SELECT j FROM Jugador j WHERE j.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Jugador.findByNoCamiseta", query = "SELECT j FROM Jugador j WHERE j.noCamiseta = :noCamiseta")
    , @NamedQuery(name = "Jugador.findByAltura", query = "SELECT j FROM Jugador j WHERE j.altura = :altura")
    , @NamedQuery(name = "Jugador.findByPeso", query = "SELECT j FROM Jugador j WHERE j.peso = :peso")
    , @NamedQuery(name = "Jugador.findByDebut", query = "SELECT j FROM Jugador j WHERE j.debut = :debut")
    , @NamedQuery(name = "Jugador.findByEstado", query = "SELECT j FROM Jugador j WHERE j.estado = :estado")
    , @NamedQuery(name = "Jugador.findByFKIdEquipo", query = "SELECT j FROM Jugador j WHERE j.fKIdEquipo = :fKIdEquipo")
    , @NamedQuery(name = "Jugador.findByFKNacionalidad", query = "SELECT j FROM Jugador j WHERE j.fKNacionalidad = :fKNacionalidad")
    , @NamedQuery(name = "Jugador.findByFKIdPosicion", query = "SELECT j FROM Jugador j WHERE j.fKIdPosicion = :fKIdPosicion")})
public class Jugador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "Cedula")
    private String cedula;
    @Size(max = 50)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "FechaNacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "NoCamiseta")
    private Integer noCamiseta;
    @Column(name = "Altura")
    private Long altura;
    @Column(name = "Peso")
    private Long peso;
    @Column(name = "Debut")
    @Temporal(TemporalType.DATE)
    private Date debut;
    @Column(name = "Estado")
    private Boolean estado;
    @Column(name = "FK_IdEquipo")
    private Integer fKIdEquipo;
    @Column(name = "FK_Nacionalidad")
    private Integer fKNacionalidad;
    @Column(name = "FK_IdPosicion")
    private Integer fKIdPosicion;

    public Jugador() {
    }

    public Jugador(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getNoCamiseta() {
        return noCamiseta;
    }

    public void setNoCamiseta(Integer noCamiseta) {
        this.noCamiseta = noCamiseta;
    }

    public Long getAltura() {
        return altura;
    }

    public void setAltura(Long altura) {
        this.altura = altura;
    }

    public Long getPeso() {
        return peso;
    }

    public void setPeso(Long peso) {
        this.peso = peso;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getFKIdEquipo() {
        return fKIdEquipo;
    }

    public void setFKIdEquipo(Integer fKIdEquipo) {
        this.fKIdEquipo = fKIdEquipo;
    }

    public Integer getFKNacionalidad() {
        return fKNacionalidad;
    }

    public void setFKNacionalidad(Integer fKNacionalidad) {
        this.fKNacionalidad = fKNacionalidad;
    }

    public Integer getFKIdPosicion() {
        return fKIdPosicion;
    }

    public void setFKIdPosicion(Integer fKIdPosicion) {
        this.fKIdPosicion = fKIdPosicion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedula != null ? cedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jugador)) {
            return false;
        }
        Jugador other = (Jugador) object;
        if ((this.cedula == null && other.cedula != null) || (this.cedula != null && !this.cedula.equals(other.cedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
