//@author schueler

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
                grundHomeUeber.setBackground(Color.CYAN);
                uberschriftHome = new JLabel("Tierheim Berlin");
                uberschriftHome.setBounds(20,30,300,30);
                uberschriftHome.setFont(new Font("Arial", Font.BOLD, 30));

                logo = new JLabel(new ImageIcon("tierheimgruen.tiff"));
                logo.setVisible(true);
                logo.setBounds(20,200,100,100);

                logo.setBounds(300,300,100,100);

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
                                auswahl.addItem("Tierraum");
                                auswahl.addItem("Personalraum");
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
                                auswahl.addItem("Tierraum");
                                auswahl.addItem("Personalraum");
                                bestaetigen.setBounds(430,20,50,20);
                                fenster.repaint();
                                frageHinzuA.setText("Nummer");
                                frageHinzuB.setText("Tier-/Personalart");
                                frageHinzuC.setText("Platzanzahl");
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
                                auswahl.addItem("Tierraum");
                                auswahl.addItem("Personalraum");
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
                                        
                                        
                                        
                                        //alle
                                        if (frageA.getText()=="Tierart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==0){    
                                            if (kriterium.getText() == "") {
                                                    suchergebnisse = suchen('a');
                                                    ergebnistabelleTier(suchergebnisse);
                                                }
                                                else {
                                                    suchergebnisse = suchen('a', kriterium.getText());
                                                    ergebnistabelleTier(suchergebnisse);
                                                }
                                                
                                        }
                                        //Hund
                                            if (frageA.getText()=="Tierart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==1){
                                                if (kriterium.getText() == "") {
                                                    suchergebnisse = suchen('h');
                                                    ergebnistabelleTier(suchergebnisse);
                                                }
                                                else {
                                                    suchergebnisse = suchen('h', kriterium.getText());
                                                    ergebnistabelleTier(suchergebnisse);
                                                }
                                            }
                                        //Katze
                                            if (frageA.getText()=="Tierart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==2 && kriterium.getText() == ""){
                                                if (kriterium.getText() == "") {
                                                    suchergebnisse = suchen('k');
                                                    ergebnistabelleTier(suchergebnisse);
                                                }
                                                else {
                                                    suchergebnisse = suchen('k', kriterium.getText());
                                                    ergebnistabelleTier(suchergebnisse);
                                                }
                                            }
                                        //Kleintier
                                            if (frageA.getText()=="Tierart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==3 && kriterium.getText() == ""){
                                                if (kriterium.getText() == "") {
                                                    suchergebnisse = suchen('m');
                                                    ergebnistabelleTier(suchergebnisse);
                                                }
                                                else {
                                                    suchergebnisse = suchen('m', kriterium.getText());
                                                    ergebnistabelleTier(suchergebnisse);
                                                }
                                            }
                                        //Vogel
                                            if (frageA.getText()=="Tierart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==4 && kriterium.getText() == ""){
                                                if (kriterium.getText() == "") {
                                                    suchergebnisse = suchen('v');
                                                    ergebnistabelleTier(suchergebnisse);
                                                }
                                                else {
                                                    suchergebnisse = suchen('v', kriterium.getText());
                                                    ergebnistabelleTier(suchergebnisse);
                                                }
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
                                        
                                        
                                        //alle
                                            if (frageA.getText()=="Personalart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==0) {
                                                if (kriterium.getText() == "") {
                                                    suchergebnisse = TierheimMain.personalSuchen('a');
                                                    ergebnistabellePersonal(suchergebnisse);
                                                }
                                                else {
                                                    suchergebnisse = TierheimMain.personalSuchen('a', kriterium.getText());
                                                    ergebnistabellePersonal(suchergebnisse);
                                                }
                                            }
                                        //Arzt
                                            if (frageA.getText()=="Personalart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==1) {
                                                if (kriterium.getText() == "") {
                                                    suchergebnisse = TierheimMain.personalSuchen('m');
                                                    ergebnistabellePersonal(suchergebnisse);
                                                }
                                                else {
                                                    suchergebnisse = TierheimMain.personalSuchen('m', kriterium.getText());
                                                    ergebnistabellePersonal(suchergebnisse);
                                                }
                                            }
                                        //Pfleger
                                            if (frageA.getText()=="Personalart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==2) {
                                                if (kriterium.getText() == "") {
                                                    suchergebnisse = TierheimMain.personalSuchen('p');
                                                    ergebnistabellePersonal(suchergebnisse);
                                                }
                                                else {
                                                    suchergebnisse = TierheimMain.personalSuchen('p', kriterium.getText());
                                                    ergebnistabellePersonal(suchergebnisse);
                                                }
                                            }
                                        //Verwalter
                                            if (frageA.getText()=="Personalart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==3) {
                                                if (kriterium.getText() == "") {
                                                    suchergebnisse = TierheimMain.personalSuchen('v');
                                                    ergebnistabellePersonal(suchergebnisse);
                                                }
                                                else {
                                                    suchergebnisse = TierheimMain.personalSuchen('v', kriterium.getText());
                                                    ergebnistabellePersonal(suchergebnisse);
                                                }
                                            }
                                        
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
                                        //alle
                                            if (frageA.getText()=="Personal löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==0) {
                                                if (kriterium.getText() == "") {
                                                    boolean a = TierheimMain.personalLoeschen('a');
                                                    if (a == true) {
                                                        fenster.add(erfolgreich);
                                                    }
                                                    else {
                                                        fenster.add(nichtErfolgreich);
                                                    }
                                                }
                                                else {
                                                    boolean a = TierheimMain.personalLoeschen('a', kriterium.getText());
                                                }
                                                
                                            }
                                        //Arzt
                                            if (frageA.getText()=="Personal löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==1) {
                                                if (kriterium.getText() == "") {
                                                    boolean a = TierheimMain.personalLoeschen('m');
                                                    if (a == true) {
                                                        fenster.add(erfolgreich);
                                                    }
                                                    else {
                                                        fenster.add(nichtErfolgreich);
                                                    }
                                                }
                                                else {
                                                    boolean a = TierheimMain.personalLoeschen('m', kriterium.getText());
                                                }
                                                
                                            }
                                        //Pfleger
                                            if (frageA.getText()=="Personal löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==2) {
                                                if (kriterium.getText() == "") {
                                                    boolean a = TierheimMain.personalLoeschen('p');
                                                    if (a == true) {
                                                        fenster.add(erfolgreich);
                                                    }
                                                    else {
                                                        fenster.add(nichtErfolgreich);
                                                    }
                                                }
                                                else {
                                                    boolean a = TierheimMain.personalLoeschen('p', kriterium.getText());
                                                }
                                                
                                            }
                                        //Verwalter
                                            if (frageA.getText()=="Personal löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==3) {
                                                if (kriterium.getText() == "") {
                                                    boolean a = TierheimMain.personalLoeschen('v');
                                                    if (a == true) {
                                                        fenster.add(erfolgreich);
                                                    }
                                                    else {
                                                        fenster.add(nichtErfolgreich);
                                                    }
                                                }
                                                else {
                                                    boolean a = TierheimMain.personalLoeschen('v', kriterium.getText());
                                                }
                                                
                                            }
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
                                    //hinzufügen Tierraum
                                        if (frageA.getText()=="Raumart hinzufügen" && auswahl.getSelectedIndex() == 0){
                                        fenster.remove(grundHomeUeber);
                                        fenster.remove(grundSuchen);
                                        fenster.add(grundHinzu);
                                        ueberschriftHinzu.setText("Tieraum");
                                        fenster.repaint();
                                        }
                                    //hinzufügen Personalraum
                                        if (frageA.getText()=="Raumart hinzufügen" && auswahl.getSelectedIndex() == 0){
                                        fenster.remove(grundHomeUeber);
                                        fenster.remove(grundSuchen);
                                        fenster.add(grundHinzu);
                                        ueberschriftHinzu.setText("Tieraum");
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
                                int ab = Integer.parseInt(a);
                                String b = antwortHinzuB.getText();
                                String c = antwortHinzuC.getText();
                                int cb = Integer.parseInt(c);
                                String d = antwortHinzuD.getText();
                                String ea = antwortHinzuE.getText();
                                int eb = Integer.parseInt(ea);
                                String f = antwortHinzuF.getText();
                                float fb = Float.parseFloat(f);
                                String g = antwortHinzuG.getText();
                                String h = antwortHinzuH.getText();
                                String i = antwortHinzuI.getText();
                                String ja = antwortHinzuJ.getText();
                                float jb = Float.parseFloat(ja);
                                
                                if (ueberschriftHinzu.getText() == "Hund"){
                                    
                                    Hund hund1 = new Hund (fb,b,c,ea,d,a);
                                    TierheimMain.hunde.add(hund1);
                                }
                                if (ueberschriftHinzu.getText() == "Katze"){
                                    
                                    Katze katze1 = new Katze (fb,b,c,ea,d,a);
                                    TierheimMain.katzen.add(katze1);
                                }
                                if (ueberschriftHinzu.getText() == "Kleintier"){
                                    
                                    Kleintier kleintier1 = new Kleintier (fb,b,c,ea,d,a);
                                    TierheimMain.kleintiere.add(kleintier1);
                                }
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
                                if (ueberschriftHinzu.getText() == "Dauerhafter Helfer"){
                                    
                                    Helfer helfer1 = new Helfer (a,b,c,d,eb,f,g,h,i);
                                    TierheimMain.helfer.add(helfer1);
                                }
                                if (ueberschriftHinzu.getText() == "Zeitweiser Helfer"){
                                    
                                    Helfer helfer1 = new Helfer (a,b,c,d,eb,f,g,h,i);
                                    TierheimMain.helfer.add(helfer1);
                                }
                                /*if (ueberschriftHinzu.getText() == "Tierraum"){
                                    
                                    TRaum traum1 = new TRaum (ab,b,cb);
                                    TierheimMain.traume.add(traum1);
                                }
                                if (ueberschriftHinzu.getText() == "Personalraum"){
                                    
                                    PRaum praum1 = new PRaum (ab,b,cb);
                                    TierheimMain.praume.add(praum1);
                                }
                                */
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
                logo.setVisible(true);
                
            
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Fenster(JFrame) wird geschlossen
        fenster.setVisible(true);
        
    }
   
    /** Die methode ergebnistabelle gibt die ergebnis-ArrayList einer Suche
     * in Tabellenform in einem extra JFrame aus.
     * Der char art gibt dabei an, ob das Ergebnis einer Suche nach Tieren ('t'),
     * Personal ('p'), Räumen ('r') oder Haltern ('h') ausgegeben wird.
     */
    protected void ergebnistabelleTier(ArrayList<Tier> ergebnisliste) {
        JFrame suchergebnis = new JFrame("Suchergebnisse");
        
        JLabel nummer = new JLabel("Nummer");
        nummer.setFont(new Font("Arial", Font.BOLD, 15));
        nummer.setBounds(0,0,149,19);
        JLabel name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.BOLD, 15));
        name.setBounds(150,0,149,19);
        JLabel tierart = new JLabel("Tierart");
        tierart.setFont(new Font("Arial", Font.BOLD, 15));
        tierart.setBounds(300,0,149,19);
        JLabel rasse = new JLabel("Rasse");
        rasse.setFont(new Font("Arial", Font.BOLD, 15));
        rasse.setBounds(450,0,149,19);
        JLabel farbe = new JLabel("Farbe");
        farbe.setFont(new Font("Arial", Font.BOLD, 15));
        farbe.setBounds(600,0,149,19);
        JLabel geschlecht = new JLabel("Geschlecht");
        geschlecht.setFont(new Font("Arial", Font.BOLD, 15));
        geschlecht.setBounds(750,0,149,19);
        JLabel gebdat = new JLabel("Geburtsdatum");
        gebdat.setFont(new Font("Arial", Font.BOLD, 15));
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
        
        if (ergebnisliste != null) {
            suchergebnis.setBounds(501, 0, 1050, ergebnisliste.size()*20+20);
            suchergebnis.add(nummer);
            suchergebnis.add(name);
            suchergebnis.add(tierart);
            suchergebnis.add(rasse);
            suchergebnis.add(farbe);
            suchergebnis.add(geschlecht);
            suchergebnis.add(gebdat);
            for(int i =0; i<ergebnisliste.size();i++) {
                Tier tier = ergebnisliste.get(i);
                nummer2 = new JLabel(tier.gettNr());
                nummer2.setBounds(0,(i+1)*20,149,19);
                name2 = new JLabel(tier.getName());
                name2.setBounds(150,(i+1)*20,149,19);
                tierart2 = new JLabel(tier.getClass().toString());
                tierart2.setBounds(300,(i+1)*20,149,19);
                rasse2 = new JLabel(tier.gettRasse());
                rasse2.setBounds(450,(i+1)*20,149,19);
                farbe2 = new JLabel(tier.gettFarbe());
                farbe2.setBounds(600,(i+1)*20,149,19);
                geschlecht2 = new JLabel(tier.gettGeschlecht());
                geschlecht2.setBounds(750,(i+1)*20,149,19);
                gebdat2 = new JLabel(tier.getgebDat());
                gebdat2.setBounds(900,(i+1)*20,149,19);
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
        suchergebnis.setLocation(50,50);
        suchergebnis.setVisible(true);
    }
    protected void ergebnistabellePersonal(ArrayList<Personal> ergebnisliste) {
        JFrame suchergebnis = new JFrame("Suchergebnisse");
                
        JLabel nummer = new JLabel("Nummer");
        nummer.setFont(new Font("Arial", Font.BOLD, 15));
        nummer.setBounds(0,0,149,19);
        JLabel name = new JLabel("Name");name.setFont(new Font("Arial", Font.BOLD, 17));
        name.setBounds(0,150,149,19);
        JLabel vname = new JLabel("Vorname");
        vname.setFont(new Font("Arial", Font.BOLD, 17));
        vname.setBounds(300,0,149,19);
        JLabel gebdat = new JLabel("Geburtsdatum");
        gebdat.setFont(new Font("Arial", Font.BOLD, 17));
        gebdat.setBounds(450,0,149,19);
        JLabel art = new JLabel("Art");
        art.setFont(new Font("Arial", Font.BOLD, 17));
        art.setBounds(600,0,149,19);
        JLabel gehalt = new JLabel("Gehalt");
        gehalt.setFont(new Font("Arial", Font.BOLD, 17));
        gehalt.setBounds(750,0,149,19);
        
        JLabel nummer2;
        JLabel name2;
        JLabel vname2;
        JLabel gebdat2;
        JLabel art2;
        JLabel gehalt2;
        JLabel keinergebnis = new JLabel("Es wurde kein Mitarbeiter gefunden. Bitte verändern Sie die Suchkriterien.");
        keinergebnis.setBounds(300,100,0,0);
        
        if (ergebnisliste != null) {
            suchergebnis.setBounds(501, 0, 1050, ergebnisliste.size()*20+20);
            suchergebnis.add(nummer);
            suchergebnis.add(name);
            suchergebnis.add(vname);
            suchergebnis.add(gebdat);
            suchergebnis.add(art);
            suchergebnis.add(gehalt);
            
            for(int i =0; i<ergebnisliste.size();i++) {
                Personal person = ergebnisliste.get(i);
                nummer2 = new JLabel(person.getPNr());
                nummer2.setBounds(0,(i+1)*20,149,19);
                name2 = new JLabel(person.getName());
                name2.setBounds(150,(i+1)*20,149,19);
                vname2 = new JLabel(person.getVName());
                vname2.setBounds(300,(i+1)*20,149,19);
                gebdat2 = new JLabel(person.getGebDat());
                gebdat2.setBounds(450,(i+1)*20,149,19);
                art2 = new JLabel(person.getClass().toString());
                art2.setBounds(600,(i+1)*20,149,19);
                gehalt2 = new JLabel(Float.toString(person.getGehalt()));
                gehalt2.setBounds(750,(i+1)*20,149,19);
                suchergebnis.add(nummer2);
                suchergebnis.add(name2);
                suchergebnis.add(art2);
                suchergebnis.add(vname2);
                suchergebnis.add(gehalt2);
                suchergebnis.add(gebdat2);
            }
        }
        else {
            suchergebnis.setBounds(501,0,350,150);
            suchergebnis.getContentPane().add(keinergebnis);
        }
        suchergebnis.setLocation(50,50);
        suchergebnis.setVisible(true);
    }
    
    /** Die Methode suchen(char tierart) sucht alle Tiere einer Tierart heraus und
     * gibt diese in einer ArrayList gesammelt wieder. Bei den char-Werten steht
     * "h" für Hunde, "k" für Katzen, "m" für Kleintiere (wie Meerschweinchen) und
     * "v" für Vögel.
     */
    protected ArrayList<Tier> suchen(char tierart) {
        ArrayList<Tier> ausgabe = new ArrayList<Tier>();
        TRaum raum;
        switch (tierart) {
            case 'h':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    if (raum.getTierart()=="Hund") {
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            Tier tier = raum.getTiere().get(j);
                            sortiertEinfuegenTier(ausgabe,tier);
                        }
                    }
                }
                break;
            case 'k':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    if (raum.getTierart() == "Katze") {
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            Tier tier = raum.getTiere().get(j);
                            sortiertEinfuegenTier(ausgabe,tier);
                        }
                    }
                }
                break;
            case 'v':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    if (raum.getTierart()=="Vogel") {
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            Tier tier = raum.getTiere().get(j);
                            sortiertEinfuegenTier(ausgabe,tier);
                        }
                    }
                }
                break;
            case 'm':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    if (raum.getTierart()=="Kleintier") {
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            Tier tier = raum.getTiere().get(j);
                            sortiertEinfuegenTier(ausgabe,tier);
                        }
                    }
                }
            break;
            case 'a':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    for (int j = 0; j<raum.getTiere().size();j++) {
                        Tier tier = raum.getTiere().get(j);
                        sortiertEinfuegenTier(ausgabe,tier);
                    }
                }
                break;
            default:
                System.out.println("Falscher char-Wert eingegeben");
        }
        return ausgabe;
    }
    protected ArrayList suchen(char tierart, String nr) {
        ArrayList<Tier> ausgabe = new ArrayList<Tier>();
        TRaum raum;
        switch (tierart) {
            case 'h':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    if (raum.getTierart()=="Hund") {
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            Tier tier = raum.getTiere().get(j);
                            if (tier.gettNr() == nr) {
                                sortiertEinfuegenTier(ausgabe,tier);
                            }
                        }
                    }
                }
                break;
            case 'k':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    if (raum.getTierart() == "Katze") {
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            Tier tier = raum.getTiere().get(j);
                            if (tier.gettNr() == nr) {
                                sortiertEinfuegenTier(ausgabe,tier);
                            }
                        }
                    }
                }
                break;
            case 'v':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    if (raum.getTierart()=="Vogel") {
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            Tier tier = raum.getTiere().get(j);
                            if (tier.gettNr() == nr) {
                                sortiertEinfuegenTier(ausgabe,tier);
                            }
                        }
                    }
                }
                break;
            case 'm':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    if (raum.getTierart()=="Kleintier") {
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            Tier tier = raum.getTiere().get(j);
                            if (tier.gettNr() == nr) {
                                sortiertEinfuegenTier(ausgabe,tier);
                            }
                        }
                    }
                }
                break;
            case 'a':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            Tier tier = raum.getTiere().get(j);
                            if (tier.gettNr() == nr) {
                                sortiertEinfuegenTier(ausgabe,tier);
                            }
                        
                    }
                }
            default:
                System.out.println("Falscher char eingegeben");
        }
        return ausgabe;
    }
    
    private void sortiertNachName(ArrayList<Tier> liste, Tier element) {
        String a = element.getName();
        int iNamenlaenge = a.length();
        for (int i=0;i<liste.size();i++)
        {
            String vergleich = (liste.get(i)).getName();
            for (int j=0;j<iNamenlaenge;j++)
            {
                 if (a.charAt(j) < vergleich.charAt(j))
                 {
                   liste.add(i,element);
                   j=iNamenlaenge; //Schleife wird verlassen
                   i=liste.size(); // Listenschleife wird verlassen
                 }
                 if (a.charAt(j) == vergleich.charAt(j))
                 {
                     if (j== (iNamenlaenge-1))
                     {
                         liste.add(i,element);
                         j=iNamenlaenge; //Schleife wird verlassen
                         i=liste.size();
                     }
                 }
                 else
                 {
                    j=iNamenlaenge; //Schleife wird verlassen
                 }

             }

        }
    }
    protected void sortiertEinfuegenTier(ArrayList<Tier> liste, Tier element) {
        String a = element.gettRasse();
        int iRassenNamenlaenge = a.length();
        for (int i=0;i<liste.size();i++)
        {    
            String vergleich = (liste.get(i)).gettRasse();
            for (int j=0;j<iRassenNamenlaenge;j++)
            {
                 if (a.charAt(j) < vergleich.charAt(j))
                 {
                   liste.add(i,element);
                   j=iRassenNamenlaenge; //Schleife wird verlassen
                   i=liste.size(); // Listenschleife wird verlassen
                 }
                 if (a.charAt(j) == vergleich.charAt(j))
                 {
                     if (j== (iRassenNamenlaenge-1))
                     {
                         sortiertNachName(liste,element);
                     }

                 }
                 else
                 {
                    j=iRassenNamenlaenge; //Schleife wird verlassen
                 }
             }
        }
    }
}