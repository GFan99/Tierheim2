/*
 * @author becksusanna
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TierheimMain {
    
    protected static ArrayList<Pfleger> pfleger;
    protected static ArrayList<Arzt> aerzte;
    protected static ArrayList<Verwalter> verwalter;
    protected static ArrayList<TRaum> traeume;
    protected static ArrayList<PRaum> praeume;
    protected static ArrayList<Hund> hunde;
    protected static ArrayList<Katze> katzen;
    protected static ArrayList<Kleintier> kleintiere;
    protected static ArrayList<Helfer> helfer;
    
    private static int tag;
    
    public static void speichern (ArrayList liste, String dateiname) {
        try {
            ObjectOutputStream oos;
            FileOutputStream fos = new FileOutputStream(dateiname);
            // Neuer ObjectOutputStream, der die Schreibmethode enthält, 
            // wird erzeugt, indem der FileOutputStream dem Konstruktor 
            // übergeben wird
            oos = new ObjectOutputStream(fos);
            // Die Methode writeObject schreibt komplexe
            // Datentypen in die Datei
            oos.writeObject(liste);

            if (oos!=null) {
                oos.close();
            }
            else {
                System.out.println("Die Datei ist leer") ;
            }
        }
        catch (FileNotFoundException fnx) {
            System.out.println("Die Datei konnte nicht gefunden werden") ;
            fnx.printStackTrace();
        }
        // Fehlerbehandlung, falls ein Fehler beim
        // eigentlichen Schreiben auftritt
        catch (IOException ioex) {
           ioex.printStackTrace();
        }   
    }
    public static ArrayList lesen (String dateiname) {
        Object obj = new Object();
        try {
            // Erstellung eines FileInputStreams, damit wir
            // aus der Datei "dateiname" lesen können
            FileInputStream fis = new FileInputStream(dateiname);

            // Erstellung eines ObjectInputStreams, der
            // die eigentlichen Lesemethoden enthält
            // wird mit dem FileInputStream erzeugt
            ObjectInputStream ois = new ObjectInputStream (fis);

            // Die Methode readObject liest ein
            // Objekt einer beliebigen Klasse aus der Datei
            obj = ois.readObject();

            //falls das Objekt vom Typ ArrayList ist,
            //wird es zur ArrayList hinzugefügt, die Liste wird ausgegeben
            if (obj instanceof ArrayList) {
                ArrayList Liste = (ArrayList)obj;
                return Liste;
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Die Datei konnte nicht gefunden werden") ;
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Die Klasse konnte nicht gefunden werden") ;
            ex.printStackTrace();
        }
        ArrayList liste2 = new ArrayList();
        return liste2;
    }
    
    protected static void add2traeume(TRaum raum) {
        traeume.add(raum);
    }
    protected static void removefromtraeume(TRaum raum) {
        traeume.remove(raum);
    }
    protected static ArrayList<TRaum> gettraeume() {
        return traeume;
    }
    protected static void add2pfleger(Pfleger p) {
        pfleger.add(p);
    }
    public static void add2aerzte(Arzt a) {
        aerzte.add(a);
    }
    protected static void add2verwalter(Verwalter v) {
        verwalter.add(v);
    }

    protected static void neuerTag() {
        for(int i = 0; i <= traeume.size(); i++) {
            (traeume.get(i)).neuerTag();
        }
    }
 
    protected static void sortiertEinfuegenP(ArrayList<Person> liste, Person element) {
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
    
    protected static void personalListeAusgeben() {
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
    
    protected static int getTag() {
        return tag;
    }
    
    protected static void speichernbeenden() {
        speichern(pfleger, "pfleger.th");
        speichern(aerzte, "aerzte.th");
        speichern(verwalter, "verwalter.th");
        speichern(traeume, "traeume.th");
        speichern(praeume, "praeume.th");
        speichern(helfer, "helfer.th");
        speichern(hunde, "hunde.th");
        speichern(katzen, "katzen.th");
        speichern(kleintiere, "kleintiere.th");
        for (int i = 0; i < traeume.size(); i++) {
            TRaum raum = traeume.get(i);
            speichern(raum.getTiere(),"tiereRaum.th"+raum.getNr());
            speichern(raum.getWarteliste(),"wlRaum.th"+raum.getNr());
        }
        System.exit(0);
    }
    
    public static void main(String[] args) {

        traeume = new ArrayList<TRaum>();
        praeume = new ArrayList<PRaum>();
        pfleger = new ArrayList<Pfleger>();
        aerzte = new ArrayList<Arzt>();
        verwalter = new ArrayList<Verwalter>();
        helfer = new ArrayList<Helfer>();
        hunde = new ArrayList<Hund>();
        katzen = new ArrayList<Katze>();
        kleintiere = new ArrayList<Kleintier>();
        
        
        pfleger = lesen("pfleger.th");
        aerzte = lesen("aerzte.th");
        verwalter = lesen("verwalter.th");
        traeume = lesen("traeume.th");
        praeume = lesen("praeume.th");
        helfer = lesen("helfer.th");
        hunde = lesen("hunde.th");
        katzen = lesen("katzen.th");
        kleintiere = lesen("kleintiere.th");
        for (int i = 0; i < traeume.size(); i++) {
            TRaum raum = traeume.get(i);
            raum.setTiere(lesen("tiereRaum"+raum.getNr()+".th"));
            raum.setWarteliste(lesen("wlRaum"+raum.getNr()+".th"));
        }
        
        /*
        Pfleger pfleger1 = new Pfleger("L32J56K2", "Maier", "Heinz", "Muehlweg 5", 12356, "Berlin", "12/04/1963", "0304573492", "HeinzMaier@googlemail.com", 1600.00f);
        pfleger.add(pfleger1);
        //Pfleger pfleger2 = new Pfleger("K35A83F2", "Schmidt", "Anna", "Hauptstraße 12", 12384, "Berlin", "12/06/1985", "0304574462", "AnnaSchmidt@googlemail.com", 1450.00f);
        //sortiertEinfuegenP(pfleger, pfleger2);
        Halter halter1 = new Halter("B29W30O3","Peter", "Pan", "Bahnhofstraße 506", 12333, "Potsdam", "12/09/1988", "0306792748", "pp@web.de", true);
        Halter halter2 = new Halter("D28H38W1","Krüger", "Marie", "Hauptstraße 34", 12643, "Berlin", "25/12/1977", "0306794548", "marie77@gmx.de", false);
        Arzt arzt1 = new Arzt("Q75U48C2", "Auge", "Hans", "Seestraße 5", 13056,"Ahrensfelde" ,"17/05/1975" , "014673298847", "TierarztAuge@yahoo.com", 2500.00f);
        Verwalter verwalter1 = new Verwalter("H38W04L6", "Calussi", "Clemens", "Schulstraße 9", 18067, "Erkner", "15/09/1990", "0307889356", "Verwaltungsbüro@googlemail.com", 2100.00f);
        Hund hund1 = new Hund(1000, 1, "Bello", "Labrador", "männlich", "13.02.2010", "beige", "abends", "132098");
        Hund hund2 = new Hund(1020, 1, "Waldi", "Labrador", "weiblich", "28.05.2011", "beige", "abends", "132098");
        Katze katze1 = new Katze(450, 2, "Mietze", "Chartreux", "weiblich", "24.06.2012", "grau", "mittags", "123352");
        Kleintier kleintier1 = new Kleintier("15H75", 15, 3, "Puschel", "Hamster", "männlich", "23.11.2014", "braun", "morgens");
        Kleintier kleintier2 = new Kleintier("35A67", 15, 3, "Wuschel", "Hamster", "männlich", "23.11.2014", "braun", "morgens");
        Vogel vogel1 = new Vogel(30, 4, "Hansi", "Wellensittich", "männlich", "23.04.2013", "blau", "morgens", "712982");
    
        TRaum raum = new TRaum(1,30,"Hund",35);
        
        raum.addTier(hund1);

        raum.addTier(hund2);
        
        personalListeAusgeben();
        */
        
        //speichernbeenden();
       

        new Login();
        

    /*System.out.println("Test");
    
    System.out.println("Halter1 heißt "+halter1.getHaVorname()+" "+halter1.getHaNachname()+".");
    
    
    System.out.println(pfleger2.getMail());
    pfleger2.setMail("anna313@web.de");
    System.out.println(pfleger2.getMail());
    
    
    
    //th.add2pfleger(pfleger1);
    //th.add2pfleger(pfleger2);
    th.add2aerzte(arzt1);
    th.add2verwalter(verwalter1);
    
    //System.out.println((personalListe.get(0)).getName());
    //System.out.println(personalListe.get(2));
    //th.personalListeAusgeben();  
    */
    }
}