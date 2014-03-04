/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediasoft.media.trans.entites;

import java.io.Serializable;
import javax.persistence.Version;

/**
 *
 * @author MANU
 */
public class BaseEntity implements Serializable{
    
    @Version
    protected Integer version;
 
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

   
}
