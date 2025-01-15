package santaworkshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Child {
    private String name;
    private int behavior;
    private List<String> wishList;

    public Child(String name, int behavior) {
        this.name = name;
        this.behavior = behavior;
        this.wishList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getBehaviorScore() {
        return behavior;
    }

    public void addWish(String wish) {
        if (wish != null && !wish.trim().isEmpty()) {
            wishList.add(wish);
        }
    }

    public List<String> getWishList() {
        return wishList;
    }

    public void printWishes() {
        System.out.println(name + "'s Wish List: " + wishList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, behavior);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Child child = (Child) obj;
        return behavior == child.behavior && Objects.equals(name, child.name);
    }

    @Override
    public String toString() {
        return "Child { name ='" + name + "', behavior =" + behavior + ", wishLis t =" + wishList + " }";
    }
}
