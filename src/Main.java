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

public class Main {

    public static void main(String[] args) throws Exception {
        Rocket rocket1 = manageFirstRocket();
        Rocket rocket2 = manageSecondRocket();

    }

    private static Rocket manageFirstRocket() throws Exception {
        Rocket rocket1 = createFirstRocket();
        System.out.println(rocket1 + "\n" + "accelerate 3 times:");
        accelerateRocket(rocket1, 3);
        System.out.println(rocket1 + "\n" + "brake 5 times:");
        brakeRocket(rocket1, 5);
        System.out.println(rocket1 + "\n" + "accelerate 15times:");
        accelerateRocket(rocket1, 15);
        System.out.println(rocket1 + "\n");
        return rocket1;
    }

    private static Rocket manageSecondRocket() throws Exception {
        Rocket rocket2 = createSecondRocket();
        System.out.println(rocket2 + "\n" + "accelerate 7 times:");
        accelerateRocket(rocket2, 7);
        System.out.println(rocket2 + "\n" + "accelerate 15 times:");
        accelerateRocket(rocket2, 15);
        System.out.println(rocket2);
        return rocket2;
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

    private static void brakeRocket(Rocket rocket, int time) {
        for (int i = 0; i < time; i++) {
            rocket.brake();
        }
    }

    private static void accelerateRocket(Rocket rocket, int time) {
        for (int i = 0; i < time; i++) {
            rocket.accelerate();
        }
    }
}






