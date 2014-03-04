/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.web.beans;

import com.mediasoft.media.trans.entites.Typevehicule;
import com.mediasoft.media.trans.services.TypevehiculeServiceBeanLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author MANU
 */
public class TypevehiculeBean {
 
    @EJB
    private TypevehiculeServiceBeanLocal typevehiculeService;
    private List<Typevehicule> typevehicules;
    private  Typevehicule   typevehicule;
    private Typevehicule selTypevehicule;
    
     private Boolean activer = true;
    private MessageBean messageBean;
    
    /**
     * Creates a new instance of TypevehiculeBean
     */
    public TypevehiculeBean() {
    
        this.typevehicule=new Typevehicule();
    }

    public List<Typevehicule> getTypevehicules() {
        return typevehicules;
    }

    public void setTypevehicules(List<Typevehicule> typevehicules) {
        this.typevehicules = typevehicules;
    }

    public Typevehicule getTypevehicule() {
        return typevehicule;
    }

    public void setTypevehicule(Typevehicule typevehicule) {
        this.typevehicule = typevehicule;
    }

    public Typevehicule getSelTypevehicule() {
        return selTypevehicule;
    }

    public void setSelTypevehicule(Typevehicule selTypevehicule) {
        this.selTypevehicule = selTypevehicule;
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
    
    
    public void enregistrer(){
        int k=0;
        List<Typevehicule> ts=new ArrayList<Typevehicule>();
        
    }
     
    public void modifier(){
        
    }
     
    public void supprimer(){
        
    }
     
    public void annuler(){
        
    }
}
