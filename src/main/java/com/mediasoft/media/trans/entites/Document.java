/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.entites;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author MANU
 */
@Entity
@Table(name = "document")
public class Document extends BaseEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDoc")
    private Integer idDoc;
    @Column(name = "dateDelivrance")
    @Temporal(TemporalType.DATE)
    private Date dateDelivrance;
    @Column(name = "dateExpiration")
    @Temporal(TemporalType.DATE)
    private Date dateExpiration;
    @Column(name = "rappelExpiration")
    private Integer rappelExpiration;
   
    @Column(name = "cout")
    private Float cout;
    
    @JoinColumn(name = "idTypeDoc", referencedColumnName = "idTypeDoc",nullable = true)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Typedocument idTypeDoc;
    
    @JoinColumn(name = "Immatriculation", referencedColumnName = "Immatriculation",nullable = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private Vehicule immatriculation;

    public Document() {
    }

    public Document(Integer idDoc) {
        this.idDoc = idDoc;
    }

    public Integer getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(Integer idDoc) {
        this.idDoc = idDoc;
    }

    public Date getDateDelivrance() {
        return dateDelivrance;
    }

    public void setDateDelivrance(Date dateDelivrance) {
        this.dateDelivrance = dateDelivrance;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Integer getRappelExpiration() {
        return rappelExpiration;
    }

    public void setRappelExpiration(Integer rappelExpiration) {
        this.rappelExpiration = rappelExpiration;
    }

    public Float getCout() {
        return cout;
    }

    public void setCout(Float cout) {
        this.cout = cout;
    }

    public Typedocument getIdTypeDoc() {
        return idTypeDoc;
    }

    public void setIdTypeDoc(Typedocument idTypeDoc) {
        this.idTypeDoc = idTypeDoc;
    }

    public Vehicule getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(Vehicule immatriculation) {
        this.immatriculation = immatriculation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDoc != null ? idDoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Document)) {
            return false;
        }
        Document other = (Document) object;
        if ((this.idDoc == null && other.idDoc != null) || (this.idDoc != null && !this.idDoc.equals(other.idDoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Document[ idDoc=" + idDoc + " ]";
    }
    
}
