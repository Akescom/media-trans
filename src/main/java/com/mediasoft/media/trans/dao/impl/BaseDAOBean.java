/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.dao.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.mediasoft.media.trans.dao.BaseDAOBeanLocal;

/**
 *
 * @author MANU
 */
public class BaseDAOBean<T extends Serializable, K> implements BaseDAOBeanLocal<T, K> {

    @PersistenceContext
    protected EntityManager em;
    private Class<T> type;

    public BaseDAOBean(Class<T> type) {
        this.type = type;
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<T> selectionnerTout() {
        Query query = this.em.createQuery("SELECT t FROM " + this.type.getSimpleName() + " t");
        return query.getResultList();
    }

    @Override
    public T selectionner(final K k) {
        return this.em.find(this.type, k);
    }

    @Override
    public void ajouter(final T t) {
        this.em.persist(t);
    }

    @Override
    public void modifier(final T t) {
        this.em.merge(t);
    }

    @Override
    public void supprimer(final K k) {
        this.em.remove(this.selectionner(k));
    }

    @Override
    public void supprimerTout() {
        Query query = this.em.createQuery("DELETE FROM " + this.type.getSimpleName());
        query.executeUpdate();
    }

    @Override
    public int compter() {
        int compte = 0;
        List<T> entite = this.selectionnerTout();
        for (T t : entite) {
            compte++;
        }
        return compte;
    }

    @Override
    public void ajouter(Collection<T> ts) {
        for (T t : ts) {
            ajouter(t);
        }
    }

    @Override
    public void supprimer(T t) {
        this.em.remove(t);
    }

    @Override
    public T selectionner(String propriete, String valeur) {
        Query q = this.em.createQuery("SELECT t FROM " + this.type.getSimpleName() + " t WHERE t." + propriete + "=:valeur");
        q.setParameter("valeur", valeur);
        return (T) q.getSingleResult();
    }

    @Override
    public List<T> selectionnerTouts(String objet, String propriete, String valeur) {
        Query q = this.em.createQuery("SELECT t FROM " + this.type.getSimpleName() + " t WHERE t." + objet + "." + propriete + "=:valeur");
        q.setParameter("valeur", valeur);
        return q.getResultList();
    }

    @Override
    public List<T> selectionnerToutregle(String objet, String propriete, float valeur) {
        Query q = this.em.createQuery("SELECT t FROM " + this.type.getSimpleName() + " t WHERE t." + objet + "." + propriete + "=:valeur");
        q.setParameter("valeur", valeur);
        return q.getResultList();
    }
}
