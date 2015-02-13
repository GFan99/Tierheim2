/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author becksusanna
 */
public class Hund extends Tier {
//Hallo
    public boolean heuteGassi;
    String hMarke;
    
    public boolean getGassi()
    {
        return heuteGassi;
    }
    public void setGassi(boolean trueoderfalse)
    {
        heuteGassi = trueoderfalse;
    }

    public String gethMarke()
    {
        return hMarke;
    }
}