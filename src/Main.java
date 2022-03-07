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
//FASE 2:
//
//Volem millorar el software perquè el propulsor tingui una potència màxima.
// Creem la classe propulsor i modifiquem en el main anterior:
//
//Creem dos coets amb els codis “32WESSDS” I “LDSFJA32”.
// El primer coet tindrà tres propulsors (potència: 10,30,80) i el segon sis propulsors (potència: 30,40,50,50,30,10).
//
//Mostrar a pantalla el codi dels coets, el nombre de propulsors que té i la potència màxima de cada propulsor.
//
//		Output:
//32WESSDS: 10,30,80
//LDSFJA32: 30,40,50,50,30,10
//FASE 1:
//
//Volem fer un software de carreres de coets.
//
//Un coet està identificat per un codi de 8 caràcters i un nombre de propulsors.
//
//Realitza els següents passos:
//
//Creem dos coets amb els codis “32WESSDS” I “LDSFJA32”. El primer coet tindrà tres propulsors i el segon sis propulsors.
//
//Mostrar a pantalla el codi dels coets i el nombre de propulsors que té.
//
//
//
//FASE 2:
//
//Volem millorar el software perquè el propulsor tingui una potència màxima. Creem la classe propulsor i modifiquem en el main anterior:
//
//Creem dos coets amb els codis “32WESSDS” I “LDSFJA32”. El primer coet tindrà tres propulsors (potència: 10,30,80)
// i el segon sis propulsors (potència: 30,40,50,50,30,10).
//
//Mostrar a pantalla el codi dels coets, el nombre de propulsors que té i la potència màxima de cada propulsor.
//
//		Output:
//32WESSDS: 10,30,80
//LDSFJA32: 30,40,50,50,30,10
//
//
//
//FASE 3:
//
//Per la fase 3 modificarem els propulsors afegint també una potència actual.
// Un propulsor tindrà una potència màxima (no la pot superar) i una potència actual (la potència que té el propulsor en aquell moment).
// Tots els propulsors tindran una potència actual que començarà amb 0.
//
//El coet tindrà dos mètodes, accelerar o frenar i  augmentarà o es reduirà de 10 en 10 la potència de cada propulsor.
//
//La potencia actual del coet, és la suma de totes les potències de cada propulsor.
//
//Un cop aplicat el canvi:
//
//Modifiquem el main anterior per saber la potencia actual en un moment concret.
//
//Creem dos coets amb els codis “32WESSDS” I “LDSFJA32”.
// El primer coet tindrà tres propulsors (potència màxima: 10,30,80) i el segon sis propulsors (potència màxima: 30,40,50,50,30,10).
//
//Mostrar a pantalla el codi dels coets, el nombre de propulsors que té i la potència màxima de cada propulsor.
//
//Accelerar amb els coets tres cops
//
//Mostrar a pantalla la potencia actual (suma de les potencies per propulsor)
//
//Frenar cinc cops amb el primer coet (“32WESSDS”) i accelerar set amb el segon coet.
//
//Mostrar a pantalla la potencia actual (suma de les potencies per propulsor)
//
//Accelerar 15 cops amb els dos coets.
//
//Mostrar a pantalla la velocitat actual

//    private static Wheel createWheel() throws Exception {// 2.creamos una rueda
//        String brand = askUserForBrand();
//        Double diameter = askUserForWheelDiameter();
//
//        Wheel wheel = new Wheel(brand, diameter);
//        return wheel;
//    }


//        private static void printListOfRockets () throws Exception {
//            System.out.println("List of rockets : " + buildListOfRockets());
//        }
//
//        private static List<Rocket> buildListOfRockets () throws Exception {
//            List<Rocket> rockets = new ArrayList<>();
//            Rocket rocket1 = new Rocket("32WESSDS", 3);
//            Rocket rocket2 = new Rocket("LDSFJA32", 6);
//            rockets.add(rocket1);
//            rockets.add(rocket2);
//            return rockets;
//        }
//
//    }
//
//    private static String assignName() {
//
//    }
//    }

public class Main {

    public static void main(String[] args) throws Exception {
        Rocket rocket1 = createFirstRocket();
        Rocket rocket2 = createSecondRocket();
        printRocket(rocket1);
        printRocket(rocket2);
    }

    private static Rocket createFirstRocket() throws Exception {

        Rocket rocket1 = new Rocket("32WESSDS");
        rocket1.createPropeller(10);
        rocket1.createPropeller(30);
        rocket1.createPropeller(80);
        return rocket1;
    }

    private static Rocket createSecondRocket() throws Exception {
        Rocket rocket2 = new Rocket("LDSFJA32");
        rocket2.createPropeller(30);
        rocket2.createPropeller(40);
        rocket2.createPropeller(50);
        rocket2.createPropeller(50);
        rocket2.createPropeller(30);
        rocket2.createPropeller(10);
        return rocket2;
    }

    private static void printRocket(Rocket rocket) throws Exception {
        System.out.println(" " + rocket.toString());
    }

}








