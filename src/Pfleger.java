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

 class Pfleger extends Personal{
    
    protected ArrayList<Tier> pfTiere;
    
    protected Pfleger(String nr, String name, String vName, String strNr, int plz, String ort, String gebDat, String tel, String mail, float gehAlt)
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
    
    //protected void addTier () {
        //for (int i = 0; i <= pfTiere.len(); i++) {
         //   System.out.println(pfTiere[i]);
        //}
        //Tier tier = 
        //pfTiere.add(tier);
    //}
    protected void removeTier(Tier tier) {
        pfTiere.remove(tier);
    }
    
    protected ArrayList<Tier> getPfTiere() {
        return pfTiere;
    }
    
    protected void gassi(Hund hund) {
        if (hund.getGassi() == false)
        {
            hund.setGassi(true);
        }
        else
        {
            System.out.println("Dieser Hund wurde heute schon gassigeführt. Bitte wähle einen anderen.");
        }
    }
    
}