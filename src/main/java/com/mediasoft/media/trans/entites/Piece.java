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
import javax.validation.constraints.Size;

/**
 *
 * @author MANU
 */

@Entity
@Table(name = "piece")
public class Piece extends BaseEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPiece")
    private Integer idPiece;
    
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "dureeDeVie")
    private Float dureeDeVie;
    
    @Column(name = "kmAlert")
    private Float kmAlert;
    @Column(name = "cout")
    private Float cout;
    @Column(name = "dateEntre")
    @Temporal(TemporalType.DATE)
    private Date dateEntre;
    
    @Column(name = "dateFinUtilisation")
    @Temporal(TemporalType.DATE)
    private Date dateFinUtilisation;
    @Size(max = 254)
    @Column(name = "photo")
    private Byte photo;
    
    @JoinColumn(name = "Immatriculation", referencedColumnName = "Immatriculation")
    @ManyToOne(fetch = FetchType.LAZY)
    private Vehicule immatriculation;
    
    @JoinColumn(name = "idTypepiece",referencedColumnName = "idTypepiece")
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    private Typepiece idTypepiece;
}
