public class Streamer extends Usuario {
    private String canal;
    private int numSeguidores;

    public Streamer(String nome, String email, int idade, String canal) {
        super(nome, email, idade);
        this.canal = canal;
        this.numSeguidores = 0;
    }

    public String getNome() {
        return nome;
    }

    public void iniciarStream() {
        System.out.println(nome + " A Stream no canal iniciou " + canal);
    }

    public void pararStream() {
        System.out.println(nome + " A Stream no canal parou " + canal);
    }

    public void adicionarSeguidor() {
        numSeguidores++;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();  // Usa o método da classe Usuario
        System.out.println("Canal: " + canal);
        System.out.println("Número de Seguidores: " + numSeguidores);
    }
}


