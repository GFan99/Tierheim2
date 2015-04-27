/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schueler
 */


import javax.swing.*;
import java.awt.event.*;

public class Login {
    final String BENUTZERNAME = "verwalter";
    final String PASSWORT = "verwalter";
    
    JFrame fenster;
    JPanel untergrund;
    JLabel nameLabel;
    JTextField nameTextFeld;
    JLabel passwortLabel;
    JPasswordField passwortFeld;
    JButton loginButton;
    JLabel rueckmeldung;
    ActionListener l;
    KeyListener kl;
    
    public Login()
    {
        
        l = new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               if (e.getSource() == loginButton){
                  if (BENUTZERNAME.equals(nameTextFeld.getText()) && PASSWORT.equals(passwortFeld.getText()) ){
                      Fenster fenster1 = new Fenster(); 
                      
                  } 
                  else{
                      rueckmeldung.setText("Falsche Eingabe");
                  }
                  untergrund.repaint();
               }
           }
       };
       
       kl = new KeyListener(){
           @Override
           public void keyTyped(KeyEvent e){}
           
           @Override
           public void keyPressed(KeyEvent e){}
           
           @Override
           public void keyReleased(KeyEvent e){
           if (e.getKeyCode() == 10){
               if (BENUTZERNAME.equals(nameTextFeld.getText()) && PASSWORT.equals(passwortFeld.getText()) ){
                   fenster.setVisible(false);
                   Fenster fenster1 = new Fenster();
                   
                      
                  } 
                  else{
                      rueckmeldung.setText("Falsche Eingabe");
                  }
                  untergrund.repaint();
               
           }
           }
       };
        
       fenster = new JFrame("Anmeldung");
       fenster.setBounds(100,100,600,400);
       
       untergrund = new JPanel();
       untergrund.setLayout(null);
       
       nameLabel = new JLabel("Name:");
       nameLabel.setBounds(20,20,50,20);
       
       nameTextFeld = new JTextField();
       nameTextFeld.setBounds(20,50,150,20);
       
       passwortLabel = new JLabel("Passwort:");
       passwortLabel.setBounds(20,80,100,20);
       
       passwortFeld = new JPasswordField();
       passwortFeld.setBounds(20,110,150,20);
       passwortFeld.addKeyListener(kl);
       
       loginButton = new JButton("Login");
       loginButton.setBounds(190,110,75,20);
       loginButton.addActionListener(l);
       
       rueckmeldung = new JLabel();
       rueckmeldung.setBounds(210,50,100,20);
       
       
       untergrund.add(nameLabel);
       untergrund.add(nameTextFeld);
       untergrund.add(passwortLabel);
       untergrund.add(passwortFeld);
       untergrund.add(loginButton);
       fenster.add(untergrund);
       untergrund.add(rueckmeldung);
       
       fenster.setVisible(true);
       fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
       
    }

    
    
}

