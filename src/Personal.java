/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author becksusanna
 */
import java.util.*;

abstract class Personal extends Person{
    protected String pNr;
    protected float gehalt;
        
    
    protected void setGehalt(float gehAlt) {
        gehalt = gehAlt;
    }
    
    protected String getPNr() {
        return pNr;
    }
    
    protected float getGehalt() {
        return gehalt;
    }
    
    protected abstract String getArt();
    
    
}