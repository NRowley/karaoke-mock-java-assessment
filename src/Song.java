import java.util.ArrayList;
import java.util.Arrays;

public class Song {
    private String title;
    private String artist;
    private String lyrics;

    public Song(String title, String artist, String lyrics) {
        this.title = title;
        this.artist = artist;
        this.lyrics = lyrics;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public static ArrayList<String> parseLyrics(String lyrics) {
        String[] lyricsArr = lyrics.split(" ");
        return new ArrayList<>(Arrays.asList(lyricsArr));
    }
}
