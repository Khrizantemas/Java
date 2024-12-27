import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicLibary {
    private List<Artist> artists;
    private List<Album> albums;
    private List<Music> songs;

    public MusicLibary() {
        this.artists = new ArrayList<>();
        this.albums = new ArrayList<>();
        this.songs = new ArrayList<>();
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public void addMusic(Music music) {
        songs.add(music);
    }

    public void removeArtist(Artist artist) {
        artists.remove(artist);
    }

    public void removeAlbum(Album album) {
        albums.remove(album);
    }

    public void removeMusic(Music music) {
        songs.remove(music);
    }

    public Music searchMusic(String title) {
        for (Music music : songs) {
            if (music.getTitle().equalsIgnoreCase(title)) {
                return music;
            }
        }
        return null;
    }

    public Music giveRandomMusic() {
        if (songs.isEmpty()) {
            return null; // Return null if there are no songs
        }
        Random random = new Random();
        return songs.get(random.nextInt(songs.size()));
    }

    public void displayAllArtists() {
        for (Artist artist : artists) {
            artist.displayInfo();
        }
    }

    public void displayAllAlbums() {
        for (Album album : albums) {
            album.displayInfo();
        }
    }

    public void displayAllSongs() {
        for (Music music : songs) {
            music.displayInfo();
        }
    }
}
