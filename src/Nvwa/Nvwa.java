package Nvwa;

public class Nvwa {
    public static Person getPerson(String people) {
        Person person = null;
        if (people.equalsIgnoreCase("M")) {
            person = new Man();
        } else if (people.equalsIgnoreCase("W")) {
            person = new Woman();

        } else if (people.equalsIgnoreCase("R")) {
            person = new Robot();
        }
        return person;
    }
}