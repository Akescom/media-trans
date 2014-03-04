/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.services.impl;

import com.mediasoft.media.trans.dao.BaseDAOBeanLocal;
import com.mediasoft.media.trans.dao.TypeDocumentDAOBeanLocal;
import com.mediasoft.media.trans.entites.Typedocument;
import com.mediasoft.media.trans.services.TypeDocumentServiceBeanLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author MANU
 */
@Stateless
public class TypeDocumentServiceBean extends BaseServiceBean<Typedocument,Integer>implements TypeDocumentServiceBeanLocal {

    @EJB
    private TypeDocumentDAOBeanLocal typeDocumentDAO;
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    protected BaseDAOBeanLocal<Typedocument, Integer> getDAO() {
      return this.typeDocumentDAO;
    }

}
