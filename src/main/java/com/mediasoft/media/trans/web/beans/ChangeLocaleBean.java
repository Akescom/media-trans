/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author MANU
 */
@ManagedBean
@SessionScoped
public class ChangeLocaleBean {

    /**
     * Creates a new instance of ChangeLocaleBean
     */
    public ChangeLocaleBean() {
    }
    private String locale = "fr";
    
    public String setFrenchLocale() {
        locale = "fr";
        return null;
    }

    public String setEnglishLocale() {
        locale = "en";
        return null;
    }
    
     public String setEspagnoeleLocale() {
        locale = "es";
        return null;
    }

    public String getLocale() {
        return locale;


    }
    
    
}
