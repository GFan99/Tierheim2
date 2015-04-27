/**
 *
 * @author schueler
 */
/*Noch wichtig:
* Object getSelectedItem() 
* Hier wird das in der JComboBox ausgewählte Objekt zurückgegeben.
* Um mit dem Objekt weiter zu arbeiten, ist eine Typumwandlung zu der jeweiligen Klasse nötig.
*/
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;

public class Fenster {
    public Fenster() {        
        //Deklaration
        final JFrame fenster;
        Color hellblau;

            //Home
                //Über uns
                final JPanel grundHomeUeber;
                final JLabel uberschriftHome;
                final JLabel logo;
                final JButton speichernbeenden;
                
            //suchen und löschen für Tiere,Personal,Helfer,Raum
                final JPanel grundSuchen;
                final JLabel frageA;
                final JLabel frageB;
                final JComboBox auswahl;
                final JTextField kriterium;
                final JButton bestaetigen;
                final JLabel meldung;
                JLabel ausgabe;
                final JFrame suchergebnis;
                
            
            //hinzufügen für Tiere, Personal, Helfer, Raum
                final JPanel grundHinzu;
                final JLabel ueberschriftHinzu;
                final JLabel frageHinzuA;
                final JLabel frageHinzuB;
                final JLabel frageHinzuC;
                final JLabel frageHinzuD;
                final JLabel frageHinzuE;
                final JLabel frageHinzuF;
                final JLabel frageHinzuG;
                final JLabel frageHinzuH;
                final JLabel frageHinzuI;
                final JLabel frageHinzuJ;
                final JTextField antwortHinzuA;
                final JTextField antwortHinzuB;
                final JTextField antwortHinzuC;
                final JTextField antwortHinzuD;
                final JTextField antwortHinzuE;
                final JTextField antwortHinzuF;
                final JTextField antwortHinzuG;
                final JTextField antwortHinzuH;
                final JTextField antwortHinzuI;
                final JTextField antwortHinzuJ;
                final JButton okHinzu;
                
                
                
            
            //Menu
            final JMenuBar menuezeile;
            final JMenu menuHome;
            final JMenu menuTiere;
            final JMenu menuPersonal;
            final JMenu menuRaum;
            final JMenu menuHelfer;
            final JMenuItem uberUnsHome;
            final JMenuItem suchenT;
            final JMenuItem hinzufuegenT;
            final JMenuItem loeschenT;
            final JMenuItem suchenP;
            final JMenuItem hinzufuegenP;
            final JMenuItem loeschenP;
            final JMenuItem suchenR;
            final JMenuItem hinzufuegenR;
            final JMenuItem loeschenR;
            final JMenuItem suchenH;
            final JMenuItem hinzufuegenH;
            final JMenuItem loeschenH;

            
        //Initialisierung
        fenster = new JFrame();
        fenster.setBounds(0,0,500,500);
        
        
            //Home
        
                //Startseite
                grundHomeUeber = new JPanel();
                grundHomeUeber.setLayout(null);
                grundHomeUeber.setBounds(0,0,500,500);
                grundHomeUeber.setBackground(new Color(182,236,255));
                uberschriftHome = new JLabel("Tierheim Berlin");
                uberschriftHome.setBounds(20,30,300,30);
                uberschriftHome.setFont(new Font("Arial", Font.BOLD, 30));
                logo = new JLabel(new ImageIcon("tierheimgruen.tiff"));
                logo.setBounds(20,200,100,100);
                speichernbeenden = new JButton("Speichern und beenden");
                speichernbeenden.setBounds(50,100,250,50);
                
                //suchen und löschen für Tiere, Personal, Helfer, Raum
                grundSuchen = new JPanel();
                grundSuchen.setLayout(null);
                grundSuchen.setBounds(0,0,500,500);
                frageA = new JLabel();
                frageA.setBounds(20,20,215,20);
                frageB = new JLabel();
                frageB.setBounds(20,60,215,20);
                final String comboBoxListe[] = {"Katze", "Hund", "Vogel","ASlles"};
                auswahl = new JComboBox(comboBoxListe);
                auswahl.setBounds(250,20,150,20);
                kriterium = new JTextField();
                kriterium.setBounds(250,60,150,20);
                bestaetigen = new JButton("Ok");
                bestaetigen.setBounds(430,60,50,20);
                meldung = new JLabel();
                meldung.setBounds(20,100,215,20);
                ausgabe = new JLabel();
                suchergebnis = new JFrame();
                
                //hinzufügen
                grundHinzu = new JPanel();
                grundHinzu.setLayout(null);
                ueberschriftHinzu = new JLabel();
                ueberschriftHinzu.setFont( new Font("Arial", Font.BOLD, 17));
                ueberschriftHinzu.setBounds(20,20,200,20);
                frageHinzuA = new JLabel();
                frageHinzuA.setBounds(20,70,100,20);
                frageHinzuB = new JLabel();
                frageHinzuB.setBounds(20,110,100,20);
                frageHinzuC = new JLabel();
                frageHinzuC.setBounds(20,150,100,20);
                frageHinzuD = new JLabel();
                frageHinzuD.setBounds(20,190,100,20);
                frageHinzuE = new JLabel();
                frageHinzuE.setBounds(20,230,100,20);
                frageHinzuF = new JLabel();
                frageHinzuF.setBounds(20,270,100,20);
                frageHinzuG = new JLabel();
                frageHinzuG.setBounds(20,310,100,20);
                frageHinzuH = new JLabel();
                frageHinzuH.setBounds(20,350,100,20);
                frageHinzuI = new JLabel();
                frageHinzuI.setBounds(20,390,100,20);
                frageHinzuJ = new JLabel();
                frageHinzuJ.setBounds(20,430,100,20);
                antwortHinzuA = new JTextField();
                antwortHinzuA.setBounds(150,70,100,20);
                antwortHinzuB = new JTextField();
                antwortHinzuB.setBounds(150,110,100,20);
                antwortHinzuC = new JTextField();
                antwortHinzuC.setBounds(150,150,100,20);
                antwortHinzuD = new JTextField();
                antwortHinzuD.setBounds(150,190,100,20);
                antwortHinzuE = new JTextField();
                antwortHinzuE.setBounds(150,230,100,20);
                antwortHinzuF = new JTextField();
                antwortHinzuF.setBounds(150,270,100,20);
                antwortHinzuG = new JTextField();
                antwortHinzuG.setBounds(150,310,100,20);
                antwortHinzuH = new JTextField();
                antwortHinzuH.setBounds(150,350,100,20);
                antwortHinzuI = new JTextField();
                antwortHinzuI.setBounds(150,390,100,20);
                antwortHinzuJ = new JTextField();
                antwortHinzuJ.setBounds(150,430,100,20);
                okHinzu = new JButton("Ok");
                okHinzu.setBounds(300,430,50,20);
            
            //Menu
            menuezeile = new JMenuBar();
            
                //Home
                menuHome = new JMenu("Home");
                    //Startseite
                    uberUnsHome = new JMenuItem("Startseite");
                    uberUnsHome.addActionListener(new ActionListener (){
                        @Override
                          public void actionPerformed(ActionEvent e){
                                fenster.remove(grundSuchen);
                                fenster.remove(grundHinzu);
                                fenster.add(grundHomeUeber);
                                fenster.repaint();
                                
                            }
                    });
                    //Speichern und beenden
                    speichernbeenden.addActionListener(new ActionListener (){
                        @Override
                        public void actionPerformed(ActionEvent e){
                            TierheimMain.speichernbeenden();
                        }
                    });
                
                //Suchen, löschen für Tiere/Personal/Helfer/Raum
                menuTiere = new JMenu("Tiere");
                    //suchen
                    suchenT = new JMenuItem("Suchen");
                    suchenT.addActionListener(new ActionListener (){
                        @Override
                            public void actionPerformed(ActionEvent e){
                                fenster.remove(grundHomeUeber);
                                fenster.remove(grundHinzu);
                                fenster.add(grundSuchen);
                                frageA.setText("Tierart suchen");
                                frageB.setText("Bestimmte Nummer suchen?");
                                frageB.setVisible(true);
                                kriterium.setVisible(true);
                                auswahl.removeAllItems();
                                auswahl.addItem("Alle");
                                auswahl.addItem("Hund");
                                auswahl.addItem("Katze");
                                auswahl.addItem("Kleintier");
                                auswahl.addItem("Vogel");
                                bestaetigen.setBounds(430,60,50,20);
                                //meldung.setText("Folgende Tiere wurden gefunden");
                                fenster.repaint();
                                
                            }
                    });
                    //hinzufügen
                    hinzufuegenT = new JMenuItem("Hinzufügen");
                    hinzufuegenT.addActionListener(new ActionListener (){
                        @Override
                          public void actionPerformed(ActionEvent e){
                                fenster.remove(grundHomeUeber);
                                fenster.remove(grundHinzu);
                                fenster.add(grundSuchen);
                                frageA.setText("Tierart hinzufügen");
                                frageB.setVisible(false);
                                kriterium.setVisible(false);
                                auswahl.removeAllItems();
                                auswahl.addItem("Hund");
                                auswahl.addItem("Katze");
                                auswahl.addItem("Kleintier");
                                auswahl.addItem("Vogel");
                                bestaetigen.setBounds(430,20,50,20);
                                fenster.repaint();
                                
                                frageHinzuA.setText("Nummer");
                                frageHinzuB.setText("Name");
                                frageHinzuC.setText("Geschlecht");
                                frageHinzuD.setText("Farbe");
                                frageHinzuE.setText("Geburtsdatum");
                                frageHinzuF.setText("Gebühr");
                                frageHinzuG.setText("");
                                frageHinzuH.setText("");
                                frageHinzuI.setText("");
                                frageHinzuJ.setText("");
                                antwortHinzuD.setVisible(true);
                                antwortHinzuE.setVisible(true);
                                antwortHinzuF.setVisible(true);
                                antwortHinzuG.setVisible(false);
                                antwortHinzuH.setVisible(false);
                                antwortHinzuI.setVisible(false);
                                antwortHinzuJ.setVisible(false);
                                
                                
                            }
                    });
                    //löschen
                    loeschenT = new JMenuItem("Löschen");
                    loeschenT.addActionListener(new ActionListener (){
                        @Override
                          public void actionPerformed(ActionEvent e){
                                fenster.remove(grundHomeUeber);
                                fenster.remove(grundHinzu);
                                fenster.add(grundSuchen);
                                frageA.setText("Tierart löschen");
                                frageB.setText("Bestimmte Nummer löschen?");
                                frageB.setVisible(true);
                                kriterium.setVisible(true);
                                auswahl.removeAllItems();
                                auswahl.addItem("Alle");
                                auswahl.addItem("Hund");
                                auswahl.addItem("Katze");
                                auswahl.addItem("Kleintier");
                                auswahl.addItem("Vogel");
                                bestaetigen.setBounds(430,60,50,20);
                                //meldung.setText("Löschen abgeschlossen");
                                fenster.repaint();
                            }
                    });
                //Personal
                menuPersonal = new JMenu("Personal");
                    //suchen
                    suchenP = new JMenuItem("Suchen");
                    suchenP.addActionListener(new ActionListener (){
                        @Override
                          public void actionPerformed(ActionEvent e){
                                fenster.remove(grundHomeUeber);
                                fenster.remove(grundHinzu);
                                fenster.add(grundSuchen);
                                frageA.setText("Personalart suchen");
                                frageB.setText("Bestimmte Nummer suchen?");
                                frageB.setVisible(true);
                                kriterium.setVisible(true);
                                auswahl.removeAllItems();
                                auswahl.addItem("Alle");
                                auswahl.addItem("Arzt");
                                auswahl.addItem("Pfleger");
                                auswahl.addItem("Verwalter");
                                bestaetigen.setBounds(430,60,50,20);
                                //meldung.setText("Folgendes Personal wurden gefunden");
                                fenster.repaint();
                            }
                    });
                    //hinzufügen
                    hinzufuegenP = new JMenuItem("Hinzufügen");
                    hinzufuegenP.addActionListener(new ActionListener (){
                        @Override
                          public void actionPerformed(ActionEvent e){
                                fenster.remove(grundHomeUeber);
                                fenster.remove(grundHinzu);
                                fenster.add(grundSuchen);
                                frageA.setText("Personalart hinzufügen");
                                frageB.setVisible(false);
                                kriterium.setVisible(false);
                                auswahl.removeAllItems();
                                auswahl.addItem("Arzt");
                                auswahl.addItem("Pfleger");
                                auswahl.addItem("Verwalter");
                                bestaetigen.setBounds(430,20,50,20);
                                fenster.repaint();
                                frageHinzuA.setText("Nummer");
                                frageHinzuB.setText("Name");
                                frageHinzuC.setText("Vorname");
                                frageHinzuD.setText("Straße und Nr.");
                                frageHinzuE.setText("PLZ");
                                frageHinzuF.setText("Ort");
                                frageHinzuG.setText("Geburtsdatum");
                                frageHinzuH.setText("Telefonnr.");
                                frageHinzuI.setText("Mail");
                                frageHinzuJ.setText("Gehalt");
                                antwortHinzuD.setVisible(true);
                                antwortHinzuE.setVisible(true);
                                antwortHinzuF.setVisible(true);
                                antwortHinzuG.setVisible(true);
                                antwortHinzuH.setVisible(true);
                                antwortHinzuI.setVisible(true);
                                antwortHinzuJ.setVisible(true);
                                
                            }
                    });
                    loeschenP = new JMenuItem("Löschen");
                    loeschenP.addActionListener(new ActionListener (){
                        @Override
                          public void actionPerformed(ActionEvent e){
                                fenster.remove(grundHomeUeber);
                                fenster.remove(grundHinzu);
                                fenster.add(grundSuchen);
                                frageA.setText("Personalart löschen");
                                frageB.setText("Bestimmte Nummer löschen?");
                                frageB.setVisible(true);
                                kriterium.setVisible(true);
                                auswahl.removeAllItems();
                                auswahl.addItem("Alle");
                                auswahl.addItem("Arzt");
                                auswahl.addItem("Pfleger");
                                auswahl.addItem("Verwalter");
                                bestaetigen.setBounds(430,60,50,20);
                                //meldung.setText("Löschen abgeschlossen");
                                fenster.repaint();
                            }
                    });
                //Helfer
                menuHelfer = new JMenu("Helfer");
                    //suchen
                    suchenH = new JMenuItem("Suchen");
                    suchenH.addActionListener(new ActionListener (){
                        @Override
                          public void actionPerformed(ActionEvent e){
                                fenster.remove(grundHomeUeber);
                                fenster.remove(grundHinzu);
                                fenster.add(grundSuchen);
                                frageA.setText("Helferart suchen");
                                frageB.setText("Bestimmte Nummer suchen?");
                                frageB.setVisible(true);
                                kriterium.setVisible(true);
                                auswahl.removeAllItems();
                                auswahl.addItem("Alle");
                                auswahl.addItem("Dauerhaften");
                                auswahl.addItem("Zeitweisen");
                                bestaetigen.setBounds(430,60,50,20);
                                //meldung.setText("Folgende Helfer wurden gefunden");
                                fenster.repaint();
                            }
                    });
                    //hinzufügen
                    hinzufuegenH = new JMenuItem("Hinzufügen");
                    hinzufuegenH.addActionListener(new ActionListener (){
                        @Override
                          public void actionPerformed(ActionEvent e){
                                fenster.remove(grundHomeUeber);
                                fenster.remove(grundHinzu);
                                fenster.add(grundSuchen);
                                frageA.setText("Helferart hinzufügen");
                                frageB.setVisible(false);
                                kriterium.setVisible(false);
                                auswahl.removeAllItems();
                                auswahl.addItem("Dauerhaften");
                                auswahl.addItem("Zeitweisen");
                                bestaetigen.setBounds(430,20,50,20);
                                fenster.repaint();
                                frageHinzuA.setText("Nummer");
                                frageHinzuB.setText("Name");
                                frageHinzuC.setText("Vorname");
                                frageHinzuD.setText("Straße und Nr.");
                                frageHinzuE.setText("PLZ");
                                frageHinzuF.setText("Ort");
                                frageHinzuG.setText("Geburtsdatum");
                                frageHinzuH.setText("Telefonnr.");
                                frageHinzuI.setText("Mail");
                                antwortHinzuD.setVisible(true);
                                antwortHinzuE.setVisible(true);
                                antwortHinzuF.setVisible(true);
                                antwortHinzuG.setVisible(true);
                                antwortHinzuH.setVisible(true);
                                antwortHinzuI.setVisible(true);
                                antwortHinzuJ.setVisible(false);
                                
                            }
                    });
                    //löschen
                    loeschenH = new JMenuItem("Löschen");
                    loeschenH.addActionListener(new ActionListener (){
                        @Override
                          public void actionPerformed(ActionEvent e){
                                fenster.remove(grundHomeUeber);
                                fenster.remove(grundHinzu);
                                fenster.add(grundSuchen);
                                frageA.setText("Helferart löschen");
                                frageB.setText("Bestimmte Nummer löschen?");
                                frageB.setVisible(true);
                                kriterium.setVisible(true);
                                auswahl.removeAllItems();
                                auswahl.addItem("Alle");
                                auswahl.addItem("Dauerhaften");
                                auswahl.addItem("Zeitweisen");
                                bestaetigen.setBounds(430,60,50,20);
                                //meldung.setText("Löschen abgeschlossen");
                                fenster.repaint();
                            }
                    });
                //Raum
                menuRaum = new JMenu("Raum");
                    //suchen
                    suchenR = new JMenuItem("Suchen");
                    suchenR.addActionListener(new ActionListener (){
                        @Override
                          public void actionPerformed(ActionEvent e){
                                fenster.remove(grundHomeUeber);
                                fenster.remove(grundHinzu);
                                fenster.add(grundSuchen);
                                frageA.setText("Raumart suchen");
                                frageB.setText("Bestimmte Nummer suchen?");
                                frageB.setVisible(true);
                                kriterium.setVisible(true);
                                auswahl.removeAllItems();
                                auswahl.addItem("Alle");
                                bestaetigen.setBounds(430,60,50,20);
                                //meldung.setText("Folgende Räume wurden gefunden");
                                fenster.repaint();
                            }
                    });
                    //hinzufügen
                    hinzufuegenR = new JMenuItem("Hinzufügen");
                    hinzufuegenR.addActionListener(new ActionListener (){
                        @Override
                          public void actionPerformed(ActionEvent e){
                                fenster.remove(grundHomeUeber);
                                fenster.remove(grundHinzu);
                                fenster.add(grundSuchen);
                                frageA.setText("Raumart hinzufügen");
                                frageB.setVisible(false);
                                kriterium.setVisible(false);
                                auswahl.removeAllItems();
                                auswahl.addItem("Alle");
                                bestaetigen.setBounds(430,20,50,20);
                                fenster.repaint();
                                frageHinzuA.setText("Nummer");
                                frageHinzuB.setText("Tierart");
                                frageHinzuC.setText("Größe");
                                frageHinzuD.setText("");
                                frageHinzuE.setText("");
                                frageHinzuF.setText("");
                                frageHinzuG.setText("");
                                frageHinzuH.setText("");
                                frageHinzuI.setText("");
                                antwortHinzuD.setVisible(false);
                                antwortHinzuE.setVisible(false);
                                antwortHinzuF.setVisible(false);
                                antwortHinzuG.setVisible(false);
                                antwortHinzuH.setVisible(false);
                                antwortHinzuI.setVisible(false);
                                antwortHinzuJ.setVisible(false);
                            }
                    });
                    //löschen
                    loeschenR = new JMenuItem("Löschen");
                    loeschenR.addActionListener(new ActionListener (){
                        @Override
                          public void actionPerformed(ActionEvent e){
                                fenster.remove(grundHomeUeber);
                                fenster.remove(grundHinzu);
                                fenster.add(grundSuchen);
                                frageA.setText("Raumart loeschen");
                                frageB.setText("Bestimmte Nummer löschen?");
                                frageB.setVisible(true);
                                kriterium.setVisible(true);
                                auswahl.removeAllItems();
                                auswahl.addItem("Alle");
                                bestaetigen.setBounds(430,60,50,20);
                                //meldung.setText("Löschen abgeschlossen");
                                fenster.repaint();
                            }
                    });
                
                //Ok Button
                bestaetigen.addActionListener(new ActionListener (){
                        @Override
                            public void actionPerformed(ActionEvent e){
                                //Tiere
                                    //suchen
                                        ArrayList<Tier> suchergebnisse;
                                        
                                        JLabel nummer = new JLabel("Nummer");
                                        nummer.setFont(new Font("Arial", Font.BOLD, 17));
                                        nummer.setBounds(0,0,149,19);
                                        JLabel name = new JLabel("Name");
                                        name.setFont(new Font("Arial", Font.BOLD, 17));
                                        name.setBounds(150,0,149,19);
                                        JLabel tierart = new JLabel("Tierart");
                                        tierart.setFont(new Font("Arial", Font.BOLD, 17));
                                        tierart.setBounds(300,0,149,19);
                                        JLabel rasse = new JLabel("Rasse");
                                        rasse.setFont(new Font("Arial", Font.BOLD, 17));
                                        rasse.setBounds(450,0,149,19);
                                        JLabel farbe = new JLabel("Farbe");
                                        farbe.setFont(new Font("Arial", Font.BOLD, 17));
                                        farbe.setBounds(600,0,149,19);
                                        JLabel geschlecht = new JLabel("Geschlecht");
                                        geschlecht.setFont(new Font("Arial", Font.BOLD, 17));
                                        geschlecht.setBounds(750,0,149,19);
                                        JLabel gebdat = new JLabel("Geburtsdatum");
                                        gebdat.setFont(new Font("Arial", Font.BOLD, 17));
                                        gebdat.setBounds(900,0,149,19);
                                        
                                        JLabel nummer2;
                                        JLabel name2;
                                        JLabel tierart2;
                                        JLabel rasse2;
                                        JLabel farbe2;
                                        JLabel geschlecht2;
                                        JLabel gebdat2;
                                        JLabel keinergebnis = new JLabel("Es wurde kein Tier gefunden. Bitte verändern Sie die Suchkriterien.");
                                        keinergebnis.setBounds(300,100,0,0);
                                        
                                        //alle
                                        if (frageA.getText()=="Tierart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==0){    
                                            if (kriterium.getText() == "") {
                                                    suchergebnisse = TierheimMain.suchen('a');
                                                    if (suchergebnisse != null) {
                                                        suchergebnis.setBounds(501, 0, 1050, suchergebnisse.size()*20+20);
                                                        suchergebnis.getContentPane().add(nummer);
                                                        suchergebnis.getContentPane().add(name);
                                                        suchergebnis.getContentPane().add(tierart);
                                                        suchergebnis.getContentPane().add(rasse);
                                                        suchergebnis.getContentPane().add(farbe);
                                                        suchergebnis.getContentPane().add(geschlecht);
                                                        suchergebnis.getContentPane().add(gebdat);
                                                        for(int i =0; i<suchergebnisse.size();i++) {
                                                            Tier tier = suchergebnisse.get(i);
                                                            nummer2 = new JLabel(tier.gettNr());
                                                            nummer2.setBounds(0,(i+1)*20,149,19);
                                                            name2 = new JLabel(tier.getName());
                                                            name2.setBounds(0,(i+1)*20,149,19);
                                                            tierart2 = new JLabel(tier.getClass().toString());
                                                            tierart2.setBounds(0,(i+1)*20,149,19);
                                                            rasse2 = new JLabel(tier.gettRasse());
                                                            rasse2.setBounds(0,(i+1)*20,149,19);
                                                            farbe2 = new JLabel(tier.gettFarbe());
                                                            farbe2.setBounds(0,(i+1)*20,149,19);
                                                            geschlecht2 = new JLabel(tier.gettGeschlecht());
                                                            geschlecht2.setBounds(0,(i+1)*20,149,19);
                                                            gebdat2 = new JLabel(tier.getgebDat());
                                                            gebdat2.setBounds(0,(i+1)*20,149,19);
                                                            suchergebnis.getContentPane().add(nummer2);
                                                            suchergebnis.getContentPane().add(name2);
                                                            suchergebnis.getContentPane().add(tierart2);
                                                            suchergebnis.getContentPane().add(rasse2);
                                                            suchergebnis.getContentPane().add(farbe2);
                                                            suchergebnis.getContentPane().add(geschlecht2);
                                                            suchergebnis.getContentPane().add(gebdat2);
                                                        }
                                                    }
                                                    else {
                                                        suchergebnis.setBounds(501,0,350,150);
                                                        suchergebnis.getContentPane().add(keinergebnis);
                                                    }
                                                }
                                                else {
                                                    suchergebnisse = TierheimMain.suchen('a', kriterium.getText());
                                                    if (suchergebnisse != null) {
                                                        suchergebnis.setBounds(501, 0, 1050, suchergebnisse.size()*20+20);
                                                        suchergebnis.getContentPane().add(nummer);
                                                        suchergebnis.getContentPane().add(name);
                                                        suchergebnis.getContentPane().add(tierart);
                                                        suchergebnis.getContentPane().add(rasse);
                                                        suchergebnis.getContentPane().add(farbe);
                                                        suchergebnis.getContentPane().add(geschlecht);
                                                        suchergebnis.getContentPane().add(gebdat);
                                                        for(int i =0; i<suchergebnisse.size();i++) {
                                                            Tier tier = suchergebnisse.get(i);
                                                            nummer2 = new JLabel(tier.gettNr());
                                                            nummer2.setBounds(0,(i+1)*20,149,19);
                                                            name2 = new JLabel(tier.getName());
                                                            name2.setBounds(0,(i+1)*20,149,19);
                                                            tierart2 = new JLabel(tier.getClass().toString());
                                                            tierart2.setBounds(0,(i+1)*20,149,19);
                                                            rasse2 = new JLabel(tier.gettRasse());
                                                            rasse2.setBounds(0,(i+1)*20,149,19);
                                                            farbe2 = new JLabel(tier.gettFarbe());
                                                            farbe2.setBounds(0,(i+1)*20,149,19);
                                                            geschlecht2 = new JLabel(tier.gettGeschlecht());
                                                            geschlecht2.setBounds(0,(i+1)*20,149,19);
                                                            gebdat2 = new JLabel(tier.getgebDat());
                                                            gebdat2.setBounds(0,(i+1)*20,149,19);
                                                            suchergebnis.getContentPane().add(nummer2);
                                                            suchergebnis.getContentPane().add(name2);
                                                            suchergebnis.getContentPane().add(tierart2);
                                                            suchergebnis.getContentPane().add(rasse2);
                                                            suchergebnis.getContentPane().add(farbe2);
                                                            suchergebnis.getContentPane().add(geschlecht2);
                                                            suchergebnis.getContentPane().add(gebdat2);
                                                        }
                                                    }
                                                    else {
                                                        suchergebnis.setBounds(501,0,350,150);
                                                        suchergebnis.getContentPane().add(keinergebnis);
                                                    }
                                                }
                                                suchergebnis.setLocation(50,50);
                                                suchergebnis.setVisible(true);
                                        }
                                        //Hund
                                            if (frageA.getText()=="Tierart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==1){
                                                if (kriterium.getText() == "") {
                                                    suchergebnisse = TierheimMain.suchen('h');
                                                    if (suchergebnisse != null) {
                                                        suchergebnis.setBounds(501, 0, 1050, suchergebnisse.size()*20+20);
                                                        suchergebnis.add(nummer);
                                                        suchergebnis.add(name);
                                                        suchergebnis.add(tierart);
                                                        suchergebnis.add(rasse);
                                                        suchergebnis.add(farbe);
                                                        suchergebnis.add(geschlecht);
                                                        suchergebnis.add(gebdat);
                                                        for(int i =0; i<suchergebnisse.size();i++) {
                                                            Tier tier = suchergebnisse.get(i);
                                                            nummer2 = new JLabel(tier.gettNr());
                                                            nummer2.setBounds(0,(i+1)*20,149,19);
                                                            name2 = new JLabel(tier.getName());
                                                            name2.setBounds(0,(i+1)*20,149,19);
                                                            tierart2 = new JLabel(tier.getClass().toString());
                                                            tierart2.setBounds(0,(i+1)*20,149,19);
                                                            rasse2 = new JLabel(tier.gettRasse());
                                                            rasse2.setBounds(0,(i+1)*20,149,19);
                                                            farbe2 = new JLabel(tier.gettFarbe());
                                                            farbe2.setBounds(0,(i+1)*20,149,19);
                                                            geschlecht2 = new JLabel(tier.gettGeschlecht());
                                                            geschlecht2.setBounds(0,(i+1)*20,149,19);
                                                            gebdat2 = new JLabel(tier.getgebDat());
                                                            gebdat2.setBounds(0,(i+1)*20,149,19);
                                                            suchergebnis.add(nummer2);
                                                            suchergebnis.add(name2);
                                                            suchergebnis.add(tierart2);
                                                            suchergebnis.add(rasse2);
                                                            suchergebnis.add(farbe2);
                                                            suchergebnis.add(geschlecht2);
                                                            suchergebnis.add(gebdat2);
                                                        }
                                                    }
                                                    else {
                                                        suchergebnis.setBounds(501,0,350,150);
                                                        suchergebnis.getContentPane().add(keinergebnis);
                                                    }
                                                }
                                                else {
                                                    suchergebnisse = TierheimMain.suchen('h', kriterium.getText());
                                                    if (suchergebnisse != null) {
                                                        suchergebnis.setBounds(501, 0, 1050, suchergebnisse.size()*20+20);
                                                        suchergebnis.getContentPane().add(nummer);
                                                        suchergebnis.getContentPane().add(name);
                                                        suchergebnis.getContentPane().add(tierart);
                                                        suchergebnis.getContentPane().add(rasse);
                                                        suchergebnis.getContentPane().add(farbe);
                                                        suchergebnis.getContentPane().add(geschlecht);
                                                        suchergebnis.getContentPane().add(gebdat);
                                                        for(int i =0; i<suchergebnisse.size();i++) {
                                                            Tier tier = suchergebnisse.get(i);
                                                            nummer2 = new JLabel(tier.gettNr());
                                                            nummer2.setBounds(0,(i+1)*20,149,19);
                                                            name2 = new JLabel(tier.getName());
                                                            name2.setBounds(0,(i+1)*20,149,19);
                                                            tierart2 = new JLabel(tier.getClass().toString());
                                                            tierart2.setBounds(0,(i+1)*20,149,19);
                                                            rasse2 = new JLabel(tier.gettRasse());
                                                            rasse2.setBounds(0,(i+1)*20,149,19);
                                                            farbe2 = new JLabel(tier.gettFarbe());
                                                            farbe2.setBounds(0,(i+1)*20,149,19);
                                                            geschlecht2 = new JLabel(tier.gettGeschlecht());
                                                            geschlecht2.setBounds(0,(i+1)*20,149,19);
                                                            gebdat2 = new JLabel(tier.getgebDat());
                                                            gebdat2.setBounds(0,(i+1)*20,149,19);
                                                            suchergebnis.getContentPane().add(nummer2);
                                                            suchergebnis.getContentPane().add(name2);
                                                            suchergebnis.getContentPane().add(tierart2);
                                                            suchergebnis.getContentPane().add(rasse2);
                                                            suchergebnis.getContentPane().add(farbe2);
                                                            suchergebnis.getContentPane().add(geschlecht2);
                                                            suchergebnis.getContentPane().add(gebdat2);
                                                        }
                                                    }
                                                    else {
                                                        suchergebnis.setBounds(501,0,350,150);
                                                        suchergebnis.getContentPane().add(keinergebnis);
                                                    }
                                                }
                                                suchergebnis.setLocation(50,50);
                                                suchergebnis.setVisible(true);
                                            }
                                        //Katze
                                            if (frageA.getText()=="Tierart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==2 && kriterium.getText() == ""){
                                                if (kriterium.getText() == "") {
                                                    suchergebnisse = TierheimMain.suchen('k');
                                                    if (suchergebnisse != null) {
                                                        suchergebnis.setBounds(501, 0, 1050, suchergebnisse.size()*20+20);
                                                        suchergebnis.getContentPane().add(nummer);
                                                        suchergebnis.getContentPane().add(name);
                                                        suchergebnis.getContentPane().add(tierart);
                                                        suchergebnis.getContentPane().add(rasse);
                                                        suchergebnis.getContentPane().add(farbe);
                                                        suchergebnis.getContentPane().add(geschlecht);
                                                        suchergebnis.getContentPane().add(gebdat);
                                                        for(int i =0; i<suchergebnisse.size();i++) {
                                                            Tier tier = suchergebnisse.get(i);
                                                            nummer2 = new JLabel(tier.gettNr());
                                                            nummer2.setBounds(0,(i+1)*20,149,19);
                                                            name2 = new JLabel(tier.getName());
                                                            name2.setBounds(0,(i+1)*20,149,19);
                                                            tierart2 = new JLabel(tier.getClass().toString());
                                                            tierart2.setBounds(0,(i+1)*20,149,19);
                                                            rasse2 = new JLabel(tier.gettRasse());
                                                            rasse2.setBounds(0,(i+1)*20,149,19);
                                                            farbe2 = new JLabel(tier.gettFarbe());
                                                            farbe2.setBounds(0,(i+1)*20,149,19);
                                                            geschlecht2 = new JLabel(tier.gettGeschlecht());
                                                            geschlecht2.setBounds(0,(i+1)*20,149,19);
                                                            gebdat2 = new JLabel(tier.getgebDat());
                                                            gebdat2.setBounds(0,(i+1)*20,149,19);
                                                            suchergebnis.getContentPane().add(nummer2);
                                                            suchergebnis.getContentPane().add(name2);
                                                            suchergebnis.getContentPane().add(tierart2);
                                                            suchergebnis.getContentPane().add(rasse2);
                                                            suchergebnis.getContentPane().add(farbe2);
                                                            suchergebnis.getContentPane().add(geschlecht2);
                                                            suchergebnis.getContentPane().add(gebdat2);
                                                        }
                                                    }
                                                    else {
                                                        suchergebnis.setBounds(501,0,350,150);
                                                        suchergebnis.getContentPane().add(keinergebnis);
                                                    }
                                                }
                                                else {
                                                    suchergebnisse = TierheimMain.suchen('k', kriterium.getText());
                                                    if (suchergebnisse != null) {
                                                        suchergebnis.setBounds(501, 0, 1050, suchergebnisse.size()*20+20);
                                                        suchergebnis.getContentPane().add(nummer);
                                                        suchergebnis.getContentPane().add(name);
                                                        suchergebnis.getContentPane().add(tierart);
                                                        suchergebnis.getContentPane().add(rasse);
                                                        suchergebnis.getContentPane().add(farbe);
                                                        suchergebnis.getContentPane().add(geschlecht);
                                                        suchergebnis.getContentPane().add(gebdat);
                                                        for(int i =0; i<suchergebnisse.size();i++) {
                                                            Tier tier = suchergebnisse.get(i);
                                               
                                                            nummer2 = new JLabel(tier.gettNr());
                                                            nummer2.setBounds(0,(i+1)*20,149,19);
                                                            name2 = new JLabel(tier.getName());
                                                            name2.setBounds(0,(i+1)*20,149,19);
                                                            tierart2 = new JLabel(tier.getClass().toString());
                                                            tierart2.setBounds(0,(i+1)*20,149,19);
                                                            rasse2 = new JLabel(tier.gettRasse());
                                                            rasse2.setBounds(0,(i+1)*20,149,19);
                                                            farbe2 = new JLabel(tier.gettFarbe());
                                                            farbe2.setBounds(0,(i+1)*20,149,19);
                                                            geschlecht2 = new JLabel(tier.gettGeschlecht());
                                                            geschlecht2.setBounds(0,(i+1)*20,149,19);
                                                            gebdat2 = new JLabel(tier.getgebDat());
                                                            gebdat2.setBounds(0,(i+1)*20,149,19);
                                                            suchergebnis.getContentPane().add(nummer2);
                                                            suchergebnis.getContentPane().add(name2);
                                                            suchergebnis.getContentPane().add(tierart2);
                                                            suchergebnis.getContentPane().add(rasse2);
                                                            suchergebnis.getContentPane().add(farbe2);
                                                            suchergebnis.getContentPane().add(geschlecht2);
                                                            suchergebnis.getContentPane().add(gebdat2);
                                                        }
                                                    }
                                                    else {
                                                        suchergebnis.setBounds(501,0,350,150);
                                                        suchergebnis.getContentPane().add(keinergebnis);
                                                    }
                                                }
                                                suchergebnis.setLocation(50,50);
                                                suchergebnis.setVisible(true);
                                            }
                                        //Kleintier
                                            if (frageA.getText()=="Tierart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==3 && kriterium.getText() == ""){
                                            if (kriterium.getText() == "") {
                                                    suchergebnisse = TierheimMain.suchen('m');
                                                    if (suchergebnisse != null) {
                                                        suchergebnis.setBounds(501, 0, 1050, suchergebnisse.size()*20+20);
                                                        suchergebnis.getContentPane().add(nummer);
                                                        suchergebnis.getContentPane().add(name);
                                                        suchergebnis.getContentPane().add(tierart);
                                                        suchergebnis.getContentPane().add(rasse);
                                                        suchergebnis.getContentPane().add(farbe);
                                                        suchergebnis.getContentPane().add(geschlecht);
                                                        suchergebnis.getContentPane().add(gebdat);
                                                        for(int i =0; i<suchergebnisse.size();i++) {
                                                            Tier tier = suchergebnisse.get(i);
                                                            nummer2 = new JLabel(tier.gettNr());
                                                            nummer2.setBounds(0,(i+1)*20,149,19);
                                                            name2 = new JLabel(tier.getName());
                                                            name2.setBounds(0,(i+1)*20,149,19);
                                                            tierart2 = new JLabel(tier.getClass().toString());
                                                            tierart2.setBounds(0,(i+1)*20,149,19);
                                                            rasse2 = new JLabel(tier.gettRasse());
                                                            rasse2.setBounds(0,(i+1)*20,149,19);
                                                            farbe2 = new JLabel(tier.gettFarbe());
                                                            farbe2.setBounds(0,(i+1)*20,149,19);
                                                            geschlecht2 = new JLabel(tier.gettGeschlecht());
                                                            geschlecht2.setBounds(0,(i+1)*20,149,19);
                                                            gebdat2 = new JLabel(tier.getgebDat());
                                                            gebdat2.setBounds(0,(i+1)*20,149,19);
                                                            suchergebnis.getContentPane().add(nummer2);
                                                            suchergebnis.getContentPane().add(name2);
                                                            suchergebnis.getContentPane().add(tierart2);
                                                            suchergebnis.getContentPane().add(rasse2);
                                                            suchergebnis.getContentPane().add(farbe2);
                                                            suchergebnis.getContentPane().add(geschlecht2);
                                                            suchergebnis.getContentPane().add(gebdat2);
                                                        }
                                                    }
                                                    else {
                                                        suchergebnis.setBounds(501,0,350,150);
                                                        suchergebnis.getContentPane().add(keinergebnis);
                                                    }
                                                }
                                                else {
                                                    suchergebnisse = TierheimMain.suchen('m', kriterium.getText());
                                                    if (suchergebnisse != null) {
                                                        suchergebnis.setBounds(501, 0, 1050, suchergebnisse.size()*20+20);
                                                        suchergebnis.getContentPane().add(nummer);
                                                        suchergebnis.getContentPane().add(name);
                                                        suchergebnis.getContentPane().add(tierart);
                                                        suchergebnis.getContentPane().add(rasse);
                                                        suchergebnis.getContentPane().add(farbe);
                                                        suchergebnis.getContentPane().add(geschlecht);
                                                        suchergebnis.getContentPane().add(gebdat);
                                                        for(int i =0; i<suchergebnisse.size();i++) {
                                                            Tier tier = suchergebnisse.get(i);
                                                            nummer2 = new JLabel(tier.gettNr());
                                                            nummer2.setBounds(0,(i+1)*20,149,19);
                                                            name2 = new JLabel(tier.getName());
                                                            name2.setBounds(0,(i+1)*20,149,19);
                                                            tierart2 = new JLabel(tier.getClass().toString());
                                                            tierart2.setBounds(0,(i+1)*20,149,19);
                                                            rasse2 = new JLabel(tier.gettRasse());
                                                            rasse2.setBounds(0,(i+1)*20,149,19);
                                                            farbe2 = new JLabel(tier.gettFarbe());
                                                            farbe2.setBounds(0,(i+1)*20,149,19);
                                                            geschlecht2 = new JLabel(tier.gettGeschlecht());
                                                            geschlecht2.setBounds(0,(i+1)*20,149,19);
                                                            gebdat2 = new JLabel(tier.getgebDat());
                                                            gebdat2.setBounds(0,(i+1)*20,149,19);
                                                            suchergebnis.getContentPane().add(nummer2);
                                                            suchergebnis.getContentPane().add(name2);
                                                            suchergebnis.getContentPane().add(tierart2);
                                                            suchergebnis.getContentPane().add(rasse2);
                                                            suchergebnis.getContentPane().add(farbe2);
                                                            suchergebnis.getContentPane().add(geschlecht2);
                                                            suchergebnis.getContentPane().add(gebdat2);
                                                        }
                                                    }
                                                    else {
                                                        suchergebnis.setBounds(501,0,350,150);
                                                        suchergebnis.getContentPane().add(keinergebnis);
                                                    }
                                                }
                                                suchergebnis.setLocation(50,50);
                                                suchergebnis.setVisible(true);
                                            }
                                        //Vogel
                                            if (frageA.getText()=="Tierart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==4 && kriterium.getText() == ""){
                                                if (kriterium.getText() == "") {
                                                    suchergebnisse = TierheimMain.suchen('v');
                                                    if (suchergebnisse != null) {
                                                        suchergebnis.setBounds(501, 0, 1050, suchergebnisse.size()*20+20);
                                                        suchergebnis.getContentPane().add(nummer);
                                                        suchergebnis.getContentPane().add(name);
                                                        suchergebnis.getContentPane().add(tierart);
                                                        suchergebnis.getContentPane().add(rasse);
                                                        suchergebnis.getContentPane().add(farbe);
                                                        suchergebnis.getContentPane().add(geschlecht);
                                                        suchergebnis.getContentPane().add(gebdat);
                                                        for(int i =0; i<suchergebnisse.size();i++) {
                                                            Tier tier = suchergebnisse.get(i);
                                                            nummer2 = new JLabel(tier.gettNr());
                                                            nummer2.setBounds(0,(i+1)*20,149,19);
                                                            name2 = new JLabel(tier.getName());
                                                            name2.setBounds(0,(i+1)*20,149,19);
                                                            tierart2 = new JLabel(tier.getClass().toString());
                                                            tierart2.setBounds(0,(i+1)*20,149,19);
                                                            rasse2 = new JLabel(tier.gettRasse());
                                                            rasse2.setBounds(0,(i+1)*20,149,19);
                                                            farbe2 = new JLabel(tier.gettFarbe());
                                                            farbe2.setBounds(0,(i+1)*20,149,19);
                                                            geschlecht2 = new JLabel(tier.gettGeschlecht());
                                                            geschlecht2.setBounds(0,(i+1)*20,149,19);
                                                            gebdat2 = new JLabel(tier.getgebDat());
                                                            gebdat2.setBounds(0,(i+1)*20,149,19);
                                                            suchergebnis.getContentPane().add(nummer2);
                                                            suchergebnis.getContentPane().add(name2);
                                                            suchergebnis.getContentPane().add(tierart2);
                                                            suchergebnis.getContentPane().add(rasse2);
                                                            suchergebnis.getContentPane().add(farbe2);
                                                            suchergebnis.getContentPane().add(geschlecht2);
                                                            suchergebnis.getContentPane().add(gebdat2);
                                                        }
                                                    }
                                                    else {
                                                        suchergebnis.setBounds(501,0,350,150);
                                                        suchergebnis.getContentPane().add(keinergebnis);
                                                    }
                                                }
                                                else {
                                                    suchergebnisse = TierheimMain.suchen('v', kriterium.getText());
                                                    if (suchergebnisse != null) {
                                                        suchergebnis.setBounds(501, 0, 1050, suchergebnisse.size()*20+20);
                                                        suchergebnis.getContentPane().add(nummer);
                                                        suchergebnis.getContentPane().add(name);
                                                        suchergebnis.getContentPane().add(tierart);
                                                        suchergebnis.getContentPane().add(rasse);
                                                        suchergebnis.getContentPane().add(farbe);
                                                        suchergebnis.getContentPane().add(geschlecht);
                                                        suchergebnis.getContentPane().add(gebdat);
                                                        for(int i =0; i<suchergebnisse.size();i++) {
                                                            Tier tier = suchergebnisse.get(i);
                                                            nummer2 = new JLabel(tier.gettNr());
                                                            nummer2.setBounds(0,(i+1)*20,149,19);
                                                            name2 = new JLabel(tier.getName());
                                                            name2.setBounds(0,(i+1)*20,149,19);
                                                            tierart2 = new JLabel(tier.getClass().toString());
                                                            tierart2.setBounds(0,(i+1)*20,149,19);
                                                            rasse2 = new JLabel(tier.gettRasse());
                                                            rasse2.setBounds(0,(i+1)*20,149,19);
                                                            farbe2 = new JLabel(tier.gettFarbe());
                                                            farbe2.setBounds(0,(i+1)*20,149,19);
                                                            geschlecht2 = new JLabel(tier.gettGeschlecht());
                                                            geschlecht2.setBounds(0,(i+1)*20,149,19);
                                                            gebdat2 = new JLabel(tier.getgebDat());
                                                            gebdat2.setBounds(0,(i+1)*20,149,19);
                                                            suchergebnis.getContentPane().add(nummer2);
                                                            suchergebnis.getContentPane().add(name2);
                                                            suchergebnis.getContentPane().add(tierart2);
                                                            suchergebnis.getContentPane().add(rasse2);
                                                            suchergebnis.getContentPane().add(farbe2);
                                                            suchergebnis.getContentPane().add(geschlecht2);
                                                            suchergebnis.getContentPane().add(gebdat2);
                                                        }
                                                    }
                                                    else {
                                                        suchergebnis.setBounds(501,0,350,150);
                                                        suchergebnis.getContentPane().add(keinergebnis);
                                                    }
                                                }
                                                suchergebnis.setLocation(50,50);
                                                suchergebnis.setVisible(true);
                                            }
                                        //Anzeigen von JFrame suchergebnis, unabhängig von Suchkriterien.
                                        
                                        
                                    //hinzufügen Hund
                                        if (frageA.getText()=="Tierart hinzufügen" && auswahl.getSelectedIndex() == 0){
                                        fenster.remove(grundHomeUeber);
                                        fenster.remove(grundSuchen);
                                        fenster.add(grundHinzu);
                                        ueberschriftHinzu.setText("Hund");
                                        fenster.repaint();
                                        }
                                    // hinzufügen Katze
                                        if (frageA.getText()=="Tierart hinzufügen" && auswahl.getSelectedIndex() == 1){
                                        fenster.remove(grundHomeUeber);
                                        fenster.remove(grundSuchen);
                                        fenster.add(grundHinzu);
                                        ueberschriftHinzu.setText("Katze");
                                        fenster.repaint();
                                        }
                                    // hinzufügen Kleintier
                                        if (frageA.getText()=="Tierart hinzufügen" && auswahl.getSelectedIndex() == 2){
                                        fenster.remove(grundHomeUeber);
                                        fenster.remove(grundSuchen);
                                        fenster.add(grundHinzu);
                                        ueberschriftHinzu.setText("Kleintier");
                                        fenster.repaint();
                                        }
                                    // hinzufügen Vogel
                                        if (frageA.getText()=="Tierart hinzufügen" && auswahl.getSelectedIndex() == 3){
                                        fenster.remove(grundHomeUeber);
                                        fenster.remove(grundSuchen);
                                        fenster.add(grundHinzu);
                                        ueberschriftHinzu.setText("Vogel");
                                        fenster.repaint();
                                        }
                                    //löschen
                                        JLabel erfolgreich = new JLabel("Das Tier wurde erfolgreich entfernt.");
                                        erfolgreich.setBounds(20,100,215,20);
                                        JLabel nichtErfolgreich= new JLabel ("Das Tier konnte nicht entfernt werden.");
                                        nichtErfolgreich.setBounds(20,100,215,20);
                                        
                                        //alle
                                            if (frageA.getText()=="Tierart löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==0){
                                                if (kriterium.getText() == "") {
                                                    boolean a = TierheimMain.loeschen('a');
                                                    if (a == true) {
                                                        fenster.add(erfolgreich);
                                                    }
                                                    else {
                                                        fenster.add(nichtErfolgreich);
                                                    }
                                                }
                                                else {
                                                    boolean a = TierheimMain.loeschen('a', kriterium.getText());
                                                }
                                                
                                            }
                                            
                                        //Hund
                                            if (frageA.getText()=="Tierart löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==1){
                                                if (kriterium.getText() == "") {
                                                    boolean a = TierheimMain.loeschen('h');
                                                    if (a == true) {
                                                        fenster.add(erfolgreich);
                                                    }
                                                    else {
                                                        fenster.add(nichtErfolgreich);
                                                    }
                                                }
                                                else {
                                                    boolean a = TierheimMain.loeschen('h', kriterium.getText());
                                                }
                                            }
                                        //Katze
                                            if (frageA.getText()=="Tierart löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==2){
                                                if (kriterium.getText() == "") {
                                                    boolean a = TierheimMain.loeschen('k');
                                                    if (a == true) {
                                                        fenster.add(erfolgreich);
                                                    }
                                                    else {
                                                        fenster.add(nichtErfolgreich);
                                                    }
                                                }
                                                else {
                                                    boolean a = TierheimMain.loeschen('k', kriterium.getText());
                                                }
                                            }
                                        //Kleintier
                                            if (frageA.getText()=="Tierart löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==3){
                                                if (kriterium.getText() == "") {
                                                    boolean a = TierheimMain.loeschen('m');
                                                    if (a == true) {
                                                        fenster.add(erfolgreich);
                                                    }
                                                    else {
                                                        fenster.add(nichtErfolgreich);
                                                    }
                                                }
                                                else {
                                                    boolean a = TierheimMain.loeschen('m', kriterium.getText());
                                                }
                                            }
                                        //Vogel
                                            if (frageA.getText()=="Tierart löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==4){
                                                if (kriterium.getText() == "") {
                                                    boolean a = TierheimMain.loeschen('v');
                                                    if (a == true) {
                                                        fenster.add(erfolgreich);
                                                    }
                                                    else {
                                                        fenster.add(nichtErfolgreich);
                                                    }
                                                }
                                                else {
                                                    boolean a = TierheimMain.loeschen('v', kriterium.getText());
                                                }
                                            }
                                        
                                //Personal
                                    //suchen
                                        name.setFont(new Font("Arial", Font.BOLD, 17));
                                        name.setBounds(0,0,149,19);
                                        JLabel vname = new JLabel("Vorname");
                                        vname.setFont(new Font("Arial", Font.BOLD, 17));
                                        vname.setBounds(150,0,149,19);
                                        gebdat.setFont(new Font("Arial", Font.BOLD, 17));
                                        gebdat.setBounds(300,0,149,19);
                                        JLabel art = new JLabel("Art");
                                        art.setFont(new Font("Arial", Font.BOLD, 17));
                                        art.setBounds(450,0,149,19);
                                        JLabel gehalt = new JLabel("Gehalt");
                                        gehalt.setFont(new Font("Arial", Font.BOLD, 17));
                                        gehalt.setBounds(600,0,149,19);
                                        
                                        JLabel vname2;
                                        JLabel art2;
                                        JLabel gehalt2;
                                        
                                        //alle
                                            if (frageA.getText()=="Personalart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==0) {
                                                if (kriterium.getText() == "") {
                                                    suchergebnisse = TierheimMain.personalSuchen('a');
                                                    if (suchergebnisse != null) {
                                                        suchergebnis.getContentPane().setLayout(new GridLayout(suchergebnisse.size()+1,6));
                                                        suchergebnis.getContentPane().add(name);
                                                        suchergebnis.getContentPane().add(tierart);
                                                        suchergebnis.getContentPane().add(rasse);
                                                        suchergebnis.getContentPane().add(farbe);
                                                        suchergebnis.getContentPane().add(geschlecht);
                                                        suchergebnis.getContentPane().add(gebdat);
                                                        for(int i =0; i<suchergebnisse.size();i++) {
                                                            Tier tier = suchergebnisse.get(i);
                                                            name2 = new JLabel(tier.getName());
                                                            tierart2 = new JLabel(tier.getClass().toString());
                                                            rasse2 = new JLabel(tier.gettRasse());
                                                            farbe2 = new JLabel(tier.gettFarbe());
                                                            geschlecht2 = new JLabel(tier.gettGeschlecht());
                                                            gebdat2 = new JLabel(tier.getgebDat());
                                                            suchergebnis.getContentPane().add(name2);
                                                            suchergebnis.getContentPane().add(tierart2);
                                                            suchergebnis.getContentPane().add(rasse2);
                                                            suchergebnis.getContentPane().add(farbe2);
                                                            suchergebnis.getContentPane().add(geschlecht2);
                                                            suchergebnis.getContentPane().add(gebdat2);
                                                        }
                                                    }
                                                    else {
                                                       suchergebnis.getContentPane().add(keinergebnis);
                                                    }
                                                }
                                            }
                                        //Arzt
                                            //if (frageA.getText()=="Personalart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==1 && kriterium.getText() == ""){
                                            // Hier Methode, die alle Ärzte ausgibt.
                                            //}
                                        //Pfleger
                                            //if (frageA.getText()=="Personalart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==2 && kriterium.getText() == ""){
                                            // Hier Methode, die alle Pfleger ausgibt.
                                            //}
                                        //Verwalter
                                            //if (frageA.getText()=="Personalart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==3 && kriterium.getText() == ""){
                                            // Hier Methode, die alle Verwalter ausgibt.
                                            //}
                                        
                                    //hinzufügen Arzt
                                        if (frageA.getText()=="Personalart hinzufügen" && auswahl.getSelectedIndex() == 0){
                                        fenster.remove(grundHomeUeber);
                                        fenster.remove(grundSuchen);
                                        fenster.add(grundHinzu);
                                        ueberschriftHinzu.setText("Arzt");
                                        fenster.repaint();
                                        
                                        }
                                    // hinzufügen Pfleger
                                        if (frageA.getText()=="Personalart hinzufügen" && auswahl.getSelectedIndex() == 1){
                                        fenster.remove(grundHomeUeber);
                                        fenster.remove(grundSuchen);
                                        fenster.add(grundHinzu);
                                        ueberschriftHinzu.setText("Pfleger");
                                        fenster.repaint();
                                        }
                                    // hinzufügen Verwalter
                                        if (frageA.getText()=="Personalart hinzufügen" && auswahl.getSelectedIndex() == 2){
                                        fenster.remove(grundHomeUeber);
                                        fenster.remove(grundSuchen);
                                        fenster.add(grundHinzu);
                                        ueberschriftHinzu.setText("Verwalter");
                                        fenster.repaint();
                                        }
                                    //löschen
                                        //alle, keine Angabe
                                            //if (frageA.getText()=="Personal löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==0 && kriterium.getText() == ""){
                                            //Hier Methode, die alle Mitarbeiter entfernt.
                                            //}
                                        //Arzt, keine Angabe
                                            //if (frageA.getText()=="Personal löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==1 && kriterium.getText() == ""){
                                            // Hier Methode, die alle Ärzte entfernt.
                                            //}
                                        //Pfleger, keine Angabe
                                            //if (frageA.getText()=="Personal löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==2 && kriterium.getText() == ""){
                                            // Hier Methode, die alle Pfleger entfernt.
                                            //}
                                        //Verwalter, keine Angabe
                                            //if (frageA.getText()=="Personal löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==3 && kriterium.getText() == ""){
                                            // Hier Methode, die alle Verwalter entfernt.
                                            //}
                                        //mit Angabe
                                            //if (frageA.getText()=="Personal löschen" && frageB.getText()=="Bestimmte Nummer löschen" && kriterium.getText() != ""){
                                            //Hier Methode die Mitarbeiter mit eingegebener Nummer (die Nummer erhält man mit kriterium.getText();) entfernt sonst meldung.setText("Tier nicht vorhanden");
                                            //}
                                //Helfer
                                    //suchen
                                        //alle, keine Angabe
                                            //if (frageA.getText()=="Helferart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==0 && kriterium.getText() == ""){
                                            //Hier Methode, die alle Helfer ausgibt.
                                            //}
                                        //Dauerhaften, keine Angabe
                                            //if (frageA.getText()=="Helferart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==1 && kriterium.getText() == ""){
                                            // Hier Methode, die alle dauerhaften Helfer ausgibt.
                                            //}
                                        //Zeitweisen, keine Angabe
                                            //if (frageA.getText()=="Helferart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==2 && kriterium.getText() == ""){
                                            // Hier Methode, die alle zeitweisen Helfer ausgibt.
                                            //}
                                        //mit Angabe
                                            //if (frageA.getText()=="Helferart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && kriterium.getText() != ""){
                                            //Hier Methode die Nummer prüft, bei vorhandensein Helfer ausgibt, sonst meldung.setText("Tier nicht vorhanden");
                                            //}
                                    //hinzufügen dauerhaften Helfer
                                        if (frageA.getText()=="Helferart hinzufügen" && auswahl.getSelectedIndex() == 0){
                                        fenster.remove(grundHomeUeber);
                                        fenster.remove(grundSuchen);
                                        fenster.add(grundHinzu);
                                        ueberschriftHinzu.setText("Dauerhafter Helfer");
                                        fenster.repaint();
                                        }
                                    // hinzufügen Zeitweisen Helfer
                                        if (frageA.getText()=="Helferart hinzufügen" && auswahl.getSelectedIndex() == 1){
                                        fenster.remove(grundHomeUeber);
                                        fenster.remove(grundSuchen);
                                        fenster.add(grundHinzu);
                                        ueberschriftHinzu.setText("Zeitweiser Helfer");
                                        fenster.repaint();
                                        }
                                    //löschen
                                        //alle, keine Angabe
                                            //if (frageA.getText()=="Helfer löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==0 && kriterium.getText() == ""){
                                            //Hier Methode, die alle Helfer entfernt.
                                            //}
                                        //Dauerhaften, keine Angabe
                                            //if (frageA.getText()=="Helfer löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==1 && kriterium.getText() == ""){
                                            // Hier Methode, die alle dauerhaften Helfer entfernt.
                                            //}
                                        //Zeitweisen, keine Angabe
                                            //if (frageA.getText()=="Helfer löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==2 && kriterium.getText() == ""){
                                            // Hier Methode, die alle zeitweisen Helfer  entfernt.
                                            //}
                                        //mit Angabe
                                            //if (frageA.getText()=="Helfer löschen" && frageB.getText()=="Bestimmte Nummer löschen" && kriterium.getText() != ""){
                                            //Hier Methode die  mit eingegebener Nummer (die Nummer erhält man mit kriterium.getText();) entfernt sonst meldung.setText("Helfer nicht vorhanden");
                                            //}
                                //Räume
                                    //suchen
                                        //mit Angabe
                                            //if (frageA.getText()=="Raumart suchen"){
                                            //Hier Methode die Nummer prüft, bei vorhandensein Raum ausgibt, sonst meldung.setText("Raum nicht vorhanden");
                                            //}
                                    //hinzufügen Raum
                                        if (frageA.getText()=="Raumart hinzufügen" && auswahl.getSelectedIndex() == 0){
                                        fenster.remove(grundHomeUeber);
                                        fenster.remove(grundSuchen);
                                        fenster.add(grundHinzu);
                                        ueberschriftHinzu.setText("Raum");
                                        fenster.repaint();
                                        }
                                    //löschen
                                        //mit Angabe
                                            //if (frageA.getText()=="Raum löschen" && frageB.getText()=="Bestimmte Nummer löschen" && kriterium.getText() != ""){
                                            //Hier Methode die  mit eingegebener Nummer (die Nummer erhält man mit kriterium.getText();) entfernt sonst meldung.setText("Tier nicht vorhanden");
                                            //}
                                        
                            }
                });
                
                //Ok Button (der 2. bei Hinzufügen)
                okHinzu.addActionListener(new ActionListener (){
                    @Override
                        public void actionPerformed(ActionEvent e){
                            
                                String a = antwortHinzuA.getText();
                                String b = antwortHinzuB.getText();
                                String c = antwortHinzuC.getText();
                                String d = antwortHinzuD.getText();
                                String ea = antwortHinzuE.getText();
                                int eb = Integer.parseInt(ea);
                                String f = antwortHinzuF.getText();
                                String g = antwortHinzuG.getText();
                                String h = antwortHinzuH.getText();
                                String i = antwortHinzuI.getText();
                                String ja = antwortHinzuJ.getText();
                                float jb = Float.parseFloat(ja);
                                if (ueberschriftHinzu.getText() == "Arzt"){
                                    
                                    Arzt arzt1 = new Arzt (a,b,c,d,eb,f,g,h,i,jb);
                                    TierheimMain.aerzte.add(arzt1);
                                }
                                if (ueberschriftHinzu.getText() == "Pfleger"){
                                    
                                    Pfleger pfleger1 = new Pfleger (a,b,c,d,eb,f,g,h,i,jb);
                                    TierheimMain.pfleger.add(pfleger1);
                                }
                                if (ueberschriftHinzu.getText() == "Verwalter"){
                                    
                                    Verwalter verwalter1 = new Verwalter (a,b,c,d,eb,f,g,h,i,jb);
                                    TierheimMain.verwalter.add(verwalter1);
                                }
                                
                                //String nr, String name, String vName, String strNr, int plz, String ort, String gebDat, String tel, String mail, float gehAlt        
                            }
                        
                    });
                                      
                           
                    
                    
                
                    
        
        //Zusammenfügen
            //Menu
            fenster.setJMenuBar(menuezeile);
            menuezeile.add(menuHome);
            menuHome.add(uberUnsHome);
            menuezeile.add(menuTiere);
            menuTiere.add(suchenT);
            menuTiere.add(hinzufuegenT);
            menuTiere.add(loeschenT);
            menuPersonal.add(suchenP);
            menuPersonal.add(hinzufuegenP);
            menuPersonal.add(loeschenP);
            menuHelfer.add(suchenH);
            menuHelfer.add(hinzufuegenH);
            menuHelfer.add(loeschenH);
            menuRaum.add(suchenR);
            menuRaum.add(hinzufuegenR);
            menuRaum.add(loeschenR);
            menuezeile.add(menuPersonal);
            menuezeile.add(menuHelfer);
            menuezeile.add(menuRaum);
            
            
            //suchen,löschen Tiere/Personal/Helfer/Raum
                grundSuchen.add(frageA);
                grundSuchen.add(frageB);
                grundSuchen.add(auswahl);
                grundSuchen.add(kriterium);
                grundSuchen.add(bestaetigen);
                grundSuchen.add(meldung);
                //grundSuchen.add(ausgabe);
            //hinzufügen Tiere/Personal/Helfer/Raum
                grundHinzu.add(ueberschriftHinzu);
                grundHinzu.add(frageHinzuA);
                grundHinzu.add(frageHinzuB);
                grundHinzu.add(frageHinzuC);
                grundHinzu.add(frageHinzuD);
                grundHinzu.add(frageHinzuE);
                grundHinzu.add(frageHinzuF);
                grundHinzu.add(frageHinzuG);
                grundHinzu.add(frageHinzuH);
                grundHinzu.add(frageHinzuI);
                grundHinzu.add(frageHinzuJ);
                grundHinzu.add(antwortHinzuA);
                grundHinzu.add(antwortHinzuB);
                grundHinzu.add(antwortHinzuC);
                grundHinzu.add(antwortHinzuD);
                grundHinzu.add(antwortHinzuE);
                grundHinzu.add(antwortHinzuF);
                grundHinzu.add(antwortHinzuG);
                grundHinzu.add(antwortHinzuH);
                grundHinzu.add(antwortHinzuI);
                grundHinzu.add(antwortHinzuJ);
                grundHinzu.add(okHinzu);
                
                
                
            //Home
                //Startseite
                fenster.add(grundHomeUeber);
                grundHomeUeber.add(uberschriftHome);
                grundHomeUeber.add(speichernbeenden);
                grundHomeUeber.add(logo);
                
            
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Fenster(JFrame) wird geschlossen
        fenster.setVisible(true);
        
    }

    /*protected void suchen(String tierart, String nummer) {
        switch (tierart) {
            case "Alle"
        }
    }
    */
}