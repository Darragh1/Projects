/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.Serializable;

/**
 *
 * @author x11527487
 */

public class Coding implements Serializable{
    private String name;
    private String type;
    private double weighting;
    
    public Coding (){
        name = new String ();
        type = new String ();
        weighting = 0;
    }
    
    public Coding(String name, String type, int weighting){
        this.name = name;
        this.type = type;
        this.weighting = weighting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeighting() {
        return weighting;
    }

    public void setWeighting(double weighting) {
        this.weighting = weighting;
    }
    
    
}
