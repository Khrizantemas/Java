package santaworkshop;

import java.util.ArrayList;
import java.util.List;

public class Santa extends WorkshopMember implements ChristmasSpirit, ChristmasCelebrator {
    private List<Child> ChildrenList;

    public Santa(String Name, int Age) {
        super(Name, "Santa", Age);
        this.ChildrenList = new ArrayList<>();
    }

    public void addChild(Child child) {
        if (child != null) {
            ChildrenList.add(child);
        }
    }

    public void deliverGifts() {
        List<Child> NiceList = checkBadOrNiceList();
        for (Child child : NiceList) {
            System.out.println("Delivering gifts to " + child.getName() + " !");
        }
    }

    public List<Child> checkBadOrNiceList() {
        List<Child> NiceList = new ArrayList<>();
        for (Child child : ChildrenList) {
            if (child.getBehaviorScore() > 5) {
                NiceList.add(child);
            }
        }
        return NiceList;
    }

    @Override
    public void CelebrateChristmas() {
        System.out.println("Celebrating Christmas 🥳🎅");
    }

    @Override
    public void HostChristmasParty() {
        System.out.println("Hosting a Christmas party 🎉🎊");
    }

    @Override
    public void SpreadJoy() {
        System.out.println("Spreading joy to everyone 😃😄");
    }

    @Override
    public void SingCarols() {
        System.out.println("Singing Christmas carols 🎶🎤");
    }

    @Override
    public void DecorateTree() {
        System.out.println("Decorating the Christmas tree 🎄🌲");
    }
}
