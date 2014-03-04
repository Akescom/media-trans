/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.web.beans;

import com.mediasoft.media.trans.entites.Typepiece;
import com.mediasoft.media.trans.services.TypepieceServiceBeanLocal;
import java.util.ArrayList;
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
public class TypepieceBean {
    
    @EJB
    private TypepieceServiceBeanLocal typepieceService;
    private List<Typepiece> typepieces;
    private Typepiece typepiece;
    private Typepiece SelTypepiece;
    private Boolean activer = true;
    private MessageBean messageBean;
    
    public List<Typepiece> getTypepieces() {
        return typepieces;
    }
    
    public void setTypepieces(List<Typepiece> typepieces) {
        this.typepieces = typepieces;
    }
    
    public Typepiece getSelTypepiece() {
        return SelTypepiece;
    }
    
    public void setSelTypepiece(Typepiece SelTypepiece) {
        this.SelTypepiece = SelTypepiece;
    }

    /**
     * Creates a new instance of TypepieceBean
     */
    public TypepieceBean() {
        this.typepiece = new Typepiece();
        this.SelTypepiece = new Typepiece();
    }
    
    public Typepiece getTypepiece() {
        return typepiece;
    }
    
    public void setTypepiece(Typepiece typepiece) {
        this.typepiece = typepiece;
    }
    
    public Boolean getActiver() {
        return activer;
    }
    
    public void setActiver(Boolean activer) {
        this.activer = activer;
    }
    
    public void active() {
        activer = false;
    }
    
    public void enregistrer() {
        int k = 0;
        List<Typepiece> ts;
        ts = new ArrayList<Typepiece>();
        for (Typepiece typ : ts) {
            if (typ.getLibTypePiece().equalsIgnoreCase(this.typepiece.getLibTypePiece())) {
                k++;
            }
        }
        
        if (k == 0) {
            
            this.typepieceService.ajouter(typepiece);
            messageBean = new MessageBean();
            messageBean.addMessage("Enregistrement effectué ");
            
        } else {
            messageBean = new MessageBean();
            messageBean.addMessageInfo("cet enregistrement  existe déja");
        }
    }
    
    public void modifier() {
             if (SelTypepiece.getLibTypePiece().equalsIgnoreCase("")) {
            messageBean = new MessageBean();
            messageBean.addMessageInfo("renseigner le libelle");
        } else {
            this.typepieceService.modifier(SelTypepiece);
        }
        
    }

    public void supprimer() {
        this.typepieceService.supprimer(SelTypepiece.getIdTypepiece());
    }
    
    public void annuler() {
        
    }
}
