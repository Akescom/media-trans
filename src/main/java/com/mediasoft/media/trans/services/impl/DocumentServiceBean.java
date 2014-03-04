/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.services.impl;

import com.mediasoft.media.trans.dao.BaseDAOBeanLocal;
import com.mediasoft.media.trans.dao.DocumentDAOBeanLocal;
import com.mediasoft.media.trans.entites.Document;
import com.mediasoft.media.trans.services.DocumentServiceBeanLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author MANU
 */
@Stateless
public class DocumentServiceBean extends BaseServiceBean<Document,Integer> implements DocumentServiceBeanLocal {

    @EJB
    private DocumentDAOBeanLocal documentDAO;
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    protected BaseDAOBeanLocal<Document, Integer> getDAO() {
       return this.documentDAO;
    }

}
