/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author schueler
 */
import Prog1Tools.IOTools;
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
    public String getHaVorname(){
        return haVorname;
    }
    public String getHaNachname(){
        return haNachname;
    }
<<<<<<< Updated upstream
    public void setKundenname(String Nachname, String Vorname) {
        haNachname = Nachname;
        haVorname = Vorname;
=======
    public void getKundenname(){
        System.out.println(getHaVorname());
        System.out.print(getHaNachname());
>>>>>>> Stashed changes
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
    public void getAdresse(){
        System.out.println(getHaStrNr());
        System.out.println(getHaPLZ());
        System.out.print(getHaOrt());
    }
    public int getHaTel(){
        return haTel;
    }
    public  String getHaMail(){
        return haMail;
    }
    public  String getHaGebDat(){
        return haGebDat;
    }
    public  boolean getHaAufDauer(){
        return haAufDauer;
    }
    public void getHaDauerhaft(){
        if (getHaAufDauer() == true){
            System.out.println("Dieser Halter betreut dauerhaft unsere Tiere.");
        }
        else{
            System.out.println("Dieser Halter betreut nur zeitweise");
        }
    }
    public  ArrayList<String> getHaTiere(){
        return haTiere;
    }
    public  int getHaNr(){
        return haNr;
    }




    public void setName() {
        String name = IOTools.readString("Geben sie den neuen Nachnamen ein: ");
        haNachname = name;
    }
    // Es wird davon ausgegangen, dass man seinen Vornamen nicht ändert, auch wenn diese Möglichkeit in Realität besteht.
    public void setAdresse(String StraßeNummer, int PLZ, String Ort) {
        haStrNr = StraßeNummer;
        haPLZ = PLZ;
        haOrt = Ort;
    }
<<<<<<< Updated upstream
    public void Adresse(Halter h){
    System.out.println(h.getHaStrNr());
    System.out.println(h.getHaPLZ());
    System.out.print(h.getHaOrt());
    }
    public String getHaTel(){
    return haTel;
    }
    public void setHaTel(String Telefonnummer){
=======
    public void setHaTel(int Telefonnummer){
>>>>>>> Stashed changes
        haTel = Telefonnummer;
    }
    public void setHaMail(String Mail){
        haMail = Mail;
    }
    // Ein Halter kann sein GebDat nicht verändern.
    public void setHaAufDauer(boolean dauerhaft){
        haAufDauer = dauerhaft;
    }
<<<<<<< Updated upstream
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
=======
    public void setHaTiere(ArrayList <String> betreuendeTiere){
        haTiere = betreuendeTiere;
    }
>>>>>>> Stashed changes
    public void setHaNr(int neueNr){
        haNr = neueNr;
    }
    
    
    
    
    
}   