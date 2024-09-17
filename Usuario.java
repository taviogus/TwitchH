class Usuario {
    protected String nome;
    protected String email;
    protected int idade;

    public Usuario(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Idade: " + idade);
    }

    public void seguirStreamer(Streamer streamer) {
        System.out.println(nome + " está seguindo o streamer " + streamer.getNome());
        streamer.adicionarSeguidor();
    }

    public void assistirStream(Streamer streamer) {
        System.out.println(nome + " está assistindo à stream de " + streamer.getNome());
    }
}