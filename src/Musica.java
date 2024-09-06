public class Musica {
    private String titulo;
    private String artista;
    private double duracao;

    public Musica(String titulo, String artista, double duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public double getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Musica: " + titulo + " | Artista: " + artista + " | Duração: " + duracao + " minutos";
    }
}
