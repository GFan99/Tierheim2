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

class Helfer extends Personal
{
    protected ArrayList<String> aufgabe;
    protected ArrayList<String> tage;
    protected ArrayList<Tier> hTiere;

    // Constructor for objects of class HELFER
    protected Helfer(int nr, String name, String vName, String strNr, int plz, String ort, String gebDat, String tel, String mail)
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
        gehalt = 0f;
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
