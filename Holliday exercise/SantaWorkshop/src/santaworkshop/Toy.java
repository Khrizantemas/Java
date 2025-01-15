package santaworkshop;

import java.util.Objects;

public class Toy {
    private String type;
    private int diffLevel;

    public Toy(String type, int diffLevel) {
        this.type = type;
        this.diffLevel = diffLevel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDifficultyLevel() {
        return diffLevel;
    }

    public void setDifficultyLevel(int diffLevel) {
        this.diffLevel = diffLevel;
    }

    public boolean isChallenging() {
        return diffLevel > 7;
    }

    @Override
    public String toString() {
        return "Toy { " +
                " type = '" + type + '\'' +
                ", difficultyLevel = " + diffLevel +
                " , isChallenging  = " + isChallenging() +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, diffLevel);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        Toy toy = (Toy) obj;
        return diffLevel == toy.diffLevel && Objects.equals(type, toy.type);
    }
}
