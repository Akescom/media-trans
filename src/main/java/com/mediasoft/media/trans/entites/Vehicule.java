/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.entites;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author MANU
 */
@Entity
@Table(name = "vehicule")
public class Vehicule extends BaseEntity {
    
    @Id
    @Column(name = "Immatriculation")
    private String immatriculation;
    @Column(name = "DateMiseEnCirculation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateMiseEnCirculation;
    @Column(name = "DateAquisition")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAquisition;
    @Column(name = "NbrePlace")
    private Integer nbrePlace;
    @Column(name = "poidsAvide")
    private Float poidsAvide;
    @Column(name = "longUtile")
    private Float longUtile;
    @Column(name = "largUtile")
    private Float largUtile;
    @Column(name = "LongTotale")
    private Float longTotale;
    @Column(name = "LargTotale")
    private Float largTotale;
    @Column(name = "HautTotale")
    private Float hautTotale;
    @Column(name = "HautIntAvt")
    private Float hautIntAvt;
    @Column(name = "HautIntArriere")
    private Float hautIntArriere;
   
    @Column(name = "Essieux")
    private String essieux;
   
    @Column(name = "Photo")
    private Byte photo;
    
    @Column(name = "Etat")
    private String etat;
    @Column(name = "Empattement")
    private Float empattement;
    
    @JoinColumn(name = "idMarque", referencedColumnName = "idMarque")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Marque idMarque;
    
    
    @JoinColumn(name = "idTypeVehicule",referencedColumnName = "idTypeVehicule",nullable = true)
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    private Typevehicule idTypeVehicule;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "Immatriculation",fetch = FetchType.LAZY)
    private List<Piece> pieces;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "Immatriculation",fetch = FetchType.LAZY)
    private List<Document> documents;
    
    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public Date getDateMiseEnCirculation() {
        return dateMiseEnCirculation;
    }

    public void setDateMiseEnCirculation(Date dateMiseEnCirculation) {
        this.dateMiseEnCirculation = dateMiseEnCirculation;
    }

    public Date getDateAquisition() {
        return dateAquisition;
    }

    public void setDateAquisition(Date dateAquisition) {
        this.dateAquisition = dateAquisition;
    }

    public Integer getNbrePlace() {
        return nbrePlace;
    }

    public void setNbrePlace(Integer nbrePlace) {
        this.nbrePlace = nbrePlace;
    }

    public Float getPoidsAvide() {
        return poidsAvide;
    }

    public void setPoidsAvide(Float poidsAvide) {
        this.poidsAvide = poidsAvide;
    }

    public Float getLongUtile() {
        return longUtile;
    }

    public void setLongUtile(Float longUtile) {
        this.longUtile = longUtile;
    }

    public Float getLargUtile() {
        return largUtile;
    }

    public void setLargUtile(Float largUtile) {
        this.largUtile = largUtile;
    }

    public Float getLongTotale() {
        return longTotale;
    }

    public void setLongTotale(Float longTotale) {
        this.longTotale = longTotale;
    }

    public Float getLargTotale() {
        return largTotale;
    }

    public void setLargTotale(Float largTotale) {
        this.largTotale = largTotale;
    }

    public Float getHautTotale() {
        return hautTotale;
    }

    public void setHautTotale(Float hautTotale) {
        this.hautTotale = hautTotale;
    }

    public Float getHautIntAvt() {
        return hautIntAvt;
    }

    public void setHautIntAvt(Float hautIntAvt) {
        this.hautIntAvt = hautIntAvt;
    }

    public Float getHautIntArriere() {
        return hautIntArriere;
    }

    public void setHautIntArriere(Float hautIntArriere) {
        this.hautIntArriere = hautIntArriere;
    }

    public String getEssieux() {
        return essieux;
    }

    public void setEssieux(String essieux) {
        this.essieux = essieux;
    }


    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Float getEmpattement() {
        return empattement;
    }

    public void setEmpattement(Float empattement) {
        this.empattement = empattement;
    }

    public Marque getIdMarque() {
        return idMarque;
    }

    public void setIdMarque(Marque idMarque) {
        this.idMarque = idMarque;
    }

    public Typevehicule getIdTypeVehicule() {
        return idTypeVehicule;
    }

    public void setIdTypeVehicule(Typevehicule idTypeVehicule) {
        this.idTypeVehicule = idTypeVehicule;
    }

    public Byte getPhoto() {
        return photo;
    }

    public void setPhoto(Byte photo) {
        this.photo = photo;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
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
        final Vehicule other = (Vehicule) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Vehicule{" + "immatriculation=" + immatriculation + ", dateMiseEnCirculation=" + dateMiseEnCirculation + ", dateAquisition=" + dateAquisition + ", nbrePlace=" + nbrePlace + ", poidsAvide=" + poidsAvide + ", longUtile=" + longUtile + ", largUtile=" + largUtile + ", longTotale=" + longTotale + ", largTotale=" + largTotale + ", hautTotale=" + hautTotale + ", hautIntAvt=" + hautIntAvt + ", hautIntArriere=" + hautIntArriere + ", essieux=" + essieux + ", photo=" + photo + ", etat=" + etat + ", empattement=" + empattement + ", idMarque=" + idMarque + ", idTypeVehicule=" + idTypeVehicule + ", pieces=" + pieces + ", documents=" + documents + '}';
    }
    
    
    
}
