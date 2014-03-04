/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.dao.impl;

import com.mediasoft.media.trans.dao.TypeDocumentDAOBeanLocal;
import com.mediasoft.media.trans.entites.Typedocument;
import javax.ejb.Stateless;

/**
 *
 * @author MANU
 */
@Stateless
public class TypeDocumentDAOBean extends BaseDAOBean<Typedocument,Integer> implements TypeDocumentDAOBeanLocal {

    public TypeDocumentDAOBean() {
        super(Typedocument.class);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
