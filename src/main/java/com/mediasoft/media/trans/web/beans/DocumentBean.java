/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.web.beans;

import com.mediasoft.media.trans.entites.Document;
import com.mediasoft.media.trans.entites.Typedocument;
import com.mediasoft.media.trans.entites.Vehicule;
import com.mediasoft.media.trans.services.DocumentServiceBeanLocal;
import com.mediasoft.media.trans.services.TypeDocumentServiceBeanLocal;
import com.mediasoft.media.trans.services.VehiculeServiceBeanLocal;
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
public class DocumentBean {
    
    @EJB
    private DocumentServiceBeanLocal documentService;
    private List<Document> documents;
    private Document document;
    
    @EJB
    private TypeDocumentServiceBeanLocal  typeDocumentService;
    private List<Typedocument> typedocuments;
    private Integer idTypeDoc;
    
    @EJB
    private VehiculeServiceBeanLocal vehiculeService;
    private List<Vehicule> vehicules;
    private Integer immatriculation;
    
    
    /**
     * Creates a new instance of DocumentBean
     */
    
    public DocumentBean() {
        
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public List<Typedocument> getTypedocuments() {
        return typedocuments;
    }

    public void setTypedocuments(List<Typedocument> typedocuments) {
        this.typedocuments = typedocuments;
    }

    public Integer getIdTypeDoc() {
        return idTypeDoc;
    }

    public void setIdTypeDoc(Integer idTypeDoc) {
        this.idTypeDoc = idTypeDoc;
    }

    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    public void setVehicules(List<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }

    public Integer getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(Integer immatriculation) {
        this.immatriculation = immatriculation;
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
