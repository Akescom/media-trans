/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.services.impl;

import com.mediasoft.media.trans.dao.BaseDAOBeanLocal;
import com.mediasoft.media.trans.dao.PieceDAOBeanLocal;
import com.mediasoft.media.trans.entites.Piece;
import com.mediasoft.media.trans.services.PieceServiceBeanLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author MANU
 */
@Stateless
public class PieceServiceBean extends BaseServiceBean<Piece, Integer> implements PieceServiceBeanLocal {

    @EJB
    private PieceDAOBeanLocal pieceDAO;
    
    @Override
    protected BaseDAOBeanLocal<Piece, Integer> getDAO() {
       return this.pieceDAO;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
