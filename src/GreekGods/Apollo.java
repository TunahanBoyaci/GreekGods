package GreekGods;


public class Apollo extends GreekGods_Goddesses {
    private int sunPower;

    public Apollo(String name, String gender, int aggression, int wisdom, int beauty, int sunPower) {
        super(name, gender, aggression, wisdom, beauty);
        this.sunPower = sunPower;
    }

    public int getSunPower() {
        return sunPower;
    }

    public void setSunPower(int sunPower) {
        this.sunPower = sunPower;
    }

    @Override
    public void printInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + getGender());
        System.out.println("Aggression: " + getAggression());
        System.out.println("Wisdom: " + getWisdom());
        System.out.println("Beauty: " + getBeauty());
        System.out.println("********Special Power*********");
        System.out.println("Sun Power: " + this.sunPower);
    }

    @Override
    public void attack(){
        System.out.println("God " + getName() + " attacks with "
                + getAggression() + " aggression "
                + getWisdom() + " wisdom "
                + getBeauty() + " beauty.");
        System.out.println("Furthermore " + getName() + " can attacks with "
                + this.sunPower + " sun power and wipes out his enemies");
    }

    @Override
    public void exposeSecretPower(){
        System.out.println(getName() + " can attacks with "
                + this.sunPower + " sun power. He can do anything by controlling the sun.");
    }
}