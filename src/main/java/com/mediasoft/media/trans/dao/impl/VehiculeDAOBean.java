/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.dao.impl;

import com.mediasoft.media.trans.dao.VehiculeDAOBeanLocal;
import com.mediasoft.media.trans.entites.Vehicule;
import javax.ejb.Stateless;

/**
 *
 * @author MANU
 */
@Stateless
public class VehiculeDAOBean extends BaseDAOBean<Vehicule,String> implements VehiculeDAOBeanLocal {

    public VehiculeDAOBean() {
        super(Vehicule.class);
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
