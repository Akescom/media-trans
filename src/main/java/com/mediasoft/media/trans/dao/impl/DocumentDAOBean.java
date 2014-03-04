/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.dao.impl;

import com.mediasoft.media.trans.dao.DocumentDAOBeanLocal;
import com.mediasoft.media.trans.entites.Document;
import javax.ejb.Stateless;

/**
 *
 * @author MANU
 */
@Stateless
public class DocumentDAOBean extends BaseDAOBean<Document,Integer> implements DocumentDAOBeanLocal {

    public DocumentDAOBean() {
        super(Document.class);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
