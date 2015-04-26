/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author becksusanna
 */
import java.util.*;

class Tierheim {

    private ArrayList<Personal> personalListe;
    
    private ArrayList<Pfleger> pfleger;
    private ArrayList<Arzt> aerzte;
    private ArrayList<Verwalter> verwalter;
    
    private ArrayList<TRaum> traeume;
    
    
    protected void add2traeume(TRaum raum) {
        traeume.add(raum);
    }
    protected void removefromtraeume(TRaum raum) {
        traeume.remove(raum);
    }
    protected ArrayList<TRaum> gettraeume() {
        return traeume;
    }

    protected void add2pfleger(Pfleger p) {
        pfleger.add(p);
    }
    public void add2aerzte(Arzt a) {
        aerzte.add(a);
    }
    protected void add2verwalter(Verwalter v) {
        verwalter.add(v);
    }
    
    Tierheim() {
        
    }
    
    private void neuerTag() {
        for(int i = 0; i <= traeume.size(); i++) {
            (traeume.get(i)).neuerTag();
        }
    }
 
    protected void sortiertEinfuegen(ArrayList<Pfleger> liste, Pfleger element) {
        if(liste.size()==0) {
            liste.add(element);
        }
        else{
            String nname = element.getName();
            String vname = element.getVName();
        
            for (int i = 0; i<liste.size(); i++) {
                String lauf = (liste.get(i)).getName();
                if (lauf.charAt(0)>nname.charAt(0)) {
                    liste.add(i,element);
                    break;
                }
                else {
                    if (lauf.charAt(0) == nname.charAt(0)) {
                        for (int a = 1; a>lauf.length(); a++) {
                            if (lauf.charAt(a) > nname.charAt(a)) {
                                liste.add(i,element);
                            }
                            else {
                                if (lauf.charAt(a) < nname.charAt(a)) { } 
                            }
                        }
                        for (int j = 0;j<liste.size(); j++) {
                            String lauf2 = (liste.get(j)).getVName();
                            if (lauf2.charAt(0)>vname.charAt(0)) {
                                liste.add(j,element);
                                break;
                            }
                        }
                    }        
                    else {
                                if (lauf.charAt(0) == nname.charAt(0)) {
                                    for (int j = 0;j<liste.size(); j++) {
                                        String lauf2 = (liste.get(j)).getName();
                                        for (int b = 1; b>lauf.length(); b++) {
                                            if (lauf2.charAt(b) > nname.charAt(b)) {
                                                liste.add(j,element);
                                            }
                                            else {
                                                if (lauf.charAt(b) < nname.charAt(b)) {
                                                    break;
                                                }
                                                else {System.out.println("Die Person kann nicht einsortiert werden.");}
                                            }
                                        }
                                    }
                                }
                        }
                }
            }
        }
    }
    
    protected void personalListeAusgeben() {
        Personal person;
        System.out.println("Im Moment sind folgende Personen eingestellt:");
        System.out.println("Pfleger:");
        for (int i = 0;i < pfleger.size(); i++) {
            person = pfleger.get(i);
            System.out.println(person.getName() + ", " + person.getVName() + "   geboren am " + person.getGebDat());
        }
        System.out.println("Ärzte:");
        for (int i = 0;i < aerzte.size(); i++) {
            person = aerzte.get(i);
            System.out.println(person.getName() + ", " + person.getVName() + "   geboren am " + person.getGebDat());
        }
        System.out.println("Verwalter:");
        for (int i = 0;i < verwalter.size(); i++) {
            person = verwalter.get(i);
            System.out.println(person.getName() + ", " + person.getVName() + "   geboren am " + person.getGebDat());
        }
    }
    
    private int tag;
    
    protected int getTag() {
        return tag;
    }    
}