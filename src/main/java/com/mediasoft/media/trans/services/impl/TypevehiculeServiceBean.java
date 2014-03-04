/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.services.impl;

import com.mediasoft.media.trans.dao.BaseDAOBeanLocal;
import com.mediasoft.media.trans.dao.TypevehiculeDAOBeanLocal;
import com.mediasoft.media.trans.entites.Typevehicule;
import com.mediasoft.media.trans.services.TypevehiculeServiceBeanLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author MANU
 */
@Stateless
public class TypevehiculeServiceBean extends BaseServiceBean<Typevehicule,Integer> implements TypevehiculeServiceBeanLocal {

    @EJB
    private TypevehiculeDAOBeanLocal typevehiculeDAO;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    protected BaseDAOBeanLocal<Typevehicule, Integer> getDAO() {
        return this.typevehiculeDAO;
    }

}
