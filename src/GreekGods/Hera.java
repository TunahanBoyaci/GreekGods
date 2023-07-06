package GreekGods;

public class Hera extends GreekGods_Goddesses {
    private int obstinacy;

    public Hera(String name, String gender, int aggression, int wisdom, int beauty, int obstinacy) {
        super(name, gender, aggression, wisdom, beauty);
        this.obstinacy = obstinacy;
    }

    public int getObstinacy() {
        return obstinacy;
    }

    public void setObstinacy(int obstinacy) {
        this.obstinacy = obstinacy;
    }

    @Override
    public void printInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + getGender());
        System.out.println("Aggression: " + getAggression());
        System.out.println("Wisdom: " + getWisdom());
        System.out.println("Beauty: " + getBeauty());
        System.out.println("********Special Power*********");
        System.out.println("Obstinacy: " + this.obstinacy);
    }

    @Override
    public void attack(){
        System.out.println("God " + getName() + " attacks with "
                + getAggression() + " aggression "
                + getWisdom() + " wisdom "
                + getBeauty() + " beauty.");
        System.out.println("Furthermore " + getName() + " can attacks with "
                + this.obstinacy + " obstinacy. She will never give up.");
    }

    @Override
    public void exposeSecretPower(){
        System.out.println(getName() + " can attacks with "
                + this.obstinacy + " obstinacy. She will never give up.");
    }
}