/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.dao.impl;

import com.mediasoft.media.trans.dao.MarqueDaoBeanLocal;
import com.mediasoft.media.trans.entites.Marque;
import javax.ejb.Stateless;

/**
 *
 * @author MANU
 */
@Stateless
public class MarqueDaoBean extends BaseDAOBean<Marque,Integer>implements MarqueDaoBeanLocal {

    public MarqueDaoBean() {
        super(Marque.class);
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
