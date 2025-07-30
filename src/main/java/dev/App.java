package dev;


import com.github.lalyos.jfiglet.FigletFont;

import java.util.ResourceBundle;

public class App {
    public static void main(String[] args) throws Exception {
//        System.out.println("Hello World!");
//        try {
//            String asciiArt = FigletFont.convertOneLine("Mon App");
//            System.out.println(asciiArt);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        String titre = ResourceBundle.getBundle("App").getString("titre");
        String asciiArt = FigletFont.convertOneLine(titre);
        System.out.println(asciiArt);

        // affichage de l'environnement
        String environnement = ResourceBundle.getBundle("App").getString(
                "environnement");
        System.out.println("Environnement : " + environnement);

    }
}
