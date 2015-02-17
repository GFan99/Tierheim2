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

class Halter{
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
 
    protected Halter(int nhaNr,String nhaVorname, String nhaNachname, String nhaStrNr, int nhaPLZ, String nhaOrt, String nhaGebDat, String nhaTel, String nhaMail, boolean nhaAufDauer)
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
    protected String getHaNachname(){
        return haNachname;
    }

    protected void setKundenname(String Nachname, String Vorname) {
        haNachname = Nachname;
        haVorname = Vorname;
    }
    protected void getKundenname(){
        System.out.println(getHaVorname());
        System.out.print(getHaNachname());

    }
    protected int getHaPLZ(){
        return haPLZ;
    }
    protected String getHaStrNr(){
        return haStrNr;
    }
    protected String getHaOrt(){
        return haOrt;
    }
    protected void getAdresse(){
        System.out.println(getHaStrNr());
        System.out.println(getHaPLZ());
        System.out.print(getHaOrt());
    }
    protected String getHaTel(){
        return haTel;
    }
    protected  String getHaMail(){
        return haMail;
    }
    protected  String getHaGebDat(){
        return haGebDat;
    }
    protected  boolean getHaAufDauer(){
        return haAufDauer;
    }
    protected void getHaDauerhaft(){
        if (getHaAufDauer() == true){
            System.out.println("Dieser Halter betreut dauerhaft unsere Tiere.");
        }
        else{
            System.out.println("Dieser Halter betreut nur zeitweise");
        }
    }
    protected  ArrayList<Tier> getHaTiere(){
        return haTiere;
    }
    protected  int getHaNr(){
        return haNr;
    }




    protected void setName() {
        String name = IOTools.readString("Geben sie den neuen Nachnamen ein: ");
        haNachname = name;
    }
    // Es wird davon ausgegangen, dass man seinen Vornamen nicht ändert, auch wenn diese Möglichkeit in Realität besteht.
    protected void setAdresse(String StraßeNummer, int PLZ, String Ort) {
        haStrNr = StraßeNummer;
        haPLZ = PLZ;
        haOrt = Ort;
    }
<<<<<<< Updated upstream
    protected void Adresse(Halter h){
    System.out.println(h.getHaStrNr());
    System.out.println(h.getHaPLZ());
    System.out.print(h.getHaOrt());
    }
    protected String getHaTel(){
    return haTel;
    }
    protected void setHaTel(String Telefonnummer){
=======
    protected void setHaTel(int Telefonnummer){
>>>>>>> Stashed changes
        haTel = Telefonnummer;
    }
    protected void setHaMail(String Mail){
        haMail = Mail;
    }
    // Ein Halter kann sein GebDat nicht verändern.
    protected void setHaAufDauer(boolean dauerhaft){
        haAufDauer = dauerhaft;
    }
<<<<<<< Updated upstream
    protected void haDauerhaft(Halter h){
    if (h.getHaAufDauer() == true){
        System.out.println("Dieser Halter betreut dauerhaft unsere Tiere.");
        }
    else{
        System.out.println("Dieser Halter betreut nur zeitweise");
        }
    }
    protected  ArrayList<Tier> getHaTiere(){
    return haTiere;
    }
    protected void setHaTiere(ArrayList<Tier> betreuendeTiere){
        haTiere = betreuendeTiere;
    }
    protected void addHaTiere(Tier tier){
        haTiere.add(tier);
    }
    protected void remove(Tier tier){
        haTiere.remove(tier);
    }
    protected  int getHaNr(){
    return haNr;
    }

    protected void setHaTiere(ArrayList <Tier> betreuendeTiere){
        haTiere = betreuendeTiere;
    }

    protected void setHaNr(int neueNr){
        haNr = neueNr;
    }

    
    
    
    
    
    
}   