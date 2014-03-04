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
@Table(name = "typepiece")
public class Typepiece  extends BaseEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTypePiece")
    private Integer idTypepiece;
    
    @Column(name = "libTypePiece")
    private String libTypePiece;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "idTypepiece",fetch = FetchType.LAZY)
    List<Piece> pieces;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "typepiece",fetch= FetchType.LAZY)
    List<Typevehiculetypepiece> typevehiculetypepieces;

    public Integer getIdTypepiece() {
        return idTypepiece;
    }

    public void setIdTypepiece(Integer idTypepiece) {
        this.idTypepiece = idTypepiece;
    }

    public String getLibTypePiece() {
        return libTypePiece;
    }

    public void setLibTypePiece(String libTypePiece) {
        this.libTypePiece = libTypePiece;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }

    public List<Typevehiculetypepiece> getTypevehiculetypepieces() {
        return typevehiculetypepieces;
    }

    public void setTypevehiculetypepieces(List<Typevehiculetypepiece> typevehiculetypepieces) {
        this.typevehiculetypepieces = typevehiculetypepieces;
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
        final Typepiece other = (Typepiece) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Typepiece{" + "idTypepiece=" + idTypepiece + ", libTypePiece=" + libTypePiece + ", pieces=" + pieces + ", typevehiculetypepieces=" + typevehiculetypepieces + '}';
    }
    
    
    
}
