import java.util.ArrayList;
import java.util.List;

public class Rocket {

    private String codeOfRocket;
    private List<Propeller> propellers = new ArrayList<>();


    public Rocket(String codeOfRocket) throws Exception {
        checkCodeOfRocket(codeOfRocket);
        this.codeOfRocket = codeOfRocket;

    }
    public void createPropeller(int maxLevelOfPower) throws Exception {
        Propeller propeller = new Propeller(maxLevelOfPower);
        propellers.add(propeller);
    }

    private void checkCodeOfRocket(String name) throws Exception {
        if (name.equals("")) throw new Exception("Wrong name");
    }


    public String getCodeOfRocket() {
        return codeOfRocket;
    }

    public List<Propeller> getPropellers() {
        return propellers;
    }


    @Override
    public String toString() {
        return "" +
                "code Of Rocket = " + codeOfRocket +
                " propellers = " + propellers;
    }


}