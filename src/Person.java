/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author becksusanna
 */
public class Person {
    protected String pName;
    protected String pVName;
    protected String pStrNr;
    protected int pPLZ;
    protected String pOrt;
    protected String pGebDat;
    protected String pTel;
    protected String pMail;
    
    protected void setAdresse(String strNr, int plz, String ort) {
        pStrNr = strNr;
        pPLZ = plz;
        pOrt = ort;
    }
    protected void setNName(String name) {
        pName = name;
    }
    protected void setTel(String tel) {
        pTel = tel;
    }
    protected void setMail(String mail) {
        pMail = mail;
    }
    
    protected String getName() {
        return pName;
    }
    protected String getVName() {
        return pVName;
    }
    protected void printAdresse() {
        System.out.println("Die Adresse von"+getName()+"ist:");
        System.out.println(getStrNr());
        System.out.println(getPLZ());
        System.out.println(getOrt());    
    }
    protected void getAdresse() {
        System.out.println(pStrNr+", "+pPLZ+pOrt);
    }
    protected String getStrNr() {
        return pStrNr;
    }
    protected int getPLZ() {
        return pPLZ;
    }
    protected String getOrt() {
        return pOrt;
    }
    protected String getGebDat() {
        return pGebDat;
    }
    protected String getTel() {
        return pTel;
    }
    protected String getMail() {
        return pMail;
    }
}
