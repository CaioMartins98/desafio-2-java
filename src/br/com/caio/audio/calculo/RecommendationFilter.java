package br.com.caio.audio.calculo;

public class RecommendationFilter {

    public void filter(Classification classification) {
        if (classification.getClassification() == "★★★★★" || classification.getClassification() == "★★★★") {
            System.out.println("Mais avaliados");
        } else if (classification.getClassification() == "★★★") {
            System.out.println("Bem avaliados");
        } else {
            System.out.println("Menos avaliados");
        }
    }
}
