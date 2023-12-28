package br.com.caio.audio.calculo;

import br.com.caio.audio.models.Audio;

public class CalcTime {
    private int totalTime;
    private boolean playlist;

    public boolean isPlaylist() {
        return playlist;
    }

    public void setPlaylist(boolean playlist) {
        this.playlist = playlist;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void includeToPlaylist(Audio audio) {
        if (playlist) {
            totalTime += audio.getDurationInMinutes();
        }


    }
}
