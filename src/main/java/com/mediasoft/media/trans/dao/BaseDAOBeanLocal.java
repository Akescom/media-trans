/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author MANU
 */
@Local
public interface BaseDAOBeanLocal<T extends Serializable, K> {
  
    List<T>  selectionnerTout();
    
    T selectionner(K k);
    
    void ajouter(final T t);
    
    void modifier(final T t);
    
    void supprimer(final K k);
    
    void supprimer(final T t);
    
    void supprimerTout();
    
    int compter();
    
    void ajouter(final Collection<T> ts);
    
    T selectionner(String propriete,String valeur);
    
    List<T> selectionnerTouts(String objet,String propriete,String valeur);
    
    List<T> selectionnerToutregle(String objet,String propriete,float valeur);
    
}
