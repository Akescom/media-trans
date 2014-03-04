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
@Table(name = "typevehicule")
public class Typevehicule extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTypeVehicule")
    private Integer idTypeVehicule;
   
    @Column(name = "LibTypeVehicule")
    private String libTypeVehicule;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "idTypeVehicule",fetch = FetchType.LAZY)
    private List<Vehicule> vehicules;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "typevehicule",fetch = FetchType.LAZY)
    private List<Typevehiculetypepiece> typevehiculetypepieces;
    
    public Typevehicule() {
    }

    public Integer getIdTypeVehicule() {
        return idTypeVehicule;
    }

    public void setIdTypeVehicule(Integer idTypeVehicule) {
        this.idTypeVehicule = idTypeVehicule;
    }

    public String getLibTypeVehicule() {
        return libTypeVehicule;
    }

    public void setLibTypeVehicule(String libTypeVehicule) {
        this.libTypeVehicule = libTypeVehicule;
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
        final Typevehicule other = (Typevehicule) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Typevehicule{" + "idTypeVehicule=" + idTypeVehicule + ", libTypeVehicule=" + libTypeVehicule + ", vehicules=" + vehicules + '}';
    }
    
   
}
