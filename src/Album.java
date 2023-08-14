import java.util.ArrayList;

public class Album {
    private String albumName;
    private ArrayList<Song> songs;

    public Album(String albumName, ArrayList<Song> songs) {
        this.albumName = albumName;
        this.songs = songs;
    }

    public ArrayList<Song> getSongs() {
        return this.songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public void printTrackListings() {
        System.out.println(this.albumName + " track listing:");
        for (int i = 0; i < this.getSongs().size(); i++) {
            System.out.println((i + 1) + ". " + this.getSongs().get(i));
        }
    }
}
