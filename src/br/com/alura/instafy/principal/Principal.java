package br.com.alura.instafy.principal;

import br.com.alura.instafy.modelos.Musica;
import br.com.alura.instafy.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");


        for (int i = 0; i < 1000 ; i++) {

            minhaMusica.reproduzir();

        }

        for (int i = 0; i < 50; i++) {

            minhaMusica.curtir();

        }
        //
        //
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {

            meuPodcast.reproduzir();

        }

        for (int i = 0; i < 1000; i++) {

            meuPodcast.curtir();

        }



    }
}
