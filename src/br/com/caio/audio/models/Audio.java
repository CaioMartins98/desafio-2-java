package br.com.caio.audio.models;

import br.com.caio.audio.calculo.Classification;

public class Audio {
    private String name;
    private int durationInMinutes;
    private int totalPlays;
    private int likes;

    public void like() {
        this.likes++;
    }

    public void playAudio() {
        totalPlays++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getTotalPlays() {
        return totalPlays;
    }


    public int getLikes() {
        return likes;
    }

    public void showInfos() {
        System.out.println("Nome: " + getName());
        System.out.println("Duração: " + getDurationInMinutes() + " minutos");
        System.out.println("Curtidas: " + getLikes());
        System.out.println("Reproduções: " + getTotalPlays());
    }

}
