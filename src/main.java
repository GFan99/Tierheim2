/*
 * @author becksusanna
 */
import java.util.ArrayList;
public class main {
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


    private static ArrayList<Personal> personalListe;

    
    private static ArrayList<Pfleger> pfleger;
    private static ArrayList<Arzt> aerzte;
    private static ArrayList<Verwalter> verwalter;
    
    private static void sortiertEinfuegen(ArrayList<Pfleger> liste, Pfleger element) {
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
    
    private static void personalListeAusgeben() {
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
    
=======


>>>>>>> Stashed changes
    public static void main(String[] args) {
    Pfleger pfleger1 = new Pfleger("L32J56K2", "Maier", "Heinz", "Muehlweg 5", 12356, "Berlin", "12/04/1963", "0304573492", "HeinzMaier@googlemail.com", 1600.00f);
    Pfleger pfleger2 = new Pfleger("K35A83F2", "Schmidt", "Anna", "Hauptstraße 12", 12384, "Berlin", "12/06/1985", "0304574462", "AnnaSchmidt@googlemail.com", 1450.00f);
    Halter halter1 = new Halter("B29W30O3","Peter", "Pan", "Bahnhofstraße 506", 12333, "Potsdam", "12/09/1988", "0306792748", "pp@web.de", true);
    Halter halter2 = new Halter("D28H38W1","Krüger", "Marie", "Hauptstraße 34", 12643, "Berlin", "25/12/1977", "0306794548", "marie77@gmx.de", false);
    Arzt arzt1 = new Arzt("Q75U48C2", "Auge", "Hans", "Seestraße 5", 13056,"Ahrensfelde" ,"17/05/1975" , "014673298847", "TierarztAuge@yahoo.com", 2500.00f);
    Verwalter verwalter1 = new Verwalter("H38W04L6", "Calussi", "Clemens", "Schulstraße 9", 18067, "Erkner", "15/09/1990", "0307889356", "Verwaltungsbüro@googlemail.com", 2100.00f);
    Hund hund1 = new Hund(1, 1000, 1, "Bello", "Labrador", "männlich", "13.02.2010", "beige", "abends", "132098");
    Hund hund2 = new Hund(2, 1020, 1, "Waldi", "Labrador", "weiblich", "28.05.2011", "beige", "abends", "132098");
    Katze katze1 = new Katze(3, 450, 2, "Mietze", "Chartreux", "weiblich", "24.06.2012", "grau", "mittags", "123352");
    Kleintier kleintier1 = new Kleintier(4, 15, 3, "Puschel", "Hamster", "männlich", "23.11.2014", "braun", "morgens");
    Kleintier kleintier2 = new Kleintier(5, 15, 3, "Wuschel", "Hamster", "männlich", "23.11.2014", "braun", "morgens");
    Vogel vogel1 = new Vogel(6, 30, 4, "Hansi", "Wellensittich", "männlich", "23.04.2013", "blau", "morgens", 712982);
    
    System.out.println("Test");
    
    System.out.println("Halter1 heißt "+halter1.getHaVorname()+" "+halter1.getHaNachname()+".");
    
    
    System.out.println(pfleger2.getMail());
    pfleger2.setMail("anna313@web.de");
    System.out.println(pfleger2.getMail());
    
    
    pfleger.add(pfleger1);
    pfleger.add(pfleger2);
    aerzte.add(arzt1);
    verwalter.add(verwalter1);
    
    //System.out.println((personalListe.get(0)).getName());
    //System.out.println(personalListe.get(2));
        
    personalListeAusgeben();
    
    //new LogInFenster();
    }
}