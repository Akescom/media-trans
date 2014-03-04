/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.services.impl;

import com.mediasoft.media.trans.dao.BaseDAOBeanLocal;
import com.mediasoft.media.trans.dao.VehiculeDAOBeanLocal;
import com.mediasoft.media.trans.entites.Vehicule;
import com.mediasoft.media.trans.services.VehiculeServiceBeanLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author MANU
 */
@Stateless
public class VehiculeServiceBean extends BaseServiceBean<Vehicule,String> implements VehiculeServiceBeanLocal {

    @EJB
    private VehiculeDAOBeanLocal vehiculeDAO;
    
    @Override
    protected BaseDAOBeanLocal<Vehicule, String> getDAO() {
              return this.vehiculeDAO;
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
