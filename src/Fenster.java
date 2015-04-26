/**
 *
 * @author schueler
 */
/*Noch wichtig:
* Object getSelectedItem() 
* Hier wird das in der JComboBox ausgewählte Objekt zurückgegeben.
* Um mit dem Objekt weiter zu arbeiten, ist eine Typumwandlung zu der jeweiligen Klasse nötig.
*
*/
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;



public class Fenster {
    public Fenster(){
        
        //Deklaration
        
        final JFrame fenster;
        Color hellblau;
        
            //Home
                //Über uns
                final JPanel grundHomeUeber;
                final JLabel uberschriftHome;
                JLabel logo;
                
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
                
                
                
            
            //Menu
            JMenuBar menuezeile;
            JMenu menuHome;
            JMenu menuTiere;
            JMenu menuPersonal;
            JMenu menuRaum;
            JMenu menuHelfer;
            JMenuItem uberUnsHome;
            JMenuItem suchenT;
            JMenuItem hinzufuegenT;
            JMenuItem loeschenT;
            JMenuItem suchenP;
            JMenuItem hinzufuegenP;
            JMenuItem loeschenP;
            JMenuItem suchenR;
            JMenuItem hinzufuegenR;
            JMenuItem loeschenR;
            JMenuItem suchenH;
            JMenuItem hinzufuegenH;
            JMenuItem loeschenH;

            
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
                uberschriftHome.setFont( new Font("Arial", Font.BOLD, 30));
                logo = new JLabel(new ImageIcon("tierheimgruen.tiff"));
                logo.setBounds(20,200,100,100);
                //suchen und löschen für Tiere, Personal, Helfer, Raum
                grundSuchen = new JPanel();
                grundSuchen.setLayout(null);
                grundSuchen.setBounds(0,0,500,500);
                frageA = new JLabel();
                frageA.setBounds(20,20,215,20);
                frageB = new JLabel();
                frageB.setBounds(20,60,215,20);
                final String comboBoxListe[] = {"Katze", "Hund", "Vogel","alles"};
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
                                        //alle, keine Angabe
                                            //if (frageA.getText()=="Tierart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==0 && kriterium.getText() == ""){
                                            //Hier Methode, die alle Tiere ausgibt.
                                            //}
                                        //Hund, keine Angabe
                                            //if (frageA.getText()=="Tierart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==1 && kriterium.getText() == ""){
                                            // Hier Methode, die alle Hunde ausgibt.
                                            //}
                                        //Katze, keine Angabe
                                            //if (frageA.getText()=="Tierart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==2 && kriterium.getText() == ""){
                                            // Hier Methode, die alle Katzen ausgibt.
                                            //}
                                        //Kleintier, keine Angabe
                                            //if (frageA.getText()=="Tierart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==3 && kriterium.getText() == ""){
                                            // Hier Methode, die alle Kleintiere ausgibt.
                                            //}
                                        //Vogel, keine Angabe
                                            //if (frageA.getText()=="Tierart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==4 && kriterium.getText() == ""){
                                            // Hier Methode, die alle Vögel ausgibt.
                                            //}
                                        //mit Angabe
                                            //if (frageA.getText()=="Tierart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && kriterium.getText() != ""){
                                            //Hier Methode die Nummer prüft, bei vorhandensein Tier ausgibt, sonst meldung.setText("Tier nicht vorhanden");
                                            //}
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
                                        //alle, keine Angabe
                                            //if (frageA.getText()=="Tierart löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==0 && kriterium.getText() == ""){
                                            //Hier Methode, die alle Tiere entfernt.
                                            //}
                                        //Hund, keine Angabe
                                            //if (frageA.getText()=="Tierart löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==1 && kriterium.getText() == ""){
                                            // Hier Methode, die alle Hunde entfernt.
                                            //}
                                        //Katze, keine Angabe
                                            //if (frageA.getText()=="Tierart löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==2 && kriterium.getText() == ""){
                                            // Hier Methode, die alle Katzen entfernt.
                                            //}
                                        //Kleintier, keine Angabe
                                            //if (frageA.getText()=="Tierart löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==3 && kriterium.getText() == ""){
                                            // Hier Methode, die alle Katzen entfernt.
                                            //}
                                        //Vogel, keine Angabe
                                            //if (frageA.getText()=="Tierart löschen" && frageB.getText()=="Bestimmte Nummer löschen" && auswahl.getSelectedIndex()==4 && kriterium.getText() == ""){
                                            // Hier Methode, die alle Vögel entfernt.
                                            //}
                                        //mit Angabe
                                            //if (frageA.getText()=="Tierart löschen" && frageB.getText()=="Bestimmte Nummer löschen" && kriterium.getText() != ""){
                                            //Hier Methode die Tier mit eingegebener Nummer (die Nummer erhält man mit kriterium.getText();) entfernt sonst meldung.setText("Tier nicht vorhanden");
                                            //}
                                //Personal
                                    //suchen
                                        //alle, keine Angabe
                                            //if (frageA.getText()=="Personalart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==0 && kriterium.getText() == ""){
                                            //Hier Methode, die alle Mitarbeiter ausgibt.
                                            //}
                                        //Arzt, keine Angabe
                                            //if (frageA.getText()=="Personalart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==1 && kriterium.getText() == ""){
                                            // Hier Methode, die alle Ärzte ausgibt.
                                            //}
                                        //Pfleger, keine Angabe
                                            //if (frageA.getText()=="Personalart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==2 && kriterium.getText() == ""){
                                            // Hier Methode, die alle Pfleger ausgibt.
                                            //}
                                        //Verwalter, keine Angabe
                                            //if (frageA.getText()=="Personalart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && auswahl.getSelectedIndex()==3 && kriterium.getText() == ""){
                                            // Hier Methode, die alle Verwalter ausgibt.
                                            //}
                                        //mit Angabe
                                            //if (frageA.getText()=="Personalart suchen" && frageB.getText()=="Bestimmte Nummer suchen" && kriterium.getText() != ""){
                                            //Hier Methode die Nummer prüft, bei vorhandensein Mitarbeiter ausgibt, sonst meldung.setText("Tier nicht vorhanden");
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
                
                
                
            //Home
                //Startseite
                fenster.add(grundHomeUeber);
                grundHomeUeber.add(uberschriftHome);
                grundHomeUeber.add(logo);
            
                
                
            
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Fenster(JFrame) wird geschlossen
        fenster.setVisible(true);
        
        
        
    }
}
