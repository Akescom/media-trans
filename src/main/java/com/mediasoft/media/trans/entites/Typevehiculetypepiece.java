/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.entites;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author MANU
 */

@Entity
@Table(name = "typevehiculetypepiece")
public class Typevehiculetypepiece extends BaseEntity{

    @EmbeddedId
    protected  TypevehiculetypepieceId id;
    
    @JoinColumn(name = "IdTypePiece", referencedColumnName = "IdTypePiece", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Typepiece typepiece;
    
    @JoinColumn(name = "idTypeVehicule", referencedColumnName = "idTypeVehicule", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Typevehicule typevehicule;

    public Typevehiculetypepiece() {
    }

    public Typevehiculetypepiece(TypevehiculetypepieceId id) {
        this.id = id;
    }

    public Typevehiculetypepiece(Typepiece typepiece, Typevehicule typevehicule) {
        this.typepiece = typepiece;
        this.typevehicule = typevehicule;
    }

    public TypevehiculetypepieceId getId() {
        return id;
    }

    public void setId(TypevehiculetypepieceId id) {
        this.id = id;
    }

    public Typepiece getTypepiece() {
        return typepiece;
    }

    public void setTypepiece(Typepiece typepiece) {
        this.typepiece = typepiece;
    }

    public Typevehicule getTypevehicule() {
        return typevehicule;
    }

    public void setTypevehicule(Typevehicule typevehicule) {
        this.typevehicule = typevehicule;
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
        final Typevehiculetypepiece other = (Typevehiculetypepiece) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Typevehiculetypepiece{" + "id=" + id + ", typepiece=" + typepiece + ", typevehicule=" + typevehicule + '}';
    }
   
    
}
