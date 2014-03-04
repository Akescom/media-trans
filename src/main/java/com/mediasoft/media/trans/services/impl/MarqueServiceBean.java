/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.services.impl;

import com.mediasoft.media.trans.dao.BaseDAOBeanLocal;
import com.mediasoft.media.trans.dao.MarqueDaoBeanLocal;
import com.mediasoft.media.trans.entites.Marque;
import com.mediasoft.media.trans.services.MarqueServiceBeanLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author MANU
 */
@Stateless
public class MarqueServiceBean extends BaseServiceBean<Marque,Integer> implements MarqueServiceBeanLocal {

    @EJB
    private MarqueDaoBeanLocal marqueDao;
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    protected BaseDAOBeanLocal<Marque, Integer> getDAO() {
        return this.marqueDao;
    }

}
