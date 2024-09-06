import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
        System.out.println(musica.getTitulo() + " adicionada à playlist " + nome);
    }

    public void removerMusica(Musica musica) {
        musicas.remove(musica);
        System.out.println(musica.getTitulo() + " removida da playlist " + nome);
    }

    public void listarMusicas() {
        System.out.println("Playlist: " + nome);
        if (musicas.isEmpty()) {
            System.out.println("Nenhuma música na playlist.");
        } else {
            for (Musica musica : musicas) {
                System.out.println(musica);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Musica> getMusicas() {
        return musicas; // Método adicionado para acessar a lista de músicas
    }
}
