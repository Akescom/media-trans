/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.web.beans;

import com.mediasoft.media.trans.entites.Piece;
import com.mediasoft.media.trans.entites.Typepiece;
import com.mediasoft.media.trans.services.PieceServiceBeanLocal;
import com.mediasoft.media.trans.services.TypepieceServiceBeanLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author MANU
 */
@ManagedBean
@ViewScoped
public class PieceBean {

    @EJB
    private PieceServiceBeanLocal  pieceService;
    private List<Piece> pieces;
    private Piece piece;
    private  Piece selPiece;
    
    @EJB
    private TypepieceServiceBeanLocal typepieceService;
    private List<Typepiece> typepieces;
    private Integer idTypepiece;
    
    
    /**
     * Creates a new instance of PieceBean
     */
    
    public PieceBean() {
        
    }
    
    public void enregistrer(){
        
    }
    
    
    public void modifier(){
        
    } 
    
    public void supprimer(){
        
    }
    
    public void annuler(){
        
    }
}
