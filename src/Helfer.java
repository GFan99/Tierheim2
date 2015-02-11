/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author becksusanna
 */

public class Helfer extends Personal
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class HELFER
     */
    public HELFER()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
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
