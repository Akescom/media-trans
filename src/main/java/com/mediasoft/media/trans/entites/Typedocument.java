/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.entites;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author MANU
 */
@Entity
@Table(name = "typedocument")

public class Typedocument extends BaseEntity{
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTypeDoc")
    private Integer idTypeDoc;
   
    @Column(name = "libelleTypeDoc")
    private String libelleTypeDoc;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTypeDoc", fetch = FetchType.LAZY)
    private List<Document> documents;

    public Typedocument() {
    }

    public Typedocument(Integer idTypeDoc) {
        this.idTypeDoc = idTypeDoc;
    }

    public Integer getIdTypeDoc() {
        return idTypeDoc;
    }

    public void setIdTypeDoc(Integer idTypeDoc) {
        this.idTypeDoc = idTypeDoc;
    }

    public String getLibelleTypeDoc() {
        return libelleTypeDoc;
    }

    public void setLibelleTypeDoc(String libelleTypeDoc) {
        this.libelleTypeDoc = libelleTypeDoc;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Typedocument other = (Typedocument) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Typedocument{" + "idTypeDoc=" + idTypeDoc + ", libelleTypeDoc=" + libelleTypeDoc + ", documents=" + documents + '}';
    }

    
}
