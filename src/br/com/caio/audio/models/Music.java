package br.com.caio.audio.models;

import br.com.caio.audio.calculo.Classification;

public class Music extends Audio implements Classification {
    String singer;
    String album;
    String musicaGenre;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getMusicaGenre() {
        return musicaGenre;
    }

    public void setMusicaGenre(String musicaGenre) {
        this.musicaGenre = musicaGenre;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String getClassification() {
        if(getTotalPlays() > 10000){
            return "★★★★★";
        }else if(getTotalPlays() >= 5000 && getTotalPlays() <= 9999){
            return "★★★★";
        }else if(getTotalPlays() >= 3000 && getTotalPlays() <= 4999){
            return "★★★";
        }else if(getTotalPlays() >= 1000 && getTotalPlays() <= 2999){
            return "★★";
        }
        return "★";
    }
}
