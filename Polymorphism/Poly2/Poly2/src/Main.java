public class Main {
    public static void main(String[] args) {
        Music song1 = new Music("Song One", 210, "Pop");
        Music song2 = new Music("Song Two", 180, "Rock");
        Music song3 = new Music("Song Thre", 240, "Jazz");

        song1.play();
        song1.displayInfo();
        song1.getTitle();
        song1.stop();
    }
}