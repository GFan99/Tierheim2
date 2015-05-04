
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author becksusanna
 */
public class methoden {
    
    
    
    
    protected static boolean helferLoeschen(char art, String nr) {
        switch (art) {
            case 'z':
                for (int i = 0; i < TierheimMain.helfer.size(); i++) {
                    if (TierheimMain.helfer.get(i).getAufDauer() == false) {
                        if (TierheimMain.helfer.get(i).getPNr() == nr) {
                            TierheimMain.helfer.remove(i);
                        }
                    }
                }
                break;
            case 'd':
                for (int i = 0; i < TierheimMain.helfer.size(); i++) {
                    if (TierheimMain.helfer.get(i).getAufDauer() == true) {
                        if (TierheimMain.helfer.get(i).getPNr() == nr) {
                            TierheimMain.helfer.remove(i);
                        }
                    }
                }
            case 'a':
                for (int i = 0; i < TierheimMain.helfer.size(); i++) {
                    if (TierheimMain.helfer.get(i).getPNr() == nr) {
                        TierheimMain.helfer.remove(i);
                    }
                }
                break;
            default:
        }
        return true;
    }
    
    /** Die Methode loeschen(char tierart) löscht alle Tiere einer Tierart. Bei den char-Werten steht
     * "h" für Hunde, "k" für Katzen, "m" für Kleintiere (wie Meerschweinchen) und
     * "v" für Vögel.
     */
    protected static boolean loeschen(char tierart) {
        TRaum raum;
        switch (tierart) {
            case 'h':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    if (raum.getTierart()=="Hund") {
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            raum.getTiere().remove(0);
                        }
                    }
                }
                break;
            case 'k':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    if (raum.getTierart() == "Katze") {
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            raum.getTiere().remove(0);
                        }
                    }
                }
                break;
            case 'v':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    if (raum.getTierart()=="Vogel") {
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            raum.getTiere().remove(0);
                        }
                    }
                }
                break;
            case 'm':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    if (raum.getTierart()=="Kleintier") {
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            raum.getTiere().remove(0);
                        }
                    }
                }
            break;
            case 'a':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    for (int j = 0; j<raum.getTiere().size();j++) {
                        raum.getTiere().remove(0);
                    }
                }
                break;
            default:
                return false;
        }
        return true;
    }
    protected static boolean loeschen(char tierart, String nr) {
        TRaum raum;
        switch (tierart) {
            case 'h':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    if (raum.getTierart()=="Hund") {
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            Tier tier = raum.getTiere().get(j);
                            if (tier.gettNr() == nr) {
                                raum.getTiere().remove(tier);
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
                                raum.getTiere().remove(tier);
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
                                raum.getTiere().remove(tier);
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
                                raum.getTiere().remove(tier);
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
                                raum.getTiere().remove(tier);
                            }
                        
                    }
                }
            default:
                return false;
        }
        return true;
    }
    
    
    /** Die Methode loeschen(char tierart) löscht alle Tiere einer Tierart. Bei den char-Werten steht
     * "h" für Hunde, "k" für Katzen, "m" für Kleintiere (wie Meerschweinchen) und
     * "v" für Vögel.
     */
    
    /*protected static boolean loeschen(char tierart, String nr) {
        TRaum raum;
        switch (tierart) {
            case 'h':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    if (raum.getTierart()=="Hund") {
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            Tier tier = raum.getTiere().get(j);
                            if (tier.gettNr() == nr) {
                                raum.getTiere().remove(tier);
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
                                raum.getTiere().remove(tier);
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
                                raum.getTiere().remove(tier);
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
                                raum.getTiere().remove(tier);
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
                                raum.getTiere().remove(tier);
                            }
                        
                    }
                }
            default:
                return false;
        }
        return true;
    }
    */
    
    /*
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
    */
        

    /**
     * protected static boolean loeschen(char tierart) {
        TRaum raum;
        switch (tierart) {
            case 'h':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    if (raum.getTierart()=="Hund") {
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            raum.getTiere().remove(0);
                        }
                    }
                }
                break;
            case 'k':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    if (raum.getTierart() == "Katze") {
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            raum.getTiere().remove(0);
                        }
                    }
                }
                break;
            case 'v':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    if (raum.getTierart()=="Vogel") {
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            raum.getTiere().remove(0);
                        }
                    }
                }
                break;
            case 'm':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    if (raum.getTierart()=="Kleintier") {
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            raum.getTiere().remove(0);
                        }
                    }
                }
            break;
            case 'a':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    for (int j = 0; j<raum.getTiere().size();j++) {
                        raum.getTiere().remove(0);
                    }
                }
                break;
            default:
                return false;
        }
        return true;
    }
    protected static boolean loeschen(char tierart, String nr) {
        TRaum raum;
        switch (tierart) {
            case 'h':
                for (int i = 0; i < TierheimMain.traeume.size(); i++) {
                    raum = TierheimMain.traeume.get(i);
                    if (raum.getTierart()=="Hund") {
                        for (int j = 0; j<raum.getTiere().size();j++) {
                            Tier tier = raum.getTiere().get(j);
                            if (tier.gettNr() == nr) {
                                raum.getTiere().remove(tier);
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
                                raum.getTiere().remove(tier);
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
                                raum.getTiere().remove(tier);
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
                                raum.getTiere().remove(tier);
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
                                raum.getTiere().remove(tier);
                            }
                        
                    }
                }
            default:
                return false;
        }
        return true;
    }
     */
}