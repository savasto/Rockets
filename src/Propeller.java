public class Propeller {
    private int maxLevelOfPower;

    public Propeller( int maxLevelOfPower) throws Exception {
        ckeckMaxLevelOfPower(maxLevelOfPower);
        this.maxLevelOfPower = maxLevelOfPower;
    }

    private void ckeckMaxLevelOfPower(int maxLevelOfPower) throws Exception {
        if (maxLevelOfPower <= 0)
            throw new Exception("Error");
    }

    public int getMaxLevelOfPower() {
        return maxLevelOfPower;
    }


    @Override
    public String toString() {
        return "max limit of power = " +
                "" +
                "" + maxLevelOfPower;
    }



}







