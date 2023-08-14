import java.io.IOException;

import static java.lang.Thread.sleep;

public class MusicPlayer extends Player {
    private String voice = "";

    public MusicPlayer() {
    }

    ;

    public MusicPlayer(String voice) {
        this.voice = voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return this.voice;
    }

    @Override
    public void play(Album album) {

    }

    @Override
    public void play(Song song) {
        Runtime r = Runtime.getRuntime();
        try {
            for (int i = 0; i < song.parseLyrics(song.getLyrics()).size(); i++) {
                r.exec("say " + song.parseLyrics(song.getLyrics()).get(i));
                sleep(WORD_CADENCE);
            }
            ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
