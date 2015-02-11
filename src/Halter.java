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
    
    public String getHaVorname(){
    return haVorname;
    }

    public String getHaNachname(){
    return haNachname;
    }
    public void Kundenname(Halter h){
    System.out.println(h.getHaVorname());
    System.out.print(h.getHaNachname());
    }
    public int getHaPLZ(){
    return haPLZ;
    }
    public String getHaStrNr(){
    return haStrNr;
    }
    public String getHaOrt(){
    return haOrt;
    }
    public void Adresse(Halter h){
    System.out.println(h.getHaStrNr());
    System.out.println(h.getHaPLZ());
    System.out.print(h.getHaOrt());
    }
    public int getHaTel(){
    return haTel;
    }
    public  String getHaMail(){
    return haMail;
    }
    public  Date getHaGebDat(){
    return haGebDat;
    }
    public  boolean getHaAufDauer(){
    return haAufDauer;
    }
    public void haDauerhaft(Halter h){
    if (h.getHaAufDauer() == true){
        System.out.println("Dieser Halter betreut dauerhaft unsere Tiere.");
        }
    else{
        System.out.println("Dieser Halter betreut nicht dauerhaft");
        }
    }
    
    }
    



}
