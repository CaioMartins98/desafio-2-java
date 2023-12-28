import br.com.caio.audio.calculo.CalcTime;
import br.com.caio.audio.calculo.RecommendationFilter;
import br.com.caio.audio.models.Episode;
import br.com.caio.audio.models.Music;
import br.com.caio.audio.models.Podcast;

public class Main {
    public static void main(String[] args) {
        RecommendationFilter filter = new RecommendationFilter();
        Music music = new Music();

        music.setSinger("Froid");
        music.setName("Lamentável parte III");
        music.setAlbum("O pior disco do ano");
        for (int i = 0; i < 5000; i++) {
            music.playAudio();
        }

        for (int i = 0; i < 3653; i++) {
            music.like();
        }
        music.setDurationInMinutes(5);
        music.setMusicaGenre("RAP");
        System.out.println("**************************************");
        music.showInfos();
        System.out.println("Autor: " + music.getSinger());
        System.out.println("Classificação: " + music.getClassification());
        System.out.println("Álbum: " + music.getAlbum());
        System.out.println("Gênero: " + music.getMusicaGenre());

        CalcTime calc = new CalcTime();
        calc.includeToPlaylist(music);


        System.out.println("**************************************\n");

        Podcast podcast = new Podcast();

        podcast.setHost("Igão e Mítico");
        podcast.setName("Podpah");
        podcast.setSeason(4);
        podcast.setDurationInMinutes(120);
        for (int i = 0; i < 51099; i++) {
            podcast.playAudio();
        }

        for (int i = 0; i < 99; i++) {
            podcast.like();
        }
        podcast.setGuest("Space Today");
        System.out.println("**************************************");
        System.out.println("Host(s): " + podcast.getHost());
        podcast.showInfos();
        System.out.println("Temporada: " + podcast.getSeason());
        podcast.epGuest();
        System.out.println("Classificação: " + podcast.getClassification());


        Episode ep = new Episode();
        ep.setNameEp("Space Today - PodPah #528");
        ep.setNumberEp(528);
        ep.setPodcast(podcast);
        ep.setTotalViews(200);

        ep.showInfos();
        ep.getClassification();


        filter.filter(ep);
        calc.setPlaylist(true);
        calc.includeToPlaylist(podcast);
        System.out.println("************************************** \n");

        System.out.println("Tempo estimado da playlist: " + calc.getTotalTime() + " minutos");
    }
}