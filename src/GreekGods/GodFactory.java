package GreekGods;

public class GodFactory {
    public GreekGods_Goddesses produceGodGoddess(String name) {
        if (name.equals("zeus")) {
            return new Zeus("Zeus", "Male", 3000, 500, 1000, 20000);
        } else if (name.equals("hera")) {
            return new Hera("Hera", "Female", 400, 250, 2000, 10000);
        } else if (name.equals("apollo")) {
            return new Apollo("Apollo", "Male", 250, 2000, 1000, 2000);
        } else if (name.equals("athena")) {
            return new Athena("Athena", "Female", 400, 1000, 2000, 30000);
        } else {
            return null;
        }
    }
}