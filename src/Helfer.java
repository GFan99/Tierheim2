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

public class Helfer extends Personal
{
    public ArrayList<String> aufgabe;
    public ArrayList<String> tage;
    public ArrayList<Integer> hTiere;

    // Constructor for objects of class HELFER
    public Helfer(int nr, String name, String vName, String strNr, int plz, String ort, Date gebDat, String tel, String mail, float gehAlt)
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
    
    public void gassi(Hund hund)
    {
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
