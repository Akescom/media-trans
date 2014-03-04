/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.web.beans;

import com.mediasoft.media.trans.entites.Typedocument;
import com.mediasoft.media.trans.services.TypeDocumentServiceBeanLocal;
import java.io.Serializable;
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
public class TypeDocumentBean implements Serializable {

    @EJB
    private TypeDocumentServiceBeanLocal typeDocumentService;
    private List<Typedocument> typedocuments;
    private Typedocument typedocument;
    private Typedocument selTypedocument;
    private Boolean activer = true;
    private MessageBean messageBean;

    /**
     * Creates a new instance of TypeDocumentBean
     */
    public TypeDocumentBean() {
        this.typedocument = new Typedocument();
    }

    public List<Typedocument> getTypedocuments() {
        this.typedocuments = new ArrayList<Typedocument>();
        this.typedocuments = typeDocumentService.selectionnerTout();
        return typedocuments;
    }

    public void setTypedocuments(List<Typedocument> typedocuments) {
        this.typedocuments = typedocuments;
    }

    public Typedocument getTypedocument() {
        return typedocument;
    }

    public void setTypedocument(Typedocument typedocument) {
        this.typedocument = typedocument;
    }

    public Typedocument getSelTypedocument() {
        return selTypedocument;
    }

    public void setSelTypedocument(Typedocument selTypedocument) {
        this.selTypedocument = selTypedocument;
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

        List<Typedocument> listdoTypedocuments = new ArrayList<Typedocument>();
        listdoTypedocuments = typeDocumentService.selectionnerTout();
        for (Typedocument typedoc : listdoTypedocuments) {
            if (typedoc.getLibelleTypeDoc().equalsIgnoreCase(this.typedocument.getLibelleTypeDoc())) {
                k++;
            }

        }
        if (k == 0) {

            this.typeDocumentService.ajouter(typedocument);
            messageBean = new MessageBean();
            messageBean.addMessage("Enregistrement effectué ");

        } else {
            messageBean = new MessageBean();
            messageBean.addMessageInfo("cet enregistrement  existe déja");
        }

    }

    public void modifier() {
        this.typeDocumentService.modifier(selTypedocument);
         messageBean = new MessageBean();
         messageBean.addMessage(" effectué ");
    }

    public void supprimer() {
        this.typeDocumentService.supprimer(this.selTypedocument.getIdTypeDoc());
         messageBean = new MessageBean();
        messageBean.addMessage("Enregistrement effectué ");
    }
    
}
