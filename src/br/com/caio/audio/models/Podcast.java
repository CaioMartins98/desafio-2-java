package br.com.caio.audio.models;

import br.com.caio.audio.calculo.Classification;

import java.util.Objects;

public class Podcast extends Audio implements Classification {
    private int season;
    private String host;
    private String guest;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public void epGuest() {
        if (guest != null) {
            System.out.println("Convidado: " + getGuest());
        }
    }

    @Override
    public String getClassification() {
        if (getTotalPlays() > 50000) {
            return "★★★★★";
        } else if (getTotalPlays() >= 30000 && getTotalPlays() <= 49999) {
            return "★★★★";
        } else if (getTotalPlays() >= 30000 && getTotalPlays() <= 49999) {
            return "★★★";
        } else if (getTotalPlays() >= 20000 && getTotalPlays() <= 39999) {
            return "★★";
        }
        return "★";
    }
}
