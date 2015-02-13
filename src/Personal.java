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

public class Personal {
    public int pNr;
    public String pName;
    public String pVName;
    public String pStrNr;
    public int pPLZ;
    public String pOrt;
    public String pGebDat;
    public String pTel;
    public String pMail;
    public float gehalt;
    
    public void setAdresse(String strNr, int plz, String ort) {
        pStrNr = strNr;
        pPLZ = plz;
        pOrt = ort;
    }
    public void setNName(String name) {
        pName = name;
    }
    public void setTel(String tel) {
        pTel = tel;
    }
    public void setMail(String mail) {
        pMail = mail;
    }
    public void setGehalt(float gehAlt) {
        gehalt = gehAlt;
    }
    
    public int getPNr() {
        return pNr;
    }
    public String getName() {
        return pName;
    }
    public String getVName() {
        return pVName;
    }
    /*public String getAdresse() {
        ArrayList adresse;
        adresse.add(pStrNr);
        adresse.add(", ");        
        adresse.add(pPLZ);
        adresse.add(pOrt);
        adresse.
        return adresse;
    }
    */
    public void getAdresse() {
        System.out.println(pStrNr+", "+pPLZ+pOrt);
    }
    public String getStrNr() {
        return pStrNr;
    }
    public int getPLZ() {
        return pPLZ;
    }
    public String getOrt() {
        return pOrt;
    }
    public String getGebDat() {
        return pGebDat;
    }
    public String getTel() {
        return pTel;
    }
    public String getMail() {
        return pMail;
    }
    public float getGehalt() {
        return gehalt;
    }
}