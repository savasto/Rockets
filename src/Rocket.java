import java.util.ArrayList;
import java.util.List;

public class Rocket {

    private String codeOfRocket;
    private List<Propeller> propellers = new ArrayList<>();


    public Rocket(String codeOfRocket) throws Exception {
        checkCodeOfRocket(codeOfRocket);
        this.codeOfRocket = codeOfRocket;

    }

    private void checkCodeOfRocket(String codeOfRocket) throws Exception {
        if (codeOfRocket.equals("")) throw new Exception();
    }

    public void createPropeller(int maxLevelOfPower) throws Exception {
        Propeller propeller = new Propeller(maxLevelOfPower);
        propellers.add(propeller);
    }

    public void accelerate() {
        for (Propeller propeller : propellers) {
            propeller.acceleratePropeller();
        }
    }

    public void brake() {
        for (Propeller propeller : propellers) {
            propeller.brakePropeller();
        }
    }

    public String getCodeOfRocket() {
        return codeOfRocket;
    }

    public List<Propeller> getPropellers() {
        return propellers;
    }

    @Override
    public String toString() {
        return
                "code Of Rocket : " + codeOfRocket +
                        " propellers" + propellers;
    }
}