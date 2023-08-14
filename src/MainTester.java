import java.util.ArrayList;

public class MainTester {
    public static void main(String[] args) {
        Song onAndOn = new Song("On and On", "Curtis Harding", "Do the thing!");
        System.out.println(onAndOn.getArtist());

        System.out.println(onAndOn.parseLyrics(onAndOn.getLyrics()));

        MusicPlayer playMusic = new MusicPlayer();
        playMusic.play(onAndOn);
    }
}
