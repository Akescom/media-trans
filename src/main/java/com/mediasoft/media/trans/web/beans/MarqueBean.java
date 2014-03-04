/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.web.beans;

import com.mediasoft.media.trans.entites.Marque;
import com.mediasoft.media.trans.services.MarqueServiceBeanLocal;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author MANU
 */
@ManagedBean
@ViewScoped
public class MarqueBean implements Serializable {

    @EJB
    private MarqueServiceBeanLocal marqueService;
    private List<Marque> marques;
    private Marque marque;
    private Marque selMarque;
    private Boolean activer = true;
    private MessageBean messageBean;

    @PostConstruct
    public void init() {
        this.marques = new ArrayList<Marque>();
        this.marques = marqueService.selectionnerTout();
    }

    /**
     * Creates a new instance of MarqueBean
     */
    public MarqueBean() {
        this.marque = new Marque();

    }

    public List<Marque> getMarques() {

        return marques;
    }

    public void setMarques(List<Marque> marques) {
        this.marques = marques;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public Marque getSelMarque() {
        return selMarque;
    }

    public void setSelMarque(Marque selMarque) {
        this.selMarque = selMarque;
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
        List<Marque> ms = new ArrayList<Marque>();
        ms = marqueService.selectionnerTout();

        for (Marque mark : ms) {
            if (mark.getLibMarque().equalsIgnoreCase(this.marque.getLibMarque())) {
                k++;
            }
        }
        
        if (k == 0) {

            this.marqueService.ajouter(marque);
            messageBean = new MessageBean();
            messageBean.addMessage("Enregistrement effectué ");

        } else {
            messageBean = new MessageBean();
            messageBean.addMessageInfo("cet enregistrement  existe déja");
        }

    }

    public void modifier() {
        if (selMarque.getLibMarque().equalsIgnoreCase("")) {
            messageBean = new MessageBean();
            messageBean.addMessageInfo("renseigner le libelle");
        } else {
            this.marqueService.modifier(selMarque);
        }
    }

    public void Annuler() {
        
    }

    public void supprimer() {
        this.marqueService.supprimer(selMarque.getIdMarque());
    }
    
}
