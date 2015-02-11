/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schueler
 */
import java.util.*;
        
public class Halter {
    String haVorname;
    String haNachname;
    int haPLZ;
    String haStrNr;
    String haOrt;
    int haTel;
    String haMail;
    Date haGebDat;
    boolean haAufDauer;
    ArrayList <String> haTiere;
    int haNr;
    
    public void getHaVollname(){
    System.out.print(haVorname);
    System.out.print(haNachname);
    }

}
