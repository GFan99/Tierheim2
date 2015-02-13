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

public class Verwalter extends Personal{
    public int rNr;
    public String vBereich;
    
    public Verwalter(int nr, String name, String vName, String strNr, int plz, String ort, Date gebDat, String tel, String mail, float gehAlt)
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
    
    public void setRNr(int nr) {
        rNr = nr;
    }
    public void setBereich(String nBereich) {
        vBereich = nBereich;
    }
    
    public int getRNr() {
        return rNr;
    }
    public String getBereich() {
        return vBereich;
    }
}