/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author becksusanna yeah!!!
 */
public class TierheimMain {
    public static void main(String[] args) {

    Pfleger pfleger1 = new Pfleger(1, "Maier", "Heinz", "Muehlweg 5", 12356, "Berlin", "12/04/1963", "0304573492", "HeinzMaier@googlemail.com", 1600.00f);
    Pfleger pfleger2 = new Pfleger(2, "Schmidt", "Anna", "Hauptstraße 12", 12384, "Berlin", "12.06.1985", "0304574462", "AnnaSchmidt@googlemail.com", 1450.00f);
    System.out.println(pfleger2.getMail());
    pfleger2.setMail("superanna313@web.de");
    System.out.println(pfleger2.getMail());
    }

}

