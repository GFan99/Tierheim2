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
    public String haVorname;
    public String haNachname;
    public int haPLZ;
    public String haStrNr;
    public String haOrt;
    public int haTel;
    public String haMail;
    public String haGebDat;
    public boolean haAufDauer;
    public ArrayList <String> haTiere;
    public int haNr;
    
    public String getHaVorname(){
    return haVorname;
    }
    public String getHaNachname(){
    return haNachname;
    }
    public void setKundenname(String Nachname, String Vorname) {
        haNachname = Nachname;
        haVorname = Vorname;
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
    public void setAdresse(String StraßeNummer, int PLZ, String Ort) {
        haStrNr = StraßeNummer;
        haPLZ = PLZ;
        haOrt = Ort;
    }
    public void Adresse(Halter h){
    System.out.println(h.getHaStrNr());
    System.out.println(h.getHaPLZ());
    System.out.print(h.getHaOrt());
    }
    public int getHaTel(){
    return haTel;
    }
    public void setHaTel(int Telefonnummer){
        haTel = Telefonnummer;
    }
    public  String getHaMail(){
    return haMail;
    }
    public void setHaMail(String Mail){
        haMail = Mail;
    }
    public  String getHaGebDat(){
    return haGebDat;
    }
    // Ein Halter kann sein GebDat nicht verändern.
    public  boolean getHaAufDauer(){
    return haAufDauer;
    }
    public void setHaAufDauer(boolean dauerhaft){
        haAufDauer = dauerhaft;
    }
    public void haDauerhaft(Halter h){
    if (h.getHaAufDauer() == true){
        System.out.println("Dieser Halter betreut dauerhaft unsere Tiere.");
        }
    else{
        System.out.println("Dieser Halter betreut nur zeitweise");
        }
    }
    public  ArrayList <String> getHaTiere(){
    return haTiere;
    }
    public void setHaTiere(ArrayList <String> betreuendeTiere){
        haTiere = betreuendeTiere;
    }
    public  int getHaNr(){
    return haNr;
    }
    public void setHaNr(int neueNr){
        haNr = neueNr;
    }
    
    
    
    
    
}   