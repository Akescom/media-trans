/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.dao.impl;

import com.mediasoft.media.trans.dao.PieceDAOBeanLocal;
import com.mediasoft.media.trans.entites.Piece;
import javax.ejb.Stateless;

/**
 *
 * @author MANU
 */
@Stateless
public class PieceDAOBean extends BaseDAOBean<Piece,Integer> implements PieceDAOBeanLocal {

    public PieceDAOBean() {
        super(Piece.class);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
