package GreekGods;

public class GreekGods_Goddesses {
    private String name;
    private String gender;
    private int aggression;
    private int wisdom;
    private int beauty;

    public GreekGods_Goddesses(String name, String gender, int aggression, int wisdom, int beauty) {
        this.name = name;
        this.gender = gender;
        this.aggression = aggression;
        this.wisdom = wisdom;
        this.beauty = beauty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAggression() {
        return aggression;
    }

    public void setAggression(int aggression) {
        this.aggression = aggression;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getBeauty() {
        return beauty;
    }

    public void setBeauty(int beauty) {
        this.beauty = beauty;
    }

    public void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("Aggression: " + this.aggression);
        System.out.println("Wisdom: " + this.wisdom);
        System.out.println("Beauty: " + this.beauty);
    }

    public void attack(){
        System.out.println("God " + this.name + " attacks with "
                + this.aggression + " aggression "
                + this.wisdom + " wisdom "
                + this.beauty + " beauty.");
    }

    public void exposeSecretPower(){
        System.out.println(this.name + " has no secret power");
    }
}
