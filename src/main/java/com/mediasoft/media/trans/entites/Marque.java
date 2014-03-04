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
@Table(name = "marque")
public class Marque extends BaseEntity{
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "idMarque")
   private Integer idMarque;
   
   @Column(name = "libMarque")
   private String libMarque;
   
   @OneToMany(cascade = CascadeType.ALL,mappedBy ="idMarque",fetch = FetchType.LAZY )
   private List<Vehicule> vehicules; 

    public Integer getIdMarque() {
        return idMarque;
    }

    public void setIdMarque(Integer idMarque) {
        this.idMarque = idMarque;
    }

    public String getLibMarque() {
        return libMarque;
    }

    public void setLibMarque(String libMarque) {
        this.libMarque = libMarque;
    }

    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    public void setVehicules(List<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Marque other = (Marque) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Marque{" + "idMarque=" + idMarque + ", libMarque=" + libMarque + ", vehicules=" + vehicules + '}';
    }
  
   
}
