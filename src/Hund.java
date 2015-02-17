/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author becksusanna
 */
protected class Hund extends Tier {
//Hallo
    protected boolean heuteGassi;
    String hMarke;
    
    protected boolean getGassi()
    {
        return heuteGassi;
    }
    protected void setGassi(boolean trueoderfalse)
    {
        heuteGassi = trueoderfalse;
    }

    protected String gethMarke()
    {
        return hMarke;
    }
}