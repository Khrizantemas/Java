package santaworkshop;

import java.util.Objects;

public class Reindeer extends WorkshopMember {
    private int Flyingspeed;
    private String Nosecolor;

    public Reindeer(String name, int age, int Flyingspeed, String Nosecolor) {
        super(name, "Reindeer", age);
        this.Flyingspeed = Flyingspeed;
        this.Nosecolor = Nosecolor;
    }

    public int getFlyingspeed() {
        return Flyingspeed;
    }

    public void setFlyingspeed(int Flyingspeed) {
        this.Flyingspeed = Flyingspeed;
    }

    public String getNosecolor() {
        return Nosecolor;
    }

    public void setNosecolor(String Nosecolor) {
        this.Nosecolor = Nosecolor;
    }

    public void fly() {
        System.out.println(getName() + " is flying with speed of " + Flyingspeed + " km/h!");
    }

    public void trainForChristmas() {
        System.out.println(getName() + " is training for Christmas ");
    }

    public String checkFitnessLevel() {
        int age = getAge();
        if (age < 3) {
            return "A";
        } else if (age < 6) {
            return "B";
        } else if (age < 10) {
            return "C";
        } else if (Flyingspeed > 20) {
            return "D";
        } else if (Flyingspeed > 10) {
            return "E";
        } else {
            return "F";
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), Flyingspeed, Nosecolor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        Reindeer reindeer = (Reindeer) obj;
        return Flyingspeed == reindeer.Flyingspeed && Objects.equals(Nosecolor, reindeer.Nosecolor);
    }

    @Override
    public String toString() {
        return "Reindeer { " +
                "name ='" + getName() + '\'' +
                ", age =" + getAge() +
                ", Flyingspeed =" + Flyingspeed +
                ", Nosecolor ='" + Nosecolor + '\'' +
                '}';
    }
}
