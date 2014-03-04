/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.entites;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.validation.constraints.NotNull;

/**
 *
 * @author MANU
 */
@Embeddable
public class TypevehiculetypepieceId implements Serializable{
    
    @NotNull
    @Column(name = "IdTypeVehicule")
    private int idTypeVehicule;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdTypePiece")
    private int idTypePiece;

    public TypevehiculetypepieceId() {
    }
    
    

    public TypevehiculetypepieceId(int idTypeVehicule, int idTypePiece) {
        this.idTypeVehicule = idTypeVehicule;
        this.idTypePiece = idTypePiece;
    }

    public int getIdTypeVehicule() {
        return idTypeVehicule;
    }

    public void setIdTypeVehicule(int idTypeVehicule) {
        this.idTypeVehicule = idTypeVehicule;
    }

    public int getIdTypePiece() {
        return idTypePiece;
    }

    public void setIdTypePiece(int idTypePiece) {
        this.idTypePiece = idTypePiece;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final TypevehiculetypepieceId other = (TypevehiculetypepieceId) obj;
        return true;
    }

    @Override
    public String toString() {
        return "TypevehiculetypepieceId{" + "idTypeVehicule=" + idTypeVehicule + ", idTypePiece=" + idTypePiece + '}';
    }
    
    
}
