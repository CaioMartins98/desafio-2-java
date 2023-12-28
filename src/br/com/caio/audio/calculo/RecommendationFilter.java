package br.com.caio.audio.calculo;

import java.util.Objects;

public class RecommendationFilter {

    public void filter(Classification classification) {
        if (classification.getClassification() == "★★★★★") {
            System.out.println("Mais avaliados");
        } else if (Objects.equals(classification.getClassification(), "★★★★")) {
            System.out.println("Muito bem avaliados");
        } else if (Objects.equals(classification.getClassification(), "★★★")) {
            System.out.println("Bem avaliados");
        } else  if (Objects.equals(classification.getClassification(), "★★")){
            System.out.println("Pouco avaliados");
        } else  if (Objects.equals(classification.getClassification(), "★")) {
            System.out.println("Menos avaliados");
        }
    }
}
