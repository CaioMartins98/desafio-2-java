package br.com.caio.audio.models;

import br.com.caio.audio.calculo.Classification;

public class Episode extends Audio implements Classification {
    private int numberEp;
    private String nameEp;
    private Podcast podcast;


    public int getNumberEp() {
        return numberEp;
    }

    public void setNumberEp(int numberEp) {
        this.numberEp = numberEp;
    }

    public String getNameEp() {
        return nameEp;
    }

    public void setNameEp(String nameEp) {
        this.nameEp = nameEp;
    }

    public Podcast getPodcast() {
        return podcast;
    }

    public void setPodcast(Podcast podcast) {
        this.podcast = podcast;
    }



    public void showInfos() {
        System.out.println("Episódio número: " + getNumberEp());
        System.out.println("Nome episódio: " + getNameEp());

    }

    @Override
    public String getClassification() {
        if (getTotalPlays() > 10000) {
            return "★★★★★";
        } else if (getTotalPlays() >= 5000 && getTotalPlays()  <= 9999) {
            return "★★★★";
        } else if (getTotalPlays()  >= 3000 && getTotalPlays()  <= 4999) {
            return "★★★";
        } else if (getTotalPlays()  >= 2000 && getTotalPlays()  <= 3999) {
            return "★★★";
        } else if (getTotalPlays()  >= 1000 && getTotalPlays()  <= 2999) {
            return "★★";
        }
        return "★";
    }
}