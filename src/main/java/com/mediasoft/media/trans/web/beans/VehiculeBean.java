/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.web.beans;

import com.mediasoft.media.trans.entites.Marque;
import com.mediasoft.media.trans.entites.Typevehicule;
import com.mediasoft.media.trans.entites.Vehicule;
import com.mediasoft.media.trans.services.MarqueServiceBeanLocal;
import com.mediasoft.media.trans.services.TypevehiculeServiceBeanLocal;
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
public class VehiculeBean {
     
    @EJB
    private VehiculeServiceBeanLocal vehiculeService;
    private List<Vehicule> vehicules;
    private Vehicule vehicule;
    private Vehicule selVehicule;
    
    
    @EJB
    private MarqueServiceBeanLocal  marqueService;
    private List<Marque> marques;
    private Integer idMarque;
    
    @EJB
    private TypevehiculeServiceBeanLocal typevehiculeService;
    private List<Typevehicule> typevehicules;
    private Integer idTypevehivule;
    
    /**
     * Creates a new instance of VehiculeBean
     */
    public VehiculeBean() {
    }
    
}
