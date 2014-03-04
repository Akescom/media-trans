/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.services.impl;

import com.mediasoft.media.trans.dao.BaseDAOBeanLocal;
import com.mediasoft.media.trans.dao.TypevehiculetypepieceDAOBeanLocal;
import com.mediasoft.media.trans.entites.Typevehiculetypepiece;
import com.mediasoft.media.trans.entites.TypevehiculetypepieceId;
import com.mediasoft.media.trans.services.TypevehiculetypepieceServiceBeanLocal;
import java.util.Collection;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author MANU
 */
@Stateless
public class TypevehiculetypepieceServiceBean extends BaseServiceBean<Typevehiculetypepiece,TypevehiculetypepieceId> implements TypevehiculetypepieceServiceBeanLocal {

    @EJB
    private TypevehiculetypepieceDAOBeanLocal  typevehiculetypepieceDAO;
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    protected BaseDAOBeanLocal<Typevehiculetypepiece, TypevehiculetypepieceId> getDAO() {
        return this.typevehiculetypepieceDAO;
    }

}
