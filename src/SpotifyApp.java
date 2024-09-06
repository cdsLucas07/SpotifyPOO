import java.util.Scanner;

public class SpotifyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario("Usuário");

        while (true) {
            System.out.println("\n--- Menu Spotify ---");
            System.out.println("1. Criar Playlist");
            System.out.println("2. Adicionar Música à Playlist");
            System.out.println("3. Listar Playlists");
            System.out.println("4. Remover Música de Playlist");
            System.out.println("5. Sair do programa");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            // Declare as variáveis fora do switch para evitar erros
            String nomePlaylist;
            String nomeMusica;

            switch (opcao) {
                case 1:
                    System.out.print("Nome da nova playlist: ");
                    nomePlaylist = scanner.nextLine();
                    usuario.criarPlaylist(nomePlaylist);
                    break;

                case 2:
                    System.out.print("Nome da playlist: ");
                    nomePlaylist = scanner.nextLine();
                    System.out.print("Nome da música: ");
                    nomeMusica = scanner.nextLine();
                    System.out.print("Artista: ");
                    String artista = scanner.nextLine();
                    System.out.print("Duração (minutos): ");
                    double duracao = scanner.nextDouble();
                    scanner.nextLine(); // Consumir nova linha
                    Musica musica = new Musica(nomeMusica, artista, duracao);
                    usuario.adicionarMusicaNaPlaylist(nomePlaylist, musica);
                    break;

                case 3:
                    usuario.listarPlaylists();
                    break;

                case 4:
                    System.out.print("Nome da playlist: ");
                    nomePlaylist = scanner.nextLine();
                    System.out.print("Nome da música a remover: ");
                    nomeMusica = scanner.nextLine();
                    Playlist playlist = usuario.buscarPlaylist(nomePlaylist);
                    if (playlist != null) {
                        Musica musicaARemover = null;
                        for (Musica m : playlist.getMusicas()) { // Usar o método getMusicas()
                            if (m.getTitulo().equalsIgnoreCase(nomeMusica)) {
                                musicaARemover = m;
                                break;
                            }
                        }
                        if (musicaARemover != null) {
                            usuario.removerMusicaDaPlaylist(nomePlaylist, musicaARemover);
                        } else {
                            System.out.println("Música não encontrada.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
