
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Container;

public class ChooseClass extends JFrame {
    private JLabel titel;
    private JButton start;
    private JPanel buttons;
    private JPanel buttonPanel;
    private JPanel title;
    public static int dieKlasse;


    public ChooseClass() throws IOException{
        getContentPane().setBackground(new Color(40,45,88));
        setSize(800,800);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(true);
        titel = new JLabel("Auswahl der Klassen", SwingConstants.CENTER);
        titel.setForeground(new Color(25,25,25));

        //Buttons
        start = new JButton("Lernen");

        //Border
        EmptyBorder emptyBorder = new EmptyBorder(75,0,75,0);
        titel.setBorder(emptyBorder);

        //Setzen der Schriftart und Grösse der Buttons und des Titels
        Font buttonFont = new Font("Arial", Font.PLAIN, 40);
        titel.setFont(new Font("Arial", Font.BOLD, 70));
        start.setFont(buttonFont);

        //Setzten der Farbe der Buttons

        Color buttonFontColor = new Color(255,255,255);

        titel.setBackground(new Color(23, 27 ,64));
        titel.setForeground(buttonFontColor);

        //Aligment für die Buttons
        start.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Füllen des Buttonpanels mit den Buttons
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.PAGE_AXIS));
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 45)));
        buttons = new JPanel();
        buttons.add(buttonPanel);

        File[] directories = Logic.listOfDirectory;

        for(int i = 0;i< directories.length;i++) {
            int temp = i;
            JButton button = new JButton(directories[i].getName());
            button.addActionListener(e -> {
                try {
                    chooseClass(temp);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            });
            button.setBackground(new Color(50,75,50));
            button.setForeground(buttonFontColor);
            button.setFont(buttonFont);
            buttonPanel.add(Box.createRigidArea(new Dimension(0, 45)));
            buttonPanel.add(button);
        }


        buttonPanel.setBackground(new Color(25, 25, 75));
        buttons.setBackground(new Color(25, 25, 75));

        //Setzen des Layouts und hinzufügen der Komponenten
        getContentPane().setLayout(new BorderLayout(1, 1));
        getContentPane().add(buttons, BorderLayout.CENTER);
        getContentPane().add(titel, BorderLayout.NORTH);

        setVisible(true);
    }

    public void chooseClass(int index) throws IOException {
        System.out.println(index);
        dieKlasse = index;
        NameLearning nameLearning = new NameLearning();
        setVisible(false);
    }

    public static void main(String[] args) {

    }
}