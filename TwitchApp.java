import java.util.Scanner;

public class TwitchApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Usuario user = new Usuario("Tavinho", "tavinho@mail.com", 18);
        Streamer streamer = new Streamer("Adriana", "adri@stream.com", 22, "DrikaGames");
        Admin admin = new Admin("Misael", "misaias@admin.com", 24, "SuperAdmin");

        while (true) {
            System.out.println("\nMenu de opções:");
            System.out.println("1. Seguir Streamer");
            System.out.println("2. Assistir Stream");
            System.out.println("3. Mostrar Detalhes do Usuário");
            System.out.println("4. Mostrar Detalhes do Streamer");
            System.out.println("5. Mostrar Detalhes do Admin");
            System.out.println("6. Iniciar Stream");
            System.out.println("7. Parar Stream");
            System.out.println("8. Banir Usuário");
            System.out.println("9. Desbanir Usuário");
            System.out.println("10. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    user.seguirStreamer(streamer);
                    break;
                case 2:
                    user.assistirStream(streamer);
                    break;
                case 3:
                    user.mostrarDetalhes();
                    break;
                case 4:
                    streamer.mostrarDetalhes();  // Mostra detalhes do streamer
                    break;
                case 5:
                    admin.mostrarDetalhes();  // Mostra detalhes do admin
                    break;
                case 6:
                    streamer.iniciarStream();  // Inicia a stream
                    break;
                case 7:
                    streamer.pararStream();  // Para a stream
                    break;
                case 8:
                    admin.banirUsuario(user);  // Admin bane o usuário
                    break;
                case 9:
                    admin.desbanirUsuario(user);  // Admin desbane o usuário
                    break;
                case 10:
                    System.out.println("Saindo:)");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}