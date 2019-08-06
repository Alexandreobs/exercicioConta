package exercicioCasa;

public class cliente {
    private String nome;
    private String sobreNome;

    public cliente (String novoNome, String novoSobreNome) {
        this.nome = novoNome;
        this.sobreNome = novoSobreNome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
}
