import javax.swing.*;
import javax.swing.plaf.metal.MetalIconFactory;

public class AuswertungsGui
{
    // main-Methode
    public static void main(String[] args)
    {
        // Erzeugung eines neuen Dialoges
        JFrame jf = new JFrame();
        jf.setTitle("Auswertung des Spiels");
        jf.setSize(800,800);

        // Wir erstellen ein JLabel mit einem Text und unserem Icon
        // Die horizontale Ausrichtung setzen wir auf "CENTER"
        JLabel label = new JLabel ("Gut gemacht",JLabel.CENTER);


        // Die vertikale Ausrichtung des JLabels setzen wir auf "TOP"
        label.setVerticalAlignment(JLabel.TOP);

        // Die relative Ausrichtung des Textes zum Icon setzen wir auf "LEFT"
        label.setHorizontalTextPosition(JLabel.LEFT);

        // Wir fügen das JLabel unserem Dialog hinzu
        jf.add(label);
        

        jf.setVisible(true);

    }
}