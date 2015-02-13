/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author becksusanna
 */
public class Tier {
    int tNr;
    float tGebuehr;
    int rNr;
    String tName;
    String tRasse;
    String tGeschlecht;
    String gebDat;
    String tFarbe;
    
    public String getName()
    {
        return tName;
    }
    public int gettNr()
    {
        return tNr;
    }
    public String gettRasse()
    {
        return tRasse;
    }
    public int getrNr()
    {
        return rNr;
    }
    public String gettGeschlecht()
    {
        return tGeschlecht;
    }
    public String gebDat()
    {
        return gebDat;
    }
    public String tFarbe()
    {
        return tFarbe;
    }

    public void setGebuehr(float gebuehr)
    {
        tGebuehr = gebuehr;
    }
    public void setraumNr(int raumNr)
    {
        rNr=raumNr;
    }

}