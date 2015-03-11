import javax.swing.*;
import java.awt.*;

class LgInFenster extends JFrame{
    public LgInFenster(){
	super("LogIn");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	//BorderLayout für das Fenster einstellen
	getContentPane().setLayout(new BorderLayout());
		
	//Hauptbereich des JFrames einstellen

        
	//JPanel für den Hauptbereich des JFrames
	JPanel mainPanel = new JPanel();
		
	//BoxLayout für das mainPanel einstellen
	mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.PAGE_AXIS));
		
	//JLabels und JTextfields zur Eingabe
	JLabel lblUser = new JLabel("Benutzername:");
	JTextField txtUser = new JTextField("name");
	JLabel lblPass = new JLabel("Passwort:");
	JPasswordField txtPass = new JPasswordField("passwort");
		
	mainPanel.add(lblUser);
		
	mainPanel.add(Box.createRigidArea(new Dimension(0,5)));
		
	mainPanel.add(txtUser);
		
	mainPanel.add(Box.createRigidArea(new Dimension(0,5)));
		
	mainPanel.add(lblPass);
		
	mainPanel.add(Box.createRigidArea(new Dimension(0,5)));
		
	mainPanel.add(txtPass);
		
	//Buttonbereich des JFrames einstellen

	//JPanel für die Buttons
	JPanel buttonPanel = new JPanel();
		
	//BoxLayout für das buttonPanel einstellen
	buttonPanel.setLayout(new BoxLayout(buttonPanel,BoxLayout.LINE_AXIS));
		
	//oben, links, unten, rechts
	buttonPanel.setBorder(BorderFactory.createEmptyBorder(5,0,5,0));
		
	//JButtons erstellen
	JButton btnOk = new JButton("Ok");
	JButton btnCancel = new JButton("Abbrechen");
		
	buttonPanel.add(Box.createHorizontalGlue());
		
	buttonPanel.add(btnOk);
		
	buttonPanel.add(Box.createRigidArea(new Dimension(5,0)));
		
	buttonPanel.add(btnCancel);
        
        buttonPanel.add(Box.createHorizontalGlue());
		
	//Hinzufügen der JPanels zum BorderLayout
	getContentPane().add(mainPanel);
	getContentPane().add(buttonPanel, BorderLayout.SOUTH);
		
	setSize(220,160);
	setLocation(50,50);
	setVisible(true);		
    }
}