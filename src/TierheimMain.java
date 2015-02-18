/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author becksusanna yeah!!!
 */
import java.util.*;

class TierheimMain {
    
    private ArrayList<TRaum> traeume;
    private void add2raeume(TRaum raum) {
        traeume.add(raum);
    }
    private void removefromraeume(TRaum raum) {
        traeume.remove(raum);
    }
    private ArrayList<TRaum> gettraeume() {
        return traeume;
    }
    
    private void neuerTag() {
        for(int i = 0; i <= traeume.size(); i++) {
            (traeume.get(i)).neuerTag();
        }
    }
    
    protected static void main(String[] args) {

    Pfleger pfleger1 = new Pfleger(1, "Maier", "Heinz", "Muehlweg 5", 12356, "Berlin", "12/04/1963", "0304573492", "HeinzMaier@googlemail.com", 1600.00f);
    Pfleger pfleger2 = new Pfleger(2, "Schmidt", "Anna", "Hauptstraße 12", 12384, "Berlin", "12/06/1985", "0304574462", "AnnaSchmidt@googlemail.com", 1450.00f);
    Halter halter1 = new Halter(1,"Peter", "Pan", "Bahnhofstraße 506", 12333, "Potsdam", "12/09/1988", "0306792748", "pp@web.de", true);
    Halter halter2 = new Halter(2,"Marie", "Krüger", "Hauptstraße 34", 12643, "Berlin", "25/12/1977", "0306794548", "marie77@gmx.de", false);
    Arzt arzt1 = new Arzt(1, "Auge", "Hans", "Seestraße 5", 13056,"Ahrensfelde" ,"17/05/1975" , "014673298847", "TierarztAuge@yahoo.com", 2500.00f);
    Verwalter verwalter1 = new Verwalter(1, "Calussi", "Clemens", "Schulstraße 9", 18067, "Erkner", "15/09/1990", "0307889356", "Verwaltungsbüro@googlemail.com", 2100.00f);
    
    System.out.println("Halter1 heißt"+halter1.getHaVorname()+halter1.getHaNachname()+".");
    

    System.out.println(pfleger2.getMail());
    pfleger2.setMail("anna313@web.de");
    System.out.println(pfleger2.getMail());

    
    }
}