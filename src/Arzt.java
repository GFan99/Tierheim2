/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author becksusanna yeah!!!
 */

import Prog1Tools.IOTools;
import java.util.*;

class Arzt extends Personal{
    
    protected int rNr;
    
    protected Arzt(String nr, String name, String vName, String strNr, int plz, String ort, String gebDat, String tel, String mail, float gehAlt)
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
    
    protected int getRNr() {
        return rNr;
    }
    
    protected void setRNr(){
        int neuerRaum;
        neuerRaum = IOTools.readInteger("Bitte geben Sie eine neue Raum-Nummer für diesen Arzt ein:  ");
        rNr = neuerRaum;
    }
}