public class Admin extends Usuario {
    private String nivelPermissao;

    public Admin(String nome, String email, int idade, String nivelPermissao) {
        super(nome, email, idade);
        this.nivelPermissao = nivelPermissao;
    }

    public void banirUsuario(Usuario usuario) {
        System.out.println(nome + "Usuario Banido " + usuario.nome);
    }

    public void desbanirUsuario(Usuario usuario) {
        System.out.println(nome + " Usuario Desbanido " + usuario.nome);
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Nível de Permissão: " + nivelPermissao);
    }
}


    

