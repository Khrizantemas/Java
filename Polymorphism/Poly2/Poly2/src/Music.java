public class Music extends Playable {
    private String title;
    private int duration; // in seconds
    private String genre;

    public Music(String title, int duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    @Override
    public void play() {
        System.out.println("Playing: " + title);
    }

    @Override
    public void stop() {
        System.out.println("Stopped: " + title);
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Duration: " + duration + "s, Genre: " + genre);
    }

    public String getTitle() {
        return title;
    }
}
