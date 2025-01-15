package santaworkshop;

import java.util.Objects;

public class Elf extends WorkshopMember implements ChristmasCelebrator {
    private int skillLevel;
    private String elfType;
    private static final int MAX_SKILL_LEVEL = 100;

    public Elf(String name, String nickName, int age, int skillLevel, String elfType) {
        super(name, nickName, age);
        this.skillLevel = Math.max(0, skillLevel);
        this.elfType = elfType;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        if (skillLevel >= 0 && skillLevel <= MAX_SKILL_LEVEL) {
            this.skillLevel = skillLevel;
        }
    }

    public String getElfType() {
        return elfType;
    }

    public void setElfType(String elfType) {
        this.elfType = elfType;
    }

    @Override
    public void CelebrateChristmas() {
        System.out.println(getName() + " is celebrating Christmas 🥳");
    }

    @Override
    public void HostChristmasParty() {
        System.out.println(getName() + " is hosting a Christmas party 🎉");
    }

    public void MakeToy() {
        System.out.println(getName() + " is making a toy 🧸🪀");
        increaseExperience();
    }

    public void WrapGifts() {
        System.out.println(getName() + " is wrapping gifts 🎁");
        increaseExperience();
    }

    private void increaseExperience() {
        if (skillLevel < MAX_SKILL_LEVEL) {
            skillLevel++;
            System.out.println(getName() + "'s skill level increased to " + skillLevel);
        } else {
            System.out.println(getName() + "'s skill level is already at the maximum of " + MAX_SKILL_LEVEL);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), skillLevel, elfType);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        Elf elf = (Elf) obj;
        return skillLevel == elf.skillLevel && Objects.equals(elfType, elf.elfType);
    }

    @Override
    public String toString() {
        return "Elf { " +
                "name ='" + getName() + '\'' +
                ", skillLevel = " + skillLevel +
                ", elfTyp e = '" + elfType + '\'' +
                '}';
    }
}
