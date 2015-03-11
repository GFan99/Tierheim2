/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author becksusanna
 */
import javax.swing.JFrame;

/*
 * Erstellen eines Fensters mit einer 
 * automatischen Groesse
 */
class MyFrame extends JFrame{
    public MyFrame(String name){
	//Einen Titel einstellen
	super(name);
        /*
        * Das JFrame so einstellen, dass das Programm beim Schließen des JFrames
        * beendet wird.
        */
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//Groesse wird automatisch angepasst
	pack();
	//Die Position einstellen
	setLocation(50,50);
	//Das JFrame anzeigen
	setVisible(true);		
    }
}