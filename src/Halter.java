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
        
class Halter {
    private String haVorname;
    private String haNachname;
    private int haPLZ;
    private String haStrNr;
    private String haOrt;
    private String haTel;
    private String haMail;
    private final String haGebDat;
    private boolean haAufDauer;//haAufDauer true:Tieraufnahme, haAufDauer false:Tierabgabe
    private ArrayList<Tier> haTiere;
    private int haNr;
 
    public Halter(int nhaNr,String nhaVorname, String nhaNachname, String nhaStrNr, int nhaPLZ, String nhaOrt, String nhaGebDat, String nhaTel, String nhaMail, boolean nhaAufDauer)
    {
    haVorname = nhaVorname;
    haNachname = nhaNachname;
    haPLZ = nhaPLZ;
    haStrNr = nhaStrNr;
    haOrt = nhaOrt;
    haTel = nhaTel;
    haMail = nhaMail;
    haGebDat = nhaGebDat;
    haAufDauer = nhaAufDauer;
    haNr = nhaNr;
    }
    protected String getHaVorname(){
    return haVorname;
    }
    public String getHaNachname(){
    return haNachname;
    }
    public void setKundenname(String Nachname, String Vorname) {
        haNachname = Nachname;
        haVorname = Vorname;
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
    public String getHaTel(){
    return haTel;
    }
    public void setHaTel(String Telefonnummer){
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
    public  ArrayList<Tier> getHaTiere(){
    return haTiere;
    }
    public void setHaTiere(ArrayList<Tier> betreuendeTiere){
        haTiere = betreuendeTiere;
    }
    public void addHaTiere(Tier tier){
        haTiere.add(tier);
    }
    public void remove(Tier tier){
        haTiere.remove(tier);
    }
    public  int getHaNr(){
    return haNr;
    }
    public void setHaNr(int neueNr){
        haNr = neueNr;
    }
    
    
    
    
    
}   