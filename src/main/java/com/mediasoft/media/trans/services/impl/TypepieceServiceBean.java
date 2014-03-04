/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.services.impl;

import com.mediasoft.media.trans.dao.BaseDAOBeanLocal;
import com.mediasoft.media.trans.dao.TypepieceDAOBeanLocal;
import com.mediasoft.media.trans.entites.Typepiece;
import com.mediasoft.media.trans.services.TypepieceServiceBeanLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author MANU
 */
@Stateless
public class TypepieceServiceBean extends BaseServiceBean<Typepiece,Integer> implements TypepieceServiceBeanLocal {

    @EJB
    private TypepieceDAOBeanLocal typepieceDAO;
    
    @Override
    protected BaseDAOBeanLocal<Typepiece, Integer> getDAO() {
        return this.typepieceDAO;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
