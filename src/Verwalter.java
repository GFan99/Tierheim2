/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author becksusanna yeah!!!
 */

import java.util.*;

class Verwalter extends Personal{
    protected int rNr;
    protected String vBereich;
    
    protected Verwalter(int nr, String name, String vName, String strNr, int plz, String ort, String gebDat, String tel, String mail, float gehAlt)
    {
        pNr = nr;
        pName = name;
        pVName = vName;
        pStrNr = strNr;
        pPLZ = plz;
        pOrt = ort;
        pGebDat = gebDat;
        pTel = tel;
        pMail = mail;
        gehalt = gehAlt;
    }
    
    protected void setRNr(int nr) {
        rNr = nr;
    }
    protected void setBereich(String nBereich) {
        vBereich = nBereich;
    }
    
    protected int getRNr() {
        return rNr;
    }
    protected String getBereich() {
        return vBereich;
    }
}