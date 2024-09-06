import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Playlist> playlists;

    public Usuario(String nome) {
        this.nome = nome;
        this.playlists = new ArrayList<>();
    }

    public void criarPlaylist(String nomePlaylist) {
        Playlist playlist = new Playlist(nomePlaylist);
        playlists.add(playlist);
        System.out.println("Playlist " + nomePlaylist + " criada.");
    }

    public void listarPlaylists() {
        System.out.println("Playlists de " + nome + ":");
        if (playlists.isEmpty()) {
            System.out.println("Nenhuma playlist criada.");
        } else {
            for (Playlist playlist : playlists) {
                System.out.println(playlist.getNome());
            }
        }
    }

    public Playlist buscarPlaylist(String nomePlaylist) {
        for (Playlist playlist : playlists) {
            if (playlist.getNome().equalsIgnoreCase(nomePlaylist)) {
                return playlist;
            }
        }
        return null;
    }

    public void adicionarMusicaNaPlaylist(String nomePlaylist, Musica musica) {
        Playlist playlist = buscarPlaylist(nomePlaylist);
        if (playlist != null) {
            playlist.adicionarMusica(musica);
        } else {
            System.out.println("Playlist não encontrada.");
        }
    }

    public void removerMusicaDaPlaylist(String nomePlaylist, Musica musica) {
        Playlist playlist = buscarPlaylist(nomePlaylist);
        if (playlist != null) {
            playlist.removerMusica(musica);
        } else {
            System.out.println("Playlist não encontrada.");
        }
    }
}
