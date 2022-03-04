//FASE 1:
//
//Volem fer un software de carreres de coets.
//
//Un coet està identificat per un codi de 8 caràcters i un nombre de propulsors.
//
//Realitza els següents passos:
//
//Creem dos coets amb els codis “32WESSDS” I “LDSFJA32”.
// El primer coet tindrà tres propulsors i el segon sis propulsors.
//
//Mostrar a pantalla el codi dels coets i el nombre de propulsors que té.

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws Exception {
        List<Rocket> rockets = buildListOfRockets();
        printListOfRockets();
    }

    private static void printListOfRockets() throws Exception {
        System.out.println("List of rockets : " + buildListOfRockets());
    }

    private static List<Rocket> buildListOfRockets() throws Exception {
        List<Rocket> rockets = new ArrayList<>();
        Rocket rocket1 = new Rocket("32WESSDS", 3);
        Rocket rocket2 = new Rocket("LDSFJA32", 6);
        rockets.add(rocket1);
        rockets.add(rocket2);
        return rockets;
    }
}










