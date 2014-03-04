/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.dao.impl;

import com.mediasoft.media.trans.dao.TypevehiculeDAOBeanLocal;
import com.mediasoft.media.trans.entites.Typevehicule;
import javax.ejb.Stateless;

/**
 *
 * @author MANU
 */
@Stateless
public class TypevehiculeDAOBean extends BaseDAOBean<Typevehicule,Integer> implements TypevehiculeDAOBeanLocal {

    public TypevehiculeDAOBean() {
        super(Typevehicule.class);
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
