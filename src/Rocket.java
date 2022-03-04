

public class Rocket {

    private String codeOfRocket;
    private int numberOfPropellant;


    public Rocket(String codeOfRocket, int numberOfPropellant) throws Exception {
        checkNumberOfPropellant(numberOfPropellant);
        checkCodeOfRocket(codeOfRocket);
        this.codeOfRocket = codeOfRocket;
        this.numberOfPropellant = numberOfPropellant;
    }


   private void checkCodeOfRocket(String name) throws Exception {
        if (name.equals("")) throw new Exception("Wrong name");
    }

    private void checkNumberOfPropellant(int numberOfPropellant) throws Exception {
        if (numberOfPropellant <= 0) throw new Exception("Wrong number");
    }

    public String getCodeOfRocket() {
        return codeOfRocket;
    }


    public int getNumberOfPropellant() {
        return numberOfPropellant;
    }


    @Override
    public String toString() {
        return "code of Rocket is '" + codeOfRocket + '\'' +
                " number Of Propellants = " + numberOfPropellant + '\n';
    }
}
