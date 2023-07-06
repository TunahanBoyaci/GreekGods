package GreekGods;

public class Zeus extends GreekGods_Goddesses {
    private int controlOverWeather;

    public Zeus(String name, String gender, int aggression, int wisdom, int beauty, int controlOverWeather) {
        super(name, gender, aggression, wisdom, beauty);
        this.controlOverWeather = controlOverWeather;
    }

    public int getControlOverWeather() {
        return controlOverWeather;
    }

    public void setControlOverWeather(int controlOverWeather) {
        this.controlOverWeather = controlOverWeather;
    }

    @Override
    public void printInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + getGender());
        System.out.println("Aggression: " + getAggression());
        System.out.println("Wisdom: " + getWisdom());
        System.out.println("Beauty: " + getBeauty());
        System.out.println("********Special Power*********");
        System.out.println("Control Over Weather: " + this.controlOverWeather);
    }

    @Override
    public void attack(){
        System.out.println("God " + getName() + " attacks with "
                + getAggression() + " aggression "
                + getWisdom() + " wisdom "
                + getBeauty() + " beauty.");
        System.out.println("Furthermore " + getName() + " can attacks with "
                + this.controlOverWeather + " thunderbolts and storms.");
    }

    @Override
    public void exposeSecretPower(){
        System.out.println(getName() + " can attacks with "
                + this.controlOverWeather + " thunderbolts and storms.");
    }
}