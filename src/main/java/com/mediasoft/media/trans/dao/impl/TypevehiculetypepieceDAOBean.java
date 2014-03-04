/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.dao.impl;

import com.mediasoft.media.trans.dao.TypevehiculetypepieceDAOBeanLocal;
import com.mediasoft.media.trans.entites.Typevehiculetypepiece;
import com.mediasoft.media.trans.entites.TypevehiculetypepieceId;
import javax.ejb.Stateless;

/**
 *
 * @author MANU
 */
@Stateless
public class TypevehiculetypepieceDAOBean extends BaseDAOBean<Typevehiculetypepiece, TypevehiculetypepieceId> implements TypevehiculetypepieceDAOBeanLocal {

    public TypevehiculetypepieceDAOBean() {
        super(Typevehiculetypepiece.class);
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
