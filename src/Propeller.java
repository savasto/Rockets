public class Propeller {
    private int maxLevelOfPower;
    private static final int POWER_TO_CHANGE = 10;
    private int currentLevelOfPower = 0;

    public Propeller(int maxLevelOfPower) throws Exception {
        ckeckMaxLevelOfPower(maxLevelOfPower);
        this.maxLevelOfPower = maxLevelOfPower;
    }

    private void ckeckMaxLevelOfPower(int maxLevelOfPower) throws Exception {
        if (maxLevelOfPower <= 0)
            throw new Exception("Error");
    }

    public void acceleratePropeller() {
        this.currentLevelOfPower += POWER_TO_CHANGE;
        if (this.currentLevelOfPower > maxLevelOfPower) {
            this.currentLevelOfPower = maxLevelOfPower;
        }
    }

    public void brakePropeller() {
        this.currentLevelOfPower -= POWER_TO_CHANGE;
        if (this.currentLevelOfPower < 0) {
            this.currentLevelOfPower = 0;
        }
    }

    @Override
    public String toString() {
        return "\n" + "Propeller" +
                " max Level Of Power = " + maxLevelOfPower + ";" +
                " current Level Of Power=" + currentLevelOfPower;
    }
}









