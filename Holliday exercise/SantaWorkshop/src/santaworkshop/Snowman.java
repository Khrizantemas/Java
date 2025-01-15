package santaworkshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Snowman {
    private double Size;
    private String HeadwearColour;
    private boolean MagicalStatus;
    private List<String> Accessories;

    public Snowman(double Size, String HeadwearColour) {
        this.Size = Size;
        this.HeadwearColour = HeadwearColour;
        this.MagicalStatus = false;
        this.Accessories = new ArrayList<>();
    }

    public void AddAccessory(String Accessory) {
        if (Accessory != null && !Accessory.trim().isEmpty()) {
            Accessories.add(Accessory);
            System.out.println("Added a " + Accessory + " to the snowman");
        }
    }

    public void ReduceSize() {
        if (Size > 0) {
            Size /= 2;
            if (Size < 1) {
                Size = 0;
            }
            System.out.println("The snowman has reduced in size. New size: " + Size);
        } else {
            System.out.println("The snowman is already at a size of 0");
        }
    }

    public void GrantMagicalPowers() {
        MagicalStatus = true;
        System.out.println("The snowman has magical powers now!!");
    }

    public double GetSize() {
        return Size;
    }

    public String GetHeadwearColour() {
        return HeadwearColour;
    }

    public boolean IsMagical() {
        return MagicalStatus;
    }

    public List<String> GetAccessories() {
        return Accessories;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Size, HeadwearColour, MagicalStatus, Accessories);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        Snowman snowman = (Snowman) obj;
        return Double.compare(snowman.Size, Size) == 0 &&
                MagicalStatus == snowman.MagicalStatus &&
                Objects.equals(HeadwearColour, snowman.HeadwearColour) &&
                Objects.equals(Accessories, snowman.Accessories);
    }

    @Override
    public String toString() {
        return "Snowman { " +
                "Size = " + Size +
                ", HeadwearColour =' " + HeadwearColour + '\'' +
                ", MagicalStatus = " + MagicalStatus +
                ", Accessories  = " + Accessories +
                '}';
    }
}
