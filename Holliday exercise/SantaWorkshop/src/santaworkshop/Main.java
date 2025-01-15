package santaworkshop;

public class Main {
    public static void main(String[] args) {
        Elf elf = new Elf("Yursha", "Spilo", 100, 5, "Toy Maker");
        elf.CelebrateChristmas();
        elf.HostChristmasParty();
        elf.MakeToy();
        elf.WrapGifts();
        System.out.println("\n");
        System.out.println("Skill Level : " + elf.getSkillLevel());
        System.out.println("Elf Type : " + elf.getElfType());
        System.out.println("Age : " + elf.getAge());
        System.out.println("Name : " + elf.getName());
        System.out.println("Nickname : " + elf.getNickName());

        System.out.println("\n");

        Santa santa = new Santa("Dachi", 99);
        System.out.println("\n");

        santa.CelebrateChristmas();
        santa.HostChristmasParty();
        santa.SingCarols();
        santa.SpreadJoy();
        santa.DecorateTree();

        System.out.println("\n");

        Child child1 = new Child("Sigma", 7);
        Child child2 = new Child("FImoza", 1);
        Child child3 = new Child("Venom", 10);

        child1.addWish("Money");
        child2.addWish("Banana");
        child3.addWish("Venom");

        santa.addChild(child1);
        santa.addChild(child2);
        santa.addChild(child3);

        santa.deliverGifts();

        System.out.println("\n");

        child1.printWishes();
        child2.printWishes();
        child3.printWishes();

        System.out.println("\n");

        Toy toy1 = new Toy("Puzzle", 5);
        Toy toy2 = new Toy("Drone fvp", 8);
        Toy toy3 = new Toy("Anime figure", 3);

        System.out.println(toy1);
        System.out.println(toy2);
        System.out.println(toy3);

        System.out.println("\n");

        System.out.println(toy1.getType() + " is challenging : " + toy1.isChallenging());
        System.out.println(toy2.getType() + " is challengin g : " + toy2.isChallenging());
        System.out.println(toy3.getType() + " is challenging : " + toy3.isChallenging());

        System.out.println("\n");

        Reindeer reindeer1 = new Reindeer("ZvigeniA", 2, 25, "Red");
        Reindeer reindeer2 = new Reindeer("RUDOFA", 5, 6, "Brown");

        reindeer1.fly();
        reindeer1.trainForChristmas();
        System.out.println(reindeer1.getName() + "'s fitness level: " + reindeer1.checkFitnessLevel());

        reindeer2.fly();
        reindeer2.trainForChristmas();
        System.out.println(reindeer2.getName() + "'s fitness level: " + reindeer2.checkFitnessLevel());

        System.out.println("\n");

        Snowman snowman = new Snowman(5.0, "Red");
        snowman.AddAccessory("Scarf");
        snowman.AddAccessory("Eyes");
        snowman.GrantMagicalPowers();
        System.out.println("Snowman Size : " + snowman.GetSize());
        System.out.println("Snowman Headwear Colour : " + snowman.GetHeadwearColour());
        System.out.println("Is Snowman Magical ? " + snowman.IsMagical());

        snowman.ReduceSize();
        System.out.println("Snowman Size after melting : " + snowman.GetSize());
    }
}
