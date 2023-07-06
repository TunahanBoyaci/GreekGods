package GreekGods;

public class Athena extends GreekGods_Goddesses {
    private int strategy;

    public Athena(String name, String gender, int aggression, int wisdom, int beauty, int strategy) {
        super(name, gender, aggression, wisdom, beauty);
        this.strategy = strategy;
    }

    public int getStrategy() {
        return strategy;
    }

    public void setStrategy(int strategy) {
        this.strategy = strategy;
    }

    @Override
    public void printInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + getGender());
        System.out.println("Aggression: " + getAggression());
        System.out.println("Wisdom: " + getWisdom());
        System.out.println("Beauty: " + getBeauty());
        System.out.println("********Special Power*********");
        System.out.println("Strategy: " + this.strategy);
    }

    @Override
    public void attack(){
        System.out.println("God " + getName() + " attacks with "
                + getAggression() + " aggression "
                + getWisdom() + " wisdom "
                + getBeauty() + " beauty.");
        System.out.println("Furthermore " + getName() + " can attacks with "
                + this.strategy + " strategy. He can create very smart strategies to defeat her enemies.");
    }

    @Override
    public void exposeSecretPower(){
        System.out.println(getName() + " can attacks with "
                + this.strategy + " strategy. He can create very smart strategies to defeat her enemies.");
    }
}