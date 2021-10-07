
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Container;

import java.io.File;

public class Logic {



    public static File directory = new File("img");
    public static File[] listOfDirectory = directory.listFiles();
    String[] klassen = new String[listOfDirectory.length];



    public Logic() {


        for (int i = 0; i < listOfDirectory.length; i++) {
            if (listOfDirectory[i].isDirectory()) {
                klassen[i] = listOfDirectory[i].getName();


                System.out.println(klassen[i]);
            }
        }


        File file = new File("img/" + klassen[0]); //TODO 0 ersetzen
        File[] listOfFiles = file.listFiles();
        String[] namen = new String[listOfFiles.length];

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                String noLowerCase = listOfFiles[i].getName();
                noLowerCase = noLowerCase.replaceAll("_", " ").toLowerCase();
                String words[] = noLowerCase.split(" ", 3);
                String name = words[0].substring(0, 1).toUpperCase() + words[0].substring(1) + " " + words[1].substring(0, 1).toUpperCase() + words[1].substring(1);
                namen[i] = name;


                System.out.println(namen[i]);
            }
        }
    }

    public static void main(String[] args) {
        Logic logic = new Logic();
    }
}
