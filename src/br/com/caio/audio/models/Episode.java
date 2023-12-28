package br.com.caio.audio.models;

import br.com.caio.audio.calculo.Classification;

public class Episode implements Classification {
    private int numberEp;
    private String nameEp;
    private Podcast podcast;
    private int totalViews;


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

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public void showInfos() {
        System.out.println("Episódio número: " + numberEp);
        System.out.println("Visualizações: " + totalViews);
        System.out.println("Nome episódio: " + nameEp);

    }

    @Override
    public String getClassification() {
        if (totalViews > 10000) {
            return "★★★★★";
        } else if (totalViews >= 5000 && totalViews <= 9999) {
            return "★★★★";
        } else if (totalViews >= 3000 && totalViews <= 4999) {
            return "★★★";
        } else if (totalViews >= 2000 && totalViews <= 3999) {
            return "★★★";
        } else if (totalViews >= 1000 && totalViews <= 2999) {
            return "★★";
        }
        return "★";
    }
}